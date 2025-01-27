/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug250313;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.valueconverter.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.valueconverter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.valueconverter.services.Bug250313GrammarAccess;

}

@parser::members {

 	private Bug250313GrammarAccess grammarAccess;

    public InternalBug250313Parser(TokenStream input, Bug250313GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug250313GrammarAccess getGrammarAccess() {
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
				otherlv_0='1'
				{
					newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDigitOneKeyword_0_0());
				}
			)?
			(
				(
					(
						lv_value_1_1='mykeyword1'
						{
							newLeafNode(lv_value_1_1, grammarAccess.getModelAccess().getValueMykeyword1Keyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							setWithLastConsumed($current, "value", lv_value_1_1, null);
						}
						    |
						lv_value_1_2=RULE_STRING
						{
							newLeafNode(lv_value_1_2, grammarAccess.getModelAccess().getValueSTRINGTerminalRuleCall_0_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_1_2,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getValueNestedDatatypeParserRuleCall_0_1_0_2());
						}
						lv_value_1_3=ruleNestedDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"value",
								lv_value_1_3,
								"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getValueDatatypeParserRuleCall_0_1_0_3());
						}
						lv_value_1_4=ruleDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"value",
								lv_value_1_4,
								"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
							afterParserOrEnumRuleCall();
						}
						    |
						lv_value_1_5=RULE_ID
						{
							newLeafNode(lv_value_1_5, grammarAccess.getModelAccess().getValueIDTerminalRuleCall_0_1_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_1_5,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
		    |
		(
			otherlv_2='1+'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDigitOnePlusSignKeyword_1_0());
			}
			(
				(
					(
						lv_multiValue_3_1='mykeyword1'
						{
							newLeafNode(lv_multiValue_3_1, grammarAccess.getModelAccess().getMultiValueMykeyword1Keyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed($current, "multiValue", lv_multiValue_3_1, null);
						}
						    |
						lv_multiValue_3_2=RULE_STRING
						{
							newLeafNode(lv_multiValue_3_2, grammarAccess.getModelAccess().getMultiValueSTRINGTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed(
								$current,
								"multiValue",
								lv_multiValue_3_2,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getMultiValueNestedDatatypeParserRuleCall_1_1_0_2());
						}
						lv_multiValue_3_3=ruleNestedDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							add(
								$current,
								"multiValue",
								lv_multiValue_3_3,
								"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getMultiValueDatatypeParserRuleCall_1_1_0_3());
						}
						lv_multiValue_3_4=ruleDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							add(
								$current,
								"multiValue",
								lv_multiValue_3_4,
								"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
							afterParserOrEnumRuleCall();
						}
						    |
						lv_multiValue_3_5=RULE_ID
						{
							newLeafNode(lv_multiValue_3_5, grammarAccess.getModelAccess().getMultiValueIDTerminalRuleCall_1_1_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed(
								$current,
								"multiValue",
								lv_multiValue_3_5,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='2'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDigitTwoKeyword_2_0());
			}
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getModelAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_6='2+'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getDigitTwoPlusSignKeyword_3_0());
			}
			(
				(
					lv_multiValue_7_0=RULE_STRING
					{
						newLeafNode(lv_multiValue_7_0, grammarAccess.getModelAccess().getMultiValueSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						addWithLastConsumed(
							$current,
							"multiValue",
							lv_multiValue_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_8='3'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getDigitThreeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getValueDatatypeParserRuleCall_4_1_0());
					}
					lv_value_9_0=ruleDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"value",
							lv_value_9_0,
							"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_10='3+'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getDigitThreePlusSignKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getMultiValueDatatypeParserRuleCall_5_1_0());
					}
					lv_multiValue_11_0=ruleDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"multiValue",
							lv_multiValue_11_0,
							"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='4'
			{
				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getDigitFourKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getValueNestedDatatypeParserRuleCall_6_1_0());
					}
					lv_value_13_0=ruleNestedDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"value",
							lv_value_13_0,
							"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_14='4+'
			{
				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getDigitFourPlusSignKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getMultiValueNestedDatatypeParserRuleCall_7_1_0());
					}
					lv_multiValue_15_0=ruleNestedDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"multiValue",
							lv_multiValue_15_0,
							"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_16='content'
			{
				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getContentKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getChildrenChildParserRuleCall_8_1_0());
					}
					lv_children_17_0=ruleChild
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"children",
							lv_children_17_0,
							"org.eclipse.xtext.valueconverter.Bug250313.Child");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current.getText(); }
	EOF;

// Rule Datatype
ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_0());
		}
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getHyphenMinusKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleNestedDatatype
entryRuleNestedDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNestedDatatypeRule()); }
	iv_ruleNestedDatatype=ruleNestedDatatype
	{ $current=$iv_ruleNestedDatatype.current.getText(); }
	EOF;

// Rule NestedDatatype
ruleNestedDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getNestedDatatypeAccess().getIDTerminalRuleCall_0());
		}
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNestedDatatypeAccess().getPlusSignKeyword_1());
		}
		(
			{
				newCompositeNode(grammarAccess.getNestedDatatypeAccess().getDatatypeParserRuleCall_2());
			}
			this_Datatype_2=ruleDatatype
			{
				$current.merge(this_Datatype_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleChild
entryRuleChild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildRule()); }
	iv_ruleChild=ruleChild
	{ $current=$iv_ruleChild.current; }
	EOF;

// Rule Child
ruleChild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getChildAccess().getChild1ParserRuleCall_0());
		}
		this_Child1_0=ruleChild1
		{
			$current = $this_Child1_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getChildAccess().getChild2ParserRuleCall_1());
		}
		this_Child2_1=ruleChild2
		{
			$current = $this_Child2_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChild1
entryRuleChild1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChild1Rule()); }
	iv_ruleChild1=ruleChild1
	{ $current=$iv_ruleChild1.current; }
	EOF;

// Rule Child1
ruleChild1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getChild1Access().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getChild1Rule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleChild2
entryRuleChild2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChild2Rule()); }
	iv_ruleChild2=ruleChild2
	{ $current=$iv_ruleChild2.current; }
	EOF;

// Rule Child2
ruleChild2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getChild2Access().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getChild2Rule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
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
