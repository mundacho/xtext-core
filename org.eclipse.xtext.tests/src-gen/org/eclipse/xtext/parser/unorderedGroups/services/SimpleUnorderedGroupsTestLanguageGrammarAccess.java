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
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleUnorderedGroupsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DelegateModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.SimpleUnorderedGroupsTestLanguage.DelegateModel");
		private final RuleCall cModelParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DelegateModel returns Model:
		//    Model
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Model
		public RuleCall getModelParserRuleCall() { return cModelParserRuleCall; }
	}
	
	
	private final DelegateModelElements pDelegateModel;
	
	private final Grammar grammar;
	
	private final UnorderedGroupsTestLanguageGrammarAccess gaUnorderedGroupsTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleUnorderedGroupsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			UnorderedGroupsTestLanguageGrammarAccess gaUnorderedGroupsTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaUnorderedGroupsTestLanguage = gaUnorderedGroupsTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pDelegateModel = new DelegateModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.unorderedGroups.SimpleUnorderedGroupsTestLanguage".equals(grammar.getName())) {
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
	
	
	public UnorderedGroupsTestLanguageGrammarAccess getUnorderedGroupsTestLanguageGrammarAccess() {
		return gaUnorderedGroupsTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DelegateModel returns Model:
	//    Model
	//;
	public DelegateModelElements getDelegateModelAccess() {
		return pDelegateModel;
	}
	
	public ParserRule getDelegateModelRule() {
		return getDelegateModelAccess().getRule();
	}
	
	//Model: {Model} (
	//    '1' (first?='a'  & second?='b'  )
	//  | '2' (first?='a'  & second?='b' & third?='c' & forth?='d')
	//  | '3' (first?='a'? & second?='b'? )
	//  | '4' (first?='a'  & second?='b'? )
	//  | '5' (first?='a'? & second?='b'  )
	//  | '6' (firstAsList+='a'+ & secondAsList+='b'* )
	//  | '7' (firstAsList+='a'* & secondAsList+='b'+ )
	//  | '8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
	//  | '9' (firstAsList+='a' & secondAsList+='b' )+
	//  | '10' (firstAsList+='a' & secondAsList+='b' )*
	//  | '11' (first?='a' & second?='b' )?
	//  | '12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
	//  | '13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
	//  | '14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
	//  | 'datatypes' value=UnorderedDatatype
	//  | 'serialization' serialized=UnorderedSerialization
	//  | 'bug302585' nestedModel+=NestedModel*
	//  )
	//;
	public UnorderedGroupsTestLanguageGrammarAccess.ModelElements getModelAccess() {
		return gaUnorderedGroupsTestLanguage.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NestedModel:
	//  {NestedModel}
	//  (first?="a" & second?="b")?
	//  'nested';
	public UnorderedGroupsTestLanguageGrammarAccess.NestedModelElements getNestedModelAccess() {
		return gaUnorderedGroupsTestLanguage.getNestedModelAccess();
	}
	
	public ParserRule getNestedModelRule() {
		return getNestedModelAccess().getRule();
	}
	
	//UnorderedDatatype:
	//    '1' ('a'  & 'b'  )
	//  | '2' ('a'  & 'b' & 'c' & 'd')
	//  | '3' ('a'? & 'b'? )
	//  | '4' ('a'  & 'b'? )
	//  | '5' ('a'? & 'b'  )
	//  | '6' ('a'+ & 'b'* )
	//  | '7' ('a'* & 'b'+ )
	//  | '8' ('a' 'b' 'c' & 'a' 'b' 'd' )
	//  | '9' ('a' & 'b' )+
	//  | '10' ('a' & 'b' )*
	//  | '11' ('a' & 'b' )?
	//  | '12' ('a' & 'b' ) ('a' & 'b' )
	//  | '13' ('a' & 'b' )? 'a' 'b'
	//  | '14' (('a' & 'b') & ('c' & 'd'))+
	//;
	public UnorderedGroupsTestLanguageGrammarAccess.UnorderedDatatypeElements getUnorderedDatatypeAccess() {
		return gaUnorderedGroupsTestLanguage.getUnorderedDatatypeAccess();
	}
	
	public ParserRule getUnorderedDatatypeRule() {
		return getUnorderedDatatypeAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride] */
	//UnorderedSerialization: {UnorderedSerialization} (
	//    '1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
	//  | '2' (firstAsList+='a' & secondAsList+='b')*
	//  | '3' (firstAsList+='a'+ & second?='b')*
	//  )
	//;
	public UnorderedGroupsTestLanguageGrammarAccess.UnorderedSerializationElements getUnorderedSerializationAccess() {
		return gaUnorderedGroupsTestLanguage.getUnorderedSerializationAccess();
	}
	
	public ParserRule getUnorderedSerializationRule() {
		return getUnorderedSerializationAccess().getRule();
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
