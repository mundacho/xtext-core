/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.terminalrules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UnicodeTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.Model");
		private final Assignment cStringsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStringsAbstractStringParserRuleCall_0 = (RuleCall)cStringsAssignment.eContents().get(0);
		
		//Model:
		//    strings += AbstractString*;
		@Override public ParserRule getRule() { return rule; }
		
		//strings += AbstractString*
		public Assignment getStringsAssignment() { return cStringsAssignment; }
		
		//AbstractString
		public RuleCall getStringsAbstractStringParserRuleCall_0() { return cStringsAbstractStringParserRuleCall_0; }
	}
	public class AbstractStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.AbstractString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGStringParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cQuotedStringParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractString:
		//    GString | QuotedString;
		@Override public ParserRule getRule() { return rule; }
		
		//GString | QuotedString
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GString
		public RuleCall getGStringParserRuleCall_0() { return cGStringParserRuleCall_0; }
		
		//QuotedString
		public RuleCall getQuotedStringParserRuleCall_1() { return cQuotedStringParserRuleCall_1; }
	}
	public class GStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.GString");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameGERMAN_STRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//GString:
		//    name=GERMAN_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=GERMAN_STRING
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//GERMAN_STRING
		public RuleCall getNameGERMAN_STRINGTerminalRuleCall_0() { return cNameGERMAN_STRINGTerminalRuleCall_0; }
	}
	public class QuotedStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.QuotedString");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//QuotedString:
		//    name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0() { return cNameSTRINGTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractStringElements pAbstractString;
	private final GStringElements pGString;
	private final QuotedStringElements pQuotedString;
	private final TerminalRule tGERMAN_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnicodeTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractString = new AbstractStringElements();
		this.pGString = new GStringElements();
		this.pQuotedString = new QuotedStringElements();
		this.tGERMAN_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.GERMAN_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage".equals(grammar.getName())) {
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
	//    strings += AbstractString*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractString:
	//    GString | QuotedString;
	public AbstractStringElements getAbstractStringAccess() {
		return pAbstractString;
	}
	
	public ParserRule getAbstractStringRule() {
		return getAbstractStringAccess().getRule();
	}
	
	//GString:
	//    name=GERMAN_STRING;
	public GStringElements getGStringAccess() {
		return pGString;
	}
	
	public ParserRule getGStringRule() {
		return getGStringAccess().getRule();
	}
	
	//QuotedString:
	//    name=STRING;
	public QuotedStringElements getQuotedStringAccess() {
		return pQuotedString;
	}
	
	public ParserRule getQuotedStringRule() {
		return getQuotedStringAccess().getRule();
	}
	
	//terminal GERMAN_STRING:
	//    ('A'..'Z' | 'a'..'z'
	//      | '\u00c4' | '\u00d6' | '\u00dc' | '\u00e4' | '\u00f6' | '\u00fc' | '\u1E9E'
	//    )*;
	public TerminalRule getGERMAN_STRINGRule() {
		return tGERMAN_STRING;
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
