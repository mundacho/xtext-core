/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSubTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.generator.ecore.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.generator.ecore.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.generator.ecore.services.SubTestLanguageGrammarAccess;

}

@parser::members {

 	private SubTestLanguageGrammarAccess grammarAccess;

    public InternalSubTestLanguageParser(TokenStream input, SubTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SubMain";
   	}

   	@Override
   	protected SubTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSubMain
entryRuleSubMain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubMainRule()); }
	iv_ruleSubMain=ruleSubMain
	{ $current=$iv_ruleSubMain.current; }
	EOF;

// Rule SubMain
ruleSubMain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubMainAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubMainAccess().getSuperMainsSuperMainParserRuleCall_1_0());
				}
				lv_superMains_1_0=ruleSuperMain
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubMainRule());
					}
					add(
						$current,
						"superMains",
						lv_superMains_1_0,
						"org.eclipse.xtext.generator.ecore.SuperTestLanguage.SuperMain");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getSubMainAccess().getRightCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubMainAccess().getAnotherAnotherSuperMainParserRuleCall_3_0());
				}
				lv_another_3_0=ruleAnotherSuperMain
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubMainRule());
					}
					set(
						$current,
						"another",
						lv_another_3_0,
						"org.eclipse.xtext.generator.ecore.SubTestLanguage.AnotherSuperMain");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAnotherSuperMain
entryRuleAnotherSuperMain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnotherSuperMainRule()); }
	iv_ruleAnotherSuperMain=ruleAnotherSuperMain
	{ $current=$iv_ruleAnotherSuperMain.current; }
	EOF;

// Rule AnotherSuperMain
ruleAnotherSuperMain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ups'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnotherSuperMainAccess().getUpsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnotherSuperMainAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnotherSuperMainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSuperMain
entryRuleSuperMain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuperMainRule()); }
	iv_ruleSuperMain=ruleSuperMain
	{ $current=$iv_ruleSuperMain.current; }
	EOF;

// Rule SuperMain
ruleSuperMain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='super'
		{
			newLeafNode(otherlv_0, grammarAccess.getSuperMainAccess().getSuperKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSuperMainAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSuperMainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
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
