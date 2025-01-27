/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.grammarinheritance.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
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
public class AbstractTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class InheritedParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.InheritedParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//InheritedParserRule returns mm::AType:
		//    'element' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'element' name=ID
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class AbstractCallOverridenParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.AbstractCallOverridenParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOverridemodelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsOverridableParserRuleParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//AbstractCallOverridenParserRule returns mm::AModel:
		//    'overridemodel' (elements+=OverridableParserRule)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'overridemodel' (elements+=OverridableParserRule)*
		public Group getGroup() { return cGroup; }
		
		//'overridemodel'
		public Keyword getOverridemodelKeyword_0() { return cOverridemodelKeyword_0; }
		
		//(elements+=OverridableParserRule)*
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//OverridableParserRule
		public RuleCall getElementsOverridableParserRuleParserRuleCall_1_0() { return cElementsOverridableParserRuleParserRuleCall_1_0; }
	}
	public class OverridableParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.OverridableParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//OverridableParserRule returns mm::AType :
		//    'element' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'element' name=ID
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class OverridableParserRule2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.OverridableParserRule2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOtherElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		///* SuppressWarnings[SpacesInKeyword] */
		//OverridableParserRule2 returns mm::AType :
		//    'other element' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'other element' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'other element'
		public Keyword getOtherElementKeyword_0() { return cOtherElementKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class AbstractCallExtendedParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.AbstractCallExtendedParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendedmodelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsExtendableParserRuleParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//AbstractCallExtendedParserRule returns mm::AModel:
		//    'extendedmodel' (elements+=ExtendableParserRule)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'extendedmodel' (elements+=ExtendableParserRule)*
		public Group getGroup() { return cGroup; }
		
		//'extendedmodel'
		public Keyword getExtendedmodelKeyword_0() { return cExtendedmodelKeyword_0; }
		
		//(elements+=ExtendableParserRule)*
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//ExtendableParserRule
		public RuleCall getElementsExtendableParserRuleParserRuleCall_1_0() { return cElementsExtendableParserRuleParserRuleCall_1_0; }
	}
	public class ExtendableParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.ExtendableParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ExtendableParserRule returns mm::AType :
		//    'element' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'element' name=ID
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final InheritedParserRuleElements pInheritedParserRule;
	private final AbstractCallOverridenParserRuleElements pAbstractCallOverridenParserRule;
	private final OverridableParserRuleElements pOverridableParserRule;
	private final OverridableParserRule2Elements pOverridableParserRule2;
	private final AbstractCallExtendedParserRuleElements pAbstractCallExtendedParserRule;
	private final ExtendableParserRuleElements pExtendableParserRule;
	private final TerminalRule tREAL;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AbstractTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pInheritedParserRule = new InheritedParserRuleElements();
		this.pAbstractCallOverridenParserRule = new AbstractCallOverridenParserRuleElements();
		this.pOverridableParserRule = new OverridableParserRuleElements();
		this.pOverridableParserRule2 = new OverridableParserRule2Elements();
		this.pAbstractCallExtendedParserRule = new AbstractCallExtendedParserRuleElements();
		this.pExtendableParserRule = new ExtendableParserRuleElements();
		this.tREAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.REAL");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.grammarinheritance.AbstractTestLanguage".equals(grammar.getName())) {
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

	
	//InheritedParserRule returns mm::AType:
	//    'element' name=ID;
	public InheritedParserRuleElements getInheritedParserRuleAccess() {
		return pInheritedParserRule;
	}
	
	public ParserRule getInheritedParserRuleRule() {
		return getInheritedParserRuleAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//AbstractCallOverridenParserRule returns mm::AModel:
	//    'overridemodel' (elements+=OverridableParserRule)*;
	public AbstractCallOverridenParserRuleElements getAbstractCallOverridenParserRuleAccess() {
		return pAbstractCallOverridenParserRule;
	}
	
	public ParserRule getAbstractCallOverridenParserRuleRule() {
		return getAbstractCallOverridenParserRuleAccess().getRule();
	}
	
	//OverridableParserRule returns mm::AType :
	//    'element' name=ID;
	public OverridableParserRuleElements getOverridableParserRuleAccess() {
		return pOverridableParserRule;
	}
	
	public ParserRule getOverridableParserRuleRule() {
		return getOverridableParserRuleAccess().getRule();
	}
	
	///* SuppressWarnings[SpacesInKeyword] */
	//OverridableParserRule2 returns mm::AType :
	//    'other element' name=STRING;
	public OverridableParserRule2Elements getOverridableParserRule2Access() {
		return pOverridableParserRule2;
	}
	
	public ParserRule getOverridableParserRule2Rule() {
		return getOverridableParserRule2Access().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//AbstractCallExtendedParserRule returns mm::AModel:
	//    'extendedmodel' (elements+=ExtendableParserRule)*;
	public AbstractCallExtendedParserRuleElements getAbstractCallExtendedParserRuleAccess() {
		return pAbstractCallExtendedParserRule;
	}
	
	public ParserRule getAbstractCallExtendedParserRuleRule() {
		return getAbstractCallExtendedParserRuleAccess().getRule();
	}
	
	//ExtendableParserRule returns mm::AType :
	//    'element' name=ID;
	public ExtendableParserRuleElements getExtendableParserRuleAccess() {
		return pExtendableParserRule;
	}
	
	public ParserRule getExtendableParserRuleRule() {
		return getExtendableParserRuleAccess().getRule();
	}
	
	//terminal REAL returns ecore::EDouble : INT '.' INT;
	public TerminalRule getREALRule() {
		return tREAL;
	}
	
	//@Override
	//terminal ID        : ('^')?('a'..'z'|'A'..'Z'|'�'|'�'|'�'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
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
