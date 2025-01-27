/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.transientvalues.services;

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
public class TransientValuesTestGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest.Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cTestRequiredParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cTestOptionalParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cTestListParserRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		
		//Root:
		//    "test" (TestRequired | TestOptional | TestList);
		@Override public ParserRule getRule() { return rule; }
		
		//"test" (TestRequired | TestOptional | TestList)
		public Group getGroup() { return cGroup; }
		
		//"test"
		public Keyword getTestKeyword_0() { return cTestKeyword_0; }
		
		//(TestRequired | TestOptional | TestList)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//TestRequired
		public RuleCall getTestRequiredParserRuleCall_1_0() { return cTestRequiredParserRuleCall_1_0; }
		
		//TestOptional
		public RuleCall getTestOptionalParserRuleCall_1_1() { return cTestOptionalParserRuleCall_1_1; }
		
		//TestList
		public RuleCall getTestListParserRuleCall_1_2() { return cTestListParserRuleCall_1_2; }
	}
	public class TestRequiredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest.TestRequired");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestRequiredAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRequiredKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRequired1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRequired1INTTerminalRuleCall_2_0 = (RuleCall)cRequired1Assignment_2.eContents().get(0);
		private final Assignment cRequired2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRequired2INTTerminalRuleCall_3_0 = (RuleCall)cRequired2Assignment_3.eContents().get(0);
		
		//TestRequired:
		//    {TestRequired} "required" required1=INT required2=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestRequired} "required" required1=INT required2=INT
		public Group getGroup() { return cGroup; }
		
		//{TestRequired}
		public Action getTestRequiredAction_0() { return cTestRequiredAction_0; }
		
		//"required"
		public Keyword getRequiredKeyword_1() { return cRequiredKeyword_1; }
		
		//required1=INT
		public Assignment getRequired1Assignment_2() { return cRequired1Assignment_2; }
		
		//INT
		public RuleCall getRequired1INTTerminalRuleCall_2_0() { return cRequired1INTTerminalRuleCall_2_0; }
		
		//required2=INT
		public Assignment getRequired2Assignment_3() { return cRequired2Assignment_3; }
		
		//INT
		public RuleCall getRequired2INTTerminalRuleCall_3_0() { return cRequired2INTTerminalRuleCall_3_0; }
	}
	public class TestOptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest.TestOptional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestOptionalAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOptionalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOpt1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOpt1INTTerminalRuleCall_2_0 = (RuleCall)cOpt1Assignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cOpt2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cOpt2INTTerminalRuleCall_3_1_0 = (RuleCall)cOpt2Assignment_3_1.eContents().get(0);
		
		//TestOptional:
		//    {TestOptional} "optional" opt1=INT? (":" opt2=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestOptional} "optional" opt1=INT? (":" opt2=INT)?
		public Group getGroup() { return cGroup; }
		
		//{TestOptional}
		public Action getTestOptionalAction_0() { return cTestOptionalAction_0; }
		
		//"optional"
		public Keyword getOptionalKeyword_1() { return cOptionalKeyword_1; }
		
		//opt1=INT?
		public Assignment getOpt1Assignment_2() { return cOpt1Assignment_2; }
		
		//INT
		public RuleCall getOpt1INTTerminalRuleCall_2_0() { return cOpt1INTTerminalRuleCall_2_0; }
		
		//(":" opt2=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }
		
		//opt2=INT
		public Assignment getOpt2Assignment_3_1() { return cOpt2Assignment_3_1; }
		
		//INT
		public RuleCall getOpt2INTTerminalRuleCall_3_1_0() { return cOpt2INTTerminalRuleCall_3_1_0; }
	}
	public class TestListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest.TestList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestListAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cListKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cItemAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemINTTerminalRuleCall_2_0 = (RuleCall)cItemAssignment_2.eContents().get(0);
		
		//TestList:
		//    {TestList} "list" item+=INT*;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestList} "list" item+=INT*
		public Group getGroup() { return cGroup; }
		
		//{TestList}
		public Action getTestListAction_0() { return cTestListAction_0; }
		
		//"list"
		public Keyword getListKeyword_1() { return cListKeyword_1; }
		
		//item+=INT*
		public Assignment getItemAssignment_2() { return cItemAssignment_2; }
		
		//INT
		public RuleCall getItemINTTerminalRuleCall_2_0() { return cItemINTTerminalRuleCall_2_0; }
	}
	
	
	private final RootElements pRoot;
	private final TestRequiredElements pTestRequired;
	private final TestOptionalElements pTestOptional;
	private final TestListElements pTestList;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TransientValuesTestGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pTestRequired = new TestRequiredElements();
		this.pTestOptional = new TestOptionalElements();
		this.pTestList = new TestListElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest".equals(grammar.getName())) {
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
	//    "test" (TestRequired | TestOptional | TestList);
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//TestRequired:
	//    {TestRequired} "required" required1=INT required2=INT;
	public TestRequiredElements getTestRequiredAccess() {
		return pTestRequired;
	}
	
	public ParserRule getTestRequiredRule() {
		return getTestRequiredAccess().getRule();
	}
	
	//TestOptional:
	//    {TestOptional} "optional" opt1=INT? (":" opt2=INT)?;
	public TestOptionalElements getTestOptionalAccess() {
		return pTestOptional;
	}
	
	public ParserRule getTestOptionalRule() {
		return getTestOptionalAccess().getRule();
	}
	
	//TestList:
	//    {TestList} "list" item+=INT*;
	public TestListElements getTestListAccess() {
		return pTestList;
	}
	
	public ParserRule getTestListRule() {
		return getTestListAccess().getRule();
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
