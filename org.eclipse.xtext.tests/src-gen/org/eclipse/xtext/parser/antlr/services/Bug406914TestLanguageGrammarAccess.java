/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug406914TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug406914TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cBS_ESCAPEParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Model:
		//    name=ID BS_ESCAPE
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID BS_ESCAPE
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//BS_ESCAPE
		public RuleCall getBS_ESCAPEParserRuleCall_1() { return cBS_ESCAPEParserRuleCall_1; }
	}
	public class BS_ESCAPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug406914TestLanguage.BS_ESCAPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBackspaceKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFormFeedKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLineFeedKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLineFeedKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cCarriageReturnKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cTabKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cBackslashKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		
		///* SuppressWarnings[SpacesInKeyword] */
		//BS_ESCAPE:
		//    '\b' | '\f' | '\n' | 'lineFeed' | '\r' | '\t' | '\\'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'\b' | '\f' | '\n' | 'lineFeed' | '\r' | '\t' | '\\'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'\b'
		public Keyword getBackspaceKeyword_0() { return cBackspaceKeyword_0; }
		
		//'\f'
		public Keyword getFormFeedKeyword_1() { return cFormFeedKeyword_1; }
		
		//'\n'
		public Keyword getLineFeedKeyword_2() { return cLineFeedKeyword_2; }
		
		//'lineFeed'
		public Keyword getLineFeedKeyword_3() { return cLineFeedKeyword_3; }
		
		//'\r'
		public Keyword getCarriageReturnKeyword_4() { return cCarriageReturnKeyword_4; }
		
		//'\t'
		public Keyword getTabKeyword_5() { return cTabKeyword_5; }
		
		//'\\'
		public Keyword getBackslashKeyword_6() { return cBackslashKeyword_6; }
	}
	
	
	private final ModelElements pModel;
	private final BS_ESCAPEElements pBS_ESCAPE;
	private final TerminalRule tID;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public Bug406914TestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pBS_ESCAPE = new BS_ESCAPEElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug406914TestLanguage.ID");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug406914TestLanguage.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug406914TestLanguage.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug406914TestLanguage".equals(grammar.getName())) {
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
	

	
	//Model:
	//    name=ID BS_ESCAPE
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	///* SuppressWarnings[SpacesInKeyword] */
	//BS_ESCAPE:
	//    '\b' | '\f' | '\n' | 'lineFeed' | '\r' | '\t' | '\\'
	//;
	public BS_ESCAPEElements getBS_ESCAPEAccess() {
		return pBS_ESCAPE;
	}
	
	public ParserRule getBS_ESCAPERule() {
		return getBS_ESCAPEAccess().getRule();
	}
	
	//terminal ID			: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal WS			: (' '|'\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:	.;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
