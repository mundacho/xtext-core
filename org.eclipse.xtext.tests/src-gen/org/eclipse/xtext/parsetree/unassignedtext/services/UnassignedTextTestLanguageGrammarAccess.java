/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.unassignedtext.services;

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
public class UnassignedTextTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCaseInsensitiveKeywordRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPluralRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMultiRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDatatypeRuleParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cCommonTerminalsRuleParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cGroupRuleParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Model:
		//    CaseInsensitiveKeywordRule | PluralRule | MultiRule | DatatypeRule | CommonTerminalsRule | GroupRule;
		@Override public ParserRule getRule() { return rule; }
		
		//CaseInsensitiveKeywordRule | PluralRule | MultiRule | DatatypeRule | CommonTerminalsRule | GroupRule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CaseInsensitiveKeywordRule
		public RuleCall getCaseInsensitiveKeywordRuleParserRuleCall_0() { return cCaseInsensitiveKeywordRuleParserRuleCall_0; }
		
		//PluralRule
		public RuleCall getPluralRuleParserRuleCall_1() { return cPluralRuleParserRuleCall_1; }
		
		//MultiRule
		public RuleCall getMultiRuleParserRuleCall_2() { return cMultiRuleParserRuleCall_2; }
		
		//DatatypeRule
		public RuleCall getDatatypeRuleParserRuleCall_3() { return cDatatypeRuleParserRuleCall_3; }
		
		//CommonTerminalsRule
		public RuleCall getCommonTerminalsRuleParserRuleCall_4() { return cCommonTerminalsRuleParserRuleCall_4; }
		
		//GroupRule
		public RuleCall getGroupRuleParserRuleCall_5() { return cGroupRuleParserRuleCall_5; }
	}
	public class CaseInsensitiveKeywordRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.CaseInsensitiveKeywordRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCaseInsensitiveKeywordTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//CaseInsensitiveKeywordRule:
		//    CaseInsensitiveKeyword val=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//CaseInsensitiveKeyword val=INT
		public Group getGroup() { return cGroup; }
		
		//CaseInsensitiveKeyword
		public RuleCall getCaseInsensitiveKeywordTerminalRuleCall_0() { return cCaseInsensitiveKeywordTerminalRuleCall_0; }
		
		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}
	public class PluralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.PluralRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContentsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCountINTTerminalRuleCall_1_0 = (RuleCall)cCountAssignment_1.eContents().get(0);
		private final RuleCall cPluralTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//PluralRule:
		//    'contents:' count=INT Plural;
		@Override public ParserRule getRule() { return rule; }
		
		//'contents:' count=INT Plural
		public Group getGroup() { return cGroup; }
		
		//'contents:'
		public Keyword getContentsKeyword_0() { return cContentsKeyword_0; }
		
		//count=INT
		public Assignment getCountAssignment_1() { return cCountAssignment_1; }
		
		//INT
		public RuleCall getCountINTTerminalRuleCall_1_0() { return cCountINTTerminalRuleCall_1_0; }
		
		//Plural
		public RuleCall getPluralTerminalRuleCall_2() { return cPluralTerminalRuleCall_2; }
	}
	public class MultiRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.MultiRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMultiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final RuleCall cMultiTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cMultiTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cMultiTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//MultiRule:
		//    'multi' val=INT Multi Multi Multi;
		@Override public ParserRule getRule() { return rule; }
		
		//'multi' val=INT Multi Multi Multi
		public Group getGroup() { return cGroup; }
		
		//'multi'
		public Keyword getMultiKeyword_0() { return cMultiKeyword_0; }
		
		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
		
		//Multi
		public RuleCall getMultiTerminalRuleCall_2() { return cMultiTerminalRuleCall_2; }
		
		//Multi
		public RuleCall getMultiTerminalRuleCall_3() { return cMultiTerminalRuleCall_3; }
		
		//Multi
		public RuleCall getMultiTerminalRuleCall_4() { return cMultiTerminalRuleCall_4; }
	}
	public class DatatypeRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.DatatypeRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final RuleCall cDatatypeParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DatatypeRule:
		//    'datatype' val=INT Datatype;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' val=INT Datatype
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
		
		//Datatype
		public RuleCall getDatatypeParserRuleCall_2() { return cDatatypeParserRuleCall_2; }
	}
	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStrKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDatatype2ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Datatype returns ecore::EString:
		//    'str' | INT | Datatype2;
		@Override public ParserRule getRule() { return rule; }
		
		//'str' | INT | Datatype2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'str'
		public Keyword getStrKeyword_0() { return cStrKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//Datatype2
		public RuleCall getDatatype2ParserRuleCall_2() { return cDatatype2ParserRuleCall_2; }
	}
	public class Datatype2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Datatype2");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Datatype2 returns ecore::EString:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class CommonTerminalsRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.CommonTerminalsRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerminalsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cValAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValIDTerminalRuleCall_4_0 = (RuleCall)cValAssignment_4.eContents().get(0);
		
		//CommonTerminalsRule:
		//    'terminals' ID INT STRING val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'terminals' ID INT STRING val=ID
		public Group getGroup() { return cGroup; }
		
		//'terminals'
		public Keyword getTerminalsKeyword_0() { return cTerminalsKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }
		
		//val=ID
		public Assignment getValAssignment_4() { return cValAssignment_4; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_4_0() { return cValIDTerminalRuleCall_4_0; }
	}
	public class GroupRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.GroupRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGroupRuleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGroupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cGroupDataTypeRuleParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//GroupRule: {GroupRule}'group' GroupDataTypeRule;
		@Override public ParserRule getRule() { return rule; }
		
		//{GroupRule}'group' GroupDataTypeRule
		public Group getGroup() { return cGroup; }
		
		//{GroupRule}
		public Action getGroupRuleAction_0() { return cGroupRuleAction_0; }
		
		//'group'
		public Keyword getGroupKeyword_1() { return cGroupKeyword_1; }
		
		//GroupDataTypeRule
		public RuleCall getGroupDataTypeRuleParserRuleCall_2() { return cGroupDataTypeRuleParserRuleCall_2; }
	}
	public class GroupDataTypeRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.GroupDataTypeRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTestKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GroupDataTypeRule:
		//    ('this' 'is' 'a' 'test')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('this' 'is' 'a' 'test')
		public Group getGroup() { return cGroup; }
		
		//'this'
		public Keyword getThisKeyword_0() { return cThisKeyword_0; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//'a'
		public Keyword getAKeyword_2() { return cAKeyword_2; }
		
		//'test'
		public Keyword getTestKeyword_3() { return cTestKeyword_3; }
	}
	
	
	private final ModelElements pModel;
	private final CaseInsensitiveKeywordRuleElements pCaseInsensitiveKeywordRule;
	private final TerminalRule tCaseInsensitiveKeyword;
	private final PluralRuleElements pPluralRule;
	private final TerminalRule tPlural;
	private final MultiRuleElements pMultiRule;
	private final TerminalRule tMulti;
	private final TerminalRule tMulti2;
	private final DatatypeRuleElements pDatatypeRule;
	private final DatatypeElements pDatatype;
	private final Datatype2Elements pDatatype2;
	private final CommonTerminalsRuleElements pCommonTerminalsRule;
	private final GroupRuleElements pGroupRule;
	private final GroupDataTypeRuleElements pGroupDataTypeRule;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnassignedTextTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCaseInsensitiveKeywordRule = new CaseInsensitiveKeywordRuleElements();
		this.tCaseInsensitiveKeyword = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.CaseInsensitiveKeyword");
		this.pPluralRule = new PluralRuleElements();
		this.tPlural = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Plural");
		this.pMultiRule = new MultiRuleElements();
		this.tMulti = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Multi");
		this.tMulti2 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage.Multi2");
		this.pDatatypeRule = new DatatypeRuleElements();
		this.pDatatype = new DatatypeElements();
		this.pDatatype2 = new Datatype2Elements();
		this.pCommonTerminalsRule = new CommonTerminalsRuleElements();
		this.pGroupRule = new GroupRuleElements();
		this.pGroupDataTypeRule = new GroupDataTypeRuleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTestLanguage".equals(grammar.getName())) {
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
	//    CaseInsensitiveKeywordRule | PluralRule | MultiRule | DatatypeRule | CommonTerminalsRule | GroupRule;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//CaseInsensitiveKeywordRule:
	//    CaseInsensitiveKeyword val=INT;
	public CaseInsensitiveKeywordRuleElements getCaseInsensitiveKeywordRuleAccess() {
		return pCaseInsensitiveKeywordRule;
	}
	
	public ParserRule getCaseInsensitiveKeywordRuleRule() {
		return getCaseInsensitiveKeywordRuleAccess().getRule();
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal CaseInsensitiveKeyword:
	//    ('k'|'K')('e'|'E')('y'|'Y')('w'|'W')('o'|'O')('r'|'R')('d'|'D');
	public TerminalRule getCaseInsensitiveKeywordRule() {
		return tCaseInsensitiveKeyword;
	}
	
	//PluralRule:
	//    'contents:' count=INT Plural;
	public PluralRuleElements getPluralRuleAccess() {
		return pPluralRule;
	}
	
	public ParserRule getPluralRuleRule() {
		return getPluralRuleAccess().getRule();
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Plural:
	//    'item' | 'items';
	public TerminalRule getPluralRule() {
		return tPlural;
	}
	
	//MultiRule:
	//    'multi' val=INT Multi Multi Multi;
	public MultiRuleElements getMultiRuleAccess() {
		return pMultiRule;
	}
	
	public ParserRule getMultiRuleRule() {
		return getMultiRuleAccess().getRule();
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Multi:
	//    'a' 'b'? 'c'+ 'd'* ('e' | 'f') (('g'|'h') | 'i'+) Multi2 '0'..'9' '0'..'9'+;
	public TerminalRule getMultiRule() {
		return tMulti;
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Multi2:
	//    'j';
	public TerminalRule getMulti2Rule() {
		return tMulti2;
	}
	
	//DatatypeRule:
	//    'datatype' val=INT Datatype;
	public DatatypeRuleElements getDatatypeRuleAccess() {
		return pDatatypeRule;
	}
	
	public ParserRule getDatatypeRuleRule() {
		return getDatatypeRuleAccess().getRule();
	}
	
	//Datatype returns ecore::EString:
	//    'str' | INT | Datatype2;
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//Datatype2 returns ecore::EString:
	//    STRING;
	public Datatype2Elements getDatatype2Access() {
		return pDatatype2;
	}
	
	public ParserRule getDatatype2Rule() {
		return getDatatype2Access().getRule();
	}
	
	//CommonTerminalsRule:
	//    'terminals' ID INT STRING val=ID;
	public CommonTerminalsRuleElements getCommonTerminalsRuleAccess() {
		return pCommonTerminalsRule;
	}
	
	public ParserRule getCommonTerminalsRuleRule() {
		return getCommonTerminalsRuleAccess().getRule();
	}
	
	//GroupRule: {GroupRule}'group' GroupDataTypeRule;
	public GroupRuleElements getGroupRuleAccess() {
		return pGroupRule;
	}
	
	public ParserRule getGroupRuleRule() {
		return getGroupRuleAccess().getRule();
	}
	
	//GroupDataTypeRule:
	//    ('this' 'is' 'a' 'test')
	//;
	public GroupDataTypeRuleElements getGroupDataTypeRuleAccess() {
		return pGroupDataTypeRule;
	}
	
	public ParserRule getGroupDataTypeRuleRule() {
		return getGroupDataTypeRuleAccess().getRule();
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
