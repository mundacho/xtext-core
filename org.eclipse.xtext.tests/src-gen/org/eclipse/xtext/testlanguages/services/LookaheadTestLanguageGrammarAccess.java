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
public class LookaheadTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.Entry");
		private final Assignment cContentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentsAltsParserRuleCall_0 = (RuleCall)cContentsAssignment.eContents().get(0);
		
		//Entry: (contents+=Alts)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(contents+=Alts)*
		public Assignment getContentsAssignment() { return cContentsAssignment; }
		
		//Alts
		public RuleCall getContentsAltsParserRuleCall_0() { return cContentsAltsParserRuleCall_0; }
	}
	public class AltsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.Alts");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLookAhead0ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLookAhead1ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLookAhead3ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLookAheadPredicateParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cLookBeyondParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Alts: LookAhead0 | LookAhead1 | LookAhead3 | LookAheadPredicate | LookBeyond;
		@Override public ParserRule getRule() { return rule; }
		
		//LookAhead0 | LookAhead1 | LookAhead3 | LookAheadPredicate | LookBeyond
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LookAhead0
		public RuleCall getLookAhead0ParserRuleCall_0() { return cLookAhead0ParserRuleCall_0; }
		
		//LookAhead1
		public RuleCall getLookAhead1ParserRuleCall_1() { return cLookAhead1ParserRuleCall_1; }
		
		//LookAhead3
		public RuleCall getLookAhead3ParserRuleCall_2() { return cLookAhead3ParserRuleCall_2; }
		
		//LookAheadPredicate
		public RuleCall getLookAheadPredicateParserRuleCall_3() { return cLookAheadPredicateParserRuleCall_3; }
		
		//LookBeyond
		public RuleCall getLookBeyondParserRuleCall_4() { return cLookBeyondParserRuleCall_4; }
	}
	public class LookAhead0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cXAKeyword_1_0 = (Keyword)cXAssignment_1.eContents().get(0);
		
		//LookAhead0: 'bar' x='a';
		@Override public ParserRule getRule() { return rule; }
		
		//'bar' x='a'
		public Group getGroup() { return cGroup; }
		
		//'bar'
		public Keyword getBarKeyword_0() { return cBarKeyword_0; }
		
		//x='a'
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//'a'
		public Keyword getXAKeyword_1_0() { return cXAKeyword_1_0; }
	}
	public class LookAhead1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFooKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYLookAhead2ParserRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		private final Assignment cXAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cXBKeyword_2_0 = (Keyword)cXAssignment_2.eContents().get(0);
		private final Assignment cZAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cZDKeyword_3_0 = (Keyword)cZAssignment_3.eContents().get(0);
		
		//LookAhead1: 'foo' y=LookAhead2 x='b' z='d';
		@Override public ParserRule getRule() { return rule; }
		
		//'foo' y=LookAhead2 x='b' z='d'
		public Group getGroup() { return cGroup; }
		
		//'foo'
		public Keyword getFooKeyword_0() { return cFooKeyword_0; }
		
		//y=LookAhead2
		public Assignment getYAssignment_1() { return cYAssignment_1; }
		
		//LookAhead2
		public RuleCall getYLookAhead2ParserRuleCall_1_0() { return cYLookAhead2ParserRuleCall_1_0; }
		
		//x='b'
		public Assignment getXAssignment_2() { return cXAssignment_2; }
		
		//'b'
		public Keyword getXBKeyword_2_0() { return cXBKeyword_2_0; }
		
		//z='d'
		public Assignment getZAssignment_3() { return cZAssignment_3; }
		
		//'d'
		public Keyword getZDKeyword_3_0() { return cZDKeyword_3_0; }
	}
	public class LookAhead2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cZAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final Keyword cZFooKeyword_0_0_0 = (Keyword)cZAssignment_0_0.eContents().get(0);
		private final Assignment cZAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cZBarKeyword_0_1_0 = (Keyword)cZAssignment_0_1.eContents().get(0);
		private final Keyword cCKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//LookAhead2:
		//    (z='foo' | z='bar') 'c';
		@Override public ParserRule getRule() { return rule; }
		
		//(z='foo' | z='bar') 'c'
		public Group getGroup() { return cGroup; }
		
		//(z='foo' | z='bar')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//z='foo'
		public Assignment getZAssignment_0_0() { return cZAssignment_0_0; }
		
		//'foo'
		public Keyword getZFooKeyword_0_0_0() { return cZFooKeyword_0_0_0; }
		
		//z='bar'
		public Assignment getZAssignment_0_1() { return cZAssignment_0_1; }
		
		//'bar'
		public Keyword getZBarKeyword_0_1_0() { return cZBarKeyword_0_1_0; }
		
		//'c'
		public Keyword getCKeyword_1() { return cCKeyword_1; }
	}
	public class LookAhead3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFooKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cBarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cXBKeyword_2_0 = (Keyword)cXAssignment_2.eContents().get(0);
		private final Assignment cZAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cZLookAhead4ParserRuleCall_3_0 = (RuleCall)cZAssignment_3.eContents().get(0);
		
		//LookAhead3: 'foo' 'bar' x='b' z=LookAhead4;
		@Override public ParserRule getRule() { return rule; }
		
		//'foo' 'bar' x='b' z=LookAhead4
		public Group getGroup() { return cGroup; }
		
		//'foo'
		public Keyword getFooKeyword_0() { return cFooKeyword_0; }
		
		//'bar'
		public Keyword getBarKeyword_1() { return cBarKeyword_1; }
		
		//x='b'
		public Assignment getXAssignment_2() { return cXAssignment_2; }
		
		//'b'
		public Keyword getXBKeyword_2_0() { return cXBKeyword_2_0; }
		
		//z=LookAhead4
		public Assignment getZAssignment_3() { return cZAssignment_3; }
		
		//LookAhead4
		public RuleCall getZLookAhead4ParserRuleCall_3_0() { return cZLookAhead4ParserRuleCall_3_0; }
	}
	public class LookAhead4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead4");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cXCKeyword_0_0 = (Keyword)cXAssignment_0.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cXDKeyword_1_0 = (Keyword)cXAssignment_1.eContents().get(0);
		
		//LookAhead4:
		//    x='c' | x='d';
		@Override public ParserRule getRule() { return rule; }
		
		//x='c' | x='d'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//x='c'
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//'c'
		public Keyword getXCKeyword_0_0() { return cXCKeyword_0_0; }
		
		//x='d'
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//'d'
		public Keyword getXDKeyword_1_0() { return cXDKeyword_1_0; }
	}
	public class LookAheadPredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAheadPredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Action cLookAheadPredicateAction_0_0_0 = (Action)cGroup_0_0.eContents().get(0);
		private final Keyword cZonkKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Keyword cAKeyword_0_0_2 = (Keyword)cGroup_0_0.eContents().get(2);
		private final Keyword cBKeyword_0_0_3 = (Keyword)cGroup_0_0.eContents().get(3);
		private final Keyword cDKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//LookAheadPredicate:
		//    =>({LookAheadPredicate} 'zonk' 'a' 'b') 'd'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>({LookAheadPredicate} 'zonk' 'a' 'b') 'd'
		public Group getGroup() { return cGroup; }
		
		//=>({LookAheadPredicate} 'zonk' 'a' 'b')
		public Group getGroup_0() { return cGroup_0; }
		
		//{LookAheadPredicate} 'zonk' 'a' 'b'
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{LookAheadPredicate}
		public Action getLookAheadPredicateAction_0_0_0() { return cLookAheadPredicateAction_0_0_0; }
		
		//'zonk'
		public Keyword getZonkKeyword_0_0_1() { return cZonkKeyword_0_0_1; }
		
		//'a'
		public Keyword getAKeyword_0_0_2() { return cAKeyword_0_0_2; }
		
		//'b'
		public Keyword getBKeyword_0_0_3() { return cBKeyword_0_0_3; }
		
		//'d'
		public Keyword getDKeyword_1() { return cDKeyword_1; }
	}
	public class LookBeyondElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookBeyond");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftLookAheadStringsParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightFewerLookAheadStringsParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		
		//LookBeyond:
		//    left=LookAheadStrings? right=FewerLookAheadStrings
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=LookAheadStrings? right=FewerLookAheadStrings
		public Group getGroup() { return cGroup; }
		
		//left=LookAheadStrings?
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//LookAheadStrings
		public RuleCall getLeftLookAheadStringsParserRuleCall_0_0() { return cLeftLookAheadStringsParserRuleCall_0_0; }
		
		//right=FewerLookAheadStrings
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//FewerLookAheadStrings
		public RuleCall getRightFewerLookAheadStringsParserRuleCall_1_0() { return cRightFewerLookAheadStringsParserRuleCall_1_0; }
	}
	public class LookAheadStringsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAheadStrings");
		private final Assignment cValuesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_0 = (RuleCall)cValuesAssignment.eContents().get(0);
		
		//LookAheadStrings:
		//    values += STRING+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//values += STRING+
		public Assignment getValuesAssignment() { return cValuesAssignment; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_0() { return cValuesSTRINGTerminalRuleCall_0; }
	}
	public class FewerLookAheadStringsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.LookaheadTestLanguage.FewerLookAheadStrings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValuesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValuesSTRINGTerminalRuleCall_0_0 = (RuleCall)cValuesAssignment_0.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Assignment cValuesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuesIDTerminalRuleCall_2_0 = (RuleCall)cValuesAssignment_2.eContents().get(0);
		
		//FewerLookAheadStrings:
		//    values+=STRING values+=STRING values+=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//values+=STRING values+=STRING values+=ID
		public Group getGroup() { return cGroup; }
		
		//values+=STRING
		public Assignment getValuesAssignment_0() { return cValuesAssignment_0; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_0_0() { return cValuesSTRINGTerminalRuleCall_0_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_1_0() { return cValuesSTRINGTerminalRuleCall_1_0; }
		
		//values+=ID
		public Assignment getValuesAssignment_2() { return cValuesAssignment_2; }
		
		//ID
		public RuleCall getValuesIDTerminalRuleCall_2_0() { return cValuesIDTerminalRuleCall_2_0; }
	}
	
	
	private final EntryElements pEntry;
	private final AltsElements pAlts;
	private final LookAhead0Elements pLookAhead0;
	private final LookAhead1Elements pLookAhead1;
	private final LookAhead2Elements pLookAhead2;
	private final LookAhead3Elements pLookAhead3;
	private final LookAhead4Elements pLookAhead4;
	private final LookAheadPredicateElements pLookAheadPredicate;
	private final LookBeyondElements pLookBeyond;
	private final LookAheadStringsElements pLookAheadStrings;
	private final FewerLookAheadStringsElements pFewerLookAheadStrings;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LookaheadTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntry = new EntryElements();
		this.pAlts = new AltsElements();
		this.pLookAhead0 = new LookAhead0Elements();
		this.pLookAhead1 = new LookAhead1Elements();
		this.pLookAhead2 = new LookAhead2Elements();
		this.pLookAhead3 = new LookAhead3Elements();
		this.pLookAhead4 = new LookAhead4Elements();
		this.pLookAheadPredicate = new LookAheadPredicateElements();
		this.pLookBeyond = new LookBeyondElements();
		this.pLookAheadStrings = new LookAheadStringsElements();
		this.pFewerLookAheadStrings = new FewerLookAheadStringsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.LookaheadTestLanguage".equals(grammar.getName())) {
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

	
	//Entry: (contents+=Alts)*;
	public EntryElements getEntryAccess() {
		return pEntry;
	}
	
	public ParserRule getEntryRule() {
		return getEntryAccess().getRule();
	}
	
	//Alts: LookAhead0 | LookAhead1 | LookAhead3 | LookAheadPredicate | LookBeyond;
	public AltsElements getAltsAccess() {
		return pAlts;
	}
	
	public ParserRule getAltsRule() {
		return getAltsAccess().getRule();
	}
	
	//LookAhead0: 'bar' x='a';
	public LookAhead0Elements getLookAhead0Access() {
		return pLookAhead0;
	}
	
	public ParserRule getLookAhead0Rule() {
		return getLookAhead0Access().getRule();
	}
	
	//LookAhead1: 'foo' y=LookAhead2 x='b' z='d';
	public LookAhead1Elements getLookAhead1Access() {
		return pLookAhead1;
	}
	
	public ParserRule getLookAhead1Rule() {
		return getLookAhead1Access().getRule();
	}
	
	//LookAhead2:
	//    (z='foo' | z='bar') 'c';
	public LookAhead2Elements getLookAhead2Access() {
		return pLookAhead2;
	}
	
	public ParserRule getLookAhead2Rule() {
		return getLookAhead2Access().getRule();
	}
	
	//LookAhead3: 'foo' 'bar' x='b' z=LookAhead4;
	public LookAhead3Elements getLookAhead3Access() {
		return pLookAhead3;
	}
	
	public ParserRule getLookAhead3Rule() {
		return getLookAhead3Access().getRule();
	}
	
	//LookAhead4:
	//    x='c' | x='d';
	public LookAhead4Elements getLookAhead4Access() {
		return pLookAhead4;
	}
	
	public ParserRule getLookAhead4Rule() {
		return getLookAhead4Access().getRule();
	}
	
	//LookAheadPredicate:
	//    =>({LookAheadPredicate} 'zonk' 'a' 'b') 'd'
	//;
	public LookAheadPredicateElements getLookAheadPredicateAccess() {
		return pLookAheadPredicate;
	}
	
	public ParserRule getLookAheadPredicateRule() {
		return getLookAheadPredicateAccess().getRule();
	}
	
	//LookBeyond:
	//    left=LookAheadStrings? right=FewerLookAheadStrings
	//;
	public LookBeyondElements getLookBeyondAccess() {
		return pLookBeyond;
	}
	
	public ParserRule getLookBeyondRule() {
		return getLookBeyondAccess().getRule();
	}
	
	//LookAheadStrings:
	//    values += STRING+
	//;
	public LookAheadStringsElements getLookAheadStringsAccess() {
		return pLookAheadStrings;
	}
	
	public ParserRule getLookAheadStringsRule() {
		return getLookAheadStringsAccess().getRule();
	}
	
	//FewerLookAheadStrings:
	//    values+=STRING values+=STRING values+=ID
	//;
	public FewerLookAheadStringsElements getFewerLookAheadStringsAccess() {
		return pFewerLookAheadStrings;
	}
	
	public ParserRule getFewerLookAheadStringsRule() {
		return getFewerLookAheadStringsAccess().getRule();
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
