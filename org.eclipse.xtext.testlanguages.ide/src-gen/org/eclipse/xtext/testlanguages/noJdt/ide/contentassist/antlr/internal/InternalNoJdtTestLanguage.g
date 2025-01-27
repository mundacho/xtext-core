/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalNoJdtTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	k=1;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.noJdt.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.noJdt.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.testlanguages.noJdt.services.NoJdtTestLanguageGrammarAccess;

}
@parser::members {
	private NoJdtTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(NoJdtTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGreeting
entryRuleGreeting
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingAccess().getGroup()); }
		(rule__Greeting__Group__0)
		{ after(grammarAccess.getGreetingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__0__Impl
	rule__Greeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
	'Hello'
	{ after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__1__Impl
	rule__Greeting__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
	(rule__Greeting__NameAssignment_1)
	{ after(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__2__Impl
	rule__Greeting__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getGroup_2()); }
	(rule__Greeting__Group_2__0)?
	{ after(grammarAccess.getGreetingAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_3()); }
	'!'
	{ after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Greeting__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_2__0__Impl
	rule__Greeting__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_2__1__Impl
	rule__Greeting__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getFromKeyword_2_1()); }
	'from'
	{ after(grammarAccess.getGreetingAccess().getFromKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_2__2__Impl
	rule__Greeting__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getOtherAssignment_2_2()); }
	(rule__Greeting__OtherAssignment_2_2)
	{ after(grammarAccess.getGreetingAccess().getOtherAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
		ruleGreeting
		{ after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__OtherAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getOtherGreetingCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGreetingAccess().getOtherGreetingIDTerminalRuleCall_2_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getGreetingAccess().getOtherGreetingIDTerminalRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGreetingAccess().getOtherGreetingCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
