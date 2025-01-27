/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.formatter.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cTestLinewrapParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cTestIndentationParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cTestLinewrapMinMaxParserRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cWrappingDataTypeTestParserRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		
		//Root:
		//    "test" (TestLinewrap | TestIndentation | TestLinewrapMinMax | WrappingDataTypeTest);
		@Override public ParserRule getRule() { return rule; }
		
		//"test" (TestLinewrap | TestIndentation | TestLinewrapMinMax | WrappingDataTypeTest)
		public Group getGroup() { return cGroup; }
		
		//"test"
		public Keyword getTestKeyword_0() { return cTestKeyword_0; }
		
		//(TestLinewrap | TestIndentation | TestLinewrapMinMax | WrappingDataTypeTest)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//TestLinewrap
		public RuleCall getTestLinewrapParserRuleCall_1_0() { return cTestLinewrapParserRuleCall_1_0; }
		
		//TestIndentation
		public RuleCall getTestIndentationParserRuleCall_1_1() { return cTestIndentationParserRuleCall_1_1; }
		
		//TestLinewrapMinMax
		public RuleCall getTestLinewrapMinMaxParserRuleCall_1_2() { return cTestLinewrapMinMaxParserRuleCall_1_2; }
		
		//WrappingDataTypeTest
		public RuleCall getWrappingDataTypeTestParserRuleCall_1_3() { return cWrappingDataTypeTestParserRuleCall_1_3; }
	}
	public class LineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cDeclParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cAssignParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cMethParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final RuleCall cFqnObjParserRuleCall_0_3 = (RuleCall)cAlternatives_0.eContents().get(3);
		private final RuleCall cFqnRefParserRuleCall_0_4 = (RuleCall)cAlternatives_0.eContents().get(4);
		private final RuleCall cEnumerationParserRuleCall_0_5 = (RuleCall)cAlternatives_0.eContents().get(5);
		private final Group cGroup_0_6 = (Group)cAlternatives_0.eContents().get(6);
		private final RuleCall cSuppressedHiddenParserRuleCall_0_6_0 = (RuleCall)cGroup_0_6.eContents().get(0);
		private final Keyword cPostKeyword_0_6_1 = (Keyword)cGroup_0_6.eContents().get(1);
		private final RuleCall cSpaceParserRuleCall_0_7 = (RuleCall)cAlternatives_0.eContents().get(7);
		private final RuleCall cDatatypesParserRuleCall_0_8 = (RuleCall)cAlternatives_0.eContents().get(8);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Line:
		//    (Decl | Assign | Meth | FqnObj | FqnRef | Enumeration | SuppressedHidden "post" | Space | Datatypes) ";";
		@Override public ParserRule getRule() { return rule; }
		
		//(Decl | Assign | Meth | FqnObj | FqnRef | Enumeration | SuppressedHidden "post" | Space | Datatypes) ";"
		public Group getGroup() { return cGroup; }
		
		//(Decl | Assign | Meth | FqnObj | FqnRef | Enumeration | SuppressedHidden "post" | Space | Datatypes)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Decl
		public RuleCall getDeclParserRuleCall_0_0() { return cDeclParserRuleCall_0_0; }
		
		//Assign
		public RuleCall getAssignParserRuleCall_0_1() { return cAssignParserRuleCall_0_1; }
		
		//Meth
		public RuleCall getMethParserRuleCall_0_2() { return cMethParserRuleCall_0_2; }
		
		//FqnObj
		public RuleCall getFqnObjParserRuleCall_0_3() { return cFqnObjParserRuleCall_0_3; }
		
		//FqnRef
		public RuleCall getFqnRefParserRuleCall_0_4() { return cFqnRefParserRuleCall_0_4; }
		
		//Enumeration
		public RuleCall getEnumerationParserRuleCall_0_5() { return cEnumerationParserRuleCall_0_5; }
		
		//SuppressedHidden "post"
		public Group getGroup_0_6() { return cGroup_0_6; }
		
		//SuppressedHidden
		public RuleCall getSuppressedHiddenParserRuleCall_0_6_0() { return cSuppressedHiddenParserRuleCall_0_6_0; }
		
		//"post"
		public Keyword getPostKeyword_0_6_1() { return cPostKeyword_0_6_1; }
		
		//Space
		public RuleCall getSpaceParserRuleCall_0_7() { return cSpaceParserRuleCall_0_7; }
		
		//Datatypes
		public RuleCall getDatatypesParserRuleCall_0_8() { return cDatatypesParserRuleCall_0_8; }
		
		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class DeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Decl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeIDTerminalRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Decl:
		//    type+=ID name+=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type+=ID name+=ID
		public Group getGroup() { return cGroup; }
		
		//type+=ID
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_0() { return cTypeIDTerminalRuleCall_0_0; }
		
		//name+=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class AssignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Assign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVarIDTerminalRuleCall_0_0 = (RuleCall)cVarAssignment_0.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final Keyword cOpEqualsSignKeyword_1_0_0 = (Keyword)cOpAlternatives_1_0.eContents().get(0);
		private final Keyword cOpPlusSignEqualsSignKeyword_1_0_1 = (Keyword)cOpAlternatives_1_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cValAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cValINTTerminalRuleCall_3_0_0 = (RuleCall)cValAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cValAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_3_1_1_0 = (RuleCall)cValAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Assign:
		//    var=ID op=("="|"+=") "[" (val+=INT ("," val+=INT)*)? "]";
		@Override public ParserRule getRule() { return rule; }
		
		//var=ID op=("="|"+=") "[" (val+=INT ("," val+=INT)*)? "]"
		public Group getGroup() { return cGroup; }
		
		//var=ID
		public Assignment getVarAssignment_0() { return cVarAssignment_0; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_0_0() { return cVarIDTerminalRuleCall_0_0; }
		
		//op=("="|"+=")
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//("="|"+=")
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//"="
		public Keyword getOpEqualsSignKeyword_1_0_0() { return cOpEqualsSignKeyword_1_0_0; }
		
		//"+="
		public Keyword getOpPlusSignEqualsSignKeyword_1_0_1() { return cOpPlusSignEqualsSignKeyword_1_0_1; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//(val+=INT ("," val+=INT)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//val+=INT
		public Assignment getValAssignment_3_0() { return cValAssignment_3_0; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_3_0_0() { return cValINTTerminalRuleCall_3_0_0; }
		
		//("," val+=INT)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//val+=INT
		public Assignment getValAssignment_3_1_1() { return cValAssignment_3_1_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_3_1_1_0() { return cValINTTerminalRuleCall_3_1_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class MethElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Meth");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVoidKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParamAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParamParamParserRuleCall_3_0_0 = (RuleCall)cParamAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParamAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParamParamParserRuleCall_3_1_1_0 = (RuleCall)cParamAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Meth:
		//    "void" name=ID "(" (param+=Param ("," param+=Param)*)? ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"void" name=ID "(" (param+=Param ("," param+=Param)*)? ")"
		public Group getGroup() { return cGroup; }
		
		//"void"
		public Keyword getVoidKeyword_0() { return cVoidKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(param+=Param ("," param+=Param)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//param+=Param
		public Assignment getParamAssignment_3_0() { return cParamAssignment_3_0; }
		
		//Param
		public RuleCall getParamParamParserRuleCall_3_0_0() { return cParamParamParserRuleCall_3_0_0; }
		
		//("," param+=Param)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//param+=Param
		public Assignment getParamAssignment_3_1_1() { return cParamAssignment_3_1_1; }
		
		//Param
		public RuleCall getParamParamParserRuleCall_3_1_1_0() { return cParamParamParserRuleCall_3_1_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Param");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeIDTerminalRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Param:
		//    name+=ID ":" type+=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name+=ID ":" type+=ID
		public Group getGroup() { return cGroup; }
		
		//name+=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type+=ID
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_2_0() { return cTypeIDTerminalRuleCall_2_0; }
	}
	public class SpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Space");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Space: "space" val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"space" val=ID
		public Group getGroup() { return cGroup; }
		
		//"space"
		public Keyword getSpaceKeyword_0() { return cSpaceKeyword_0; }
		
		//val=ID
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0() { return cValIDTerminalRuleCall_1_0; }
	}
	public class TestLinewrapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.TestLinewrap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestLinewrapAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLinewrapKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemsLineParserRuleCall_2_0 = (RuleCall)cItemsAssignment_2.eContents().get(0);
		
		//TestLinewrap:
		//    {TestLinewrap} "linewrap" items+=Line*;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestLinewrap} "linewrap" items+=Line*
		public Group getGroup() { return cGroup; }
		
		//{TestLinewrap}
		public Action getTestLinewrapAction_0() { return cTestLinewrapAction_0; }
		
		//"linewrap"
		public Keyword getLinewrapKeyword_1() { return cLinewrapKeyword_1; }
		
		//items+=Line*
		public Assignment getItemsAssignment_2() { return cItemsAssignment_2; }
		
		//Line
		public RuleCall getItemsLineParserRuleCall_2_0() { return cItemsLineParserRuleCall_2_0; }
	}
	public class TestLinewrapMinMaxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.TestLinewrapMinMax");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestLinewrapMinMaxAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWrapminmaxKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemsLineParserRuleCall_2_0 = (RuleCall)cItemsAssignment_2.eContents().get(0);
		
		//TestLinewrapMinMax:
		//    {TestLinewrapMinMax} "wrapminmax" items+=Line*;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestLinewrapMinMax} "wrapminmax" items+=Line*
		public Group getGroup() { return cGroup; }
		
		//{TestLinewrapMinMax}
		public Action getTestLinewrapMinMaxAction_0() { return cTestLinewrapMinMaxAction_0; }
		
		//"wrapminmax"
		public Keyword getWrapminmaxKeyword_1() { return cWrapminmaxKeyword_1; }
		
		//items+=Line*
		public Assignment getItemsAssignment_2() { return cItemsAssignment_2; }
		
		//Line
		public RuleCall getItemsLineParserRuleCall_2_0() { return cItemsLineParserRuleCall_2_0; }
	}
	public class TestIndentationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.TestIndentation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestIndentationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIndentationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cItemsAlternatives_3_0 = (Alternatives)cItemsAssignment_3.eContents().get(0);
		private final RuleCall cItemsLineParserRuleCall_3_0_0 = (RuleCall)cItemsAlternatives_3_0.eContents().get(0);
		private final RuleCall cItemsTestIndentationParserRuleCall_3_0_1 = (RuleCall)cItemsAlternatives_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSemiAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cSemiSemicolonKeyword_5_0 = (Keyword)cSemiAssignment_5.eContents().get(0);
		
		//TestIndentation:
		//    {TestIndentation} "indentation" "{" items+=(Line | TestIndentation)* "}" semi?=";"?;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestIndentation} "indentation" "{" items+=(Line | TestIndentation)* "}" semi?=";"?
		public Group getGroup() { return cGroup; }
		
		//{TestIndentation}
		public Action getTestIndentationAction_0() { return cTestIndentationAction_0; }
		
		//"indentation"
		public Keyword getIndentationKeyword_1() { return cIndentationKeyword_1; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//items+=(Line | TestIndentation)*
		public Assignment getItemsAssignment_3() { return cItemsAssignment_3; }
		
		//(Line | TestIndentation)
		public Alternatives getItemsAlternatives_3_0() { return cItemsAlternatives_3_0; }
		
		//Line
		public RuleCall getItemsLineParserRuleCall_3_0_0() { return cItemsLineParserRuleCall_3_0_0; }
		
		//TestIndentation
		public RuleCall getItemsTestIndentationParserRuleCall_3_0_1() { return cItemsTestIndentationParserRuleCall_3_0_1; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//semi?=";"?
		public Assignment getSemiAssignment_5() { return cSemiAssignment_5; }
		
		//";"
		public Keyword getSemiSemicolonKeyword_5_0() { return cSemiSemicolonKeyword_5_0; }
	}
	public class FqnObjElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.FqnObj");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFqnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//FqnObj:
		//    "fqn" name=FQN;
		@Override public ParserRule getRule() { return rule; }
		
		//"fqn" name=FQN
		public Group getGroup() { return cGroup; }
		
		//"fqn"
		public Keyword getFqnKeyword_0() { return cFqnKeyword_0; }
		
		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//    ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ("." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class FqnRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.FqnRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFqnrefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefFqnObjCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefFqnObjFQNParserRuleCall_1_0_1 = (RuleCall)cRefFqnObjCrossReference_1_0.eContents().get(1);
		
		//FqnRef:
		//    "fqnref" ref=[FqnObj|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//"fqnref" ref=[FqnObj|FQN]
		public Group getGroup() { return cGroup; }
		
		//"fqnref"
		public Keyword getFqnrefKeyword_0() { return cFqnrefKeyword_0; }
		
		//ref=[FqnObj|FQN]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[FqnObj|FQN]
		public CrossReference getRefFqnObjCrossReference_1_0() { return cRefFqnObjCrossReference_1_0; }
		
		//FQN
		public RuleCall getRefFqnObjFQNParserRuleCall_1_0_1() { return cRefFqnObjFQNParserRuleCall_1_0_1; }
	}
	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValEnum1EnumRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValEnum1EnumRuleCall_2_1_0 = (RuleCall)cValAssignment_2_1.eContents().get(0);
		
		//Enumeration:
		//    "enum" val+=Enum1+ (',' val+=Enum1)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"enum" val+=Enum1+ (',' val+=Enum1)*
		public Group getGroup() { return cGroup; }
		
		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//val+=Enum1+
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//Enum1
		public RuleCall getValEnum1EnumRuleCall_1_0() { return cValEnum1EnumRuleCall_1_0; }
		
		//(',' val+=Enum1)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//val+=Enum1
		public Assignment getValAssignment_2_1() { return cValAssignment_2_1; }
		
		//Enum1
		public RuleCall getValEnum1EnumRuleCall_2_1_0() { return cValEnum1EnumRuleCall_2_1_0; }
	}
	public class SuppressedHiddenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHidden");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSuppressedHiddenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGraveAccentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cValsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cValsSuppressedHiddenSubParserRuleCall_2_0_0 = (RuleCall)cValsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cPercentSignKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cValsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValsSuppressedHiddenSubParserRuleCall_2_1_1_0 = (RuleCall)cValsAssignment_2_1_1.eContents().get(0);
		private final Keyword cGraveAccentKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SuppressedHidden hidden():
		//    {SuppressedHidden} "`" (vals+=SuppressedHiddenSub ('%' vals+=SuppressedHiddenSub)*)? "`";
		@Override public ParserRule getRule() { return rule; }
		
		//{SuppressedHidden} "`" (vals+=SuppressedHiddenSub ('%' vals+=SuppressedHiddenSub)*)? "`"
		public Group getGroup() { return cGroup; }
		
		//{SuppressedHidden}
		public Action getSuppressedHiddenAction_0() { return cSuppressedHiddenAction_0; }
		
		//"`"
		public Keyword getGraveAccentKeyword_1() { return cGraveAccentKeyword_1; }
		
		//(vals+=SuppressedHiddenSub ('%' vals+=SuppressedHiddenSub)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//vals+=SuppressedHiddenSub
		public Assignment getValsAssignment_2_0() { return cValsAssignment_2_0; }
		
		//SuppressedHiddenSub
		public RuleCall getValsSuppressedHiddenSubParserRuleCall_2_0_0() { return cValsSuppressedHiddenSubParserRuleCall_2_0_0; }
		
		//('%' vals+=SuppressedHiddenSub)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'%'
		public Keyword getPercentSignKeyword_2_1_0() { return cPercentSignKeyword_2_1_0; }
		
		//vals+=SuppressedHiddenSub
		public Assignment getValsAssignment_2_1_1() { return cValsAssignment_2_1_1; }
		
		//SuppressedHiddenSub
		public RuleCall getValsSuppressedHiddenSubParserRuleCall_2_1_1_0() { return cValsSuppressedHiddenSubParserRuleCall_2_1_1_0; }
		
		//"`"
		public Keyword getGraveAccentKeyword_3() { return cGraveAccentKeyword_3; }
	}
	public class SuppressedHiddenSubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSub");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSuppressedHiddenSubSubParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSuppressedHiddenSubIDParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SuppressedHiddenSub:
		//    SuppressedHiddenSubSub | SuppressedHiddenSubID;
		@Override public ParserRule getRule() { return rule; }
		
		//SuppressedHiddenSubSub | SuppressedHiddenSubID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SuppressedHiddenSubSub
		public RuleCall getSuppressedHiddenSubSubParserRuleCall_0() { return cSuppressedHiddenSubSubParserRuleCall_0; }
		
		//SuppressedHiddenSubID
		public RuleCall getSuppressedHiddenSubIDParserRuleCall_1() { return cSuppressedHiddenSubIDParserRuleCall_1; }
	}
	public class SuppressedHiddenSubSubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSubSub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdvalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdvalIDTerminalRuleCall_1_0 = (RuleCall)cIdvalAssignment_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SuppressedHiddenSubSub hidden(WS):
		//    '<' idval=ID '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<' idval=ID '>'
		public Group getGroup() { return cGroup; }
		
		//'<'
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }
		
		//idval=ID
		public Assignment getIdvalAssignment_1() { return cIdvalAssignment_1; }
		
		//ID
		public RuleCall getIdvalIDTerminalRuleCall_1_0() { return cIdvalIDTerminalRuleCall_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_2() { return cGreaterThanSignKeyword_2; }
	}
	public class SuppressedHiddenSubIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSubID");
		private final Assignment cIdvalAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdvalIDTerminalRuleCall_0 = (RuleCall)cIdvalAssignment.eContents().get(0);
		
		//SuppressedHiddenSubID:
		//    idval=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//idval=ID
		public Assignment getIdvalAssignment() { return cIdvalAssignment; }
		
		//ID
		public RuleCall getIdvalIDTerminalRuleCall_0() { return cIdvalIDTerminalRuleCall_0; }
	}
	public class Datatype1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype1");
		private final RuleCall cFQNParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Datatype1: FQN;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN
		public RuleCall getFQNParserRuleCall() { return cFQNParserRuleCall; }
	}
	public class Datatype2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype2");
		private final RuleCall cFQNParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Datatype2: FQN;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN
		public RuleCall getFQNParserRuleCall() { return cFQNParserRuleCall; }
	}
	public class Datatype3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype3");
		private final RuleCall cFQNParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Datatype3: FQN;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN
		public RuleCall getFQNParserRuleCall() { return cFQNParserRuleCall; }
	}
	public class DatatypesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatypes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1Datatype1ParserRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2Datatype2ParserRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		private final Assignment cVal3Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVal3Datatype3ParserRuleCall_4_0 = (RuleCall)cVal3Assignment_4.eContents().get(0);
		private final Keyword cKw3Keyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Datatypes: "datatypes" val1=Datatype1 "kw1" val2=Datatype2 val3=Datatype3 "kw3";
		@Override public ParserRule getRule() { return rule; }
		
		//"datatypes" val1=Datatype1 "kw1" val2=Datatype2 val3=Datatype3 "kw3"
		public Group getGroup() { return cGroup; }
		
		//"datatypes"
		public Keyword getDatatypesKeyword_0() { return cDatatypesKeyword_0; }
		
		//val1=Datatype1
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//Datatype1
		public RuleCall getVal1Datatype1ParserRuleCall_1_0() { return cVal1Datatype1ParserRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//val2=Datatype2
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//Datatype2
		public RuleCall getVal2Datatype2ParserRuleCall_3_0() { return cVal2Datatype2ParserRuleCall_3_0; }
		
		//val3=Datatype3
		public Assignment getVal3Assignment_4() { return cVal3Assignment_4; }
		
		//Datatype3
		public RuleCall getVal3Datatype3ParserRuleCall_4_0() { return cVal3Datatype3ParserRuleCall_4_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_5() { return cKw3Keyword_5; }
	}
	public class WrappingDataTypeTestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.WrappingDataTypeTest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWrappingdtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDatatypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDatatypeWrappingDataTypeParserRuleCall_1_0 = (RuleCall)cDatatypeAssignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//WrappingDataTypeTest:
		//    "wrappingdt" datatype=WrappingDataType "kw1";
		@Override public ParserRule getRule() { return rule; }
		
		//"wrappingdt" datatype=WrappingDataType "kw1"
		public Group getGroup() { return cGroup; }
		
		//"wrappingdt"
		public Keyword getWrappingdtKeyword_0() { return cWrappingdtKeyword_0; }
		
		//datatype=WrappingDataType
		public Assignment getDatatypeAssignment_1() { return cDatatypeAssignment_1; }
		
		//WrappingDataType
		public RuleCall getDatatypeWrappingDataTypeParserRuleCall_1_0() { return cDatatypeWrappingDataTypeParserRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
	}
	public class WrappingDataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.WrappingDataType");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//WrappingDataType:
		//    ID+;
		@Override public ParserRule getRule() { return rule; }
		
		//ID+
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	public class Enum1Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enum1");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLit1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLit1Lit1Keyword_0_0 = (Keyword)cLit1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLit2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLit2Lit2Keyword_1_0 = (Keyword)cLit2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLit3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLit3Lit3Keyword_2_0 = (Keyword)cLit3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Enum1:
		//    lit1 | lit2 | lit3;
		public EnumRule getRule() { return rule; }
		
		//lit1 | lit2 | lit3
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//lit1
		public EnumLiteralDeclaration getLit1EnumLiteralDeclaration_0() { return cLit1EnumLiteralDeclaration_0; }
		
		public Keyword getLit1Lit1Keyword_0_0() { return cLit1Lit1Keyword_0_0; }
		
		//lit2
		public EnumLiteralDeclaration getLit2EnumLiteralDeclaration_1() { return cLit2EnumLiteralDeclaration_1; }
		
		public Keyword getLit2Lit2Keyword_1_0() { return cLit2Lit2Keyword_1_0; }
		
		//lit3
		public EnumLiteralDeclaration getLit3EnumLiteralDeclaration_2() { return cLit3EnumLiteralDeclaration_2; }
		
		public Keyword getLit3Lit3Keyword_2_0() { return cLit3Lit3Keyword_2_0; }
	}
	
	private final RootElements pRoot;
	private final LineElements pLine;
	private final DeclElements pDecl;
	private final AssignElements pAssign;
	private final MethElements pMeth;
	private final ParamElements pParam;
	private final SpaceElements pSpace;
	private final TestLinewrapElements pTestLinewrap;
	private final TestLinewrapMinMaxElements pTestLinewrapMinMax;
	private final TestIndentationElements pTestIndentation;
	private final FqnObjElements pFqnObj;
	private final FQNElements pFQN;
	private final FqnRefElements pFqnRef;
	private final EnumerationElements pEnumeration;
	private final Enum1Elements eEnum1;
	private final SuppressedHiddenElements pSuppressedHidden;
	private final SuppressedHiddenSubElements pSuppressedHiddenSub;
	private final SuppressedHiddenSubSubElements pSuppressedHiddenSubSub;
	private final SuppressedHiddenSubIDElements pSuppressedHiddenSubID;
	private final Datatype1Elements pDatatype1;
	private final Datatype2Elements pDatatype2;
	private final Datatype3Elements pDatatype3;
	private final DatatypesElements pDatatypes;
	private final WrappingDataTypeTestElements pWrappingDataTypeTest;
	private final WrappingDataTypeElements pWrappingDataType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FormatterTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pLine = new LineElements();
		this.pDecl = new DeclElements();
		this.pAssign = new AssignElements();
		this.pMeth = new MethElements();
		this.pParam = new ParamElements();
		this.pSpace = new SpaceElements();
		this.pTestLinewrap = new TestLinewrapElements();
		this.pTestLinewrapMinMax = new TestLinewrapMinMaxElements();
		this.pTestIndentation = new TestIndentationElements();
		this.pFqnObj = new FqnObjElements();
		this.pFQN = new FQNElements();
		this.pFqnRef = new FqnRefElements();
		this.pEnumeration = new EnumerationElements();
		this.eEnum1 = new Enum1Elements();
		this.pSuppressedHidden = new SuppressedHiddenElements();
		this.pSuppressedHiddenSub = new SuppressedHiddenSubElements();
		this.pSuppressedHiddenSubSub = new SuppressedHiddenSubSubElements();
		this.pSuppressedHiddenSubID = new SuppressedHiddenSubIDElements();
		this.pDatatype1 = new Datatype1Elements();
		this.pDatatype2 = new Datatype2Elements();
		this.pDatatype3 = new Datatype3Elements();
		this.pDatatypes = new DatatypesElements();
		this.pWrappingDataTypeTest = new WrappingDataTypeTestElements();
		this.pWrappingDataType = new WrappingDataTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage".equals(grammar.getName())) {
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
	//    "test" (TestLinewrap | TestIndentation | TestLinewrapMinMax | WrappingDataTypeTest);
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Line:
	//    (Decl | Assign | Meth | FqnObj | FqnRef | Enumeration | SuppressedHidden "post" | Space | Datatypes) ";";
	public LineElements getLineAccess() {
		return pLine;
	}
	
	public ParserRule getLineRule() {
		return getLineAccess().getRule();
	}
	
	//Decl:
	//    type+=ID name+=ID;
	public DeclElements getDeclAccess() {
		return pDecl;
	}
	
	public ParserRule getDeclRule() {
		return getDeclAccess().getRule();
	}
	
	//Assign:
	//    var=ID op=("="|"+=") "[" (val+=INT ("," val+=INT)*)? "]";
	public AssignElements getAssignAccess() {
		return pAssign;
	}
	
	public ParserRule getAssignRule() {
		return getAssignAccess().getRule();
	}
	
	//Meth:
	//    "void" name=ID "(" (param+=Param ("," param+=Param)*)? ")";
	public MethElements getMethAccess() {
		return pMeth;
	}
	
	public ParserRule getMethRule() {
		return getMethAccess().getRule();
	}
	
	//Param:
	//    name+=ID ":" type+=ID;
	public ParamElements getParamAccess() {
		return pParam;
	}
	
	public ParserRule getParamRule() {
		return getParamAccess().getRule();
	}
	
	//Space: "space" val=ID;
	public SpaceElements getSpaceAccess() {
		return pSpace;
	}
	
	public ParserRule getSpaceRule() {
		return getSpaceAccess().getRule();
	}
	
	//TestLinewrap:
	//    {TestLinewrap} "linewrap" items+=Line*;
	public TestLinewrapElements getTestLinewrapAccess() {
		return pTestLinewrap;
	}
	
	public ParserRule getTestLinewrapRule() {
		return getTestLinewrapAccess().getRule();
	}
	
	//TestLinewrapMinMax:
	//    {TestLinewrapMinMax} "wrapminmax" items+=Line*;
	public TestLinewrapMinMaxElements getTestLinewrapMinMaxAccess() {
		return pTestLinewrapMinMax;
	}
	
	public ParserRule getTestLinewrapMinMaxRule() {
		return getTestLinewrapMinMaxAccess().getRule();
	}
	
	//TestIndentation:
	//    {TestIndentation} "indentation" "{" items+=(Line | TestIndentation)* "}" semi?=";"?;
	public TestIndentationElements getTestIndentationAccess() {
		return pTestIndentation;
	}
	
	public ParserRule getTestIndentationRule() {
		return getTestIndentationAccess().getRule();
	}
	
	//FqnObj:
	//    "fqn" name=FQN;
	public FqnObjElements getFqnObjAccess() {
		return pFqnObj;
	}
	
	public ParserRule getFqnObjRule() {
		return getFqnObjAccess().getRule();
	}
	
	//FQN:
	//    ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FqnRef:
	//    "fqnref" ref=[FqnObj|FQN];
	public FqnRefElements getFqnRefAccess() {
		return pFqnRef;
	}
	
	public ParserRule getFqnRefRule() {
		return getFqnRefAccess().getRule();
	}
	
	//Enumeration:
	//    "enum" val+=Enum1+ (',' val+=Enum1)*;
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}
	
	//enum Enum1:
	//    lit1 | lit2 | lit3;
	public Enum1Elements getEnum1Access() {
		return eEnum1;
	}
	
	public EnumRule getEnum1Rule() {
		return getEnum1Access().getRule();
	}
	
	//SuppressedHidden hidden():
	//    {SuppressedHidden} "`" (vals+=SuppressedHiddenSub ('%' vals+=SuppressedHiddenSub)*)? "`";
	public SuppressedHiddenElements getSuppressedHiddenAccess() {
		return pSuppressedHidden;
	}
	
	public ParserRule getSuppressedHiddenRule() {
		return getSuppressedHiddenAccess().getRule();
	}
	
	//SuppressedHiddenSub:
	//    SuppressedHiddenSubSub | SuppressedHiddenSubID;
	public SuppressedHiddenSubElements getSuppressedHiddenSubAccess() {
		return pSuppressedHiddenSub;
	}
	
	public ParserRule getSuppressedHiddenSubRule() {
		return getSuppressedHiddenSubAccess().getRule();
	}
	
	//SuppressedHiddenSubSub hidden(WS):
	//    '<' idval=ID '>';
	public SuppressedHiddenSubSubElements getSuppressedHiddenSubSubAccess() {
		return pSuppressedHiddenSubSub;
	}
	
	public ParserRule getSuppressedHiddenSubSubRule() {
		return getSuppressedHiddenSubSubAccess().getRule();
	}
	
	//SuppressedHiddenSubID:
	//    idval=ID;
	public SuppressedHiddenSubIDElements getSuppressedHiddenSubIDAccess() {
		return pSuppressedHiddenSubID;
	}
	
	public ParserRule getSuppressedHiddenSubIDRule() {
		return getSuppressedHiddenSubIDAccess().getRule();
	}
	
	//Datatype1: FQN;
	public Datatype1Elements getDatatype1Access() {
		return pDatatype1;
	}
	
	public ParserRule getDatatype1Rule() {
		return getDatatype1Access().getRule();
	}
	
	//Datatype2: FQN;
	public Datatype2Elements getDatatype2Access() {
		return pDatatype2;
	}
	
	public ParserRule getDatatype2Rule() {
		return getDatatype2Access().getRule();
	}
	
	//Datatype3: FQN;
	public Datatype3Elements getDatatype3Access() {
		return pDatatype3;
	}
	
	public ParserRule getDatatype3Rule() {
		return getDatatype3Access().getRule();
	}
	
	//Datatypes: "datatypes" val1=Datatype1 "kw1" val2=Datatype2 val3=Datatype3 "kw3";
	public DatatypesElements getDatatypesAccess() {
		return pDatatypes;
	}
	
	public ParserRule getDatatypesRule() {
		return getDatatypesAccess().getRule();
	}
	
	//WrappingDataTypeTest:
	//    "wrappingdt" datatype=WrappingDataType "kw1";
	public WrappingDataTypeTestElements getWrappingDataTypeTestAccess() {
		return pWrappingDataTypeTest;
	}
	
	public ParserRule getWrappingDataTypeTestRule() {
		return getWrappingDataTypeTestAccess().getRule();
	}
	
	//WrappingDataType:
	//    ID+;
	public WrappingDataTypeElements getWrappingDataTypeAccess() {
		return pWrappingDataType;
	}
	
	public ParserRule getWrappingDataTypeRule() {
		return getWrappingDataTypeAccess().getRule();
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
