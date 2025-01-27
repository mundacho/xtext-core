/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleExpressionsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSequenceExpressionsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cExpressionsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpressionsAdditionParserRuleCall_1_1_0 = (RuleCall)cExpressionsAssignment_1_1.eContents().get(0);
		
		//Sequence: Addition ( {Sequence.expressions+=current} expressions+=Addition)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition ( {Sequence.expressions+=current} expressions+=Addition)*
		public Group getGroup() { return cGroup; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall_0() { return cAdditionParserRuleCall_0; }
		
		//( {Sequence.expressions+=current} expressions+=Addition)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Sequence.expressions+=current}
		public Action getSequenceExpressionsAction_1_0() { return cSequenceExpressionsAction_1_0; }
		
		//expressions+=Addition
		public Assignment getExpressionsAssignment_1_1() { return cExpressionsAssignment_1_1; }
		
		//Addition
		public RuleCall getExpressionsAdditionParserRuleCall_1_1_0() { return cExpressionsAdditionParserRuleCall_1_1_0; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOpValuesAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_1_0 = (Alternatives)cOperatorAssignment_1_1.eContents().get(0);
		private final Keyword cOperatorPlusSignKeyword_1_1_0_0 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperatorHyphenMinusKeyword_1_1_0_1 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(1);
		private final Assignment cValuesAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValuesMultiplicationParserRuleCall_1_2_0 = (RuleCall)cValuesAssignment_1_2.eContents().get(0);
		
		//Addition returns Expression:
		//    Multiplication ( {Op.values+=current} operator=('+'|'-') values+=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication ( {Op.values+=current} operator=('+'|'-') values+=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//( {Op.values+=current} operator=('+'|'-') values+=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Op.values+=current}
		public Action getOpValuesAction_1_0() { return cOpValuesAction_1_0; }
		
		//operator=('+'|'-')
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }
		
		//('+'|'-')
		public Alternatives getOperatorAlternatives_1_1_0() { return cOperatorAlternatives_1_1_0; }
		
		//'+'
		public Keyword getOperatorPlusSignKeyword_1_1_0_0() { return cOperatorPlusSignKeyword_1_1_0_0; }
		
		//'-'
		public Keyword getOperatorHyphenMinusKeyword_1_1_0_1() { return cOperatorHyphenMinusKeyword_1_1_0_1; }
		
		//values+=Multiplication
		public Assignment getValuesAssignment_1_2() { return cValuesAssignment_1_2; }
		
		//Multiplication
		public RuleCall getValuesMultiplicationParserRuleCall_1_2_0() { return cValuesMultiplicationParserRuleCall_1_2_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTermParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOpValuesAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_1_0 = (Alternatives)cOperatorAssignment_1_1.eContents().get(0);
		private final Keyword cOperatorAsteriskKeyword_1_1_0_0 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperatorSolidusKeyword_1_1_0_1 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(1);
		private final Assignment cValuesAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValuesTermParserRuleCall_1_2_0 = (RuleCall)cValuesAssignment_1_2.eContents().get(0);
		
		//Multiplication returns Expression:
		//    Term ( {Op.values+=current} operator=('*'|'/') values+=Term)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Term ( {Op.values+=current} operator=('*'|'/') values+=Term)*
		public Group getGroup() { return cGroup; }
		
		//Term
		public RuleCall getTermParserRuleCall_0() { return cTermParserRuleCall_0; }
		
		//( {Op.values+=current} operator=('*'|'/') values+=Term)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Op.values+=current}
		public Action getOpValuesAction_1_0() { return cOpValuesAction_1_0; }
		
		//operator=('*'|'/')
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }
		
		//('*'|'/')
		public Alternatives getOperatorAlternatives_1_1_0() { return cOperatorAlternatives_1_1_0; }
		
		//'*'
		public Keyword getOperatorAsteriskKeyword_1_1_0_0() { return cOperatorAsteriskKeyword_1_1_0_0; }
		
		//'/'
		public Keyword getOperatorSolidusKeyword_1_1_0_1() { return cOperatorSolidusKeyword_1_1_0_1; }
		
		//values+=Term
		public Assignment getValuesAssignment_1_2() { return cValuesAssignment_1_2; }
		
		//Term
		public RuleCall getValuesTermParserRuleCall_1_2_0() { return cValuesTermParserRuleCall_1_2_0; }
	}
	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Term");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParensParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Term returns Expression:
		//    Atom | Parens;
		@Override public ParserRule getRule() { return rule; }
		
		//Atom | Parens
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }
		
		//Parens
		public RuleCall getParensParserRuleCall_1() { return cParensParserRuleCall_1; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Atom");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Atom:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ParensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Parens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAdditionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parens returns Expression:
		//    '(' Addition ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Addition ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall_1() { return cAdditionParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	
	
	private final SequenceElements pSequence;
	private final AdditionElements pAddition;
	private final MultiplicationElements pMultiplication;
	private final TermElements pTerm;
	private final AtomElements pAtom;
	private final ParensElements pParens;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleExpressionsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSequence = new SequenceElements();
		this.pAddition = new AdditionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pTerm = new TermElements();
		this.pAtom = new AtomElements();
		this.pParens = new ParensElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Sequence: Addition ( {Sequence.expressions+=current} expressions+=Addition)*;
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}
	
	//Addition returns Expression:
	//    Multiplication ( {Op.values+=current} operator=('+'|'-') values+=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Multiplication returns Expression:
	//    Term ( {Op.values+=current} operator=('*'|'/') values+=Term)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//Term returns Expression:
	//    Atom | Parens;
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}
	
	//Atom:
	//    name=ID;
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//Parens returns Expression:
	//    '(' Addition ')';
	public ParensElements getParensAccess() {
		return pParens;
	}
	
	public ParserRule getParensRule() {
		return getParensAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
