/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug299395TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.reconstr.services.Bug299395TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug299395TestLanguageGrammarAccess grammarAccess;

    public InternalBug299395TestLanguageParser(TokenStream input, Bug299395TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug299395TestLanguageGrammarAccess getGrammarAccess() {
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
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		(
			otherlv_1='{'
			{
				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_0());
			}
			(
				(
					lv_strings_2_0=RULE_STRING
					{
						newLeafNode(lv_strings_2_0, grammarAccess.getModelAccess().getStringsSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						addWithLastConsumed(
							$current,
							"strings",
							lv_strings_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)?
			otherlv_3='}'
			{
				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_2());
			}
		)*
		(
			otherlv_4='['
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_2_0());
			}
			(
				(
					(
						lv_keys_5_0=RULE_STRING
						{
							newLeafNode(lv_keys_5_0, grammarAccess.getModelAccess().getKeysSTRINGTerminalRuleCall_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed(
								$current,
								"keys",
								lv_keys_5_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				(
					(
						lv_values_6_0=RULE_STRING
						{
							newLeafNode(lv_values_6_0, grammarAccess.getModelAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed(
								$current,
								"values",
								lv_values_6_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)*
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightSquareBracketKeyword_2_2());
			}
		)*
		(
			otherlv_8='subModel'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getSubModelKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getSubModelSubModelParserRuleCall_3_1_0());
					}
					lv_subModel_9_0=ruleSubModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"subModel",
							lv_subModel_9_0,
							"org.eclipse.xtext.parsetree.reconstr.Bug299395TestLanguage.SubModel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSubModel
entryRuleSubModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubModelRule()); }
	iv_ruleSubModel=ruleSubModel
	{ $current=$iv_ruleSubModel.current; }
	EOF;

// Rule SubModel
ruleSubModel returns [EObject current=null]
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
					grammarAccess.getSubModelAccess().getSubModelAction_0(),
					$current);
			}
		)
		(
			otherlv_1='1'
			{
				newLeafNode(otherlv_1, grammarAccess.getSubModelAccess().getDigitOneKeyword_1_0());
			}
			otherlv_2='2'
			{
				newLeafNode(otherlv_2, grammarAccess.getSubModelAccess().getDigitTwoKeyword_1_1());
			}
			(
				(
					lv_strings_3_0=RULE_STRING
					{
						newLeafNode(lv_strings_3_0, grammarAccess.getSubModelAccess().getStringsSTRINGTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSubModelRule());
						}
						addWithLastConsumed(
							$current,
							"strings",
							lv_strings_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)?
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
