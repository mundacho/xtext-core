package org.eclipse.xtext.linking.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.linking.services.Bug313089TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalBug313089TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'baz'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBug313089TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug313089TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug313089TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug313089TestLanguage.g"; }



     	private Bug313089TestLanguageGrammarAccess grammarAccess;

        public InternalBug313089TestLanguageParser(TokenStream input, Bug313089TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Foo";
       	}

       	@Override
       	protected Bug313089TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFoo"
    // InternalBug313089TestLanguage.g:69:1: entryRuleFoo returns [EObject current=null] : iv_ruleFoo= ruleFoo EOF ;
    public final EObject entryRuleFoo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoo = null;


        try {
            // InternalBug313089TestLanguage.g:69:44: (iv_ruleFoo= ruleFoo EOF )
            // InternalBug313089TestLanguage.g:70:2: iv_ruleFoo= ruleFoo EOF
            {
             newCompositeNode(grammarAccess.getFooRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFoo=ruleFoo();

            state._fsp--;

             current =iv_ruleFoo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoo"


    // $ANTLR start "ruleFoo"
    // InternalBug313089TestLanguage.g:76:1: ruleFoo returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFoo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        EObject lv_bar_1_0 = null;

        EObject lv_baz_2_0 = null;



        	enterRule();

        try {
            // InternalBug313089TestLanguage.g:82:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBug313089TestLanguage.g:83:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBug313089TestLanguage.g:83:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalBug313089TestLanguage.g:84:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalBug313089TestLanguage.g:84:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug313089TestLanguage.g:85:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug313089TestLanguage.g:85:4: (lv_name_0_0= RULE_ID )
            // InternalBug313089TestLanguage.g:86:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFooAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFooRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBug313089TestLanguage.g:102:3: ( ( (lv_bar_1_0= ruleBar ) ) | ( (lv_baz_2_0= ruleBaz ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBug313089TestLanguage.g:103:4: ( (lv_bar_1_0= ruleBar ) )
                    {
                    // InternalBug313089TestLanguage.g:103:4: ( (lv_bar_1_0= ruleBar ) )
                    // InternalBug313089TestLanguage.g:104:5: (lv_bar_1_0= ruleBar )
                    {
                    // InternalBug313089TestLanguage.g:104:5: (lv_bar_1_0= ruleBar )
                    // InternalBug313089TestLanguage.g:105:6: lv_bar_1_0= ruleBar
                    {

                    						newCompositeNode(grammarAccess.getFooAccess().getBarBarParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_bar_1_0=ruleBar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFooRule());
                    						}
                    						set(
                    							current,
                    							"bar",
                    							lv_bar_1_0,
                    							"org.eclipse.xtext.linking.Bug313089TestLanguage.Bar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug313089TestLanguage.g:123:4: ( (lv_baz_2_0= ruleBaz ) )
                    {
                    // InternalBug313089TestLanguage.g:123:4: ( (lv_baz_2_0= ruleBaz ) )
                    // InternalBug313089TestLanguage.g:124:5: (lv_baz_2_0= ruleBaz )
                    {
                    // InternalBug313089TestLanguage.g:124:5: (lv_baz_2_0= ruleBaz )
                    // InternalBug313089TestLanguage.g:125:6: lv_baz_2_0= ruleBaz
                    {

                    						newCompositeNode(grammarAccess.getFooAccess().getBazBazParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_baz_2_0=ruleBaz();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFooRule());
                    						}
                    						set(
                    							current,
                    							"baz",
                    							lv_baz_2_0,
                    							"org.eclipse.xtext.linking.Bug313089TestLanguage.Baz");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBug313089TestLanguage.g:143:3: ( (otherlv_3= RULE_ID ) )
            // InternalBug313089TestLanguage.g:144:4: (otherlv_3= RULE_ID )
            {
            // InternalBug313089TestLanguage.g:144:4: (otherlv_3= RULE_ID )
            // InternalBug313089TestLanguage.g:145:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFooRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFooAccess().getRefFooCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoo"


    // $ANTLR start "entryRuleBar"
    // InternalBug313089TestLanguage.g:160:1: entryRuleBar returns [EObject current=null] : iv_ruleBar= ruleBar EOF ;
    public final EObject entryRuleBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBar = null;


        try {
            // InternalBug313089TestLanguage.g:160:44: (iv_ruleBar= ruleBar EOF )
            // InternalBug313089TestLanguage.g:161:2: iv_ruleBar= ruleBar EOF
            {
             newCompositeNode(grammarAccess.getBarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBar=ruleBar();

            state._fsp--;

             current =iv_ruleBar; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBar"


    // $ANTLR start "ruleBar"
    // InternalBug313089TestLanguage.g:167:1: ruleBar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBug313089TestLanguage.g:173:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBug313089TestLanguage.g:174:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBug313089TestLanguage.g:174:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBug313089TestLanguage.g:175:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBug313089TestLanguage.g:175:3: ()
            // InternalBug313089TestLanguage.g:176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarAccess().getBarAction_0(),
            					current);
            			

            }

            // InternalBug313089TestLanguage.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBug313089TestLanguage.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBug313089TestLanguage.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalBug313089TestLanguage.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBar"


    // $ANTLR start "entryRuleBaz"
    // InternalBug313089TestLanguage.g:204:1: entryRuleBaz returns [EObject current=null] : iv_ruleBaz= ruleBaz EOF ;
    public final EObject entryRuleBaz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaz = null;


        try {
            // InternalBug313089TestLanguage.g:204:44: (iv_ruleBaz= ruleBaz EOF )
            // InternalBug313089TestLanguage.g:205:2: iv_ruleBaz= ruleBaz EOF
            {
             newCompositeNode(grammarAccess.getBazRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBaz=ruleBaz();

            state._fsp--;

             current =iv_ruleBaz; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaz"


    // $ANTLR start "ruleBaz"
    // InternalBug313089TestLanguage.g:211:1: ruleBaz returns [EObject current=null] : (otherlv_0= 'baz' ( (lv_name_1_0= RULE_ID ) ) ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleBaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalBug313089TestLanguage.g:217:2: ( (otherlv_0= 'baz' ( (lv_name_1_0= RULE_ID ) ) ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )* ) )
            // InternalBug313089TestLanguage.g:218:2: (otherlv_0= 'baz' ( (lv_name_1_0= RULE_ID ) ) ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )* )
            {
            // InternalBug313089TestLanguage.g:218:2: (otherlv_0= 'baz' ( (lv_name_1_0= RULE_ID ) ) ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )* )
            // InternalBug313089TestLanguage.g:219:3: otherlv_0= 'baz' ( (lv_name_1_0= RULE_ID ) ) ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBazAccess().getBazKeyword_0());
            		
            // InternalBug313089TestLanguage.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBug313089TestLanguage.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBug313089TestLanguage.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalBug313089TestLanguage.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBazAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBazRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBug313089TestLanguage.g:241:3: ( () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBug313089TestLanguage.g:242:4: () otherlv_3= 'baz' ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    // InternalBug313089TestLanguage.g:242:4: ()
            	    // InternalBug313089TestLanguage.g:243:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBazAccess().getBazChildAction_2_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBazAccess().getBazKeyword_2_1());
            	    			
            	    // InternalBug313089TestLanguage.g:253:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalBug313089TestLanguage.g:254:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalBug313089TestLanguage.g:254:5: (lv_name_4_0= RULE_ID )
            	    // InternalBug313089TestLanguage.g:255:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            	    						newLeafNode(lv_name_4_0, grammarAccess.getBazAccess().getNameIDTerminalRuleCall_2_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBazRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaz"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    }


}