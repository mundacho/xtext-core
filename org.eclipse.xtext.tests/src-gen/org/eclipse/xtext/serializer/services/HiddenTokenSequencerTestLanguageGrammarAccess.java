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
public class HiddenTokenSequencerTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage.Model");
		private final Assignment cDomainModelAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDomainModelDomainModelParserRuleCall_0 = (RuleCall)cDomainModelAssignment.eContents().get(0);
		
		//Model:
		//    domainModel = DomainModel
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//domainModel = DomainModel
		public Assignment getDomainModelAssignment() { return cDomainModelAssignment; }
		
		//DomainModel
		public RuleCall getDomainModelDomainModelParserRuleCall_0() { return cDomainModelDomainModelParserRuleCall_0; }
	}
	public class DomainModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage.DomainModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntitiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEntitiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_1_0 = (RuleCall)cEntitiesAssignment_1.eContents().get(0);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///* SuppressWarnings[noInstantiation] */
		//DomainModel:
		//    'entities'
		//        (entities+=Entity)*
		//    'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'entities'
		//    (entities+=Entity)*
		//'end'
		public Group getGroup() { return cGroup; }
		
		//'entities'
		public Keyword getEntitiesKeyword_0() { return cEntitiesKeyword_0; }
		
		//(entities+=Entity)*
		public Assignment getEntitiesAssignment_1() { return cEntitiesAssignment_1; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_1_0() { return cEntitiesEntityParserRuleCall_1_0; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		
		//Entity:
		//    name = ID
		//    description = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name = ID
		//description = STRING
		public Group getGroup() { return cGroup; }
		
		//name = ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//description = STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final DomainModelElements pDomainModel;
	private final EntityElements pEntity;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HiddenTokenSequencerTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDomainModel = new DomainModelElements();
		this.pEntity = new EntityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage".equals(grammar.getName())) {
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
	//    domainModel = DomainModel
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//DomainModel:
	//    'entities'
	//        (entities+=Entity)*
	//    'end'
	//;
	public DomainModelElements getDomainModelAccess() {
		return pDomainModel;
	}
	
	public ParserRule getDomainModelRule() {
		return getDomainModelAccess().getRule();
	}
	
	//Entity:
	//    name = ID
	//    description = STRING
	//;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
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
