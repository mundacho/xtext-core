/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.fragments.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FragmentTestLanguageExGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ParserRuleFragmentsExElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguageEx.ParserRuleFragmentsEx");
		private final RuleCall cParserRuleFragmentsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ParserRuleFragmentsEx returns ParserRuleFragments:
		//    ParserRuleFragments
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ParserRuleFragments
		public RuleCall getParserRuleFragmentsParserRuleCall() { return cParserRuleFragmentsParserRuleCall; }
	}
	
	
	private final ParserRuleFragmentsExElements pParserRuleFragmentsEx;
	
	private final Grammar grammar;
	
	private final FragmentTestLanguageGrammarAccess gaFragmentTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FragmentTestLanguageExGrammarAccess(GrammarProvider grammarProvider,
			FragmentTestLanguageGrammarAccess gaFragmentTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaFragmentTestLanguage = gaFragmentTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pParserRuleFragmentsEx = new ParserRuleFragmentsExElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.fragments.FragmentTestLanguageEx".equals(grammar.getName())) {
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
	
	
	public FragmentTestLanguageGrammarAccess getFragmentTestLanguageGrammarAccess() {
		return gaFragmentTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ParserRuleFragmentsEx returns ParserRuleFragments:
	//    ParserRuleFragments
	//;
	public ParserRuleFragmentsExElements getParserRuleFragmentsExAccess() {
		return pParserRuleFragmentsEx;
	}
	
	public ParserRule getParserRuleFragmentsExRule() {
		return getParserRuleFragmentsExAccess().getRule();
	}
	
	//ParserRuleFragments: {ParserRuleFragments}
	//  ( '#1' element=PRFNamed
	//  | '#2' element=PRFNamed '->' ref=[PRFNamed]
	//  | '#3' element=PRFNamedRefFirst
	//  | '#4' element=PRFNamedWithAction
	////  | '#5' element=PRFNamedWithActionInFragment
	////  | '#6' element=PRFNamedWithActionInFragment2
	////  | '#7' element=PRFNamedWithActionInFragment3
	//  | '#8' element=PRFNamedWithFQN
	//  | '#9' element=PRFWithPredicate
	//  | '#10' element=PRFNamedRecursive
	//  | '#11' element=PRFNamedRecursiveFragment
	//  )
	//;
	public FragmentTestLanguageGrammarAccess.ParserRuleFragmentsElements getParserRuleFragmentsAccess() {
		return gaFragmentTestLanguage.getParserRuleFragmentsAccess();
	}
	
	public ParserRule getParserRuleFragmentsRule() {
		return getParserRuleFragmentsAccess().getRule();
	}
	
	//PRFNamed: PRFNamedFragment (
	//      ':' ref=[PRFNamed]
	//    | '-' PRFNamedRef
	//    )?
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedElements getPRFNamedAccess() {
		return gaFragmentTestLanguage.getPRFNamedAccess();
	}
	
	public ParserRule getPRFNamedRule() {
		return getPRFNamedAccess().getRule();
	}
	
	//PRFNamedRecursive returns PRFNamedWithAction:
	//    name=ID RecursiveFromFragment
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedRecursiveElements getPRFNamedRecursiveAccess() {
		return gaFragmentTestLanguage.getPRFNamedRecursiveAccess();
	}
	
	public ParserRule getPRFNamedRecursiveRule() {
		return getPRFNamedRecursiveAccess().getRule();
	}
	
	//PRFNamedRecursiveFragment returns PRFNamedWithAction:
	//    name=ID RecursiveFragment
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedRecursiveFragmentElements getPRFNamedRecursiveFragmentAccess() {
		return gaFragmentTestLanguage.getPRFNamedRecursiveFragmentAccess();
	}
	
	public ParserRule getPRFNamedRecursiveFragmentRule() {
		return getPRFNamedRecursiveFragmentAccess().getRule();
	}
	
	//PRFNamedRefFirst returns PRFNamed:
	//    ref=[PRFNamed] '<-' PRFNamedFragment
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedRefFirstElements getPRFNamedRefFirstAccess() {
		return gaFragmentTestLanguage.getPRFNamedRefFirstAccess();
	}
	
	public ParserRule getPRFNamedRefFirstRule() {
		return getPRFNamedRefFirstAccess().getRule();
	}
	
	//PRFNamedWithAction returns PRFNamed:
	//    PRFNamed {PRFNamedWithAction.prev=current} name=ID (ref=[PRFNamed] ref2=[PRFNamed])?
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedWithActionElements getPRFNamedWithActionAccess() {
		return gaFragmentTestLanguage.getPRFNamedWithActionAccess();
	}
	
	public ParserRule getPRFNamedWithActionRule() {
		return getPRFNamedWithActionAccess().getRule();
	}
	
	////PRFNamedWithActionInFragment returns PRFNamed:
	////    FragmentWithAction ('-' ref=[PRFNamed])?
	////;
	////
	////PRFNamedWithActionInFragment2 returns PRFNamed:
	////    name=ID FragmentWithAction2 ('-' ref=[PRFNamed])?
	////;
	////
	////PRFNamedWithActionInFragment3 returns PRFNamed:
	////    FragmentWithAction3 ('-' ref=[PRFNamed])?
	////;
	//PRFNamedWithFQN returns PRFNamed:
	//    name=FQN ('-' ref=[PRFNamed|FQN2])?
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedWithFQNElements getPRFNamedWithFQNAccess() {
		return gaFragmentTestLanguage.getPRFNamedWithFQNAccess();
	}
	
	public ParserRule getPRFNamedWithFQNRule() {
		return getPRFNamedWithFQNAccess().getRule();
	}
	
	//PRFWithPredicate returns PRFNamed:
	//    PRFNamedFragment =>('-' PRFNamedRef)?
	//;
	public FragmentTestLanguageGrammarAccess.PRFWithPredicateElements getPRFWithPredicateAccess() {
		return gaFragmentTestLanguage.getPRFWithPredicateAccess();
	}
	
	public ParserRule getPRFWithPredicateRule() {
		return getPRFWithPredicateAccess().getRule();
	}
	
	//FQN:
	//    ID Suffix?
	//;
	public FragmentTestLanguageGrammarAccess.FQNElements getFQNAccess() {
		return gaFragmentTestLanguage.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FQN2:
	//    ID Suffix2*
	//;
	public FragmentTestLanguageGrammarAccess.FQN2Elements getFQN2Access() {
		return gaFragmentTestLanguage.getFQN2Access();
	}
	
	public ParserRule getFQN2Rule() {
		return getFQN2Access().getRule();
	}
	
	//fragment Suffix:
	//    '.' ID Suffix?
	//;
	public FragmentTestLanguageGrammarAccess.SuffixElements getSuffixAccess() {
		return gaFragmentTestLanguage.getSuffixAccess();
	}
	
	public ParserRule getSuffixRule() {
		return getSuffixAccess().getRule();
	}
	
	//fragment Suffix2:
	//    '.' ID
	//;
	public FragmentTestLanguageGrammarAccess.Suffix2Elements getSuffix2Access() {
		return gaFragmentTestLanguage.getSuffix2Access();
	}
	
	public ParserRule getSuffix2Rule() {
		return getSuffix2Access().getRule();
	}
	
	////fragment FragmentWithAction returns PRFNamed:
	////    name=ID {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
	////;
	////
	////fragment FragmentWithAction2 returns PRFNamed:
	////    {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
	////;
	////
	////fragment FragmentWithAction3 returns PRFNamed:
	////    name=ID ({PRFNamedWithAction.prev=current} '->' name=ID (ref2=[PRFNamed])?)*
	////;
	//fragment PRFNamedFragment returns PRFNamed:
	//    name=ID
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedFragmentElements getPRFNamedFragmentAccess() {
		return gaFragmentTestLanguage.getPRFNamedFragmentAccess();
	}
	
	public ParserRule getPRFNamedFragmentRule() {
		return getPRFNamedFragmentAccess().getRule();
	}
	
	//fragment PRFNamedRef returns PRFNamed:
	//    ref=[PRFNamed]
	//;
	public FragmentTestLanguageGrammarAccess.PRFNamedRefElements getPRFNamedRefAccess() {
		return gaFragmentTestLanguage.getPRFNamedRefAccess();
	}
	
	public ParserRule getPRFNamedRefRule() {
		return getPRFNamedRefAccess().getRule();
	}
	
	//fragment RecursiveFromFragment returns PRFNamedWithAction:
	//    prev=NamedInParentheses
	//;
	public FragmentTestLanguageGrammarAccess.RecursiveFromFragmentElements getRecursiveFromFragmentAccess() {
		return gaFragmentTestLanguage.getRecursiveFromFragmentAccess();
	}
	
	public ParserRule getRecursiveFromFragmentRule() {
		return getRecursiveFromFragmentAccess().getRule();
	}
	
	//NamedInParentheses returns PRFNamed:
	//    '(' NamedInParentheses ')' | {PRFNamed} name=ID
	//;
	public FragmentTestLanguageGrammarAccess.NamedInParenthesesElements getNamedInParenthesesAccess() {
		return gaFragmentTestLanguage.getNamedInParenthesesAccess();
	}
	
	public ParserRule getNamedInParenthesesRule() {
		return getNamedInParenthesesAccess().getRule();
	}
	
	//fragment RecursiveFragment returns PRFNamedWithAction:
	//    '(' RecursiveFragment ')' | prev=NamedByAction
	//;
	public FragmentTestLanguageGrammarAccess.RecursiveFragmentElements getRecursiveFragmentAccess() {
		return gaFragmentTestLanguage.getRecursiveFragmentAccess();
	}
	
	public ParserRule getRecursiveFragmentRule() {
		return getRecursiveFragmentAccess().getRule();
	}
	
	//NamedByAction returns PRFNamed:
	//    {PRFNamed} name=ID
	//;
	public FragmentTestLanguageGrammarAccess.NamedByActionElements getNamedByActionAccess() {
		return gaFragmentTestLanguage.getNamedByActionAccess();
	}
	
	public ParserRule getNamedByActionRule() {
		return getNamedByActionAccess().getRule();
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
