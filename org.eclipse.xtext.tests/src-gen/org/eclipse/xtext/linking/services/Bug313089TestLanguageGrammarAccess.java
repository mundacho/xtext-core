/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class Bug313089TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FooElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug313089TestLanguage.Foo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cBarAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cBarBarParserRuleCall_1_0_0 = (RuleCall)cBarAssignment_1_0.eContents().get(0);
		private final Assignment cBazAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cBazBazParserRuleCall_1_1_0 = (RuleCall)cBazAssignment_1_1.eContents().get(0);
		private final Assignment cRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRefFooCrossReference_2_0 = (CrossReference)cRefAssignment_2.eContents().get(0);
		private final RuleCall cRefFooIDTerminalRuleCall_2_0_1 = (RuleCall)cRefFooCrossReference_2_0.eContents().get(1);
		
		//Foo:
		//    name=ID (bar=Bar|baz=Baz) ref=[Foo];
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID (bar=Bar|baz=Baz) ref=[Foo]
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(bar=Bar|baz=Baz)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//bar=Bar
		public Assignment getBarAssignment_1_0() { return cBarAssignment_1_0; }
		
		//Bar
		public RuleCall getBarBarParserRuleCall_1_0_0() { return cBarBarParserRuleCall_1_0_0; }
		
		//baz=Baz
		public Assignment getBazAssignment_1_1() { return cBazAssignment_1_1; }
		
		//Baz
		public RuleCall getBazBazParserRuleCall_1_1_0() { return cBazBazParserRuleCall_1_1_0; }
		
		//ref=[Foo]
		public Assignment getRefAssignment_2() { return cRefAssignment_2; }
		
		//[Foo]
		public CrossReference getRefFooCrossReference_2_0() { return cRefFooCrossReference_2_0; }
		
		//ID
		public RuleCall getRefFooIDTerminalRuleCall_2_0_1() { return cRefFooIDTerminalRuleCall_2_0_1; }
	}
	public class BarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug313089TestLanguage.Bar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBarAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Bar:
		//    {Bar} name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{Bar} name=ID
		public Group getGroup() { return cGroup; }
		
		//{Bar}
		public Action getBarAction_0() { return cBarAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class BazElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug313089TestLanguage.Baz");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBazKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cBazChildAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cBazKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cNameAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_2_0 = (RuleCall)cNameAssignment_2_2.eContents().get(0);
		
		//Baz:
		//    'baz' name=ID ({Baz.child=current} 'baz' name=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'baz' name=ID ({Baz.child=current} 'baz' name=ID)*
		public Group getGroup() { return cGroup; }
		
		//'baz'
		public Keyword getBazKeyword_0() { return cBazKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//({Baz.child=current} 'baz' name=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//{Baz.child=current}
		public Action getBazChildAction_2_0() { return cBazChildAction_2_0; }
		
		//'baz'
		public Keyword getBazKeyword_2_1() { return cBazKeyword_2_1; }
		
		//name=ID
		public Assignment getNameAssignment_2_2() { return cNameAssignment_2_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_2_0() { return cNameIDTerminalRuleCall_2_2_0; }
	}
	
	
	private final FooElements pFoo;
	private final BarElements pBar;
	private final BazElements pBaz;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug313089TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFoo = new FooElements();
		this.pBar = new BarElements();
		this.pBaz = new BazElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.Bug313089TestLanguage".equals(grammar.getName())) {
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

	
	//Foo:
	//    name=ID (bar=Bar|baz=Baz) ref=[Foo];
	public FooElements getFooAccess() {
		return pFoo;
	}
	
	public ParserRule getFooRule() {
		return getFooAccess().getRule();
	}
	
	//Bar:
	//    {Bar} name=ID;
	public BarElements getBarAccess() {
		return pBar;
	}
	
	public ParserRule getBarRule() {
		return getBarAccess().getRule();
	}
	
	//Baz:
	//    'baz' name=ID ({Baz.child=current} 'baz' name=ID)*;
	public BazElements getBazAccess() {
		return pBaz;
	}
	
	public ParserRule getBazRule() {
		return getBazAccess().getRule();
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
