/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug301935TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIDTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final RuleCall cNLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cValue2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValue2IDTerminalRuleCall_4_0 = (RuleCall)cValue2Assignment_4.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Model:
		//    name=ID WS value=ID NL
		//    value2=ID WS
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID WS value=ID NL
		//value2=ID WS
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//value=ID
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0() { return cValueIDTerminalRuleCall_2_0; }
		
		//NL
		public RuleCall getNLParserRuleCall_3() { return cNLParserRuleCall_3; }
		
		//value2=ID
		public Assignment getValue2Assignment_4() { return cValue2Assignment_4; }
		
		//ID
		public RuleCall getValue2IDTerminalRuleCall_4_0() { return cValue2IDTerminalRuleCall_4_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_5() { return cWSTerminalRuleCall_5; }
	}
	public class NLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.NL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCarriageReturnKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLineFeedKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NL:
		//    WS* ('\r'? '\n') WS*;
		@Override public ParserRule getRule() { return rule; }
		
		//WS* ('\r'? '\n') WS*
		public Group getGroup() { return cGroup; }
		
		//WS*
		public RuleCall getWSTerminalRuleCall_0() { return cWSTerminalRuleCall_0; }
		
		//('\r'? '\n')
		public Group getGroup_1() { return cGroup_1; }
		
		//'\r'?
		public Keyword getCarriageReturnKeyword_1_0() { return cCarriageReturnKeyword_1_0; }
		
		//'\n'
		public Keyword getLineFeedKeyword_1_1() { return cLineFeedKeyword_1_1; }
		
		//WS*
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }
	}
	
	
	private final ModelElements pModel;
	private final NLElements pNL;
	private final TerminalRule tID;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public Bug301935TestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pNL = new NLElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.ID");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug301935TestLanguage".equals(grammar.getName())) {
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
	

	
	//Model:
	//    name=ID WS value=ID NL
	//    value2=ID WS
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NL:
	//    WS* ('\r'? '\n') WS*;
	public NLElements getNLAccess() {
		return pNL;
	}
	
	public ParserRule getNLRule() {
		return getNLAccess().getRule();
	}
	
	//terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal WS			: (' '|'\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
