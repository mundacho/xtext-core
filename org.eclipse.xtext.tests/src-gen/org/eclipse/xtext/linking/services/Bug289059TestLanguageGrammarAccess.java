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
public class Bug289059TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug289059TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cEnabledAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEnabledUnassignedActionParserRuleCall_1_0 = (RuleCall)cEnabledAssignment_1.eContents().get(0);
		private final Assignment cReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cReferenceModelCrossReference_2_0 = (CrossReference)cReferenceAssignment_2.eContents().get(0);
		private final RuleCall cReferenceModelIDTerminalRuleCall_2_0_1 = (RuleCall)cReferenceModelCrossReference_2_0.eContents().get(1);
		
		//Model:
		//    name=ID
		//    enabled=UnassignedAction?
		//    reference=[Model]?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		//enabled=UnassignedAction?
		//reference=[Model]?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//enabled=UnassignedAction?
		public Assignment getEnabledAssignment_1() { return cEnabledAssignment_1; }
		
		//UnassignedAction
		public RuleCall getEnabledUnassignedActionParserRuleCall_1_0() { return cEnabledUnassignedActionParserRuleCall_1_0; }
		
		//reference=[Model]?
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }
		
		//[Model]
		public CrossReference getReferenceModelCrossReference_2_0() { return cReferenceModelCrossReference_2_0; }
		
		//ID
		public RuleCall getReferenceModelIDTerminalRuleCall_2_0_1() { return cReferenceModelIDTerminalRuleCall_2_0_1; }
	}
	public class UnassignedActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug289059TestLanguage.UnassignedAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnassignedActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnabledKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//UnassignedAction:
		//    {UnassignedAction} "enabled";
		@Override public ParserRule getRule() { return rule; }
		
		//{UnassignedAction} "enabled"
		public Group getGroup() { return cGroup; }
		
		//{UnassignedAction}
		public Action getUnassignedActionAction_0() { return cUnassignedActionAction_0; }
		
		//"enabled"
		public Keyword getEnabledKeyword_1() { return cEnabledKeyword_1; }
	}
	
	
	private final ModelElements pModel;
	private final UnassignedActionElements pUnassignedAction;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug289059TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pUnassignedAction = new UnassignedActionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.Bug289059TestLanguage".equals(grammar.getName())) {
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
	//    name=ID
	//    enabled=UnassignedAction?
	//    reference=[Model]?
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//UnassignedAction:
	//    {UnassignedAction} "enabled";
	public UnassignedActionElements getUnassignedActionAccess() {
		return pUnassignedAction;
	}
	
	public ParserRule getUnassignedActionRule() {
		return getUnassignedActionAccess().getRule();
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
