/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator.ecore.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class SubTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SubMainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.ecore.SubTestLanguage.SubMain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSuperMainsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSuperMainsSuperMainParserRuleCall_1_0 = (RuleCall)cSuperMainsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAnotherAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnotherAnotherSuperMainParserRuleCall_3_0 = (RuleCall)cAnotherAssignment_3.eContents().get(0);
		
		//SubMain :
		//    "{" superMains+=SuperMain "}" (another=AnotherSuperMain)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"{" superMains+=SuperMain "}" (another=AnotherSuperMain)?
		public Group getGroup() { return cGroup; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//superMains+=SuperMain
		public Assignment getSuperMainsAssignment_1() { return cSuperMainsAssignment_1; }
		
		//SuperMain
		public RuleCall getSuperMainsSuperMainParserRuleCall_1_0() { return cSuperMainsSuperMainParserRuleCall_1_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
		
		//(another=AnotherSuperMain)?
		public Assignment getAnotherAssignment_3() { return cAnotherAssignment_3; }
		
		//AnotherSuperMain
		public RuleCall getAnotherAnotherSuperMainParserRuleCall_3_0() { return cAnotherAnotherSuperMainParserRuleCall_3_0; }
	}
	public class AnotherSuperMainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.ecore.SubTestLanguage.AnotherSuperMain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUpsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//@Override
		//AnotherSuperMain :
		//   "ups" name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"ups" name=ID
		public Group getGroup() { return cGroup; }
		
		//"ups"
		public Keyword getUpsKeyword_0() { return cUpsKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final SubMainElements pSubMain;
	private final AnotherSuperMainElements pAnotherSuperMain;
	
	private final Grammar grammar;
	
	private final SuperTestLanguageGrammarAccess gaSuperTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SubTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			SuperTestLanguageGrammarAccess gaSuperTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaSuperTestLanguage = gaSuperTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pSubMain = new SubMainElements();
		this.pAnotherSuperMain = new AnotherSuperMainElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.generator.ecore.SubTestLanguage".equals(grammar.getName())) {
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
	
	
	public SuperTestLanguageGrammarAccess getSuperTestLanguageGrammarAccess() {
		return gaSuperTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SubMain :
	//    "{" superMains+=SuperMain "}" (another=AnotherSuperMain)?;
	public SubMainElements getSubMainAccess() {
		return pSubMain;
	}
	
	public ParserRule getSubMainRule() {
		return getSubMainAccess().getRule();
	}
	
	//@Override
	//AnotherSuperMain :
	//   "ups" name=ID;
	public AnotherSuperMainElements getAnotherSuperMainAccess() {
		return pAnotherSuperMain;
	}
	
	public ParserRule getAnotherSuperMainRule() {
		return getAnotherSuperMainAccess().getRule();
	}
	
	//SuperMain :
	//    "super" name=ID;
	public SuperTestLanguageGrammarAccess.SuperMainElements getSuperMainAccess() {
		return gaSuperTestLanguage.getSuperMainAccess();
	}
	
	public ParserRule getSuperMainRule() {
		return getSuperMainAccess().getRule();
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
