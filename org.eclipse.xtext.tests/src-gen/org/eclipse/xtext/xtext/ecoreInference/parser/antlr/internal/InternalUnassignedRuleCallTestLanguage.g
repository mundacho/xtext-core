/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalUnassignedRuleCallTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.xtext.ecoreInference.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.xtext.ecoreInference.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.xtext.ecoreInference.services.UnassignedRuleCallTestLanguageGrammarAccess;

}

@parser::members {

 	private UnassignedRuleCallTestLanguageGrammarAccess grammarAccess;

    public InternalUnassignedRuleCallTestLanguageParser(TokenStream input, UnassignedRuleCallTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected UnassignedRuleCallTestLanguageGrammarAccess getGrammarAccess() {
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
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			this_INT_1=RULE_INT
			{
				newLeafNode(this_INT_1, grammarAccess.getModelAccess().getINTTerminalRuleCall_1());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getModelFeaturesModelFeaturesParserRuleCall_2_0());
				}
				lv_modelFeatures_2_0=ruleModelFeatures
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"modelFeatures",
						lv_modelFeatures_2_0,
						"org.eclipse.xtext.xtext.ecoreInference.UnassignedRuleCallTestLanguage.ModelFeatures");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModelFeatures
entryRuleModelFeatures returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelFeaturesRule()); }
	iv_ruleModelFeatures=ruleModelFeatures
	{ $current=$iv_ruleModelFeatures.current; }
	EOF;

// Rule ModelFeatures
ruleModelFeatures returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='feature'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelFeaturesAccess().getFeatureKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelFeaturesAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelFeaturesRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getModelFeaturesAccess().getDataTypeRuleParserRuleCall_2());
		}
		ruleDataTypeRule
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelFeaturesAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleDataTypeRule
entryRuleDataTypeRule returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRuleRule()); }
	iv_ruleDataTypeRule=ruleDataTypeRule
	{ $current=$iv_ruleDataTypeRule.current.getText(); }
	EOF;

// Rule DataTypeRule
ruleDataTypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDataTypeRuleAccess().getINTTerminalRuleCall_0());
		}
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataTypeRuleAccess().getKeywordKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDataTypeRuleAccess().getINTTerminalRuleCall_2());
		}
		(
			this_STRING_3=RULE_STRING
			{
				$current.merge(this_STRING_3);
			}
			{
				newLeafNode(this_STRING_3, grammarAccess.getDataTypeRuleAccess().getSTRINGTerminalRuleCall_3());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
