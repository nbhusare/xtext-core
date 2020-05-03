package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.reconstr.services.ComplexReconstrTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComplexReconstrTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'('", "')'", "'!'", "'TG'", "'['", "','", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalComplexReconstrTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComplexReconstrTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComplexReconstrTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComplexReconstrTestLanguage.g"; }



     	private ComplexReconstrTestLanguageGrammarAccess grammarAccess;

        public InternalComplexReconstrTestLanguageParser(TokenStream input, ComplexReconstrTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected ComplexReconstrTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalComplexReconstrTestLanguage.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalComplexReconstrTestLanguage.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalComplexReconstrTestLanguage.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalComplexReconstrTestLanguage.g:71:1: ruleRoot returns [EObject current=null] : (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Op_0 = null;

        EObject this_TrickyG_1 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:72:1: ( (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG ) )
            // InternalComplexReconstrTestLanguage.g:73:2: (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG )
            {
            // InternalComplexReconstrTestLanguage.g:73:2: (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComplexReconstrTestLanguage.g:74:3: this_Op_0= ruleOp
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getOpParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Op_0=ruleOp();

                    state._fsp--;


                    			current = this_Op_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComplexReconstrTestLanguage.g:83:3: this_TrickyG_1= ruleTrickyG
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getTrickyGParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TrickyG_1=ruleTrickyG();

                    state._fsp--;


                    			current = this_TrickyG_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleOp"
    // InternalComplexReconstrTestLanguage.g:95:1: entryRuleOp returns [EObject current=null] : iv_ruleOp= ruleOp EOF ;
    public final EObject entryRuleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOp = null;


        try {
            // InternalComplexReconstrTestLanguage.g:95:43: (iv_ruleOp= ruleOp EOF )
            // InternalComplexReconstrTestLanguage.g:96:2: iv_ruleOp= ruleOp EOF
            {
             newCompositeNode(grammarAccess.getOpRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOp=ruleOp();

            state._fsp--;

             current =iv_ruleOp; 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalComplexReconstrTestLanguage.g:102:1: ruleOp returns [EObject current=null] : (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )* ) ;
    public final EObject ruleOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term_0 = null;

        EObject lv_addOperands_3_0 = null;

        EObject lv_minusOperands_6_0 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:103:1: ( (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )* ) )
            // InternalComplexReconstrTestLanguage.g:104:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )* )
            {
            // InternalComplexReconstrTestLanguage.g:104:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )* )
            // InternalComplexReconstrTestLanguage.g:105:3: this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getOpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalComplexReconstrTestLanguage.g:113:3: ( ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }
                else if ( (LA2_0==12) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComplexReconstrTestLanguage.g:114:4: ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:114:4: ( () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) ) )
            	    // InternalComplexReconstrTestLanguage.g:115:5: () otherlv_2= '+' ( (lv_addOperands_3_0= ruleTerm ) )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:115:5: ()
            	    // InternalComplexReconstrTestLanguage.g:116:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getOpAccess().getAddAddOperandsAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getOpAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalComplexReconstrTestLanguage.g:126:5: ( (lv_addOperands_3_0= ruleTerm ) )
            	    // InternalComplexReconstrTestLanguage.g:127:6: (lv_addOperands_3_0= ruleTerm )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:127:6: (lv_addOperands_3_0= ruleTerm )
            	    // InternalComplexReconstrTestLanguage.g:128:7: lv_addOperands_3_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getOpAccess().getAddOperandsTermParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_addOperands_3_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOpRule());
            	    							}
            	    							add(
            	    								current,
            	    								"addOperands",
            	    								lv_addOperands_3_0,
            	    								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComplexReconstrTestLanguage.g:147:4: ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:147:4: ( () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) ) )
            	    // InternalComplexReconstrTestLanguage.g:148:5: () otherlv_5= '-' ( (lv_minusOperands_6_0= ruleTerm ) )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:148:5: ()
            	    // InternalComplexReconstrTestLanguage.g:149:6: 
            	    {

            	    						current = forceCreateModelElementAndAdd(
            	    							grammarAccess.getOpAccess().getMinusMinusOperandsAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getOpAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalComplexReconstrTestLanguage.g:159:5: ( (lv_minusOperands_6_0= ruleTerm ) )
            	    // InternalComplexReconstrTestLanguage.g:160:6: (lv_minusOperands_6_0= ruleTerm )
            	    {
            	    // InternalComplexReconstrTestLanguage.g:160:6: (lv_minusOperands_6_0= ruleTerm )
            	    // InternalComplexReconstrTestLanguage.g:161:7: lv_minusOperands_6_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getOpAccess().getMinusOperandsTermParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_minusOperands_6_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOpRule());
            	    							}
            	    							add(
            	    								current,
            	    								"minusOperands",
            	    								lv_minusOperands_6_0,
            	    								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


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

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleTerm"
    // InternalComplexReconstrTestLanguage.g:184:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalComplexReconstrTestLanguage.g:184:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalComplexReconstrTestLanguage.g:185:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalComplexReconstrTestLanguage.g:191:1: ruleTerm returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Parens_1 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:192:1: ( (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) )
            // InternalComplexReconstrTestLanguage.g:193:2: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            {
            // InternalComplexReconstrTestLanguage.g:193:2: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComplexReconstrTestLanguage.g:194:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComplexReconstrTestLanguage.g:203:3: this_Parens_1= ruleParens
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getParensParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Parens_1=ruleParens();

                    state._fsp--;


                    			current = this_Parens_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalComplexReconstrTestLanguage.g:215:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalComplexReconstrTestLanguage.g:215:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalComplexReconstrTestLanguage.g:216:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalComplexReconstrTestLanguage.g:222:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

        try {
            // InternalComplexReconstrTestLanguage.g:223:1: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalComplexReconstrTestLanguage.g:224:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalComplexReconstrTestLanguage.g:224:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalComplexReconstrTestLanguage.g:225:3: (lv_name_0_0= RULE_ID )
            {
            // InternalComplexReconstrTestLanguage.g:225:3: (lv_name_0_0= RULE_ID )
            // InternalComplexReconstrTestLanguage.g:226:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParens"
    // InternalComplexReconstrTestLanguage.g:245:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // InternalComplexReconstrTestLanguage.g:245:47: (iv_ruleParens= ruleParens EOF )
            // InternalComplexReconstrTestLanguage.g:246:2: iv_ruleParens= ruleParens EOF
            {
             newCompositeNode(grammarAccess.getParensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParens=ruleParens();

            state._fsp--;

             current =iv_ruleParens; 
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
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // InternalComplexReconstrTestLanguage.g:252:1: ruleParens returns [EObject current=null] : (otherlv_0= '(' this_Op_1= ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_em_3_0=null;
        EObject this_Op_1 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:253:1: ( (otherlv_0= '(' this_Op_1= ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? ) )
            // InternalComplexReconstrTestLanguage.g:254:2: (otherlv_0= '(' this_Op_1= ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? )
            {
            // InternalComplexReconstrTestLanguage.g:254:2: (otherlv_0= '(' this_Op_1= ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )? )
            // InternalComplexReconstrTestLanguage.g:255:3: otherlv_0= '(' this_Op_1= ruleOp otherlv_2= ')' ( (lv_em_3_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParensAccess().getOpParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_5);
            this_Op_1=ruleOp();

            state._fsp--;


            			current = this_Op_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParensAccess().getRightParenthesisKeyword_2());
            		
            // InternalComplexReconstrTestLanguage.g:271:3: ( (lv_em_3_0= '!' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComplexReconstrTestLanguage.g:272:4: (lv_em_3_0= '!' )
                    {
                    // InternalComplexReconstrTestLanguage.g:272:4: (lv_em_3_0= '!' )
                    // InternalComplexReconstrTestLanguage.g:273:5: lv_em_3_0= '!'
                    {
                    lv_em_3_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_em_3_0, grammarAccess.getParensAccess().getEmExclamationMarkKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParensRule());
                    					}
                    					setWithLastConsumed(current, "em", lv_em_3_0, "!");
                    				

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
    // $ANTLR end "ruleParens"


    // $ANTLR start "entryRuleTrickyG"
    // InternalComplexReconstrTestLanguage.g:289:1: entryRuleTrickyG returns [EObject current=null] : iv_ruleTrickyG= ruleTrickyG EOF ;
    public final EObject entryRuleTrickyG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG = null;


        try {
            // InternalComplexReconstrTestLanguage.g:289:48: (iv_ruleTrickyG= ruleTrickyG EOF )
            // InternalComplexReconstrTestLanguage.g:290:2: iv_ruleTrickyG= ruleTrickyG EOF
            {
             newCompositeNode(grammarAccess.getTrickyGRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrickyG=ruleTrickyG();

            state._fsp--;

             current =iv_ruleTrickyG; 
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
    // $ANTLR end "entryRuleTrickyG"


    // $ANTLR start "ruleTrickyG"
    // InternalComplexReconstrTestLanguage.g:296:1: ruleTrickyG returns [EObject current=null] : (otherlv_0= 'TG' ( (lv_tree_1_0= ruleTrickyG1 ) ) ) ;
    public final EObject ruleTrickyG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tree_1_0 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:297:1: ( (otherlv_0= 'TG' ( (lv_tree_1_0= ruleTrickyG1 ) ) ) )
            // InternalComplexReconstrTestLanguage.g:298:2: (otherlv_0= 'TG' ( (lv_tree_1_0= ruleTrickyG1 ) ) )
            {
            // InternalComplexReconstrTestLanguage.g:298:2: (otherlv_0= 'TG' ( (lv_tree_1_0= ruleTrickyG1 ) ) )
            // InternalComplexReconstrTestLanguage.g:299:3: otherlv_0= 'TG' ( (lv_tree_1_0= ruleTrickyG1 ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTrickyGAccess().getTGKeyword_0());
            		
            // InternalComplexReconstrTestLanguage.g:303:3: ( (lv_tree_1_0= ruleTrickyG1 ) )
            // InternalComplexReconstrTestLanguage.g:304:4: (lv_tree_1_0= ruleTrickyG1 )
            {
            // InternalComplexReconstrTestLanguage.g:304:4: (lv_tree_1_0= ruleTrickyG1 )
            // InternalComplexReconstrTestLanguage.g:305:5: lv_tree_1_0= ruleTrickyG1
            {

            					newCompositeNode(grammarAccess.getTrickyGAccess().getTreeTrickyG1ParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_tree_1_0=ruleTrickyG1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrickyGRule());
            					}
            					set(
            						current,
            						"tree",
            						lv_tree_1_0,
            						"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG1");
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
    // $ANTLR end "ruleTrickyG"


    // $ANTLR start "entryRuleTrickyG1"
    // InternalComplexReconstrTestLanguage.g:326:1: entryRuleTrickyG1 returns [EObject current=null] : iv_ruleTrickyG1= ruleTrickyG1 EOF ;
    public final EObject entryRuleTrickyG1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG1 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:326:49: (iv_ruleTrickyG1= ruleTrickyG1 EOF )
            // InternalComplexReconstrTestLanguage.g:327:2: iv_ruleTrickyG1= ruleTrickyG1 EOF
            {
             newCompositeNode(grammarAccess.getTrickyG1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrickyG1=ruleTrickyG1();

            state._fsp--;

             current =iv_ruleTrickyG1; 
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
    // $ANTLR end "entryRuleTrickyG1"


    // $ANTLR start "ruleTrickyG1"
    // InternalComplexReconstrTestLanguage.g:333:1: ruleTrickyG1 returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleTrickyG1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vals_1_0 = null;

        EObject lv_vals_3_0 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:334:1: ( (otherlv_0= '[' ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )? otherlv_4= ']' ) )
            // InternalComplexReconstrTestLanguage.g:335:2: (otherlv_0= '[' ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )? otherlv_4= ']' )
            {
            // InternalComplexReconstrTestLanguage.g:335:2: (otherlv_0= '[' ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )? otherlv_4= ']' )
            // InternalComplexReconstrTestLanguage.g:336:3: otherlv_0= '[' ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTrickyG1Access().getLeftSquareBracketKeyword_0());
            		
            // InternalComplexReconstrTestLanguage.g:340:3: ( ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComplexReconstrTestLanguage.g:341:4: ( (lv_vals_1_0= ruleTrickyG2 ) ) (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )*
                    {
                    // InternalComplexReconstrTestLanguage.g:341:4: ( (lv_vals_1_0= ruleTrickyG2 ) )
                    // InternalComplexReconstrTestLanguage.g:342:5: (lv_vals_1_0= ruleTrickyG2 )
                    {
                    // InternalComplexReconstrTestLanguage.g:342:5: (lv_vals_1_0= ruleTrickyG2 )
                    // InternalComplexReconstrTestLanguage.g:343:6: lv_vals_1_0= ruleTrickyG2
                    {

                    						newCompositeNode(grammarAccess.getTrickyG1Access().getValsTrickyG2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_vals_1_0=ruleTrickyG2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrickyG1Rule());
                    						}
                    						add(
                    							current,
                    							"vals",
                    							lv_vals_1_0,
                    							"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComplexReconstrTestLanguage.g:360:4: (otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComplexReconstrTestLanguage.g:361:5: otherlv_2= ',' ( (lv_vals_3_0= ruleTrickyG2 ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTrickyG1Access().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalComplexReconstrTestLanguage.g:365:5: ( (lv_vals_3_0= ruleTrickyG2 ) )
                    	    // InternalComplexReconstrTestLanguage.g:366:6: (lv_vals_3_0= ruleTrickyG2 )
                    	    {
                    	    // InternalComplexReconstrTestLanguage.g:366:6: (lv_vals_3_0= ruleTrickyG2 )
                    	    // InternalComplexReconstrTestLanguage.g:367:7: lv_vals_3_0= ruleTrickyG2
                    	    {

                    	    							newCompositeNode(grammarAccess.getTrickyG1Access().getValsTrickyG2ParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_vals_3_0=ruleTrickyG2();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTrickyG1Rule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vals",
                    	    								lv_vals_3_0,
                    	    								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG2");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrickyG1Access().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleTrickyG1"


    // $ANTLR start "entryRuleTrickyG2"
    // InternalComplexReconstrTestLanguage.g:394:1: entryRuleTrickyG2 returns [EObject current=null] : iv_ruleTrickyG2= ruleTrickyG2 EOF ;
    public final EObject entryRuleTrickyG2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG2 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:394:49: (iv_ruleTrickyG2= ruleTrickyG2 EOF )
            // InternalComplexReconstrTestLanguage.g:395:2: iv_ruleTrickyG2= ruleTrickyG2 EOF
            {
             newCompositeNode(grammarAccess.getTrickyG2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrickyG2=ruleTrickyG2();

            state._fsp--;

             current =iv_ruleTrickyG2; 
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
    // $ANTLR end "entryRuleTrickyG2"


    // $ANTLR start "ruleTrickyG2"
    // InternalComplexReconstrTestLanguage.g:401:1: ruleTrickyG2 returns [EObject current=null] : (this_TrickyG1_0= ruleTrickyG1 | ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTrickyG2() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        EObject this_TrickyG1_0 = null;


        try {
            // InternalComplexReconstrTestLanguage.g:402:1: ( (this_TrickyG1_0= ruleTrickyG1 | ( (lv_val_1_0= RULE_INT ) ) ) )
            // InternalComplexReconstrTestLanguage.g:403:2: (this_TrickyG1_0= ruleTrickyG1 | ( (lv_val_1_0= RULE_INT ) ) )
            {
            // InternalComplexReconstrTestLanguage.g:403:2: (this_TrickyG1_0= ruleTrickyG1 | ( (lv_val_1_0= RULE_INT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComplexReconstrTestLanguage.g:404:3: this_TrickyG1_0= ruleTrickyG1
                    {

                    			newCompositeNode(grammarAccess.getTrickyG2Access().getTrickyG1ParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TrickyG1_0=ruleTrickyG1();

                    state._fsp--;


                    			current = this_TrickyG1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComplexReconstrTestLanguage.g:413:3: ( (lv_val_1_0= RULE_INT ) )
                    {
                    // InternalComplexReconstrTestLanguage.g:413:3: ( (lv_val_1_0= RULE_INT ) )
                    // InternalComplexReconstrTestLanguage.g:414:4: (lv_val_1_0= RULE_INT )
                    {
                    // InternalComplexReconstrTestLanguage.g:414:4: (lv_val_1_0= RULE_INT )
                    // InternalComplexReconstrTestLanguage.g:415:5: lv_val_1_0= RULE_INT
                    {
                    lv_val_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_val_1_0, grammarAccess.getTrickyG2Access().getValINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTrickyG2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


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
    // $ANTLR end "ruleTrickyG2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    }


}