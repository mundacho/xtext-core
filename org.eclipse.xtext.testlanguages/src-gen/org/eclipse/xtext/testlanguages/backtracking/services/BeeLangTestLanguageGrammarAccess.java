/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.backtracking.services;

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
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BeeLangTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cUnitsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cUnitsUnitParserRuleCall_0_0 = (RuleCall)cUnitsAssignment_0.eContents().get(0);
		private final Assignment cFunctionsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFunctionsFunctionParserRuleCall_1_0 = (RuleCall)cFunctionsAssignment_1.eContents().get(0);
		
		//// Initially copied from BeeLang.xtext rev 1029
		//Model:
		//      (units += Unit)*
		//    | (functions += Function)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//  (units += Unit)*
		//| (functions += Function)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(units += Unit)*
		public Assignment getUnitsAssignment_0() { return cUnitsAssignment_0; }
		
		//Unit
		public RuleCall getUnitsUnitParserRuleCall_0_0() { return cUnitsUnitParserRuleCall_0_0; }
		
		//(functions += Function)*
		public Assignment getFunctionsAssignment_1() { return cFunctionsAssignment_1; }
		
		//Function
		public RuleCall getFunctionsFunctionParserRuleCall_1_0() { return cFunctionsFunctionParserRuleCall_1_0; }
	}
	public class UnitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Unit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnitAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDocumentationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDocumentationDOCUMENTATIONTerminalRuleCall_1_0 = (RuleCall)cDocumentationAssignment_1.eContents().get(0);
		private final Keyword cUnitKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cVersionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cVersionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cVersionIDTerminalRuleCall_4_1_0 = (RuleCall)cVersionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cImplementsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cImplementsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cImplementsSimpleTypeRefParserRuleCall_5_1_0 = (RuleCall)cImplementsAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cImplementsAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cImplementsSimpleTypeRefParserRuleCall_5_2_1_0 = (RuleCall)cImplementsAssignment_5_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cSourceKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Keyword cColonKeyword_7_0_1 = (Keyword)cGroup_7_0.eContents().get(1);
		private final Assignment cSourceLocationAssignment_7_0_2 = (Assignment)cGroup_7_0.eContents().get(2);
		private final RuleCall cSourceLocationPathParserRuleCall_7_0_2_0 = (RuleCall)cSourceLocationAssignment_7_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_0_3 = (Keyword)cGroup_7_0.eContents().get(3);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cOutputKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Keyword cColonKeyword_7_1_1 = (Keyword)cGroup_7_1.eContents().get(1);
		private final Assignment cOutputLocationAssignment_7_1_2 = (Assignment)cGroup_7_1.eContents().get(2);
		private final RuleCall cOutputLocationPathParserRuleCall_7_1_2_0 = (RuleCall)cOutputLocationAssignment_7_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_1_3 = (Keyword)cGroup_7_1.eContents().get(3);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cProvidesKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Keyword cColonKeyword_7_2_1 = (Keyword)cGroup_7_2.eContents().get(1);
		private final Assignment cProvidedCapabilitiesAssignment_7_2_2 = (Assignment)cGroup_7_2.eContents().get(2);
		private final RuleCall cProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0 = (RuleCall)cProvidedCapabilitiesAssignment_7_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_2_3 = (Keyword)cGroup_7_2.eContents().get(3);
		private final Group cGroup_7_3 = (Group)cUnorderedGroup_7.eContents().get(3);
		private final Keyword cRequiresKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Keyword cColonKeyword_7_3_1 = (Keyword)cGroup_7_3.eContents().get(1);
		private final Assignment cRequiredCapabilitiesAssignment_7_3_2 = (Assignment)cGroup_7_3.eContents().get(2);
		private final RuleCall cRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0 = (RuleCall)cRequiredCapabilitiesAssignment_7_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_3_3 = (Keyword)cGroup_7_3.eContents().get(3);
		private final Group cGroup_7_4 = (Group)cUnorderedGroup_7.eContents().get(4);
		private final Keyword cRequiresKeyword_7_4_0 = (Keyword)cGroup_7_4.eContents().get(0);
		private final Keyword cEnvKeyword_7_4_1 = (Keyword)cGroup_7_4.eContents().get(1);
		private final Keyword cColonKeyword_7_4_2 = (Keyword)cGroup_7_4.eContents().get(2);
		private final Assignment cMetaRequiredCapabilitiesAssignment_7_4_3 = (Assignment)cGroup_7_4.eContents().get(3);
		private final RuleCall cMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0 = (RuleCall)cMetaRequiredCapabilitiesAssignment_7_4_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_4_4 = (Keyword)cGroup_7_4.eContents().get(4);
		private final Assignment cFunctionsAssignment_7_5 = (Assignment)cUnorderedGroup_7.eContents().get(5);
		private final RuleCall cFunctionsFunctionParserRuleCall_7_5_0 = (RuleCall)cFunctionsAssignment_7_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Unit : {Unit}
		//    (documentation = DOCUMENTATION)?
		//    'unit' (name=ID)? ('version' version = ID)?
		//        ('implements' implements += SimpleTypeRef (',' implements+=SimpleTypeRef)*)?
		//    '{'
		//        ( ('source' ':' sourceLocation = Path ';')?
		//        & ('output' ':' outputLocation = Path ';')?
		//        & ('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
		//        & ('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
		//        & ('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
		//        & (functions += Function )*
		//        )
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Unit}
		//   (documentation = DOCUMENTATION)?
		//   'unit' (name=ID)? ('version' version = ID)?
		//       ('implements' implements += SimpleTypeRef (',' implements+=SimpleTypeRef)*)?
		//   '{'
		//       ( ('source' ':' sourceLocation = Path ';')?
		//       & ('output' ':' outputLocation = Path ';')?
		//       & ('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
		//       & ('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
		//       & ('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
		//       & (functions += Function )*
		//       )
		//   '}'
		public Group getGroup() { return cGroup; }
		
		//{Unit}
		public Action getUnitAction_0() { return cUnitAction_0; }
		
		//(documentation = DOCUMENTATION)?
		public Assignment getDocumentationAssignment_1() { return cDocumentationAssignment_1; }
		
		//DOCUMENTATION
		public RuleCall getDocumentationDOCUMENTATIONTerminalRuleCall_1_0() { return cDocumentationDOCUMENTATIONTerminalRuleCall_1_0; }
		
		//'unit'
		public Keyword getUnitKeyword_2() { return cUnitKeyword_2; }
		
		//(name=ID)?
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//('version' version = ID)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'version'
		public Keyword getVersionKeyword_4_0() { return cVersionKeyword_4_0; }
		
		//version = ID
		public Assignment getVersionAssignment_4_1() { return cVersionAssignment_4_1; }
		
		//ID
		public RuleCall getVersionIDTerminalRuleCall_4_1_0() { return cVersionIDTerminalRuleCall_4_1_0; }
		
		//('implements' implements += SimpleTypeRef (',' implements+=SimpleTypeRef)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'implements'
		public Keyword getImplementsKeyword_5_0() { return cImplementsKeyword_5_0; }
		
		//implements += SimpleTypeRef
		public Assignment getImplementsAssignment_5_1() { return cImplementsAssignment_5_1; }
		
		//SimpleTypeRef
		public RuleCall getImplementsSimpleTypeRefParserRuleCall_5_1_0() { return cImplementsSimpleTypeRefParserRuleCall_5_1_0; }
		
		//(',' implements+=SimpleTypeRef)*
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//','
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }
		
		//implements+=SimpleTypeRef
		public Assignment getImplementsAssignment_5_2_1() { return cImplementsAssignment_5_2_1; }
		
		//SimpleTypeRef
		public RuleCall getImplementsSimpleTypeRefParserRuleCall_5_2_1_0() { return cImplementsSimpleTypeRefParserRuleCall_5_2_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//( ('source' ':' sourceLocation = Path ';')?
		//& ('output' ':' outputLocation = Path ';')?
		//& ('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
		//& ('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
		//& ('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
		//& (functions += Function )*
		//)
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }
		
		//('source' ':' sourceLocation = Path ';')?
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'source'
		public Keyword getSourceKeyword_7_0_0() { return cSourceKeyword_7_0_0; }
		
		//':'
		public Keyword getColonKeyword_7_0_1() { return cColonKeyword_7_0_1; }
		
		//sourceLocation = Path
		public Assignment getSourceLocationAssignment_7_0_2() { return cSourceLocationAssignment_7_0_2; }
		
		//Path
		public RuleCall getSourceLocationPathParserRuleCall_7_0_2_0() { return cSourceLocationPathParserRuleCall_7_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_0_3() { return cSemicolonKeyword_7_0_3; }
		
		//('output' ':' outputLocation = Path ';')?
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//'output'
		public Keyword getOutputKeyword_7_1_0() { return cOutputKeyword_7_1_0; }
		
		//':'
		public Keyword getColonKeyword_7_1_1() { return cColonKeyword_7_1_1; }
		
		//outputLocation = Path
		public Assignment getOutputLocationAssignment_7_1_2() { return cOutputLocationAssignment_7_1_2; }
		
		//Path
		public RuleCall getOutputLocationPathParserRuleCall_7_1_2_0() { return cOutputLocationPathParserRuleCall_7_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_1_3() { return cSemicolonKeyword_7_1_3; }
		
		//('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'provides'
		public Keyword getProvidesKeyword_7_2_0() { return cProvidesKeyword_7_2_0; }
		
		//':'
		public Keyword getColonKeyword_7_2_1() { return cColonKeyword_7_2_1; }
		
		//(providedCapabilities += ProvidedCapability)
		public Assignment getProvidedCapabilitiesAssignment_7_2_2() { return cProvidedCapabilitiesAssignment_7_2_2; }
		
		//ProvidedCapability
		public RuleCall getProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0() { return cProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_2_3() { return cSemicolonKeyword_7_2_3; }
		
		//('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
		public Group getGroup_7_3() { return cGroup_7_3; }
		
		//'requires'
		public Keyword getRequiresKeyword_7_3_0() { return cRequiresKeyword_7_3_0; }
		
		//':'
		public Keyword getColonKeyword_7_3_1() { return cColonKeyword_7_3_1; }
		
		//(requiredCapabilities += AliasedRequiredCapability)
		public Assignment getRequiredCapabilitiesAssignment_7_3_2() { return cRequiredCapabilitiesAssignment_7_3_2; }
		
		//AliasedRequiredCapability
		public RuleCall getRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0() { return cRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_3_3() { return cSemicolonKeyword_7_3_3; }
		
		//('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
		public Group getGroup_7_4() { return cGroup_7_4; }
		
		//'requires'
		public Keyword getRequiresKeyword_7_4_0() { return cRequiresKeyword_7_4_0; }
		
		//'env'
		public Keyword getEnvKeyword_7_4_1() { return cEnvKeyword_7_4_1; }
		
		//':'
		public Keyword getColonKeyword_7_4_2() { return cColonKeyword_7_4_2; }
		
		//(metaRequiredCapabilities += RequiredCapability)
		public Assignment getMetaRequiredCapabilitiesAssignment_7_4_3() { return cMetaRequiredCapabilitiesAssignment_7_4_3; }
		
		//RequiredCapability
		public RuleCall getMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0() { return cMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_4_4() { return cSemicolonKeyword_7_4_4; }
		
		//(functions += Function )*
		public Assignment getFunctionsAssignment_7_5() { return cFunctionsAssignment_7_5; }
		
		//Function
		public RuleCall getFunctionsFunctionParserRuleCall_7_5_0() { return cFunctionsFunctionParserRuleCall_7_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class ProvidedCapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ProvidedCapability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProvidedCapabilityAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNameSpaceAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNameSpaceIDTerminalRuleCall_1_0_0 = (RuleCall)cNameSpaceAssignment_1_0.eContents().get(0);
		private final Keyword cUnitKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_2_1 = (UnorderedGroup)cGroup_2.eContents().get(1);
		private final Group cGroup_2_1_0 = (Group)cUnorderedGroup_2_1.eContents().get(0);
		private final Keyword cWhenKeyword_2_1_0_0 = (Keyword)cGroup_2_1_0.eContents().get(0);
		private final Keyword cColonKeyword_2_1_0_1 = (Keyword)cGroup_2_1_0.eContents().get(1);
		private final Assignment cCondExprAssignment_2_1_0_2 = (Assignment)cGroup_2_1_0.eContents().get(2);
		private final RuleCall cCondExprExpressionParserRuleCall_2_1_0_2_0 = (RuleCall)cCondExprAssignment_2_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_0_3 = (Keyword)cGroup_2_1_0.eContents().get(3);
		private final Group cGroup_2_1_1 = (Group)cUnorderedGroup_2_1.eContents().get(1);
		private final Keyword cNameKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Keyword cColonKeyword_2_1_1_1 = (Keyword)cGroup_2_1_1.eContents().get(1);
		private final Assignment cNameAssignment_2_1_1_2 = (Assignment)cGroup_2_1_1.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_1_1_2_0 = (RuleCall)cNameAssignment_2_1_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_1_3 = (Keyword)cGroup_2_1_1.eContents().get(3);
		private final Group cGroup_2_1_2 = (Group)cUnorderedGroup_2_1.eContents().get(2);
		private final Keyword cVersionKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1_2_1 = (Keyword)cGroup_2_1_2.eContents().get(1);
		private final Assignment cVersionAssignment_2_1_2_2 = (Assignment)cGroup_2_1_2.eContents().get(2);
		private final RuleCall cVersionIDTerminalRuleCall_2_1_2_2_0 = (RuleCall)cVersionAssignment_2_1_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_2_3 = (Keyword)cGroup_2_1_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//ProvidedCapability: {ProvidedCapability}
		//    ((nameSpace=ID) | "unit")
		//    ('{'
		//         (
		//           ('when' ':' condExpr = Expression ';')?
		//        & ("name" ':' name = ID ';')
		//        & ("version" ':' version = ID ';')?
		//        )
		//    '}')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ProvidedCapability}
		//   ((nameSpace=ID) | "unit")
		//   ('{'
		//        (
		//          ('when' ':' condExpr = Expression ';')?
		//       & ("name" ':' name = ID ';')
		//       & ("version" ':' version = ID ';')?
		//       )
		//   '}')?
		public Group getGroup() { return cGroup; }
		
		//{ProvidedCapability}
		public Action getProvidedCapabilityAction_0() { return cProvidedCapabilityAction_0; }
		
		//((nameSpace=ID) | "unit")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(nameSpace=ID)
		public Assignment getNameSpaceAssignment_1_0() { return cNameSpaceAssignment_1_0; }
		
		//ID
		public RuleCall getNameSpaceIDTerminalRuleCall_1_0_0() { return cNameSpaceIDTerminalRuleCall_1_0_0; }
		
		//"unit"
		public Keyword getUnitKeyword_1_1() { return cUnitKeyword_1_1; }
		
		//('{'
		//     (
		//       ('when' ':' condExpr = Expression ';')?
		//    & ("name" ':' name = ID ';')
		//    & ("version" ':' version = ID ';')?
		//    )
		//'}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		// (
		//   ('when' ':' condExpr = Expression ';')?
		//& ("name" ':' name = ID ';')
		//& ("version" ':' version = ID ';')?
		//)
		public UnorderedGroup getUnorderedGroup_2_1() { return cUnorderedGroup_2_1; }
		
		//('when' ':' condExpr = Expression ';')?
		public Group getGroup_2_1_0() { return cGroup_2_1_0; }
		
		//'when'
		public Keyword getWhenKeyword_2_1_0_0() { return cWhenKeyword_2_1_0_0; }
		
		//':'
		public Keyword getColonKeyword_2_1_0_1() { return cColonKeyword_2_1_0_1; }
		
		//condExpr = Expression
		public Assignment getCondExprAssignment_2_1_0_2() { return cCondExprAssignment_2_1_0_2; }
		
		//Expression
		public RuleCall getCondExprExpressionParserRuleCall_2_1_0_2_0() { return cCondExprExpressionParserRuleCall_2_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_0_3() { return cSemicolonKeyword_2_1_0_3; }
		
		//("name" ':' name = ID ';')
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }
		
		//"name"
		public Keyword getNameKeyword_2_1_1_0() { return cNameKeyword_2_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_2_1_1_1() { return cColonKeyword_2_1_1_1; }
		
		//name = ID
		public Assignment getNameAssignment_2_1_1_2() { return cNameAssignment_2_1_1_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_1_1_2_0() { return cNameIDTerminalRuleCall_2_1_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_1_3() { return cSemicolonKeyword_2_1_1_3; }
		
		//("version" ':' version = ID ';')?
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }
		
		//"version"
		public Keyword getVersionKeyword_2_1_2_0() { return cVersionKeyword_2_1_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_1_2_1() { return cColonKeyword_2_1_2_1; }
		
		//version = ID
		public Assignment getVersionAssignment_2_1_2_2() { return cVersionAssignment_2_1_2_2; }
		
		//ID
		public RuleCall getVersionIDTerminalRuleCall_2_1_2_2_0() { return cVersionIDTerminalRuleCall_2_1_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_2_3() { return cSemicolonKeyword_2_1_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_2() { return cRightCurlyBracketKeyword_2_2; }
	}
	public class AliasedRequiredCapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AliasedRequiredCapability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cNameSpaceAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cNameSpaceIDTerminalRuleCall_0_0_0 = (RuleCall)cNameSpaceAssignment_0_0.eContents().get(0);
		private final Keyword cUnitKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_3_1 = (UnorderedGroup)cGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cUnorderedGroup_3_1.eContents().get(0);
		private final Keyword cWhenKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cCondExprAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cCondExprExpressionParserRuleCall_3_1_0_2_0 = (RuleCall)cCondExprAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Group cGroup_3_1_1 = (Group)cUnorderedGroup_3_1.eContents().get(1);
		private final Assignment cGreedyAssignment_3_1_1_0 = (Assignment)cGroup_3_1_1.eContents().get(0);
		private final Keyword cGreedyGreedyKeyword_3_1_1_0_0 = (Keyword)cGreedyAssignment_3_1_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_1_1 = (Keyword)cGroup_3_1_1.eContents().get(1);
		private final Group cGroup_3_1_2 = (Group)cUnorderedGroup_3_1.eContents().get(2);
		private final Keyword cRequiresMinKeyword_3_1_2_0 = (Keyword)cGroup_3_1_2.eContents().get(0);
		private final Keyword cColonKeyword_3_1_2_1 = (Keyword)cGroup_3_1_2.eContents().get(1);
		private final Assignment cMinAssignment_3_1_2_2 = (Assignment)cGroup_3_1_2.eContents().get(2);
		private final RuleCall cMinINTTerminalRuleCall_3_1_2_2_0 = (RuleCall)cMinAssignment_3_1_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_2_3 = (Keyword)cGroup_3_1_2.eContents().get(3);
		private final Group cGroup_3_1_3 = (Group)cUnorderedGroup_3_1.eContents().get(3);
		private final Keyword cRequiresMaxKeyword_3_1_3_0 = (Keyword)cGroup_3_1_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1_3_1 = (Keyword)cGroup_3_1_3.eContents().get(1);
		private final Assignment cMaxAssignment_3_1_3_2 = (Assignment)cGroup_3_1_3.eContents().get(2);
		private final RuleCall cMaxINTTerminalRuleCall_3_1_3_2_0 = (RuleCall)cMaxAssignment_3_1_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3_3 = (Keyword)cGroup_3_1_3.eContents().get(3);
		private final Group cGroup_3_1_4 = (Group)cUnorderedGroup_3_1.eContents().get(4);
		private final Keyword cVersionKeyword_3_1_4_0 = (Keyword)cGroup_3_1_4.eContents().get(0);
		private final Keyword cColonKeyword_3_1_4_1 = (Keyword)cGroup_3_1_4.eContents().get(1);
		private final Assignment cVersionRangeAssignment_3_1_4_2 = (Assignment)cGroup_3_1_4.eContents().get(2);
		private final RuleCall cVersionRangeIDTerminalRuleCall_3_1_4_2_0 = (RuleCall)cVersionRangeAssignment_3_1_4_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_4_3 = (Keyword)cGroup_3_1_4.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//AliasedRequiredCapability:
		//    ((nameSpace=ID) | "unit") name=ID ("as" alias = ID)?
		//    ('{'
		//        ( ('when' ':' condExpr=Expression ';')?
		//        & (greedy ?= "greedy" ';')?
		//        & ("requires-min" ':' min = INT ';' )?
		//        & ("requires-max" ':' max  = INT ';')?
		//        & ("version" ':' versionRange = ID ';')?
		//          )
		//    '}')
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//((nameSpace=ID) | "unit") name=ID ("as" alias = ID)?
		//('{'
		//    ( ('when' ':' condExpr=Expression ';')?
		//    & (greedy ?= "greedy" ';')?
		//    & ("requires-min" ':' min = INT ';' )?
		//    & ("requires-max" ':' max  = INT ';')?
		//    & ("version" ':' versionRange = ID ';')?
		//      )
		//'}')
		public Group getGroup() { return cGroup; }
		
		//((nameSpace=ID) | "unit")
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//(nameSpace=ID)
		public Assignment getNameSpaceAssignment_0_0() { return cNameSpaceAssignment_0_0; }
		
		//ID
		public RuleCall getNameSpaceIDTerminalRuleCall_0_0_0() { return cNameSpaceIDTerminalRuleCall_0_0_0; }
		
		//"unit"
		public Keyword getUnitKeyword_0_1() { return cUnitKeyword_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//("as" alias = ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"as"
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//alias = ID
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_2_1_0() { return cAliasIDTerminalRuleCall_2_1_0; }
		
		//('{'
		//    ( ('when' ':' condExpr=Expression ';')?
		//    & (greedy ?= "greedy" ';')?
		//    & ("requires-min" ':' min = INT ';' )?
		//    & ("requires-max" ':' max  = INT ';')?
		//    & ("version" ':' versionRange = ID ';')?
		//      )
		//'}')
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//( ('when' ':' condExpr=Expression ';')?
		//& (greedy ?= "greedy" ';')?
		//& ("requires-min" ':' min = INT ';' )?
		//& ("requires-max" ':' max  = INT ';')?
		//& ("version" ':' versionRange = ID ';')?
		//  )
		public UnorderedGroup getUnorderedGroup_3_1() { return cUnorderedGroup_3_1; }
		
		//('when' ':' condExpr=Expression ';')?
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'when'
		public Keyword getWhenKeyword_3_1_0_0() { return cWhenKeyword_3_1_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_0_1() { return cColonKeyword_3_1_0_1; }
		
		//condExpr=Expression
		public Assignment getCondExprAssignment_3_1_0_2() { return cCondExprAssignment_3_1_0_2; }
		
		//Expression
		public RuleCall getCondExprExpressionParserRuleCall_3_1_0_2_0() { return cCondExprExpressionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//(greedy ?= "greedy" ';')?
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }
		
		//greedy ?= "greedy"
		public Assignment getGreedyAssignment_3_1_1_0() { return cGreedyAssignment_3_1_1_0; }
		
		//"greedy"
		public Keyword getGreedyGreedyKeyword_3_1_1_0_0() { return cGreedyGreedyKeyword_3_1_1_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_1_1() { return cSemicolonKeyword_3_1_1_1; }
		
		//("requires-min" ':' min = INT ';' )?
		public Group getGroup_3_1_2() { return cGroup_3_1_2; }
		
		//"requires-min"
		public Keyword getRequiresMinKeyword_3_1_2_0() { return cRequiresMinKeyword_3_1_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_2_1() { return cColonKeyword_3_1_2_1; }
		
		//min = INT
		public Assignment getMinAssignment_3_1_2_2() { return cMinAssignment_3_1_2_2; }
		
		//INT
		public RuleCall getMinINTTerminalRuleCall_3_1_2_2_0() { return cMinINTTerminalRuleCall_3_1_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_2_3() { return cSemicolonKeyword_3_1_2_3; }
		
		//("requires-max" ':' max  = INT ';')?
		public Group getGroup_3_1_3() { return cGroup_3_1_3; }
		
		//"requires-max"
		public Keyword getRequiresMaxKeyword_3_1_3_0() { return cRequiresMaxKeyword_3_1_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_3_1() { return cColonKeyword_3_1_3_1; }
		
		//max  = INT
		public Assignment getMaxAssignment_3_1_3_2() { return cMaxAssignment_3_1_3_2; }
		
		//INT
		public RuleCall getMaxINTTerminalRuleCall_3_1_3_2_0() { return cMaxINTTerminalRuleCall_3_1_3_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3_3() { return cSemicolonKeyword_3_1_3_3; }
		
		//("version" ':' versionRange = ID ';')?
		public Group getGroup_3_1_4() { return cGroup_3_1_4; }
		
		//"version"
		public Keyword getVersionKeyword_3_1_4_0() { return cVersionKeyword_3_1_4_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_4_1() { return cColonKeyword_3_1_4_1; }
		
		//versionRange = ID
		public Assignment getVersionRangeAssignment_3_1_4_2() { return cVersionRangeAssignment_3_1_4_2; }
		
		//ID
		public RuleCall getVersionRangeIDTerminalRuleCall_3_1_4_2_0() { return cVersionRangeIDTerminalRuleCall_3_1_4_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4_3() { return cSemicolonKeyword_3_1_4_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }
	}
	public class RequiredCapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RequiredCapability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRequiredCapabilityAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNameSpaceAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNameSpaceIDTerminalRuleCall_1_0_0 = (RuleCall)cNameSpaceAssignment_1_0.eContents().get(0);
		private final Keyword cUnitKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_3_1 = (UnorderedGroup)cGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cUnorderedGroup_3_1.eContents().get(0);
		private final Keyword cWhenKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cCondExprAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cCondExprExpressionParserRuleCall_3_1_0_2_0 = (RuleCall)cCondExprAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Group cGroup_3_1_1 = (Group)cUnorderedGroup_3_1.eContents().get(1);
		private final Assignment cGreedyAssignment_3_1_1_0 = (Assignment)cGroup_3_1_1.eContents().get(0);
		private final Keyword cGreedyGreedyKeyword_3_1_1_0_0 = (Keyword)cGreedyAssignment_3_1_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_1_1 = (Keyword)cGroup_3_1_1.eContents().get(1);
		private final Group cGroup_3_1_2 = (Group)cUnorderedGroup_3_1.eContents().get(2);
		private final Keyword cRequiresMinKeyword_3_1_2_0 = (Keyword)cGroup_3_1_2.eContents().get(0);
		private final Keyword cColonKeyword_3_1_2_1 = (Keyword)cGroup_3_1_2.eContents().get(1);
		private final Assignment cMinAssignment_3_1_2_2 = (Assignment)cGroup_3_1_2.eContents().get(2);
		private final RuleCall cMinINTTerminalRuleCall_3_1_2_2_0 = (RuleCall)cMinAssignment_3_1_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_2_3 = (Keyword)cGroup_3_1_2.eContents().get(3);
		private final Group cGroup_3_1_3 = (Group)cUnorderedGroup_3_1.eContents().get(3);
		private final Keyword cRequiresMaxKeyword_3_1_3_0 = (Keyword)cGroup_3_1_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1_3_1 = (Keyword)cGroup_3_1_3.eContents().get(1);
		private final Assignment cMaxAssignment_3_1_3_2 = (Assignment)cGroup_3_1_3.eContents().get(2);
		private final RuleCall cMaxINTTerminalRuleCall_3_1_3_2_0 = (RuleCall)cMaxAssignment_3_1_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3_3 = (Keyword)cGroup_3_1_3.eContents().get(3);
		private final Group cGroup_3_1_4 = (Group)cUnorderedGroup_3_1.eContents().get(4);
		private final Keyword cVersionKeyword_3_1_4_0 = (Keyword)cGroup_3_1_4.eContents().get(0);
		private final Keyword cColonKeyword_3_1_4_1 = (Keyword)cGroup_3_1_4.eContents().get(1);
		private final Assignment cVersionRangeAssignment_3_1_4_2 = (Assignment)cGroup_3_1_4.eContents().get(2);
		private final RuleCall cVersionRangeIDTerminalRuleCall_3_1_4_2_0 = (RuleCall)cVersionRangeAssignment_3_1_4_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_4_3 = (Keyword)cGroup_3_1_4.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//RequiredCapability returns RequiredCapability : {RequiredCapability}
		//    ((nameSpace=ID) | "unit") name=ID
		//    ('{'
		//        ( ('when' ':' condExpr=Expression ';')?
		//        & (greedy ?= "greedy" ';')?
		//        & ("requires-min" ':' min = INT ';' )?
		//        & ("requires-max" ':' max  = INT ';')?
		//        & ("version" ':' versionRange = ID ';')?
		//          )
		//    '}')
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{RequiredCapability}
		//   ((nameSpace=ID) | "unit") name=ID
		//   ('{'
		//       ( ('when' ':' condExpr=Expression ';')?
		//       & (greedy ?= "greedy" ';')?
		//       & ("requires-min" ':' min = INT ';' )?
		//       & ("requires-max" ':' max  = INT ';')?
		//       & ("version" ':' versionRange = ID ';')?
		//         )
		//   '}')
		public Group getGroup() { return cGroup; }
		
		//{RequiredCapability}
		public Action getRequiredCapabilityAction_0() { return cRequiredCapabilityAction_0; }
		
		//((nameSpace=ID) | "unit")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(nameSpace=ID)
		public Assignment getNameSpaceAssignment_1_0() { return cNameSpaceAssignment_1_0; }
		
		//ID
		public RuleCall getNameSpaceIDTerminalRuleCall_1_0_0() { return cNameSpaceIDTerminalRuleCall_1_0_0; }
		
		//"unit"
		public Keyword getUnitKeyword_1_1() { return cUnitKeyword_1_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('{'
		//    ( ('when' ':' condExpr=Expression ';')?
		//    & (greedy ?= "greedy" ';')?
		//    & ("requires-min" ':' min = INT ';' )?
		//    & ("requires-max" ':' max  = INT ';')?
		//    & ("version" ':' versionRange = ID ';')?
		//      )
		//'}')
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//( ('when' ':' condExpr=Expression ';')?
		//& (greedy ?= "greedy" ';')?
		//& ("requires-min" ':' min = INT ';' )?
		//& ("requires-max" ':' max  = INT ';')?
		//& ("version" ':' versionRange = ID ';')?
		//  )
		public UnorderedGroup getUnorderedGroup_3_1() { return cUnorderedGroup_3_1; }
		
		//('when' ':' condExpr=Expression ';')?
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'when'
		public Keyword getWhenKeyword_3_1_0_0() { return cWhenKeyword_3_1_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_0_1() { return cColonKeyword_3_1_0_1; }
		
		//condExpr=Expression
		public Assignment getCondExprAssignment_3_1_0_2() { return cCondExprAssignment_3_1_0_2; }
		
		//Expression
		public RuleCall getCondExprExpressionParserRuleCall_3_1_0_2_0() { return cCondExprExpressionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//(greedy ?= "greedy" ';')?
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }
		
		//greedy ?= "greedy"
		public Assignment getGreedyAssignment_3_1_1_0() { return cGreedyAssignment_3_1_1_0; }
		
		//"greedy"
		public Keyword getGreedyGreedyKeyword_3_1_1_0_0() { return cGreedyGreedyKeyword_3_1_1_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_1_1() { return cSemicolonKeyword_3_1_1_1; }
		
		//("requires-min" ':' min = INT ';' )?
		public Group getGroup_3_1_2() { return cGroup_3_1_2; }
		
		//"requires-min"
		public Keyword getRequiresMinKeyword_3_1_2_0() { return cRequiresMinKeyword_3_1_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_2_1() { return cColonKeyword_3_1_2_1; }
		
		//min = INT
		public Assignment getMinAssignment_3_1_2_2() { return cMinAssignment_3_1_2_2; }
		
		//INT
		public RuleCall getMinINTTerminalRuleCall_3_1_2_2_0() { return cMinINTTerminalRuleCall_3_1_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_2_3() { return cSemicolonKeyword_3_1_2_3; }
		
		//("requires-max" ':' max  = INT ';')?
		public Group getGroup_3_1_3() { return cGroup_3_1_3; }
		
		//"requires-max"
		public Keyword getRequiresMaxKeyword_3_1_3_0() { return cRequiresMaxKeyword_3_1_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_3_1() { return cColonKeyword_3_1_3_1; }
		
		//max  = INT
		public Assignment getMaxAssignment_3_1_3_2() { return cMaxAssignment_3_1_3_2; }
		
		//INT
		public RuleCall getMaxINTTerminalRuleCall_3_1_3_2_0() { return cMaxINTTerminalRuleCall_3_1_3_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3_3() { return cSemicolonKeyword_3_1_3_3; }
		
		//("version" ':' versionRange = ID ';')?
		public Group getGroup_3_1_4() { return cGroup_3_1_4; }
		
		//"version"
		public Keyword getVersionKeyword_3_1_4_0() { return cVersionKeyword_3_1_4_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_4_1() { return cColonKeyword_3_1_4_1; }
		
		//versionRange = ID
		public Assignment getVersionRangeAssignment_3_1_4_2() { return cVersionRangeAssignment_3_1_4_2; }
		
		//ID
		public RuleCall getVersionRangeIDTerminalRuleCall_3_1_4_2_0() { return cVersionRangeIDTerminalRuleCall_3_1_4_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4_3() { return cSemicolonKeyword_3_1_4_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }
	}
	public class PathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Path");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cQIDParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cSolidusKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final RuleCall cQIDParserRuleCall_1_2_1 = (RuleCall)cGroup_1_2.eContents().get(1);
		private final Keyword cSolidusKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//Path hidden()
		//    : STRING
		//    | ('/')? QID ('/' QID)* ('/')?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		//   | ('/')? QID ('/' QID)* ('/')?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//('/')? QID ('/' QID)* ('/')?
		public Group getGroup_1() { return cGroup_1; }
		
		//('/')?
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }
		
		//QID
		public RuleCall getQIDParserRuleCall_1_1() { return cQIDParserRuleCall_1_1; }
		
		//('/' QID)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'/'
		public Keyword getSolidusKeyword_1_2_0() { return cSolidusKeyword_1_2_0; }
		
		//QID
		public RuleCall getQIDParserRuleCall_1_2_1() { return cQIDParserRuleCall_1_2_1; }
		
		//('/')?
		public Keyword getSolidusKeyword_1_3() { return cSolidusKeyword_1_3; }
	}
	public class ParameterListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cParametersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cParametersFirstParameterParserRuleCall_0_0 = (RuleCall)cParametersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cParametersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cParametersFirstParameterParserRuleCall_1_1_0 = (RuleCall)cParametersAssignment_1_1.eContents().get(0);
		
		//ParameterList :
		//    parameters += FirstParameter ("," parameters += FirstParameter)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//parameters += FirstParameter ("," parameters += FirstParameter)*
		public Group getGroup() { return cGroup; }
		
		//parameters += FirstParameter
		public Assignment getParametersAssignment_0() { return cParametersAssignment_0; }
		
		//FirstParameter
		public RuleCall getParametersFirstParameterParserRuleCall_0_0() { return cParametersFirstParameterParserRuleCall_0_0; }
		
		//("," parameters += FirstParameter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//parameters += FirstParameter
		public Assignment getParametersAssignment_1_1() { return cParametersAssignment_1_1; }
		
		//FirstParameter
		public RuleCall getParametersFirstParameterParserRuleCall_1_1_0() { return cParametersFirstParameterParserRuleCall_1_1_0; }
	}
	public class FirstParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FirstParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClosureParameterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParameterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FirstParameter returns Parameter
		//    : ClosureParameter
		//    | Parameter
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//ClosureParameter
		//   | Parameter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ClosureParameter
		public RuleCall getClosureParameterParserRuleCall_0() { return cClosureParameterParserRuleCall_0; }
		
		//Parameter
		public RuleCall getParameterParserRuleCall_1() { return cParameterParserRuleCall_1; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Parameter");
		private final Assignment cExprAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExprExpressionParserRuleCall_0 = (RuleCall)cExprAssignment.eContents().get(0);
		
		//Parameter :
		//    expr = Expression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//expr = Expression
		public Assignment getExprAssignment() { return cExprAssignment; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_0() { return cExprExpressionParserRuleCall_0; }
	}
	public class ClosureParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ClosureParameter");
		private final Assignment cExprAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExprClosureExpressionParserRuleCall_0 = (RuleCall)cExprAssignment.eContents().get(0);
		
		//ClosureParameter :
		//    (expr = ClosureExpression)
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//(expr = ClosureExpression)
		public Assignment getExprAssignment() { return cExprAssignment; }
		
		//ClosureExpression
		public RuleCall getExprClosureExpressionParserRuleCall_0() { return cExprClosureExpressionParserRuleCall_0; }
	}
	public class ParameterDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeRefParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ParameterDeclaration :
		//    ((type=TypeRef)? name = ID)
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//((type=TypeRef)? name = ID)
		public Group getGroup() { return cGroup; }
		
		//(type=TypeRef)?
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_0_0() { return cTypeTypeRefParserRuleCall_0_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Function");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCUMENTATIONTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Assignment cVisibilityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVisibilityIDTerminalRuleCall_1_0 = (RuleCall)cVisibilityAssignment_1.eContents().get(0);
		private final Assignment cFinalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cFinalFinalKeyword_2_0 = (Keyword)cFinalAssignment_2.eContents().get(0);
		private final Keyword cFunctionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReturnTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReturnTypeTypeRefParserRuleCall_4_0 = (RuleCall)cReturnTypeAssignment_4.eContents().get(0);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftParenthesisKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Alternatives cAlternatives_6_1 = (Alternatives)cGroup_6.eContents().get(1);
		private final Group cGroup_6_1_0 = (Group)cAlternatives_6_1.eContents().get(0);
		private final Assignment cParametersAssignment_6_1_0_0 = (Assignment)cGroup_6_1_0.eContents().get(0);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_6_1_0_0_0 = (RuleCall)cParametersAssignment_6_1_0_0.eContents().get(0);
		private final Group cGroup_6_1_0_1 = (Group)cGroup_6_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_0_1_0 = (Keyword)cGroup_6_1_0_1.eContents().get(0);
		private final Assignment cParametersAssignment_6_1_0_1_1 = (Assignment)cGroup_6_1_0_1.eContents().get(1);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0 = (RuleCall)cParametersAssignment_6_1_0_1_1.eContents().get(0);
		private final Group cGroup_6_1_0_2 = (Group)cGroup_6_1_0.eContents().get(2);
		private final Keyword cCommaKeyword_6_1_0_2_0 = (Keyword)cGroup_6_1_0_2.eContents().get(0);
		private final Assignment cVarArgsAssignment_6_1_0_2_1 = (Assignment)cGroup_6_1_0_2.eContents().get(1);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0 = (Keyword)cVarArgsAssignment_6_1_0_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_6_1_0_2_2 = (Assignment)cGroup_6_1_0_2.eContents().get(2);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0 = (RuleCall)cParametersAssignment_6_1_0_2_2.eContents().get(0);
		private final Group cGroup_6_1_1 = (Group)cAlternatives_6_1.eContents().get(1);
		private final Assignment cVarArgsAssignment_6_1_1_0 = (Assignment)cGroup_6_1_1.eContents().get(0);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0 = (Keyword)cVarArgsAssignment_6_1_1_0.eContents().get(0);
		private final Assignment cParametersAssignment_6_1_1_1 = (Assignment)cGroup_6_1_1.eContents().get(1);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_6_1_1_1_0 = (RuleCall)cParametersAssignment_6_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cWhenKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cGuardAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cGuardGuardExpressionParserRuleCall_7_1_0 = (RuleCall)cGuardAssignment_7_1.eContents().get(0);
		private final Alternatives cAlternatives_8 = (Alternatives)cGroup.eContents().get(8);
		private final Group cGroup_8_0 = (Group)cAlternatives_8.eContents().get(0);
		private final Keyword cColonKeyword_8_0_0 = (Keyword)cGroup_8_0.eContents().get(0);
		private final Assignment cFuncExprAssignment_8_0_1 = (Assignment)cGroup_8_0.eContents().get(1);
		private final RuleCall cFuncExprExpressionParserRuleCall_8_0_1_0 = (RuleCall)cFuncExprAssignment_8_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_8_0_2 = (Keyword)cGroup_8_0.eContents().get(2);
		private final Assignment cFuncExprAssignment_8_1 = (Assignment)cAlternatives_8.eContents().get(1);
		private final RuleCall cFuncExprBlockExpressionParserRuleCall_8_1_0 = (RuleCall)cFuncExprAssignment_8_1.eContents().get(0);
		
		//Function :
		//    (documentation = DOCUMENTATION)?
		//       (visibility = ID)?
		//       (final ?= "final")?
		//       "function"
		//       (returnType = TypeRef)?
		//       name=ID
		//       ('(' (
		//           (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//           | (varArgs ?= "..." parameters += ParameterDeclaration)
		//           )? ')' )?
		//       ("when" guard = GuardExpression)?
		//       ((':' funcExpr=Expression ';') | (funcExpr=BlockExpression))
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//(documentation = DOCUMENTATION)?
		//   (visibility = ID)?
		//   (final ?= "final")?
		//   "function"
		//   (returnType = TypeRef)?
		//   name=ID
		//   ('(' (
		//       (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//       | (varArgs ?= "..." parameters += ParameterDeclaration)
		//       )? ')' )?
		//   ("when" guard = GuardExpression)?
		//   ((':' funcExpr=Expression ';') | (funcExpr=BlockExpression))
		public Group getGroup() { return cGroup; }
		
		//(documentation = DOCUMENTATION)?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCUMENTATION
		public RuleCall getDocumentationDOCUMENTATIONTerminalRuleCall_0_0() { return cDocumentationDOCUMENTATIONTerminalRuleCall_0_0; }
		
		//(visibility = ID)?
		public Assignment getVisibilityAssignment_1() { return cVisibilityAssignment_1; }
		
		//ID
		public RuleCall getVisibilityIDTerminalRuleCall_1_0() { return cVisibilityIDTerminalRuleCall_1_0; }
		
		//(final ?= "final")?
		public Assignment getFinalAssignment_2() { return cFinalAssignment_2; }
		
		//"final"
		public Keyword getFinalFinalKeyword_2_0() { return cFinalFinalKeyword_2_0; }
		
		//"function"
		public Keyword getFunctionKeyword_3() { return cFunctionKeyword_3; }
		
		//(returnType = TypeRef)?
		public Assignment getReturnTypeAssignment_4() { return cReturnTypeAssignment_4; }
		
		//TypeRef
		public RuleCall getReturnTypeTypeRefParserRuleCall_4_0() { return cReturnTypeTypeRefParserRuleCall_4_0; }
		
		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }
		
		//('(' (
		//    (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//    | (varArgs ?= "..." parameters += ParameterDeclaration)
		//    )? ')' )?
		public Group getGroup_6() { return cGroup_6; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_0() { return cLeftParenthesisKeyword_6_0; }
		
		//(
		//          (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//          | (varArgs ?= "..." parameters += ParameterDeclaration)
		//          )?
		public Alternatives getAlternatives_6_1() { return cAlternatives_6_1; }
		
		//(parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
		public Group getGroup_6_1_0() { return cGroup_6_1_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_6_1_0_0() { return cParametersAssignment_6_1_0_0; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_6_1_0_0_0() { return cParametersParameterDeclarationParserRuleCall_6_1_0_0_0; }
		
		//(',' parameters += ParameterDeclaration)*
		public Group getGroup_6_1_0_1() { return cGroup_6_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_6_1_0_1_0() { return cCommaKeyword_6_1_0_1_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_6_1_0_1_1() { return cParametersAssignment_6_1_0_1_1; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0() { return cParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0; }
		
		//(',' varArgs?="..." parameters += ParameterDeclaration)?
		public Group getGroup_6_1_0_2() { return cGroup_6_1_0_2; }
		
		//','
		public Keyword getCommaKeyword_6_1_0_2_0() { return cCommaKeyword_6_1_0_2_0; }
		
		//varArgs?="..."
		public Assignment getVarArgsAssignment_6_1_0_2_1() { return cVarArgsAssignment_6_1_0_2_1; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0() { return cVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_6_1_0_2_2() { return cParametersAssignment_6_1_0_2_2; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0() { return cParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0; }
		
		//(varArgs ?= "..." parameters += ParameterDeclaration)
		public Group getGroup_6_1_1() { return cGroup_6_1_1; }
		
		//varArgs ?= "..."
		public Assignment getVarArgsAssignment_6_1_1_0() { return cVarArgsAssignment_6_1_1_0; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0() { return cVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_6_1_1_1() { return cParametersAssignment_6_1_1_1; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_6_1_1_1_0() { return cParametersParameterDeclarationParserRuleCall_6_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_2() { return cRightParenthesisKeyword_6_2; }
		
		//("when" guard = GuardExpression)?
		public Group getGroup_7() { return cGroup_7; }
		
		//"when"
		public Keyword getWhenKeyword_7_0() { return cWhenKeyword_7_0; }
		
		//guard = GuardExpression
		public Assignment getGuardAssignment_7_1() { return cGuardAssignment_7_1; }
		
		//GuardExpression
		public RuleCall getGuardGuardExpressionParserRuleCall_7_1_0() { return cGuardGuardExpressionParserRuleCall_7_1_0; }
		
		//((':' funcExpr=Expression ';') | (funcExpr=BlockExpression))
		public Alternatives getAlternatives_8() { return cAlternatives_8; }
		
		//(':' funcExpr=Expression ';')
		public Group getGroup_8_0() { return cGroup_8_0; }
		
		//':'
		public Keyword getColonKeyword_8_0_0() { return cColonKeyword_8_0_0; }
		
		//funcExpr=Expression
		public Assignment getFuncExprAssignment_8_0_1() { return cFuncExprAssignment_8_0_1; }
		
		//Expression
		public RuleCall getFuncExprExpressionParserRuleCall_8_0_1_0() { return cFuncExprExpressionParserRuleCall_8_0_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_8_0_2() { return cSemicolonKeyword_8_0_2; }
		
		//(funcExpr=BlockExpression)
		public Assignment getFuncExprAssignment_8_1() { return cFuncExprAssignment_8_1; }
		
		//BlockExpression
		public RuleCall getFuncExprBlockExpressionParserRuleCall_8_1_0() { return cFuncExprBlockExpressionParserRuleCall_8_1_0; }
	}
	public class GuardExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.GuardExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cColonKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cGuardExprAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cGuardExprExpressionParserRuleCall_0_1_0 = (RuleCall)cGuardExprAssignment_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cGuardExprAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cGuardExprBlockExpressionParserRuleCall_1_0 = (RuleCall)cGuardExprAssignment_1.eContents().get(0);
		
		//GuardExpression:
		//    (':' guardExpr = Expression ';') | (guardExpr = BlockExpression)
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//(':' guardExpr = Expression ';') | (guardExpr = BlockExpression)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(':' guardExpr = Expression ';')
		public Group getGroup_0() { return cGroup_0; }
		
		//':'
		public Keyword getColonKeyword_0_0() { return cColonKeyword_0_0; }
		
		//guardExpr = Expression
		public Assignment getGuardExprAssignment_0_1() { return cGuardExprAssignment_0_1; }
		
		//Expression
		public RuleCall getGuardExprExpressionParserRuleCall_0_1_0() { return cGuardExprExpressionParserRuleCall_0_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_0_2() { return cSemicolonKeyword_0_2; }
		
		//(guardExpr = BlockExpression)
		public Assignment getGuardExprAssignment_1() { return cGuardExprAssignment_1; }
		
		//BlockExpression
		public RuleCall getGuardExprBlockExpressionParserRuleCall_1_0() { return cGuardExprBlockExpressionParserRuleCall_1_0; }
	}
	public class AssignmentOperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AssignmentOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPlusSignEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cHyphenMinusEqualsSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cAsteriskEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cSolidusEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cPercentSignEqualsSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//AssignmentOperator
		//    : '=' | '+=' | '-=' | '*='    | '/=' | "%="
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'=' | '+=' | '-=' | '*='	| '/=' | "%="
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'='
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }
		
		//'+='
		public Keyword getPlusSignEqualsSignKeyword_1() { return cPlusSignEqualsSignKeyword_1; }
		
		//'-='
		public Keyword getHyphenMinusEqualsSignKeyword_2() { return cHyphenMinusEqualsSignKeyword_2; }
		
		//'*='
		public Keyword getAsteriskEqualsSignKeyword_3() { return cAsteriskEqualsSignKeyword_3; }
		
		//'/='
		public Keyword getSolidusEqualsSignKeyword_4() { return cSolidusEqualsSignKeyword_4; }
		
		//"%="
		public Keyword getPercentSignEqualsSignKeyword_5() { return cPercentSignEqualsSignKeyword_5; }
	}
	public class RelationalOperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RelationalOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTildeEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignEqualsSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cExclamationMarkEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cExclamationMarkEqualsSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cGreaterThanSignEqualsSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cLessThanSignEqualsSignKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cLessThanSignKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//RelationalOperator
		//    : "~=" | "==" | "===" | "!=" | "!=="
		//    | ">=" | "<=" | ">" | "<"
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//"~=" | "==" | "===" | "!=" | "!=="
		//   | ">=" | "<=" | ">" | "<"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"~="
		public Keyword getTildeEqualsSignKeyword_0() { return cTildeEqualsSignKeyword_0; }
		
		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_1() { return cEqualsSignEqualsSignKeyword_1; }
		
		//"==="
		public Keyword getEqualsSignEqualsSignEqualsSignKeyword_2() { return cEqualsSignEqualsSignEqualsSignKeyword_2; }
		
		//"!="
		public Keyword getExclamationMarkEqualsSignKeyword_3() { return cExclamationMarkEqualsSignKeyword_3; }
		
		//"!=="
		public Keyword getExclamationMarkEqualsSignEqualsSignKeyword_4() { return cExclamationMarkEqualsSignEqualsSignKeyword_4; }
		
		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_5() { return cGreaterThanSignEqualsSignKeyword_5; }
		
		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_6() { return cLessThanSignEqualsSignKeyword_6; }
		
		//">"
		public Keyword getGreaterThanSignKeyword_7() { return cGreaterThanSignKeyword_7; }
		
		//"<"
		public Keyword getLessThanSignKeyword_8() { return cLessThanSignKeyword_8; }
	}
	public class TopLevelExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TopLevelExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cValDeclarationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAssignmentExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TopLevelExpression returns Expression
		//    : VarDeclaration
		//    | ValDeclaration
		//    | AssignmentExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//VarDeclaration
		//   | ValDeclaration
		//   | AssignmentExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarDeclaration
		public RuleCall getVarDeclarationParserRuleCall_0() { return cVarDeclarationParserRuleCall_0; }
		
		//ValDeclaration
		public RuleCall getValDeclarationParserRuleCall_1() { return cValDeclarationParserRuleCall_1; }
		
		//AssignmentExpression
		public RuleCall getAssignmentExpressionParserRuleCall_2() { return cAssignmentExpressionParserRuleCall_2; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
		private final RuleCall cAssignmentExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression returns Expression
		//    : AssignmentExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//AssignmentExpression
		public RuleCall getAssignmentExpressionParserRuleCall() { return cAssignmentExpressionParserRuleCall; }
	}
	public class AssignmentExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AssignmentExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCachedExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAssignmentExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFunctionNameAssignmentOperatorParserRuleCall_1_1_0 = (RuleCall)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprAssignmentExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//AssignmentExpression returns Expression :
		//      CachedExpression ({AssignmentExpression.leftExpr=current}
		//         functionName=AssignmentOperator rightExpr=AssignmentExpression)?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//CachedExpression ({AssignmentExpression.leftExpr=current}
		//   functionName=AssignmentOperator rightExpr=AssignmentExpression)?
		public Group getGroup() { return cGroup; }
		
		//CachedExpression
		public RuleCall getCachedExpressionParserRuleCall_0() { return cCachedExpressionParserRuleCall_0; }
		
		//({AssignmentExpression.leftExpr=current}
		//        functionName=AssignmentOperator rightExpr=AssignmentExpression)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{AssignmentExpression.leftExpr=current}
		public Action getAssignmentExpressionLeftExprAction_1_0() { return cAssignmentExpressionLeftExprAction_1_0; }
		
		//functionName=AssignmentOperator
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//AssignmentOperator
		public RuleCall getFunctionNameAssignmentOperatorParserRuleCall_1_1_0() { return cFunctionNameAssignmentOperatorParserRuleCall_1_1_0; }
		
		//rightExpr=AssignmentExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//AssignmentExpression
		public RuleCall getRightExprAssignmentExpressionParserRuleCall_1_2_0() { return cRightExprAssignmentExpressionParserRuleCall_1_2_0; }
	}
	public class VarDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.VarDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFinalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cFinalFinalKeyword_1_0 = (Keyword)cFinalAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Keyword cVarKeyword_2_0_0 = (Keyword)cAlternatives_2_0.eContents().get(0);
		private final Assignment cTypeAssignment_2_0_1 = (Assignment)cAlternatives_2_0.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_2_0_1_0 = (RuleCall)cTypeAssignment_2_0_1.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueExprAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueExprExpressionParserRuleCall_3_1_0 = (RuleCall)cValueExprAssignment_3_1.eContents().get(0);
		
		//VarDeclaration returns Expression : {DefValue}
		//    (final ?= "final")?
		//    (( "var" |  type=TypeRef ) name=ID)
		//    ('=' valueExpr = Expression)?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{DefValue}
		//   (final ?= "final")?
		//   (( "var" |  type=TypeRef ) name=ID)
		//   ('=' valueExpr = Expression)?
		public Group getGroup() { return cGroup; }
		
		//{DefValue}
		public Action getDefValueAction_0() { return cDefValueAction_0; }
		
		//(final ?= "final")?
		public Assignment getFinalAssignment_1() { return cFinalAssignment_1; }
		
		//"final"
		public Keyword getFinalFinalKeyword_1_0() { return cFinalFinalKeyword_1_0; }
		
		//(( "var" |  type=TypeRef ) name=ID)
		public Group getGroup_2() { return cGroup_2; }
		
		//( "var" |  type=TypeRef )
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }
		
		//"var"
		public Keyword getVarKeyword_2_0_0() { return cVarKeyword_2_0_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_2_0_1() { return cTypeAssignment_2_0_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_0_1_0() { return cTypeTypeRefParserRuleCall_2_0_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_1_0() { return cNameIDTerminalRuleCall_2_1_0; }
		
		//('=' valueExpr = Expression)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//valueExpr = Expression
		public Assignment getValueExprAssignment_3_1() { return cValueExprAssignment_3_1; }
		
		//Expression
		public RuleCall getValueExprExpressionParserRuleCall_3_1_0() { return cValueExprExpressionParserRuleCall_3_1_0; }
	}
	public class ValDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ValDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFinalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cFinalFinalKeyword_1_0 = (Keyword)cFinalAssignment_1.eContents().get(0);
		private final Assignment cImmutableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cImmutableValKeyword_2_0 = (Keyword)cImmutableAssignment_2.eContents().get(0);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeRefParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cValueExprAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cValueExprExpressionParserRuleCall_6_0 = (RuleCall)cValueExprAssignment_6.eContents().get(0);
		
		//ValDeclaration returns Expression : {DefValue}
		//    (final ?= "final")?
		//    immutable ?= "val" (type=TypeRef)? name=ID
		//    '=' valueExpr = Expression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{DefValue}
		//   (final ?= "final")?
		//   immutable ?= "val" (type=TypeRef)? name=ID
		//   '=' valueExpr = Expression
		public Group getGroup() { return cGroup; }
		
		//{DefValue}
		public Action getDefValueAction_0() { return cDefValueAction_0; }
		
		//(final ?= "final")?
		public Assignment getFinalAssignment_1() { return cFinalAssignment_1; }
		
		//"final"
		public Keyword getFinalFinalKeyword_1_0() { return cFinalFinalKeyword_1_0; }
		
		//immutable ?= "val"
		public Assignment getImmutableAssignment_2() { return cImmutableAssignment_2; }
		
		//"val"
		public Keyword getImmutableValKeyword_2_0() { return cImmutableValKeyword_2_0; }
		
		//(type=TypeRef)?
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_3_0() { return cTypeTypeRefParserRuleCall_3_0; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5() { return cEqualsSignKeyword_5; }
		
		//valueExpr = Expression
		public Assignment getValueExprAssignment_6() { return cValueExprAssignment_6; }
		
		//Expression
		public RuleCall getValueExprExpressionParserRuleCall_6_0() { return cValueExprExpressionParserRuleCall_6_0; }
	}
	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClosureTypeRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleTypeRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeRef
		//    : ClosureTypeRef
		//    | SimpleTypeRef
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//ClosureTypeRef
		//   | SimpleTypeRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ClosureTypeRef
		public RuleCall getClosureTypeRefParserRuleCall_0() { return cClosureTypeRefParserRuleCall_0; }
		
		//SimpleTypeRef
		public RuleCall getSimpleTypeRefParserRuleCall_1() { return cSimpleTypeRefParserRuleCall_1; }
	}
	public class SimpleTypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.SimpleTypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRawTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRawTypeIDTerminalRuleCall_0_0 = (RuleCall)cRawTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActualArgumentsListAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActualArgumentsListIDTerminalRuleCall_1_1_0 = (RuleCall)cActualArgumentsListAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cActualArgumentsListAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cActualArgumentsListIDTerminalRuleCall_1_2_1_0 = (RuleCall)cActualArgumentsListAssignment_1_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//SimpleTypeRef :
		//    rawType=ID
		//        ('<' actualArgumentsList+=ID (',' actualArgumentsList+=ID)* '>' )?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//rawType=ID
		//    ('<' actualArgumentsList+=ID (',' actualArgumentsList+=ID)* '>' )?
		public Group getGroup() { return cGroup; }
		
		//rawType=ID
		public Assignment getRawTypeAssignment_0() { return cRawTypeAssignment_0; }
		
		//ID
		public RuleCall getRawTypeIDTerminalRuleCall_0_0() { return cRawTypeIDTerminalRuleCall_0_0; }
		
		//('<' actualArgumentsList+=ID (',' actualArgumentsList+=ID)* '>' )?
		public Group getGroup_1() { return cGroup_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }
		
		//actualArgumentsList+=ID
		public Assignment getActualArgumentsListAssignment_1_1() { return cActualArgumentsListAssignment_1_1; }
		
		//ID
		public RuleCall getActualArgumentsListIDTerminalRuleCall_1_1_0() { return cActualArgumentsListIDTerminalRuleCall_1_1_0; }
		
		//(',' actualArgumentsList+=ID)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//actualArgumentsList+=ID
		public Assignment getActualArgumentsListAssignment_1_2_1() { return cActualArgumentsListAssignment_1_2_1; }
		
		//ID
		public RuleCall getActualArgumentsListIDTerminalRuleCall_1_2_1_0() { return cActualArgumentsListIDTerminalRuleCall_1_2_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1_3() { return cGreaterThanSignKeyword_1_3; }
	}
	public class ClosureTypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ClosureTypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cParameterTypesAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cParameterTypesIDTerminalRuleCall_1_0_0_0 = (RuleCall)cParameterTypesAssignment_1_0_0.eContents().get(0);
		private final Group cGroup_1_0_1 = (Group)cGroup_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Assignment cParameterTypesAssignment_1_0_1_1 = (Assignment)cGroup_1_0_1.eContents().get(1);
		private final RuleCall cParameterTypesIDTerminalRuleCall_1_0_1_1_0 = (RuleCall)cParameterTypesAssignment_1_0_1_1.eContents().get(0);
		private final Group cGroup_1_0_2 = (Group)cGroup_1_0.eContents().get(2);
		private final Keyword cCommaKeyword_1_0_2_0 = (Keyword)cGroup_1_0_2.eContents().get(0);
		private final Assignment cVarArgsAssignment_1_0_2_1 = (Assignment)cGroup_1_0_2.eContents().get(1);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0 = (Keyword)cVarArgsAssignment_1_0_2_1.eContents().get(0);
		private final Assignment cParameterTypesAssignment_1_0_2_2 = (Assignment)cGroup_1_0_2.eContents().get(2);
		private final RuleCall cParameterTypesIDTerminalRuleCall_1_0_2_2_0 = (RuleCall)cParameterTypesAssignment_1_0_2_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cVarArgsAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_1_1_0_0 = (Keyword)cVarArgsAssignment_1_1_0.eContents().get(0);
		private final Assignment cParameterTypesAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cParameterTypesIDTerminalRuleCall_1_1_1_0 = (RuleCall)cParameterTypesAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReturnTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReturnTypeIDTerminalRuleCall_4_0 = (RuleCall)cReturnTypeAssignment_4.eContents().get(0);
		
		//ClosureTypeRef :
		//    ('('(
		//        (parameterTypes += ID (',' parameterTypes += ID)*
		//            (',' varArgs ?= "..." parameterTypes += ID )?)
		//        |     (    varArgs ?= "..." parameterTypes += ID)
		//        )?
		//    ')' '=>' returnType = ID )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//('('(
		//    (parameterTypes += ID (',' parameterTypes += ID)*
		//        (',' varArgs ?= "..." parameterTypes += ID )?)
		//    |     (    varArgs ?= "..." parameterTypes += ID)
		//    )?
		//')' '=>' returnType = ID )
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//(
		//        (parameterTypes += ID (',' parameterTypes += ID)*
		//            (',' varArgs ?= "..." parameterTypes += ID )?)
		//        |     (    varArgs ?= "..." parameterTypes += ID)
		//        )?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(parameterTypes += ID (',' parameterTypes += ID)*
		//    (',' varArgs ?= "..." parameterTypes += ID )?)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//parameterTypes += ID
		public Assignment getParameterTypesAssignment_1_0_0() { return cParameterTypesAssignment_1_0_0; }
		
		//ID
		public RuleCall getParameterTypesIDTerminalRuleCall_1_0_0_0() { return cParameterTypesIDTerminalRuleCall_1_0_0_0; }
		
		//(',' parameterTypes += ID)*
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_1_0_1_0() { return cCommaKeyword_1_0_1_0; }
		
		//parameterTypes += ID
		public Assignment getParameterTypesAssignment_1_0_1_1() { return cParameterTypesAssignment_1_0_1_1; }
		
		//ID
		public RuleCall getParameterTypesIDTerminalRuleCall_1_0_1_1_0() { return cParameterTypesIDTerminalRuleCall_1_0_1_1_0; }
		
		//(',' varArgs ?= "..." parameterTypes += ID )?
		public Group getGroup_1_0_2() { return cGroup_1_0_2; }
		
		//','
		public Keyword getCommaKeyword_1_0_2_0() { return cCommaKeyword_1_0_2_0; }
		
		//varArgs ?= "..."
		public Assignment getVarArgsAssignment_1_0_2_1() { return cVarArgsAssignment_1_0_2_1; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0() { return cVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0; }
		
		//parameterTypes += ID
		public Assignment getParameterTypesAssignment_1_0_2_2() { return cParameterTypesAssignment_1_0_2_2; }
		
		//ID
		public RuleCall getParameterTypesIDTerminalRuleCall_1_0_2_2_0() { return cParameterTypesIDTerminalRuleCall_1_0_2_2_0; }
		
		//(    varArgs ?= "..." parameterTypes += ID)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//varArgs ?= "..."
		public Assignment getVarArgsAssignment_1_1_0() { return cVarArgsAssignment_1_1_0; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0() { return cVarArgsFullStopFullStopFullStopKeyword_1_1_0_0; }
		
		//parameterTypes += ID
		public Assignment getParameterTypesAssignment_1_1_1() { return cParameterTypesAssignment_1_1_1; }
		
		//ID
		public RuleCall getParameterTypesIDTerminalRuleCall_1_1_1_0() { return cParameterTypesIDTerminalRuleCall_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//returnType = ID
		public Assignment getReturnTypeAssignment_4() { return cReturnTypeAssignment_4; }
		
		//ID
		public RuleCall getReturnTypeIDTerminalRuleCall_4_0() { return cReturnTypeIDTerminalRuleCall_4_0; }
	}
	public class CachedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.CachedExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cCachedExpressionAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cCachedKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cExprAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExprOrExpressionParserRuleCall_0_2_0 = (RuleCall)cExprAssignment_0_2.eContents().get(0);
		private final RuleCall cOrExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CachedExpression returns Expression  :
		//    ({CachedExpression} "cached" expr = OrExpression)
		//    | OrExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//({CachedExpression} "cached" expr = OrExpression)
		//| OrExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//({CachedExpression} "cached" expr = OrExpression)
		public Group getGroup_0() { return cGroup_0; }
		
		//{CachedExpression}
		public Action getCachedExpressionAction_0_0() { return cCachedExpressionAction_0_0; }
		
		//"cached"
		public Keyword getCachedKeyword_0_1() { return cCachedKeyword_0_1; }
		
		//expr = OrExpression
		public Assignment getExprAssignment_0_2() { return cExprAssignment_0_2; }
		
		//OrExpression
		public RuleCall getExprOrExpressionParserRuleCall_0_2_0() { return cExprOrExpressionParserRuleCall_0_2_0; }
		
		//OrExpression
		public RuleCall getOrExpressionParserRuleCall_1() { return cOrExpressionParserRuleCall_1; }
	}
	public class OrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.OrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprAndExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//OrExpression returns Expression :
		//    AndExpression ({OrExpression.leftExpr=current} "||" rightExpr=AndExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpression ({OrExpression.leftExpr=current} "||" rightExpr=AndExpression)*
		public Group getGroup() { return cGroup; }
		
		//AndExpression
		public RuleCall getAndExpressionParserRuleCall_0() { return cAndExpressionParserRuleCall_0; }
		
		//({OrExpression.leftExpr=current} "||" rightExpr=AndExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpression.leftExpr=current}
		public Action getOrExpressionLeftExprAction_1_0() { return cOrExpressionLeftExprAction_1_0; }
		
		//"||"
		public Keyword getVerticalLineVerticalLineKeyword_1_1() { return cVerticalLineVerticalLineKeyword_1_1; }
		
		//rightExpr=AndExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//AndExpression
		public RuleCall getRightExprAndExpressionParserRuleCall_1_2_0() { return cRightExprAndExpressionParserRuleCall_1_2_0; }
	}
	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRelationalExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprRelationalExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//AndExpression returns Expression :
		//    RelationalExpression ({AndExpression.leftExpr=current} "&&" rightExpr=RelationalExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//RelationalExpression ({AndExpression.leftExpr=current} "&&" rightExpr=RelationalExpression)*
		public Group getGroup() { return cGroup; }
		
		//RelationalExpression
		public RuleCall getRelationalExpressionParserRuleCall_0() { return cRelationalExpressionParserRuleCall_0; }
		
		//({AndExpression.leftExpr=current} "&&" rightExpr=RelationalExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpression.leftExpr=current}
		public Action getAndExpressionLeftExprAction_1_0() { return cAndExpressionLeftExprAction_1_0; }
		
		//"&&"
		public Keyword getAmpersandAmpersandKeyword_1_1() { return cAmpersandAmpersandKeyword_1_1; }
		
		//rightExpr=RelationalExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//RelationalExpression
		public RuleCall getRightExprRelationalExpressionParserRuleCall_1_2_0() { return cRightExprRelationalExpressionParserRuleCall_1_2_0; }
	}
	public class RelationalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RelationalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditiveExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBinaryOpExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFunctionNameRelationalOperatorParserRuleCall_1_1_0 = (RuleCall)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprAdditiveExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//RelationalExpression returns Expression :
		//    AdditiveExpression ({BinaryOpExpression.leftExpr=current}
		//        functionName=RelationalOperator rightExpr=AdditiveExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//AdditiveExpression ({BinaryOpExpression.leftExpr=current}
		//    functionName=RelationalOperator rightExpr=AdditiveExpression)*
		public Group getGroup() { return cGroup; }
		
		//AdditiveExpression
		public RuleCall getAdditiveExpressionParserRuleCall_0() { return cAdditiveExpressionParserRuleCall_0; }
		
		//({BinaryOpExpression.leftExpr=current}
		//       functionName=RelationalOperator rightExpr=AdditiveExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryOpExpression.leftExpr=current}
		public Action getBinaryOpExpressionLeftExprAction_1_0() { return cBinaryOpExpressionLeftExprAction_1_0; }
		
		//functionName=RelationalOperator
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//RelationalOperator
		public RuleCall getFunctionNameRelationalOperatorParserRuleCall_1_1_0() { return cFunctionNameRelationalOperatorParserRuleCall_1_1_0; }
		
		//rightExpr=AdditiveExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//AdditiveExpression
		public RuleCall getRightExprAdditiveExpressionParserRuleCall_1_2_0() { return cRightExprAdditiveExpressionParserRuleCall_1_2_0; }
	}
	public class AdditiveExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AdditiveExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicativeExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBinaryOpExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cFunctionNameAlternatives_1_1_0 = (Alternatives)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Keyword cFunctionNamePlusSignKeyword_1_1_0_0 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(0);
		private final Keyword cFunctionNameHyphenMinusKeyword_1_1_0_1 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprMultiplicativeExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//AdditiveExpression returns Expression :
		//    MultiplicativeExpression ({BinaryOpExpression.leftExpr=current} functionName=("+" | "-") rightExpr=MultiplicativeExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//MultiplicativeExpression ({BinaryOpExpression.leftExpr=current} functionName=("+" | "-") rightExpr=MultiplicativeExpression)*
		public Group getGroup() { return cGroup; }
		
		//MultiplicativeExpression
		public RuleCall getMultiplicativeExpressionParserRuleCall_0() { return cMultiplicativeExpressionParserRuleCall_0; }
		
		//({BinaryOpExpression.leftExpr=current} functionName=("+" | "-") rightExpr=MultiplicativeExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryOpExpression.leftExpr=current}
		public Action getBinaryOpExpressionLeftExprAction_1_0() { return cBinaryOpExpressionLeftExprAction_1_0; }
		
		//functionName=("+" | "-")
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//("+" | "-")
		public Alternatives getFunctionNameAlternatives_1_1_0() { return cFunctionNameAlternatives_1_1_0; }
		
		//"+"
		public Keyword getFunctionNamePlusSignKeyword_1_1_0_0() { return cFunctionNamePlusSignKeyword_1_1_0_0; }
		
		//"-"
		public Keyword getFunctionNameHyphenMinusKeyword_1_1_0_1() { return cFunctionNameHyphenMinusKeyword_1_1_0_1; }
		
		//rightExpr=MultiplicativeExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//MultiplicativeExpression
		public RuleCall getRightExprMultiplicativeExpressionParserRuleCall_1_2_0() { return cRightExprMultiplicativeExpressionParserRuleCall_1_2_0; }
	}
	public class MultiplicativeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.MultiplicativeExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSetExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBinaryOpExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cFunctionNameAlternatives_1_1_0 = (Alternatives)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Keyword cFunctionNameAsteriskKeyword_1_1_0_0 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(0);
		private final Keyword cFunctionNameSolidusKeyword_1_1_0_1 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(1);
		private final Keyword cFunctionNamePercentSignKeyword_1_1_0_2 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(2);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprSetExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//MultiplicativeExpression returns Expression :
		//    SetExpression ({BinaryOpExpression.leftExpr=current} functionName=("*" | "/" | "%") rightExpr=SetExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//SetExpression ({BinaryOpExpression.leftExpr=current} functionName=("*" | "/" | "%") rightExpr=SetExpression)*
		public Group getGroup() { return cGroup; }
		
		//SetExpression
		public RuleCall getSetExpressionParserRuleCall_0() { return cSetExpressionParserRuleCall_0; }
		
		//({BinaryOpExpression.leftExpr=current} functionName=("*" | "/" | "%") rightExpr=SetExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryOpExpression.leftExpr=current}
		public Action getBinaryOpExpressionLeftExprAction_1_0() { return cBinaryOpExpressionLeftExprAction_1_0; }
		
		//functionName=("*" | "/" | "%")
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//("*" | "/" | "%")
		public Alternatives getFunctionNameAlternatives_1_1_0() { return cFunctionNameAlternatives_1_1_0; }
		
		//"*"
		public Keyword getFunctionNameAsteriskKeyword_1_1_0_0() { return cFunctionNameAsteriskKeyword_1_1_0_0; }
		
		//"/"
		public Keyword getFunctionNameSolidusKeyword_1_1_0_1() { return cFunctionNameSolidusKeyword_1_1_0_1; }
		
		//"%"
		public Keyword getFunctionNamePercentSignKeyword_1_1_0_2() { return cFunctionNamePercentSignKeyword_1_1_0_2; }
		
		//rightExpr=SetExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//SetExpression
		public RuleCall getRightExprSetExpressionParserRuleCall_1_2_0() { return cRightExprSetExpressionParserRuleCall_1_2_0; }
	}
	public class SetExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.SetExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryOrInfixExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBinaryOpExpressionLeftExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cFunctionNameFullStopFullStopKeyword_1_1_0 = (Keyword)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Assignment cRightExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0 = (RuleCall)cRightExprAssignment_1_2.eContents().get(0);
		
		//SetExpression returns Expression:
		//    UnaryOrInfixExpression ({BinaryOpExpression.leftExpr=current} functionName=".." rightExpr=UnaryOrInfixExpression)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//UnaryOrInfixExpression ({BinaryOpExpression.leftExpr=current} functionName=".." rightExpr=UnaryOrInfixExpression)*
		public Group getGroup() { return cGroup; }
		
		//UnaryOrInfixExpression
		public RuleCall getUnaryOrInfixExpressionParserRuleCall_0() { return cUnaryOrInfixExpressionParserRuleCall_0; }
		
		//({BinaryOpExpression.leftExpr=current} functionName=".." rightExpr=UnaryOrInfixExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryOpExpression.leftExpr=current}
		public Action getBinaryOpExpressionLeftExprAction_1_0() { return cBinaryOpExpressionLeftExprAction_1_0; }
		
		//functionName=".."
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//".."
		public Keyword getFunctionNameFullStopFullStopKeyword_1_1_0() { return cFunctionNameFullStopFullStopKeyword_1_1_0; }
		
		//rightExpr=UnaryOrInfixExpression
		public Assignment getRightExprAssignment_1_2() { return cRightExprAssignment_1_2; }
		
		//UnaryOrInfixExpression
		public RuleCall getRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0() { return cRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0; }
	}
	public class UnaryOrInfixExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.UnaryOrInfixExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPostopExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUnaryExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPreopExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//UnaryOrInfixExpression returns Expression
		//    : PostopExpression
		//    | UnaryExpression
		//    | PreopExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//PostopExpression
		//   | UnaryExpression
		//   | PreopExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PostopExpression
		public RuleCall getPostopExpressionParserRuleCall_0() { return cPostopExpressionParserRuleCall_0; }
		
		//UnaryExpression
		public RuleCall getUnaryExpressionParserRuleCall_1() { return cUnaryExpressionParserRuleCall_1; }
		
		//PreopExpression
		public RuleCall getPreopExpressionParserRuleCall_2() { return cPreopExpressionParserRuleCall_2; }
	}
	public class UnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.UnaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnaryOpExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cFunctionNameAlternatives_1_0 = (Alternatives)cFunctionNameAssignment_1.eContents().get(0);
		private final Keyword cFunctionNameExclamationMarkKeyword_1_0_0 = (Keyword)cFunctionNameAlternatives_1_0.eContents().get(0);
		private final Keyword cFunctionNameHyphenMinusKeyword_1_0_1 = (Keyword)cFunctionNameAlternatives_1_0.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprInfixExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		
		//UnaryExpression returns Expression : {UnaryOpExpression}
		//    functionName=("!" | "-") expr=InfixExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnaryOpExpression}
		//   functionName=("!" | "-") expr=InfixExpression
		public Group getGroup() { return cGroup; }
		
		//{UnaryOpExpression}
		public Action getUnaryOpExpressionAction_0() { return cUnaryOpExpressionAction_0; }
		
		//functionName=("!" | "-")
		public Assignment getFunctionNameAssignment_1() { return cFunctionNameAssignment_1; }
		
		//("!" | "-")
		public Alternatives getFunctionNameAlternatives_1_0() { return cFunctionNameAlternatives_1_0; }
		
		//"!"
		public Keyword getFunctionNameExclamationMarkKeyword_1_0_0() { return cFunctionNameExclamationMarkKeyword_1_0_0; }
		
		//"-"
		public Keyword getFunctionNameHyphenMinusKeyword_1_0_1() { return cFunctionNameHyphenMinusKeyword_1_0_1; }
		
		//expr=InfixExpression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//InfixExpression
		public RuleCall getExprInfixExpressionParserRuleCall_2_0() { return cExprInfixExpressionParserRuleCall_2_0; }
	}
	public class PreopExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.PreopExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnaryPreOpExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cFunctionNameAlternatives_1_0 = (Alternatives)cFunctionNameAssignment_1.eContents().get(0);
		private final Keyword cFunctionNamePlusSignPlusSignKeyword_1_0_0 = (Keyword)cFunctionNameAlternatives_1_0.eContents().get(0);
		private final Keyword cFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1 = (Keyword)cFunctionNameAlternatives_1_0.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprInfixExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		
		//PreopExpression returns Expression : {UnaryPreOpExpression}
		//    functionName=("++" | "--") expr=InfixExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnaryPreOpExpression}
		//   functionName=("++" | "--") expr=InfixExpression
		public Group getGroup() { return cGroup; }
		
		//{UnaryPreOpExpression}
		public Action getUnaryPreOpExpressionAction_0() { return cUnaryPreOpExpressionAction_0; }
		
		//functionName=("++" | "--")
		public Assignment getFunctionNameAssignment_1() { return cFunctionNameAssignment_1; }
		
		//("++" | "--")
		public Alternatives getFunctionNameAlternatives_1_0() { return cFunctionNameAlternatives_1_0; }
		
		//"++"
		public Keyword getFunctionNamePlusSignPlusSignKeyword_1_0_0() { return cFunctionNamePlusSignPlusSignKeyword_1_0_0; }
		
		//"--"
		public Keyword getFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1() { return cFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1; }
		
		//expr=InfixExpression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//InfixExpression
		public RuleCall getExprInfixExpressionParserRuleCall_2_0() { return cExprInfixExpressionParserRuleCall_2_0; }
	}
	public class PostopExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.PostopExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cInfixExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cUnaryPostOpExpressionExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cFunctionNameAlternatives_1_1_0 = (Alternatives)cFunctionNameAssignment_1_1.eContents().get(0);
		private final Keyword cFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(0);
		private final Keyword cFunctionNamePlusSignPlusSignKeyword_1_1_0_1 = (Keyword)cFunctionNameAlternatives_1_1_0.eContents().get(1);
		
		//PostopExpression returns Expression :
		//    InfixExpression ({UnaryPostOpExpression.expr=current} functionName = ("--" | "++"))?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//InfixExpression ({UnaryPostOpExpression.expr=current} functionName = ("--" | "++"))?
		public Group getGroup() { return cGroup; }
		
		//InfixExpression
		public RuleCall getInfixExpressionParserRuleCall_0() { return cInfixExpressionParserRuleCall_0; }
		
		//({UnaryPostOpExpression.expr=current} functionName = ("--" | "++"))?
		public Group getGroup_1() { return cGroup_1; }
		
		//{UnaryPostOpExpression.expr=current}
		public Action getUnaryPostOpExpressionExprAction_1_0() { return cUnaryPostOpExpressionExprAction_1_0; }
		
		//functionName = ("--" | "++")
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//("--" | "++")
		public Alternatives getFunctionNameAlternatives_1_1_0() { return cFunctionNameAlternatives_1_1_0; }
		
		//"--"
		public Keyword getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0() { return cFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0; }
		
		//"++"
		public Keyword getFunctionNamePlusSignPlusSignKeyword_1_1_0_1() { return cFunctionNamePlusSignPlusSignKeyword_1_1_0_1; }
	}
	public class InfixExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InfixExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCallExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cCallFeatureFuncExprAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cNameAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_1_0_2_0 = (RuleCall)cNameAssignment_1_0_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_0_3 = (Keyword)cGroup_1_0.eContents().get(3);
		private final Assignment cParameterListAssignment_1_0_4 = (Assignment)cGroup_1_0.eContents().get(4);
		private final RuleCall cParameterListParameterListParserRuleCall_1_0_4_0 = (RuleCall)cParameterListAssignment_1_0_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_0_5 = (Keyword)cGroup_1_0.eContents().get(5);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cAtExpressionObjExprAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cIndexExprAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cIndexExprExpressionParserRuleCall_1_1_2_0 = (RuleCall)cIndexExprAssignment_1_1_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Action cFeatureExpressionObjExprAction_1_2_0 = (Action)cGroup_1_2.eContents().get(0);
		private final Keyword cFullStopKeyword_1_2_1 = (Keyword)cGroup_1_2.eContents().get(1);
		private final Assignment cFeatureNameAssignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cFeatureNameIDTerminalRuleCall_1_2_2_0 = (RuleCall)cFeatureNameAssignment_1_2_2.eContents().get(0);
		
		//InfixExpression returns Expression :
		//    CallExpression (
		//          ({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
		//      |    ({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
		//      | ({FeatureExpression.objExpr=current} "." featureName=ID)
		//    )*;
		@Override public ParserRule getRule() { return rule; }
		
		//CallExpression (
		//      ({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
		//  |    ({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
		//  | ({FeatureExpression.objExpr=current} "." featureName=ID)
		//)*
		public Group getGroup() { return cGroup; }
		
		//CallExpression
		public RuleCall getCallExpressionParserRuleCall_0() { return cCallExpressionParserRuleCall_0; }
		
		//(
		//         ({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
		//     |    ({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
		//     | ({FeatureExpression.objExpr=current} "." featureName=ID)
		//   )*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{CallFeature.funcExpr=current}
		public Action getCallFeatureFuncExprAction_1_0_0() { return cCallFeatureFuncExprAction_1_0_0; }
		
		//"."
		public Keyword getFullStopKeyword_1_0_1() { return cFullStopKeyword_1_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1_0_2() { return cNameAssignment_1_0_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_2_0() { return cNameIDTerminalRuleCall_1_0_2_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1_0_3() { return cLeftParenthesisKeyword_1_0_3; }
		
		//(parameterList = ParameterList)?
		public Assignment getParameterListAssignment_1_0_4() { return cParameterListAssignment_1_0_4; }
		
		//ParameterList
		public RuleCall getParameterListParameterListParserRuleCall_1_0_4_0() { return cParameterListParameterListParserRuleCall_1_0_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_1_0_5() { return cRightParenthesisKeyword_1_0_5; }
		
		//({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{AtExpression.objExpr=current}
		public Action getAtExpressionObjExprAction_1_1_0() { return cAtExpressionObjExprAction_1_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_1_1() { return cLeftSquareBracketKeyword_1_1_1; }
		
		//indexExpr=Expression
		public Assignment getIndexExprAssignment_1_1_2() { return cIndexExprAssignment_1_1_2; }
		
		//Expression
		public RuleCall getIndexExprExpressionParserRuleCall_1_1_2_0() { return cIndexExprExpressionParserRuleCall_1_1_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_1_3() { return cRightSquareBracketKeyword_1_1_3; }
		
		//({FeatureExpression.objExpr=current} "." featureName=ID)
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//{FeatureExpression.objExpr=current}
		public Action getFeatureExpressionObjExprAction_1_2_0() { return cFeatureExpressionObjExprAction_1_2_0; }
		
		//"."
		public Keyword getFullStopKeyword_1_2_1() { return cFullStopKeyword_1_2_1; }
		
		//featureName=ID
		public Assignment getFeatureNameAssignment_1_2_2() { return cFeatureNameAssignment_1_2_2; }
		
		//ID
		public RuleCall getFeatureNameIDTerminalRuleCall_1_2_2_0() { return cFeatureNameIDTerminalRuleCall_1_2_2_0; }
	}
	public class CallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.CallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCallFunctionFuncExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cParameterListAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cParameterListParameterListParserRuleCall_1_2_0 = (RuleCall)cParameterListAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//CallExpression returns Expression :
		//    PrimaryExpression ({CallFunction.funcExpr=current}"(" (parameterList = ParameterList)? ")")*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimaryExpression ({CallFunction.funcExpr=current}"(" (parameterList = ParameterList)? ")")*
		public Group getGroup() { return cGroup; }
		
		//PrimaryExpression
		public RuleCall getPrimaryExpressionParserRuleCall_0() { return cPrimaryExpressionParserRuleCall_0; }
		
		//({CallFunction.funcExpr=current}"(" (parameterList = ParameterList)? ")")*
		public Group getGroup_1() { return cGroup_1; }
		
		//{CallFunction.funcExpr=current}
		public Action getCallFunctionFuncExprAction_1_0() { return cCallFunctionFuncExprAction_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//(parameterList = ParameterList)?
		public Assignment getParameterListAssignment_1_2() { return cParameterListAssignment_1_2; }
		
		//ParameterList
		public RuleCall getParameterListParameterListParserRuleCall_1_2_0() { return cParameterListParameterListParserRuleCall_1_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.PrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFeatureCallParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConstructorCallExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cValueParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cKeywordVariablesParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cParanthesizedExpressionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cBlockExpressionParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cWithExpressionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cWithContextExpressionParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//PrimaryExpression returns Expression
		//    : FeatureCall
		//    | ConstructorCallExpression
		//    | Value
		//    | Literal
		//    | KeywordVariables
		//    | ParanthesizedExpression
		//    | BlockExpression
		//    | WithExpression
		//    | WithContextExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//FeatureCall
		//   | ConstructorCallExpression
		//   | Value
		//   | Literal
		//   | KeywordVariables
		//   | ParanthesizedExpression
		//   | BlockExpression
		//   | WithExpression
		//   | WithContextExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FeatureCall
		public RuleCall getFeatureCallParserRuleCall_0() { return cFeatureCallParserRuleCall_0; }
		
		//ConstructorCallExpression
		public RuleCall getConstructorCallExpressionParserRuleCall_1() { return cConstructorCallExpressionParserRuleCall_1; }
		
		//Value
		public RuleCall getValueParserRuleCall_2() { return cValueParserRuleCall_2; }
		
		//Literal
		public RuleCall getLiteralParserRuleCall_3() { return cLiteralParserRuleCall_3; }
		
		//KeywordVariables
		public RuleCall getKeywordVariablesParserRuleCall_4() { return cKeywordVariablesParserRuleCall_4; }
		
		//ParanthesizedExpression
		public RuleCall getParanthesizedExpressionParserRuleCall_5() { return cParanthesizedExpressionParserRuleCall_5; }
		
		//BlockExpression
		public RuleCall getBlockExpressionParserRuleCall_6() { return cBlockExpressionParserRuleCall_6; }
		
		//WithExpression
		public RuleCall getWithExpressionParserRuleCall_7() { return cWithExpressionParserRuleCall_7; }
		
		//WithContextExpression
		public RuleCall getWithContextExpressionParserRuleCall_8() { return cWithContextExpressionParserRuleCall_8; }
	}
	public class WithExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.WithExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cReferencedAdviceAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cReferencedAdviceIDTerminalRuleCall_1_0_0 = (RuleCall)cReferencedAdviceAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cReferencedAdviceAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cReferencedAdviceIDTerminalRuleCall_1_1_1_0 = (RuleCall)cReferencedAdviceAssignment_1_1_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cColonKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cFuncExprAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cFuncExprExpressionParserRuleCall_2_0_1_0 = (RuleCall)cFuncExprAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cFuncExprAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0 = (RuleCall)cFuncExprAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_1_2 = (Keyword)cGroup_2_1.eContents().get(2);
		
		//WithExpression returns WithExpression :
		//        'with'
		//        ( referencedAdvice += ID (',' referencedAdvice += ID)* )?
		//        ( (':' funcExpr = Expression ) | ('{' funcExpr = BlockExpressionWithoutBrackets '}' ) )
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		//'with'
		//( referencedAdvice += ID (',' referencedAdvice += ID)* )?
		//( (':' funcExpr = Expression ) | ('{' funcExpr = BlockExpressionWithoutBrackets '}' ) )
		public Group getGroup() { return cGroup; }
		
		//'with'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//( referencedAdvice += ID (',' referencedAdvice += ID)* )?
		public Group getGroup_1() { return cGroup_1; }
		
		//referencedAdvice += ID
		public Assignment getReferencedAdviceAssignment_1_0() { return cReferencedAdviceAssignment_1_0; }
		
		//ID
		public RuleCall getReferencedAdviceIDTerminalRuleCall_1_0_0() { return cReferencedAdviceIDTerminalRuleCall_1_0_0; }
		
		//(',' referencedAdvice += ID)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//referencedAdvice += ID
		public Assignment getReferencedAdviceAssignment_1_1_1() { return cReferencedAdviceAssignment_1_1_1; }
		
		//ID
		public RuleCall getReferencedAdviceIDTerminalRuleCall_1_1_1_0() { return cReferencedAdviceIDTerminalRuleCall_1_1_1_0; }
		
		//( (':' funcExpr = Expression ) | ('{' funcExpr = BlockExpressionWithoutBrackets '}' ) )
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//(':' funcExpr = Expression )
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_0_0() { return cColonKeyword_2_0_0; }
		
		//funcExpr = Expression
		public Assignment getFuncExprAssignment_2_0_1() { return cFuncExprAssignment_2_0_1; }
		
		//Expression
		public RuleCall getFuncExprExpressionParserRuleCall_2_0_1_0() { return cFuncExprExpressionParserRuleCall_2_0_1_0; }
		
		//('{' funcExpr = BlockExpressionWithoutBrackets '}' )
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1_0() { return cLeftCurlyBracketKeyword_2_1_0; }
		
		//funcExpr = BlockExpressionWithoutBrackets
		public Assignment getFuncExprAssignment_2_1_1() { return cFuncExprAssignment_2_1_1; }
		
		//BlockExpressionWithoutBrackets
		public RuleCall getFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0() { return cFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_1_2() { return cRightCurlyBracketKeyword_2_1_2; }
	}
	public class WithContextExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.WithContextExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cContextKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAliasAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_3_1_0 = (RuleCall)cAliasAssignment_3_1.eContents().get(0);
		private final Assignment cContextBlockAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContextBlockBlockExpressionParserRuleCall_4_0 = (RuleCall)cContextBlockAssignment_4.eContents().get(0);
		
		//WithContextExpression returns WithContextExpression :
		//    "with" "context" expr = Expression ("as" alias = ID )? contextBlock = BlockExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//"with" "context" expr = Expression ("as" alias = ID )? contextBlock = BlockExpression
		public Group getGroup() { return cGroup; }
		
		//"with"
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//"context"
		public Keyword getContextKeyword_1() { return cContextKeyword_1; }
		
		//expr = Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
		
		//("as" alias = ID )?
		public Group getGroup_3() { return cGroup_3; }
		
		//"as"
		public Keyword getAsKeyword_3_0() { return cAsKeyword_3_0; }
		
		//alias = ID
		public Assignment getAliasAssignment_3_1() { return cAliasAssignment_3_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_3_1_0() { return cAliasIDTerminalRuleCall_3_1_0; }
		
		//contextBlock = BlockExpression
		public Assignment getContextBlockAssignment_4() { return cContextBlockAssignment_4; }
		
		//BlockExpression
		public RuleCall getContextBlockBlockExpressionParserRuleCall_4_0() { return cContextBlockBlockExpressionParserRuleCall_4_0; }
	}
	public class BlockExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChainedExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cExpressionsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cExpressionsTopLevelExpressionParserRuleCall_2_0_0 = (RuleCall)cExpressionsAssignment_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//BlockExpression returns Expression: {ChainedExpression}
		//    '{' (expressions += TopLevelExpression ';')* '}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{ChainedExpression}
		//   '{' (expressions += TopLevelExpression ';')* '}'
		public Group getGroup() { return cGroup; }
		
		//{ChainedExpression}
		public Action getChainedExpressionAction_0() { return cChainedExpressionAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(expressions += TopLevelExpression ';')*
		public Group getGroup_2() { return cGroup_2; }
		
		//expressions += TopLevelExpression
		public Assignment getExpressionsAssignment_2_0() { return cExpressionsAssignment_2_0; }
		
		//TopLevelExpression
		public RuleCall getExpressionsTopLevelExpressionParserRuleCall_2_0_0() { return cExpressionsTopLevelExpressionParserRuleCall_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1() { return cSemicolonKeyword_2_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Value");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Value returns  Expression : {VariableExpression}
		//    name = ID
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{VariableExpression}
		//   name = ID
		public Group getGroup() { return cGroup; }
		
		//{VariableExpression}
		public Action getVariableExpressionAction_0() { return cVariableExpressionAction_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class KeywordVariablesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.KeywordVariables");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final Keyword cNameInputKeyword_1_0_0 = (Keyword)cNameAlternatives_1_0.eContents().get(0);
		private final Keyword cNameOutputKeyword_1_0_1 = (Keyword)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cNameSourceKeyword_1_0_2 = (Keyword)cNameAlternatives_1_0.eContents().get(2);
		private final Keyword cNamePropertiesKeyword_1_0_3 = (Keyword)cNameAlternatives_1_0.eContents().get(3);
		private final Keyword cNameBuilderKeyword_1_0_4 = (Keyword)cNameAlternatives_1_0.eContents().get(4);
		private final Keyword cNameUnitKeyword_1_0_5 = (Keyword)cNameAlternatives_1_0.eContents().get(5);
		private final Keyword cNameThisKeyword_1_0_6 = (Keyword)cNameAlternatives_1_0.eContents().get(6);
		
		//KeywordVariables returns  Expression : {VariableExpression}
		//    name = ("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"    )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{VariableExpression}
		//   name = ("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"    )
		public Group getGroup() { return cGroup; }
		
		//{VariableExpression}
		public Action getVariableExpressionAction_0() { return cVariableExpressionAction_0; }
		
		//name = ("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"	)
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"	)
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//"input"
		public Keyword getNameInputKeyword_1_0_0() { return cNameInputKeyword_1_0_0; }
		
		//"output"
		public Keyword getNameOutputKeyword_1_0_1() { return cNameOutputKeyword_1_0_1; }
		
		//"source"
		public Keyword getNameSourceKeyword_1_0_2() { return cNameSourceKeyword_1_0_2; }
		
		//"properties"
		public Keyword getNamePropertiesKeyword_1_0_3() { return cNamePropertiesKeyword_1_0_3; }
		
		//"builder"
		public Keyword getNameBuilderKeyword_1_0_4() { return cNameBuilderKeyword_1_0_4; }
		
		//"unit"
		public Keyword getNameUnitKeyword_1_0_5() { return cNameUnitKeyword_1_0_5; }
		
		//"this"
		public Keyword getNameThisKeyword_1_0_6() { return cNameThisKeyword_1_0_6; }
	}
	public class FeatureCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FeatureCall");
		private final RuleCall cOperationCallParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FeatureCall returns Expression :
		//    OperationCall
		//// Removed (see BeeLang rev 1333)
		////    | ({CallFeature} "." name=ID  "(" (parameterList = ParameterList)? ")")
		////    | ({FeatureExpression} "." featureName=ID)
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//OperationCall
		public RuleCall getOperationCallParserRuleCall() { return cOperationCallParserRuleCall; }
	}
	public class OperationCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.OperationCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCallNamedFunctionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterListAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterListParameterListParserRuleCall_3_0 = (RuleCall)cParameterListAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OperationCall returns CallExpression : {CallNamedFunction}
		//    name=ID
		//    '(' (parameterList = ParameterList)? ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{CallNamedFunction}
		//   name=ID
		//   '(' (parameterList = ParameterList)? ')'
		public Group getGroup() { return cGroup; }
		
		//{CallNamedFunction}
		public Action getCallNamedFunctionAction_0() { return cCallNamedFunctionAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(parameterList = ParameterList)?
		public Assignment getParameterListAssignment_3() { return cParameterListAssignment_3; }
		
		//ParameterList
		public RuleCall getParameterListParameterListParserRuleCall_3_0() { return cParameterListParameterListParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ConstructorCallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ConstructorCallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCreateExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNewKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeExprIDTerminalRuleCall_2_0 = (RuleCall)cTypeExprAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParameterListAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cParameterListParameterListParserRuleCall_3_1_0 = (RuleCall)cParameterListAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAliasAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_4_1_0 = (RuleCall)cAliasAssignment_4_1.eContents().get(0);
		private final Assignment cContextBlockAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContextBlockInitializationBlockExpressionParserRuleCall_5_0 = (RuleCall)cContextBlockAssignment_5.eContents().get(0);
		
		//ConstructorCallExpression returns Expression : {CreateExpression}
		//    "new" typeExpr=ID
		//    ('(' (parameterList=ParameterList)? ')')?
		//    ("as" alias=ID)?
		//    (contextBlock = InitializationBlockExpression)?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{CreateExpression}
		//   "new" typeExpr=ID
		//   ('(' (parameterList=ParameterList)? ')')?
		//   ("as" alias=ID)?
		//   (contextBlock = InitializationBlockExpression)?
		public Group getGroup() { return cGroup; }
		
		//{CreateExpression}
		public Action getCreateExpressionAction_0() { return cCreateExpressionAction_0; }
		
		//"new"
		public Keyword getNewKeyword_1() { return cNewKeyword_1; }
		
		//typeExpr=ID
		public Assignment getTypeExprAssignment_2() { return cTypeExprAssignment_2; }
		
		//ID
		public RuleCall getTypeExprIDTerminalRuleCall_2_0() { return cTypeExprIDTerminalRuleCall_2_0; }
		
		//('(' (parameterList=ParameterList)? ')')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }
		
		//(parameterList=ParameterList)?
		public Assignment getParameterListAssignment_3_1() { return cParameterListAssignment_3_1; }
		
		//ParameterList
		public RuleCall getParameterListParameterListParserRuleCall_3_1_0() { return cParameterListParameterListParserRuleCall_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }
		
		//("as" alias=ID)?
		public Group getGroup_4() { return cGroup_4; }
		
		//"as"
		public Keyword getAsKeyword_4_0() { return cAsKeyword_4_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_4_1() { return cAliasAssignment_4_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_4_1_0() { return cAliasIDTerminalRuleCall_4_1_0; }
		
		//(contextBlock = InitializationBlockExpression)?
		public Assignment getContextBlockAssignment_5() { return cContextBlockAssignment_5; }
		
		//InitializationBlockExpression
		public RuleCall getContextBlockInitializationBlockExpressionParserRuleCall_5_0() { return cContextBlockInitializationBlockExpressionParserRuleCall_5_0; }
	}
	public class InitializationBlockExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InitializationBlockExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChainedExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionsInitializationExpressionParserRuleCall_2_0 = (RuleCall)cExpressionsAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InitializationBlockExpression returns Expression : {ChainedExpression}
		//    '{'  expressions += InitializationExpression ';' '}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{ChainedExpression}
		//   '{'  expressions += InitializationExpression ';' '}'
		public Group getGroup() { return cGroup; }
		
		//{ChainedExpression}
		public Action getChainedExpressionAction_0() { return cChainedExpressionAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//expressions += InitializationExpression
		public Assignment getExpressionsAssignment_2() { return cExpressionsAssignment_2; }
		
		//InitializationExpression
		public RuleCall getExpressionsInitializationExpressionParserRuleCall_2_0() { return cExpressionsInitializationExpressionParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InitializationExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InitializationExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAssignmentExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftExprFeatureOfThisParserRuleCall_1_0 = (RuleCall)cLeftExprAssignment_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cFunctionNameColonKeyword_2_0 = (Keyword)cFunctionNameAssignment_2.eContents().get(0);
		private final Assignment cRightExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRightExprExpressionParserRuleCall_3_0 = (RuleCall)cRightExprAssignment_3.eContents().get(0);
		
		//InitializationExpression returns Expression : {AssignmentExpression}
		//    leftExpr = FeatureOfThis functionName=":" rightExpr = Expression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{AssignmentExpression}
		//   leftExpr = FeatureOfThis functionName=":" rightExpr = Expression
		public Group getGroup() { return cGroup; }
		
		//{AssignmentExpression}
		public Action getAssignmentExpressionAction_0() { return cAssignmentExpressionAction_0; }
		
		//leftExpr = FeatureOfThis
		public Assignment getLeftExprAssignment_1() { return cLeftExprAssignment_1; }
		
		//FeatureOfThis
		public RuleCall getLeftExprFeatureOfThisParserRuleCall_1_0() { return cLeftExprFeatureOfThisParserRuleCall_1_0; }
		
		//functionName=":"
		public Assignment getFunctionNameAssignment_2() { return cFunctionNameAssignment_2; }
		
		//":"
		public Keyword getFunctionNameColonKeyword_2_0() { return cFunctionNameColonKeyword_2_0; }
		
		//rightExpr = Expression
		public Assignment getRightExprAssignment_3() { return cRightExprAssignment_3; }
		
		//Expression
		public RuleCall getRightExprExpressionParserRuleCall_3_0() { return cRightExprExpressionParserRuleCall_3_0; }
	}
	public class FeatureOfThisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FeatureOfThis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFeatureExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFeatureNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureNameIDTerminalRuleCall_1_0 = (RuleCall)cFeatureNameAssignment_1.eContents().get(0);
		
		//FeatureOfThis returns Expression : {FeatureExpression}
		//    featureName = ID
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{FeatureExpression}
		//   featureName = ID
		public Group getGroup() { return cGroup; }
		
		//{FeatureExpression}
		public Action getFeatureExpressionAction_0() { return cFeatureExpressionAction_0; }
		
		//featureName = ID
		public Assignment getFeatureNameAssignment_1() { return cFeatureNameAssignment_1; }
		
		//ID
		public RuleCall getFeatureNameIDTerminalRuleCall_1_0() { return cFeatureNameIDTerminalRuleCall_1_0; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cValueLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLiteralFunctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Literal returns Expression
		//    : ValueLiteral
		//    | LiteralFunction
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//ValueLiteral
		//   | LiteralFunction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ValueLiteral
		public RuleCall getValueLiteralParserRuleCall_0() { return cValueLiteralParserRuleCall_0; }
		
		//LiteralFunction
		public RuleCall getLiteralFunctionParserRuleCall_1() { return cLiteralFunctionParserRuleCall_1; }
	}
	public class LiteralFunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.LiteralFunction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cClosureExpressionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//LiteralFunction returns Expression :
		//    '{' ClosureExpression '}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'{' ClosureExpression '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//ClosureExpression
		public RuleCall getClosureExpressionParserRuleCall_1() { return cClosureExpressionParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class ClosureExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ClosureExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunctionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cReturnTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cReturnTypeTypeRefParserRuleCall_1_1_0 = (RuleCall)cReturnTypeAssignment_1_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cVerticalLineKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Assignment cParametersAssignment_2_0_1_0 = (Assignment)cGroup_2_0_1.eContents().get(0);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_2_0_1_0_0 = (RuleCall)cParametersAssignment_2_0_1_0.eContents().get(0);
		private final Group cGroup_2_0_1_1 = (Group)cGroup_2_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_1_0 = (Keyword)cGroup_2_0_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_0_1_1_1 = (Assignment)cGroup_2_0_1_1.eContents().get(1);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0 = (RuleCall)cParametersAssignment_2_0_1_1_1.eContents().get(0);
		private final Group cGroup_2_0_1_2 = (Group)cGroup_2_0_1.eContents().get(2);
		private final Keyword cCommaKeyword_2_0_1_2_0 = (Keyword)cGroup_2_0_1_2.eContents().get(0);
		private final Assignment cVarArgsAssignment_2_0_1_2_1 = (Assignment)cGroup_2_0_1_2.eContents().get(1);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0 = (Keyword)cVarArgsAssignment_2_0_1_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_0_1_2_2 = (Assignment)cGroup_2_0_1_2.eContents().get(2);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0 = (RuleCall)cParametersAssignment_2_0_1_2_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cVarArgsAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final Keyword cVarArgsFullStopFullStopFullStopKeyword_2_1_0_0 = (Keyword)cVarArgsAssignment_2_1_0.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParametersParameterDeclarationParserRuleCall_2_1_1_0 = (RuleCall)cParametersAssignment_2_1_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFuncExprAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFuncExprOneOrManyExpressionsParserRuleCall_4_0 = (RuleCall)cFuncExprAssignment_4.eContents().get(0);
		
		//ClosureExpression returns Expression: {Function}
		//    ('<' returnType=TypeRef '>')?
		//    ( '|'?
		//    (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
		//        (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//    |     (    varArgs?="..." parameters += ParameterDeclaration)
		//    )?
		//    '|' funcExpr=OneOrManyExpressions
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Function}
		//   ('<' returnType=TypeRef '>')?
		//   ( '|'?
		//   (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
		//       (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//   |     (    varArgs?="..." parameters += ParameterDeclaration)
		//   )?
		//   '|' funcExpr=OneOrManyExpressions
		public Group getGroup() { return cGroup; }
		
		//{Function}
		public Action getFunctionAction_0() { return cFunctionAction_0; }
		
		//('<' returnType=TypeRef '>')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }
		
		//returnType=TypeRef
		public Assignment getReturnTypeAssignment_1_1() { return cReturnTypeAssignment_1_1; }
		
		//TypeRef
		public RuleCall getReturnTypeTypeRefParserRuleCall_1_1_0() { return cReturnTypeTypeRefParserRuleCall_1_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1_2() { return cGreaterThanSignKeyword_1_2; }
		
		//( '|'?
		//(parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
		//    (',' varArgs?="..." parameters += ParameterDeclaration)?)
		//|     (    varArgs?="..." parameters += ParameterDeclaration)
		//)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'|'?
		//   (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
		//       (',' varArgs?="..." parameters += ParameterDeclaration)?)
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'|'?
		public Keyword getVerticalLineKeyword_2_0_0() { return cVerticalLineKeyword_2_0_0; }
		
		//(parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
		//    (',' varArgs?="..." parameters += ParameterDeclaration)?)
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_2_0_1_0() { return cParametersAssignment_2_0_1_0; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_2_0_1_0_0() { return cParametersParameterDeclarationParserRuleCall_2_0_1_0_0; }
		
		//(',' parameters += ParameterDeclaration)*
		public Group getGroup_2_0_1_1() { return cGroup_2_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_1_0() { return cCommaKeyword_2_0_1_1_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_2_0_1_1_1() { return cParametersAssignment_2_0_1_1_1; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0() { return cParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0; }
		
		//(',' varArgs?="..." parameters += ParameterDeclaration)?
		public Group getGroup_2_0_1_2() { return cGroup_2_0_1_2; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_2_0() { return cCommaKeyword_2_0_1_2_0; }
		
		//varArgs?="..."
		public Assignment getVarArgsAssignment_2_0_1_2_1() { return cVarArgsAssignment_2_0_1_2_1; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0() { return cVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_2_0_1_2_2() { return cParametersAssignment_2_0_1_2_2; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0() { return cParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0; }
		
		//(    varArgs?="..." parameters += ParameterDeclaration)
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//varArgs?="..."
		public Assignment getVarArgsAssignment_2_1_0() { return cVarArgsAssignment_2_1_0; }
		
		//"..."
		public Keyword getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0() { return cVarArgsFullStopFullStopFullStopKeyword_2_1_0_0; }
		
		//parameters += ParameterDeclaration
		public Assignment getParametersAssignment_2_1_1() { return cParametersAssignment_2_1_1; }
		
		//ParameterDeclaration
		public RuleCall getParametersParameterDeclarationParserRuleCall_2_1_1_0() { return cParametersParameterDeclarationParserRuleCall_2_1_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_3() { return cVerticalLineKeyword_3; }
		
		//funcExpr=OneOrManyExpressions
		public Assignment getFuncExprAssignment_4() { return cFuncExprAssignment_4; }
		
		//OneOrManyExpressions
		public RuleCall getFuncExprOneOrManyExpressionsParserRuleCall_4_0() { return cFuncExprOneOrManyExpressionsParserRuleCall_4_0; }
	}
	public class OneOrManyExpressionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.OneOrManyExpressions");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBlockExpressionWithoutBracketsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//OneOrManyExpressions returns Expression
		//    : BlockExpressionWithoutBrackets
		//    | Expression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//BlockExpressionWithoutBrackets
		//   | Expression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BlockExpressionWithoutBrackets
		public RuleCall getBlockExpressionWithoutBracketsParserRuleCall_0() { return cBlockExpressionWithoutBracketsParserRuleCall_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
	}
	public class BlockExpressionWithoutBracketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpressionWithoutBrackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChainedExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cExpressionsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionsTopLevelExpressionParserRuleCall_1_0_0 = (RuleCall)cExpressionsAssignment_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//BlockExpressionWithoutBrackets returns Expression : {ChainedExpression}
		//    (expressions += TopLevelExpression ';')+
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{ChainedExpression}
		//   (expressions += TopLevelExpression ';')+
		public Group getGroup() { return cGroup; }
		
		//{ChainedExpression}
		public Action getChainedExpressionAction_0() { return cChainedExpressionAction_0; }
		
		//(expressions += TopLevelExpression ';')+
		public Group getGroup_1() { return cGroup_1; }
		
		//expressions += TopLevelExpression
		public Assignment getExpressionsAssignment_1_0() { return cExpressionsAssignment_1_0; }
		
		//TopLevelExpression
		public RuleCall getExpressionsTopLevelExpressionParserRuleCall_1_0_0() { return cExpressionsTopLevelExpressionParserRuleCall_1_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_1() { return cSemicolonKeyword_1_1; }
	}
	public class ValueLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ValueLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//ValueLiteral:
		//    value = STRING
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//value = STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class ParanthesizedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParanthesizedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParanthesizedExpression returns Expression :
		//    '(' Expression ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Expression ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class QIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.QID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cHEXTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Alternatives cAlternatives_2_2 = (Alternatives)cGroup_2.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_2_2_0 = (RuleCall)cAlternatives_2_2.eContents().get(0);
		private final RuleCall cHEXTerminalRuleCall_2_2_1 = (RuleCall)cAlternatives_2_2.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2_2_2 = (RuleCall)cAlternatives_2_2.eContents().get(2);
		
		//// Qualified name
		//QID hidden(): ID (INT|HEX|ID)* ('.' ID (INT|HEX|ID)*)* ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID (INT|HEX|ID)* ('.' ID (INT|HEX|ID)*)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//(INT|HEX|ID)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//HEX
		public RuleCall getHEXTerminalRuleCall_1_1() { return cHEXTerminalRuleCall_1_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_2() { return cIDTerminalRuleCall_1_2; }
		
		//('.' ID (INT|HEX|ID)*)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
		
		//(INT|HEX|ID)*
		public Alternatives getAlternatives_2_2() { return cAlternatives_2_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2_0() { return cINTTerminalRuleCall_2_2_0; }
		
		//HEX
		public RuleCall getHEXTerminalRuleCall_2_2_1() { return cHEXTerminalRuleCall_2_2_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_2_2() { return cIDTerminalRuleCall_2_2_2; }
	}
	
	
	private final ModelElements pModel;
	private final UnitElements pUnit;
	private final ProvidedCapabilityElements pProvidedCapability;
	private final AliasedRequiredCapabilityElements pAliasedRequiredCapability;
	private final RequiredCapabilityElements pRequiredCapability;
	private final PathElements pPath;
	private final ParameterListElements pParameterList;
	private final FirstParameterElements pFirstParameter;
	private final ParameterElements pParameter;
	private final ClosureParameterElements pClosureParameter;
	private final ParameterDeclarationElements pParameterDeclaration;
	private final FunctionElements pFunction;
	private final GuardExpressionElements pGuardExpression;
	private final AssignmentOperatorElements pAssignmentOperator;
	private final RelationalOperatorElements pRelationalOperator;
	private final TopLevelExpressionElements pTopLevelExpression;
	private final ExpressionElements pExpression;
	private final AssignmentExpressionElements pAssignmentExpression;
	private final VarDeclarationElements pVarDeclaration;
	private final ValDeclarationElements pValDeclaration;
	private final TypeRefElements pTypeRef;
	private final SimpleTypeRefElements pSimpleTypeRef;
	private final ClosureTypeRefElements pClosureTypeRef;
	private final CachedExpressionElements pCachedExpression;
	private final OrExpressionElements pOrExpression;
	private final AndExpressionElements pAndExpression;
	private final RelationalExpressionElements pRelationalExpression;
	private final AdditiveExpressionElements pAdditiveExpression;
	private final MultiplicativeExpressionElements pMultiplicativeExpression;
	private final SetExpressionElements pSetExpression;
	private final UnaryOrInfixExpressionElements pUnaryOrInfixExpression;
	private final UnaryExpressionElements pUnaryExpression;
	private final PreopExpressionElements pPreopExpression;
	private final PostopExpressionElements pPostopExpression;
	private final InfixExpressionElements pInfixExpression;
	private final CallExpressionElements pCallExpression;
	private final PrimaryExpressionElements pPrimaryExpression;
	private final WithExpressionElements pWithExpression;
	private final WithContextExpressionElements pWithContextExpression;
	private final BlockExpressionElements pBlockExpression;
	private final ValueElements pValue;
	private final KeywordVariablesElements pKeywordVariables;
	private final FeatureCallElements pFeatureCall;
	private final OperationCallElements pOperationCall;
	private final ConstructorCallExpressionElements pConstructorCallExpression;
	private final InitializationBlockExpressionElements pInitializationBlockExpression;
	private final InitializationExpressionElements pInitializationExpression;
	private final FeatureOfThisElements pFeatureOfThis;
	private final LiteralElements pLiteral;
	private final LiteralFunctionElements pLiteralFunction;
	private final ClosureExpressionElements pClosureExpression;
	private final OneOrManyExpressionsElements pOneOrManyExpressions;
	private final BlockExpressionWithoutBracketsElements pBlockExpressionWithoutBrackets;
	private final ValueLiteralElements pValueLiteral;
	private final ParanthesizedExpressionElements pParanthesizedExpression;
	private final QIDElements pQID;
	private final TerminalRule tDOCUMENTATION;
	private final TerminalRule tHEX;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BeeLangTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pUnit = new UnitElements();
		this.pProvidedCapability = new ProvidedCapabilityElements();
		this.pAliasedRequiredCapability = new AliasedRequiredCapabilityElements();
		this.pRequiredCapability = new RequiredCapabilityElements();
		this.pPath = new PathElements();
		this.pParameterList = new ParameterListElements();
		this.pFirstParameter = new FirstParameterElements();
		this.pParameter = new ParameterElements();
		this.pClosureParameter = new ClosureParameterElements();
		this.pParameterDeclaration = new ParameterDeclarationElements();
		this.pFunction = new FunctionElements();
		this.pGuardExpression = new GuardExpressionElements();
		this.pAssignmentOperator = new AssignmentOperatorElements();
		this.pRelationalOperator = new RelationalOperatorElements();
		this.pTopLevelExpression = new TopLevelExpressionElements();
		this.pExpression = new ExpressionElements();
		this.pAssignmentExpression = new AssignmentExpressionElements();
		this.pVarDeclaration = new VarDeclarationElements();
		this.pValDeclaration = new ValDeclarationElements();
		this.pTypeRef = new TypeRefElements();
		this.pSimpleTypeRef = new SimpleTypeRefElements();
		this.pClosureTypeRef = new ClosureTypeRefElements();
		this.pCachedExpression = new CachedExpressionElements();
		this.pOrExpression = new OrExpressionElements();
		this.pAndExpression = new AndExpressionElements();
		this.pRelationalExpression = new RelationalExpressionElements();
		this.pAdditiveExpression = new AdditiveExpressionElements();
		this.pMultiplicativeExpression = new MultiplicativeExpressionElements();
		this.pSetExpression = new SetExpressionElements();
		this.pUnaryOrInfixExpression = new UnaryOrInfixExpressionElements();
		this.pUnaryExpression = new UnaryExpressionElements();
		this.pPreopExpression = new PreopExpressionElements();
		this.pPostopExpression = new PostopExpressionElements();
		this.pInfixExpression = new InfixExpressionElements();
		this.pCallExpression = new CallExpressionElements();
		this.pPrimaryExpression = new PrimaryExpressionElements();
		this.pWithExpression = new WithExpressionElements();
		this.pWithContextExpression = new WithContextExpressionElements();
		this.pBlockExpression = new BlockExpressionElements();
		this.pValue = new ValueElements();
		this.pKeywordVariables = new KeywordVariablesElements();
		this.pFeatureCall = new FeatureCallElements();
		this.pOperationCall = new OperationCallElements();
		this.pConstructorCallExpression = new ConstructorCallExpressionElements();
		this.pInitializationBlockExpression = new InitializationBlockExpressionElements();
		this.pInitializationExpression = new InitializationExpressionElements();
		this.pFeatureOfThis = new FeatureOfThisElements();
		this.pLiteral = new LiteralElements();
		this.pLiteralFunction = new LiteralFunctionElements();
		this.pClosureExpression = new ClosureExpressionElements();
		this.pOneOrManyExpressions = new OneOrManyExpressionsElements();
		this.pBlockExpressionWithoutBrackets = new BlockExpressionWithoutBracketsElements();
		this.pValueLiteral = new ValueLiteralElements();
		this.pParanthesizedExpression = new ParanthesizedExpressionElements();
		this.pQID = new QIDElements();
		this.tDOCUMENTATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.DOCUMENTATION");
		this.tHEX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.HEX");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage".equals(grammar.getName())) {
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

	
	//// Initially copied from BeeLang.xtext rev 1029
	//Model:
	//      (units += Unit)*
	//    | (functions += Function)*
	//    ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Unit : {Unit}
	//    (documentation = DOCUMENTATION)?
	//    'unit' (name=ID)? ('version' version = ID)?
	//        ('implements' implements += SimpleTypeRef (',' implements+=SimpleTypeRef)*)?
	//    '{'
	//        ( ('source' ':' sourceLocation = Path ';')?
	//        & ('output' ':' outputLocation = Path ';')?
	//        & ('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
	//        & ('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
	//        & ('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
	//        & (functions += Function )*
	//        )
	//    '}';
	public UnitElements getUnitAccess() {
		return pUnit;
	}
	
	public ParserRule getUnitRule() {
		return getUnitAccess().getRule();
	}
	
	//ProvidedCapability: {ProvidedCapability}
	//    ((nameSpace=ID) | "unit")
	//    ('{'
	//         (
	//           ('when' ':' condExpr = Expression ';')?
	//        & ("name" ':' name = ID ';')
	//        & ("version" ':' version = ID ';')?
	//        )
	//    '}')?
	//;
	public ProvidedCapabilityElements getProvidedCapabilityAccess() {
		return pProvidedCapability;
	}
	
	public ParserRule getProvidedCapabilityRule() {
		return getProvidedCapabilityAccess().getRule();
	}
	
	//AliasedRequiredCapability:
	//    ((nameSpace=ID) | "unit") name=ID ("as" alias = ID)?
	//    ('{'
	//        ( ('when' ':' condExpr=Expression ';')?
	//        & (greedy ?= "greedy" ';')?
	//        & ("requires-min" ':' min = INT ';' )?
	//        & ("requires-max" ':' max  = INT ';')?
	//        & ("version" ':' versionRange = ID ';')?
	//          )
	//    '}')
	//    ;
	public AliasedRequiredCapabilityElements getAliasedRequiredCapabilityAccess() {
		return pAliasedRequiredCapability;
	}
	
	public ParserRule getAliasedRequiredCapabilityRule() {
		return getAliasedRequiredCapabilityAccess().getRule();
	}
	
	//RequiredCapability returns RequiredCapability : {RequiredCapability}
	//    ((nameSpace=ID) | "unit") name=ID
	//    ('{'
	//        ( ('when' ':' condExpr=Expression ';')?
	//        & (greedy ?= "greedy" ';')?
	//        & ("requires-min" ':' min = INT ';' )?
	//        & ("requires-max" ':' max  = INT ';')?
	//        & ("version" ':' versionRange = ID ';')?
	//          )
	//    '}')
	//    ;
	public RequiredCapabilityElements getRequiredCapabilityAccess() {
		return pRequiredCapability;
	}
	
	public ParserRule getRequiredCapabilityRule() {
		return getRequiredCapabilityAccess().getRule();
	}
	
	//Path hidden()
	//    : STRING
	//    | ('/')? QID ('/' QID)* ('/')?
	//    ;
	public PathElements getPathAccess() {
		return pPath;
	}
	
	public ParserRule getPathRule() {
		return getPathAccess().getRule();
	}
	
	//ParameterList :
	//    parameters += FirstParameter ("," parameters += FirstParameter)*
	//    ;
	public ParameterListElements getParameterListAccess() {
		return pParameterList;
	}
	
	public ParserRule getParameterListRule() {
		return getParameterListAccess().getRule();
	}
	
	//FirstParameter returns Parameter
	//    : ClosureParameter
	//    | Parameter
	//    ;
	public FirstParameterElements getFirstParameterAccess() {
		return pFirstParameter;
	}
	
	public ParserRule getFirstParameterRule() {
		return getFirstParameterAccess().getRule();
	}
	
	//Parameter :
	//    expr = Expression
	//    ;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//ClosureParameter :
	//    (expr = ClosureExpression)
	//    ;
	public ClosureParameterElements getClosureParameterAccess() {
		return pClosureParameter;
	}
	
	public ParserRule getClosureParameterRule() {
		return getClosureParameterAccess().getRule();
	}
	
	//ParameterDeclaration :
	//    ((type=TypeRef)? name = ID)
	//    ;
	public ParameterDeclarationElements getParameterDeclarationAccess() {
		return pParameterDeclaration;
	}
	
	public ParserRule getParameterDeclarationRule() {
		return getParameterDeclarationAccess().getRule();
	}
	
	//Function :
	//    (documentation = DOCUMENTATION)?
	//       (visibility = ID)?
	//       (final ?= "final")?
	//       "function"
	//       (returnType = TypeRef)?
	//       name=ID
	//       ('(' (
	//           (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
	//           | (varArgs ?= "..." parameters += ParameterDeclaration)
	//           )? ')' )?
	//       ("when" guard = GuardExpression)?
	//       ((':' funcExpr=Expression ';') | (funcExpr=BlockExpression))
	//    ;
	public FunctionElements getFunctionAccess() {
		return pFunction;
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//GuardExpression:
	//    (':' guardExpr = Expression ';') | (guardExpr = BlockExpression)
	//    ;
	public GuardExpressionElements getGuardExpressionAccess() {
		return pGuardExpression;
	}
	
	public ParserRule getGuardExpressionRule() {
		return getGuardExpressionAccess().getRule();
	}
	
	//AssignmentOperator
	//    : '=' | '+=' | '-=' | '*='    | '/=' | "%="
	//    ;
	public AssignmentOperatorElements getAssignmentOperatorAccess() {
		return pAssignmentOperator;
	}
	
	public ParserRule getAssignmentOperatorRule() {
		return getAssignmentOperatorAccess().getRule();
	}
	
	//RelationalOperator
	//    : "~=" | "==" | "===" | "!=" | "!=="
	//    | ">=" | "<=" | ">" | "<"
	//    ;
	public RelationalOperatorElements getRelationalOperatorAccess() {
		return pRelationalOperator;
	}
	
	public ParserRule getRelationalOperatorRule() {
		return getRelationalOperatorAccess().getRule();
	}
	
	//TopLevelExpression returns Expression
	//    : VarDeclaration
	//    | ValDeclaration
	//    | AssignmentExpression
	//    ;
	public TopLevelExpressionElements getTopLevelExpressionAccess() {
		return pTopLevelExpression;
	}
	
	public ParserRule getTopLevelExpressionRule() {
		return getTopLevelExpressionAccess().getRule();
	}
	
	//Expression returns Expression
	//    : AssignmentExpression
	//    ;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//AssignmentExpression returns Expression :
	//      CachedExpression ({AssignmentExpression.leftExpr=current}
	//         functionName=AssignmentOperator rightExpr=AssignmentExpression)?
	//    ;
	public AssignmentExpressionElements getAssignmentExpressionAccess() {
		return pAssignmentExpression;
	}
	
	public ParserRule getAssignmentExpressionRule() {
		return getAssignmentExpressionAccess().getRule();
	}
	
	//VarDeclaration returns Expression : {DefValue}
	//    (final ?= "final")?
	//    (( "var" |  type=TypeRef ) name=ID)
	//    ('=' valueExpr = Expression)?
	//    ;
	public VarDeclarationElements getVarDeclarationAccess() {
		return pVarDeclaration;
	}
	
	public ParserRule getVarDeclarationRule() {
		return getVarDeclarationAccess().getRule();
	}
	
	//ValDeclaration returns Expression : {DefValue}
	//    (final ?= "final")?
	//    immutable ?= "val" (type=TypeRef)? name=ID
	//    '=' valueExpr = Expression
	//    ;
	public ValDeclarationElements getValDeclarationAccess() {
		return pValDeclaration;
	}
	
	public ParserRule getValDeclarationRule() {
		return getValDeclarationAccess().getRule();
	}
	
	//TypeRef
	//    : ClosureTypeRef
	//    | SimpleTypeRef
	//    ;
	public TypeRefElements getTypeRefAccess() {
		return pTypeRef;
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//SimpleTypeRef :
	//    rawType=ID
	//        ('<' actualArgumentsList+=ID (',' actualArgumentsList+=ID)* '>' )?
	//    ;
	public SimpleTypeRefElements getSimpleTypeRefAccess() {
		return pSimpleTypeRef;
	}
	
	public ParserRule getSimpleTypeRefRule() {
		return getSimpleTypeRefAccess().getRule();
	}
	
	//ClosureTypeRef :
	//    ('('(
	//        (parameterTypes += ID (',' parameterTypes += ID)*
	//            (',' varArgs ?= "..." parameterTypes += ID )?)
	//        |     (    varArgs ?= "..." parameterTypes += ID)
	//        )?
	//    ')' '=>' returnType = ID )
	//    ;
	public ClosureTypeRefElements getClosureTypeRefAccess() {
		return pClosureTypeRef;
	}
	
	public ParserRule getClosureTypeRefRule() {
		return getClosureTypeRefAccess().getRule();
	}
	
	//CachedExpression returns Expression  :
	//    ({CachedExpression} "cached" expr = OrExpression)
	//    | OrExpression
	//    ;
	public CachedExpressionElements getCachedExpressionAccess() {
		return pCachedExpression;
	}
	
	public ParserRule getCachedExpressionRule() {
		return getCachedExpressionAccess().getRule();
	}
	
	//OrExpression returns Expression :
	//    AndExpression ({OrExpression.leftExpr=current} "||" rightExpr=AndExpression)*
	//    ;
	public OrExpressionElements getOrExpressionAccess() {
		return pOrExpression;
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}
	
	//AndExpression returns Expression :
	//    RelationalExpression ({AndExpression.leftExpr=current} "&&" rightExpr=RelationalExpression)*
	//    ;
	public AndExpressionElements getAndExpressionAccess() {
		return pAndExpression;
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}
	
	//RelationalExpression returns Expression :
	//    AdditiveExpression ({BinaryOpExpression.leftExpr=current}
	//        functionName=RelationalOperator rightExpr=AdditiveExpression)*
	//    ;
	public RelationalExpressionElements getRelationalExpressionAccess() {
		return pRelationalExpression;
	}
	
	public ParserRule getRelationalExpressionRule() {
		return getRelationalExpressionAccess().getRule();
	}
	
	//AdditiveExpression returns Expression :
	//    MultiplicativeExpression ({BinaryOpExpression.leftExpr=current} functionName=("+" | "-") rightExpr=MultiplicativeExpression)*
	//    ;
	public AdditiveExpressionElements getAdditiveExpressionAccess() {
		return pAdditiveExpression;
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}
	
	//MultiplicativeExpression returns Expression :
	//    SetExpression ({BinaryOpExpression.leftExpr=current} functionName=("*" | "/" | "%") rightExpr=SetExpression)*
	//    ;
	public MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return pMultiplicativeExpression;
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}
	
	//SetExpression returns Expression:
	//    UnaryOrInfixExpression ({BinaryOpExpression.leftExpr=current} functionName=".." rightExpr=UnaryOrInfixExpression)*
	//    ;
	public SetExpressionElements getSetExpressionAccess() {
		return pSetExpression;
	}
	
	public ParserRule getSetExpressionRule() {
		return getSetExpressionAccess().getRule();
	}
	
	//UnaryOrInfixExpression returns Expression
	//    : PostopExpression
	//    | UnaryExpression
	//    | PreopExpression
	//    ;
	public UnaryOrInfixExpressionElements getUnaryOrInfixExpressionAccess() {
		return pUnaryOrInfixExpression;
	}
	
	public ParserRule getUnaryOrInfixExpressionRule() {
		return getUnaryOrInfixExpressionAccess().getRule();
	}
	
	//UnaryExpression returns Expression : {UnaryOpExpression}
	//    functionName=("!" | "-") expr=InfixExpression
	//    ;
	public UnaryExpressionElements getUnaryExpressionAccess() {
		return pUnaryExpression;
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}
	
	//PreopExpression returns Expression : {UnaryPreOpExpression}
	//    functionName=("++" | "--") expr=InfixExpression
	//    ;
	public PreopExpressionElements getPreopExpressionAccess() {
		return pPreopExpression;
	}
	
	public ParserRule getPreopExpressionRule() {
		return getPreopExpressionAccess().getRule();
	}
	
	//PostopExpression returns Expression :
	//    InfixExpression ({UnaryPostOpExpression.expr=current} functionName = ("--" | "++"))?
	//    ;
	public PostopExpressionElements getPostopExpressionAccess() {
		return pPostopExpression;
	}
	
	public ParserRule getPostopExpressionRule() {
		return getPostopExpressionAccess().getRule();
	}
	
	//InfixExpression returns Expression :
	//    CallExpression (
	//          ({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
	//      |    ({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
	//      | ({FeatureExpression.objExpr=current} "." featureName=ID)
	//    )*;
	public InfixExpressionElements getInfixExpressionAccess() {
		return pInfixExpression;
	}
	
	public ParserRule getInfixExpressionRule() {
		return getInfixExpressionAccess().getRule();
	}
	
	//CallExpression returns Expression :
	//    PrimaryExpression ({CallFunction.funcExpr=current}"(" (parameterList = ParameterList)? ")")*
	//    ;
	public CallExpressionElements getCallExpressionAccess() {
		return pCallExpression;
	}
	
	public ParserRule getCallExpressionRule() {
		return getCallExpressionAccess().getRule();
	}
	
	//PrimaryExpression returns Expression
	//    : FeatureCall
	//    | ConstructorCallExpression
	//    | Value
	//    | Literal
	//    | KeywordVariables
	//    | ParanthesizedExpression
	//    | BlockExpression
	//    | WithExpression
	//    | WithContextExpression
	//    ;
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return pPrimaryExpression;
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}
	
	//WithExpression returns WithExpression :
	//        'with'
	//        ( referencedAdvice += ID (',' referencedAdvice += ID)* )?
	//        ( (':' funcExpr = Expression ) | ('{' funcExpr = BlockExpressionWithoutBrackets '}' ) )
	//        ;
	public WithExpressionElements getWithExpressionAccess() {
		return pWithExpression;
	}
	
	public ParserRule getWithExpressionRule() {
		return getWithExpressionAccess().getRule();
	}
	
	//WithContextExpression returns WithContextExpression :
	//    "with" "context" expr = Expression ("as" alias = ID )? contextBlock = BlockExpression
	//    ;
	public WithContextExpressionElements getWithContextExpressionAccess() {
		return pWithContextExpression;
	}
	
	public ParserRule getWithContextExpressionRule() {
		return getWithContextExpressionAccess().getRule();
	}
	
	//BlockExpression returns Expression: {ChainedExpression}
	//    '{' (expressions += TopLevelExpression ';')* '}'
	//    ;
	public BlockExpressionElements getBlockExpressionAccess() {
		return pBlockExpression;
	}
	
	public ParserRule getBlockExpressionRule() {
		return getBlockExpressionAccess().getRule();
	}
	
	//Value returns  Expression : {VariableExpression}
	//    name = ID
	//    ;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//KeywordVariables returns  Expression : {VariableExpression}
	//    name = ("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"    )
	//    ;
	public KeywordVariablesElements getKeywordVariablesAccess() {
		return pKeywordVariables;
	}
	
	public ParserRule getKeywordVariablesRule() {
		return getKeywordVariablesAccess().getRule();
	}
	
	//FeatureCall returns Expression :
	//    OperationCall
	//// Removed (see BeeLang rev 1333)
	////    | ({CallFeature} "." name=ID  "(" (parameterList = ParameterList)? ")")
	////    | ({FeatureExpression} "." featureName=ID)
	//    ;
	public FeatureCallElements getFeatureCallAccess() {
		return pFeatureCall;
	}
	
	public ParserRule getFeatureCallRule() {
		return getFeatureCallAccess().getRule();
	}
	
	//OperationCall returns CallExpression : {CallNamedFunction}
	//    name=ID
	//    '(' (parameterList = ParameterList)? ')'
	//    ;
	public OperationCallElements getOperationCallAccess() {
		return pOperationCall;
	}
	
	public ParserRule getOperationCallRule() {
		return getOperationCallAccess().getRule();
	}
	
	//ConstructorCallExpression returns Expression : {CreateExpression}
	//    "new" typeExpr=ID
	//    ('(' (parameterList=ParameterList)? ')')?
	//    ("as" alias=ID)?
	//    (contextBlock = InitializationBlockExpression)?
	//    ;
	public ConstructorCallExpressionElements getConstructorCallExpressionAccess() {
		return pConstructorCallExpression;
	}
	
	public ParserRule getConstructorCallExpressionRule() {
		return getConstructorCallExpressionAccess().getRule();
	}
	
	//InitializationBlockExpression returns Expression : {ChainedExpression}
	//    '{'  expressions += InitializationExpression ';' '}'
	//    ;
	public InitializationBlockExpressionElements getInitializationBlockExpressionAccess() {
		return pInitializationBlockExpression;
	}
	
	public ParserRule getInitializationBlockExpressionRule() {
		return getInitializationBlockExpressionAccess().getRule();
	}
	
	//InitializationExpression returns Expression : {AssignmentExpression}
	//    leftExpr = FeatureOfThis functionName=":" rightExpr = Expression
	//    ;
	public InitializationExpressionElements getInitializationExpressionAccess() {
		return pInitializationExpression;
	}
	
	public ParserRule getInitializationExpressionRule() {
		return getInitializationExpressionAccess().getRule();
	}
	
	//FeatureOfThis returns Expression : {FeatureExpression}
	//    featureName = ID
	//    ;
	public FeatureOfThisElements getFeatureOfThisAccess() {
		return pFeatureOfThis;
	}
	
	public ParserRule getFeatureOfThisRule() {
		return getFeatureOfThisAccess().getRule();
	}
	
	//Literal returns Expression
	//    : ValueLiteral
	//    | LiteralFunction
	//    ;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//LiteralFunction returns Expression :
	//    '{' ClosureExpression '}'
	//    ;
	public LiteralFunctionElements getLiteralFunctionAccess() {
		return pLiteralFunction;
	}
	
	public ParserRule getLiteralFunctionRule() {
		return getLiteralFunctionAccess().getRule();
	}
	
	//ClosureExpression returns Expression: {Function}
	//    ('<' returnType=TypeRef '>')?
	//    ( '|'?
	//    (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
	//        (',' varArgs?="..." parameters += ParameterDeclaration)?)
	//    |     (    varArgs?="..." parameters += ParameterDeclaration)
	//    )?
	//    '|' funcExpr=OneOrManyExpressions
	//    ;
	public ClosureExpressionElements getClosureExpressionAccess() {
		return pClosureExpression;
	}
	
	public ParserRule getClosureExpressionRule() {
		return getClosureExpressionAccess().getRule();
	}
	
	//OneOrManyExpressions returns Expression
	//    : BlockExpressionWithoutBrackets
	//    | Expression
	//    ;
	public OneOrManyExpressionsElements getOneOrManyExpressionsAccess() {
		return pOneOrManyExpressions;
	}
	
	public ParserRule getOneOrManyExpressionsRule() {
		return getOneOrManyExpressionsAccess().getRule();
	}
	
	//BlockExpressionWithoutBrackets returns Expression : {ChainedExpression}
	//    (expressions += TopLevelExpression ';')+
	//    ;
	public BlockExpressionWithoutBracketsElements getBlockExpressionWithoutBracketsAccess() {
		return pBlockExpressionWithoutBrackets;
	}
	
	public ParserRule getBlockExpressionWithoutBracketsRule() {
		return getBlockExpressionWithoutBracketsAccess().getRule();
	}
	
	//ValueLiteral:
	//    value = STRING
	//    ;
	public ValueLiteralElements getValueLiteralAccess() {
		return pValueLiteral;
	}
	
	public ParserRule getValueLiteralRule() {
		return getValueLiteralAccess().getRule();
	}
	
	//ParanthesizedExpression returns Expression :
	//    '(' Expression ')'
	//    ;
	public ParanthesizedExpressionElements getParanthesizedExpressionAccess() {
		return pParanthesizedExpression;
	}
	
	public ParserRule getParanthesizedExpressionRule() {
		return getParanthesizedExpressionAccess().getRule();
	}
	
	//// Qualified name
	//QID hidden(): ID (INT|HEX|ID)* ('.' ID (INT|HEX|ID)*)* ;
	public QIDElements getQIDAccess() {
		return pQID;
	}
	
	public ParserRule getQIDRule() {
		return getQIDAccess().getRule();
	}
	
	//terminal DOCUMENTATION : '/**' -> '*/' ;
	public TerminalRule getDOCUMENTATIONRule() {
		return tDOCUMENTATION;
	}
	
	//terminal HEX : '0' ('x'|'X')(('0'..'9')|('a'..'f')|('A'..'F'))+ ;
	public TerminalRule getHEXRule() {
		return tHEX;
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
