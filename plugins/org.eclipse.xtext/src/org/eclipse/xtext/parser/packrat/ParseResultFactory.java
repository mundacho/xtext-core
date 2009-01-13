/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseResult;
import org.eclipse.xtext.parser.packrat.debug.ParsedTokenPrinter;
import org.eclipse.xtext.parser.packrat.tokens.AbstractParsedToken;
import org.eclipse.xtext.parser.packrat.tokens.AbstractParsedTokenVisitor;
import org.eclipse.xtext.parser.packrat.tokens.CompoundParsedTokenVisitor;
import org.eclipse.xtext.parser.packrat.tokens.ErrorToken;
import org.eclipse.xtext.parser.packrat.tokens.FakedToken;
import org.eclipse.xtext.parser.packrat.tokens.ParsedAction;
import org.eclipse.xtext.parser.packrat.tokens.ParsedNonTerminal;
import org.eclipse.xtext.parser.packrat.tokens.ParsedNonTerminalEnd;
import org.eclipse.xtext.parser.packrat.tokens.ParsedTerminal;
import org.eclipse.xtext.parser.packrat.tokens.ParsedToken;
import org.eclipse.xtext.parser.packrat.tokens.ParsedTokenSequence;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeAdapterFactory;
import org.eclipse.xtext.parsetree.ParsetreeFactory;
import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.service.Inject;
import org.eclipse.xtext.service.StatefulService;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@StatefulService
public class ParseResultFactory extends AbstractParsedTokenVisitor implements IParseResultFactory {

	private static boolean DEBUG = false;
	
	private static final Logger logger = Logger.getLogger(AbstractPackratParser.class);

	private CompositeNode currentNode;
	
	private final LinkedList<EObject> currentStack;
	
	@Inject
	private IAstFactory factory;
	
	private final LinkedList<ParsedNonTerminal> nonterminalStack;
	
	public ParseResultFactory() {
		this.currentStack = new LinkedList<EObject>();
		this.nonterminalStack = new LinkedList<ParsedNonTerminal>();
	}
	
	public IParseResult createParseResult(ParsedTokenSequence tokens) {
		currentNode = null;
		currentStack.clear();
		nonterminalStack.clear();
		if (logger.isDebugEnabled() || DEBUG) {
			IParsedTokenVisitor visitor = new CompoundParsedTokenVisitor(new ParsedTokenPrinter(), this);
			tokens.acceptAndDrop(visitor);
		} else {
			tokens.acceptAndDrop(this);
		}
		return new ParseResult(currentStack.isEmpty() ? null : currentStack.getLast(), currentNode);
	}
	
	private LeafNode createLeafNode(AbstractParsedToken parsedToken) {
		LeafNode result = ParsetreeFactory.eINSTANCE.createLeafNode();
		enhanceNode(parsedToken, result);
		result.setText(parsedToken.getText().toString());
		currentNode.getChildren().add(result);
		return result;
	}

	private void enhanceNode(AbstractParsedToken parsedToken, AbstractNode node) {
		node.setTotalOffset(parsedToken.getOffset());
		node.setTotalLength(parsedToken.getLength());
	}
	
	protected CompositeNode createCompositeNode(AbstractParsedToken parsedToken) {
		CompositeNode compositeNode = ParsetreeFactory.eINSTANCE.createCompositeNode();
		enhanceNode(parsedToken, compositeNode);
		return compositeNode;
	}
	
	protected void associateNodeWithAstElement(CompositeNode node, EObject astElement) {
		if (node.getElement() != null && node.getElement() != astElement) {
			throw new RuntimeException("Reassignment of astElement in parse tree node");
		}
		if (node.getElement() != astElement) {
			node.setElement(astElement);
			NodeAdapter adapter = (NodeAdapter) NodeAdapterFactory.INSTANCE.adapt(astElement, AbstractNode.class);
			adapter.setParserNode(node);
		}
	}
	
	@Override
	public void visitAbstractParsedToken(AbstractParsedToken token) {
		// no exception for now
	}

	@Override
	public void visitErrorToken(ErrorToken token) {
		LeafNode errorNode = createLeafNode(token);
		errorNode.setGrammarElement(token.getGrammarElement());
		SyntaxError syntaxError = ParsetreeFactory.eINSTANCE.createSyntaxError();
		syntaxError.setMessage(token.getErrorMessage());
		errorNode.setSyntaxError(syntaxError);
	}

	@Override
	public void visitFakedToken(FakedToken token) {
		// TODO Auto-generated method stub
		super.visitFakedToken(token);
	}

	@Override
	public void visitParsedNonTerminal(ParsedNonTerminal token) {
		nonterminalStack.add(token);
		currentStack.add(null);
		
		CompositeNode node = createCompositeNode(token);
		node.setGrammarElement(token.getGrammarElement());
		if (currentNode != null)
			currentNode.getChildren().add(node);
		currentNode = node;
	}

	@Override
	public void visitParsedNonTerminalEnd(ParsedNonTerminalEnd token) {
		currentNode.setTotalLength(token.getOffset() - currentNode.getTotalOffset());
		final ParsedNonTerminal nonTerminal = nonterminalStack.removeLast();
		EObject created = currentStack.removeLast();
		if (!token.isDatatype()) {
			if (created == null)
				created = factory.create(nonTerminal.getTypeName());
			if (token.getFeature() == null) {
				if (currentStack.isEmpty())
					currentStack.add(created);
				else if (currentStack.getLast() == null) {
					currentStack.set(currentStack.size() - 1, created);
				} else {
					throw new RuntimeException("Cannot discard created object");
				}
			} else {
				final AbstractRule rule = nonTerminal.getGrammarElement() instanceof AbstractRule ?
						(AbstractRule)nonTerminal.getGrammarElement() :
						((RuleCall)nonTerminal.getGrammarElement()).getRule();
				setFeatureValue(token, created, rule);
			}
			if (created != null)
				associateNodeWithAstElement(currentNode, created);
		} else {
			if (token.getFeature() != null) {
				final StringBuilder builder = new StringBuilder(token.getLength());
				final boolean[] wasHidden = new boolean[] {false};
				getDatatypeValue(currentNode, builder, wasHidden);
				final AbstractRule rule = nonTerminal.getGrammarElement() instanceof AbstractRule ?
						(AbstractRule)nonTerminal.getGrammarElement() :
						((RuleCall)nonTerminal.getGrammarElement()).getRule();
				setFeatureValue(token, builder.toString(), rule);
			}
		}
		if (currentNode.getParent() != null)
			currentNode = currentNode.getParent();
	}

	private void setFeatureValue(ParsedNonTerminalEnd token, Object created, AbstractRule rule) {
		EObject current = null;
		if (currentStack.isEmpty()) {
			throw new RuntimeException("Unexpected empty stack");
		} else if (currentStack.getLast() == null) {
			current = factory.create(nonterminalStack.getLast().getTypeName());
			
			currentStack.set(currentStack.size() - 1, current);
		} else {
			current = currentStack.getLast();
		}
		try {
			if (token.isMany()) {
				factory.add(current, token.getFeature(), created, rule != null ? rule.getName() : null, currentNode);
			} else {
				factory.set(current, token.getFeature(), created, rule != null ? rule.getName() : null, currentNode);
			}
		} catch(ValueConverterException ex) {
			handleValueConverterException(ex);
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	private void getDatatypeValue(AbstractNode node, StringBuilder builder, boolean[] wasHidden) {
		 if (node instanceof LeafNode) {
			 LeafNode leaf = (LeafNode) node;
			 if (leaf.isHidden()) {
				 if (!wasHidden[0]) {
					 wasHidden[0] = true;
					 if (builder.length() != 0)
						 builder.append(' ');
				 }
			 } else {
				 wasHidden[0] = false;
				 builder.append(leaf.getText());
			 }
		 } else {
			 for(AbstractNode child: ((CompositeNode)node).getChildren()) {
				 getDatatypeValue(child, builder, wasHidden);
			 }
		 }
	}

	private void handleValueConverterException(ValueConverterException ex) {
		Throwable cause = ex.getCause();
		if (ex != cause) {
			SyntaxError error = ParsetreeFactory.eINSTANCE.createSyntaxError();
			String message = cause.getMessage();
			if (message == null)
				message = cause.getClass().getSimpleName();
			if (ex.getNode() == null) {
				currentNode.setSyntaxError(error);
			} else {
				ex.getNode().setSyntaxError(error);
			}
		} else
			throw new RuntimeException(ex);
	}

	@Override
	public void visitParsedTerminal(ParsedTerminal token) {
		LeafNode node = createLeafNode(token);
		node.setGrammarElement(token.getGrammarElement());
		node.setFeature(token.getFeature());
		node.setHidden(token.isHidden());
		
		if (token.getFeature() != null) {
			EObject current = null;
			if (currentStack.isEmpty()) {
				throw new RuntimeException("Unexpected empty stack");
			} else if (currentStack.getLast() == null) {
				current = factory.create(nonterminalStack.getLast().getTypeName());
				currentStack.set(currentStack.size() - 1, current);
			} else {
				current = currentStack.getLast();
			}
			try {
				if (token.isMany()) {
					factory.add(current, token.getFeature(), token.isBoolean() ? true : token.getText(), 
							token.getLexerRule(), currentNode);
				} else {
					factory.set(current, token.getFeature(), token.isBoolean() ? true : token.getText(), 
							token.getLexerRule(), currentNode);
				}
			} catch(ValueConverterException ex) {
				handleValueConverterException(ex);
			} catch(Exception ex) {
				throw new RuntimeException(ex);
			}
		}
	}
	
	@Override
	public void visitParsedAction(ParsedAction token) {
		EObject newCurrent = factory.create(token.getTypeName());
		EObject prevCurrent = currentStack.removeLast();
		currentStack.add(newCurrent);
		try {
			if (token.isMany())
				factory.add(newCurrent, token.getFeature(), prevCurrent, null, null);
			else
				factory.set(newCurrent, token.getFeature(), prevCurrent, null, null);
		} catch(ValueConverterException ex) {
			handleValueConverterException(ex);
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void visitParsedToken(ParsedToken token) {
		super.visitParsedToken(token);
	}

	public void setFactory(IAstFactory factory) {
		this.factory = factory;
	}

	public IAstFactory getFactory() {
		return factory;
	}
	
}
