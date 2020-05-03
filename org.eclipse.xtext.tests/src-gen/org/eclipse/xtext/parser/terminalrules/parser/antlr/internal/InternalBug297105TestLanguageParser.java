package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.Bug297105TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBug297105TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EXT_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_EXT_INT=5;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBug297105TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug297105TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug297105TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug297105TestLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private Bug297105TestLanguageGrammarAccess grammarAccess;

        public InternalBug297105TestLanguageParser(TokenStream input, Bug297105TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug297105TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug297105TestLanguage.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug297105TestLanguage.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug297105TestLanguage.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalBug297105TestLanguage.g:77:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


        try {
            // InternalBug297105TestLanguage.g:78:1: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // InternalBug297105TestLanguage.g:79:2: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // InternalBug297105TestLanguage.g:79:2: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBug297105TestLanguage.g:80:3: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // InternalBug297105TestLanguage.g:80:3: (lv_expressions_0_0= ruleExpression )
            	    // InternalBug297105TestLanguage.g:81:4: lv_expressions_0_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"expressions",
            	      					lv_expressions_0_0,
            	      					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Expression");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleExpression"
    // InternalBug297105TestLanguage.g:101:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBug297105TestLanguage.g:101:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBug297105TestLanguage.g:102:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBug297105TestLanguage.g:108:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteral ) ) otherlv_1= '+' ( (lv_right_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


        try {
            // InternalBug297105TestLanguage.g:109:1: ( ( ( (lv_left_0_0= ruleLiteral ) ) otherlv_1= '+' ( (lv_right_2_0= ruleLiteral ) ) ) )
            // InternalBug297105TestLanguage.g:110:2: ( ( (lv_left_0_0= ruleLiteral ) ) otherlv_1= '+' ( (lv_right_2_0= ruleLiteral ) ) )
            {
            // InternalBug297105TestLanguage.g:110:2: ( ( (lv_left_0_0= ruleLiteral ) ) otherlv_1= '+' ( (lv_right_2_0= ruleLiteral ) ) )
            // InternalBug297105TestLanguage.g:111:3: ( (lv_left_0_0= ruleLiteral ) ) otherlv_1= '+' ( (lv_right_2_0= ruleLiteral ) )
            {
            // InternalBug297105TestLanguage.g:111:3: ( (lv_left_0_0= ruleLiteral ) )
            // InternalBug297105TestLanguage.g:112:4: (lv_left_0_0= ruleLiteral )
            {
            // InternalBug297105TestLanguage.g:112:4: (lv_left_0_0= ruleLiteral )
            // InternalBug297105TestLanguage.g:113:5: lv_left_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getLeftLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_left_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getPlusSignKeyword_1());
              		
            }
            // InternalBug297105TestLanguage.g:134:3: ( (lv_right_2_0= ruleLiteral ) )
            // InternalBug297105TestLanguage.g:135:4: (lv_right_2_0= ruleLiteral )
            {
            // InternalBug297105TestLanguage.g:135:4: (lv_right_2_0= ruleLiteral )
            // InternalBug297105TestLanguage.g:136:5: lv_right_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getRightLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_right_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalBug297105TestLanguage.g:157:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalBug297105TestLanguage.g:157:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalBug297105TestLanguage.g:158:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalBug297105TestLanguage.g:164:1: ruleLiteral returns [EObject current=null] : (this_RealLiteral_0= ruleRealLiteral | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_RealLiteral_0 = null;

        EObject this_IntLiteral_1 = null;


        try {
            // InternalBug297105TestLanguage.g:165:1: ( (this_RealLiteral_0= ruleRealLiteral | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalBug297105TestLanguage.g:166:2: (this_RealLiteral_0= ruleRealLiteral | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalBug297105TestLanguage.g:166:2: (this_RealLiteral_0= ruleRealLiteral | this_IntLiteral_1= ruleIntLiteral )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalBug297105TestLanguage()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==13) ) {
                alt2=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBug297105TestLanguage.g:167:3: this_RealLiteral_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealLiteral_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBug297105TestLanguage.g:179:3: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalBug297105TestLanguage.g:194:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalBug297105TestLanguage.g:194:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalBug297105TestLanguage.g:195:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalBug297105TestLanguage.g:201:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleIntValue ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


        try {
            // InternalBug297105TestLanguage.g:202:1: ( ( (lv_value_0_0= ruleIntValue ) ) )
            // InternalBug297105TestLanguage.g:203:2: ( (lv_value_0_0= ruleIntValue ) )
            {
            // InternalBug297105TestLanguage.g:203:2: ( (lv_value_0_0= ruleIntValue ) )
            // InternalBug297105TestLanguage.g:204:3: (lv_value_0_0= ruleIntValue )
            {
            // InternalBug297105TestLanguage.g:204:3: (lv_value_0_0= ruleIntValue )
            // InternalBug297105TestLanguage.g:205:4: lv_value_0_0= ruleIntValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIntLiteralAccess().getValueIntValueParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIntLiteralRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.IntValue");
              				afterParserOrEnumRuleCall();
              			
            }

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalBug297105TestLanguage.g:225:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalBug297105TestLanguage.g:225:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalBug297105TestLanguage.g:226:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalBug297105TestLanguage.g:232:1: ruleRealLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


        try {
            // InternalBug297105TestLanguage.g:233:1: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalBug297105TestLanguage.g:234:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalBug297105TestLanguage.g:234:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalBug297105TestLanguage.g:235:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalBug297105TestLanguage.g:235:3: (lv_value_0_0= ruleRealValue )
            // InternalBug297105TestLanguage.g:236:4: lv_value_0_0= ruleRealValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRealLiteralAccess().getValueRealValueParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.RealValue");
              				afterParserOrEnumRuleCall();
              			
            }

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntValue"
    // InternalBug297105TestLanguage.g:256:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalBug297105TestLanguage.g:256:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalBug297105TestLanguage.g:257:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalBug297105TestLanguage.g:263:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

        try {
            // InternalBug297105TestLanguage.g:264:1: (this_INT_0= RULE_INT )
            // InternalBug297105TestLanguage.g:265:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall());
              	
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalBug297105TestLanguage.g:275:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalBug297105TestLanguage.g:275:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalBug297105TestLanguage.g:276:2: iv_ruleRealValue= ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalBug297105TestLanguage.g:282:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Real_0= ruleReal ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Real_0 = null;


        try {
            // InternalBug297105TestLanguage.g:283:1: (this_Real_0= ruleReal )
            // InternalBug297105TestLanguage.g:284:2: this_Real_0= ruleReal
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRealValueAccess().getRealParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Real_0=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Real_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleReal"
    // InternalBug297105TestLanguage.g:297:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBug297105TestLanguage.g:299:2: (iv_ruleReal= ruleReal EOF )
            // InternalBug297105TestLanguage.g:300:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalBug297105TestLanguage.g:309:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBug297105TestLanguage.g:313:1: ( ( (this_INT_0= RULE_INT )? kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) )
            // InternalBug297105TestLanguage.g:314:2: ( (this_INT_0= RULE_INT )? kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            {
            // InternalBug297105TestLanguage.g:314:2: ( (this_INT_0= RULE_INT )? kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            // InternalBug297105TestLanguage.g:315:3: (this_INT_0= RULE_INT )? kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            {
            // InternalBug297105TestLanguage.g:315:3: (this_INT_0= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBug297105TestLanguage.g:316:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1());
              		
            }
            // InternalBug297105TestLanguage.g:329:3: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EXT_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBug297105TestLanguage.g:330:4: this_EXT_INT_2= RULE_EXT_INT
                    {
                    this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXT_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXT_INT_2, grammarAccess.getRealAccess().getEXT_INTTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBug297105TestLanguage.g:338:4: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleReal"

    // $ANTLR start synpred2_InternalBug297105TestLanguage
    public final void synpred2_InternalBug297105TestLanguage_fragment() throws RecognitionException {   
        EObject this_RealLiteral_0 = null;


        // InternalBug297105TestLanguage.g:167:3: (this_RealLiteral_0= ruleRealLiteral )
        // InternalBug297105TestLanguage.g:167:3: this_RealLiteral_0= ruleRealLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_RealLiteral_0=ruleRealLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalBug297105TestLanguage

    // Delegated rules

    public final boolean synpred2_InternalBug297105TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBug297105TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    }


}