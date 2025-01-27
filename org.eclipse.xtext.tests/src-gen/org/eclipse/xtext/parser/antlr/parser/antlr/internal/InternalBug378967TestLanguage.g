/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug378967TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.Bug378967TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug378967TestLanguageGrammarAccess grammarAccess;

    public InternalBug378967TestLanguageParser(TokenStream input, Bug378967TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected Bug378967TestLanguageGrammarAccess getGrammarAccess() {
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
		(
			otherlv_0='1'
			{
				newLeafNode(otherlv_0, grammarAccess.getRootAccess().getDigitOneKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule1ParserRuleCall_0_1_0());
					}
					lv_element_1_0=ruleRule1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_1_0,
							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule1");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='2'
			{
				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getDigitTwoKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule2ParserRuleCall_1_1_0());
					}
					lv_element_3_0=ruleRule2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_3_0,
							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='3'
			{
				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getDigitThreeKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule3ParserRuleCall_2_1_0());
					}
					lv_element_5_0=ruleRule3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_5_0,
							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule3");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='4'
			{
				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getDigitFourKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule4ParserRuleCall_3_1_0());
					}
					lv_element_7_0=ruleRule4
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_7_0,
							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule4");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleRule1
entryRuleRule1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule1Rule()); }
	iv_ruleRule1=ruleRule1
	{ $current=$iv_ruleRule1.current; }
	EOF;

// Rule Rule1
ruleRule1 returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getRule1Access().getTypeFirstEnumEnumRuleCall_0_0());
				}
				lv_type_0_0=ruleFirstEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule1Rule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.FirstEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRule1Access().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule1Rule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule1Access().getUnitSecondEnumEnumRuleCall_2_0());
				}
				lv_unit_2_0=ruleSecondEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule1Rule());
					}
					set(
						$current,
						"unit",
						lv_unit_2_0,
						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SecondEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRule2
entryRuleRule2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule2Rule()); }
	iv_ruleRule2=ruleRule2
	{ $current=$iv_ruleRule2.current; }
	EOF;

// Rule Rule2
ruleRule2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='after'
		{
			newLeafNode(otherlv_0, grammarAccess.getRule2Access().getAfterKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRule2Access().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule2Rule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='s'
		{
			newLeafNode(otherlv_2, grammarAccess.getRule2Access().getSKeyword_2());
		}
	)
;

// Entry rule entryRuleRule3
entryRuleRule3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule3Rule()); }
	iv_ruleRule3=ruleRule3
	{ $current=$iv_ruleRule3.current; }
	EOF;

// Rule Rule3
ruleRule3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRule3Access().getAfterParserRuleCall_0());
		}
		ruleAfter
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRule3Access().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule3Rule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getRule3Access().getSParserRuleCall_2());
		}
		ruleS
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRule4
entryRuleRule4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule4Rule()); }
	iv_ruleRule4=ruleRule4
	{ $current=$iv_ruleRule4.current; }
	EOF;

// Rule Rule4
ruleRule4 returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getRule4Access().getAfterAfterObjParserRuleCall_0_0());
				}
				lv_after_0_0=ruleAfterObj
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule4Rule());
					}
					set(
						$current,
						"after",
						lv_after_0_0,
						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.AfterObj");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRule4Access().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule4Rule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule4Access().getSSObjParserRuleCall_2_0());
				}
				lv_s_2_0=ruleSObj
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule4Rule());
					}
					set(
						$current,
						"s",
						lv_s_2_0,
						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SObj");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAfterObj
entryRuleAfterObj returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAfterObjRule()); }
	iv_ruleAfterObj=ruleAfterObj
	{ $current=$iv_ruleAfterObj.current; }
	EOF;

// Rule AfterObj
ruleAfterObj returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0='after'
			{
				newLeafNode(lv_value_0_0, grammarAccess.getAfterObjAccess().getValueAfterKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAfterObjRule());
				}
				setWithLastConsumed($current, "value", lv_value_0_0, "after");
			}
		)
	)
;

// Entry rule entryRuleSObj
entryRuleSObj returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSObjRule()); }
	iv_ruleSObj=ruleSObj
	{ $current=$iv_ruleSObj.current; }
	EOF;

// Rule SObj
ruleSObj returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0='s'
			{
				newLeafNode(lv_value_0_0, grammarAccess.getSObjAccess().getValueSKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSObjRule());
				}
				setWithLastConsumed($current, "value", lv_value_0_0, "s");
			}
		)
	)
;

// Entry rule entryRuleAfter
entryRuleAfter returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAfterRule()); }
	iv_ruleAfter=ruleAfter
	{ $current=$iv_ruleAfter.current.getText(); }
	EOF;

// Rule After
ruleAfter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='after'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getAfterAccess().getAfterKeyword());
	}
;

// Entry rule entryRuleS
entryRuleS returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSRule()); }
	iv_ruleS=ruleS
	{ $current=$iv_ruleS.current.getText(); }
	EOF;

// Rule S
ruleS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='s'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSAccess().getSKeyword());
	}
;

// Rule FirstEnum
ruleFirstEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='after'
		{
			$current = grammarAccess.getFirstEnumAccess().getValueEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getFirstEnumAccess().getValueEnumLiteralDeclaration());
		}
	)
;

// Rule SecondEnum
ruleSecondEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='s'
		{
			$current = grammarAccess.getSecondEnumAccess().getValueEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getSecondEnumAccess().getValueEnumLiteralDeclaration());
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
