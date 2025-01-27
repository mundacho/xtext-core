/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class LangATestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.LangATestLanguage.Main");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cTypesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypesTypeParserRuleCall_1_0 = (RuleCall)cTypesAssignment_1.eContents().get(0);
		
		//Main :
		//    imports+=Import*
		//    types+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=Import*
		//types+=Type*
		public Group getGroup() { return cGroup; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }
		
		//types+=Type*
		public Assignment getTypesAssignment_1() { return cTypesAssignment_1; }
		
		//Type
		public RuleCall getTypesTypeParserRuleCall_1_0() { return cTypesTypeParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.LangATestLanguage.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUriAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUriSTRINGTerminalRuleCall_1_0 = (RuleCall)cUriAssignment_1.eContents().get(0);
		
		//Import :
		//    'import' uri=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' uri=STRING
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//uri=STRING
		public Assignment getUriAssignment_1() { return cUriAssignment_1; }
		
		//STRING
		public RuleCall getUriSTRINGTerminalRuleCall_1_0() { return cUriSTRINGTerminalRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.LangATestLanguage.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsTypeCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsTypeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cExtendsTypeCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImplementsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImplementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImplementsTypeCrossReference_3_1_0 = (CrossReference)cImplementsAssignment_3_1.eContents().get(0);
		private final RuleCall cImplementsTypeIDTerminalRuleCall_3_1_0_1 = (RuleCall)cImplementsTypeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cImplementsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cImplementsTypeCrossReference_3_2_1_0 = (CrossReference)cImplementsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cImplementsTypeIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cImplementsTypeCrossReference_3_2_1_0.eContents().get(1);
		
		//Type :
		//    'type' name=ID ('extends' ^extends=[Type])? ('implements' implements+=[Type] (',' implements+=[Type])*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID ('extends' ^extends=[Type])? ('implements' implements+=[Type] (',' implements+=[Type])*)?
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' ^extends=[Type])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//^extends=[Type]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }
		
		//[Type]
		public CrossReference getExtendsTypeCrossReference_2_1_0() { return cExtendsTypeCrossReference_2_1_0; }
		
		//ID
		public RuleCall getExtendsTypeIDTerminalRuleCall_2_1_0_1() { return cExtendsTypeIDTerminalRuleCall_2_1_0_1; }
		
		//('implements' implements+=[Type] (',' implements+=[Type])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'implements'
		public Keyword getImplementsKeyword_3_0() { return cImplementsKeyword_3_0; }
		
		//implements+=[Type]
		public Assignment getImplementsAssignment_3_1() { return cImplementsAssignment_3_1; }
		
		//[Type]
		public CrossReference getImplementsTypeCrossReference_3_1_0() { return cImplementsTypeCrossReference_3_1_0; }
		
		//ID
		public RuleCall getImplementsTypeIDTerminalRuleCall_3_1_0_1() { return cImplementsTypeIDTerminalRuleCall_3_1_0_1; }
		
		//(',' implements+=[Type])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//implements+=[Type]
		public Assignment getImplementsAssignment_3_2_1() { return cImplementsAssignment_3_2_1; }
		
		//[Type]
		public CrossReference getImplementsTypeCrossReference_3_2_1_0() { return cImplementsTypeCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getImplementsTypeIDTerminalRuleCall_3_2_1_0_1() { return cImplementsTypeIDTerminalRuleCall_3_2_1_0_1; }
	}
	
	
	private final MainElements pMain;
	private final ImportElements pImport;
	private final TypeElements pType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LangATestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMain = new MainElements();
		this.pImport = new ImportElements();
		this.pType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.LangATestLanguage".equals(grammar.getName())) {
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

	
	//Main :
	//    imports+=Import*
	//    types+=Type*;
	public MainElements getMainAccess() {
		return pMain;
	}
	
	public ParserRule getMainRule() {
		return getMainAccess().getRule();
	}
	
	//Import :
	//    'import' uri=STRING;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//Type :
	//    'type' name=ID ('extends' ^extends=[Type])? ('implements' implements+=[Type] (',' implements+=[Type])*)?;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
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
