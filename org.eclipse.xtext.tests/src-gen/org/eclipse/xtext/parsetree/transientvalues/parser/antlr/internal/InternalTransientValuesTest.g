/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalTransientValuesTest;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.transientvalues.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.transientvalues.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.transientvalues.services.TransientValuesTestGrammarAccess;

}

@parser::members {

 	private TransientValuesTestGrammarAccess grammarAccess;

    public InternalTransientValuesTestParser(TokenStream input, TransientValuesTestGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected TransientValuesTestGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='test'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getTestKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestRequiredParserRuleCall_1_0());
			}
			this_TestRequired_1=ruleTestRequired
			{
				$current = $this_TestRequired_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestOptionalParserRuleCall_1_1());
			}
			this_TestOptional_2=ruleTestOptional
			{
				$current = $this_TestOptional_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestListParserRuleCall_1_2());
			}
			this_TestList_3=ruleTestList
			{
				$current = $this_TestList_3.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTestRequired
entryRuleTestRequired returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRequiredRule()); }
	iv_ruleTestRequired=ruleTestRequired
	{ $current=$iv_ruleTestRequired.current; }
	EOF;

// Rule TestRequired
ruleTestRequired returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestRequiredAccess().getTestRequiredAction_0(),
					$current);
			}
		)
		otherlv_1='required'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestRequiredAccess().getRequiredKeyword_1());
		}
		(
			(
				lv_required1_2_0=RULE_INT
				{
					newLeafNode(lv_required1_2_0, grammarAccess.getTestRequiredAccess().getRequired1INTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRequiredRule());
					}
					setWithLastConsumed(
						$current,
						"required1",
						lv_required1_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_required2_3_0=RULE_INT
				{
					newLeafNode(lv_required2_3_0, grammarAccess.getTestRequiredAccess().getRequired2INTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRequiredRule());
					}
					setWithLastConsumed(
						$current,
						"required2",
						lv_required2_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTestOptional
entryRuleTestOptional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestOptionalRule()); }
	iv_ruleTestOptional=ruleTestOptional
	{ $current=$iv_ruleTestOptional.current; }
	EOF;

// Rule TestOptional
ruleTestOptional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestOptionalAccess().getTestOptionalAction_0(),
					$current);
			}
		)
		otherlv_1='optional'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestOptionalAccess().getOptionalKeyword_1());
		}
		(
			(
				lv_opt1_2_0=RULE_INT
				{
					newLeafNode(lv_opt1_2_0, grammarAccess.getTestOptionalAccess().getOpt1INTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestOptionalRule());
					}
					setWithLastConsumed(
						$current,
						"opt1",
						lv_opt1_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)?
		(
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getTestOptionalAccess().getColonKeyword_3_0());
			}
			(
				(
					lv_opt2_4_0=RULE_INT
					{
						newLeafNode(lv_opt2_4_0, grammarAccess.getTestOptionalAccess().getOpt2INTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestOptionalRule());
						}
						setWithLastConsumed(
							$current,
							"opt2",
							lv_opt2_4_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTestList
entryRuleTestList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestListRule()); }
	iv_ruleTestList=ruleTestList
	{ $current=$iv_ruleTestList.current; }
	EOF;

// Rule TestList
ruleTestList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestListAccess().getTestListAction_0(),
					$current);
			}
		)
		otherlv_1='list'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestListAccess().getListKeyword_1());
		}
		(
			(
				lv_item_2_0=RULE_INT
				{
					newLeafNode(lv_item_2_0, grammarAccess.getTestListAccess().getItemINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestListRule());
					}
					addWithLastConsumed(
						$current,
						"item",
						lv_item_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
