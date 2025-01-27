/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.serializer.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class AssignmentFinderTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignDigitZeroDigitZeroKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cKeywordValAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cKeywordValKeywordValParserRuleCall_0_1_0 = (RuleCall)cKeywordValAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNumberSignDigitZeroDigitOneKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTerminalValAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTerminalValTerminalValParserRuleCall_1_1_0 = (RuleCall)cTerminalValAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cNumberSignDigitZeroDigitTwoKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEnumValAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEnumValEnumValParserRuleCall_2_1_0 = (RuleCall)cEnumValAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cNumberSignDigitZeroDigitThreeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cKeywordBoolAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cKeywordBoolKeywordBoolParserRuleCall_3_1_0 = (RuleCall)cKeywordBoolAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cNumberSignDigitZeroDigitFourKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTerminalBoolAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTerminalBoolTerminalBoolParserRuleCall_4_1_0 = (RuleCall)cTerminalBoolAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cNumberSignDigitZeroDigitFiveKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEnumBoolAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEnumBoolEnumBoolParserRuleCall_5_1_0 = (RuleCall)cEnumBoolAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cNumberSignDigitZeroDigitSixKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cMixedBoolAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cMixedBoolMixedBoolParserRuleCall_6_1_0 = (RuleCall)cMixedBoolAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cNumberSignDigitZeroDigitSevenKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cMixedValueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cMixedValueMixedValueParserRuleCall_7_1_0 = (RuleCall)cMixedValueAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cNumberSignDigitZeroDigitEightKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cContainmentRefAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cContainmentRefContainmentRefParserRuleCall_8_1_0 = (RuleCall)cContainmentRefAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Keyword cNumberSignDigitZeroDigitNineKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cCrossRefAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cCrossRefCrossRefParserRuleCall_9_1_0 = (RuleCall)cCrossRefAssignment_9_1.eContents().get(0);
		
		//Model:
		//    ("#00" keywordVal=KeywordVal) |
		//    ("#01" terminalVal=TerminalVal) |
		//    ("#02" enumVal=EnumVal) |
		//    ("#03" keywordBool=KeywordBool) |
		//    ("#04" terminalBool=TerminalBool) |
		//    ("#05" enumBool=EnumBool) |
		//    ("#06" mixedBool=MixedBool) |
		//    ("#07" mixedValue=MixedValue) |
		//    ("#08" containmentRef=ContainmentRef) |
		//    ("#09" crossRef=CrossRef);
		@Override public ParserRule getRule() { return rule; }
		
		//("#00" keywordVal=KeywordVal) |
		//("#01" terminalVal=TerminalVal) |
		//("#02" enumVal=EnumVal) |
		//("#03" keywordBool=KeywordBool) |
		//("#04" terminalBool=TerminalBool) |
		//("#05" enumBool=EnumBool) |
		//("#06" mixedBool=MixedBool) |
		//("#07" mixedValue=MixedValue) |
		//("#08" containmentRef=ContainmentRef) |
		//("#09" crossRef=CrossRef)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//("#00" keywordVal=KeywordVal)
		public Group getGroup_0() { return cGroup_0; }
		
		//"#00"
		public Keyword getNumberSignDigitZeroDigitZeroKeyword_0_0() { return cNumberSignDigitZeroDigitZeroKeyword_0_0; }
		
		//keywordVal=KeywordVal
		public Assignment getKeywordValAssignment_0_1() { return cKeywordValAssignment_0_1; }
		
		//KeywordVal
		public RuleCall getKeywordValKeywordValParserRuleCall_0_1_0() { return cKeywordValKeywordValParserRuleCall_0_1_0; }
		
		//("#01" terminalVal=TerminalVal)
		public Group getGroup_1() { return cGroup_1; }
		
		//"#01"
		public Keyword getNumberSignDigitZeroDigitOneKeyword_1_0() { return cNumberSignDigitZeroDigitOneKeyword_1_0; }
		
		//terminalVal=TerminalVal
		public Assignment getTerminalValAssignment_1_1() { return cTerminalValAssignment_1_1; }
		
		//TerminalVal
		public RuleCall getTerminalValTerminalValParserRuleCall_1_1_0() { return cTerminalValTerminalValParserRuleCall_1_1_0; }
		
		//("#02" enumVal=EnumVal)
		public Group getGroup_2() { return cGroup_2; }
		
		//"#02"
		public Keyword getNumberSignDigitZeroDigitTwoKeyword_2_0() { return cNumberSignDigitZeroDigitTwoKeyword_2_0; }
		
		//enumVal=EnumVal
		public Assignment getEnumValAssignment_2_1() { return cEnumValAssignment_2_1; }
		
		//EnumVal
		public RuleCall getEnumValEnumValParserRuleCall_2_1_0() { return cEnumValEnumValParserRuleCall_2_1_0; }
		
		//("#03" keywordBool=KeywordBool)
		public Group getGroup_3() { return cGroup_3; }
		
		//"#03"
		public Keyword getNumberSignDigitZeroDigitThreeKeyword_3_0() { return cNumberSignDigitZeroDigitThreeKeyword_3_0; }
		
		//keywordBool=KeywordBool
		public Assignment getKeywordBoolAssignment_3_1() { return cKeywordBoolAssignment_3_1; }
		
		//KeywordBool
		public RuleCall getKeywordBoolKeywordBoolParserRuleCall_3_1_0() { return cKeywordBoolKeywordBoolParserRuleCall_3_1_0; }
		
		//("#04" terminalBool=TerminalBool)
		public Group getGroup_4() { return cGroup_4; }
		
		//"#04"
		public Keyword getNumberSignDigitZeroDigitFourKeyword_4_0() { return cNumberSignDigitZeroDigitFourKeyword_4_0; }
		
		//terminalBool=TerminalBool
		public Assignment getTerminalBoolAssignment_4_1() { return cTerminalBoolAssignment_4_1; }
		
		//TerminalBool
		public RuleCall getTerminalBoolTerminalBoolParserRuleCall_4_1_0() { return cTerminalBoolTerminalBoolParserRuleCall_4_1_0; }
		
		//("#05" enumBool=EnumBool)
		public Group getGroup_5() { return cGroup_5; }
		
		//"#05"
		public Keyword getNumberSignDigitZeroDigitFiveKeyword_5_0() { return cNumberSignDigitZeroDigitFiveKeyword_5_0; }
		
		//enumBool=EnumBool
		public Assignment getEnumBoolAssignment_5_1() { return cEnumBoolAssignment_5_1; }
		
		//EnumBool
		public RuleCall getEnumBoolEnumBoolParserRuleCall_5_1_0() { return cEnumBoolEnumBoolParserRuleCall_5_1_0; }
		
		//("#06" mixedBool=MixedBool)
		public Group getGroup_6() { return cGroup_6; }
		
		//"#06"
		public Keyword getNumberSignDigitZeroDigitSixKeyword_6_0() { return cNumberSignDigitZeroDigitSixKeyword_6_0; }
		
		//mixedBool=MixedBool
		public Assignment getMixedBoolAssignment_6_1() { return cMixedBoolAssignment_6_1; }
		
		//MixedBool
		public RuleCall getMixedBoolMixedBoolParserRuleCall_6_1_0() { return cMixedBoolMixedBoolParserRuleCall_6_1_0; }
		
		//("#07" mixedValue=MixedValue)
		public Group getGroup_7() { return cGroup_7; }
		
		//"#07"
		public Keyword getNumberSignDigitZeroDigitSevenKeyword_7_0() { return cNumberSignDigitZeroDigitSevenKeyword_7_0; }
		
		//mixedValue=MixedValue
		public Assignment getMixedValueAssignment_7_1() { return cMixedValueAssignment_7_1; }
		
		//MixedValue
		public RuleCall getMixedValueMixedValueParserRuleCall_7_1_0() { return cMixedValueMixedValueParserRuleCall_7_1_0; }
		
		//("#08" containmentRef=ContainmentRef)
		public Group getGroup_8() { return cGroup_8; }
		
		//"#08"
		public Keyword getNumberSignDigitZeroDigitEightKeyword_8_0() { return cNumberSignDigitZeroDigitEightKeyword_8_0; }
		
		//containmentRef=ContainmentRef
		public Assignment getContainmentRefAssignment_8_1() { return cContainmentRefAssignment_8_1; }
		
		//ContainmentRef
		public RuleCall getContainmentRefContainmentRefParserRuleCall_8_1_0() { return cContainmentRefContainmentRefParserRuleCall_8_1_0; }
		
		//("#09" crossRef=CrossRef)
		public Group getGroup_9() { return cGroup_9; }
		
		//"#09"
		public Keyword getNumberSignDigitZeroDigitNineKeyword_9_0() { return cNumberSignDigitZeroDigitNineKeyword_9_0; }
		
		//crossRef=CrossRef
		public Assignment getCrossRefAssignment_9_1() { return cCrossRefAssignment_9_1; }
		
		//CrossRef
		public RuleCall getCrossRefCrossRefParserRuleCall_9_1_0() { return cCrossRefCrossRefParserRuleCall_9_1_0; }
	}
	public class KeywordValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.KeywordVal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cKwAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cKwKw1Keyword_0_0 = (Keyword)cKwAssignment_0.eContents().get(0);
		private final Assignment cKwAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cKwKw2Keyword_1_0 = (Keyword)cKwAssignment_1.eContents().get(0);
		
		//KeywordVal: kw="kw1" | kw="kw2";
		@Override public ParserRule getRule() { return rule; }
		
		//kw="kw1" | kw="kw2"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//kw="kw1"
		public Assignment getKwAssignment_0() { return cKwAssignment_0; }
		
		//"kw1"
		public Keyword getKwKw1Keyword_0_0() { return cKwKw1Keyword_0_0; }
		
		//kw="kw2"
		public Assignment getKwAssignment_1() { return cKwAssignment_1; }
		
		//"kw2"
		public Keyword getKwKw2Keyword_1_0() { return cKwKw2Keyword_1_0; }
	}
	public class TerminalValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.TerminalVal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTermAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTermTerminal1TerminalRuleCall_0_0 = (RuleCall)cTermAssignment_0.eContents().get(0);
		private final Assignment cTermAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTermTerminal2TerminalRuleCall_1_0 = (RuleCall)cTermAssignment_1.eContents().get(0);
		private final Assignment cTermAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cTermFooKeyword_2_0 = (Keyword)cTermAssignment_2.eContents().get(0);
		
		//TerminalVal: term=Terminal1 | term=Terminal2 | term="%foo";
		@Override public ParserRule getRule() { return rule; }
		
		//term=Terminal1 | term=Terminal2 | term="%foo"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//term=Terminal1
		public Assignment getTermAssignment_0() { return cTermAssignment_0; }
		
		//Terminal1
		public RuleCall getTermTerminal1TerminalRuleCall_0_0() { return cTermTerminal1TerminalRuleCall_0_0; }
		
		//term=Terminal2
		public Assignment getTermAssignment_1() { return cTermAssignment_1; }
		
		//Terminal2
		public RuleCall getTermTerminal2TerminalRuleCall_1_0() { return cTermTerminal2TerminalRuleCall_1_0; }
		
		//term="%foo"
		public Assignment getTermAssignment_2() { return cTermAssignment_2; }
		
		//"%foo"
		public Keyword getTermFooKeyword_2_0() { return cTermFooKeyword_2_0; }
	}
	public class EnumValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.EnumVal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cEnAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cEnEnum1EnumRuleCall_0_0 = (RuleCall)cEnAssignment_0.eContents().get(0);
		private final Assignment cEnAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cEnEnum2EnumRuleCall_1_0 = (RuleCall)cEnAssignment_1.eContents().get(0);
		
		//EnumVal: en=Enum1 | en=Enum2;
		@Override public ParserRule getRule() { return rule; }
		
		//en=Enum1 | en=Enum2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//en=Enum1
		public Assignment getEnAssignment_0() { return cEnAssignment_0; }
		
		//Enum1
		public RuleCall getEnEnum1EnumRuleCall_0_0() { return cEnEnum1EnumRuleCall_0_0; }
		
		//en=Enum2
		public Assignment getEnAssignment_1() { return cEnAssignment_1; }
		
		//Enum2
		public RuleCall getEnEnum2EnumRuleCall_1_0() { return cEnEnum2EnumRuleCall_1_0; }
	}
	public class KeywordBoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.KeywordBool");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cKwAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cKwKw1Keyword_0_0 = (Keyword)cKwAssignment_0.eContents().get(0);
		private final Assignment cKwAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cKwKw2Keyword_1_0 = (Keyword)cKwAssignment_1.eContents().get(0);
		
		//KeywordBool: kw?="kw1" | kw?="kw2";
		@Override public ParserRule getRule() { return rule; }
		
		//kw?="kw1" | kw?="kw2"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//kw?="kw1"
		public Assignment getKwAssignment_0() { return cKwAssignment_0; }
		
		//"kw1"
		public Keyword getKwKw1Keyword_0_0() { return cKwKw1Keyword_0_0; }
		
		//kw?="kw2"
		public Assignment getKwAssignment_1() { return cKwAssignment_1; }
		
		//"kw2"
		public Keyword getKwKw2Keyword_1_0() { return cKwKw2Keyword_1_0; }
	}
	public class TerminalBoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.TerminalBool");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTermAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTermTerminal1TerminalRuleCall_0_0 = (RuleCall)cTermAssignment_0.eContents().get(0);
		private final Assignment cTermAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTermTerminal2TerminalRuleCall_1_0 = (RuleCall)cTermAssignment_1.eContents().get(0);
		private final Assignment cTermAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cTermFooKeyword_2_0 = (Keyword)cTermAssignment_2.eContents().get(0);
		
		//TerminalBool: term?=Terminal1 | term?=Terminal2 | term?="%foo";
		@Override public ParserRule getRule() { return rule; }
		
		//term?=Terminal1 | term?=Terminal2 | term?="%foo"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//term?=Terminal1
		public Assignment getTermAssignment_0() { return cTermAssignment_0; }
		
		//Terminal1
		public RuleCall getTermTerminal1TerminalRuleCall_0_0() { return cTermTerminal1TerminalRuleCall_0_0; }
		
		//term?=Terminal2
		public Assignment getTermAssignment_1() { return cTermAssignment_1; }
		
		//Terminal2
		public RuleCall getTermTerminal2TerminalRuleCall_1_0() { return cTermTerminal2TerminalRuleCall_1_0; }
		
		//term?="%foo"
		public Assignment getTermAssignment_2() { return cTermAssignment_2; }
		
		//"%foo"
		public Keyword getTermFooKeyword_2_0() { return cTermFooKeyword_2_0; }
	}
	public class EnumBoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.EnumBool");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cEnAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cEnEnum1EnumRuleCall_0_0 = (RuleCall)cEnAssignment_0.eContents().get(0);
		private final Assignment cEnAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cEnEnum2EnumRuleCall_1_0 = (RuleCall)cEnAssignment_1.eContents().get(0);
		
		//EnumBool: en?=Enum1 | en?=Enum2;
		@Override public ParserRule getRule() { return rule; }
		
		//en?=Enum1 | en?=Enum2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//en?=Enum1
		public Assignment getEnAssignment_0() { return cEnAssignment_0; }
		
		//Enum1
		public RuleCall getEnEnum1EnumRuleCall_0_0() { return cEnEnum1EnumRuleCall_0_0; }
		
		//en?=Enum2
		public Assignment getEnAssignment_1() { return cEnAssignment_1; }
		
		//Enum2
		public RuleCall getEnEnum2EnumRuleCall_1_0() { return cEnEnum2EnumRuleCall_1_0; }
	}
	public class MixedBoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.MixedBool");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cValKw1Keyword_0_0 = (Keyword)cValAssignment_0.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValBooleanParserRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//MixedBool: val?="kw1" | val=Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//val?="kw1" | val=Boolean
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//val?="kw1"
		public Assignment getValAssignment_0() { return cValAssignment_0; }
		
		//"kw1"
		public Keyword getValKw1Keyword_0_0() { return cValKw1Keyword_0_0; }
		
		//val=Boolean
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//Boolean
		public RuleCall getValBooleanParserRuleCall_1_0() { return cValBooleanParserRuleCall_1_0; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Boolean returns ecore::EBoolean: "true" | "false";
		@Override public ParserRule getRule() { return rule; }
		
		//"true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"true"
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//"false"
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class MixedValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.MixedValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValEnum1EnumRuleCall_0_0 = (RuleCall)cValAssignment_0.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValDatEnumParserRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//MixedValue: val=Enum1 | val=DatEnum;
		@Override public ParserRule getRule() { return rule; }
		
		//val=Enum1 | val=DatEnum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//val=Enum1
		public Assignment getValAssignment_0() { return cValAssignment_0; }
		
		//Enum1
		public RuleCall getValEnum1EnumRuleCall_0_0() { return cValEnum1EnumRuleCall_0_0; }
		
		//val=DatEnum
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//DatEnum
		public RuleCall getValDatEnumParserRuleCall_1_0() { return cValDatEnumParserRuleCall_1_0; }
	}
	public class DatEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.DatEnum");
		private final Keyword cLit3Keyword = (Keyword)rule.eContents().get(1);
		
		//DatEnum returns TestEnum: "lit3";
		@Override public ParserRule getRule() { return rule; }
		
		//"lit3"
		public Keyword getLit3Keyword() { return cLit3Keyword; }
	}
	public class ContainmentRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cCtxAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cCtxContainmentRef1ParserRuleCall_0_0 = (RuleCall)cCtxAssignment_0.eContents().get(0);
		private final Assignment cCtxAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cCtxContainmentRef2ParserRuleCall_1_0 = (RuleCall)cCtxAssignment_1.eContents().get(0);
		
		//ContainmentRef: ctx=ContainmentRef1 | ctx=ContainmentRef2;
		@Override public ParserRule getRule() { return rule; }
		
		//ctx=ContainmentRef1 | ctx=ContainmentRef2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ctx=ContainmentRef1
		public Assignment getCtxAssignment_0() { return cCtxAssignment_0; }
		
		//ContainmentRef1
		public RuleCall getCtxContainmentRef1ParserRuleCall_0_0() { return cCtxContainmentRef1ParserRuleCall_0_0; }
		
		//ctx=ContainmentRef2
		public Assignment getCtxAssignment_1() { return cCtxAssignment_1; }
		
		//ContainmentRef2
		public RuleCall getCtxContainmentRef2ParserRuleCall_1_0() { return cCtxContainmentRef2ParserRuleCall_1_0; }
	}
	public class ContainmentRef1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		
		//ContainmentRef1 returns ContainmentRefN: "kw1" val1=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" val1=ID
		public Group getGroup() { return cGroup; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
	}
	public class ContainmentRef2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_0 = (RuleCall)cVal2Assignment_1.eContents().get(0);
		
		//ContainmentRef2 returns ContainmentRefN: "kw2" val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw2" val2=ID
		public Group getGroup() { return cGroup; }
		
		//"kw2"
		public Keyword getKw2Keyword_0() { return cKw2Keyword_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1() { return cVal2Assignment_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0() { return cVal2IDTerminalRuleCall_1_0; }
	}
	public class CrossRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.CrossRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cNameAlternatives_0_0 = (Alternatives)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameTerminal1TerminalRuleCall_0_0_0 = (RuleCall)cNameAlternatives_0_0.eContents().get(0);
		private final RuleCall cNameTerminal2TerminalRuleCall_0_0_1 = (RuleCall)cNameAlternatives_0_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cCrossRefAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final CrossReference cCrossRefCrossRefCrossReference_1_0_0 = (CrossReference)cCrossRefAssignment_1_0.eContents().get(0);
		private final RuleCall cCrossRefCrossRefTerminal1TerminalRuleCall_1_0_0_1 = (RuleCall)cCrossRefCrossRefCrossReference_1_0_0.eContents().get(1);
		private final Assignment cCrossRefAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final CrossReference cCrossRefCrossRefCrossReference_1_1_0 = (CrossReference)cCrossRefAssignment_1_1.eContents().get(0);
		private final RuleCall cCrossRefCrossRefTerminal2TerminalRuleCall_1_1_0_1 = (RuleCall)cCrossRefCrossRefCrossReference_1_1_0.eContents().get(1);
		
		//CrossRef: name=(Terminal1|Terminal2) (crossRef=[CrossRef|Terminal1] | crossRef=[CrossRef|Terminal2]);
		@Override public ParserRule getRule() { return rule; }
		
		//name=(Terminal1|Terminal2) (crossRef=[CrossRef|Terminal1] | crossRef=[CrossRef|Terminal2])
		public Group getGroup() { return cGroup; }
		
		//name=(Terminal1|Terminal2)
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//(Terminal1|Terminal2)
		public Alternatives getNameAlternatives_0_0() { return cNameAlternatives_0_0; }
		
		//Terminal1
		public RuleCall getNameTerminal1TerminalRuleCall_0_0_0() { return cNameTerminal1TerminalRuleCall_0_0_0; }
		
		//Terminal2
		public RuleCall getNameTerminal2TerminalRuleCall_0_0_1() { return cNameTerminal2TerminalRuleCall_0_0_1; }
		
		//(crossRef=[CrossRef|Terminal1] | crossRef=[CrossRef|Terminal2])
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//crossRef=[CrossRef|Terminal1]
		public Assignment getCrossRefAssignment_1_0() { return cCrossRefAssignment_1_0; }
		
		//[CrossRef|Terminal1]
		public CrossReference getCrossRefCrossRefCrossReference_1_0_0() { return cCrossRefCrossRefCrossReference_1_0_0; }
		
		//Terminal1
		public RuleCall getCrossRefCrossRefTerminal1TerminalRuleCall_1_0_0_1() { return cCrossRefCrossRefTerminal1TerminalRuleCall_1_0_0_1; }
		
		//crossRef=[CrossRef|Terminal2]
		public Assignment getCrossRefAssignment_1_1() { return cCrossRefAssignment_1_1; }
		
		//[CrossRef|Terminal2]
		public CrossReference getCrossRefCrossRefCrossReference_1_1_0() { return cCrossRefCrossRefCrossReference_1_1_0; }
		
		//Terminal2
		public RuleCall getCrossRefCrossRefTerminal2TerminalRuleCall_1_1_0_1() { return cCrossRefCrossRefTerminal2TerminalRuleCall_1_1_0_1; }
	}
	
	public class Enum1Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum1");
		private final EnumLiteralDeclaration cLit1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit1Lit1Keyword_0 = (Keyword)cLit1EnumLiteralDeclaration.eContents().get(0);
		
		//enum Enum1 returns TestEnum: lit1;
		public EnumRule getRule() { return rule; }
		
		//lit1
		public EnumLiteralDeclaration getLit1EnumLiteralDeclaration() { return cLit1EnumLiteralDeclaration; }
		
		public Keyword getLit1Lit1Keyword_0() { return cLit1Lit1Keyword_0; }
	}
	public class Enum2Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum2");
		private final EnumLiteralDeclaration cLit2EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit2Lit2Keyword_0 = (Keyword)cLit2EnumLiteralDeclaration.eContents().get(0);
		
		//enum Enum2 returns TestEnum: lit2;
		public EnumRule getRule() { return rule; }
		
		//lit2
		public EnumLiteralDeclaration getLit2EnumLiteralDeclaration() { return cLit2EnumLiteralDeclaration; }
		
		public Keyword getLit2Lit2Keyword_0() { return cLit2Lit2Keyword_0; }
	}
	public class Enum3Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum3");
		private final EnumLiteralDeclaration cLit3EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit3Lit3Keyword_0 = (Keyword)cLit3EnumLiteralDeclaration.eContents().get(0);
		
		//enum Enum3 returns TestEnum: lit3;
		public EnumRule getRule() { return rule; }
		
		//lit3
		public EnumLiteralDeclaration getLit3EnumLiteralDeclaration() { return cLit3EnumLiteralDeclaration; }
		
		public Keyword getLit3Lit3Keyword_0() { return cLit3Lit3Keyword_0; }
	}
	
	private final ModelElements pModel;
	private final KeywordValElements pKeywordVal;
	private final TerminalValElements pTerminalVal;
	private final TerminalRule tTerminal1;
	private final TerminalRule tTerminal2;
	private final EnumValElements pEnumVal;
	private final Enum1Elements eEnum1;
	private final Enum2Elements eEnum2;
	private final Enum3Elements eEnum3;
	private final KeywordBoolElements pKeywordBool;
	private final TerminalBoolElements pTerminalBool;
	private final EnumBoolElements pEnumBool;
	private final MixedBoolElements pMixedBool;
	private final BooleanElements pBoolean;
	private final MixedValueElements pMixedValue;
	private final DatEnumElements pDatEnum;
	private final ContainmentRefElements pContainmentRef;
	private final ContainmentRef1Elements pContainmentRef1;
	private final ContainmentRef2Elements pContainmentRef2;
	private final CrossRefElements pCrossRef;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AssignmentFinderTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pKeywordVal = new KeywordValElements();
		this.pTerminalVal = new TerminalValElements();
		this.tTerminal1 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal1");
		this.tTerminal2 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal2");
		this.pEnumVal = new EnumValElements();
		this.eEnum1 = new Enum1Elements();
		this.eEnum2 = new Enum2Elements();
		this.eEnum3 = new Enum3Elements();
		this.pKeywordBool = new KeywordBoolElements();
		this.pTerminalBool = new TerminalBoolElements();
		this.pEnumBool = new EnumBoolElements();
		this.pMixedBool = new MixedBoolElements();
		this.pBoolean = new BooleanElements();
		this.pMixedValue = new MixedValueElements();
		this.pDatEnum = new DatEnumElements();
		this.pContainmentRef = new ContainmentRefElements();
		this.pContainmentRef1 = new ContainmentRef1Elements();
		this.pContainmentRef2 = new ContainmentRef2Elements();
		this.pCrossRef = new CrossRefElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.serializer.AssignmentFinderTestLanguage".equals(grammar.getName())) {
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
	//    ("#00" keywordVal=KeywordVal) |
	//    ("#01" terminalVal=TerminalVal) |
	//    ("#02" enumVal=EnumVal) |
	//    ("#03" keywordBool=KeywordBool) |
	//    ("#04" terminalBool=TerminalBool) |
	//    ("#05" enumBool=EnumBool) |
	//    ("#06" mixedBool=MixedBool) |
	//    ("#07" mixedValue=MixedValue) |
	//    ("#08" containmentRef=ContainmentRef) |
	//    ("#09" crossRef=CrossRef);
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//KeywordVal: kw="kw1" | kw="kw2";
	public KeywordValElements getKeywordValAccess() {
		return pKeywordVal;
	}
	
	public ParserRule getKeywordValRule() {
		return getKeywordValAccess().getRule();
	}
	
	//TerminalVal: term=Terminal1 | term=Terminal2 | term="%foo";
	public TerminalValElements getTerminalValAccess() {
		return pTerminalVal;
	}
	
	public ParserRule getTerminalValRule() {
		return getTerminalValAccess().getRule();
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Terminal1: '%' ('A'..'Z')*;
	public TerminalRule getTerminal1Rule() {
		return tTerminal1;
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Terminal2: '%' ('a'..'z')*;
	public TerminalRule getTerminal2Rule() {
		return tTerminal2;
	}
	
	//EnumVal: en=Enum1 | en=Enum2;
	public EnumValElements getEnumValAccess() {
		return pEnumVal;
	}
	
	public ParserRule getEnumValRule() {
		return getEnumValAccess().getRule();
	}
	
	//enum Enum1 returns TestEnum: lit1;
	public Enum1Elements getEnum1Access() {
		return eEnum1;
	}
	
	public EnumRule getEnum1Rule() {
		return getEnum1Access().getRule();
	}
	
	//enum Enum2 returns TestEnum: lit2;
	public Enum2Elements getEnum2Access() {
		return eEnum2;
	}
	
	public EnumRule getEnum2Rule() {
		return getEnum2Access().getRule();
	}
	
	//enum Enum3 returns TestEnum: lit3;
	public Enum3Elements getEnum3Access() {
		return eEnum3;
	}
	
	public EnumRule getEnum3Rule() {
		return getEnum3Access().getRule();
	}
	
	//KeywordBool: kw?="kw1" | kw?="kw2";
	public KeywordBoolElements getKeywordBoolAccess() {
		return pKeywordBool;
	}
	
	public ParserRule getKeywordBoolRule() {
		return getKeywordBoolAccess().getRule();
	}
	
	//TerminalBool: term?=Terminal1 | term?=Terminal2 | term?="%foo";
	public TerminalBoolElements getTerminalBoolAccess() {
		return pTerminalBool;
	}
	
	public ParserRule getTerminalBoolRule() {
		return getTerminalBoolAccess().getRule();
	}
	
	//EnumBool: en?=Enum1 | en?=Enum2;
	public EnumBoolElements getEnumBoolAccess() {
		return pEnumBool;
	}
	
	public ParserRule getEnumBoolRule() {
		return getEnumBoolAccess().getRule();
	}
	
	//MixedBool: val?="kw1" | val=Boolean;
	public MixedBoolElements getMixedBoolAccess() {
		return pMixedBool;
	}
	
	public ParserRule getMixedBoolRule() {
		return getMixedBoolAccess().getRule();
	}
	
	//Boolean returns ecore::EBoolean: "true" | "false";
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//MixedValue: val=Enum1 | val=DatEnum;
	public MixedValueElements getMixedValueAccess() {
		return pMixedValue;
	}
	
	public ParserRule getMixedValueRule() {
		return getMixedValueAccess().getRule();
	}
	
	//DatEnum returns TestEnum: "lit3";
	public DatEnumElements getDatEnumAccess() {
		return pDatEnum;
	}
	
	public ParserRule getDatEnumRule() {
		return getDatEnumAccess().getRule();
	}
	
	//ContainmentRef: ctx=ContainmentRef1 | ctx=ContainmentRef2;
	public ContainmentRefElements getContainmentRefAccess() {
		return pContainmentRef;
	}
	
	public ParserRule getContainmentRefRule() {
		return getContainmentRefAccess().getRule();
	}
	
	//ContainmentRef1 returns ContainmentRefN: "kw1" val1=ID;
	public ContainmentRef1Elements getContainmentRef1Access() {
		return pContainmentRef1;
	}
	
	public ParserRule getContainmentRef1Rule() {
		return getContainmentRef1Access().getRule();
	}
	
	//ContainmentRef2 returns ContainmentRefN: "kw2" val2=ID;
	public ContainmentRef2Elements getContainmentRef2Access() {
		return pContainmentRef2;
	}
	
	public ParserRule getContainmentRef2Rule() {
		return getContainmentRef2Access().getRule();
	}
	
	//CrossRef: name=(Terminal1|Terminal2) (crossRef=[CrossRef|Terminal1] | crossRef=[CrossRef|Terminal2]);
	public CrossRefElements getCrossRefAccess() {
		return pCrossRef;
	}
	
	public ParserRule getCrossRefRule() {
		return getCrossRefAccess().getRule();
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
