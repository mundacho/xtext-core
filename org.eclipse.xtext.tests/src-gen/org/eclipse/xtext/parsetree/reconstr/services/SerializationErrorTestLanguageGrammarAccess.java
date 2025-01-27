/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class SerializationErrorTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTestAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTestTestParserRuleCall_0_0 = (RuleCall)cTestAssignment_0.eContents().get(0);
		private final Assignment cTestAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTestParenthesisParserRuleCall_1_0 = (RuleCall)cTestAssignment_1.eContents().get(0);
		
		//Model:
		//    test=Test | test=Parenthesis;
		@Override public ParserRule getRule() { return rule; }
		
		//test=Test | test=Parenthesis
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//test=Test
		public Assignment getTestAssignment_0() { return cTestAssignment_0; }
		
		//Test
		public RuleCall getTestTestParserRuleCall_0_0() { return cTestTestParserRuleCall_0_0; }
		
		//test=Parenthesis
		public Assignment getTestAssignment_1() { return cTestAssignment_1; }
		
		//Parenthesis
		public RuleCall getTestParenthesisParserRuleCall_1_0() { return cTestParenthesisParserRuleCall_1_0; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTestParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis returns Test:
		//    "(" Test ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" Test ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Test
		public RuleCall getTestParserRuleCall_1() { return cTestParserRuleCall_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class TestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Test");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTwoRequiredParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTwoOptionsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIndentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Test:
		//    TwoRequired | TwoOptions | Indent;
		@Override public ParserRule getRule() { return rule; }
		
		//TwoRequired | TwoOptions | Indent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TwoRequired
		public RuleCall getTwoRequiredParserRuleCall_0() { return cTwoRequiredParserRuleCall_0; }
		
		//TwoOptions
		public RuleCall getTwoOptionsParserRuleCall_1() { return cTwoOptionsParserRuleCall_1; }
		
		//Indent
		public RuleCall getIndentParserRuleCall_2() { return cIndentParserRuleCall_2; }
	}
	public class TwoRequiredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.TwoRequired");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTworequiredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOneAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOneIDTerminalRuleCall_1_0 = (RuleCall)cOneAssignment_1.eContents().get(0);
		private final Assignment cTwoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTwoIDTerminalRuleCall_2_0 = (RuleCall)cTwoAssignment_2.eContents().get(0);
		
		//TwoRequired:
		//    "tworequired" one=ID two=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"tworequired" one=ID two=ID
		public Group getGroup() { return cGroup; }
		
		//"tworequired"
		public Keyword getTworequiredKeyword_0() { return cTworequiredKeyword_0; }
		
		//one=ID
		public Assignment getOneAssignment_1() { return cOneAssignment_1; }
		
		//ID
		public RuleCall getOneIDTerminalRuleCall_1_0() { return cOneIDTerminalRuleCall_1_0; }
		
		//two=ID
		public Assignment getTwoAssignment_2() { return cTwoAssignment_2; }
		
		//ID
		public RuleCall getTwoIDTerminalRuleCall_2_0() { return cTwoIDTerminalRuleCall_2_0; }
	}
	public class TwoOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.TwoOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTwooptionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cOneKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cOneAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cOneIDTerminalRuleCall_1_0_1_0 = (RuleCall)cOneAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cTwoAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cTwoIDTerminalRuleCall_1_1_1_0 = (RuleCall)cTwoAssignment_1_1_1.eContents().get(0);
		
		//TwoOptions:
		//    "twooptions" ("one" one=ID | "two" two=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"twooptions" ("one" one=ID | "two" two=ID)
		public Group getGroup() { return cGroup; }
		
		//"twooptions"
		public Keyword getTwooptionsKeyword_0() { return cTwooptionsKeyword_0; }
		
		//("one" one=ID | "two" two=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"one" one=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"one"
		public Keyword getOneKeyword_1_0_0() { return cOneKeyword_1_0_0; }
		
		//one=ID
		public Assignment getOneAssignment_1_0_1() { return cOneAssignment_1_0_1; }
		
		//ID
		public RuleCall getOneIDTerminalRuleCall_1_0_1_0() { return cOneIDTerminalRuleCall_1_0_1_0; }
		
		//"two" two=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"two"
		public Keyword getTwoKeyword_1_1_0() { return cTwoKeyword_1_1_0; }
		
		//two=ID
		public Assignment getTwoAssignment_1_1_1() { return cTwoAssignment_1_1_1; }
		
		//ID
		public RuleCall getTwoIDTerminalRuleCall_1_1_1_0() { return cTwoIDTerminalRuleCall_1_1_1_0; }
	}
	public class IndentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Indent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cReqAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cReqTwoRequiredParserRuleCall_1_0 = (RuleCall)cReqAssignment_1.eContents().get(0);
		private final Assignment cOptAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOptTwoOptionsParserRuleCall_2_0 = (RuleCall)cOptAssignment_2.eContents().get(0);
		private final Assignment cIndentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIndentIndentParserRuleCall_3_0 = (RuleCall)cIndentAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		///* SuppressWarnings[noInstantiation] */
		//Indent:
		//    "{" req=TwoRequired? opt=TwoOptions? indent+=Indent* "}";
		@Override public ParserRule getRule() { return rule; }
		
		//"{" req=TwoRequired? opt=TwoOptions? indent+=Indent* "}"
		public Group getGroup() { return cGroup; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//req=TwoRequired?
		public Assignment getReqAssignment_1() { return cReqAssignment_1; }
		
		//TwoRequired
		public RuleCall getReqTwoRequiredParserRuleCall_1_0() { return cReqTwoRequiredParserRuleCall_1_0; }
		
		//opt=TwoOptions?
		public Assignment getOptAssignment_2() { return cOptAssignment_2; }
		
		//TwoOptions
		public RuleCall getOptTwoOptionsParserRuleCall_2_0() { return cOptTwoOptionsParserRuleCall_2_0; }
		
		//indent+=Indent*
		public Assignment getIndentAssignment_3() { return cIndentAssignment_3; }
		
		//Indent
		public RuleCall getIndentIndentParserRuleCall_3_0() { return cIndentIndentParserRuleCall_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final ParenthesisElements pParenthesis;
	private final TestElements pTest;
	private final TwoRequiredElements pTwoRequired;
	private final TwoOptionsElements pTwoOptions;
	private final IndentElements pIndent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SerializationErrorTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pParenthesis = new ParenthesisElements();
		this.pTest = new TestElements();
		this.pTwoRequired = new TwoRequiredElements();
		this.pTwoOptions = new TwoOptionsElements();
		this.pIndent = new IndentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    test=Test | test=Parenthesis;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Parenthesis returns Test:
	//    "(" Test ")";
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Test:
	//    TwoRequired | TwoOptions | Indent;
	public TestElements getTestAccess() {
		return pTest;
	}
	
	public ParserRule getTestRule() {
		return getTestAccess().getRule();
	}
	
	//TwoRequired:
	//    "tworequired" one=ID two=ID;
	public TwoRequiredElements getTwoRequiredAccess() {
		return pTwoRequired;
	}
	
	public ParserRule getTwoRequiredRule() {
		return getTwoRequiredAccess().getRule();
	}
	
	//TwoOptions:
	//    "twooptions" ("one" one=ID | "two" two=ID);
	public TwoOptionsElements getTwoOptionsAccess() {
		return pTwoOptions;
	}
	
	public ParserRule getTwoOptionsRule() {
		return getTwoOptionsAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//Indent:
	//    "{" req=TwoRequired? opt=TwoOptions? indent+=Indent* "}";
	public IndentElements getIndentAccess() {
		return pIndent;
	}
	
	public ParserRule getIndentRule() {
		return getIndentAccess().getRule();
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
