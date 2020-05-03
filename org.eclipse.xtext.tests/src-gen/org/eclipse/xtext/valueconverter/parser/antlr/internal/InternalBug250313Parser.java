package org.eclipse.xtext.valueconverter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.valueconverter.services.Bug250313GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug250313Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'mykeyword1'", "'1+'", "'2'", "'2+'", "'3'", "'3+'", "'4'", "'4+'", "'content'", "'-'", "'+'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBug250313Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug250313Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug250313Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug250313.g"; }



     	private Bug250313GrammarAccess grammarAccess;

        public InternalBug250313Parser(TokenStream input, Bug250313GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug250313GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug250313.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug250313.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug250313.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalBug250313.g:71:1: ruleModel returns [EObject current=null] : ( ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) ) | (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) ) | (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) ) | (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) ) | (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) ) | (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) ) | (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) ) | (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) ) | (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_5=null;
        Token otherlv_2=null;
        Token lv_multiValue_3_1=null;
        Token lv_multiValue_3_2=null;
        Token lv_multiValue_3_5=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token lv_multiValue_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_value_1_3 = null;

        AntlrDatatypeRuleToken lv_value_1_4 = null;

        AntlrDatatypeRuleToken lv_multiValue_3_3 = null;

        AntlrDatatypeRuleToken lv_multiValue_3_4 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_multiValue_11_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;

        AntlrDatatypeRuleToken lv_multiValue_15_0 = null;

        EObject lv_children_17_0 = null;


        try {
            // InternalBug250313.g:72:1: ( ( ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) ) | (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) ) | (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) ) | (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) ) | (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) ) | (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) ) | (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) ) | (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) ) | (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) ) ) )
            // InternalBug250313.g:73:2: ( ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) ) | (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) ) | (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) ) | (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) ) | (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) ) | (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) ) | (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) ) | (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) ) | (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) ) )
            {
            // InternalBug250313.g:73:2: ( ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) ) | (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) ) | (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) ) | (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) ) | (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) ) | (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) ) | (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) ) | (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) ) | (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 11:
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            case 20:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBug250313.g:74:3: ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) )
                    {
                    // InternalBug250313.g:74:3: ( (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) ) )
                    // InternalBug250313.g:75:4: (otherlv_0= '1' )? ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) )
                    {
                    // InternalBug250313.g:75:4: (otherlv_0= '1' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==11) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalBug250313.g:76:5: otherlv_0= '1'
                            {
                            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                            					newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDigitOneKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalBug250313.g:81:4: ( ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) ) )
                    // InternalBug250313.g:82:5: ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) )
                    {
                    // InternalBug250313.g:82:5: ( (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID ) )
                    // InternalBug250313.g:83:6: (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID )
                    {
                    // InternalBug250313.g:83:6: (lv_value_1_1= 'mykeyword1' | lv_value_1_2= RULE_STRING | lv_value_1_3= ruleNestedDatatype | lv_value_1_4= ruleDatatype | lv_value_1_5= RULE_ID )
                    int alt2=5;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt2=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case 21:
                            {
                            alt2=4;
                            }
                            break;
                        case 22:
                            {
                            alt2=3;
                            }
                            break;
                        case EOF:
                            {
                            alt2=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalBug250313.g:84:7: lv_value_1_1= 'mykeyword1'
                            {
                            lv_value_1_1=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getModelAccess().getValueMykeyword1Keyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBug250313.g:95:7: lv_value_1_2= RULE_STRING
                            {
                            lv_value_1_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getModelAccess().getValueSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;
                        case 3 :
                            // InternalBug250313.g:110:7: lv_value_1_3= ruleNestedDatatype
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getValueNestedDatatypeParserRuleCall_0_1_0_2());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_1_3=ruleNestedDatatype();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_1_3,
                            								"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 4 :
                            // InternalBug250313.g:126:7: lv_value_1_4= ruleDatatype
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getValueDatatypeParserRuleCall_0_1_0_3());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_1_4=ruleDatatype();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_1_4,
                            								"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 5 :
                            // InternalBug250313.g:142:7: lv_value_1_5= RULE_ID
                            {
                            lv_value_1_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_value_1_5, grammarAccess.getModelAccess().getValueIDTerminalRuleCall_0_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_5,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug250313.g:161:3: (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) )
                    {
                    // InternalBug250313.g:161:3: (otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) ) )
                    // InternalBug250313.g:162:4: otherlv_2= '1+' ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDigitOnePlusSignKeyword_1_0());
                    			
                    // InternalBug250313.g:166:4: ( ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) ) )
                    // InternalBug250313.g:167:5: ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) )
                    {
                    // InternalBug250313.g:167:5: ( (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID ) )
                    // InternalBug250313.g:168:6: (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID )
                    {
                    // InternalBug250313.g:168:6: (lv_multiValue_3_1= 'mykeyword1' | lv_multiValue_3_2= RULE_STRING | lv_multiValue_3_3= ruleNestedDatatype | lv_multiValue_3_4= ruleDatatype | lv_multiValue_3_5= RULE_ID )
                    int alt3=5;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt3=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt3=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case 22:
                            {
                            alt3=3;
                            }
                            break;
                        case EOF:
                            {
                            alt3=5;
                            }
                            break;
                        case 21:
                            {
                            alt3=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // InternalBug250313.g:169:7: lv_multiValue_3_1= 'mykeyword1'
                            {
                            lv_multiValue_3_1=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_multiValue_3_1, grammarAccess.getModelAccess().getMultiValueMykeyword1Keyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							addWithLastConsumed(current, "multiValue", lv_multiValue_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBug250313.g:180:7: lv_multiValue_3_2= RULE_STRING
                            {
                            lv_multiValue_3_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_multiValue_3_2, grammarAccess.getModelAccess().getMultiValueSTRINGTerminalRuleCall_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"multiValue",
                            								lv_multiValue_3_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;
                        case 3 :
                            // InternalBug250313.g:195:7: lv_multiValue_3_3= ruleNestedDatatype
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getMultiValueNestedDatatypeParserRuleCall_1_1_0_2());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_multiValue_3_3=ruleNestedDatatype();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							add(
                            								current,
                            								"multiValue",
                            								lv_multiValue_3_3,
                            								"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 4 :
                            // InternalBug250313.g:211:7: lv_multiValue_3_4= ruleDatatype
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getMultiValueDatatypeParserRuleCall_1_1_0_3());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_multiValue_3_4=ruleDatatype();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							add(
                            								current,
                            								"multiValue",
                            								lv_multiValue_3_4,
                            								"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 5 :
                            // InternalBug250313.g:227:7: lv_multiValue_3_5= RULE_ID
                            {
                            lv_multiValue_3_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                            							newLeafNode(lv_multiValue_3_5, grammarAccess.getModelAccess().getMultiValueIDTerminalRuleCall_1_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"multiValue",
                            								lv_multiValue_3_5,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug250313.g:246:3: (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalBug250313.g:246:3: (otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalBug250313.g:247:4: otherlv_4= '2' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDigitTwoKeyword_2_0());
                    			
                    // InternalBug250313.g:251:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalBug250313.g:252:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalBug250313.g:252:5: (lv_value_5_0= RULE_STRING )
                    // InternalBug250313.g:253:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getModelAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug250313.g:271:3: (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) )
                    {
                    // InternalBug250313.g:271:3: (otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) ) )
                    // InternalBug250313.g:272:4: otherlv_6= '2+' ( (lv_multiValue_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getDigitTwoPlusSignKeyword_3_0());
                    			
                    // InternalBug250313.g:276:4: ( (lv_multiValue_7_0= RULE_STRING ) )
                    // InternalBug250313.g:277:5: (lv_multiValue_7_0= RULE_STRING )
                    {
                    // InternalBug250313.g:277:5: (lv_multiValue_7_0= RULE_STRING )
                    // InternalBug250313.g:278:6: lv_multiValue_7_0= RULE_STRING
                    {
                    lv_multiValue_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_multiValue_7_0, grammarAccess.getModelAccess().getMultiValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"multiValue",
                    							lv_multiValue_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug250313.g:296:3: (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) )
                    {
                    // InternalBug250313.g:296:3: (otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) ) )
                    // InternalBug250313.g:297:4: otherlv_8= '3' ( (lv_value_9_0= ruleDatatype ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getDigitThreeKeyword_4_0());
                    			
                    // InternalBug250313.g:301:4: ( (lv_value_9_0= ruleDatatype ) )
                    // InternalBug250313.g:302:5: (lv_value_9_0= ruleDatatype )
                    {
                    // InternalBug250313.g:302:5: (lv_value_9_0= ruleDatatype )
                    // InternalBug250313.g:303:6: lv_value_9_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getValueDatatypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_9_0=ruleDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBug250313.g:322:3: (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) )
                    {
                    // InternalBug250313.g:322:3: (otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) ) )
                    // InternalBug250313.g:323:4: otherlv_10= '3+' ( (lv_multiValue_11_0= ruleDatatype ) )
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getDigitThreePlusSignKeyword_5_0());
                    			
                    // InternalBug250313.g:327:4: ( (lv_multiValue_11_0= ruleDatatype ) )
                    // InternalBug250313.g:328:5: (lv_multiValue_11_0= ruleDatatype )
                    {
                    // InternalBug250313.g:328:5: (lv_multiValue_11_0= ruleDatatype )
                    // InternalBug250313.g:329:6: lv_multiValue_11_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getMultiValueDatatypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_multiValue_11_0=ruleDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"multiValue",
                    							lv_multiValue_11_0,
                    							"org.eclipse.xtext.valueconverter.Bug250313.Datatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBug250313.g:348:3: (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) )
                    {
                    // InternalBug250313.g:348:3: (otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) ) )
                    // InternalBug250313.g:349:4: otherlv_12= '4' ( (lv_value_13_0= ruleNestedDatatype ) )
                    {
                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getDigitFourKeyword_6_0());
                    			
                    // InternalBug250313.g:353:4: ( (lv_value_13_0= ruleNestedDatatype ) )
                    // InternalBug250313.g:354:5: (lv_value_13_0= ruleNestedDatatype )
                    {
                    // InternalBug250313.g:354:5: (lv_value_13_0= ruleNestedDatatype )
                    // InternalBug250313.g:355:6: lv_value_13_0= ruleNestedDatatype
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getValueNestedDatatypeParserRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_13_0=ruleNestedDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_13_0,
                    							"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBug250313.g:374:3: (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) )
                    {
                    // InternalBug250313.g:374:3: (otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) ) )
                    // InternalBug250313.g:375:4: otherlv_14= '4+' ( (lv_multiValue_15_0= ruleNestedDatatype ) )
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getDigitFourPlusSignKeyword_7_0());
                    			
                    // InternalBug250313.g:379:4: ( (lv_multiValue_15_0= ruleNestedDatatype ) )
                    // InternalBug250313.g:380:5: (lv_multiValue_15_0= ruleNestedDatatype )
                    {
                    // InternalBug250313.g:380:5: (lv_multiValue_15_0= ruleNestedDatatype )
                    // InternalBug250313.g:381:6: lv_multiValue_15_0= ruleNestedDatatype
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getMultiValueNestedDatatypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_multiValue_15_0=ruleNestedDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"multiValue",
                    							lv_multiValue_15_0,
                    							"org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalBug250313.g:400:3: (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) )
                    {
                    // InternalBug250313.g:400:3: (otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) ) )
                    // InternalBug250313.g:401:4: otherlv_16= 'content' ( (lv_children_17_0= ruleChild ) )
                    {
                    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getContentKeyword_8_0());
                    			
                    // InternalBug250313.g:405:4: ( (lv_children_17_0= ruleChild ) )
                    // InternalBug250313.g:406:5: (lv_children_17_0= ruleChild )
                    {
                    // InternalBug250313.g:406:5: (lv_children_17_0= ruleChild )
                    // InternalBug250313.g:407:6: lv_children_17_0= ruleChild
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getChildrenChildParserRuleCall_8_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_children_17_0=ruleChild();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"children",
                    							lv_children_17_0,
                    							"org.eclipse.xtext.valueconverter.Bug250313.Child");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatatype"
    // InternalBug250313.g:429:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalBug250313.g:429:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBug250313.g:430:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalBug250313.g:436:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // InternalBug250313.g:437:1: ( (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) )
            // InternalBug250313.g:438:2: (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID )
            {
            // InternalBug250313.g:438:2: (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID )
            // InternalBug250313.g:439:3: this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,21,FollowSets000.FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDatatypeAccess().getHyphenMinusKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleNestedDatatype"
    // InternalBug250313.g:462:1: entryRuleNestedDatatype returns [String current=null] : iv_ruleNestedDatatype= ruleNestedDatatype EOF ;
    public final String entryRuleNestedDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedDatatype = null;


        try {
            // InternalBug250313.g:462:54: (iv_ruleNestedDatatype= ruleNestedDatatype EOF )
            // InternalBug250313.g:463:2: iv_ruleNestedDatatype= ruleNestedDatatype EOF
            {
             newCompositeNode(grammarAccess.getNestedDatatypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedDatatype=ruleNestedDatatype();

            state._fsp--;

             current =iv_ruleNestedDatatype.getText(); 
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
    // $ANTLR end "entryRuleNestedDatatype"


    // $ANTLR start "ruleNestedDatatype"
    // InternalBug250313.g:469:1: ruleNestedDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '+' (this_Datatype_2= ruleDatatype )? ) ;
    public final AntlrDatatypeRuleToken ruleNestedDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Datatype_2 = null;


        try {
            // InternalBug250313.g:470:1: ( (this_ID_0= RULE_ID kw= '+' (this_Datatype_2= ruleDatatype )? ) )
            // InternalBug250313.g:471:2: (this_ID_0= RULE_ID kw= '+' (this_Datatype_2= ruleDatatype )? )
            {
            // InternalBug250313.g:471:2: (this_ID_0= RULE_ID kw= '+' (this_Datatype_2= ruleDatatype )? )
            // InternalBug250313.g:472:3: this_ID_0= RULE_ID kw= '+' (this_Datatype_2= ruleDatatype )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNestedDatatypeAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FollowSets000.FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNestedDatatypeAccess().getPlusSignKeyword_1());
            		
            // InternalBug250313.g:484:3: (this_Datatype_2= ruleDatatype )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBug250313.g:485:4: this_Datatype_2= ruleDatatype
                    {

                    				newCompositeNode(grammarAccess.getNestedDatatypeAccess().getDatatypeParserRuleCall_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Datatype_2=ruleDatatype();

                    state._fsp--;


                    				current.merge(this_Datatype_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleNestedDatatype"


    // $ANTLR start "entryRuleChild"
    // InternalBug250313.g:500:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalBug250313.g:500:46: (iv_ruleChild= ruleChild EOF )
            // InternalBug250313.g:501:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalBug250313.g:507:1: ruleChild returns [EObject current=null] : (this_Child1_0= ruleChild1 | this_Child2_1= ruleChild2 ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        EObject this_Child1_0 = null;

        EObject this_Child2_1 = null;


        try {
            // InternalBug250313.g:508:1: ( (this_Child1_0= ruleChild1 | this_Child2_1= ruleChild2 ) )
            // InternalBug250313.g:509:2: (this_Child1_0= ruleChild1 | this_Child2_1= ruleChild2 )
            {
            // InternalBug250313.g:509:2: (this_Child1_0= ruleChild1 | this_Child2_1= ruleChild2 )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBug250313.g:510:3: this_Child1_0= ruleChild1
                    {

                    			newCompositeNode(grammarAccess.getChildAccess().getChild1ParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Child1_0=ruleChild1();

                    state._fsp--;


                    			current = this_Child1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBug250313.g:519:3: this_Child2_1= ruleChild2
                    {

                    			newCompositeNode(grammarAccess.getChildAccess().getChild2ParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Child2_1=ruleChild2();

                    state._fsp--;


                    			current = this_Child2_1;
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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleChild1"
    // InternalBug250313.g:531:1: entryRuleChild1 returns [EObject current=null] : iv_ruleChild1= ruleChild1 EOF ;
    public final EObject entryRuleChild1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1 = null;


        try {
            // InternalBug250313.g:531:47: (iv_ruleChild1= ruleChild1 EOF )
            // InternalBug250313.g:532:2: iv_ruleChild1= ruleChild1 EOF
            {
             newCompositeNode(grammarAccess.getChild1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1=ruleChild1();

            state._fsp--;

             current =iv_ruleChild1; 
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
    // $ANTLR end "entryRuleChild1"


    // $ANTLR start "ruleChild1"
    // InternalBug250313.g:538:1: ruleChild1 returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChild1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

        try {
            // InternalBug250313.g:539:1: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBug250313.g:540:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBug250313.g:540:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug250313.g:541:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBug250313.g:541:3: (lv_name_0_0= RULE_ID )
            // InternalBug250313.g:542:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChild1Access().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChild1Rule());
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
    // $ANTLR end "ruleChild1"


    // $ANTLR start "entryRuleChild2"
    // InternalBug250313.g:561:1: entryRuleChild2 returns [EObject current=null] : iv_ruleChild2= ruleChild2 EOF ;
    public final EObject entryRuleChild2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2 = null;


        try {
            // InternalBug250313.g:561:47: (iv_ruleChild2= ruleChild2 EOF )
            // InternalBug250313.g:562:2: iv_ruleChild2= ruleChild2 EOF
            {
             newCompositeNode(grammarAccess.getChild2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2=ruleChild2();

            state._fsp--;

             current =iv_ruleChild2; 
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
    // $ANTLR end "entryRuleChild2"


    // $ANTLR start "ruleChild2"
    // InternalBug250313.g:568:1: ruleChild2 returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleChild2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

        try {
            // InternalBug250313.g:569:1: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalBug250313.g:570:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalBug250313.g:570:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalBug250313.g:571:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalBug250313.g:571:3: (lv_name_0_0= RULE_STRING )
            // InternalBug250313.g:572:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChild2Access().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChild2Rule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleChild2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    }


}