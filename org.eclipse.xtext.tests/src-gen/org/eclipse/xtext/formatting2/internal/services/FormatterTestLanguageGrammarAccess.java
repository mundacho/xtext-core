/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.formatting2.internal.services;

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
public class FormatterTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.internal.FormatterTestLanguage.Root");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDListParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKWListParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Root:
		//    IDList | KWList;
		@Override public ParserRule getRule() { return rule; }
		
		//IDList | KWList
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IDList
		public RuleCall getIDListParserRuleCall_0() { return cIDListParserRuleCall_0; }
		
		//KWList
		public RuleCall getKWListParserRuleCall_1() { return cKWListParserRuleCall_1; }
	}
	public class IDListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.internal.FormatterTestLanguage.IDList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIDListAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIdlistKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdsIDTerminalRuleCall_2_0 = (RuleCall)cIdsAssignment_2.eContents().get(0);
		
		//IDList:
		//    {IDList} "idlist" ids+=ID*;
		@Override public ParserRule getRule() { return rule; }
		
		//{IDList} "idlist" ids+=ID*
		public Group getGroup() { return cGroup; }
		
		//{IDList}
		public Action getIDListAction_0() { return cIDListAction_0; }
		
		//"idlist"
		public Keyword getIdlistKeyword_1() { return cIdlistKeyword_1; }
		
		//ids+=ID*
		public Assignment getIdsAssignment_2() { return cIdsAssignment_2; }
		
		//ID
		public RuleCall getIdsIDTerminalRuleCall_2_0() { return cIdsIDTerminalRuleCall_2_0; }
	}
	public class KWListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.internal.FormatterTestLanguage.KWList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKWListAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKwlistKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKw1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cKw1Kw1Keyword_2_0 = (Keyword)cKw1Assignment_2.eContents().get(0);
		private final Assignment cKw2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cKw2Kw2Keyword_3_0 = (Keyword)cKw2Assignment_3.eContents().get(0);
		private final Assignment cKw3Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cKw3Kw3Keyword_4_0 = (Keyword)cKw3Assignment_4.eContents().get(0);
		private final Assignment cKw4Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cKw4Kw4Keyword_5_0 = (Keyword)cKw4Assignment_5.eContents().get(0);
		private final Assignment cKw5Assignment_6 = (Assignment)cGroup.eContents().get(6);
		private final Keyword cKw5Kw5Keyword_6_0 = (Keyword)cKw5Assignment_6.eContents().get(0);
		
		//KWList:
		//    {KWList} "kwlist" kw1?="kw1"? kw2?="kw2"? kw3?="kw3"? kw4?="kw4"? kw5?="kw5"?;
		@Override public ParserRule getRule() { return rule; }
		
		//{KWList} "kwlist" kw1?="kw1"? kw2?="kw2"? kw3?="kw3"? kw4?="kw4"? kw5?="kw5"?
		public Group getGroup() { return cGroup; }
		
		//{KWList}
		public Action getKWListAction_0() { return cKWListAction_0; }
		
		//"kwlist"
		public Keyword getKwlistKeyword_1() { return cKwlistKeyword_1; }
		
		//kw1?="kw1"?
		public Assignment getKw1Assignment_2() { return cKw1Assignment_2; }
		
		//"kw1"
		public Keyword getKw1Kw1Keyword_2_0() { return cKw1Kw1Keyword_2_0; }
		
		//kw2?="kw2"?
		public Assignment getKw2Assignment_3() { return cKw2Assignment_3; }
		
		//"kw2"
		public Keyword getKw2Kw2Keyword_3_0() { return cKw2Kw2Keyword_3_0; }
		
		//kw3?="kw3"?
		public Assignment getKw3Assignment_4() { return cKw3Assignment_4; }
		
		//"kw3"
		public Keyword getKw3Kw3Keyword_4_0() { return cKw3Kw3Keyword_4_0; }
		
		//kw4?="kw4"?
		public Assignment getKw4Assignment_5() { return cKw4Assignment_5; }
		
		//"kw4"
		public Keyword getKw4Kw4Keyword_5_0() { return cKw4Kw4Keyword_5_0; }
		
		//kw5?="kw5"?
		public Assignment getKw5Assignment_6() { return cKw5Assignment_6; }
		
		//"kw5"
		public Keyword getKw5Kw5Keyword_6_0() { return cKw5Kw5Keyword_6_0; }
	}
	
	
	private final RootElements pRoot;
	private final IDListElements pIDList;
	private final KWListElements pKWList;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FormatterTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pIDList = new IDListElements();
		this.pKWList = new KWListElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.formatting2.internal.FormatterTestLanguage".equals(grammar.getName())) {
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

	
	//Root:
	//    IDList | KWList;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//IDList:
	//    {IDList} "idlist" ids+=ID*;
	public IDListElements getIDListAccess() {
		return pIDList;
	}
	
	public ParserRule getIDListRule() {
		return getIDListAccess().getRule();
	}
	
	//KWList:
	//    {KWList} "kwlist" kw1?="kw1"? kw2?="kw2"? kw3?="kw3"? kw4?="kw4"? kw5?="kw5"?;
	public KWListElements getKWListAccess() {
		return pKWList;
	}
	
	public ParserRule getKWListRule() {
		return getKWListAccess().getRule();
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
