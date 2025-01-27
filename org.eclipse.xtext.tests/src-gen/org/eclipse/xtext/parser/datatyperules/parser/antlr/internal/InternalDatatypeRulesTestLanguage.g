/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalDatatypeRulesTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.datatyperules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.datatyperules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.datatyperules.services.DatatypeRulesTestLanguageGrammarAccess;

}

@parser::members {

 	private DatatypeRulesTestLanguageGrammarAccess grammarAccess;

    public InternalDatatypeRulesTestLanguageParser(TokenStream input, DatatypeRulesTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "CompositeModel";
   	}

   	@Override
   	protected DatatypeRulesTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCompositeModel
entryRuleCompositeModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeModelRule()); }
	iv_ruleCompositeModel=ruleCompositeModel
	{ $current=$iv_ruleCompositeModel.current; }
	EOF;

// Rule CompositeModel
ruleCompositeModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCompositeModelAccess().getModelModelParserRuleCall_0());
			}
			lv_model_0_0=ruleModel
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCompositeModelRule());
				}
				add(
					$current,
					"model",
					lv_model_0_0,
					"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Model");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

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
					newCompositeNode(grammarAccess.getModelAccess().getIdNestedModelIdParserRuleCall_0_0());
				}
				lv_id_0_0=ruleNestedModelId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.NestedModelId");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getValueFractionParserRuleCall_1_1_0());
					}
					lv_value_2_0=ruleFraction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"value",
							lv_value_2_0,
							"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Fraction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getNumberSignKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getVectorVectorParserRuleCall_2_1_0());
					}
					lv_vector_4_0=ruleVector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"vector",
							lv_vector_4_0,
							"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Vector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='+'
			{
				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getPlusSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getDotsDotsParserRuleCall_3_1_0());
					}
					lv_dots_6_0=ruleDots
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"dots",
							lv_dots_6_0,
							"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Dots");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='*'
			{
				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getAsteriskKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getDoubleDoubleParserRuleCall_4_1_0());
					}
					lv_double_8_0=ruleDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"double",
							lv_double_8_0,
							"org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Double");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleModelId
entryRuleModelId returns [String current=null]:
	{ newCompositeNode(grammarAccess.getModelIdRule()); }
	iv_ruleModelId=ruleModelId
	{ $current=$iv_ruleModelId.current.getText(); }
	EOF;

// Rule ModelId
ruleModelId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getModelIdAccess().getIDTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getModelIdAccess().getFullStopKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getModelIdAccess().getIDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleNestedModelId
entryRuleNestedModelId returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNestedModelIdRule()); }
	iv_ruleNestedModelId=ruleNestedModelId
	{ $current=$iv_ruleNestedModelId.current.getText(); }
	EOF;

// Rule NestedModelId
ruleNestedModelId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNestedModelIdAccess().getModelIdParserRuleCall_0());
		}
		this_ModelId_0=ruleModelId
		{
			$current.merge(this_ModelId_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNestedModelIdAccess().getFullStopKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getNestedModelIdAccess().getModelIdParserRuleCall_2());
		}
		this_ModelId_2=ruleModelId
		{
			$current.merge(this_ModelId_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFraction
entryRuleFraction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFractionRule()); }
	iv_ruleFraction=ruleFraction
	{ $current=$iv_ruleFraction.current.getText(); }
	EOF;

// Rule Fraction
ruleFraction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_INT_0, grammarAccess.getFractionAccess().getINTTerminalRuleCall_0());
		}
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFractionAccess().getSolidusKeyword_1_0());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getFractionAccess().getINTTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleVector
entryRuleVector returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVectorRule()); }
	iv_ruleVector=ruleVector
	{ $current=$iv_ruleVector.current.getText(); }
	EOF;

// Rule Vector
ruleVector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
		}
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getVectorAccess().getINTTerminalRuleCall_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getVectorAccess().getINTTerminalRuleCall_2());
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVectorAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDots
entryRuleDots returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDotsRule()); }
	iv_ruleDots=ruleDots
	{ $current=$iv_ruleDots.current.getText(); }
	EOF;

// Rule Dots
ruleDots returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDotsAccess().getFullStopKeyword_0_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDotsAccess().getFullStopKeyword_0_1());
			}
		)
		    |
		kw='..'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDotsAccess().getFullStopFullStopKeyword_1());
		}
	)
;

// Entry rule entryRuleDouble
entryRuleDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDoubleRule()); }
	iv_ruleDouble=ruleDouble
	{ $current=$iv_ruleDouble.current.getText(); }
	EOF;

// Rule Double
ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			kw='E'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_4_0());
			}
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_6=RULE_INT
			{
				$current.merge(this_INT_6);
			}
			{
				newLeafNode(this_INT_6, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_4_2());
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
