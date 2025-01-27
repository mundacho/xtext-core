/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalFowlerDslTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.FowlerDslTestLanguageGrammarAccess;

}

@parser::members {

 	private FowlerDslTestLanguageGrammarAccess grammarAccess;

    public InternalFowlerDslTestLanguageParser(TokenStream input, FowlerDslTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Statemachine";
   	}

   	@Override
   	protected FowlerDslTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStatemachine
entryRuleStatemachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatemachineRule()); }
	iv_ruleStatemachine=ruleStatemachine
	{ $current=$iv_ruleStatemachine.current; }
	EOF;

// Rule Statemachine
ruleStatemachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='events'
		{
			newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getEventsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_0());
				}
				lv_events_1_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"events",
						lv_events_1_0,
						"org.eclipse.xtext.testlanguages.FowlerDslTestLanguage.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getEndKeyword_2());
		}
		otherlv_3='commands'
		{
			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getCommandsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_0());
				}
				lv_commands_4_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"commands",
						lv_commands_4_0,
						"org.eclipse.xtext.testlanguages.FowlerDslTestLanguage.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getStatemachineAccess().getEndKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_6_0());
				}
				lv_states_6_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"states",
						lv_states_6_0,
						"org.eclipse.xtext.testlanguages.FowlerDslTestLanguage.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_resetting_0_0='resetting'
				{
					newLeafNode(lv_resetting_0_0, grammarAccess.getEventAccess().getResettingResettingKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
					}
					setWithLastConsumed($current, "resetting", lv_resetting_0_0 != null, "resetting");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
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
				lv_code_2_0=RULE_ID
				{
					newLeafNode(lv_code_2_0, grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_code_1_0=RULE_ID
				{
					newLeafNode(lv_code_1_0, grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
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
			otherlv_2='actions'
			{
				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0());
					}
				)
			)+
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0());
				}
				lv_transitions_6_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_6_0,
						"org.eclipse.xtext.testlanguages.FowlerDslTestLanguage.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getEndKeyword_4());
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
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0());
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
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
					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
