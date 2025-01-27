/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalLocationProviderTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.resource.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.resource.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.resource.services.LocationProviderTestLanguageGrammarAccess;

}

@parser::members {

 	private LocationProviderTestLanguageGrammarAccess grammarAccess;

    public InternalLocationProviderTestLanguageParser(TokenStream input, LocationProviderTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected LocationProviderTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0_0());
				}
				lv_elements_0_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_0_0,
						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_1_0());
				}
				lv_components_1_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"components",
						lv_components_1_0,
						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='singleref'
			{
				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getSinglerefKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getElementAccess().getSinglerefElementCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='multiref'
			{
				newLeafNode(otherlv_4, grammarAccess.getElementAccess().getMultirefKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getElementAccess().getMultirefsElementCrossReference_3_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getComponentAccess().getBusParserRuleCall_0_0());
			}
			this_Bus_0=ruleBus
			{
				$current = $this_Bus_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getComponentAccess().getProcessorParserRuleCall_0_1());
			}
			this_Processor_1=ruleProcessor
			{
				$current = $this_Processor_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_2='modes'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getModesKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getComponentAccess().getModeModeParserRuleCall_1_1_0_0());
						}
						lv_mode_3_0=ruleMode
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComponentRule());
							}
							add(
								$current,
								"mode",
								lv_mode_3_0,
								"org.eclipse.xtext.resource.LocationProviderTestLanguage.Mode");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getComponentAccess().getTransitionTransitionParserRuleCall_1_1_1_0());
						}
						lv_transition_4_0=ruleTransition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComponentRule());
							}
							add(
								$current,
								"transition",
								lv_transition_4_0,
								"org.eclipse.xtext.resource.LocationProviderTestLanguage.Transition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEndKeyword_2());
		}
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleBus
entryRuleBus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBusRule()); }
	iv_ruleBus=ruleBus
	{ $current=$iv_ruleBus.current; }
	EOF;

// Rule Bus
ruleBus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bus'
		{
			newLeafNode(otherlv_0, grammarAccess.getBusAccess().getBusKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBusAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBusRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBusAccess().getPortPortParserRuleCall_2_0());
				}
				lv_port_2_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBusRule());
					}
					add(
						$current,
						"port",
						lv_port_2_0,
						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProcessor
entryRuleProcessor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessorRule()); }
	iv_ruleProcessor=ruleProcessor
	{ $current=$iv_ruleProcessor.current; }
	EOF;

// Rule Processor
ruleProcessor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='processor'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcessorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcessorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessorAccess().getDataDataParserRuleCall_2_0());
				}
				lv_data_2_0=ruleData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessorRule());
					}
					add(
						$current,
						"data",
						lv_data_2_0,
						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Data");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMode
entryRuleMode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModeRule()); }
	iv_ruleMode=ruleMode
	{ $current=$iv_ruleMode.current; }
	EOF;

// Rule Mode
ruleMode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mode'
		{
			newLeafNode(otherlv_0, grammarAccess.getModeAccess().getModeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getModeAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSourceModeCrossReference_2_0());
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getDestinationModeCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='port'
		{
			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleData
entryRuleData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataRule()); }
	iv_ruleData=ruleData
	{ $current=$iv_ruleData.current; }
	EOF;

// Rule Data
ruleData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataAccess().getSemicolonKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
