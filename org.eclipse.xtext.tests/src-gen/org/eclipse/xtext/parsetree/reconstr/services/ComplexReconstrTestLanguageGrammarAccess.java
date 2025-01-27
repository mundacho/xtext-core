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
public class ComplexReconstrTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Root");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTrickyGParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Root: Op | TrickyG;
		@Override public ParserRule getRule() { return rule; }
		
		//Op | TrickyG
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Op
		public RuleCall getOpParserRuleCall_0() { return cOpParserRuleCall_0; }
		
		//TrickyG
		public RuleCall getTrickyGParserRuleCall_1() { return cTrickyGParserRuleCall_1; }
	}
	public class OpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Op");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTermParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cAddAddOperandsAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cAddOperandsAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cAddOperandsTermParserRuleCall_1_0_2_0 = (RuleCall)cAddOperandsAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cMinusMinusOperandsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cMinusOperandsAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cMinusOperandsTermParserRuleCall_1_1_2_0 = (RuleCall)cMinusOperandsAssignment_1_1_2.eContents().get(0);
		
		//Op returns Expression:
		//    Term ({Add.addOperands+=current} '+' addOperands+=Term | {Minus.minusOperands+=current} '-' minusOperands+=Term)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Term ({Add.addOperands+=current} '+' addOperands+=Term | {Minus.minusOperands+=current} '-' minusOperands+=Term)*
		public Group getGroup() { return cGroup; }
		
		//Term
		public RuleCall getTermParserRuleCall_0() { return cTermParserRuleCall_0; }
		
		//({Add.addOperands+=current} '+' addOperands+=Term | {Minus.minusOperands+=current} '-' minusOperands+=Term)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Add.addOperands+=current} '+' addOperands+=Term
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Add.addOperands+=current}
		public Action getAddAddOperandsAction_1_0_0() { return cAddAddOperandsAction_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_1() { return cPlusSignKeyword_1_0_1; }
		
		//addOperands+=Term
		public Assignment getAddOperandsAssignment_1_0_2() { return cAddOperandsAssignment_1_0_2; }
		
		//Term
		public RuleCall getAddOperandsTermParserRuleCall_1_0_2_0() { return cAddOperandsTermParserRuleCall_1_0_2_0; }
		
		//{Minus.minusOperands+=current} '-' minusOperands+=Term
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Minus.minusOperands+=current}
		public Action getMinusMinusOperandsAction_1_1_0() { return cMinusMinusOperandsAction_1_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1_1() { return cHyphenMinusKeyword_1_1_1; }
		
		//minusOperands+=Term
		public Assignment getMinusOperandsAssignment_1_1_2() { return cMinusOperandsAssignment_1_1_2; }
		
		//Term
		public RuleCall getMinusOperandsTermParserRuleCall_1_1_2_0() { return cMinusOperandsTermParserRuleCall_1_1_2_0; }
	}
	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Term");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParensParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Term returns Expression:
		//    Atom | Parens ;
		@Override public ParserRule getRule() { return rule; }
		
		//Atom | Parens
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }
		
		//Parens
		public RuleCall getParensParserRuleCall_1() { return cParensParserRuleCall_1; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Atom");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Parens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cOpParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEmAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cEmExclamationMarkKeyword_3_0 = (Keyword)cEmAssignment_3.eContents().get(0);
		
		///* SuppressWarnings[potentialOverride] */
		//Parens returns Expression:
		//    '(' Op ')' em='!'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Op ')' em='!'?
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Op
		public RuleCall getOpParserRuleCall_1() { return cOpParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//em='!'?
		public Assignment getEmAssignment_3() { return cEmAssignment_3; }
		
		//'!'
		public Keyword getEmExclamationMarkKeyword_3_0() { return cEmExclamationMarkKeyword_3_0; }
	}
	public class TrickyBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTBKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeINTTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeINTTerminalRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		///* TODO not working yet
		//StrangeStuff :
		//    '->' (foo=ID)? ({OtherStuff.strangeStuff=current} ',' bla=ID)? ({OtherStuff2.stuff=current} ',' bla2=ID)?;
		//*/
		//// disabled, because of https://bugs.eclipse.org/bugs/show_bug.cgi?id=346685
		////TrickyA returns TypeA1: 'TA' TrickyA1 (name += ID)* ({TypeB.x=current} 'x' | {TypeC.x=current} 'y')? name+=STRING;
		////TrickyA1 returns TypeD: name+=ID;
		///* SuppressWarnings[noInstantiation] */
		//TrickyB : 'TB' (name = ID type += INT)? (type += INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'TB' (name = ID type += INT)? (type += INT)*
		public Group getGroup() { return cGroup; }
		
		//'TB'
		public Keyword getTBKeyword_0() { return cTBKeyword_0; }
		
		//(name = ID type += INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//name = ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//type += INT
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//INT
		public RuleCall getTypeINTTerminalRuleCall_1_1_0() { return cTypeINTTerminalRuleCall_1_1_0; }
		
		//(type += INT)*
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//INT
		public RuleCall getTypeINTTerminalRuleCall_2_0() { return cTypeINTTerminalRuleCall_2_0; }
	}
	public class TrickyCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cC1XAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cXKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Action cC2YAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cYKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Action cC3ZAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cZKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		
		//TrickyC : 'TC' name = ID ({C1.x=current} 'x')? ({C2.y=current} 'y')? ({C3.z=current} 'z')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'TC' name = ID ({C1.x=current} 'x')? ({C2.y=current} 'y')? ({C3.z=current} 'z')?
		public Group getGroup() { return cGroup; }
		
		//'TC'
		public Keyword getTCKeyword_0() { return cTCKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//({C1.x=current} 'x')?
		public Group getGroup_2() { return cGroup_2; }
		
		//{C1.x=current}
		public Action getC1XAction_2_0() { return cC1XAction_2_0; }
		
		//'x'
		public Keyword getXKeyword_2_1() { return cXKeyword_2_1; }
		
		//({C2.y=current} 'y')?
		public Group getGroup_3() { return cGroup_3; }
		
		//{C2.y=current}
		public Action getC2YAction_3_0() { return cC2YAction_3_0; }
		
		//'y'
		public Keyword getYKeyword_3_1() { return cYKeyword_3_1; }
		
		//({C3.z=current} 'z')?
		public Group getGroup_4() { return cGroup_4; }
		
		//{C3.z=current}
		public Action getC3ZAction_4_0() { return cC3ZAction_4_0; }
		
		//'z'
		public Keyword getZKeyword_4_1() { return cZKeyword_4_1; }
	}
	public class TrickyDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyD");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameINTTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Assignment cFooAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFooSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cFooAssignment_1_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cTypeIDTerminalRuleCall_1_2_0 = (RuleCall)cTypeAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cNameINTTerminalRuleCall_2_0_0 = (RuleCall)cNameAssignment_2_0.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeIDTerminalRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//TrickyD: 'TD' (name += INT foo = STRING type += ID)? (name += INT type += ID)? (type += ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'TD' (name += INT foo = STRING type += ID)? (name += INT type += ID)? (type += ID)*
		public Group getGroup() { return cGroup; }
		
		//'TD'
		public Keyword getTDKeyword_0() { return cTDKeyword_0; }
		
		//(name += INT foo = STRING type += ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//name += INT
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_1_0_0() { return cNameINTTerminalRuleCall_1_0_0; }
		
		//foo = STRING
		public Assignment getFooAssignment_1_1() { return cFooAssignment_1_1; }
		
		//STRING
		public RuleCall getFooSTRINGTerminalRuleCall_1_1_0() { return cFooSTRINGTerminalRuleCall_1_1_0; }
		
		//type += ID
		public Assignment getTypeAssignment_1_2() { return cTypeAssignment_1_2; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_2_0() { return cTypeIDTerminalRuleCall_1_2_0; }
		
		//(name += INT type += ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//name += INT
		public Assignment getNameAssignment_2_0() { return cNameAssignment_2_0; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_2_0_0() { return cNameINTTerminalRuleCall_2_0_0; }
		
		//type += ID
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_2_1_0() { return cTypeIDTerminalRuleCall_2_1_0; }
		
		//(type += ID)*
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_3_0() { return cTypeIDTerminalRuleCall_3_0; }
	}
	public class TrickyEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameINTTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Assignment cFooAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFooSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cFooAssignment_1_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cTypeIDTerminalRuleCall_1_2_0 = (RuleCall)cTypeAssignment_1_2.eContents().get(0);
		private final Keyword cXKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cNameINTTerminalRuleCall_3_0_0 = (RuleCall)cNameAssignment_3_0.eContents().get(0);
		private final Assignment cTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_3_1_0 = (RuleCall)cTypeAssignment_3_1.eContents().get(0);
		
		//// 34 "abc" XX 123 "de" YY x 34 DD 45 CC
		///* SuppressWarnings[noInstantiation] */
		//TrickyE: 'TE' (name+=INT foo+=STRING type+=ID)* 'x' (name+=INT type+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'TE' (name+=INT foo+=STRING type+=ID)* 'x' (name+=INT type+=ID)*
		public Group getGroup() { return cGroup; }
		
		//'TE'
		public Keyword getTEKeyword_0() { return cTEKeyword_0; }
		
		//(name+=INT foo+=STRING type+=ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//name+=INT
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_1_0_0() { return cNameINTTerminalRuleCall_1_0_0; }
		
		//foo+=STRING
		public Assignment getFooAssignment_1_1() { return cFooAssignment_1_1; }
		
		//STRING
		public RuleCall getFooSTRINGTerminalRuleCall_1_1_0() { return cFooSTRINGTerminalRuleCall_1_1_0; }
		
		//type+=ID
		public Assignment getTypeAssignment_1_2() { return cTypeAssignment_1_2; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_2_0() { return cTypeIDTerminalRuleCall_1_2_0; }
		
		//'x'
		public Keyword getXKeyword_2() { return cXKeyword_2; }
		
		//(name+=INT type+=ID)*
		public Group getGroup_3() { return cGroup_3; }
		
		//name+=INT
		public Assignment getNameAssignment_3_0() { return cNameAssignment_3_0; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_3_0_0() { return cNameINTTerminalRuleCall_3_0_0; }
		
		//type+=ID
		public Assignment getTypeAssignment_3_1() { return cTypeAssignment_3_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_3_1_0() { return cTypeIDTerminalRuleCall_3_1_0; }
	}
	public class TrickyFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTFKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeINTTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_2_0_0 = (RuleCall)cNameAssignment_2_0.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTypeINTTerminalRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		
		////
		//TrickyF: 'TF' (name+=ID type+=INT)* (name+=ID | type+=INT);
		@Override public ParserRule getRule() { return rule; }
		
		//'TF' (name+=ID type+=INT)* (name+=ID | type+=INT)
		public Group getGroup() { return cGroup; }
		
		//'TF'
		public Keyword getTFKeyword_0() { return cTFKeyword_0; }
		
		//(name+=ID type+=INT)*
		public Group getGroup_1() { return cGroup_1; }
		
		//name+=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//type+=INT
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//INT
		public RuleCall getTypeINTTerminalRuleCall_1_1_0() { return cTypeINTTerminalRuleCall_1_1_0; }
		
		//(name+=ID | type+=INT)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//name+=ID
		public Assignment getNameAssignment_2_0() { return cNameAssignment_2_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0_0() { return cNameIDTerminalRuleCall_2_0_0; }
		
		//type+=INT
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//INT
		public RuleCall getTypeINTTerminalRuleCall_2_1_0() { return cTypeINTTerminalRuleCall_2_1_0; }
	}
	public class TrickyGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTGKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTreeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTreeTrickyG1ParserRuleCall_1_0 = (RuleCall)cTreeAssignment_1.eContents().get(0);
		
		//TrickyG: 'TG' tree=TrickyG1;
		@Override public ParserRule getRule() { return rule; }
		
		//'TG' tree=TrickyG1
		public Group getGroup() { return cGroup; }
		
		//'TG'
		public Keyword getTGKeyword_0() { return cTGKeyword_0; }
		
		//tree=TrickyG1
		public Assignment getTreeAssignment_1() { return cTreeAssignment_1; }
		
		//TrickyG1
		public RuleCall getTreeTrickyG1ParserRuleCall_1_0() { return cTreeTrickyG1ParserRuleCall_1_0; }
	}
	public class TrickyG1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cValsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cValsTrickyG2ParserRuleCall_1_0_0 = (RuleCall)cValsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cValsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cValsTrickyG2ParserRuleCall_1_1_1_0 = (RuleCall)cValsAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///* SuppressWarnings[noInstantiation] */
		//TrickyG1: '[' (vals+=TrickyG2 (',' vals+=TrickyG2)*)? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' (vals+=TrickyG2 (',' vals+=TrickyG2)*)? ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//(vals+=TrickyG2 (',' vals+=TrickyG2)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//vals+=TrickyG2
		public Assignment getValsAssignment_1_0() { return cValsAssignment_1_0; }
		
		//TrickyG2
		public RuleCall getValsTrickyG2ParserRuleCall_1_0_0() { return cValsTrickyG2ParserRuleCall_1_0_0; }
		
		//(',' vals+=TrickyG2)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//vals+=TrickyG2
		public Assignment getValsAssignment_1_1_1() { return cValsAssignment_1_1_1; }
		
		//TrickyG2
		public RuleCall getValsTrickyG2ParserRuleCall_1_1_1_0() { return cValsTrickyG2ParserRuleCall_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class TrickyG2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG2");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTrickyG1ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//TrickyG2: TrickyG1 | val=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//TrickyG1 | val=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TrickyG1
		public RuleCall getTrickyG1ParserRuleCall_0() { return cTrickyG1ParserRuleCall_0; }
		
		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}
	
	
	private final RootElements pRoot;
	private final OpElements pOp;
	private final TermElements pTerm;
	private final AtomElements pAtom;
	private final ParensElements pParens;
	private final TrickyBElements pTrickyB;
	private final TrickyCElements pTrickyC;
	private final TrickyDElements pTrickyD;
	private final TrickyEElements pTrickyE;
	private final TrickyFElements pTrickyF;
	private final TrickyGElements pTrickyG;
	private final TrickyG1Elements pTrickyG1;
	private final TrickyG2Elements pTrickyG2;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComplexReconstrTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pOp = new OpElements();
		this.pTerm = new TermElements();
		this.pAtom = new AtomElements();
		this.pParens = new ParensElements();
		this.pTrickyB = new TrickyBElements();
		this.pTrickyC = new TrickyCElements();
		this.pTrickyD = new TrickyDElements();
		this.pTrickyE = new TrickyEElements();
		this.pTrickyF = new TrickyFElements();
		this.pTrickyG = new TrickyGElements();
		this.pTrickyG1 = new TrickyG1Elements();
		this.pTrickyG2 = new TrickyG2Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage".equals(grammar.getName())) {
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

	
	//Root: Op | TrickyG;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Op returns Expression:
	//    Term ({Add.addOperands+=current} '+' addOperands+=Term | {Minus.minusOperands+=current} '-' minusOperands+=Term)*;
	public OpElements getOpAccess() {
		return pOp;
	}
	
	public ParserRule getOpRule() {
		return getOpAccess().getRule();
	}
	
	//Term returns Expression:
	//    Atom | Parens ;
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
	
	///* SuppressWarnings[potentialOverride] */
	//Parens returns Expression:
	//    '(' Op ')' em='!'?;
	public ParensElements getParensAccess() {
		return pParens;
	}
	
	public ParserRule getParensRule() {
		return getParensAccess().getRule();
	}
	
	///* TODO not working yet
	//StrangeStuff :
	//    '->' (foo=ID)? ({OtherStuff.strangeStuff=current} ',' bla=ID)? ({OtherStuff2.stuff=current} ',' bla2=ID)?;
	//*/
	//// disabled, because of https://bugs.eclipse.org/bugs/show_bug.cgi?id=346685
	////TrickyA returns TypeA1: 'TA' TrickyA1 (name += ID)* ({TypeB.x=current} 'x' | {TypeC.x=current} 'y')? name+=STRING;
	////TrickyA1 returns TypeD: name+=ID;
	///* SuppressWarnings[noInstantiation] */
	//TrickyB : 'TB' (name = ID type += INT)? (type += INT)*;
	public TrickyBElements getTrickyBAccess() {
		return pTrickyB;
	}
	
	public ParserRule getTrickyBRule() {
		return getTrickyBAccess().getRule();
	}
	
	//TrickyC : 'TC' name = ID ({C1.x=current} 'x')? ({C2.y=current} 'y')? ({C3.z=current} 'z')?;
	public TrickyCElements getTrickyCAccess() {
		return pTrickyC;
	}
	
	public ParserRule getTrickyCRule() {
		return getTrickyCAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//TrickyD: 'TD' (name += INT foo = STRING type += ID)? (name += INT type += ID)? (type += ID)*;
	public TrickyDElements getTrickyDAccess() {
		return pTrickyD;
	}
	
	public ParserRule getTrickyDRule() {
		return getTrickyDAccess().getRule();
	}
	
	//// 34 "abc" XX 123 "de" YY x 34 DD 45 CC
	///* SuppressWarnings[noInstantiation] */
	//TrickyE: 'TE' (name+=INT foo+=STRING type+=ID)* 'x' (name+=INT type+=ID)*;
	public TrickyEElements getTrickyEAccess() {
		return pTrickyE;
	}
	
	public ParserRule getTrickyERule() {
		return getTrickyEAccess().getRule();
	}
	
	////
	//TrickyF: 'TF' (name+=ID type+=INT)* (name+=ID | type+=INT);
	public TrickyFElements getTrickyFAccess() {
		return pTrickyF;
	}
	
	public ParserRule getTrickyFRule() {
		return getTrickyFAccess().getRule();
	}
	
	//TrickyG: 'TG' tree=TrickyG1;
	public TrickyGElements getTrickyGAccess() {
		return pTrickyG;
	}
	
	public ParserRule getTrickyGRule() {
		return getTrickyGAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//TrickyG1: '[' (vals+=TrickyG2 (',' vals+=TrickyG2)*)? ']';
	public TrickyG1Elements getTrickyG1Access() {
		return pTrickyG1;
	}
	
	public ParserRule getTrickyG1Rule() {
		return getTrickyG1Access().getRule();
	}
	
	//TrickyG2: TrickyG1 | val=INT;
	public TrickyG2Elements getTrickyG2Access() {
		return pTrickyG2;
	}
	
	public ParserRule getTrickyG2Rule() {
		return getTrickyG2Access().getRule();
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
