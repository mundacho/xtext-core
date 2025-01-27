/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug301935TestLanguage;

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
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.Bug301935TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug301935TestLanguageGrammarAccess grammarAccess;

    public InternalBug301935TestLanguageParser(TokenStream input, Bug301935TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug301935TestLanguageGrammarAccess getGrammarAccess() {
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
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.ID");
				}
			)
		)
		this_WS_1=RULE_WS
		{
			newLeafNode(this_WS_1, grammarAccess.getModelAccess().getWSTerminalRuleCall_1());
		}
		(
			(
				lv_value_2_0=RULE_ID
				{
					newLeafNode(lv_value_2_0, grammarAccess.getModelAccess().getValueIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.ID");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getModelAccess().getNLParserRuleCall_3());
		}
		ruleNL
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_value2_4_0=RULE_ID
				{
					newLeafNode(lv_value2_4_0, grammarAccess.getModelAccess().getValue2IDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"value2",
						lv_value2_4_0,
						"org.eclipse.xtext.parser.antlr.Bug301935TestLanguage.ID");
				}
			)
		)
		this_WS_5=RULE_WS
		{
			newLeafNode(this_WS_5, grammarAccess.getModelAccess().getWSTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleNL
entryRuleNL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNLRule()); }
	iv_ruleNL=ruleNL
	{ $current=$iv_ruleNL.current.getText(); }
	EOF;

// Rule NL
ruleNL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_WS_0=RULE_WS
			{
				$current.merge(this_WS_0);
			}
			{
				newLeafNode(this_WS_0, grammarAccess.getNLAccess().getWSTerminalRuleCall_0());
			}
		)*
		(
			(
				kw='\r'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getNLAccess().getCarriageReturnKeyword_1_0());
				}
			)?
			kw='\n'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNLAccess().getLineFeedKeyword_1_1());
			}
		)
		(
			this_WS_3=RULE_WS
			{
				$current.merge(this_WS_3);
			}
			{
				newLeafNode(this_WS_3, grammarAccess.getNLAccess().getWSTerminalRuleCall_2());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_WS : (' '|'\t')+;

RULE_ANY_OTHER : .;
