/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalIndentationAwareTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.indent.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.indent.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.indent.services.IndentationAwareTestLanguageGrammarAccess;

}

@parser::members {

 	private IndentationAwareTestLanguageGrammarAccess grammarAccess;

    public InternalIndentationAwareTestLanguageParser(TokenStream input, IndentationAwareTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "NodeList";
   	}

   	@Override
   	protected IndentationAwareTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNodeList
entryRuleNodeList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeListRule()); }
	iv_ruleNodeList=ruleNodeList
	{ $current=$iv_ruleNodeList.current; }
	EOF;

// Rule NodeList
ruleNodeList returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getNodeListAccess().getChildrenNodeParserRuleCall_0_0());
				}
				lv_children_0_0=ruleNode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeListRule());
					}
					add(
						$current,
						"children",
						lv_children_0_0,
						"org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.Node");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_NL_1=RULE_NL
			{
				newLeafNode(this_NL_1, grammarAccess.getNodeListAccess().getNLTerminalRuleCall_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNodeListAccess().getChildrenNodeParserRuleCall_1_1_0());
					}
					lv_children_2_0=ruleNode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNodeListRule());
						}
						add(
							$current,
							"children",
							lv_children_2_0,
							"org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.Node");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	iv_ruleNode=ruleNode
	{ $current=$iv_ruleNode.current; }
	EOF;

// Rule Node
ruleNode returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getNodeAccess().getNameStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.String");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_NL_1=RULE_NL
			{
				newLeafNode(this_NL_1, grammarAccess.getNodeAccess().getNLTerminalRuleCall_1_0());
			}
			this_BEGIN_2=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_2, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNodeAccess().getChildrenNodeListParserRuleCall_1_2_0());
					}
					lv_children_3_0=ruleNodeList
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNodeRule());
						}
						set(
							$current,
							"children",
							lv_children_3_0,
							"org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.NodeList");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_END_4=RULE_END
			{
				newLeafNode(this_END_4, grammarAccess.getNodeAccess().getENDTerminalRuleCall_1_3());
			}
		)?
	)
;

// Entry rule entryRuleString
entryRuleString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStringRule()); }
	iv_ruleString=ruleString
	{ $current=$iv_ruleString.current.getText(); }
	EOF;

// Rule String
ruleString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_OTHER_0=RULE_OTHER
		{
			$current.merge(this_OTHER_0);
		}
		{
			newLeafNode(this_OTHER_0, grammarAccess.getStringAccess().getOTHERTerminalRuleCall());
		}
	)+
;

RULE_NL : ('\r'|'\n')+ '\t'*;

RULE_BEGIN : '{';

RULE_END : '}';

RULE_OTHER : .;
