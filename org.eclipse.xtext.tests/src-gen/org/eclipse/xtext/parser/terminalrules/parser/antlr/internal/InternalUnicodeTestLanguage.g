/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalUnicodeTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.UnicodeTestLanguageGrammarAccess;

}

@parser::members {

 	private UnicodeTestLanguageGrammarAccess grammarAccess;

    public InternalUnicodeTestLanguageParser(TokenStream input, UnicodeTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected UnicodeTestLanguageGrammarAccess getGrammarAccess() {
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
				newCompositeNode(grammarAccess.getModelAccess().getStringsAbstractStringParserRuleCall_0());
			}
			lv_strings_0_0=ruleAbstractString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"strings",
					lv_strings_0_0,
					"org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.AbstractString");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractString
entryRuleAbstractString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractStringRule()); }
	iv_ruleAbstractString=ruleAbstractString
	{ $current=$iv_ruleAbstractString.current; }
	EOF;

// Rule AbstractString
ruleAbstractString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractStringAccess().getGStringParserRuleCall_0());
		}
		this_GString_0=ruleGString
		{
			$current = $this_GString_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractStringAccess().getQuotedStringParserRuleCall_1());
		}
		this_QuotedString_1=ruleQuotedString
		{
			$current = $this_QuotedString_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGString
entryRuleGString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGStringRule()); }
	iv_ruleGString=ruleGString
	{ $current=$iv_ruleGString.current; }
	EOF;

// Rule GString
ruleGString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_GERMAN_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getGStringAccess().getNameGERMAN_STRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getGStringRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.parser.terminalrules.UnicodeTestLanguage.GERMAN_STRING");
			}
		)
	)
;

// Entry rule entryRuleQuotedString
entryRuleQuotedString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuotedStringRule()); }
	iv_ruleQuotedString=ruleQuotedString
	{ $current=$iv_ruleQuotedString.current; }
	EOF;

// Rule QuotedString
ruleQuotedString returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getQuotedStringAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getQuotedStringRule());
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

RULE_GERMAN_STRING : ('A'..'Z'|'a'..'z'|'\u00C4'|'\u00D6'|'\u00DC'|'\u00E4'|'\u00F6'|'\u00FC'|'\u1E9E')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
