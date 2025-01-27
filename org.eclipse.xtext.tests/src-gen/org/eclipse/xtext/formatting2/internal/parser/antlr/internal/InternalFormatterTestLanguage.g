/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalFormatterTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.formatting2.internal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.formatting2.internal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.formatting2.internal.services.FormatterTestLanguageGrammarAccess;

}

@parser::members {

 	private FormatterTestLanguageGrammarAccess grammarAccess;

    public InternalFormatterTestLanguageParser(TokenStream input, FormatterTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected FormatterTestLanguageGrammarAccess getGrammarAccess() {
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
		{
			newCompositeNode(grammarAccess.getRootAccess().getIDListParserRuleCall_0());
		}
		this_IDList_0=ruleIDList
		{
			$current = $this_IDList_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootAccess().getKWListParserRuleCall_1());
		}
		this_KWList_1=ruleKWList
		{
			$current = $this_KWList_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIDList
entryRuleIDList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIDListRule()); }
	iv_ruleIDList=ruleIDList
	{ $current=$iv_ruleIDList.current; }
	EOF;

// Rule IDList
ruleIDList returns [EObject current=null]
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
					grammarAccess.getIDListAccess().getIDListAction_0(),
					$current);
			}
		)
		otherlv_1='idlist'
		{
			newLeafNode(otherlv_1, grammarAccess.getIDListAccess().getIdlistKeyword_1());
		}
		(
			(
				lv_ids_2_0=RULE_ID
				{
					newLeafNode(lv_ids_2_0, grammarAccess.getIDListAccess().getIdsIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIDListRule());
					}
					addWithLastConsumed(
						$current,
						"ids",
						lv_ids_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)*
	)
;

// Entry rule entryRuleKWList
entryRuleKWList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKWListRule()); }
	iv_ruleKWList=ruleKWList
	{ $current=$iv_ruleKWList.current; }
	EOF;

// Rule KWList
ruleKWList returns [EObject current=null]
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
					grammarAccess.getKWListAccess().getKWListAction_0(),
					$current);
			}
		)
		otherlv_1='kwlist'
		{
			newLeafNode(otherlv_1, grammarAccess.getKWListAccess().getKwlistKeyword_1());
		}
		(
			(
				lv_kw1_2_0='kw1'
				{
					newLeafNode(lv_kw1_2_0, grammarAccess.getKWListAccess().getKw1Kw1Keyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKWListRule());
					}
					setWithLastConsumed($current, "kw1", lv_kw1_2_0 != null, "kw1");
				}
			)
		)?
		(
			(
				lv_kw2_3_0='kw2'
				{
					newLeafNode(lv_kw2_3_0, grammarAccess.getKWListAccess().getKw2Kw2Keyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKWListRule());
					}
					setWithLastConsumed($current, "kw2", lv_kw2_3_0 != null, "kw2");
				}
			)
		)?
		(
			(
				lv_kw3_4_0='kw3'
				{
					newLeafNode(lv_kw3_4_0, grammarAccess.getKWListAccess().getKw3Kw3Keyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKWListRule());
					}
					setWithLastConsumed($current, "kw3", lv_kw3_4_0 != null, "kw3");
				}
			)
		)?
		(
			(
				lv_kw4_5_0='kw4'
				{
					newLeafNode(lv_kw4_5_0, grammarAccess.getKWListAccess().getKw4Kw4Keyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKWListRule());
					}
					setWithLastConsumed($current, "kw4", lv_kw4_5_0 != null, "kw4");
				}
			)
		)?
		(
			(
				lv_kw5_6_0='kw5'
				{
					newLeafNode(lv_kw5_6_0, grammarAccess.getKWListAccess().getKw5Kw5Keyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKWListRule());
					}
					setWithLastConsumed($current, "kw5", lv_kw5_6_0 != null, "kw5");
				}
			)
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
