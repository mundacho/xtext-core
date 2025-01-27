/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.unorderedGroups.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BacktrackingBug325745TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFieldsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFieldsElementParserRuleCall_1_0 = (RuleCall)cFieldsAssignment_1.eContents().get(0);
		
		//Model:
		//    {Model}
		//    (fields+=Element)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model}
		//(fields+=Element)+
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//(fields+=Element)+
		public Assignment getFieldsAssignment_1() { return cFieldsAssignment_1; }
		
		//Element
		public RuleCall getFieldsElementParserRuleCall_1_0() { return cFieldsElementParserRuleCall_1_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cDataTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDataTypeDataTypeParserRuleCall_1_0 = (RuleCall)cDataTypeAssignment_1.eContents().get(0);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Element :
		//    name=ID
		//    (dataType=DataType)?
		//    (expression=Expression)
		//    '.'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		//(dataType=DataType)?
		//(expression=Expression)
		//'.'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(dataType=DataType)?
		public Assignment getDataTypeAssignment_1() { return cDataTypeAssignment_1; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_1_0() { return cDataTypeDataTypeParserRuleCall_1_0; }
		
		//(expression=Expression)
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBaseTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBaseTypeIDTerminalRuleCall_0_0 = (RuleCall)cBaseTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDefaultValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDefaultValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cDefaultValueAssignment_1_1.eContents().get(0);
		
		//DataType :
		//    (baseType=ID (':=' defaultValue=STRING)?)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(baseType=ID (':=' defaultValue=STRING)?)
		public Group getGroup() { return cGroup; }
		
		//baseType=ID
		public Assignment getBaseTypeAssignment_0() { return cBaseTypeAssignment_0; }
		
		//ID
		public RuleCall getBaseTypeIDTerminalRuleCall_0_0() { return cBaseTypeIDTerminalRuleCall_0_0; }
		
		//(':=' defaultValue=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_0() { return cColonEqualsSignKeyword_1_0; }
		
		//defaultValue=STRING
		public Assignment getDefaultValueAssignment_1_1() { return cDefaultValueAssignment_1_1; }
		
		//STRING
		public RuleCall getDefaultValueSTRINGTerminalRuleCall_1_1_0() { return cDefaultValueSTRINGTerminalRuleCall_1_1_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cUnorderedGroup_1.eContents().get(0);
		private final Assignment cPrefixAssignment_1_1 = (Assignment)cUnorderedGroup_1.eContents().get(1);
		private final RuleCall cPrefixSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cPrefixAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTermsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTermsSimpleTermParserRuleCall_2_1_0 = (RuleCall)cTermsAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Keyword cRightSquareBracketKeyword_3_0 = (Keyword)cUnorderedGroup_3.eContents().get(0);
		private final Assignment cPostfixAssignment_3_1 = (Assignment)cUnorderedGroup_3.eContents().get(1);
		private final RuleCall cPostfixSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cPostfixAssignment_3_1.eContents().get(0);
		
		//Expression:
		//  {Expression}
		//  ('['? & prefix=STRING?)
		//  ('['? terms+=SimpleTerm ']'?)*
		//  (']'? & postfix=STRING?)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression}
		//('['? & prefix=STRING?)
		//('['? terms+=SimpleTerm ']'?)*
		//(']'? & postfix=STRING?)
		public Group getGroup() { return cGroup; }
		
		//{Expression}
		public Action getExpressionAction_0() { return cExpressionAction_0; }
		
		//('['? & prefix=STRING?)
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }
		
		//'['?
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//prefix=STRING?
		public Assignment getPrefixAssignment_1_1() { return cPrefixAssignment_1_1; }
		
		//STRING
		public RuleCall getPrefixSTRINGTerminalRuleCall_1_1_0() { return cPrefixSTRINGTerminalRuleCall_1_1_0; }
		
		//('['? terms+=SimpleTerm ']'?)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'['?
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//terms+=SimpleTerm
		public Assignment getTermsAssignment_2_1() { return cTermsAssignment_2_1; }
		
		//SimpleTerm
		public RuleCall getTermsSimpleTermParserRuleCall_2_1_0() { return cTermsSimpleTermParserRuleCall_2_1_0; }
		
		//']'?
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//(']'? & postfix=STRING?)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//']'?
		public Keyword getRightSquareBracketKeyword_3_0() { return cRightSquareBracketKeyword_3_0; }
		
		//postfix=STRING?
		public Assignment getPostfixAssignment_3_1() { return cPostfixAssignment_3_1; }
		
		//STRING
		public RuleCall getPostfixSTRINGTerminalRuleCall_3_1_0() { return cPostfixSTRINGTerminalRuleCall_3_1_0; }
	}
	public class SimpleTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage.SimpleTerm");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cLineCountAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cLineCountINTTerminalRuleCall_0_0_0 = (RuleCall)cLineCountAssignment_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cCharCountAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cCharCountINTTerminalRuleCall_0_2_0 = (RuleCall)cCharCountAssignment_0_2.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cCharSetAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cCharSetIDTerminalRuleCall_0_4_0 = (RuleCall)cCharSetAssignment_0_4.eContents().get(0);
		private final Assignment cRefCharAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cRefCharIDTerminalRuleCall_1_0 = (RuleCall)cRefCharAssignment_1.eContents().get(0);
		
		//SimpleTerm:
		//  (lineCount=INT
		//  '*'?
		//  (charCount=INT)?
		//  '!'?
		//  (charSet=ID)?) | refChar=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(lineCount=INT
		//'*'?
		//(charCount=INT)?
		//'!'?
		//(charSet=ID)?) | refChar=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(lineCount=INT
		//'*'?
		//(charCount=INT)?
		//'!'?
		//(charSet=ID)?)
		public Group getGroup_0() { return cGroup_0; }
		
		//lineCount=INT
		public Assignment getLineCountAssignment_0_0() { return cLineCountAssignment_0_0; }
		
		//INT
		public RuleCall getLineCountINTTerminalRuleCall_0_0_0() { return cLineCountINTTerminalRuleCall_0_0_0; }
		
		//'*'?
		public Keyword getAsteriskKeyword_0_1() { return cAsteriskKeyword_0_1; }
		
		//(charCount=INT)?
		public Assignment getCharCountAssignment_0_2() { return cCharCountAssignment_0_2; }
		
		//INT
		public RuleCall getCharCountINTTerminalRuleCall_0_2_0() { return cCharCountINTTerminalRuleCall_0_2_0; }
		
		//'!'?
		public Keyword getExclamationMarkKeyword_0_3() { return cExclamationMarkKeyword_0_3; }
		
		//(charSet=ID)?
		public Assignment getCharSetAssignment_0_4() { return cCharSetAssignment_0_4; }
		
		//ID
		public RuleCall getCharSetIDTerminalRuleCall_0_4_0() { return cCharSetIDTerminalRuleCall_0_4_0; }
		
		//refChar=ID
		public Assignment getRefCharAssignment_1() { return cRefCharAssignment_1; }
		
		//ID
		public RuleCall getRefCharIDTerminalRuleCall_1_0() { return cRefCharIDTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final DataTypeElements pDataType;
	private final ExpressionElements pExpression;
	private final SimpleTermElements pSimpleTerm;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BacktrackingBug325745TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pDataType = new DataTypeElements();
		this.pExpression = new ExpressionElements();
		this.pSimpleTerm = new SimpleTermElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.unorderedGroups.BacktrackingBug325745TestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    {Model}
	//    (fields+=Element)+
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element :
	//    name=ID
	//    (dataType=DataType)?
	//    (expression=Expression)
	//    '.'
	//;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//DataType :
	//    (baseType=ID (':=' defaultValue=STRING)?)
	//;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Expression:
	//  {Expression}
	//  ('['? & prefix=STRING?)
	//  ('['? terms+=SimpleTerm ']'?)*
	//  (']'? & postfix=STRING?)
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//SimpleTerm:
	//  (lineCount=INT
	//  '*'?
	//  (charCount=INT)?
	//  '!'?
	//  (charSet=ID)?) | refChar=ID
	//;
	public SimpleTermElements getSimpleTermAccess() {
		return pSimpleTerm;
	}
	
	public ParserRule getSimpleTermRule() {
		return getSimpleTermAccess().getRule();
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
