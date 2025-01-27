/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalConcreteTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.grammarinheritance.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.grammarinheritance.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.grammarinheritance.services.ConcreteTestLanguageGrammarAccess;

}

@parser::members {

 	private ConcreteTestLanguageGrammarAccess grammarAccess;

    public InternalConcreteTestLanguageParser(TokenStream input, ConcreteTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RootRule";
   	}

   	@Override
   	protected ConcreteTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRootRule
entryRuleRootRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRuleRule()); }
	iv_ruleRootRule=ruleRootRule
	{ $current=$iv_ruleRootRule.current; }
	EOF;

// Rule RootRule
ruleRootRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRootRuleAccess().getConcreteParserRuleParserRuleCall_0());
		}
		this_ConcreteParserRule_0=ruleConcreteParserRule
		{
			$current = $this_ConcreteParserRule_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootRuleAccess().getCallOverridenParserRuleParserRuleCall_1());
		}
		this_CallOverridenParserRule_1=ruleCallOverridenParserRule
		{
			$current = $this_CallOverridenParserRule_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootRuleAccess().getCallExtendedParserRuleParserRuleCall_2());
		}
		this_CallExtendedParserRule_2=ruleCallExtendedParserRule
		{
			$current = $this_CallExtendedParserRule_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootRuleAccess().getOverridableParserRule2ParserRuleCall_3());
		}
		this_OverridableParserRule2_3=ruleOverridableParserRule2
		{
			$current = $this_OverridableParserRule2_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConcreteParserRule
entryRuleConcreteParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConcreteParserRuleRule()); }
	iv_ruleConcreteParserRule=ruleConcreteParserRule
	{ $current=$iv_ruleConcreteParserRule.current; }
	EOF;

// Rule ConcreteParserRule
ruleConcreteParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getConcreteParserRuleAccess().getModelKeyword_0());
		}
		(
			(
				lv_magicNumber_1_0=RULE_REAL
				{
					newLeafNode(lv_magicNumber_1_0, grammarAccess.getConcreteParserRuleAccess().getMagicNumberREALTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConcreteParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"magicNumber",
						lv_magicNumber_1_0,
						"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.REAL");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getConcreteParserRuleAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConcreteParserRuleAccess().getElementsInheritedParserRuleParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleInheritedParserRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConcreteParserRuleRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.InheritedParserRule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOverridableParserRule
entryRuleOverridableParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOverridableParserRuleRule()); }
	iv_ruleOverridableParserRule=ruleOverridableParserRule
	{ $current=$iv_ruleOverridableParserRule.current; }
	EOF;

// Rule OverridableParserRule
ruleOverridableParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='overriddenelement'
		{
			newLeafNode(otherlv_0, grammarAccess.getOverridableParserRuleAccess().getOverriddenelementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOverridableParserRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridableParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCallOverridenParserRule
entryRuleCallOverridenParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallOverridenParserRuleRule()); }
	iv_ruleCallOverridenParserRule=ruleCallOverridenParserRule
	{ $current=$iv_ruleCallOverridenParserRule.current; }
	EOF;

// Rule CallOverridenParserRule
ruleCallOverridenParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCallOverridenParserRuleAccess().getCallAbstractCallOverridenParserRuleParserRuleCall_0());
			}
			lv_call_0_0=ruleAbstractCallOverridenParserRule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCallOverridenParserRuleRule());
				}
				set(
					$current,
					"call",
					lv_call_0_0,
					"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.AbstractCallOverridenParserRule");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleOverridableParserRule2
entryRuleOverridableParserRule2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOverridableParserRule2Rule()); }
	iv_ruleOverridableParserRule2=ruleOverridableParserRule2
	{ $current=$iv_ruleOverridableParserRule2.current; }
	EOF;

// Rule OverridableParserRule2
ruleOverridableParserRule2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='overridden other element'
		{
			newLeafNode(otherlv_0, grammarAccess.getOverridableParserRule2Access().getOverriddenOtherElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOverridableParserRule2Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridableParserRule2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
		otherlv_2='-'
		{
			newLeafNode(otherlv_2, grammarAccess.getOverridableParserRule2Access().getHyphenMinusKeyword_2());
		}
		(
			(
				lv_age_3_0=RULE_INT
				{
					newLeafNode(lv_age_3_0, grammarAccess.getOverridableParserRule2Access().getAgeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridableParserRule2Rule());
					}
					setWithLastConsumed(
						$current,
						"age",
						lv_age_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleExtendableParserRule
entryRuleExtendableParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendableParserRuleRule()); }
	iv_ruleExtendableParserRule=ruleExtendableParserRule
	{ $current=$iv_ruleExtendableParserRule.current; }
	EOF;

// Rule ExtendableParserRule
ruleExtendableParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExtendableParserRuleAccess().getSubrule1ParserRuleCall_0());
		}
		this_Subrule1_0=ruleSubrule1
		{
			$current = $this_Subrule1_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExtendableParserRuleAccess().getSubrule2ParserRuleCall_1());
		}
		this_Subrule2_1=ruleSubrule2
		{
			$current = $this_Subrule2_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExtendableParserRuleAccess().getSubrule3ParserRuleCall_2());
		}
		this_Subrule3_2=ruleSubrule3
		{
			$current = $this_Subrule3_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSubrule1
entryRuleSubrule1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubrule1Rule()); }
	iv_ruleSubrule1=ruleSubrule1
	{ $current=$iv_ruleSubrule1.current; }
	EOF;

// Rule Subrule1
ruleSubrule1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='subrule1'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubrule1Access().getSubrule1Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSubrule1Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule1Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
		(
			(
				lv_sub1_2_0=RULE_ID
				{
					newLeafNode(lv_sub1_2_0, grammarAccess.getSubrule1Access().getSub1IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule1Rule());
					}
					setWithLastConsumed(
						$current,
						"sub1",
						lv_sub1_2_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSubrule2
entryRuleSubrule2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubrule2Rule()); }
	iv_ruleSubrule2=ruleSubrule2
	{ $current=$iv_ruleSubrule2.current; }
	EOF;

// Rule Subrule2
ruleSubrule2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='subrule3'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubrule2Access().getSubrule3Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSubrule2Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
		(
			(
				lv_sub2_2_0=RULE_STRING
				{
					newLeafNode(lv_sub2_2_0, grammarAccess.getSubrule2Access().getSub2STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule2Rule());
					}
					setWithLastConsumed(
						$current,
						"sub2",
						lv_sub2_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSubrule3
entryRuleSubrule3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubrule3Rule()); }
	iv_ruleSubrule3=ruleSubrule3
	{ $current=$iv_ruleSubrule3.current; }
	EOF;

// Rule Subrule3
ruleSubrule3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='subrule3'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubrule3Access().getSubrule3Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSubrule3Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule3Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
		(
			(
				lv_sub1_2_0=RULE_INT
				{
					newLeafNode(lv_sub1_2_0, grammarAccess.getSubrule3Access().getSub1INTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubrule3Rule());
					}
					setWithLastConsumed(
						$current,
						"sub1",
						lv_sub1_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCallExtendedParserRule
entryRuleCallExtendedParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallExtendedParserRuleRule()); }
	iv_ruleCallExtendedParserRule=ruleCallExtendedParserRule
	{ $current=$iv_ruleCallExtendedParserRule.current; }
	EOF;

// Rule CallExtendedParserRule
ruleCallExtendedParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCallExtendedParserRuleAccess().getCallAbstractCallExtendedParserRuleParserRuleCall_0());
			}
			lv_call_0_0=ruleAbstractCallExtendedParserRule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCallExtendedParserRuleRule());
				}
				set(
					$current,
					"call",
					lv_call_0_0,
					"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.AbstractCallExtendedParserRule");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleInheritedParserRule
entryRuleInheritedParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritedParserRuleRule()); }
	iv_ruleInheritedParserRule=ruleInheritedParserRule
	{ $current=$iv_ruleInheritedParserRule.current; }
	EOF;

// Rule InheritedParserRule
ruleInheritedParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritedParserRuleAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInheritedParserRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritedParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAbstractCallOverridenParserRule
entryRuleAbstractCallOverridenParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractCallOverridenParserRuleRule()); }
	iv_ruleAbstractCallOverridenParserRule=ruleAbstractCallOverridenParserRule
	{ $current=$iv_ruleAbstractCallOverridenParserRule.current; }
	EOF;

// Rule AbstractCallOverridenParserRule
ruleAbstractCallOverridenParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='overridemodel'
		{
			newLeafNode(otherlv_0, grammarAccess.getAbstractCallOverridenParserRuleAccess().getOverridemodelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractCallOverridenParserRuleAccess().getElementsOverridableParserRuleParserRuleCall_1_0());
				}
				lv_elements_1_0=ruleOverridableParserRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractCallOverridenParserRuleRule());
					}
					add(
						$current,
						"elements",
						lv_elements_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.OverridableParserRule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractCallExtendedParserRule
entryRuleAbstractCallExtendedParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractCallExtendedParserRuleRule()); }
	iv_ruleAbstractCallExtendedParserRule=ruleAbstractCallExtendedParserRule
	{ $current=$iv_ruleAbstractCallExtendedParserRule.current; }
	EOF;

// Rule AbstractCallExtendedParserRule
ruleAbstractCallExtendedParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='extendedmodel'
		{
			newLeafNode(otherlv_0, grammarAccess.getAbstractCallExtendedParserRuleAccess().getExtendedmodelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractCallExtendedParserRuleAccess().getElementsExtendableParserRuleParserRuleCall_1_0());
				}
				lv_elements_1_0=ruleExtendableParserRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractCallExtendedParserRuleRule());
					}
					add(
						$current,
						"elements",
						lv_elements_1_0,
						"org.eclipse.xtext.grammarinheritance.ConcreteTestLanguage.ExtendableParserRule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

RULE_ID : SUPER_ID;

RULE_REAL : RULE_INT '.' RULE_INT;

fragment SUPER_ID : '^'? ('a'..'z'|'A'..'Z'|'\u00F6'|'\u00E4'|'\u00FC'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
