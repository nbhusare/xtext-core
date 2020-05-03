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
import org.eclipse.xtext.linking.services.Bug289059TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug289059TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enabled'"
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


        public InternalBug289059TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug289059TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug289059TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug289059TestLanguage.g"; }



     	private Bug289059TestLanguageGrammarAccess grammarAccess;

        public InternalBug289059TestLanguageParser(TokenStream input, Bug289059TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug289059TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug289059TestLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug289059TestLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug289059TestLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBug289059TestLanguage.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_enabled_1_0= ruleUnassignedAction ) )? ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_enabled_1_0 = null;


        try {
            // InternalBug289059TestLanguage.g:72:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_enabled_1_0= ruleUnassignedAction ) )? ( (otherlv_2= RULE_ID ) )? ) )
            // InternalBug289059TestLanguage.g:73:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_enabled_1_0= ruleUnassignedAction ) )? ( (otherlv_2= RULE_ID ) )? )
            {
            // InternalBug289059TestLanguage.g:73:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_enabled_1_0= ruleUnassignedAction ) )? ( (otherlv_2= RULE_ID ) )? )
            // InternalBug289059TestLanguage.g:74:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_enabled_1_0= ruleUnassignedAction ) )? ( (otherlv_2= RULE_ID ) )?
            {
            // InternalBug289059TestLanguage.g:74:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug289059TestLanguage.g:75:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug289059TestLanguage.g:75:4: (lv_name_0_0= RULE_ID )
            // InternalBug289059TestLanguage.g:76:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBug289059TestLanguage.g:92:3: ( (lv_enabled_1_0= ruleUnassignedAction ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBug289059TestLanguage.g:93:4: (lv_enabled_1_0= ruleUnassignedAction )
                    {
                    // InternalBug289059TestLanguage.g:93:4: (lv_enabled_1_0= ruleUnassignedAction )
                    // InternalBug289059TestLanguage.g:94:5: lv_enabled_1_0= ruleUnassignedAction
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getEnabledUnassignedActionParserRuleCall_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_enabled_1_0=ruleUnassignedAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"enabled",
                    						lv_enabled_1_0,
                    						"org.eclipse.xtext.linking.Bug289059TestLanguage.UnassignedAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBug289059TestLanguage.g:111:3: ( (otherlv_2= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBug289059TestLanguage.g:112:4: (otherlv_2= RULE_ID )
                    {
                    // InternalBug289059TestLanguage.g:112:4: (otherlv_2= RULE_ID )
                    // InternalBug289059TestLanguage.g:113:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getReferenceModelCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUnassignedAction"
    // InternalBug289059TestLanguage.g:128:1: entryRuleUnassignedAction returns [EObject current=null] : iv_ruleUnassignedAction= ruleUnassignedAction EOF ;
    public final EObject entryRuleUnassignedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnassignedAction = null;


        try {
            // InternalBug289059TestLanguage.g:128:57: (iv_ruleUnassignedAction= ruleUnassignedAction EOF )
            // InternalBug289059TestLanguage.g:129:2: iv_ruleUnassignedAction= ruleUnassignedAction EOF
            {
             newCompositeNode(grammarAccess.getUnassignedActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnassignedAction=ruleUnassignedAction();

            state._fsp--;

             current =iv_ruleUnassignedAction; 
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
    // $ANTLR end "entryRuleUnassignedAction"


    // $ANTLR start "ruleUnassignedAction"
    // InternalBug289059TestLanguage.g:135:1: ruleUnassignedAction returns [EObject current=null] : ( () otherlv_1= 'enabled' ) ;
    public final EObject ruleUnassignedAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalBug289059TestLanguage.g:136:1: ( ( () otherlv_1= 'enabled' ) )
            // InternalBug289059TestLanguage.g:137:2: ( () otherlv_1= 'enabled' )
            {
            // InternalBug289059TestLanguage.g:137:2: ( () otherlv_1= 'enabled' )
            // InternalBug289059TestLanguage.g:138:3: () otherlv_1= 'enabled'
            {
            // InternalBug289059TestLanguage.g:138:3: ()
            // InternalBug289059TestLanguage.g:139:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnassignedActionAccess().getUnassignedActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnassignedActionAccess().getEnabledKeyword_1());
            		

            }


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
    // $ANTLR end "ruleUnassignedAction"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    }


}