/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.assignments.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug288432TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class BodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Body");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cParameterAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cParameterParameterParserRuleCall_0_1_0 = (RuleCall)cParameterAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cParameterAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cParameterParameterParserRuleCall_0_2_1_0 = (RuleCall)cParameterAssignment_0_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Keyword cBodyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cContentAlternatives_2_0 = (Alternatives)cContentAssignment_2.eContents().get(0);
		private final RuleCall cContentContentParserRuleCall_2_0_0 = (RuleCall)cContentAlternatives_2_0.eContents().get(0);
		private final RuleCall cContentParameterRefParserRuleCall_2_0_1 = (RuleCall)cContentAlternatives_2_0.eContents().get(1);
		private final Assignment cFooAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFooFooParserRuleCall_3_0 = (RuleCall)cFooAssignment_3.eContents().get(0);
		private final Keyword cEndBodyKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Body :
		//    ('(' parameter+=(Parameter) (',' parameter+=(Parameter))* ')')?
		//    'body'
		//    content=(Content|ParameterRef)
		//    (foo+=Foo)+
		//    /* SuppressWarnings[SpacesInKeyword] */
		//    'end body';
		@Override public ParserRule getRule() { return rule; }
		
		//('(' parameter+=(Parameter) (',' parameter+=(Parameter))* ')')?
		//'body'
		//content=(Content|ParameterRef)
		//(foo+=Foo)+
		///* SuppressWarnings[SpacesInKeyword] */
		//'end body'
		public Group getGroup() { return cGroup; }
		
		//('(' parameter+=(Parameter) (',' parameter+=(Parameter))* ')')?
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//parameter+=(Parameter)
		public Assignment getParameterAssignment_0_1() { return cParameterAssignment_0_1; }
		
		//(Parameter)
		public RuleCall getParameterParameterParserRuleCall_0_1_0() { return cParameterParameterParserRuleCall_0_1_0; }
		
		//(',' parameter+=(Parameter))*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//','
		public Keyword getCommaKeyword_0_2_0() { return cCommaKeyword_0_2_0; }
		
		//parameter+=(Parameter)
		public Assignment getParameterAssignment_0_2_1() { return cParameterAssignment_0_2_1; }
		
		//(Parameter)
		public RuleCall getParameterParameterParserRuleCall_0_2_1_0() { return cParameterParameterParserRuleCall_0_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//'body'
		public Keyword getBodyKeyword_1() { return cBodyKeyword_1; }
		
		//content=(Content|ParameterRef)
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//(Content|ParameterRef)
		public Alternatives getContentAlternatives_2_0() { return cContentAlternatives_2_0; }
		
		//Content
		public RuleCall getContentContentParserRuleCall_2_0_0() { return cContentContentParserRuleCall_2_0_0; }
		
		//ParameterRef
		public RuleCall getContentParameterRefParserRuleCall_2_0_1() { return cContentParameterRefParserRuleCall_2_0_1; }
		
		//(foo+=Foo)+
		public Assignment getFooAssignment_3() { return cFooAssignment_3; }
		
		//Foo
		public RuleCall getFooFooParserRuleCall_3_0() { return cFooFooParserRuleCall_3_0; }
		
		///* SuppressWarnings[SpacesInKeyword] */
		//'end body'
		public Keyword getEndBodyKeyword_4() { return cEndBodyKeyword_4; }
	}
	public class FooElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Foo");
		private final Assignment cFooValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFooValueSTRINGTerminalRuleCall_0 = (RuleCall)cFooValueAssignment.eContents().get(0);
		
		//Foo:
		//    fooValue = STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//fooValue = STRING
		public Assignment getFooValueAssignment() { return cFooValueAssignment; }
		
		//STRING
		public RuleCall getFooValueSTRINGTerminalRuleCall_0() { return cFooValueSTRINGTerminalRuleCall_0; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cMyElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEndContentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Content :
		//    'content' MyElement
		//    /* SuppressWarnings[SpacesInKeyword] */
		//    'end content' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'content' MyElement
		///* SuppressWarnings[SpacesInKeyword] */
		//'end content'
		public Group getGroup() { return cGroup; }
		
		//'content'
		public Keyword getContentKeyword_0() { return cContentKeyword_0; }
		
		//MyElement
		public RuleCall getMyElementParserRuleCall_1() { return cMyElementParserRuleCall_1; }
		
		///* SuppressWarnings[SpacesInKeyword] */
		//'end content'
		public Keyword getEndContentKeyword_2() { return cEndContentKeyword_2; }
	}
	public class MyElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.MyElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cBarAlternatives_1_0 = (Alternatives)cBarAssignment_1.eContents().get(0);
		private final RuleCall cBarMyIntParserRuleCall_1_0_0 = (RuleCall)cBarAlternatives_1_0.eContents().get(0);
		private final RuleCall cBarParameterRefParserRuleCall_1_0_1 = (RuleCall)cBarAlternatives_1_0.eContents().get(1);
		
		//MyElement :
		//    'element' bar=(MyInt|ParameterRef);
		@Override public ParserRule getRule() { return rule; }
		
		//'element' bar=(MyInt|ParameterRef)
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//bar=(MyInt|ParameterRef)
		public Assignment getBarAssignment_1() { return cBarAssignment_1; }
		
		//(MyInt|ParameterRef)
		public Alternatives getBarAlternatives_1_0() { return cBarAlternatives_1_0; }
		
		//MyInt
		public RuleCall getBarMyIntParserRuleCall_1_0_0() { return cBarMyIntParserRuleCall_1_0_0; }
		
		//ParameterRef
		public RuleCall getBarParameterRefParserRuleCall_1_0_1() { return cBarParameterRefParserRuleCall_1_0_1; }
	}
	public class ParameterObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.ParameterObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMyIntParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cContentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParameterRefParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ParameterObject :
		//    MyInt | Content | ParameterRef    ;
		@Override public ParserRule getRule() { return rule; }
		
		//MyInt | Content | ParameterRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MyInt
		public RuleCall getMyIntParserRuleCall_0() { return cMyIntParserRuleCall_0; }
		
		//Content
		public RuleCall getContentParserRuleCall_1() { return cContentParserRuleCall_1; }
		
		//ParameterRef
		public RuleCall getParameterRefParserRuleCall_2() { return cParameterRefParserRuleCall_2; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cValueParameterObjectCrossReference_1_0 = (CrossReference)cValueAssignment_1.eContents().get(0);
		private final RuleCall cValueParameterObjectIDTerminalRuleCall_1_0_1 = (RuleCall)cValueParameterObjectCrossReference_1_0.eContents().get(1);
		
		//Parameter:
		//    name=ID
		//    (value=[ParameterObject])?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		//(value=[ParameterObject])?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(value=[ParameterObject])?
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//[ParameterObject]
		public CrossReference getValueParameterObjectCrossReference_1_0() { return cValueParameterObjectCrossReference_1_0; }
		
		//ID
		public RuleCall getValueParameterObjectIDTerminalRuleCall_1_0_1() { return cValueParameterObjectIDTerminalRuleCall_1_0_1; }
	}
	public class ParameterRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.ParameterRef");
		private final Assignment cParameterAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cParameterParameterCrossReference_0 = (CrossReference)cParameterAssignment.eContents().get(0);
		private final RuleCall cParameterParameterIDTerminalRuleCall_0_1 = (RuleCall)cParameterParameterCrossReference_0.eContents().get(1);
		
		//ParameterRef:
		//    parameter=[Parameter];
		@Override public ParserRule getRule() { return rule; }
		
		//parameter=[Parameter]
		public Assignment getParameterAssignment() { return cParameterAssignment; }
		
		//[Parameter]
		public CrossReference getParameterParameterCrossReference_0() { return cParameterParameterCrossReference_0; }
		
		//ID
		public RuleCall getParameterParameterIDTerminalRuleCall_0_1() { return cParameterParameterIDTerminalRuleCall_0_1; }
	}
	public class MyIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.MyInt");
		private final Assignment cIntAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIntINTTerminalRuleCall_0 = (RuleCall)cIntAssignment.eContents().get(0);
		
		//MyInt :
		//    int=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//int=INT
		public Assignment getIntAssignment() { return cIntAssignment; }
		
		//INT
		public RuleCall getIntINTTerminalRuleCall_0() { return cIntINTTerminalRuleCall_0; }
	}
	
	
	private final BodyElements pBody;
	private final FooElements pFoo;
	private final ContentElements pContent;
	private final MyElementElements pMyElement;
	private final ParameterObjectElements pParameterObject;
	private final ParameterElements pParameter;
	private final ParameterRefElements pParameterRef;
	private final MyIntElements pMyInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug288432TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBody = new BodyElements();
		this.pFoo = new FooElements();
		this.pContent = new ContentElements();
		this.pMyElement = new MyElementElements();
		this.pParameterObject = new ParameterObjectElements();
		this.pParameter = new ParameterElements();
		this.pParameterRef = new ParameterRefElements();
		this.pMyInt = new MyIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.assignments.Bug288432TestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Body :
	//    ('(' parameter+=(Parameter) (',' parameter+=(Parameter))* ')')?
	//    'body'
	//    content=(Content|ParameterRef)
	//    (foo+=Foo)+
	//    /* SuppressWarnings[SpacesInKeyword] */
	//    'end body';
	public BodyElements getBodyAccess() {
		return pBody;
	}
	
	public ParserRule getBodyRule() {
		return getBodyAccess().getRule();
	}
	
	//Foo:
	//    fooValue = STRING;
	public FooElements getFooAccess() {
		return pFoo;
	}
	
	public ParserRule getFooRule() {
		return getFooAccess().getRule();
	}
	
	//Content :
	//    'content' MyElement
	//    /* SuppressWarnings[SpacesInKeyword] */
	//    'end content' ;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//MyElement :
	//    'element' bar=(MyInt|ParameterRef);
	public MyElementElements getMyElementAccess() {
		return pMyElement;
	}
	
	public ParserRule getMyElementRule() {
		return getMyElementAccess().getRule();
	}
	
	//ParameterObject :
	//    MyInt | Content | ParameterRef    ;
	public ParameterObjectElements getParameterObjectAccess() {
		return pParameterObject;
	}
	
	public ParserRule getParameterObjectRule() {
		return getParameterObjectAccess().getRule();
	}
	
	//Parameter:
	//    name=ID
	//    (value=[ParameterObject])?;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//ParameterRef:
	//    parameter=[Parameter];
	public ParameterRefElements getParameterRefAccess() {
		return pParameterRef;
	}
	
	public ParserRule getParameterRefRule() {
		return getParameterRefAccess().getRule();
	}
	
	//MyInt :
	//    int=INT;
	public MyIntElements getMyIntAccess() {
		return pMyInt;
	}
	
	public ParserRule getMyIntRule() {
		return getMyIntAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
