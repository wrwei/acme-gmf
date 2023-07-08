package org.eclipse.acme.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.acme.services.ACMECNlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalACMECNlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'for'", "'all'", "'in'", "'a'", "'an'", "'of'", "'the'", "'following'", "'are'", "'mandatory'", "'required'", "'needed'", "'obligatory'", "'is'", "'find'", "'then'", "'where'", "'data'", "'rule'", "'error'", "'message'", "'<EOLExpression>'", "'</EOLExpression>'", "'implies'", "'only'", "'if'", "'when'", "'or'", "'xor'", "'and'", "'iff'", "'either'", "'equals'", "'must'", "'be'", "'not'", "'cannot'", "'greater'", "'than'", "'less'", "'equal'", "'to'", "'before'", "'by'", "'after'", "'later'", "'on'", "'sum'", "'average'", "'maximum'", "'minimum'", "'any'", "'combination'", "'values'", "','", "'unique'", "'from'", "'type'", "':'", "'value'", "'true'", "'false'", "'types'", "'enumerations'", "'{'", "'}'", "'empty'", "'exists'", "'exist'", "'+'", "'-'", "'*'", "'/'", "'String'", "'Boolean'", "'Integer'", "'Decimal'", "'Date'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=7;
    public static final int RULE_DATE=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalACMECNlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalACMECNlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalACMECNlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalACMECNl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private ACMECNlGrammarAccess grammarAccess;

        public InternalACMECNlParser(TokenStream input, ACMECNlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConstrainedNaturalLanguageRules";
       	}

       	@Override
       	protected ACMECNlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConstrainedNaturalLanguageRules"
    // InternalACMECNl.g:71:1: entryRuleConstrainedNaturalLanguageRules returns [EObject current=null] : iv_ruleConstrainedNaturalLanguageRules= ruleConstrainedNaturalLanguageRules EOF ;
    public final EObject entryRuleConstrainedNaturalLanguageRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainedNaturalLanguageRules = null;


        try {
            // InternalACMECNl.g:71:72: (iv_ruleConstrainedNaturalLanguageRules= ruleConstrainedNaturalLanguageRules EOF )
            // InternalACMECNl.g:72:2: iv_ruleConstrainedNaturalLanguageRules= ruleConstrainedNaturalLanguageRules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrainedNaturalLanguageRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrainedNaturalLanguageRules=ruleConstrainedNaturalLanguageRules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrainedNaturalLanguageRules; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstrainedNaturalLanguageRules"


    // $ANTLR start "ruleConstrainedNaturalLanguageRules"
    // InternalACMECNl.g:78:1: ruleConstrainedNaturalLanguageRules returns [EObject current=null] : ( ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )* ( (lv_metadata_1_0= ruleMetaData ) )* ) ;
    public final EObject ruleConstrainedNaturalLanguageRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_1 = null;

        EObject lv_rules_0_2 = null;

        EObject lv_metadata_1_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:84:2: ( ( ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )* ( (lv_metadata_1_0= ruleMetaData ) )* ) )
            // InternalACMECNl.g:85:2: ( ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )* ( (lv_metadata_1_0= ruleMetaData ) )* )
            {
            // InternalACMECNl.g:85:2: ( ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )* ( (lv_metadata_1_0= ruleMetaData ) )* )
            // InternalACMECNl.g:86:3: ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )* ( (lv_metadata_1_0= ruleMetaData ) )*
            {
            // InternalACMECNl.g:86:3: ( ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=17)||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalACMECNl.g:87:4: ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) )
            	    {
            	    // InternalACMECNl.g:87:4: ( (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule ) )
            	    // InternalACMECNl.g:88:5: (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule )
            	    {
            	    // InternalACMECNl.g:88:5: (lv_rules_0_1= ruleScopedRules | lv_rules_0_2= ruleMatchScopedRule )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=13 && LA1_0<=17)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==27) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalACMECNl.g:89:6: lv_rules_0_1= ruleScopedRules
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getRulesScopedRulesParserRuleCall_0_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_rules_0_1=ruleScopedRules();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getConstrainedNaturalLanguageRulesRule());
            	              						}
            	              						add(
            	              							current,
            	              							"rules",
            	              							lv_rules_0_1,
            	              							"org.eclipse.acme.ACMECNl.ScopedRules");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalACMECNl.g:105:6: lv_rules_0_2= ruleMatchScopedRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getRulesMatchScopedRuleParserRuleCall_0_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_rules_0_2=ruleMatchScopedRule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getConstrainedNaturalLanguageRulesRule());
            	              						}
            	              						add(
            	              							current,
            	              							"rules",
            	              							lv_rules_0_2,
            	              							"org.eclipse.acme.ACMECNl.MatchScopedRule");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalACMECNl.g:123:3: ( (lv_metadata_1_0= ruleMetaData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=75 && LA3_0<=76)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalACMECNl.g:124:4: (lv_metadata_1_0= ruleMetaData )
            	    {
            	    // InternalACMECNl.g:124:4: (lv_metadata_1_0= ruleMetaData )
            	    // InternalACMECNl.g:125:5: lv_metadata_1_0= ruleMetaData
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getMetadataMetaDataParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_metadata_1_0=ruleMetaData();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstrainedNaturalLanguageRulesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_1_0,
            	      						"org.eclipse.acme.ACMECNl.MetaData");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstrainedNaturalLanguageRules"


    // $ANTLR start "entryRuleScopedRules"
    // InternalACMECNl.g:146:1: entryRuleScopedRules returns [EObject current=null] : iv_ruleScopedRules= ruleScopedRules EOF ;
    public final EObject entryRuleScopedRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedRules = null;


        try {
            // InternalACMECNl.g:146:52: (iv_ruleScopedRules= ruleScopedRules EOF )
            // InternalACMECNl.g:147:2: iv_ruleScopedRules= ruleScopedRules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopedRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopedRules=ruleScopedRules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopedRules; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScopedRules"


    // $ANTLR start "ruleScopedRules"
    // InternalACMECNl.g:153:1: ruleScopedRules returns [EObject current=null] : ( ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) ) ( (lv_rules_33_0= ruleRule ) )+ ) ;
    public final EObject ruleScopedRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject lv_scope_28_0 = null;

        EObject lv_scope_31_0 = null;

        EObject lv_rules_33_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:159:2: ( ( ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) ) ( (lv_rules_33_0= ruleRule ) )+ ) )
            // InternalACMECNl.g:160:2: ( ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) ) ( (lv_rules_33_0= ruleRule ) )+ )
            {
            // InternalACMECNl.g:160:2: ( ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) ) ( (lv_rules_33_0= ruleRule ) )+ )
            // InternalACMECNl.g:161:3: ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) ) ( (lv_rules_33_0= ruleRule ) )+
            {
            // InternalACMECNl.g:161:3: ( ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) ) | ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=15)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=16 && LA9_0<=17)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalACMECNl.g:162:4: ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) )
                    {
                    // InternalACMECNl.g:162:4: ( ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) ) )
                    // InternalACMECNl.g:163:5: ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) ) ( (lv_scope_28_0= ruleElementScope ) )
                    {
                    // InternalACMECNl.g:163:5: ( (otherlv_0= 'for' otherlv_1= 'all' ) | otherlv_2= 'in' | (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) ) | (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? ) )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt7=1;
                        }
                        break;
                    case 15:
                        {
                        int LA7_2 = input.LA(2);

                        if ( ((LA7_2>=16 && LA7_2<=17)) ) {
                            alt7=3;
                        }
                        else if ( (LA7_2==RULE_ID) ) {
                            alt7=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // InternalACMECNl.g:164:6: (otherlv_0= 'for' otherlv_1= 'all' )
                            {
                            // InternalACMECNl.g:164:6: (otherlv_0= 'for' otherlv_1= 'all' )
                            // InternalACMECNl.g:165:7: otherlv_0= 'for' otherlv_1= 'all'
                            {
                            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_0, grammarAccess.getScopedRulesAccess().getForKeyword_0_0_0_0_0());
                              						
                            }
                            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_1, grammarAccess.getScopedRulesAccess().getAllKeyword_0_0_0_0_1());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:175:6: otherlv_2= 'in'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalACMECNl.g:180:6: (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) )
                            {
                            // InternalACMECNl.g:180:6: (otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' ) )
                            // InternalACMECNl.g:181:7: otherlv_3= 'in' (otherlv_4= 'a' | otherlv_5= 'an' )
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_2_0());
                              						
                            }
                            // InternalACMECNl.g:185:7: (otherlv_4= 'a' | otherlv_5= 'an' )
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==16) ) {
                                alt4=1;
                            }
                            else if ( (LA4_0==17) ) {
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
                                    // InternalACMECNl.g:186:8: otherlv_4= 'a'
                                    {
                                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_4, grammarAccess.getScopedRulesAccess().getAKeyword_0_0_0_2_1_0());
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalACMECNl.g:191:8: otherlv_5= 'an'
                                    {
                                    otherlv_5=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_5, grammarAccess.getScopedRulesAccess().getAnKeyword_0_0_0_2_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalACMECNl.g:198:6: (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? )
                            {
                            // InternalACMECNl.g:198:6: (otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )? )
                            // InternalACMECNl.g:199:7: otherlv_6= 'all' otherlv_7= 'of' otherlv_8= 'the' otherlv_9= 'following' otherlv_10= 'are' ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) ) (otherlv_27= 'a' )?
                            {
                            otherlv_6=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_6, grammarAccess.getScopedRulesAccess().getAllKeyword_0_0_0_3_0());
                              						
                            }
                            otherlv_7=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_7, grammarAccess.getScopedRulesAccess().getOfKeyword_0_0_0_3_1());
                              						
                            }
                            otherlv_8=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getScopedRulesAccess().getTheKeyword_0_0_0_3_2());
                              						
                            }
                            otherlv_9=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getScopedRulesAccess().getFollowingKeyword_0_0_0_3_3());
                              						
                            }
                            otherlv_10=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_10, grammarAccess.getScopedRulesAccess().getAreKeyword_0_0_0_3_4());
                              						
                            }
                            // InternalACMECNl.g:219:7: ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) )
                            int alt5=8;
                            alt5 = dfa5.predict(input);
                            switch (alt5) {
                                case 1 :
                                    // InternalACMECNl.g:220:8: (otherlv_11= 'mandatory' otherlv_12= 'for' )
                                    {
                                    // InternalACMECNl.g:220:8: (otherlv_11= 'mandatory' otherlv_12= 'for' )
                                    // InternalACMECNl.g:221:9: otherlv_11= 'mandatory' otherlv_12= 'for'
                                    {
                                    otherlv_11=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_11, grammarAccess.getScopedRulesAccess().getMandatoryKeyword_0_0_0_3_5_0_0());
                                      								
                                    }
                                    otherlv_12=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_12, grammarAccess.getScopedRulesAccess().getForKeyword_0_0_0_3_5_0_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalACMECNl.g:231:8: (otherlv_13= 'required' otherlv_14= 'for' )
                                    {
                                    // InternalACMECNl.g:231:8: (otherlv_13= 'required' otherlv_14= 'for' )
                                    // InternalACMECNl.g:232:9: otherlv_13= 'required' otherlv_14= 'for'
                                    {
                                    otherlv_13=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_13, grammarAccess.getScopedRulesAccess().getRequiredKeyword_0_0_0_3_5_1_0());
                                      								
                                    }
                                    otherlv_14=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_14, grammarAccess.getScopedRulesAccess().getForKeyword_0_0_0_3_5_1_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 3 :
                                    // InternalACMECNl.g:242:8: (otherlv_15= 'needed' otherlv_16= 'for' )
                                    {
                                    // InternalACMECNl.g:242:8: (otherlv_15= 'needed' otherlv_16= 'for' )
                                    // InternalACMECNl.g:243:9: otherlv_15= 'needed' otherlv_16= 'for'
                                    {
                                    otherlv_15=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_15, grammarAccess.getScopedRulesAccess().getNeededKeyword_0_0_0_3_5_2_0());
                                      								
                                    }
                                    otherlv_16=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_16, grammarAccess.getScopedRulesAccess().getForKeyword_0_0_0_3_5_2_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 4 :
                                    // InternalACMECNl.g:253:8: (otherlv_17= 'obligatory' otherlv_18= 'for' )
                                    {
                                    // InternalACMECNl.g:253:8: (otherlv_17= 'obligatory' otherlv_18= 'for' )
                                    // InternalACMECNl.g:254:9: otherlv_17= 'obligatory' otherlv_18= 'for'
                                    {
                                    otherlv_17=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_17, grammarAccess.getScopedRulesAccess().getObligatoryKeyword_0_0_0_3_5_3_0());
                                      								
                                    }
                                    otherlv_18=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_18, grammarAccess.getScopedRulesAccess().getForKeyword_0_0_0_3_5_3_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 5 :
                                    // InternalACMECNl.g:264:8: (otherlv_19= 'mandatory' otherlv_20= 'in' )
                                    {
                                    // InternalACMECNl.g:264:8: (otherlv_19= 'mandatory' otherlv_20= 'in' )
                                    // InternalACMECNl.g:265:9: otherlv_19= 'mandatory' otherlv_20= 'in'
                                    {
                                    otherlv_19=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_19, grammarAccess.getScopedRulesAccess().getMandatoryKeyword_0_0_0_3_5_4_0());
                                      								
                                    }
                                    otherlv_20=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_20, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_3_5_4_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 6 :
                                    // InternalACMECNl.g:275:8: (otherlv_21= 'required' otherlv_22= 'in' )
                                    {
                                    // InternalACMECNl.g:275:8: (otherlv_21= 'required' otherlv_22= 'in' )
                                    // InternalACMECNl.g:276:9: otherlv_21= 'required' otherlv_22= 'in'
                                    {
                                    otherlv_21=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_21, grammarAccess.getScopedRulesAccess().getRequiredKeyword_0_0_0_3_5_5_0());
                                      								
                                    }
                                    otherlv_22=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_22, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_3_5_5_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 7 :
                                    // InternalACMECNl.g:286:8: (otherlv_23= 'needed' otherlv_24= 'in' )
                                    {
                                    // InternalACMECNl.g:286:8: (otherlv_23= 'needed' otherlv_24= 'in' )
                                    // InternalACMECNl.g:287:9: otherlv_23= 'needed' otherlv_24= 'in'
                                    {
                                    otherlv_23=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_23, grammarAccess.getScopedRulesAccess().getNeededKeyword_0_0_0_3_5_6_0());
                                      								
                                    }
                                    otherlv_24=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_24, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_3_5_6_1());
                                      								
                                    }

                                    }


                                    }
                                    break;
                                case 8 :
                                    // InternalACMECNl.g:297:8: (otherlv_25= 'obligatory' otherlv_26= 'in' )
                                    {
                                    // InternalACMECNl.g:297:8: (otherlv_25= 'obligatory' otherlv_26= 'in' )
                                    // InternalACMECNl.g:298:9: otherlv_25= 'obligatory' otherlv_26= 'in'
                                    {
                                    otherlv_25=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_25, grammarAccess.getScopedRulesAccess().getObligatoryKeyword_0_0_0_3_5_7_0());
                                      								
                                    }
                                    otherlv_26=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_26, grammarAccess.getScopedRulesAccess().getInKeyword_0_0_0_3_5_7_1());
                                      								
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalACMECNl.g:308:7: (otherlv_27= 'a' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==16) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalACMECNl.g:309:8: otherlv_27= 'a'
                                    {
                                    otherlv_27=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_27, grammarAccess.getScopedRulesAccess().getAKeyword_0_0_0_3_6());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // InternalACMECNl.g:316:5: ( (lv_scope_28_0= ruleElementScope ) )
                    // InternalACMECNl.g:317:6: (lv_scope_28_0= ruleElementScope )
                    {
                    // InternalACMECNl.g:317:6: (lv_scope_28_0= ruleElementScope )
                    // InternalACMECNl.g:318:7: lv_scope_28_0= ruleElementScope
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getScopedRulesAccess().getScopeElementScopeParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_scope_28_0=ruleElementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getScopedRulesRule());
                      							}
                      							set(
                      								current,
                      								"scope",
                      								lv_scope_28_0,
                      								"org.eclipse.acme.ACMECNl.ElementScope");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:337:4: ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' )
                    {
                    // InternalACMECNl.g:337:4: ( (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is' )
                    // InternalACMECNl.g:338:5: (otherlv_29= 'a' | otherlv_30= 'an' ) ( (lv_scope_31_0= ruleElementScope ) ) otherlv_32= 'is'
                    {
                    // InternalACMECNl.g:338:5: (otherlv_29= 'a' | otherlv_30= 'an' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==17) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalACMECNl.g:339:6: otherlv_29= 'a'
                            {
                            otherlv_29=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_29, grammarAccess.getScopedRulesAccess().getAKeyword_0_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:344:6: otherlv_30= 'an'
                            {
                            otherlv_30=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_30, grammarAccess.getScopedRulesAccess().getAnKeyword_0_1_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:349:5: ( (lv_scope_31_0= ruleElementScope ) )
                    // InternalACMECNl.g:350:6: (lv_scope_31_0= ruleElementScope )
                    {
                    // InternalACMECNl.g:350:6: (lv_scope_31_0= ruleElementScope )
                    // InternalACMECNl.g:351:7: lv_scope_31_0= ruleElementScope
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getScopedRulesAccess().getScopeElementScopeParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_scope_31_0=ruleElementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getScopedRulesRule());
                      							}
                      							set(
                      								current,
                      								"scope",
                      								lv_scope_31_0,
                      								"org.eclipse.acme.ACMECNl.ElementScope");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_32, grammarAccess.getScopedRulesAccess().getIsKeyword_0_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalACMECNl.g:374:3: ( (lv_rules_33_0= ruleRule ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_DATE)||LA10_0==19||LA10_0==31||LA10_0==34||(LA10_0>=38 && LA10_0<=39)||LA10_0==44||LA10_0==46||LA10_0==64||(LA10_0>=73 && LA10_0<=74)||LA10_0==79) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalACMECNl.g:375:4: (lv_rules_33_0= ruleRule )
            	    {
            	    // InternalACMECNl.g:375:4: (lv_rules_33_0= ruleRule )
            	    // InternalACMECNl.g:376:5: lv_rules_33_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScopedRulesAccess().getRulesRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_rules_33_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScopedRulesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_33_0,
            	      						"org.eclipse.acme.ACMECNl.Rule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScopedRules"


    // $ANTLR start "entryRuleMatchScopedRule"
    // InternalACMECNl.g:397:1: entryRuleMatchScopedRule returns [EObject current=null] : iv_ruleMatchScopedRule= ruleMatchScopedRule EOF ;
    public final EObject entryRuleMatchScopedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchScopedRule = null;


        try {
            // InternalACMECNl.g:397:56: (iv_ruleMatchScopedRule= ruleMatchScopedRule EOF )
            // InternalACMECNl.g:398:2: iv_ruleMatchScopedRule= ruleMatchScopedRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchScopedRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMatchScopedRule=ruleMatchScopedRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchScopedRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchScopedRule"


    // $ANTLR start "ruleMatchScopedRule"
    // InternalACMECNl.g:404:1: ruleMatchScopedRule returns [EObject current=null] : (otherlv_0= 'find' ( (lv_matches_1_0= ruleMatchingRule ) )+ otherlv_2= 'then' ( (lv_rule_3_0= ruleRule ) ) ) ;
    public final EObject ruleMatchScopedRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_matches_1_0 = null;

        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:410:2: ( (otherlv_0= 'find' ( (lv_matches_1_0= ruleMatchingRule ) )+ otherlv_2= 'then' ( (lv_rule_3_0= ruleRule ) ) ) )
            // InternalACMECNl.g:411:2: (otherlv_0= 'find' ( (lv_matches_1_0= ruleMatchingRule ) )+ otherlv_2= 'then' ( (lv_rule_3_0= ruleRule ) ) )
            {
            // InternalACMECNl.g:411:2: (otherlv_0= 'find' ( (lv_matches_1_0= ruleMatchingRule ) )+ otherlv_2= 'then' ( (lv_rule_3_0= ruleRule ) ) )
            // InternalACMECNl.g:412:3: otherlv_0= 'find' ( (lv_matches_1_0= ruleMatchingRule ) )+ otherlv_2= 'then' ( (lv_rule_3_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMatchScopedRuleAccess().getFindKeyword_0());
              		
            }
            // InternalACMECNl.g:416:3: ( (lv_matches_1_0= ruleMatchingRule ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalACMECNl.g:417:4: (lv_matches_1_0= ruleMatchingRule )
            	    {
            	    // InternalACMECNl.g:417:4: (lv_matches_1_0= ruleMatchingRule )
            	    // InternalACMECNl.g:418:5: lv_matches_1_0= ruleMatchingRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMatchScopedRuleAccess().getMatchesMatchingRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_matches_1_0=ruleMatchingRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMatchScopedRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"matches",
            	      						lv_matches_1_0,
            	      						"org.eclipse.acme.ACMECNl.MatchingRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMatchScopedRuleAccess().getThenKeyword_2());
              		
            }
            // InternalACMECNl.g:439:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalACMECNl.g:440:4: (lv_rule_3_0= ruleRule )
            {
            // InternalACMECNl.g:440:4: (lv_rule_3_0= ruleRule )
            // InternalACMECNl.g:441:5: lv_rule_3_0= ruleRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMatchScopedRuleAccess().getRuleRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rule_3_0=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMatchScopedRuleRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_3_0,
              						"org.eclipse.acme.ACMECNl.Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMatchScopedRule"


    // $ANTLR start "entryRuleMatchingRule"
    // InternalACMECNl.g:462:1: entryRuleMatchingRule returns [EObject current=null] : iv_ruleMatchingRule= ruleMatchingRule EOF ;
    public final EObject entryRuleMatchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingRule = null;


        try {
            // InternalACMECNl.g:462:53: (iv_ruleMatchingRule= ruleMatchingRule EOF )
            // InternalACMECNl.g:463:2: iv_ruleMatchingRule= ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingRule"


    // $ANTLR start "ruleMatchingRule"
    // InternalACMECNl.g:469:1: ruleMatchingRule returns [EObject current=null] : ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) ) | (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) ) ) ;
    public final EObject ruleMatchingRule() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_scope_2_0 = null;

        EObject lv_astRoot_4_0 = null;

        EObject lv_scope_8_0 = null;

        EObject lv_astRoot_10_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:475:2: ( ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) ) | (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) ) ) )
            // InternalACMECNl.g:476:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) ) | (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) ) )
            {
            // InternalACMECNl.g:476:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) ) | (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalACMECNl.g:477:3: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) )
                    {
                    // InternalACMECNl.g:477:3: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) ) )
                    // InternalACMECNl.g:478:4: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_scope_2_0= ruleElementScope ) ) otherlv_3= 'where' ( (lv_astRoot_4_0= ruleLogicalExpression ) )
                    {
                    // InternalACMECNl.g:478:4: ( (lv_variableName_0_0= RULE_ID ) )
                    // InternalACMECNl.g:479:5: (lv_variableName_0_0= RULE_ID )
                    {
                    // InternalACMECNl.g:479:5: (lv_variableName_0_0= RULE_ID )
                    // InternalACMECNl.g:480:6: lv_variableName_0_0= RULE_ID
                    {
                    lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variableName_0_0, grammarAccess.getMatchingRuleAccess().getVariableNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMatchingRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variableName",
                      							lv_variableName_0_0,
                      							"org.eclipse.acme.ACMECNl.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMatchingRuleAccess().getInKeyword_0_1());
                      			
                    }
                    // InternalACMECNl.g:500:4: ( (lv_scope_2_0= ruleElementScope ) )
                    // InternalACMECNl.g:501:5: (lv_scope_2_0= ruleElementScope )
                    {
                    // InternalACMECNl.g:501:5: (lv_scope_2_0= ruleElementScope )
                    // InternalACMECNl.g:502:6: lv_scope_2_0= ruleElementScope
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMatchingRuleAccess().getScopeElementScopeParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_scope_2_0=ruleElementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
                      						}
                      						set(
                      							current,
                      							"scope",
                      							lv_scope_2_0,
                      							"org.eclipse.acme.ACMECNl.ElementScope");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getWhereKeyword_0_3());
                      			
                    }
                    // InternalACMECNl.g:523:4: ( (lv_astRoot_4_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:524:5: (lv_astRoot_4_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:524:5: (lv_astRoot_4_0= ruleLogicalExpression )
                    // InternalACMECNl.g:525:6: lv_astRoot_4_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMatchingRuleAccess().getAstRootLogicalExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_astRoot_4_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
                      						}
                      						set(
                      							current,
                      							"astRoot",
                      							lv_astRoot_4_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:544:3: (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) )
                    {
                    // InternalACMECNl.g:544:3: (otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) ) )
                    // InternalACMECNl.g:545:4: otherlv_5= 'all' otherlv_6= 'data' otherlv_7= 'in' ( (lv_scope_8_0= ruleElementScope ) ) otherlv_9= 'where' ( (lv_astRoot_10_0= ruleLogicalExpression ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMatchingRuleAccess().getAllKeyword_1_0());
                      			
                    }
                    otherlv_6=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMatchingRuleAccess().getDataKeyword_1_1());
                      			
                    }
                    otherlv_7=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getMatchingRuleAccess().getInKeyword_1_2());
                      			
                    }
                    // InternalACMECNl.g:557:4: ( (lv_scope_8_0= ruleElementScope ) )
                    // InternalACMECNl.g:558:5: (lv_scope_8_0= ruleElementScope )
                    {
                    // InternalACMECNl.g:558:5: (lv_scope_8_0= ruleElementScope )
                    // InternalACMECNl.g:559:6: lv_scope_8_0= ruleElementScope
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMatchingRuleAccess().getScopeElementScopeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_scope_8_0=ruleElementScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
                      						}
                      						set(
                      							current,
                      							"scope",
                      							lv_scope_8_0,
                      							"org.eclipse.acme.ACMECNl.ElementScope");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMatchingRuleAccess().getWhereKeyword_1_4());
                      			
                    }
                    // InternalACMECNl.g:580:4: ( (lv_astRoot_10_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:581:5: (lv_astRoot_10_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:581:5: (lv_astRoot_10_0= ruleLogicalExpression )
                    // InternalACMECNl.g:582:6: lv_astRoot_10_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMatchingRuleAccess().getAstRootLogicalExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_astRoot_10_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
                      						}
                      						set(
                      							current,
                      							"astRoot",
                      							lv_astRoot_10_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMatchingRule"


    // $ANTLR start "entryRuleElementScope"
    // InternalACMECNl.g:604:1: entryRuleElementScope returns [EObject current=null] : iv_ruleElementScope= ruleElementScope EOF ;
    public final EObject entryRuleElementScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementScope = null;


        try {
            // InternalACMECNl.g:604:53: (iv_ruleElementScope= ruleElementScope EOF )
            // InternalACMECNl.g:605:2: iv_ruleElementScope= ruleElementScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementScope=ruleElementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementScope"


    // $ANTLR start "ruleElementScope"
    // InternalACMECNl.g:611:1: ruleElementScope returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleElementScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:617:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalACMECNl.g:618:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalACMECNl.g:618:2: ( (otherlv_0= RULE_ID ) )
            // InternalACMECNl.g:619:3: (otherlv_0= RULE_ID )
            {
            // InternalACMECNl.g:619:3: (otherlv_0= RULE_ID )
            // InternalACMECNl.g:620:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getElementScopeRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getElementScopeAccess().getTypeTypeCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElementScope"


    // $ANTLR start "entryRuleRule"
    // InternalACMECNl.g:637:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalACMECNl.g:637:45: (iv_ruleRule= ruleRule EOF )
            // InternalACMECNl.g:638:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalACMECNl.g:644:1: ruleRule returns [EObject current=null] : (this_CNLRule_0= ruleCNLRule | this_GPLRule_1= ruleGPLRule ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_CNLRule_0 = null;

        EObject this_GPLRule_1 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:650:2: ( (this_CNLRule_0= ruleCNLRule | this_GPLRule_1= ruleGPLRule ) )
            // InternalACMECNl.g:651:2: (this_CNLRule_0= ruleCNLRule | this_GPLRule_1= ruleGPLRule )
            {
            // InternalACMECNl.g:651:2: (this_CNLRule_0= ruleCNLRule | this_GPLRule_1= ruleGPLRule )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=RULE_ID && LA13_4<=RULE_DATE)||LA13_4==19||(LA13_4>=38 && LA13_4<=39)||LA13_4==44||LA13_4==46||LA13_4==64||(LA13_4>=73 && LA13_4<=74)||LA13_4==79) ) {
                        alt13=1;
                    }
                    else if ( (LA13_4==34) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_DATE:
            case 19:
            case 38:
            case 39:
            case 44:
            case 46:
            case 64:
            case 73:
            case 74:
            case 79:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalACMECNl.g:652:3: this_CNLRule_0= ruleCNLRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRuleAccess().getCNLRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CNLRule_0=ruleCNLRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CNLRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:664:3: this_GPLRule_1= ruleGPLRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRuleAccess().getGPLRuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GPLRule_1=ruleGPLRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GPLRule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCNLRule"
    // InternalACMECNl.g:679:1: entryRuleCNLRule returns [EObject current=null] : iv_ruleCNLRule= ruleCNLRule EOF ;
    public final EObject entryRuleCNLRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCNLRule = null;


        try {
            // InternalACMECNl.g:679:48: (iv_ruleCNLRule= ruleCNLRule EOF )
            // InternalACMECNl.g:680:2: iv_ruleCNLRule= ruleCNLRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCNLRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCNLRule=ruleCNLRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCNLRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCNLRule"


    // $ANTLR start "ruleCNLRule"
    // InternalACMECNl.g:686:1: ruleCNLRule returns [EObject current=null] : ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_astRoot_2_0= ruleLogicalExpression ) ) ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCNLRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_message_5_0=null;
        EObject lv_astRoot_2_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:692:2: ( ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_astRoot_2_0= ruleLogicalExpression ) ) ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )? ) )
            // InternalACMECNl.g:693:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_astRoot_2_0= ruleLogicalExpression ) ) ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )? )
            {
            // InternalACMECNl.g:693:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_astRoot_2_0= ruleLogicalExpression ) ) ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )? )
            // InternalACMECNl.g:694:3: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_astRoot_2_0= ruleLogicalExpression ) ) ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )?
            {
            // InternalACMECNl.g:694:3: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalACMECNl.g:695:4: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCNLRuleAccess().getRuleKeyword_0_0());
                      			
                    }
                    // InternalACMECNl.g:699:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalACMECNl.g:700:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalACMECNl.g:700:5: (lv_name_1_0= RULE_ID )
                    // InternalACMECNl.g:701:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getCNLRuleAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCNLRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.acme.ACMECNl.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalACMECNl.g:718:3: ( (lv_astRoot_2_0= ruleLogicalExpression ) )
            // InternalACMECNl.g:719:4: (lv_astRoot_2_0= ruleLogicalExpression )
            {
            // InternalACMECNl.g:719:4: (lv_astRoot_2_0= ruleLogicalExpression )
            // InternalACMECNl.g:720:5: lv_astRoot_2_0= ruleLogicalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCNLRuleAccess().getAstRootLogicalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_astRoot_2_0=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCNLRuleRule());
              					}
              					set(
              						current,
              						"astRoot",
              						lv_astRoot_2_0,
              						"org.eclipse.acme.ACMECNl.LogicalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:737:3: ( (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=32 && LA16_0<=33)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalACMECNl.g:738:4: (otherlv_3= 'error' )? otherlv_4= 'message' ( (lv_message_5_0= RULE_STRING ) )
                    {
                    // InternalACMECNl.g:738:4: (otherlv_3= 'error' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==32) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalACMECNl.g:739:5: otherlv_3= 'error'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getCNLRuleAccess().getErrorKeyword_2_0());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCNLRuleAccess().getMessageKeyword_2_1());
                      			
                    }
                    // InternalACMECNl.g:748:4: ( (lv_message_5_0= RULE_STRING ) )
                    // InternalACMECNl.g:749:5: (lv_message_5_0= RULE_STRING )
                    {
                    // InternalACMECNl.g:749:5: (lv_message_5_0= RULE_STRING )
                    // InternalACMECNl.g:750:6: lv_message_5_0= RULE_STRING
                    {
                    lv_message_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_message_5_0, grammarAccess.getCNLRuleAccess().getMessageSTRINGTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCNLRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"message",
                      							lv_message_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCNLRule"


    // $ANTLR start "entryRuleGPLRule"
    // InternalACMECNl.g:771:1: entryRuleGPLRule returns [EObject current=null] : iv_ruleGPLRule= ruleGPLRule EOF ;
    public final EObject entryRuleGPLRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPLRule = null;


        try {
            // InternalACMECNl.g:771:48: (iv_ruleGPLRule= ruleGPLRule EOF )
            // InternalACMECNl.g:772:2: iv_ruleGPLRule= ruleGPLRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPLRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGPLRule=ruleGPLRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPLRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGPLRule"


    // $ANTLR start "ruleGPLRule"
    // InternalACMECNl.g:778:1: ruleGPLRule returns [EObject current=null] : this_EOLExpressionRule_0= ruleEOLExpressionRule ;
    public final EObject ruleGPLRule() throws RecognitionException {
        EObject current = null;

        EObject this_EOLExpressionRule_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:784:2: (this_EOLExpressionRule_0= ruleEOLExpressionRule )
            // InternalACMECNl.g:785:2: this_EOLExpressionRule_0= ruleEOLExpressionRule
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getGPLRuleAccess().getEOLExpressionRuleParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EOLExpressionRule_0=ruleEOLExpressionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_EOLExpressionRule_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGPLRule"


    // $ANTLR start "entryRuleEOLExpressionRule"
    // InternalACMECNl.g:799:1: entryRuleEOLExpressionRule returns [EObject current=null] : iv_ruleEOLExpressionRule= ruleEOLExpressionRule EOF ;
    public final EObject entryRuleEOLExpressionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOLExpressionRule = null;


        try {
            // InternalACMECNl.g:799:58: (iv_ruleEOLExpressionRule= ruleEOLExpressionRule EOF )
            // InternalACMECNl.g:800:2: iv_ruleEOLExpressionRule= ruleEOLExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEOLExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEOLExpressionRule=ruleEOLExpressionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEOLExpressionRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEOLExpressionRule"


    // $ANTLR start "ruleEOLExpressionRule"
    // InternalACMECNl.g:806:1: ruleEOLExpressionRule returns [EObject current=null] : ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '<EOLExpression>' ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= '</EOLExpression>' ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEOLExpressionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_message_7_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:812:2: ( ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '<EOLExpression>' ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= '</EOLExpression>' ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )? ) )
            // InternalACMECNl.g:813:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '<EOLExpression>' ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= '</EOLExpression>' ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )? )
            {
            // InternalACMECNl.g:813:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '<EOLExpression>' ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= '</EOLExpression>' ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )? )
            // InternalACMECNl.g:814:3: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '<EOLExpression>' ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= '</EOLExpression>' ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )?
            {
            // InternalACMECNl.g:814:3: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalACMECNl.g:815:4: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEOLExpressionRuleAccess().getRuleKeyword_0_0());
                      			
                    }
                    // InternalACMECNl.g:819:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalACMECNl.g:820:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalACMECNl.g:820:5: (lv_name_1_0= RULE_ID )
                    // InternalACMECNl.g:821:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getEOLExpressionRuleAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEOLExpressionRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.acme.ACMECNl.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEOLExpressionRuleAccess().getEOLExpressionKeyword_1());
              		
            }
            // InternalACMECNl.g:842:3: ( (lv_code_3_0= RULE_STRING ) )
            // InternalACMECNl.g:843:4: (lv_code_3_0= RULE_STRING )
            {
            // InternalACMECNl.g:843:4: (lv_code_3_0= RULE_STRING )
            // InternalACMECNl.g:844:5: lv_code_3_0= RULE_STRING
            {
            lv_code_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_code_3_0, grammarAccess.getEOLExpressionRuleAccess().getCodeSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEOLExpressionRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"code",
              						lv_code_3_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEOLExpressionRuleAccess().getEOLExpressionKeyword_3());
              		
            }
            // InternalACMECNl.g:864:3: ( (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalACMECNl.g:865:4: (otherlv_5= 'error' )? otherlv_6= 'message' ( (lv_message_7_0= RULE_STRING ) )
                    {
                    // InternalACMECNl.g:865:4: (otherlv_5= 'error' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalACMECNl.g:866:5: otherlv_5= 'error'
                            {
                            otherlv_5=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getEOLExpressionRuleAccess().getErrorKeyword_4_0());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEOLExpressionRuleAccess().getMessageKeyword_4_1());
                      			
                    }
                    // InternalACMECNl.g:875:4: ( (lv_message_7_0= RULE_STRING ) )
                    // InternalACMECNl.g:876:5: (lv_message_7_0= RULE_STRING )
                    {
                    // InternalACMECNl.g:876:5: (lv_message_7_0= RULE_STRING )
                    // InternalACMECNl.g:877:6: lv_message_7_0= RULE_STRING
                    {
                    lv_message_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_message_7_0, grammarAccess.getEOLExpressionRuleAccess().getMessageSTRINGTerminalRuleCall_4_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEOLExpressionRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"message",
                      							lv_message_7_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEOLExpressionRule"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalACMECNl.g:898:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalACMECNl.g:898:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalACMECNl.g:899:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalACMECNl.g:905:1: ruleLogicalExpression returns [EObject current=null] : ( (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* ) | ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) ) | ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) ) ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_lhs_10_0 = null;

        EObject lv_rhs_13_0 = null;

        EObject lv_rhs_16_0 = null;

        EObject lv_rhs_19_0 = null;

        EObject lv_rhs_26_0 = null;

        EObject lv_lhs_31_0 = null;

        EObject lv_rhs_33_0 = null;

        EObject lv_lhs_36_0 = null;

        EObject lv_rhs_38_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:911:2: ( ( (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* ) | ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) ) | ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) ) ) )
            // InternalACMECNl.g:912:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* ) | ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) ) | ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) ) )
            {
            // InternalACMECNl.g:912:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* ) | ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) ) | ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_DATE:
            case 19:
            case 46:
            case 64:
            case 73:
            case 74:
            case 79:
                {
                alt26=1;
                }
                break;
            case 38:
            case 39:
                {
                alt26=2;
                }
                break;
            case 44:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalACMECNl.g:913:3: (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* )
                    {
                    // InternalACMECNl.g:913:3: (this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )* )
                    // InternalACMECNl.g:914:4: this_ComparisonExpression_0= ruleComparisonExpression ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLogicalExpressionAccess().getComparisonExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComparisonExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalACMECNl.g:925:4: ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )*
                    loop23:
                    do {
                        int alt23=7;
                        alt23 = dfa23.predict(input);
                        switch (alt23) {
                    	case 1 :
                    	    // InternalACMECNl.g:926:5: ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:926:5: ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:927:6: () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:927:6: ()
                    	    // InternalACMECNl.g:928:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getImpliesExpressionLhsAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:937:6: (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==36) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==37) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // InternalACMECNl.g:938:7: otherlv_2= 'implies'
                    	            {
                    	            otherlv_2=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_2, grammarAccess.getLogicalExpressionAccess().getImpliesKeyword_0_1_0_1_0());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:943:7: (otherlv_3= 'only' otherlv_4= 'if' )
                    	            {
                    	            // InternalACMECNl.g:943:7: (otherlv_3= 'only' otherlv_4= 'if' )
                    	            // InternalACMECNl.g:944:8: otherlv_3= 'only' otherlv_4= 'if'
                    	            {
                    	            otherlv_3=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_3, grammarAccess.getLogicalExpressionAccess().getOnlyKeyword_0_1_0_1_1_0());
                    	              							
                    	            }
                    	            otherlv_4=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_4, grammarAccess.getLogicalExpressionAccess().getIfKeyword_0_1_0_1_1_1());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:954:6: ( (lv_rhs_5_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:955:7: (lv_rhs_5_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:955:7: (lv_rhs_5_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:956:8: lv_rhs_5_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_0_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_rhs_5_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_5_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACMECNl.g:975:5: ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:975:5: ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:976:6: () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:976:6: ()
                    	    // InternalACMECNl.g:977:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getImpliesExpressionRhsAction_0_1_1_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:986:6: (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' )
                    	    int alt21=3;
                    	    switch ( input.LA(1) ) {
                    	    case 39:
                    	        {
                    	        alt21=1;
                    	        }
                    	        break;
                    	    case 38:
                    	        {
                    	        alt21=2;
                    	        }
                    	        break;
                    	    case 29:
                    	        {
                    	        alt21=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 21, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt21) {
                    	        case 1 :
                    	            // InternalACMECNl.g:987:7: otherlv_7= 'when'
                    	            {
                    	            otherlv_7=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_7, grammarAccess.getLogicalExpressionAccess().getWhenKeyword_0_1_1_1_0());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:992:7: otherlv_8= 'if'
                    	            {
                    	            otherlv_8=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_8, grammarAccess.getLogicalExpressionAccess().getIfKeyword_0_1_1_1_1());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalACMECNl.g:997:7: otherlv_9= 'where'
                    	            {
                    	            otherlv_9=(Token)match(input,29,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getLogicalExpressionAccess().getWhereKeyword_0_1_1_1_2());
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1002:6: ( (lv_lhs_10_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:1003:7: (lv_lhs_10_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:1003:7: (lv_lhs_10_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:1004:8: lv_lhs_10_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLhsComparisonExpressionParserRuleCall_0_1_1_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_lhs_10_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"lhs",
                    	      									lv_lhs_10_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalACMECNl.g:1023:5: ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1023:5: ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:1024:6: () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1024:6: ()
                    	    // InternalACMECNl.g:1025:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getOrExpressionLhsAction_0_1_2_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_12=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_12, grammarAccess.getLogicalExpressionAccess().getOrKeyword_0_1_2_1());
                    	      					
                    	    }
                    	    // InternalACMECNl.g:1038:6: ( (lv_rhs_13_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:1039:7: (lv_rhs_13_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:1039:7: (lv_rhs_13_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:1040:8: lv_rhs_13_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_2_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_rhs_13_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_13_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalACMECNl.g:1059:5: ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1059:5: ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:1060:6: () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1060:6: ()
                    	    // InternalACMECNl.g:1061:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getXorExpressionLhsAction_0_1_3_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_15=(Token)match(input,41,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_15, grammarAccess.getLogicalExpressionAccess().getXorKeyword_0_1_3_1());
                    	      					
                    	    }
                    	    // InternalACMECNl.g:1074:6: ( (lv_rhs_16_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:1075:7: (lv_rhs_16_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:1075:7: (lv_rhs_16_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:1076:8: lv_rhs_16_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_3_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_rhs_16_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_16_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalACMECNl.g:1095:5: ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1095:5: ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:1096:6: () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1096:6: ()
                    	    // InternalACMECNl.g:1097:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getAndExpressionLhsAction_0_1_4_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_18=(Token)match(input,42,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_18, grammarAccess.getLogicalExpressionAccess().getAndKeyword_0_1_4_1());
                    	      					
                    	    }
                    	    // InternalACMECNl.g:1110:6: ( (lv_rhs_19_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:1111:7: (lv_rhs_19_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:1111:7: (lv_rhs_19_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:1112:8: lv_rhs_19_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_4_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_rhs_19_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_19_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalACMECNl.g:1131:5: ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1131:5: ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) )
                    	    // InternalACMECNl.g:1132:6: () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1132:6: ()
                    	    // InternalACMECNl.g:1133:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getLogicalExpressionAccess().getIfandonlyifExpressionLhsAction_0_1_5_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1142:6: (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==43) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==38) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1143:7: otherlv_21= 'iff'
                    	            {
                    	            otherlv_21=(Token)match(input,43,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_21, grammarAccess.getLogicalExpressionAccess().getIffKeyword_0_1_5_1_0());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1148:7: (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' )
                    	            {
                    	            // InternalACMECNl.g:1148:7: (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' )
                    	            // InternalACMECNl.g:1149:8: otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if'
                    	            {
                    	            otherlv_22=(Token)match(input,38,FOLLOW_32); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_22, grammarAccess.getLogicalExpressionAccess().getIfKeyword_0_1_5_1_1_0());
                    	              							
                    	            }
                    	            otherlv_23=(Token)match(input,42,FOLLOW_33); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_23, grammarAccess.getLogicalExpressionAccess().getAndKeyword_0_1_5_1_1_1());
                    	              							
                    	            }
                    	            otherlv_24=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_24, grammarAccess.getLogicalExpressionAccess().getOnlyKeyword_0_1_5_1_1_2());
                    	              							
                    	            }
                    	            otherlv_25=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_25, grammarAccess.getLogicalExpressionAccess().getIfKeyword_0_1_5_1_1_3());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1167:6: ( (lv_rhs_26_0= ruleComparisonExpression ) )
                    	    // InternalACMECNl.g:1168:7: (lv_rhs_26_0= ruleComparisonExpression )
                    	    {
                    	    // InternalACMECNl.g:1168:7: (lv_rhs_26_0= ruleComparisonExpression )
                    	    // InternalACMECNl.g:1169:8: lv_rhs_26_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_5_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_rhs_26_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_26_0,
                    	      									"org.eclipse.acme.ACMECNl.ComparisonExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:1190:3: ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) )
                    {
                    // InternalACMECNl.g:1190:3: ( () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) ) )
                    // InternalACMECNl.g:1191:4: () (otherlv_28= 'if' | otherlv_29= 'when' ) (otherlv_30= 'the' )? ( (lv_lhs_31_0= ruleLogicalExpression ) ) otherlv_32= 'then' ( (lv_rhs_33_0= ruleLogicalExpression ) )
                    {
                    // InternalACMECNl.g:1191:4: ()
                    // InternalACMECNl.g:1192:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicalExpressionAccess().getImpliesExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalACMECNl.g:1201:4: (otherlv_28= 'if' | otherlv_29= 'when' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==38) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==39) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalACMECNl.g:1202:5: otherlv_28= 'if'
                            {
                            otherlv_28=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_28, grammarAccess.getLogicalExpressionAccess().getIfKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:1207:5: otherlv_29= 'when'
                            {
                            otherlv_29=(Token)match(input,39,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_29, grammarAccess.getLogicalExpressionAccess().getWhenKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:1212:4: (otherlv_30= 'the' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==19) ) {
                        int LA25_1 = input.LA(2);

                        if ( (synpred40_InternalACMECNl()) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalACMECNl.g:1213:5: otherlv_30= 'the'
                            {
                            otherlv_30=(Token)match(input,19,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_30, grammarAccess.getLogicalExpressionAccess().getTheKeyword_1_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:1218:4: ( (lv_lhs_31_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:1219:5: (lv_lhs_31_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:1219:5: (lv_lhs_31_0= ruleLogicalExpression )
                    // InternalACMECNl.g:1220:6: lv_lhs_31_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLhsLogicalExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_lhs_31_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_31_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getLogicalExpressionAccess().getThenKeyword_1_4());
                      			
                    }
                    // InternalACMECNl.g:1241:4: ( (lv_rhs_33_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:1242:5: (lv_rhs_33_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:1242:5: (lv_rhs_33_0= ruleLogicalExpression )
                    // InternalACMECNl.g:1243:6: lv_rhs_33_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsLogicalExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_33_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_33_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:1262:3: ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) )
                    {
                    // InternalACMECNl.g:1262:3: ( () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) ) )
                    // InternalACMECNl.g:1263:4: () otherlv_35= 'either' ( (lv_lhs_36_0= ruleLogicalExpression ) ) otherlv_37= 'or' ( (lv_rhs_38_0= ruleLogicalExpression ) )
                    {
                    // InternalACMECNl.g:1263:4: ()
                    // InternalACMECNl.g:1264:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicalExpressionAccess().getXorExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_35=(Token)match(input,44,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getLogicalExpressionAccess().getEitherKeyword_2_1());
                      			
                    }
                    // InternalACMECNl.g:1277:4: ( (lv_lhs_36_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:1278:5: (lv_lhs_36_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:1278:5: (lv_lhs_36_0= ruleLogicalExpression )
                    // InternalACMECNl.g:1279:6: lv_lhs_36_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLhsLogicalExpressionParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_lhs_36_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_36_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getLogicalExpressionAccess().getOrKeyword_2_3());
                      			
                    }
                    // InternalACMECNl.g:1300:4: ( (lv_rhs_38_0= ruleLogicalExpression ) )
                    // InternalACMECNl.g:1301:5: (lv_rhs_38_0= ruleLogicalExpression )
                    {
                    // InternalACMECNl.g:1301:5: (lv_rhs_38_0= ruleLogicalExpression )
                    // InternalACMECNl.g:1302:6: lv_rhs_38_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsLogicalExpressionParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_38_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_38_0,
                      							"org.eclipse.acme.ACMECNl.LogicalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalACMECNl.g:1324:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalACMECNl.g:1324:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalACMECNl.g:1325:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalACMECNl.g:1331:1: ruleComparisonExpression returns [EObject current=null] : (this_DateExpression_0= ruleDateExpression | (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* ) ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        EObject this_DateExpression_0 = null;

        EObject this_ArithmeticExpression_1 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_rhs_11_0 = null;

        EObject lv_rhs_17_0 = null;

        EObject lv_rhs_24_0 = null;

        EObject lv_rhs_31_0 = null;

        EObject lv_rhs_48_0 = null;

        EObject lv_rhs_65_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:1337:2: ( (this_DateExpression_0= ruleDateExpression | (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* ) ) )
            // InternalACMECNl.g:1338:2: (this_DateExpression_0= ruleDateExpression | (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* ) )
            {
            // InternalACMECNl.g:1338:2: (this_DateExpression_0= ruleDateExpression | (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalACMECNl.g:1339:3: this_DateExpression_0= ruleDateExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getDateExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DateExpression_0=ruleDateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DateExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:1351:3: (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* )
                    {
                    // InternalACMECNl.g:1351:3: (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* )
                    // InternalACMECNl.g:1352:4: this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getArithmeticExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_ArithmeticExpression_1=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArithmeticExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalACMECNl.g:1363:4: ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )*
                    loop37:
                    do {
                        int alt37=9;
                        alt37 = dfa37.predict(input);
                        switch (alt37) {
                    	case 1 :
                    	    // InternalACMECNl.g:1364:5: ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) )
                    	    {
                    	    // InternalACMECNl.g:1364:5: ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) )
                    	    // InternalACMECNl.g:1365:6: () ( (lv_rhs_3_0= ruleExistanceValue ) )
                    	    {
                    	    // InternalACMECNl.g:1365:6: ()
                    	    // InternalACMECNl.g:1366:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getEqualityExpressionLhsAction_1_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1375:6: ( (lv_rhs_3_0= ruleExistanceValue ) )
                    	    // InternalACMECNl.g:1376:7: (lv_rhs_3_0= ruleExistanceValue )
                    	    {
                    	    // InternalACMECNl.g:1376:7: (lv_rhs_3_0= ruleExistanceValue )
                    	    // InternalACMECNl.g:1377:8: lv_rhs_3_0= ruleExistanceValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsExistanceValueParserRuleCall_1_1_0_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_3_0=ruleExistanceValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_3_0,
                    	      									"org.eclipse.acme.ACMECNl.ExistanceValue");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACMECNl.g:1396:5: ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) )
                    	    {
                    	    // InternalACMECNl.g:1396:5: ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) )
                    	    // InternalACMECNl.g:1397:6: () ( (lv_rhs_5_0= ruleEmptyValue ) )
                    	    {
                    	    // InternalACMECNl.g:1397:6: ()
                    	    // InternalACMECNl.g:1398:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getNegatedEqualityExpressionLhsAction_1_1_1_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1407:6: ( (lv_rhs_5_0= ruleEmptyValue ) )
                    	    // InternalACMECNl.g:1408:7: (lv_rhs_5_0= ruleEmptyValue )
                    	    {
                    	    // InternalACMECNl.g:1408:7: (lv_rhs_5_0= ruleEmptyValue )
                    	    // InternalACMECNl.g:1409:8: lv_rhs_5_0= ruleEmptyValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsEmptyValueParserRuleCall_1_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_5_0=ruleEmptyValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_5_0,
                    	      									"org.eclipse.acme.ACMECNl.EmptyValue");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalACMECNl.g:1428:5: ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1428:5: ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1429:6: () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1429:6: ()
                    	    // InternalACMECNl.g:1430:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getEqualityExpressionLhsAction_1_1_2_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1439:6: (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) )
                    	    int alt27=3;
                    	    switch ( input.LA(1) ) {
                    	    case 45:
                    	        {
                    	        alt27=1;
                    	        }
                    	        break;
                    	    case 26:
                    	        {
                    	        alt27=2;
                    	        }
                    	        break;
                    	    case 46:
                    	        {
                    	        alt27=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1440:7: otherlv_7= 'equals'
                    	            {
                    	            otherlv_7=(Token)match(input,45,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_7, grammarAccess.getComparisonExpressionAccess().getEqualsKeyword_1_1_2_1_0());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1445:7: otherlv_8= 'is'
                    	            {
                    	            otherlv_8=(Token)match(input,26,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_8, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_2_1_1());
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalACMECNl.g:1450:7: (otherlv_9= 'must' otherlv_10= 'be' )
                    	            {
                    	            // InternalACMECNl.g:1450:7: (otherlv_9= 'must' otherlv_10= 'be' )
                    	            // InternalACMECNl.g:1451:8: otherlv_9= 'must' otherlv_10= 'be'
                    	            {
                    	            otherlv_9=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_9, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_2_1_2_0());
                    	              							
                    	            }
                    	            otherlv_10=(Token)match(input,47,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_10, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_2_1_2_1());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1461:6: ( (lv_rhs_11_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1462:7: (lv_rhs_11_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1462:7: (lv_rhs_11_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1463:8: lv_rhs_11_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_2_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_11_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_11_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalACMECNl.g:1482:5: ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1482:5: ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1483:6: () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1483:6: ()
                    	    // InternalACMECNl.g:1484:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getNegatedEqualityExpressionLhsAction_1_1_3_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1493:6: ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==26) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( (LA28_0==49) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1494:7: (otherlv_13= 'is' otherlv_14= 'not' )
                    	            {
                    	            // InternalACMECNl.g:1494:7: (otherlv_13= 'is' otherlv_14= 'not' )
                    	            // InternalACMECNl.g:1495:8: otherlv_13= 'is' otherlv_14= 'not'
                    	            {
                    	            otherlv_13=(Token)match(input,26,FOLLOW_38); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_13, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_3_1_0_0());
                    	              							
                    	            }
                    	            otherlv_14=(Token)match(input,48,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_14, grammarAccess.getComparisonExpressionAccess().getNotKeyword_1_1_3_1_0_1());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1505:7: (otherlv_15= 'cannot' otherlv_16= 'be' )
                    	            {
                    	            // InternalACMECNl.g:1505:7: (otherlv_15= 'cannot' otherlv_16= 'be' )
                    	            // InternalACMECNl.g:1506:8: otherlv_15= 'cannot' otherlv_16= 'be'
                    	            {
                    	            otherlv_15=(Token)match(input,49,FOLLOW_37); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_15, grammarAccess.getComparisonExpressionAccess().getCannotKeyword_1_1_3_1_1_0());
                    	              							
                    	            }
                    	            otherlv_16=(Token)match(input,47,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_16, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_3_1_1_1());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1516:6: ( (lv_rhs_17_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1517:7: (lv_rhs_17_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1517:7: (lv_rhs_17_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1518:8: lv_rhs_17_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_3_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_17_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_17_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalACMECNl.g:1537:5: ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1537:5: ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1538:6: () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1538:6: ()
                    	    // InternalACMECNl.g:1539:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getGreaterThanExpressionLhsAction_1_1_4_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1548:6: ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' )
                    	    // InternalACMECNl.g:1549:7: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than'
                    	    {
                    	    // InternalACMECNl.g:1549:7: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==46) ) {
                    	        alt29=1;
                    	    }
                    	    else if ( (LA29_0==26) ) {
                    	        alt29=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 29, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1550:8: (otherlv_19= 'must' otherlv_20= 'be' )
                    	            {
                    	            // InternalACMECNl.g:1550:8: (otherlv_19= 'must' otherlv_20= 'be' )
                    	            // InternalACMECNl.g:1551:9: otherlv_19= 'must' otherlv_20= 'be'
                    	            {
                    	            otherlv_19=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									newLeafNode(otherlv_19, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_4_1_0_0_0());
                    	              								
                    	            }
                    	            otherlv_20=(Token)match(input,47,FOLLOW_39); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									newLeafNode(otherlv_20, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_4_1_0_0_1());
                    	              								
                    	            }

                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1561:8: otherlv_21= 'is'
                    	            {
                    	            otherlv_21=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_21, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_4_1_0_1());
                    	              							
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_22=(Token)match(input,50,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_22, grammarAccess.getComparisonExpressionAccess().getGreaterKeyword_1_1_4_1_1());
                    	      						
                    	    }
                    	    otherlv_23=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_23, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_4_1_2());
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1575:6: ( (lv_rhs_24_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1576:7: (lv_rhs_24_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1576:7: (lv_rhs_24_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1577:8: lv_rhs_24_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_4_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_24_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_24_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalACMECNl.g:1596:5: ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1596:5: ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1597:6: () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1597:6: ()
                    	    // InternalACMECNl.g:1598:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getLessThanExpressionLhsAction_1_1_5_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1607:6: ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' )
                    	    // InternalACMECNl.g:1608:7: ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than'
                    	    {
                    	    // InternalACMECNl.g:1608:7: ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' )
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( (LA30_0==46) ) {
                    	        alt30=1;
                    	    }
                    	    else if ( (LA30_0==26) ) {
                    	        alt30=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 30, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1609:8: (otherlv_26= 'must' otherlv_27= 'be' )
                    	            {
                    	            // InternalACMECNl.g:1609:8: (otherlv_26= 'must' otherlv_27= 'be' )
                    	            // InternalACMECNl.g:1610:9: otherlv_26= 'must' otherlv_27= 'be'
                    	            {
                    	            otherlv_26=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									newLeafNode(otherlv_26, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_5_1_0_0_0());
                    	              								
                    	            }
                    	            otherlv_27=(Token)match(input,47,FOLLOW_41); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									newLeafNode(otherlv_27, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_5_1_0_0_1());
                    	              								
                    	            }

                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1620:8: otherlv_28= 'is'
                    	            {
                    	            otherlv_28=(Token)match(input,26,FOLLOW_41); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_28, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_5_1_0_1());
                    	              							
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_29=(Token)match(input,52,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_29, grammarAccess.getComparisonExpressionAccess().getLessKeyword_1_1_5_1_1());
                    	      						
                    	    }
                    	    otherlv_30=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_30, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_5_1_2());
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1634:6: ( (lv_rhs_31_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1635:7: (lv_rhs_31_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1635:7: (lv_rhs_31_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1636:8: lv_rhs_31_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_5_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_31_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_31_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalACMECNl.g:1655:5: ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1655:5: ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1656:6: () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1656:6: ()
                    	    // InternalACMECNl.g:1657:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getGTEExpressionLhsAction_1_1_6_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1666:6: ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) )
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==46) ) {
                    	        int LA33_1 = input.LA(2);

                    	        if ( (LA33_1==47) ) {
                    	            int LA33_3 = input.LA(3);

                    	            if ( (LA33_3==50) ) {
                    	                int LA33_4 = input.LA(4);

                    	                if ( (LA33_4==51) ) {
                    	                    int LA33_5 = input.LA(5);

                    	                    if ( (LA33_5==40) ) {
                    	                        int LA33_6 = input.LA(6);

                    	                        if ( (LA33_6==45) ) {
                    	                            alt33=2;
                    	                        }
                    	                        else if ( (LA33_6==53) ) {
                    	                            alt33=1;
                    	                        }
                    	                        else {
                    	                            if (state.backtracking>0) {state.failed=true; return current;}
                    	                            NoViableAltException nvae =
                    	                                new NoViableAltException("", 33, 6, input);

                    	                            throw nvae;
                    	                        }
                    	                    }
                    	                    else {
                    	                        if (state.backtracking>0) {state.failed=true; return current;}
                    	                        NoViableAltException nvae =
                    	                            new NoViableAltException("", 33, 5, input);

                    	                        throw nvae;
                    	                    }
                    	                }
                    	                else {
                    	                    if (state.backtracking>0) {state.failed=true; return current;}
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 33, 4, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 33, 3, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 33, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA33_0==26) ) {
                    	        int LA33_2 = input.LA(2);

                    	        if ( (LA33_2==50) ) {
                    	            int LA33_4 = input.LA(3);

                    	            if ( (LA33_4==51) ) {
                    	                int LA33_5 = input.LA(4);

                    	                if ( (LA33_5==40) ) {
                    	                    int LA33_6 = input.LA(5);

                    	                    if ( (LA33_6==45) ) {
                    	                        alt33=2;
                    	                    }
                    	                    else if ( (LA33_6==53) ) {
                    	                        alt33=1;
                    	                    }
                    	                    else {
                    	                        if (state.backtracking>0) {state.failed=true; return current;}
                    	                        NoViableAltException nvae =
                    	                            new NoViableAltException("", 33, 6, input);

                    	                        throw nvae;
                    	                    }
                    	                }
                    	                else {
                    	                    if (state.backtracking>0) {state.failed=true; return current;}
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 33, 5, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 33, 4, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 33, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 33, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1667:7: ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' )
                    	            {
                    	            // InternalACMECNl.g:1667:7: ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' )
                    	            // InternalACMECNl.g:1668:8: ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to'
                    	            {
                    	            // InternalACMECNl.g:1668:8: ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' )
                    	            int alt31=2;
                    	            int LA31_0 = input.LA(1);

                    	            if ( (LA31_0==46) ) {
                    	                alt31=1;
                    	            }
                    	            else if ( (LA31_0==26) ) {
                    	                alt31=2;
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 31, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt31) {
                    	                case 1 :
                    	                    // InternalACMECNl.g:1669:9: (otherlv_33= 'must' otherlv_34= 'be' )
                    	                    {
                    	                    // InternalACMECNl.g:1669:9: (otherlv_33= 'must' otherlv_34= 'be' )
                    	                    // InternalACMECNl.g:1670:10: otherlv_33= 'must' otherlv_34= 'be'
                    	                    {
                    	                    otherlv_33=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_33, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_6_1_0_0_0_0());
                    	                      									
                    	                    }
                    	                    otherlv_34=(Token)match(input,47,FOLLOW_39); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_34, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_6_1_0_0_0_1());
                    	                      									
                    	                    }

                    	                    }


                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalACMECNl.g:1680:9: otherlv_35= 'is'
                    	                    {
                    	                    otherlv_35=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      									newLeafNode(otherlv_35, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_6_1_0_0_1());
                    	                      								
                    	                    }

                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_36=(Token)match(input,50,FOLLOW_40); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_36, grammarAccess.getComparisonExpressionAccess().getGreaterKeyword_1_1_6_1_0_1());
                    	              							
                    	            }
                    	            otherlv_37=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_37, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_6_1_0_2());
                    	              							
                    	            }
                    	            otherlv_38=(Token)match(input,40,FOLLOW_42); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_38, grammarAccess.getComparisonExpressionAccess().getOrKeyword_1_1_6_1_0_3());
                    	              							
                    	            }
                    	            otherlv_39=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_39, grammarAccess.getComparisonExpressionAccess().getEqualKeyword_1_1_6_1_0_4());
                    	              							
                    	            }
                    	            otherlv_40=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_40, grammarAccess.getComparisonExpressionAccess().getToKeyword_1_1_6_1_0_5());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1707:7: ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' )
                    	            {
                    	            // InternalACMECNl.g:1707:7: ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' )
                    	            // InternalACMECNl.g:1708:8: ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals'
                    	            {
                    	            // InternalACMECNl.g:1708:8: ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' )
                    	            int alt32=2;
                    	            int LA32_0 = input.LA(1);

                    	            if ( (LA32_0==46) ) {
                    	                alt32=1;
                    	            }
                    	            else if ( (LA32_0==26) ) {
                    	                alt32=2;
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 32, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt32) {
                    	                case 1 :
                    	                    // InternalACMECNl.g:1709:9: (otherlv_41= 'must' otherlv_42= 'be' )
                    	                    {
                    	                    // InternalACMECNl.g:1709:9: (otherlv_41= 'must' otherlv_42= 'be' )
                    	                    // InternalACMECNl.g:1710:10: otherlv_41= 'must' otherlv_42= 'be'
                    	                    {
                    	                    otherlv_41=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_41, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_6_1_1_0_0_0());
                    	                      									
                    	                    }
                    	                    otherlv_42=(Token)match(input,47,FOLLOW_39); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_42, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_6_1_1_0_0_1());
                    	                      									
                    	                    }

                    	                    }


                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalACMECNl.g:1720:9: otherlv_43= 'is'
                    	                    {
                    	                    otherlv_43=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      									newLeafNode(otherlv_43, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_6_1_1_0_1());
                    	                      								
                    	                    }

                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_44=(Token)match(input,50,FOLLOW_40); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_44, grammarAccess.getComparisonExpressionAccess().getGreaterKeyword_1_1_6_1_1_1());
                    	              							
                    	            }
                    	            otherlv_45=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_45, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_6_1_1_2());
                    	              							
                    	            }
                    	            otherlv_46=(Token)match(input,40,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_46, grammarAccess.getComparisonExpressionAccess().getOrKeyword_1_1_6_1_1_3());
                    	              							
                    	            }
                    	            otherlv_47=(Token)match(input,45,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_47, grammarAccess.getComparisonExpressionAccess().getEqualsKeyword_1_1_6_1_1_4());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1743:6: ( (lv_rhs_48_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1744:7: (lv_rhs_48_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1744:7: (lv_rhs_48_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1745:8: lv_rhs_48_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_6_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_48_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_48_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalACMECNl.g:1764:5: ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) )
                    	    {
                    	    // InternalACMECNl.g:1764:5: ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) )
                    	    // InternalACMECNl.g:1765:6: () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) )
                    	    {
                    	    // InternalACMECNl.g:1765:6: ()
                    	    // InternalACMECNl.g:1766:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getComparisonExpressionAccess().getLTEExpressionLhsAction_1_1_7_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    // InternalACMECNl.g:1775:6: ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) )
                    	    int alt36=2;
                    	    int LA36_0 = input.LA(1);

                    	    if ( (LA36_0==46) ) {
                    	        int LA36_1 = input.LA(2);

                    	        if ( (LA36_1==47) ) {
                    	            int LA36_3 = input.LA(3);

                    	            if ( (LA36_3==52) ) {
                    	                int LA36_4 = input.LA(4);

                    	                if ( (LA36_4==51) ) {
                    	                    int LA36_5 = input.LA(5);

                    	                    if ( (LA36_5==40) ) {
                    	                        int LA36_6 = input.LA(6);

                    	                        if ( (LA36_6==45) ) {
                    	                            alt36=2;
                    	                        }
                    	                        else if ( (LA36_6==53) ) {
                    	                            alt36=1;
                    	                        }
                    	                        else {
                    	                            if (state.backtracking>0) {state.failed=true; return current;}
                    	                            NoViableAltException nvae =
                    	                                new NoViableAltException("", 36, 6, input);

                    	                            throw nvae;
                    	                        }
                    	                    }
                    	                    else {
                    	                        if (state.backtracking>0) {state.failed=true; return current;}
                    	                        NoViableAltException nvae =
                    	                            new NoViableAltException("", 36, 5, input);

                    	                        throw nvae;
                    	                    }
                    	                }
                    	                else {
                    	                    if (state.backtracking>0) {state.failed=true; return current;}
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 36, 4, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 36, 3, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 36, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA36_0==26) ) {
                    	        int LA36_2 = input.LA(2);

                    	        if ( (LA36_2==52) ) {
                    	            int LA36_4 = input.LA(3);

                    	            if ( (LA36_4==51) ) {
                    	                int LA36_5 = input.LA(4);

                    	                if ( (LA36_5==40) ) {
                    	                    int LA36_6 = input.LA(5);

                    	                    if ( (LA36_6==45) ) {
                    	                        alt36=2;
                    	                    }
                    	                    else if ( (LA36_6==53) ) {
                    	                        alt36=1;
                    	                    }
                    	                    else {
                    	                        if (state.backtracking>0) {state.failed=true; return current;}
                    	                        NoViableAltException nvae =
                    	                            new NoViableAltException("", 36, 6, input);

                    	                        throw nvae;
                    	                    }
                    	                }
                    	                else {
                    	                    if (state.backtracking>0) {state.failed=true; return current;}
                    	                    NoViableAltException nvae =
                    	                        new NoViableAltException("", 36, 5, input);

                    	                    throw nvae;
                    	                }
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 36, 4, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 36, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 36, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt36) {
                    	        case 1 :
                    	            // InternalACMECNl.g:1776:7: ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' )
                    	            {
                    	            // InternalACMECNl.g:1776:7: ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' )
                    	            // InternalACMECNl.g:1777:8: ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to'
                    	            {
                    	            // InternalACMECNl.g:1777:8: ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' )
                    	            int alt34=2;
                    	            int LA34_0 = input.LA(1);

                    	            if ( (LA34_0==46) ) {
                    	                alt34=1;
                    	            }
                    	            else if ( (LA34_0==26) ) {
                    	                alt34=2;
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 34, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt34) {
                    	                case 1 :
                    	                    // InternalACMECNl.g:1778:9: (otherlv_50= 'must' otherlv_51= 'be' )
                    	                    {
                    	                    // InternalACMECNl.g:1778:9: (otherlv_50= 'must' otherlv_51= 'be' )
                    	                    // InternalACMECNl.g:1779:10: otherlv_50= 'must' otherlv_51= 'be'
                    	                    {
                    	                    otherlv_50=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_50, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_7_1_0_0_0_0());
                    	                      									
                    	                    }
                    	                    otherlv_51=(Token)match(input,47,FOLLOW_41); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_51, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_7_1_0_0_0_1());
                    	                      									
                    	                    }

                    	                    }


                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalACMECNl.g:1789:9: otherlv_52= 'is'
                    	                    {
                    	                    otherlv_52=(Token)match(input,26,FOLLOW_41); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      									newLeafNode(otherlv_52, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_7_1_0_0_1());
                    	                      								
                    	                    }

                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_53=(Token)match(input,52,FOLLOW_40); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_53, grammarAccess.getComparisonExpressionAccess().getLessKeyword_1_1_7_1_0_1());
                    	              							
                    	            }
                    	            otherlv_54=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_54, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_7_1_0_2());
                    	              							
                    	            }
                    	            otherlv_55=(Token)match(input,40,FOLLOW_42); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_55, grammarAccess.getComparisonExpressionAccess().getOrKeyword_1_1_7_1_0_3());
                    	              							
                    	            }
                    	            otherlv_56=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_56, grammarAccess.getComparisonExpressionAccess().getEqualKeyword_1_1_7_1_0_4());
                    	              							
                    	            }
                    	            otherlv_57=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_57, grammarAccess.getComparisonExpressionAccess().getToKeyword_1_1_7_1_0_5());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalACMECNl.g:1816:7: ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' )
                    	            {
                    	            // InternalACMECNl.g:1816:7: ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' )
                    	            // InternalACMECNl.g:1817:8: ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals'
                    	            {
                    	            // InternalACMECNl.g:1817:8: ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' )
                    	            int alt35=2;
                    	            int LA35_0 = input.LA(1);

                    	            if ( (LA35_0==46) ) {
                    	                alt35=1;
                    	            }
                    	            else if ( (LA35_0==26) ) {
                    	                alt35=2;
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 35, 0, input);

                    	                throw nvae;
                    	            }
                    	            switch (alt35) {
                    	                case 1 :
                    	                    // InternalACMECNl.g:1818:9: (otherlv_58= 'must' otherlv_59= 'be' )
                    	                    {
                    	                    // InternalACMECNl.g:1818:9: (otherlv_58= 'must' otherlv_59= 'be' )
                    	                    // InternalACMECNl.g:1819:10: otherlv_58= 'must' otherlv_59= 'be'
                    	                    {
                    	                    otherlv_58=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_58, grammarAccess.getComparisonExpressionAccess().getMustKeyword_1_1_7_1_1_0_0_0());
                    	                      									
                    	                    }
                    	                    otherlv_59=(Token)match(input,47,FOLLOW_41); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      										newLeafNode(otherlv_59, grammarAccess.getComparisonExpressionAccess().getBeKeyword_1_1_7_1_1_0_0_1());
                    	                      									
                    	                    }

                    	                    }


                    	                    }
                    	                    break;
                    	                case 2 :
                    	                    // InternalACMECNl.g:1829:9: otherlv_60= 'is'
                    	                    {
                    	                    otherlv_60=(Token)match(input,26,FOLLOW_41); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      									newLeafNode(otherlv_60, grammarAccess.getComparisonExpressionAccess().getIsKeyword_1_1_7_1_1_0_1());
                    	                      								
                    	                    }

                    	                    }
                    	                    break;

                    	            }

                    	            otherlv_61=(Token)match(input,52,FOLLOW_40); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_61, grammarAccess.getComparisonExpressionAccess().getLessKeyword_1_1_7_1_1_1());
                    	              							
                    	            }
                    	            otherlv_62=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_62, grammarAccess.getComparisonExpressionAccess().getThanKeyword_1_1_7_1_1_2());
                    	              							
                    	            }
                    	            otherlv_63=(Token)match(input,40,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_63, grammarAccess.getComparisonExpressionAccess().getOrKeyword_1_1_7_1_1_3());
                    	              							
                    	            }
                    	            otherlv_64=(Token)match(input,45,FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(otherlv_64, grammarAccess.getComparisonExpressionAccess().getEqualsKeyword_1_1_7_1_1_4());
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalACMECNl.g:1852:6: ( (lv_rhs_65_0= ruleArithmeticExpression ) )
                    	    // InternalACMECNl.g:1853:7: (lv_rhs_65_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalACMECNl.g:1853:7: (lv_rhs_65_0= ruleArithmeticExpression )
                    	    // InternalACMECNl.g:1854:8: lv_rhs_65_0= ruleArithmeticExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_7_2_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_rhs_65_0=ruleArithmeticExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	      								}
                    	      								set(
                    	      									current,
                    	      									"rhs",
                    	      									lv_rhs_65_0,
                    	      									"org.eclipse.acme.ACMECNl.ArithmeticExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalACMECNl.g:1878:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalACMECNl.g:1878:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalACMECNl.g:1879:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalACMECNl.g:1885:1: ruleArithmeticExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BaseExpression_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:1891:2: ( (this_BaseExpression_0= ruleBaseExpression ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )* ) )
            // InternalACMECNl.g:1892:2: (this_BaseExpression_0= ruleBaseExpression ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )* )
            {
            // InternalACMECNl.g:1892:2: (this_BaseExpression_0= ruleBaseExpression ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )* )
            // InternalACMECNl.g:1893:3: this_BaseExpression_0= ruleBaseExpression ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getBaseExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BaseExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalACMECNl.g:1904:3: ( () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=82 && LA39_0<=85)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalACMECNl.g:1905:4: () ( (lv_type_2_0= ruleArithmeticOperations ) ) ( (lv_rhs_3_0= ruleBaseExpression ) )
            	    {
            	    // InternalACMECNl.g:1905:4: ()
            	    // InternalACMECNl.g:1906:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalACMECNl.g:1915:4: ( (lv_type_2_0= ruleArithmeticOperations ) )
            	    // InternalACMECNl.g:1916:5: (lv_type_2_0= ruleArithmeticOperations )
            	    {
            	    // InternalACMECNl.g:1916:5: (lv_type_2_0= ruleArithmeticOperations )
            	    // InternalACMECNl.g:1917:6: lv_type_2_0= ruleArithmeticOperations
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTypeArithmeticOperationsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_type_2_0=ruleArithmeticOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"type",
            	      							lv_type_2_0,
            	      							"org.eclipse.acme.ACMECNl.ArithmeticOperations");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalACMECNl.g:1934:4: ( (lv_rhs_3_0= ruleBaseExpression ) )
            	    // InternalACMECNl.g:1935:5: (lv_rhs_3_0= ruleBaseExpression )
            	    {
            	    // InternalACMECNl.g:1935:5: (lv_rhs_3_0= ruleBaseExpression )
            	    // InternalACMECNl.g:1936:6: lv_rhs_3_0= ruleBaseExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRhsBaseExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_rhs_3_0=ruleBaseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"org.eclipse.acme.ACMECNl.BaseExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalACMECNl.g:1958:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalACMECNl.g:1958:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalACMECNl.g:1959:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalACMECNl.g:1965:1: ruleBaseExpression returns [EObject current=null] : (this_TypeExpression_0= ruleTypeExpression | this_EmptyValue_1= ruleEmptyValue | this_StringValue_2= ruleStringValue | this_EnumValue_3= ruleEnumValue | this_FeatureValue_4= ruleFeatureValue | this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue | this_VariableFeatureValue_6= ruleVariableFeatureValue | this_IntegerValue_7= ruleIntegerValue | this_DecimalValue_8= ruleDecimalValue | this_DateValue_9= ruleDateValue | this_NumericAggregation_10= ruleNumericAggregation | this_BooleanValue_11= ruleBooleanValue | this_UniquenessCheck_12= ruleUniquenessCheck | this_ValueContainment_13= ruleValueContainment ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpression_0 = null;

        EObject this_EmptyValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_EnumValue_3 = null;

        EObject this_FeatureValue_4 = null;

        EObject this_UnscopedFeatureValue_5 = null;

        EObject this_VariableFeatureValue_6 = null;

        EObject this_IntegerValue_7 = null;

        EObject this_DecimalValue_8 = null;

        EObject this_DateValue_9 = null;

        EObject this_NumericAggregation_10 = null;

        EObject this_BooleanValue_11 = null;

        EObject this_UniquenessCheck_12 = null;

        EObject this_ValueContainment_13 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:1971:2: ( (this_TypeExpression_0= ruleTypeExpression | this_EmptyValue_1= ruleEmptyValue | this_StringValue_2= ruleStringValue | this_EnumValue_3= ruleEnumValue | this_FeatureValue_4= ruleFeatureValue | this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue | this_VariableFeatureValue_6= ruleVariableFeatureValue | this_IntegerValue_7= ruleIntegerValue | this_DecimalValue_8= ruleDecimalValue | this_DateValue_9= ruleDateValue | this_NumericAggregation_10= ruleNumericAggregation | this_BooleanValue_11= ruleBooleanValue | this_UniquenessCheck_12= ruleUniquenessCheck | this_ValueContainment_13= ruleValueContainment ) )
            // InternalACMECNl.g:1972:2: (this_TypeExpression_0= ruleTypeExpression | this_EmptyValue_1= ruleEmptyValue | this_StringValue_2= ruleStringValue | this_EnumValue_3= ruleEnumValue | this_FeatureValue_4= ruleFeatureValue | this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue | this_VariableFeatureValue_6= ruleVariableFeatureValue | this_IntegerValue_7= ruleIntegerValue | this_DecimalValue_8= ruleDecimalValue | this_DateValue_9= ruleDateValue | this_NumericAggregation_10= ruleNumericAggregation | this_BooleanValue_11= ruleBooleanValue | this_UniquenessCheck_12= ruleUniquenessCheck | this_ValueContainment_13= ruleValueContainment )
            {
            // InternalACMECNl.g:1972:2: (this_TypeExpression_0= ruleTypeExpression | this_EmptyValue_1= ruleEmptyValue | this_StringValue_2= ruleStringValue | this_EnumValue_3= ruleEnumValue | this_FeatureValue_4= ruleFeatureValue | this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue | this_VariableFeatureValue_6= ruleVariableFeatureValue | this_IntegerValue_7= ruleIntegerValue | this_DecimalValue_8= ruleDecimalValue | this_DateValue_9= ruleDateValue | this_NumericAggregation_10= ruleNumericAggregation | this_BooleanValue_11= ruleBooleanValue | this_UniquenessCheck_12= ruleUniquenessCheck | this_ValueContainment_13= ruleValueContainment )
            int alt40=14;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalACMECNl.g:1973:3: this_TypeExpression_0= ruleTypeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getTypeExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeExpression_0=ruleTypeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:1985:3: this_EmptyValue_1= ruleEmptyValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getEmptyValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EmptyValue_1=ruleEmptyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EmptyValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:1997:3: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalACMECNl.g:2009:3: this_EnumValue_3= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getEnumValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumValue_3=ruleEnumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalACMECNl.g:2021:3: this_FeatureValue_4= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getFeatureValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureValue_4=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FeatureValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalACMECNl.g:2033:3: this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getUnscopedFeatureValueParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnscopedFeatureValue_5=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnscopedFeatureValue_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalACMECNl.g:2045:3: this_VariableFeatureValue_6= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getVariableFeatureValueParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableFeatureValue_6=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableFeatureValue_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalACMECNl.g:2057:3: this_IntegerValue_7= ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getIntegerValueParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_7=ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValue_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalACMECNl.g:2069:3: this_DecimalValue_8= ruleDecimalValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getDecimalValueParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecimalValue_8=ruleDecimalValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValue_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalACMECNl.g:2081:3: this_DateValue_9= ruleDateValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getDateValueParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DateValue_9=ruleDateValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DateValue_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalACMECNl.g:2093:3: this_NumericAggregation_10= ruleNumericAggregation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNumericAggregationParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericAggregation_10=ruleNumericAggregation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericAggregation_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalACMECNl.g:2105:3: this_BooleanValue_11= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getBooleanValueParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_11=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalACMECNl.g:2117:3: this_UniquenessCheck_12= ruleUniquenessCheck
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getUniquenessCheckParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UniquenessCheck_12=ruleUniquenessCheck();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UniquenessCheck_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalACMECNl.g:2129:3: this_ValueContainment_13= ruleValueContainment
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getValueContainmentParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValueContainment_13=ruleValueContainment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValueContainment_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleDateExpression"
    // InternalACMECNl.g:2144:1: entryRuleDateExpression returns [EObject current=null] : iv_ruleDateExpression= ruleDateExpression EOF ;
    public final EObject entryRuleDateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateExpression = null;


        try {
            // InternalACMECNl.g:2144:55: (iv_ruleDateExpression= ruleDateExpression EOF )
            // InternalACMECNl.g:2145:2: iv_ruleDateExpression= ruleDateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateExpression=ruleDateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDateExpression"


    // $ANTLR start "ruleDateExpression"
    // InternalACMECNl.g:2151:1: ruleDateExpression returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) ) ) ;
    public final EObject ruleDateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_7_0 = null;

        EObject lv_lhs_9_0 = null;

        EObject lv_rhs_16_0 = null;

        EObject lv_lhs_18_0 = null;

        EObject lv_rhs_32_0 = null;

        EObject lv_lhs_34_0 = null;

        EObject lv_rhs_48_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2157:2: ( ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) ) ) )
            // InternalACMECNl.g:2158:2: ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) ) )
            {
            // InternalACMECNl.g:2158:2: ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) ) )
            int alt49=4;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalACMECNl.g:2159:3: ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) )
                    {
                    // InternalACMECNl.g:2159:3: ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) )
                    // InternalACMECNl.g:2160:4: () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) )
                    {
                    // InternalACMECNl.g:2160:4: ()
                    // InternalACMECNl.g:2161:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDateExpressionAccess().getBeforeDateExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalACMECNl.g:2170:4: ( (lv_lhs_1_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2171:5: (lv_lhs_1_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2171:5: (lv_lhs_1_0= ruleBaseExpression )
                    // InternalACMECNl.g:2172:6: lv_lhs_1_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_lhs_1_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_1_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalACMECNl.g:2189:4: ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) )
                    // InternalACMECNl.g:2190:5: ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' )
                    {
                    // InternalACMECNl.g:2190:5: ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )?
                    int alt41=3;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==46) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==26) ) {
                        alt41=2;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalACMECNl.g:2191:6: (otherlv_2= 'must' otherlv_3= 'be' )
                            {
                            // InternalACMECNl.g:2191:6: (otherlv_2= 'must' otherlv_3= 'be' )
                            // InternalACMECNl.g:2192:7: otherlv_2= 'must' otherlv_3= 'be'
                            {
                            otherlv_2=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getDateExpressionAccess().getMustKeyword_0_2_0_0_0());
                              						
                            }
                            otherlv_3=(Token)match(input,47,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getDateExpressionAccess().getBeKeyword_0_2_0_0_1());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2202:6: otherlv_4= 'is'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getDateExpressionAccess().getIsKeyword_0_2_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:2207:5: (otherlv_5= 'before' | otherlv_6= 'by' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==55) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==56) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalACMECNl.g:2208:6: otherlv_5= 'before'
                            {
                            otherlv_5=(Token)match(input,55,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getDateExpressionAccess().getBeforeKeyword_0_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2213:6: otherlv_6= 'by'
                            {
                            otherlv_6=(Token)match(input,56,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDateExpressionAccess().getByKeyword_0_2_1_1());
                              					
                            }

                            }
                            break;

                    }


                    }

                    // InternalACMECNl.g:2219:4: ( (lv_rhs_7_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2220:5: (lv_rhs_7_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2220:5: (lv_rhs_7_0= ruleBaseExpression )
                    // InternalACMECNl.g:2221:6: lv_rhs_7_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_7_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_7_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2240:3: ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) )
                    {
                    // InternalACMECNl.g:2240:3: ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) )
                    // InternalACMECNl.g:2241:4: () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) )
                    {
                    // InternalACMECNl.g:2241:4: ()
                    // InternalACMECNl.g:2242:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDateExpressionAccess().getAfterDateExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalACMECNl.g:2251:4: ( (lv_lhs_9_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2252:5: (lv_lhs_9_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2252:5: (lv_lhs_9_0= ruleBaseExpression )
                    // InternalACMECNl.g:2253:6: lv_lhs_9_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_lhs_9_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_9_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalACMECNl.g:2270:4: ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) )
                    // InternalACMECNl.g:2271:5: ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) )
                    {
                    // InternalACMECNl.g:2271:5: ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==46) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==26) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalACMECNl.g:2272:6: (otherlv_10= 'must' otherlv_11= 'be' )
                            {
                            // InternalACMECNl.g:2272:6: (otherlv_10= 'must' otherlv_11= 'be' )
                            // InternalACMECNl.g:2273:7: otherlv_10= 'must' otherlv_11= 'be'
                            {
                            otherlv_10=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_10, grammarAccess.getDateExpressionAccess().getMustKeyword_1_2_0_0_0());
                              						
                            }
                            otherlv_11=(Token)match(input,47,FOLLOW_49); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_11, grammarAccess.getDateExpressionAccess().getBeKeyword_1_2_0_0_1());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2283:6: otherlv_12= 'is'
                            {
                            otherlv_12=(Token)match(input,26,FOLLOW_49); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getDateExpressionAccess().getIsKeyword_1_2_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:2288:5: (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==57) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==58) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalACMECNl.g:2289:6: otherlv_13= 'after'
                            {
                            otherlv_13=(Token)match(input,57,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_13, grammarAccess.getDateExpressionAccess().getAfterKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2294:6: (otherlv_14= 'later' otherlv_15= 'than' )
                            {
                            // InternalACMECNl.g:2294:6: (otherlv_14= 'later' otherlv_15= 'than' )
                            // InternalACMECNl.g:2295:7: otherlv_14= 'later' otherlv_15= 'than'
                            {
                            otherlv_14=(Token)match(input,58,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_14, grammarAccess.getDateExpressionAccess().getLaterKeyword_1_2_1_1_0());
                              						
                            }
                            otherlv_15=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_15, grammarAccess.getDateExpressionAccess().getThanKeyword_1_2_1_1_1());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }

                    // InternalACMECNl.g:2306:4: ( (lv_rhs_16_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2307:5: (lv_rhs_16_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2307:5: (lv_rhs_16_0= ruleBaseExpression )
                    // InternalACMECNl.g:2308:6: lv_rhs_16_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_16_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_16_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2327:3: ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) )
                    {
                    // InternalACMECNl.g:2327:3: ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) )
                    // InternalACMECNl.g:2328:4: () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) )
                    {
                    // InternalACMECNl.g:2328:4: ()
                    // InternalACMECNl.g:2329:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDateExpressionAccess().getOnorbeforeDateExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalACMECNl.g:2338:4: ( (lv_lhs_18_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2339:5: (lv_lhs_18_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2339:5: (lv_lhs_18_0= ruleBaseExpression )
                    // InternalACMECNl.g:2340:6: lv_lhs_18_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_lhs_18_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_18_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalACMECNl.g:2357:4: ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) )
                    // InternalACMECNl.g:2358:5: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) )
                    {
                    // InternalACMECNl.g:2358:5: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )?
                    int alt45=3;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==46) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==26) ) {
                        alt45=2;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalACMECNl.g:2359:6: (otherlv_19= 'must' otherlv_20= 'be' )
                            {
                            // InternalACMECNl.g:2359:6: (otherlv_19= 'must' otherlv_20= 'be' )
                            // InternalACMECNl.g:2360:7: otherlv_19= 'must' otherlv_20= 'be'
                            {
                            otherlv_19=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_19, grammarAccess.getDateExpressionAccess().getMustKeyword_2_2_0_0_0());
                              						
                            }
                            otherlv_20=(Token)match(input,47,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_20, grammarAccess.getDateExpressionAccess().getBeKeyword_2_2_0_0_1());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2370:6: otherlv_21= 'is'
                            {
                            otherlv_21=(Token)match(input,26,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_21, grammarAccess.getDateExpressionAccess().getIsKeyword_2_2_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:2375:5: ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) )
                    int alt46=3;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==55) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==40) ) {
                            int LA46_3 = input.LA(3);

                            if ( (LA46_3==56) ) {
                                alt46=1;
                            }
                            else if ( (LA46_3==53) ) {
                                alt46=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 46, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA46_0==59) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalACMECNl.g:2376:6: (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' )
                            {
                            // InternalACMECNl.g:2376:6: (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' )
                            // InternalACMECNl.g:2377:7: otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by'
                            {
                            otherlv_22=(Token)match(input,55,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_22, grammarAccess.getDateExpressionAccess().getBeforeKeyword_2_2_1_0_0());
                              						
                            }
                            otherlv_23=(Token)match(input,40,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_23, grammarAccess.getDateExpressionAccess().getOrKeyword_2_2_1_0_1());
                              						
                            }
                            otherlv_24=(Token)match(input,56,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_24, grammarAccess.getDateExpressionAccess().getByKeyword_2_2_1_0_2());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2391:6: (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' )
                            {
                            // InternalACMECNl.g:2391:6: (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' )
                            // InternalACMECNl.g:2392:7: otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before'
                            {
                            otherlv_25=(Token)match(input,59,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_25, grammarAccess.getDateExpressionAccess().getOnKeyword_2_2_1_1_0());
                              						
                            }
                            otherlv_26=(Token)match(input,40,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_26, grammarAccess.getDateExpressionAccess().getOrKeyword_2_2_1_1_1());
                              						
                            }
                            otherlv_27=(Token)match(input,55,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_27, grammarAccess.getDateExpressionAccess().getBeforeKeyword_2_2_1_1_2());
                              						
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalACMECNl.g:2406:6: (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' )
                            {
                            // InternalACMECNl.g:2406:6: (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' )
                            // InternalACMECNl.g:2407:7: otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to'
                            {
                            otherlv_28=(Token)match(input,55,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_28, grammarAccess.getDateExpressionAccess().getBeforeKeyword_2_2_1_2_0());
                              						
                            }
                            otherlv_29=(Token)match(input,40,FOLLOW_42); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_29, grammarAccess.getDateExpressionAccess().getOrKeyword_2_2_1_2_1());
                              						
                            }
                            otherlv_30=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_30, grammarAccess.getDateExpressionAccess().getEqualKeyword_2_2_1_2_2());
                              						
                            }
                            otherlv_31=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_31, grammarAccess.getDateExpressionAccess().getToKeyword_2_2_1_2_3());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }

                    // InternalACMECNl.g:2426:4: ( (lv_rhs_32_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2427:5: (lv_rhs_32_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2427:5: (lv_rhs_32_0= ruleBaseExpression )
                    // InternalACMECNl.g:2428:6: lv_rhs_32_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_32_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_32_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalACMECNl.g:2447:3: ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) )
                    {
                    // InternalACMECNl.g:2447:3: ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) )
                    // InternalACMECNl.g:2448:4: () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) )
                    {
                    // InternalACMECNl.g:2448:4: ()
                    // InternalACMECNl.g:2449:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDateExpressionAccess().getOnorafterDateExpressionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalACMECNl.g:2458:4: ( (lv_lhs_34_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2459:5: (lv_lhs_34_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2459:5: (lv_lhs_34_0= ruleBaseExpression )
                    // InternalACMECNl.g:2460:6: lv_lhs_34_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_lhs_34_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_34_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalACMECNl.g:2477:4: ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) )
                    // InternalACMECNl.g:2478:5: ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) )
                    {
                    // InternalACMECNl.g:2478:5: ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )?
                    int alt47=3;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==46) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==26) ) {
                        alt47=2;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalACMECNl.g:2479:6: (otherlv_35= 'must' otherlv_36= 'be' )
                            {
                            // InternalACMECNl.g:2479:6: (otherlv_35= 'must' otherlv_36= 'be' )
                            // InternalACMECNl.g:2480:7: otherlv_35= 'must' otherlv_36= 'be'
                            {
                            otherlv_35=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_35, grammarAccess.getDateExpressionAccess().getMustKeyword_3_2_0_0_0());
                              						
                            }
                            otherlv_36=(Token)match(input,47,FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_36, grammarAccess.getDateExpressionAccess().getBeKeyword_3_2_0_0_1());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2490:6: otherlv_37= 'is'
                            {
                            otherlv_37=(Token)match(input,26,FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_37, grammarAccess.getDateExpressionAccess().getIsKeyword_3_2_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalACMECNl.g:2495:5: ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) )
                    int alt48=3;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==57) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==40) ) {
                            int LA48_3 = input.LA(3);

                            if ( (LA48_3==53) ) {
                                alt48=3;
                            }
                            else if ( (LA48_3==56) ) {
                                alt48=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA48_0==59) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalACMECNl.g:2496:6: (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' )
                            {
                            // InternalACMECNl.g:2496:6: (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' )
                            // InternalACMECNl.g:2497:7: otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by'
                            {
                            otherlv_38=(Token)match(input,57,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_38, grammarAccess.getDateExpressionAccess().getAfterKeyword_3_2_1_0_0());
                              						
                            }
                            otherlv_39=(Token)match(input,40,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_39, grammarAccess.getDateExpressionAccess().getOrKeyword_3_2_1_0_1());
                              						
                            }
                            otherlv_40=(Token)match(input,56,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_40, grammarAccess.getDateExpressionAccess().getByKeyword_3_2_1_0_2());
                              						
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:2511:6: (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' )
                            {
                            // InternalACMECNl.g:2511:6: (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' )
                            // InternalACMECNl.g:2512:7: otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after'
                            {
                            otherlv_41=(Token)match(input,59,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_41, grammarAccess.getDateExpressionAccess().getOnKeyword_3_2_1_1_0());
                              						
                            }
                            otherlv_42=(Token)match(input,40,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_42, grammarAccess.getDateExpressionAccess().getOrKeyword_3_2_1_1_1());
                              						
                            }
                            otherlv_43=(Token)match(input,57,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_43, grammarAccess.getDateExpressionAccess().getAfterKeyword_3_2_1_1_2());
                              						
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalACMECNl.g:2526:6: (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' )
                            {
                            // InternalACMECNl.g:2526:6: (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' )
                            // InternalACMECNl.g:2527:7: otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to'
                            {
                            otherlv_44=(Token)match(input,57,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_44, grammarAccess.getDateExpressionAccess().getAfterKeyword_3_2_1_2_0());
                              						
                            }
                            otherlv_45=(Token)match(input,40,FOLLOW_42); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_45, grammarAccess.getDateExpressionAccess().getOrKeyword_3_2_1_2_1());
                              						
                            }
                            otherlv_46=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_46, grammarAccess.getDateExpressionAccess().getEqualKeyword_3_2_1_2_2());
                              						
                            }
                            otherlv_47=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_47, grammarAccess.getDateExpressionAccess().getToKeyword_3_2_1_2_3());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }

                    // InternalACMECNl.g:2546:4: ( (lv_rhs_48_0= ruleBaseExpression ) )
                    // InternalACMECNl.g:2547:5: (lv_rhs_48_0= ruleBaseExpression )
                    {
                    // InternalACMECNl.g:2547:5: (lv_rhs_48_0= ruleBaseExpression )
                    // InternalACMECNl.g:2548:6: lv_rhs_48_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_48_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDateExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_48_0,
                      							"org.eclipse.acme.ACMECNl.BaseExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDateExpression"


    // $ANTLR start "entryRuleNumericAggregation"
    // InternalACMECNl.g:2570:1: entryRuleNumericAggregation returns [EObject current=null] : iv_ruleNumericAggregation= ruleNumericAggregation EOF ;
    public final EObject entryRuleNumericAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericAggregation = null;


        try {
            // InternalACMECNl.g:2570:59: (iv_ruleNumericAggregation= ruleNumericAggregation EOF )
            // InternalACMECNl.g:2571:2: iv_ruleNumericAggregation= ruleNumericAggregation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericAggregationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericAggregation=ruleNumericAggregation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericAggregation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericAggregation"


    // $ANTLR start "ruleNumericAggregation"
    // InternalACMECNl.g:2577:1: ruleNumericAggregation returns [EObject current=null] : (this_NumericSummation_0= ruleNumericSummation | this_NumericAverage_1= ruleNumericAverage | this_NumericMaximum_2= ruleNumericMaximum | this_NumericMinimum_3= ruleNumericMinimum ) ;
    public final EObject ruleNumericAggregation() throws RecognitionException {
        EObject current = null;

        EObject this_NumericSummation_0 = null;

        EObject this_NumericAverage_1 = null;

        EObject this_NumericMaximum_2 = null;

        EObject this_NumericMinimum_3 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2583:2: ( (this_NumericSummation_0= ruleNumericSummation | this_NumericAverage_1= ruleNumericAverage | this_NumericMaximum_2= ruleNumericMaximum | this_NumericMinimum_3= ruleNumericMinimum ) )
            // InternalACMECNl.g:2584:2: (this_NumericSummation_0= ruleNumericSummation | this_NumericAverage_1= ruleNumericAverage | this_NumericMaximum_2= ruleNumericMaximum | this_NumericMinimum_3= ruleNumericMinimum )
            {
            // InternalACMECNl.g:2584:2: (this_NumericSummation_0= ruleNumericSummation | this_NumericAverage_1= ruleNumericAverage | this_NumericMaximum_2= ruleNumericMaximum | this_NumericMinimum_3= ruleNumericMinimum )
            int alt50=4;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    alt50=4;
                    }
                    break;
                case 61:
                    {
                    alt50=2;
                    }
                    break;
                case 62:
                    {
                    alt50=3;
                    }
                    break;
                case 60:
                    {
                    alt50=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalACMECNl.g:2585:3: this_NumericSummation_0= ruleNumericSummation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericAggregationAccess().getNumericSummationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericSummation_0=ruleNumericSummation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericSummation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2597:3: this_NumericAverage_1= ruleNumericAverage
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericAggregationAccess().getNumericAverageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericAverage_1=ruleNumericAverage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericAverage_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2609:3: this_NumericMaximum_2= ruleNumericMaximum
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericAggregationAccess().getNumericMaximumParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericMaximum_2=ruleNumericMaximum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericMaximum_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalACMECNl.g:2621:3: this_NumericMinimum_3= ruleNumericMinimum
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericAggregationAccess().getNumericMinimumParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericMinimum_3=ruleNumericMinimum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericMinimum_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericAggregation"


    // $ANTLR start "entryRuleNumericSummation"
    // InternalACMECNl.g:2636:1: entryRuleNumericSummation returns [EObject current=null] : iv_ruleNumericSummation= ruleNumericSummation EOF ;
    public final EObject entryRuleNumericSummation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericSummation = null;


        try {
            // InternalACMECNl.g:2636:57: (iv_ruleNumericSummation= ruleNumericSummation EOF )
            // InternalACMECNl.g:2637:2: iv_ruleNumericSummation= ruleNumericSummation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericSummationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericSummation=ruleNumericSummation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericSummation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericSummation"


    // $ANTLR start "ruleNumericSummation"
    // InternalACMECNl.g:2643:1: ruleNumericSummation returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'sum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) ;
    public final EObject ruleNumericSummation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_feature_3_1 = null;

        EObject lv_feature_3_2 = null;

        EObject lv_feature_3_3 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2649:2: ( (otherlv_0= 'the' otherlv_1= 'sum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) )
            // InternalACMECNl.g:2650:2: (otherlv_0= 'the' otherlv_1= 'sum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            {
            // InternalACMECNl.g:2650:2: (otherlv_0= 'the' otherlv_1= 'sum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            // InternalACMECNl.g:2651:3: otherlv_0= 'the' otherlv_1= 'sum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumericSummationAccess().getTheKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,60,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericSummationAccess().getSumKeyword_1());
              		
            }
            // InternalACMECNl.g:2659:3: (otherlv_2= 'of' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalACMECNl.g:2660:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNumericSummationAccess().getOfKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:2665:3: ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            // InternalACMECNl.g:2666:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            {
            // InternalACMECNl.g:2666:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            // InternalACMECNl.g:2667:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            {
            // InternalACMECNl.g:2667:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DECIMAL:
                case RULE_DATE:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 49:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 73:
                case 74:
                case 75:
                case 76:
                case 79:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt52=1;
                    }
                    break;
                case 18:
                    {
                    alt52=2;
                    }
                    break;
                case 69:
                    {
                    alt52=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalACMECNl.g:2668:6: lv_feature_3_1= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericSummationAccess().getFeatureFeatureValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_1=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericSummationRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_1,
                      							"org.eclipse.acme.ACMECNl.FeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2684:6: lv_feature_3_2= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericSummationAccess().getFeatureUnscopedFeatureValueParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_2=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericSummationRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_2,
                      							"org.eclipse.acme.ACMECNl.UnscopedFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2700:6: lv_feature_3_3= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericSummationAccess().getFeatureVariableFeatureValueParserRuleCall_3_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_3=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericSummationRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_3,
                      							"org.eclipse.acme.ACMECNl.VariableFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericSummation"


    // $ANTLR start "entryRuleNumericAverage"
    // InternalACMECNl.g:2722:1: entryRuleNumericAverage returns [EObject current=null] : iv_ruleNumericAverage= ruleNumericAverage EOF ;
    public final EObject entryRuleNumericAverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericAverage = null;


        try {
            // InternalACMECNl.g:2722:55: (iv_ruleNumericAverage= ruleNumericAverage EOF )
            // InternalACMECNl.g:2723:2: iv_ruleNumericAverage= ruleNumericAverage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericAverageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericAverage=ruleNumericAverage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericAverage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericAverage"


    // $ANTLR start "ruleNumericAverage"
    // InternalACMECNl.g:2729:1: ruleNumericAverage returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'average' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) ;
    public final EObject ruleNumericAverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_feature_3_1 = null;

        EObject lv_feature_3_2 = null;

        EObject lv_feature_3_3 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2735:2: ( (otherlv_0= 'the' otherlv_1= 'average' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) )
            // InternalACMECNl.g:2736:2: (otherlv_0= 'the' otherlv_1= 'average' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            {
            // InternalACMECNl.g:2736:2: (otherlv_0= 'the' otherlv_1= 'average' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            // InternalACMECNl.g:2737:3: otherlv_0= 'the' otherlv_1= 'average' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumericAverageAccess().getTheKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,61,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericAverageAccess().getAverageKeyword_1());
              		
            }
            // InternalACMECNl.g:2745:3: (otherlv_2= 'of' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalACMECNl.g:2746:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNumericAverageAccess().getOfKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:2751:3: ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            // InternalACMECNl.g:2752:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            {
            // InternalACMECNl.g:2752:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            // InternalACMECNl.g:2753:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            {
            // InternalACMECNl.g:2753:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==19) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DECIMAL:
                case RULE_DATE:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 49:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 73:
                case 74:
                case 75:
                case 76:
                case 79:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt54=1;
                    }
                    break;
                case 18:
                    {
                    alt54=2;
                    }
                    break;
                case 69:
                    {
                    alt54=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalACMECNl.g:2754:6: lv_feature_3_1= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericAverageAccess().getFeatureFeatureValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_1=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericAverageRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_1,
                      							"org.eclipse.acme.ACMECNl.FeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2770:6: lv_feature_3_2= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericAverageAccess().getFeatureUnscopedFeatureValueParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_2=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericAverageRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_2,
                      							"org.eclipse.acme.ACMECNl.UnscopedFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2786:6: lv_feature_3_3= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericAverageAccess().getFeatureVariableFeatureValueParserRuleCall_3_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_3=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericAverageRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_3,
                      							"org.eclipse.acme.ACMECNl.VariableFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericAverage"


    // $ANTLR start "entryRuleNumericMaximum"
    // InternalACMECNl.g:2808:1: entryRuleNumericMaximum returns [EObject current=null] : iv_ruleNumericMaximum= ruleNumericMaximum EOF ;
    public final EObject entryRuleNumericMaximum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericMaximum = null;


        try {
            // InternalACMECNl.g:2808:55: (iv_ruleNumericMaximum= ruleNumericMaximum EOF )
            // InternalACMECNl.g:2809:2: iv_ruleNumericMaximum= ruleNumericMaximum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericMaximumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericMaximum=ruleNumericMaximum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericMaximum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericMaximum"


    // $ANTLR start "ruleNumericMaximum"
    // InternalACMECNl.g:2815:1: ruleNumericMaximum returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'maximum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) ;
    public final EObject ruleNumericMaximum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_feature_3_1 = null;

        EObject lv_feature_3_2 = null;

        EObject lv_feature_3_3 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2821:2: ( (otherlv_0= 'the' otherlv_1= 'maximum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) )
            // InternalACMECNl.g:2822:2: (otherlv_0= 'the' otherlv_1= 'maximum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            {
            // InternalACMECNl.g:2822:2: (otherlv_0= 'the' otherlv_1= 'maximum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            // InternalACMECNl.g:2823:3: otherlv_0= 'the' otherlv_1= 'maximum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumericMaximumAccess().getTheKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,62,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericMaximumAccess().getMaximumKeyword_1());
              		
            }
            // InternalACMECNl.g:2831:3: (otherlv_2= 'of' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalACMECNl.g:2832:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNumericMaximumAccess().getOfKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:2837:3: ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            // InternalACMECNl.g:2838:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            {
            // InternalACMECNl.g:2838:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            // InternalACMECNl.g:2839:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            {
            // InternalACMECNl.g:2839:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 69:
                    {
                    alt56=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DECIMAL:
                case RULE_DATE:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 49:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 73:
                case 74:
                case 75:
                case 76:
                case 79:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt56=1;
                    }
                    break;
                case 18:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalACMECNl.g:2840:6: lv_feature_3_1= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMaximumAccess().getFeatureFeatureValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_1=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMaximumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_1,
                      							"org.eclipse.acme.ACMECNl.FeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2856:6: lv_feature_3_2= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMaximumAccess().getFeatureUnscopedFeatureValueParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_2=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMaximumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_2,
                      							"org.eclipse.acme.ACMECNl.UnscopedFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2872:6: lv_feature_3_3= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMaximumAccess().getFeatureVariableFeatureValueParserRuleCall_3_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_3=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMaximumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_3,
                      							"org.eclipse.acme.ACMECNl.VariableFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericMaximum"


    // $ANTLR start "entryRuleNumericMinimum"
    // InternalACMECNl.g:2894:1: entryRuleNumericMinimum returns [EObject current=null] : iv_ruleNumericMinimum= ruleNumericMinimum EOF ;
    public final EObject entryRuleNumericMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericMinimum = null;


        try {
            // InternalACMECNl.g:2894:55: (iv_ruleNumericMinimum= ruleNumericMinimum EOF )
            // InternalACMECNl.g:2895:2: iv_ruleNumericMinimum= ruleNumericMinimum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericMinimumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericMinimum=ruleNumericMinimum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericMinimum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericMinimum"


    // $ANTLR start "ruleNumericMinimum"
    // InternalACMECNl.g:2901:1: ruleNumericMinimum returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'minimum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) ;
    public final EObject ruleNumericMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_feature_3_1 = null;

        EObject lv_feature_3_2 = null;

        EObject lv_feature_3_3 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2907:2: ( (otherlv_0= 'the' otherlv_1= 'minimum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) ) )
            // InternalACMECNl.g:2908:2: (otherlv_0= 'the' otherlv_1= 'minimum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            {
            // InternalACMECNl.g:2908:2: (otherlv_0= 'the' otherlv_1= 'minimum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) ) )
            // InternalACMECNl.g:2909:3: otherlv_0= 'the' otherlv_1= 'minimum' (otherlv_2= 'of' )? ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNumericMinimumAccess().getTheKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,63,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericMinimumAccess().getMinimumKeyword_1());
              		
            }
            // InternalACMECNl.g:2917:3: (otherlv_2= 'of' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==18) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalACMECNl.g:2918:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNumericMinimumAccess().getOfKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:2923:3: ( ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) ) )
            // InternalACMECNl.g:2924:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            {
            // InternalACMECNl.g:2924:4: ( (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue ) )
            // InternalACMECNl.g:2925:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            {
            // InternalACMECNl.g:2925:5: (lv_feature_3_1= ruleFeatureValue | lv_feature_3_2= ruleUnscopedFeatureValue | lv_feature_3_3= ruleVariableFeatureValue )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==19) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 69:
                    {
                    alt58=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DECIMAL:
                case RULE_DATE:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 19:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 49:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 73:
                case 74:
                case 75:
                case 76:
                case 79:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt58=1;
                    }
                    break;
                case 18:
                    {
                    alt58=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalACMECNl.g:2926:6: lv_feature_3_1= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMinimumAccess().getFeatureFeatureValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_1=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMinimumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_1,
                      							"org.eclipse.acme.ACMECNl.FeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:2942:6: lv_feature_3_2= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMinimumAccess().getFeatureUnscopedFeatureValueParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_2=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMinimumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_2,
                      							"org.eclipse.acme.ACMECNl.UnscopedFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:2958:6: lv_feature_3_3= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericMinimumAccess().getFeatureVariableFeatureValueParserRuleCall_3_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_feature_3_3=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericMinimumRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_3_3,
                      							"org.eclipse.acme.ACMECNl.VariableFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericMinimum"


    // $ANTLR start "entryRuleValueContainment"
    // InternalACMECNl.g:2980:1: entryRuleValueContainment returns [EObject current=null] : iv_ruleValueContainment= ruleValueContainment EOF ;
    public final EObject entryRuleValueContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueContainment = null;


        try {
            // InternalACMECNl.g:2980:57: (iv_ruleValueContainment= ruleValueContainment EOF )
            // InternalACMECNl.g:2981:2: iv_ruleValueContainment= ruleValueContainment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueContainmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueContainment=ruleValueContainment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueContainment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueContainment"


    // $ANTLR start "ruleValueContainment"
    // InternalACMECNl.g:2987:1: ruleValueContainment returns [EObject current=null] : ( ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) ) (otherlv_1= 'is' otherlv_2= 'either' ) ( (lv_collection_3_0= ruleBaseExpression ) ) (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )* ) ;
    public final EObject ruleValueContainment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_feature_0_1 = null;

        EObject lv_feature_0_2 = null;

        EObject lv_feature_0_3 = null;

        EObject lv_collection_3_0 = null;

        EObject lv_collection_5_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:2993:2: ( ( ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) ) (otherlv_1= 'is' otherlv_2= 'either' ) ( (lv_collection_3_0= ruleBaseExpression ) ) (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )* ) )
            // InternalACMECNl.g:2994:2: ( ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) ) (otherlv_1= 'is' otherlv_2= 'either' ) ( (lv_collection_3_0= ruleBaseExpression ) ) (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )* )
            {
            // InternalACMECNl.g:2994:2: ( ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) ) (otherlv_1= 'is' otherlv_2= 'either' ) ( (lv_collection_3_0= ruleBaseExpression ) ) (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )* )
            // InternalACMECNl.g:2995:3: ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) ) (otherlv_1= 'is' otherlv_2= 'either' ) ( (lv_collection_3_0= ruleBaseExpression ) ) (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )*
            {
            // InternalACMECNl.g:2995:3: ( ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) ) )
            // InternalACMECNl.g:2996:4: ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) )
            {
            // InternalACMECNl.g:2996:4: ( (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue ) )
            // InternalACMECNl.g:2997:5: (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue )
            {
            // InternalACMECNl.g:2997:5: (lv_feature_0_1= ruleFeatureValue | lv_feature_0_2= ruleUnscopedFeatureValue | lv_feature_0_3= ruleVariableFeatureValue )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt59=1;
                    }
                    break;
                case 18:
                    {
                    alt59=2;
                    }
                    break;
                case 69:
                    {
                    alt59=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalACMECNl.g:2998:6: lv_feature_0_1= ruleFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueContainmentAccess().getFeatureFeatureValueParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_feature_0_1=ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueContainmentRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_0_1,
                      							"org.eclipse.acme.ACMECNl.FeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3014:6: lv_feature_0_2= ruleUnscopedFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueContainmentAccess().getFeatureUnscopedFeatureValueParserRuleCall_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_feature_0_2=ruleUnscopedFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueContainmentRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_0_2,
                      							"org.eclipse.acme.ACMECNl.UnscopedFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:3030:6: lv_feature_0_3= ruleVariableFeatureValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueContainmentAccess().getFeatureVariableFeatureValueParserRuleCall_0_0_2());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_feature_0_3=ruleVariableFeatureValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueContainmentRule());
                      						}
                      						set(
                      							current,
                      							"feature",
                      							lv_feature_0_3,
                      							"org.eclipse.acme.ACMECNl.VariableFeatureValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalACMECNl.g:3048:3: (otherlv_1= 'is' otherlv_2= 'either' )
            // InternalACMECNl.g:3049:4: otherlv_1= 'is' otherlv_2= 'either'
            {
            otherlv_1=(Token)match(input,26,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getValueContainmentAccess().getIsKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,44,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getValueContainmentAccess().getEitherKeyword_1_1());
              			
            }

            }

            // InternalACMECNl.g:3058:3: ( (lv_collection_3_0= ruleBaseExpression ) )
            // InternalACMECNl.g:3059:4: (lv_collection_3_0= ruleBaseExpression )
            {
            // InternalACMECNl.g:3059:4: (lv_collection_3_0= ruleBaseExpression )
            // InternalACMECNl.g:3060:5: lv_collection_3_0= ruleBaseExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueContainmentAccess().getCollectionBaseExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_collection_3_0=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValueContainmentRule());
              					}
              					add(
              						current,
              						"collection",
              						lv_collection_3_0,
              						"org.eclipse.acme.ACMECNl.BaseExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:3077:3: (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==40) ) {
                    int LA60_2 = input.LA(2);

                    if ( (synpred110_InternalACMECNl()) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // InternalACMECNl.g:3078:4: otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getValueContainmentAccess().getOrKeyword_3_0());
            	      			
            	    }
            	    // InternalACMECNl.g:3082:4: ( (lv_collection_5_0= ruleBaseExpression ) )
            	    // InternalACMECNl.g:3083:5: (lv_collection_5_0= ruleBaseExpression )
            	    {
            	    // InternalACMECNl.g:3083:5: (lv_collection_5_0= ruleBaseExpression )
            	    // InternalACMECNl.g:3084:6: lv_collection_5_0= ruleBaseExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValueContainmentAccess().getCollectionBaseExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_collection_5_0=ruleBaseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getValueContainmentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"collection",
            	      							lv_collection_5_0,
            	      							"org.eclipse.acme.ACMECNl.BaseExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValueContainment"


    // $ANTLR start "entryRuleUniquenessCheck"
    // InternalACMECNl.g:3106:1: entryRuleUniquenessCheck returns [EObject current=null] : iv_ruleUniquenessCheck= ruleUniquenessCheck EOF ;
    public final EObject entryRuleUniquenessCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniquenessCheck = null;


        try {
            // InternalACMECNl.g:3106:56: (iv_ruleUniquenessCheck= ruleUniquenessCheck EOF )
            // InternalACMECNl.g:3107:2: iv_ruleUniquenessCheck= ruleUniquenessCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniquenessCheckRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUniquenessCheck=ruleUniquenessCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniquenessCheck; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUniquenessCheck"


    // $ANTLR start "ruleUniquenessCheck"
    // InternalACMECNl.g:3113:1: ruleUniquenessCheck returns [EObject current=null] : ( (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )? ( (lv_features_5_0= ruleFeatureValue ) ) ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )* otherlv_9= 'must' otherlv_10= 'be' otherlv_11= 'unique' ) ;
    public final EObject ruleUniquenessCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_features_5_0 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3119:2: ( ( (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )? ( (lv_features_5_0= ruleFeatureValue ) ) ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )* otherlv_9= 'must' otherlv_10= 'be' otherlv_11= 'unique' ) )
            // InternalACMECNl.g:3120:2: ( (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )? ( (lv_features_5_0= ruleFeatureValue ) ) ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )* otherlv_9= 'must' otherlv_10= 'be' otherlv_11= 'unique' )
            {
            // InternalACMECNl.g:3120:2: ( (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )? ( (lv_features_5_0= ruleFeatureValue ) ) ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )* otherlv_9= 'must' otherlv_10= 'be' otherlv_11= 'unique' )
            // InternalACMECNl.g:3121:3: (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )? ( (lv_features_5_0= ruleFeatureValue ) ) ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )* otherlv_9= 'must' otherlv_10= 'be' otherlv_11= 'unique'
            {
            // InternalACMECNl.g:3121:3: (otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalACMECNl.g:3122:4: otherlv_0= 'any' otherlv_1= 'combination' otherlv_2= 'of' otherlv_3= 'values' otherlv_4= 'in'
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getUniquenessCheckAccess().getAnyKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,65,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getUniquenessCheckAccess().getCombinationKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUniquenessCheckAccess().getOfKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,66,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUniquenessCheckAccess().getValuesKeyword_0_3());
                      			
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUniquenessCheckAccess().getInKeyword_0_4());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:3143:3: ( (lv_features_5_0= ruleFeatureValue ) )
            // InternalACMECNl.g:3144:4: (lv_features_5_0= ruleFeatureValue )
            {
            // InternalACMECNl.g:3144:4: (lv_features_5_0= ruleFeatureValue )
            // InternalACMECNl.g:3145:5: lv_features_5_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUniquenessCheckAccess().getFeaturesFeatureValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_67);
            lv_features_5_0=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUniquenessCheckRule());
              					}
              					add(
              						current,
              						"features",
              						lv_features_5_0,
              						"org.eclipse.acme.ACMECNl.FeatureValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:3162:3: ( (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==42||LA63_0==67) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalACMECNl.g:3163:4: (otherlv_6= ',' | otherlv_7= 'and' ) ( (lv_features_8_0= ruleFeatureValue ) )
            	    {
            	    // InternalACMECNl.g:3163:4: (otherlv_6= ',' | otherlv_7= 'and' )
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==67) ) {
            	        alt62=1;
            	    }
            	    else if ( (LA62_0==42) ) {
            	        alt62=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalACMECNl.g:3164:5: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,67,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_6, grammarAccess.getUniquenessCheckAccess().getCommaKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalACMECNl.g:3169:5: otherlv_7= 'and'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_7, grammarAccess.getUniquenessCheckAccess().getAndKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalACMECNl.g:3174:4: ( (lv_features_8_0= ruleFeatureValue ) )
            	    // InternalACMECNl.g:3175:5: (lv_features_8_0= ruleFeatureValue )
            	    {
            	    // InternalACMECNl.g:3175:5: (lv_features_8_0= ruleFeatureValue )
            	    // InternalACMECNl.g:3176:6: lv_features_8_0= ruleFeatureValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUniquenessCheckAccess().getFeaturesFeatureValueParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_features_8_0=ruleFeatureValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUniquenessCheckRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_8_0,
            	      							"org.eclipse.acme.ACMECNl.FeatureValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_9=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getUniquenessCheckAccess().getMustKeyword_3());
              		
            }
            otherlv_10=(Token)match(input,47,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getUniquenessCheckAccess().getBeKeyword_4());
              		
            }
            otherlv_11=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getUniquenessCheckAccess().getUniqueKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUniquenessCheck"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalACMECNl.g:3210:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalACMECNl.g:3210:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalACMECNl.g:3211:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalACMECNl.g:3217:1: ruleTypeExpression returns [EObject current=null] : (this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression | this_EnumTypeExpression_1= ruleEnumTypeExpression ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeExpression_0 = null;

        EObject this_EnumTypeExpression_1 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3223:2: ( (this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression | this_EnumTypeExpression_1= ruleEnumTypeExpression ) )
            // InternalACMECNl.g:3224:2: (this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression | this_EnumTypeExpression_1= ruleEnumTypeExpression )
            {
            // InternalACMECNl.g:3224:2: (this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression | this_EnumTypeExpression_1= ruleEnumTypeExpression )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalACMECNl.g:3225:3: this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpressionAccess().getPrimitiveTypeExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeExpression_0=rulePrimitiveTypeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3237:3: this_EnumTypeExpression_1= ruleEnumTypeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpressionAccess().getEnumTypeExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumTypeExpression_1=ruleEnumTypeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumTypeExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleFeatureValue"
    // InternalACMECNl.g:3252:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalACMECNl.g:3252:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalACMECNl.g:3253:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureValue"


    // $ANTLR start "ruleFeatureValue"
    // InternalACMECNl.g:3259:1: ruleFeatureValue returns [EObject current=null] : ( (otherlv_0= 'the' )? ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3265:2: ( ( (otherlv_0= 'the' )? ( (otherlv_1= RULE_ID ) ) ) )
            // InternalACMECNl.g:3266:2: ( (otherlv_0= 'the' )? ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalACMECNl.g:3266:2: ( (otherlv_0= 'the' )? ( (otherlv_1= RULE_ID ) ) )
            // InternalACMECNl.g:3267:3: (otherlv_0= 'the' )? ( (otherlv_1= RULE_ID ) )
            {
            // InternalACMECNl.g:3267:3: (otherlv_0= 'the' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==19) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalACMECNl.g:3268:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFeatureValueAccess().getTheKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalACMECNl.g:3273:3: ( (otherlv_1= RULE_ID ) )
            // InternalACMECNl.g:3274:4: (otherlv_1= RULE_ID )
            {
            // InternalACMECNl.g:3274:4: (otherlv_1= RULE_ID )
            // InternalACMECNl.g:3275:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureValueRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFeatureValueAccess().getFeatureFeatureCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "entryRuleVariableFeatureValue"
    // InternalACMECNl.g:3293:1: entryRuleVariableFeatureValue returns [EObject current=null] : iv_ruleVariableFeatureValue= ruleVariableFeatureValue EOF ;
    public final EObject entryRuleVariableFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableFeatureValue = null;


        try {
            // InternalACMECNl.g:3293:61: (iv_ruleVariableFeatureValue= ruleVariableFeatureValue EOF )
            // InternalACMECNl.g:3294:2: iv_ruleVariableFeatureValue= ruleVariableFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableFeatureValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableFeatureValue=ruleVariableFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableFeatureValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableFeatureValue"


    // $ANTLR start "ruleVariableFeatureValue"
    // InternalACMECNl.g:3300:1: ruleVariableFeatureValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'from' ( (lv_variableName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableFeatureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variableName_2_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3306:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'from' ( (lv_variableName_2_0= RULE_ID ) ) ) )
            // InternalACMECNl.g:3307:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'from' ( (lv_variableName_2_0= RULE_ID ) ) )
            {
            // InternalACMECNl.g:3307:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'from' ( (lv_variableName_2_0= RULE_ID ) ) )
            // InternalACMECNl.g:3308:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'from' ( (lv_variableName_2_0= RULE_ID ) )
            {
            // InternalACMECNl.g:3308:3: ( (otherlv_0= RULE_ID ) )
            // InternalACMECNl.g:3309:4: (otherlv_0= RULE_ID )
            {
            // InternalACMECNl.g:3309:4: (otherlv_0= RULE_ID )
            // InternalACMECNl.g:3310:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableFeatureValueRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getVariableFeatureValueAccess().getFeatureFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableFeatureValueAccess().getFromKeyword_1());
              		
            }
            // InternalACMECNl.g:3328:3: ( (lv_variableName_2_0= RULE_ID ) )
            // InternalACMECNl.g:3329:4: (lv_variableName_2_0= RULE_ID )
            {
            // InternalACMECNl.g:3329:4: (lv_variableName_2_0= RULE_ID )
            // InternalACMECNl.g:3330:5: lv_variableName_2_0= RULE_ID
            {
            lv_variableName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variableName_2_0, grammarAccess.getVariableFeatureValueAccess().getVariableNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableFeatureValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"variableName",
              						lv_variableName_2_0,
              						"org.eclipse.acme.ACMECNl.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableFeatureValue"


    // $ANTLR start "entryRuleUnscopedFeatureValue"
    // InternalACMECNl.g:3350:1: entryRuleUnscopedFeatureValue returns [EObject current=null] : iv_ruleUnscopedFeatureValue= ruleUnscopedFeatureValue EOF ;
    public final EObject entryRuleUnscopedFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnscopedFeatureValue = null;


        try {
            // InternalACMECNl.g:3350:61: (iv_ruleUnscopedFeatureValue= ruleUnscopedFeatureValue EOF )
            // InternalACMECNl.g:3351:2: iv_ruleUnscopedFeatureValue= ruleUnscopedFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnscopedFeatureValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnscopedFeatureValue=ruleUnscopedFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnscopedFeatureValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnscopedFeatureValue"


    // $ANTLR start "ruleUnscopedFeatureValue"
    // InternalACMECNl.g:3357:1: ruleUnscopedFeatureValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_scope_2_0= ruleElementScope ) ) ) ;
    public final EObject ruleUnscopedFeatureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_scope_2_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3363:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_scope_2_0= ruleElementScope ) ) ) )
            // InternalACMECNl.g:3364:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_scope_2_0= ruleElementScope ) ) )
            {
            // InternalACMECNl.g:3364:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_scope_2_0= ruleElementScope ) ) )
            // InternalACMECNl.g:3365:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (lv_scope_2_0= ruleElementScope ) )
            {
            // InternalACMECNl.g:3365:3: ( (otherlv_0= RULE_ID ) )
            // InternalACMECNl.g:3366:4: (otherlv_0= RULE_ID )
            {
            // InternalACMECNl.g:3366:4: (otherlv_0= RULE_ID )
            // InternalACMECNl.g:3367:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnscopedFeatureValueRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getUnscopedFeatureValueAccess().getFeatureFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnscopedFeatureValueAccess().getOfKeyword_1());
              		
            }
            // InternalACMECNl.g:3385:3: ( (lv_scope_2_0= ruleElementScope ) )
            // InternalACMECNl.g:3386:4: (lv_scope_2_0= ruleElementScope )
            {
            // InternalACMECNl.g:3386:4: (lv_scope_2_0= ruleElementScope )
            // InternalACMECNl.g:3387:5: lv_scope_2_0= ruleElementScope
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnscopedFeatureValueAccess().getScopeElementScopeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scope_2_0=ruleElementScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnscopedFeatureValueRule());
              					}
              					set(
              						current,
              						"scope",
              						lv_scope_2_0,
              						"org.eclipse.acme.ACMECNl.ElementScope");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnscopedFeatureValue"


    // $ANTLR start "entryRulePrimitiveTypeExpression"
    // InternalACMECNl.g:3408:1: entryRulePrimitiveTypeExpression returns [EObject current=null] : iv_rulePrimitiveTypeExpression= rulePrimitiveTypeExpression EOF ;
    public final EObject entryRulePrimitiveTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeExpression = null;


        try {
            // InternalACMECNl.g:3408:64: (iv_rulePrimitiveTypeExpression= rulePrimitiveTypeExpression EOF )
            // InternalACMECNl.g:3409:2: iv_rulePrimitiveTypeExpression= rulePrimitiveTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeExpression=rulePrimitiveTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeExpression"


    // $ANTLR start "rulePrimitiveTypeExpression"
    // InternalACMECNl.g:3415:1: rulePrimitiveTypeExpression returns [EObject current=null] : ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (lv_type_10_0= rulePrimitiveTypes ) ) ) ;
    public final EObject rulePrimitiveTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_feature_0_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3421:2: ( ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (lv_type_10_0= rulePrimitiveTypes ) ) ) )
            // InternalACMECNl.g:3422:2: ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (lv_type_10_0= rulePrimitiveTypes ) ) )
            {
            // InternalACMECNl.g:3422:2: ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (lv_type_10_0= rulePrimitiveTypes ) ) )
            // InternalACMECNl.g:3423:3: ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (lv_type_10_0= rulePrimitiveTypes ) )
            {
            // InternalACMECNl.g:3423:3: ( (lv_feature_0_0= ruleFeatureValue ) )
            // InternalACMECNl.g:3424:4: (lv_feature_0_0= ruleFeatureValue )
            {
            // InternalACMECNl.g:3424:4: (lv_feature_0_0= ruleFeatureValue )
            // InternalACMECNl.g:3425:5: lv_feature_0_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrimitiveTypeExpressionAccess().getFeatureFeatureValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_feature_0_0=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrimitiveTypeExpressionRule());
              					}
              					set(
              						current,
              						"feature",
              						lv_feature_0_0,
              						"org.eclipse.acme.ACMECNl.FeatureValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:3442:3: ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) )
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==26) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==18) ) {
                    alt67=1;
                }
                else if ( (LA67_1==16) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA67_0==46) ) {
                alt67=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalACMECNl.g:3443:4: (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' )
                    {
                    // InternalACMECNl.g:3443:4: (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' )
                    // InternalACMECNl.g:3444:5: otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeExpressionAccess().getIsKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeExpressionAccess().getOfKeyword_1_0_1());
                      				
                    }
                    otherlv_3=(Token)match(input,70,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypeExpressionAccess().getTypeKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3458:4: (otherlv_4= 'is' otherlv_5= 'a' )
                    {
                    // InternalACMECNl.g:3458:4: (otherlv_4= 'is' otherlv_5= 'a' )
                    // InternalACMECNl.g:3459:5: otherlv_4= 'is' otherlv_5= 'a'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeExpressionAccess().getIsKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPrimitiveTypeExpressionAccess().getAKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:3469:4: (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? )
                    {
                    // InternalACMECNl.g:3469:4: (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? )
                    // InternalACMECNl.g:3470:5: otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )?
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeExpressionAccess().getMustKeyword_1_2_0());
                      				
                    }
                    otherlv_7=(Token)match(input,47,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPrimitiveTypeExpressionAccess().getBeKeyword_1_2_1());
                      				
                    }
                    // InternalACMECNl.g:3478:5: (otherlv_8= 'a' | otherlv_9= 'in' )?
                    int alt66=3;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==16) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==15) ) {
                        alt66=2;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalACMECNl.g:3479:6: otherlv_8= 'a'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getPrimitiveTypeExpressionAccess().getAKeyword_1_2_2_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:3484:6: otherlv_9= 'in'
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getPrimitiveTypeExpressionAccess().getInKeyword_1_2_2_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalACMECNl.g:3491:3: ( (lv_type_10_0= rulePrimitiveTypes ) )
            // InternalACMECNl.g:3492:4: (lv_type_10_0= rulePrimitiveTypes )
            {
            // InternalACMECNl.g:3492:4: (lv_type_10_0= rulePrimitiveTypes )
            // InternalACMECNl.g:3493:5: lv_type_10_0= rulePrimitiveTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrimitiveTypeExpressionAccess().getTypePrimitiveTypesEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_10_0=rulePrimitiveTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrimitiveTypeExpressionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_10_0,
              						"org.eclipse.acme.ACMECNl.PrimitiveTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeExpression"


    // $ANTLR start "entryRuleEnumTypeExpression"
    // InternalACMECNl.g:3514:1: entryRuleEnumTypeExpression returns [EObject current=null] : iv_ruleEnumTypeExpression= ruleEnumTypeExpression EOF ;
    public final EObject entryRuleEnumTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeExpression = null;


        try {
            // InternalACMECNl.g:3514:59: (iv_ruleEnumTypeExpression= ruleEnumTypeExpression EOF )
            // InternalACMECNl.g:3515:2: iv_ruleEnumTypeExpression= ruleEnumTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTypeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumTypeExpression=ruleEnumTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumTypeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumTypeExpression"


    // $ANTLR start "ruleEnumTypeExpression"
    // InternalACMECNl.g:3521:1: ruleEnumTypeExpression returns [EObject current=null] : ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleEnumTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_feature_0_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3527:2: ( ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (otherlv_10= RULE_ID ) ) ) )
            // InternalACMECNl.g:3528:2: ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalACMECNl.g:3528:2: ( ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (otherlv_10= RULE_ID ) ) )
            // InternalACMECNl.g:3529:3: ( (lv_feature_0_0= ruleFeatureValue ) ) ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) ) ( (otherlv_10= RULE_ID ) )
            {
            // InternalACMECNl.g:3529:3: ( (lv_feature_0_0= ruleFeatureValue ) )
            // InternalACMECNl.g:3530:4: (lv_feature_0_0= ruleFeatureValue )
            {
            // InternalACMECNl.g:3530:4: (lv_feature_0_0= ruleFeatureValue )
            // InternalACMECNl.g:3531:5: lv_feature_0_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumTypeExpressionAccess().getFeatureFeatureValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_feature_0_0=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumTypeExpressionRule());
              					}
              					set(
              						current,
              						"feature",
              						lv_feature_0_0,
              						"org.eclipse.acme.ACMECNl.FeatureValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:3548:3: ( (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' ) | (otherlv_4= 'is' otherlv_5= 'a' ) | (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? ) )
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==26) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==18) ) {
                    alt69=1;
                }
                else if ( (LA69_1==16) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==46) ) {
                alt69=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalACMECNl.g:3549:4: (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' )
                    {
                    // InternalACMECNl.g:3549:4: (otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type' )
                    // InternalACMECNl.g:3550:5: otherlv_1= 'is' otherlv_2= 'of' otherlv_3= 'type'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getEnumTypeExpressionAccess().getIsKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getEnumTypeExpressionAccess().getOfKeyword_1_0_1());
                      				
                    }
                    otherlv_3=(Token)match(input,70,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getEnumTypeExpressionAccess().getTypeKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3564:4: (otherlv_4= 'is' otherlv_5= 'a' )
                    {
                    // InternalACMECNl.g:3564:4: (otherlv_4= 'is' otherlv_5= 'a' )
                    // InternalACMECNl.g:3565:5: otherlv_4= 'is' otherlv_5= 'a'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getEnumTypeExpressionAccess().getIsKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getEnumTypeExpressionAccess().getAKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:3575:4: (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? )
                    {
                    // InternalACMECNl.g:3575:4: (otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )? )
                    // InternalACMECNl.g:3576:5: otherlv_6= 'must' otherlv_7= 'be' (otherlv_8= 'a' | otherlv_9= 'in' )?
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getEnumTypeExpressionAccess().getMustKeyword_1_2_0());
                      				
                    }
                    otherlv_7=(Token)match(input,47,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getEnumTypeExpressionAccess().getBeKeyword_1_2_1());
                      				
                    }
                    // InternalACMECNl.g:3584:5: (otherlv_8= 'a' | otherlv_9= 'in' )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==16) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==15) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalACMECNl.g:3585:6: otherlv_8= 'a'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getEnumTypeExpressionAccess().getAKeyword_1_2_2_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalACMECNl.g:3590:6: otherlv_9= 'in'
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getEnumTypeExpressionAccess().getInKeyword_1_2_2_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalACMECNl.g:3597:3: ( (otherlv_10= RULE_ID ) )
            // InternalACMECNl.g:3598:4: (otherlv_10= RULE_ID )
            {
            // InternalACMECNl.g:3598:4: (otherlv_10= RULE_ID )
            // InternalACMECNl.g:3599:5: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumTypeExpressionRule());
              					}
              				
            }
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_10, grammarAccess.getEnumTypeExpressionAccess().getTypeEnumCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumTypeExpression"


    // $ANTLR start "entryRuleStringValue"
    // InternalACMECNl.g:3617:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalACMECNl.g:3617:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalACMECNl.g:3618:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalACMECNl.g:3624:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3630:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalACMECNl.g:3631:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalACMECNl.g:3631:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalACMECNl.g:3632:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalACMECNl.g:3632:3: (lv_value_0_0= RULE_STRING )
            // InternalACMECNl.g:3633:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalACMECNl.g:3652:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalACMECNl.g:3652:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalACMECNl.g:3653:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalACMECNl.g:3659:1: ruleEnumValue returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3665:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) ) ) )
            // InternalACMECNl.g:3666:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) ) )
            {
            // InternalACMECNl.g:3666:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==19) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalACMECNl.g:3667:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // InternalACMECNl.g:3667:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
                    // InternalACMECNl.g:3668:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalACMECNl.g:3668:4: ( (otherlv_0= RULE_ID ) )
                    // InternalACMECNl.g:3669:5: (otherlv_0= RULE_ID )
                    {
                    // InternalACMECNl.g:3669:5: (otherlv_0= RULE_ID )
                    // InternalACMECNl.g:3670:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumValueRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getEnumValueAccess().getEnumerationEnumCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnumValueAccess().getColonKeyword_0_1());
                      			
                    }
                    // InternalACMECNl.g:3688:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalACMECNl.g:3689:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalACMECNl.g:3689:5: (lv_value_2_0= RULE_STRING )
                    // InternalACMECNl.g:3690:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getEnumValueAccess().getValueSTRINGTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3708:3: (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalACMECNl.g:3708:3: (otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalACMECNl.g:3709:4: otherlv_3= 'the' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'value' otherlv_6= 'of' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumValueAccess().getTheKeyword_1_0());
                      			
                    }
                    // InternalACMECNl.g:3713:4: ( (otherlv_4= RULE_ID ) )
                    // InternalACMECNl.g:3714:5: (otherlv_4= RULE_ID )
                    {
                    // InternalACMECNl.g:3714:5: (otherlv_4= RULE_ID )
                    // InternalACMECNl.g:3715:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumValueRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getEnumValueAccess().getEnumerationEnumCrossReference_1_1_0());
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEnumValueAccess().getValueKeyword_1_2());
                      			
                    }
                    otherlv_6=(Token)match(input,18,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEnumValueAccess().getOfKeyword_1_3());
                      			
                    }
                    // InternalACMECNl.g:3737:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalACMECNl.g:3738:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalACMECNl.g:3738:5: (lv_value_7_0= RULE_STRING )
                    // InternalACMECNl.g:3739:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getEnumValueAccess().getValueSTRINGTerminalRuleCall_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalACMECNl.g:3760:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalACMECNl.g:3760:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalACMECNl.g:3761:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalACMECNl.g:3767:1: ruleBooleanValue returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3773:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalACMECNl.g:3774:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalACMECNl.g:3774:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalACMECNl.g:3775:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalACMECNl.g:3775:3: ()
            // InternalACMECNl.g:3776:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
              					current);
              			
            }

            }

            // InternalACMECNl.g:3785:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==73) ) {
                alt71=1;
            }
            else if ( (LA71_0==74) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalACMECNl.g:3786:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalACMECNl.g:3786:4: ( (lv_value_1_0= 'true' ) )
                    // InternalACMECNl.g:3787:5: (lv_value_1_0= 'true' )
                    {
                    // InternalACMECNl.g:3787:5: (lv_value_1_0= 'true' )
                    // InternalACMECNl.g:3788:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanValueRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3801:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getFalseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalACMECNl.g:3810:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalACMECNl.g:3810:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalACMECNl.g:3811:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalACMECNl.g:3817:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3823:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalACMECNl.g:3824:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalACMECNl.g:3824:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalACMECNl.g:3825:3: (lv_value_0_0= RULE_INT )
            {
            // InternalACMECNl.g:3825:3: (lv_value_0_0= RULE_INT )
            // InternalACMECNl.g:3826:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntegerValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.acme.ACMECNl.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalACMECNl.g:3845:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // InternalACMECNl.g:3845:53: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // InternalACMECNl.g:3846:2: iv_ruleDecimalValue= ruleDecimalValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecimalValue=ruleDecimalValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalACMECNl.g:3852:1: ruleDecimalValue returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3858:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalACMECNl.g:3859:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalACMECNl.g:3859:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalACMECNl.g:3860:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalACMECNl.g:3860:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalACMECNl.g:3861:4: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDecimalValueAccess().getValueDECIMALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDecimalValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.acme.ACMECNl.DECIMAL");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleDateValue"
    // InternalACMECNl.g:3880:1: entryRuleDateValue returns [EObject current=null] : iv_ruleDateValue= ruleDateValue EOF ;
    public final EObject entryRuleDateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateValue = null;


        try {
            // InternalACMECNl.g:3880:50: (iv_ruleDateValue= ruleDateValue EOF )
            // InternalACMECNl.g:3881:2: iv_ruleDateValue= ruleDateValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateValue=ruleDateValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDateValue"


    // $ANTLR start "ruleDateValue"
    // InternalACMECNl.g:3887:1: ruleDateValue returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:3893:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalACMECNl.g:3894:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalACMECNl.g:3894:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalACMECNl.g:3895:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalACMECNl.g:3895:3: (lv_value_0_0= RULE_DATE )
            // InternalACMECNl.g:3896:4: lv_value_0_0= RULE_DATE
            {
            lv_value_0_0=(Token)match(input,RULE_DATE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDateValueAccess().getValueDATETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDateValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.acme.ACMECNl.DATE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDateValue"


    // $ANTLR start "entryRuleMetaData"
    // InternalACMECNl.g:3915:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalACMECNl.g:3915:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalACMECNl.g:3916:2: iv_ruleMetaData= ruleMetaData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaDataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaData=ruleMetaData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaData; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalACMECNl.g:3922:1: ruleMetaData returns [EObject current=null] : (this_Types_0= ruleTypes | this_Enumerations_1= ruleEnumerations ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        EObject this_Types_0 = null;

        EObject this_Enumerations_1 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3928:2: ( (this_Types_0= ruleTypes | this_Enumerations_1= ruleEnumerations ) )
            // InternalACMECNl.g:3929:2: (this_Types_0= ruleTypes | this_Enumerations_1= ruleEnumerations )
            {
            // InternalACMECNl.g:3929:2: (this_Types_0= ruleTypes | this_Enumerations_1= ruleEnumerations )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            else if ( (LA72_0==76) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalACMECNl.g:3930:3: this_Types_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetaDataAccess().getTypesParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Types_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Types_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:3942:3: this_Enumerations_1= ruleEnumerations
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetaDataAccess().getEnumerationsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumerations_1=ruleEnumerations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumerations_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleTypes"
    // InternalACMECNl.g:3957:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalACMECNl.g:3957:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalACMECNl.g:3958:2: iv_ruleTypes= ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalACMECNl.g:3964:1: ruleTypes returns [EObject current=null] : (otherlv_0= 'types' ( (lv_legalValues_1_0= ruleTypeValue ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )* ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_legalValues_1_0 = null;

        EObject lv_legalValues_3_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:3970:2: ( (otherlv_0= 'types' ( (lv_legalValues_1_0= ruleTypeValue ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )* ) )
            // InternalACMECNl.g:3971:2: (otherlv_0= 'types' ( (lv_legalValues_1_0= ruleTypeValue ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )* )
            {
            // InternalACMECNl.g:3971:2: (otherlv_0= 'types' ( (lv_legalValues_1_0= ruleTypeValue ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )* )
            // InternalACMECNl.g:3972:3: otherlv_0= 'types' ( (lv_legalValues_1_0= ruleTypeValue ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )*
            {
            otherlv_0=(Token)match(input,75,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypesAccess().getTypesKeyword_0());
              		
            }
            // InternalACMECNl.g:3976:3: ( (lv_legalValues_1_0= ruleTypeValue ) )
            // InternalACMECNl.g:3977:4: (lv_legalValues_1_0= ruleTypeValue )
            {
            // InternalACMECNl.g:3977:4: (lv_legalValues_1_0= ruleTypeValue )
            // InternalACMECNl.g:3978:5: lv_legalValues_1_0= ruleTypeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypesAccess().getLegalValuesTypeValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_78);
            lv_legalValues_1_0=ruleTypeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypesRule());
              					}
              					add(
              						current,
              						"legalValues",
              						lv_legalValues_1_0,
              						"org.eclipse.acme.ACMECNl.TypeValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:3995:3: (otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==67) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalACMECNl.g:3996:4: otherlv_2= ',' ( (lv_legalValues_3_0= ruleTypeValue ) )
            	    {
            	    otherlv_2=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getTypesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalACMECNl.g:4000:4: ( (lv_legalValues_3_0= ruleTypeValue ) )
            	    // InternalACMECNl.g:4001:5: (lv_legalValues_3_0= ruleTypeValue )
            	    {
            	    // InternalACMECNl.g:4001:5: (lv_legalValues_3_0= ruleTypeValue )
            	    // InternalACMECNl.g:4002:6: lv_legalValues_3_0= ruleTypeValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypesAccess().getLegalValuesTypeValueParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_legalValues_3_0=ruleTypeValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTypesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"legalValues",
            	      							lv_legalValues_3_0,
            	      							"org.eclipse.acme.ACMECNl.TypeValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleEnumerations"
    // InternalACMECNl.g:4024:1: entryRuleEnumerations returns [EObject current=null] : iv_ruleEnumerations= ruleEnumerations EOF ;
    public final EObject entryRuleEnumerations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerations = null;


        try {
            // InternalACMECNl.g:4024:53: (iv_ruleEnumerations= ruleEnumerations EOF )
            // InternalACMECNl.g:4025:2: iv_ruleEnumerations= ruleEnumerations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerations=ruleEnumerations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerations; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerations"


    // $ANTLR start "ruleEnumerations"
    // InternalACMECNl.g:4031:1: ruleEnumerations returns [EObject current=null] : (otherlv_0= 'enumerations' ( (lv_legalValues_1_0= ruleEnum ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )* ) ;
    public final EObject ruleEnumerations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_legalValues_1_0 = null;

        EObject lv_legalValues_3_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:4037:2: ( (otherlv_0= 'enumerations' ( (lv_legalValues_1_0= ruleEnum ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )* ) )
            // InternalACMECNl.g:4038:2: (otherlv_0= 'enumerations' ( (lv_legalValues_1_0= ruleEnum ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )* )
            {
            // InternalACMECNl.g:4038:2: (otherlv_0= 'enumerations' ( (lv_legalValues_1_0= ruleEnum ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )* )
            // InternalACMECNl.g:4039:3: otherlv_0= 'enumerations' ( (lv_legalValues_1_0= ruleEnum ) ) (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )*
            {
            otherlv_0=(Token)match(input,76,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationsAccess().getEnumerationsKeyword_0());
              		
            }
            // InternalACMECNl.g:4043:3: ( (lv_legalValues_1_0= ruleEnum ) )
            // InternalACMECNl.g:4044:4: (lv_legalValues_1_0= ruleEnum )
            {
            // InternalACMECNl.g:4044:4: (lv_legalValues_1_0= ruleEnum )
            // InternalACMECNl.g:4045:5: lv_legalValues_1_0= ruleEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationsAccess().getLegalValuesEnumParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_78);
            lv_legalValues_1_0=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerationsRule());
              					}
              					add(
              						current,
              						"legalValues",
              						lv_legalValues_1_0,
              						"org.eclipse.acme.ACMECNl.Enum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalACMECNl.g:4062:3: (otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==67) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalACMECNl.g:4063:4: otherlv_2= ',' ( (lv_legalValues_3_0= ruleEnum ) )
            	    {
            	    otherlv_2=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getEnumerationsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalACMECNl.g:4067:4: ( (lv_legalValues_3_0= ruleEnum ) )
            	    // InternalACMECNl.g:4068:5: (lv_legalValues_3_0= ruleEnum )
            	    {
            	    // InternalACMECNl.g:4068:5: (lv_legalValues_3_0= ruleEnum )
            	    // InternalACMECNl.g:4069:6: lv_legalValues_3_0= ruleEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumerationsAccess().getLegalValuesEnumParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_legalValues_3_0=ruleEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumerationsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"legalValues",
            	      							lv_legalValues_3_0,
            	      							"org.eclipse.acme.ACMECNl.Enum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerations"


    // $ANTLR start "entryRuleEnum"
    // InternalACMECNl.g:4091:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalACMECNl.g:4091:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalACMECNl.g:4092:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalACMECNl.g:4098:1: ruleEnum returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4104:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalACMECNl.g:4105:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalACMECNl.g:4105:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalACMECNl.g:4106:3: (lv_name_0_0= RULE_ID )
            {
            // InternalACMECNl.g:4106:3: (lv_name_0_0= RULE_ID )
            // InternalACMECNl.g:4107:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEnumRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.acme.ACMECNl.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleTypeValue"
    // InternalACMECNl.g:4126:1: entryRuleTypeValue returns [EObject current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final EObject entryRuleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeValue = null;


        try {
            // InternalACMECNl.g:4126:50: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalACMECNl.g:4127:2: iv_ruleTypeValue= ruleTypeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeValue=ruleTypeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // InternalACMECNl.g:4133:1: ruleTypeValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )? ) ;
    public final EObject ruleTypeValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_2_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalACMECNl.g:4139:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )? ) )
            // InternalACMECNl.g:4140:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )? )
            {
            // InternalACMECNl.g:4140:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )? )
            // InternalACMECNl.g:4141:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )?
            {
            // InternalACMECNl.g:4141:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalACMECNl.g:4142:4: (lv_name_0_0= RULE_ID )
            {
            // InternalACMECNl.g:4142:4: (lv_name_0_0= RULE_ID )
            // InternalACMECNl.g:4143:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTypeValueAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.acme.ACMECNl.ID");
              				
            }

            }


            }

            // InternalACMECNl.g:4159:3: (otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==77) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalACMECNl.g:4160:4: otherlv_1= '{' ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )? otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeValueAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    // InternalACMECNl.g:4164:4: ( ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )* )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_ID) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalACMECNl.g:4165:5: ( (lv_features_2_0= ruleFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )*
                            {
                            // InternalACMECNl.g:4165:5: ( (lv_features_2_0= ruleFeature ) )
                            // InternalACMECNl.g:4166:6: (lv_features_2_0= ruleFeature )
                            {
                            // InternalACMECNl.g:4166:6: (lv_features_2_0= ruleFeature )
                            // InternalACMECNl.g:4167:7: lv_features_2_0= ruleFeature
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeValueAccess().getFeaturesFeatureParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_81);
                            lv_features_2_0=ruleFeature();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeValueRule());
                              							}
                              							add(
                              								current,
                              								"features",
                              								lv_features_2_0,
                              								"org.eclipse.acme.ACMECNl.Feature");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalACMECNl.g:4184:5: (otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==67) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalACMECNl.g:4185:6: otherlv_3= ',' ( (lv_features_4_0= ruleFeature ) )
                            	    {
                            	    otherlv_3=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTypeValueAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalACMECNl.g:4189:6: ( (lv_features_4_0= ruleFeature ) )
                            	    // InternalACMECNl.g:4190:7: (lv_features_4_0= ruleFeature )
                            	    {
                            	    // InternalACMECNl.g:4190:7: (lv_features_4_0= ruleFeature )
                            	    // InternalACMECNl.g:4191:8: lv_features_4_0= ruleFeature
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTypeValueAccess().getFeaturesFeatureParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_81);
                            	    lv_features_4_0=ruleFeature();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTypeValueRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"features",
                            	      									lv_features_4_0,
                            	      									"org.eclipse.acme.ACMECNl.Feature");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop75;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeValueAccess().getRightCurlyBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleFeature"
    // InternalACMECNl.g:4219:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalACMECNl.g:4219:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalACMECNl.g:4220:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalACMECNl.g:4226:1: ruleFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4232:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalACMECNl.g:4233:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalACMECNl.g:4233:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalACMECNl.g:4234:3: (lv_name_0_0= RULE_ID )
            {
            // InternalACMECNl.g:4234:3: (lv_name_0_0= RULE_ID )
            // InternalACMECNl.g:4235:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFeatureRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.acme.ACMECNl.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEmptyValue"
    // InternalACMECNl.g:4254:1: entryRuleEmptyValue returns [EObject current=null] : iv_ruleEmptyValue= ruleEmptyValue EOF ;
    public final EObject entryRuleEmptyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyValue = null;


        try {
            // InternalACMECNl.g:4254:51: (iv_ruleEmptyValue= ruleEmptyValue EOF )
            // InternalACMECNl.g:4255:2: iv_ruleEmptyValue= ruleEmptyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyValue=ruleEmptyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEmptyValue"


    // $ANTLR start "ruleEmptyValue"
    // InternalACMECNl.g:4261:1: ruleEmptyValue returns [EObject current=null] : ( () (otherlv_1= 'must' otherlv_2= 'be' )? otherlv_3= 'empty' ) ;
    public final EObject ruleEmptyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4267:2: ( ( () (otherlv_1= 'must' otherlv_2= 'be' )? otherlv_3= 'empty' ) )
            // InternalACMECNl.g:4268:2: ( () (otherlv_1= 'must' otherlv_2= 'be' )? otherlv_3= 'empty' )
            {
            // InternalACMECNl.g:4268:2: ( () (otherlv_1= 'must' otherlv_2= 'be' )? otherlv_3= 'empty' )
            // InternalACMECNl.g:4269:3: () (otherlv_1= 'must' otherlv_2= 'be' )? otherlv_3= 'empty'
            {
            // InternalACMECNl.g:4269:3: ()
            // InternalACMECNl.g:4270:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEmptyValueAccess().getEmptyValueAction_0(),
              					current);
              			
            }

            }

            // InternalACMECNl.g:4279:3: (otherlv_1= 'must' otherlv_2= 'be' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==46) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalACMECNl.g:4280:4: otherlv_1= 'must' otherlv_2= 'be'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEmptyValueAccess().getMustKeyword_1_0());
                      			
                    }
                    otherlv_2=(Token)match(input,47,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEmptyValueAccess().getBeKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEmptyValueAccess().getEmptyKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEmptyValue"


    // $ANTLR start "entryRuleExistanceValue"
    // InternalACMECNl.g:4297:1: entryRuleExistanceValue returns [EObject current=null] : iv_ruleExistanceValue= ruleExistanceValue EOF ;
    public final EObject entryRuleExistanceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistanceValue = null;


        try {
            // InternalACMECNl.g:4297:55: (iv_ruleExistanceValue= ruleExistanceValue EOF )
            // InternalACMECNl.g:4298:2: iv_ruleExistanceValue= ruleExistanceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistanceValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExistanceValue=ruleExistanceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistanceValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExistanceValue"


    // $ANTLR start "ruleExistanceValue"
    // InternalACMECNl.g:4304:1: ruleExistanceValue returns [EObject current=null] : ( () (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) ) ) ;
    public final EObject ruleExistanceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4310:2: ( ( () (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) ) ) )
            // InternalACMECNl.g:4311:2: ( () (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) ) )
            {
            // InternalACMECNl.g:4311:2: ( () (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) ) )
            // InternalACMECNl.g:4312:3: () (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) )
            {
            // InternalACMECNl.g:4312:3: ()
            // InternalACMECNl.g:4313:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExistanceValueAccess().getExistanceValueAction_0(),
              					current);
              			
            }

            }

            // InternalACMECNl.g:4322:3: (otherlv_1= 'exists' | (otherlv_2= 'must' otherlv_3= 'exist' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==80) ) {
                alt79=1;
            }
            else if ( (LA79_0==46) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalACMECNl.g:4323:4: otherlv_1= 'exists'
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExistanceValueAccess().getExistsKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:4328:4: (otherlv_2= 'must' otherlv_3= 'exist' )
                    {
                    // InternalACMECNl.g:4328:4: (otherlv_2= 'must' otherlv_3= 'exist' )
                    // InternalACMECNl.g:4329:5: otherlv_2= 'must' otherlv_3= 'exist'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getExistanceValueAccess().getMustKeyword_1_1_0());
                      				
                    }
                    otherlv_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getExistanceValueAccess().getExistKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExistanceValue"


    // $ANTLR start "ruleArithmeticOperations"
    // InternalACMECNl.g:4343:1: ruleArithmeticOperations returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleArithmeticOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4349:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalACMECNl.g:4350:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalACMECNl.g:4350:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt80=1;
                }
                break;
            case 83:
                {
                alt80=2;
                }
                break;
            case 84:
                {
                alt80=3;
                }
                break;
            case 85:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalACMECNl.g:4351:3: (enumLiteral_0= '+' )
                    {
                    // InternalACMECNl.g:4351:3: (enumLiteral_0= '+' )
                    // InternalACMECNl.g:4352:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getArithmeticOperationsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperationsAccess().getPlusEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:4359:3: (enumLiteral_1= '-' )
                    {
                    // InternalACMECNl.g:4359:3: (enumLiteral_1= '-' )
                    // InternalACMECNl.g:4360:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getArithmeticOperationsAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperationsAccess().getMinusEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:4367:3: (enumLiteral_2= '*' )
                    {
                    // InternalACMECNl.g:4367:3: (enumLiteral_2= '*' )
                    // InternalACMECNl.g:4368:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getArithmeticOperationsAccess().getTimesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperationsAccess().getTimesEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalACMECNl.g:4375:3: (enumLiteral_3= '/' )
                    {
                    // InternalACMECNl.g:4375:3: (enumLiteral_3= '/' )
                    // InternalACMECNl.g:4376:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getArithmeticOperationsAccess().getDivEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getArithmeticOperationsAccess().getDivEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArithmeticOperations"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalACMECNl.g:4386:1: rulePrimitiveTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Decimal' ) | (enumLiteral_4= 'Date' ) ) ;
    public final Enumerator rulePrimitiveTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalACMECNl.g:4392:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Decimal' ) | (enumLiteral_4= 'Date' ) ) )
            // InternalACMECNl.g:4393:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Decimal' ) | (enumLiteral_4= 'Date' ) )
            {
            // InternalACMECNl.g:4393:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Decimal' ) | (enumLiteral_4= 'Date' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt81=1;
                }
                break;
            case 87:
                {
                alt81=2;
                }
                break;
            case 88:
                {
                alt81=3;
                }
                break;
            case 89:
                {
                alt81=4;
                }
                break;
            case 90:
                {
                alt81=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalACMECNl.g:4394:3: (enumLiteral_0= 'String' )
                    {
                    // InternalACMECNl.g:4394:3: (enumLiteral_0= 'String' )
                    // InternalACMECNl.g:4395:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypesAccess().getStringEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:4402:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalACMECNl.g:4402:3: (enumLiteral_1= 'Boolean' )
                    // InternalACMECNl.g:4403:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypesAccess().getBooleanEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalACMECNl.g:4410:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalACMECNl.g:4410:3: (enumLiteral_2= 'Integer' )
                    // InternalACMECNl.g:4411:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypesAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypesAccess().getIntegerEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalACMECNl.g:4418:3: (enumLiteral_3= 'Decimal' )
                    {
                    // InternalACMECNl.g:4418:3: (enumLiteral_3= 'Decimal' )
                    // InternalACMECNl.g:4419:4: enumLiteral_3= 'Decimal'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypesAccess().getDecimalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypesAccess().getDecimalEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalACMECNl.g:4426:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalACMECNl.g:4426:3: (enumLiteral_4= 'Date' )
                    // InternalACMECNl.g:4427:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypesAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypesAccess().getDateEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypes"

    // $ANTLR start synpred32_InternalACMECNl
    public final void synpred32_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_lhs_10_0 = null;


        // InternalACMECNl.g:975:5: ( ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) )
        // InternalACMECNl.g:975:5: ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) )
        {
        // InternalACMECNl.g:975:5: ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) )
        // InternalACMECNl.g:976:6: () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) )
        {
        // InternalACMECNl.g:976:6: ()
        // InternalACMECNl.g:977:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalACMECNl.g:986:6: (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' )
        int alt91=3;
        switch ( input.LA(1) ) {
        case 39:
            {
            alt91=1;
            }
            break;
        case 38:
            {
            alt91=2;
            }
            break;
        case 29:
            {
            alt91=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // InternalACMECNl.g:987:7: otherlv_7= 'when'
                {
                otherlv_7=(Token)match(input,39,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalACMECNl.g:992:7: otherlv_8= 'if'
                {
                otherlv_8=(Token)match(input,38,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalACMECNl.g:997:7: otherlv_9= 'where'
                {
                otherlv_9=(Token)match(input,29,FOLLOW_30); if (state.failed) return ;

                }
                break;

        }

        // InternalACMECNl.g:1002:6: ( (lv_lhs_10_0= ruleComparisonExpression ) )
        // InternalACMECNl.g:1003:7: (lv_lhs_10_0= ruleComparisonExpression )
        {
        // InternalACMECNl.g:1003:7: (lv_lhs_10_0= ruleComparisonExpression )
        // InternalACMECNl.g:1004:8: lv_lhs_10_0= ruleComparisonExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLhsComparisonExpressionParserRuleCall_0_1_1_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_lhs_10_0=ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalACMECNl

    // $ANTLR start synpred33_InternalACMECNl
    public final void synpred33_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_rhs_13_0 = null;


        // InternalACMECNl.g:1023:5: ( ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) )
        // InternalACMECNl.g:1023:5: ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) )
        {
        // InternalACMECNl.g:1023:5: ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) )
        // InternalACMECNl.g:1024:6: () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) )
        {
        // InternalACMECNl.g:1024:6: ()
        // InternalACMECNl.g:1025:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_12=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;
        // InternalACMECNl.g:1038:6: ( (lv_rhs_13_0= ruleComparisonExpression ) )
        // InternalACMECNl.g:1039:7: (lv_rhs_13_0= ruleComparisonExpression )
        {
        // InternalACMECNl.g:1039:7: (lv_rhs_13_0= ruleComparisonExpression )
        // InternalACMECNl.g:1040:8: lv_rhs_13_0= ruleComparisonExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRhsComparisonExpressionParserRuleCall_0_1_2_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_rhs_13_0=ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalACMECNl

    // $ANTLR start synpred40_InternalACMECNl
    public final void synpred40_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_30=null;

        // InternalACMECNl.g:1213:5: (otherlv_30= 'the' )
        // InternalACMECNl.g:1213:5: otherlv_30= 'the'
        {
        otherlv_30=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalACMECNl

    // $ANTLR start synpred42_InternalACMECNl
    public final void synpred42_InternalACMECNl_fragment() throws RecognitionException {   
        EObject this_DateExpression_0 = null;


        // InternalACMECNl.g:1339:3: (this_DateExpression_0= ruleDateExpression )
        // InternalACMECNl.g:1339:3: this_DateExpression_0= ruleDateExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_DateExpression_0=ruleDateExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalACMECNl

    // $ANTLR start synpred44_InternalACMECNl
    public final void synpred44_InternalACMECNl_fragment() throws RecognitionException {   
        EObject lv_rhs_5_0 = null;


        // InternalACMECNl.g:1396:5: ( ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) )
        // InternalACMECNl.g:1396:5: ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) )
        {
        // InternalACMECNl.g:1396:5: ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) )
        // InternalACMECNl.g:1397:6: () ( (lv_rhs_5_0= ruleEmptyValue ) )
        {
        // InternalACMECNl.g:1397:6: ()
        // InternalACMECNl.g:1398:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalACMECNl.g:1407:6: ( (lv_rhs_5_0= ruleEmptyValue ) )
        // InternalACMECNl.g:1408:7: (lv_rhs_5_0= ruleEmptyValue )
        {
        // InternalACMECNl.g:1408:7: (lv_rhs_5_0= ruleEmptyValue )
        // InternalACMECNl.g:1409:8: lv_rhs_5_0= ruleEmptyValue
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsEmptyValueParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_rhs_5_0=ruleEmptyValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred44_InternalACMECNl

    // $ANTLR start synpred47_InternalACMECNl
    public final void synpred47_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_rhs_11_0 = null;


        // InternalACMECNl.g:1428:5: ( ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) )
        // InternalACMECNl.g:1428:5: ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) )
        {
        // InternalACMECNl.g:1428:5: ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) )
        // InternalACMECNl.g:1429:6: () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) )
        {
        // InternalACMECNl.g:1429:6: ()
        // InternalACMECNl.g:1430:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalACMECNl.g:1439:6: (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) )
        int alt99=3;
        switch ( input.LA(1) ) {
        case 45:
            {
            alt99=1;
            }
            break;
        case 26:
            {
            alt99=2;
            }
            break;
        case 46:
            {
            alt99=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 99, 0, input);

            throw nvae;
        }

        switch (alt99) {
            case 1 :
                // InternalACMECNl.g:1440:7: otherlv_7= 'equals'
                {
                otherlv_7=(Token)match(input,45,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalACMECNl.g:1445:7: otherlv_8= 'is'
                {
                otherlv_8=(Token)match(input,26,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalACMECNl.g:1450:7: (otherlv_9= 'must' otherlv_10= 'be' )
                {
                // InternalACMECNl.g:1450:7: (otherlv_9= 'must' otherlv_10= 'be' )
                // InternalACMECNl.g:1451:8: otherlv_9= 'must' otherlv_10= 'be'
                {
                otherlv_9=(Token)match(input,46,FOLLOW_37); if (state.failed) return ;
                otherlv_10=(Token)match(input,47,FOLLOW_30); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalACMECNl.g:1461:6: ( (lv_rhs_11_0= ruleArithmeticExpression ) )
        // InternalACMECNl.g:1462:7: (lv_rhs_11_0= ruleArithmeticExpression )
        {
        // InternalACMECNl.g:1462:7: (lv_rhs_11_0= ruleArithmeticExpression )
        // InternalACMECNl.g:1463:8: lv_rhs_11_0= ruleArithmeticExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsArithmeticExpressionParserRuleCall_1_1_2_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_rhs_11_0=ruleArithmeticExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred47_InternalACMECNl

    // $ANTLR start synpred63_InternalACMECNl
    public final void synpred63_InternalACMECNl_fragment() throws RecognitionException {   
        EObject this_TypeExpression_0 = null;


        // InternalACMECNl.g:1973:3: (this_TypeExpression_0= ruleTypeExpression )
        // InternalACMECNl.g:1973:3: this_TypeExpression_0= ruleTypeExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TypeExpression_0=ruleTypeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalACMECNl

    // $ANTLR start synpred67_InternalACMECNl
    public final void synpred67_InternalACMECNl_fragment() throws RecognitionException {   
        EObject this_FeatureValue_4 = null;


        // InternalACMECNl.g:2021:3: (this_FeatureValue_4= ruleFeatureValue )
        // InternalACMECNl.g:2021:3: this_FeatureValue_4= ruleFeatureValue
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_FeatureValue_4=ruleFeatureValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalACMECNl

    // $ANTLR start synpred75_InternalACMECNl
    public final void synpred75_InternalACMECNl_fragment() throws RecognitionException {   
        EObject this_UniquenessCheck_12 = null;


        // InternalACMECNl.g:2117:3: (this_UniquenessCheck_12= ruleUniquenessCheck )
        // InternalACMECNl.g:2117:3: this_UniquenessCheck_12= ruleUniquenessCheck
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_UniquenessCheck_12=ruleUniquenessCheck();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalACMECNl

    // $ANTLR start synpred79_InternalACMECNl
    public final void synpred79_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_7_0 = null;


        // InternalACMECNl.g:2159:3: ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) )
        // InternalACMECNl.g:2159:3: ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) )
        {
        // InternalACMECNl.g:2159:3: ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) )
        // InternalACMECNl.g:2160:4: () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) )
        {
        // InternalACMECNl.g:2160:4: ()
        // InternalACMECNl.g:2161:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalACMECNl.g:2170:4: ( (lv_lhs_1_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2171:5: (lv_lhs_1_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2171:5: (lv_lhs_1_0= ruleBaseExpression )
        // InternalACMECNl.g:2172:6: lv_lhs_1_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_46);
        lv_lhs_1_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalACMECNl.g:2189:4: ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) )
        // InternalACMECNl.g:2190:5: ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' )
        {
        // InternalACMECNl.g:2190:5: ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )?
        int alt111=3;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==46) ) {
            alt111=1;
        }
        else if ( (LA111_0==26) ) {
            alt111=2;
        }
        switch (alt111) {
            case 1 :
                // InternalACMECNl.g:2191:6: (otherlv_2= 'must' otherlv_3= 'be' )
                {
                // InternalACMECNl.g:2191:6: (otherlv_2= 'must' otherlv_3= 'be' )
                // InternalACMECNl.g:2192:7: otherlv_2= 'must' otherlv_3= 'be'
                {
                otherlv_2=(Token)match(input,46,FOLLOW_37); if (state.failed) return ;
                otherlv_3=(Token)match(input,47,FOLLOW_47); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalACMECNl.g:2202:6: otherlv_4= 'is'
                {
                otherlv_4=(Token)match(input,26,FOLLOW_47); if (state.failed) return ;

                }
                break;

        }

        // InternalACMECNl.g:2207:5: (otherlv_5= 'before' | otherlv_6= 'by' )
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( (LA112_0==55) ) {
            alt112=1;
        }
        else if ( (LA112_0==56) ) {
            alt112=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 112, 0, input);

            throw nvae;
        }
        switch (alt112) {
            case 1 :
                // InternalACMECNl.g:2208:6: otherlv_5= 'before'
                {
                otherlv_5=(Token)match(input,55,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalACMECNl.g:2213:6: otherlv_6= 'by'
                {
                otherlv_6=(Token)match(input,56,FOLLOW_30); if (state.failed) return ;

                }
                break;

        }


        }

        // InternalACMECNl.g:2219:4: ( (lv_rhs_7_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2220:5: (lv_rhs_7_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2220:5: (lv_rhs_7_0= ruleBaseExpression )
        // InternalACMECNl.g:2221:6: lv_rhs_7_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_7_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred79_InternalACMECNl

    // $ANTLR start synpred83_InternalACMECNl
    public final void synpred83_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_lhs_9_0 = null;

        EObject lv_rhs_16_0 = null;


        // InternalACMECNl.g:2240:3: ( ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) )
        // InternalACMECNl.g:2240:3: ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) )
        {
        // InternalACMECNl.g:2240:3: ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) )
        // InternalACMECNl.g:2241:4: () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) )
        {
        // InternalACMECNl.g:2241:4: ()
        // InternalACMECNl.g:2242:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalACMECNl.g:2251:4: ( (lv_lhs_9_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2252:5: (lv_lhs_9_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2252:5: (lv_lhs_9_0= ruleBaseExpression )
        // InternalACMECNl.g:2253:6: lv_lhs_9_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_48);
        lv_lhs_9_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalACMECNl.g:2270:4: ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) )
        // InternalACMECNl.g:2271:5: ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) )
        {
        // InternalACMECNl.g:2271:5: ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )?
        int alt113=3;
        int LA113_0 = input.LA(1);

        if ( (LA113_0==46) ) {
            alt113=1;
        }
        else if ( (LA113_0==26) ) {
            alt113=2;
        }
        switch (alt113) {
            case 1 :
                // InternalACMECNl.g:2272:6: (otherlv_10= 'must' otherlv_11= 'be' )
                {
                // InternalACMECNl.g:2272:6: (otherlv_10= 'must' otherlv_11= 'be' )
                // InternalACMECNl.g:2273:7: otherlv_10= 'must' otherlv_11= 'be'
                {
                otherlv_10=(Token)match(input,46,FOLLOW_37); if (state.failed) return ;
                otherlv_11=(Token)match(input,47,FOLLOW_49); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalACMECNl.g:2283:6: otherlv_12= 'is'
                {
                otherlv_12=(Token)match(input,26,FOLLOW_49); if (state.failed) return ;

                }
                break;

        }

        // InternalACMECNl.g:2288:5: (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) )
        int alt114=2;
        int LA114_0 = input.LA(1);

        if ( (LA114_0==57) ) {
            alt114=1;
        }
        else if ( (LA114_0==58) ) {
            alt114=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 114, 0, input);

            throw nvae;
        }
        switch (alt114) {
            case 1 :
                // InternalACMECNl.g:2289:6: otherlv_13= 'after'
                {
                otherlv_13=(Token)match(input,57,FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalACMECNl.g:2294:6: (otherlv_14= 'later' otherlv_15= 'than' )
                {
                // InternalACMECNl.g:2294:6: (otherlv_14= 'later' otherlv_15= 'than' )
                // InternalACMECNl.g:2295:7: otherlv_14= 'later' otherlv_15= 'than'
                {
                otherlv_14=(Token)match(input,58,FOLLOW_40); if (state.failed) return ;
                otherlv_15=(Token)match(input,51,FOLLOW_30); if (state.failed) return ;

                }


                }
                break;

        }


        }

        // InternalACMECNl.g:2306:4: ( (lv_rhs_16_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2307:5: (lv_rhs_16_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2307:5: (lv_rhs_16_0= ruleBaseExpression )
        // InternalACMECNl.g:2308:6: lv_rhs_16_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_1_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_16_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred83_InternalACMECNl

    // $ANTLR start synpred88_InternalACMECNl
    public final void synpred88_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_lhs_18_0 = null;

        EObject lv_rhs_32_0 = null;


        // InternalACMECNl.g:2327:3: ( ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) )
        // InternalACMECNl.g:2327:3: ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) )
        {
        // InternalACMECNl.g:2327:3: ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) )
        // InternalACMECNl.g:2328:4: () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) )
        {
        // InternalACMECNl.g:2328:4: ()
        // InternalACMECNl.g:2329:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalACMECNl.g:2338:4: ( (lv_lhs_18_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2339:5: (lv_lhs_18_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2339:5: (lv_lhs_18_0= ruleBaseExpression )
        // InternalACMECNl.g:2340:6: lv_lhs_18_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getLhsBaseExpressionParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_50);
        lv_lhs_18_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalACMECNl.g:2357:4: ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) )
        // InternalACMECNl.g:2358:5: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) )
        {
        // InternalACMECNl.g:2358:5: ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )?
        int alt115=3;
        int LA115_0 = input.LA(1);

        if ( (LA115_0==46) ) {
            alt115=1;
        }
        else if ( (LA115_0==26) ) {
            alt115=2;
        }
        switch (alt115) {
            case 1 :
                // InternalACMECNl.g:2359:6: (otherlv_19= 'must' otherlv_20= 'be' )
                {
                // InternalACMECNl.g:2359:6: (otherlv_19= 'must' otherlv_20= 'be' )
                // InternalACMECNl.g:2360:7: otherlv_19= 'must' otherlv_20= 'be'
                {
                otherlv_19=(Token)match(input,46,FOLLOW_37); if (state.failed) return ;
                otherlv_20=(Token)match(input,47,FOLLOW_51); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalACMECNl.g:2370:6: otherlv_21= 'is'
                {
                otherlv_21=(Token)match(input,26,FOLLOW_51); if (state.failed) return ;

                }
                break;

        }

        // InternalACMECNl.g:2375:5: ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) )
        int alt116=3;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==55) ) {
            int LA116_1 = input.LA(2);

            if ( (LA116_1==40) ) {
                int LA116_3 = input.LA(3);

                if ( (LA116_3==56) ) {
                    alt116=1;
                }
                else if ( (LA116_3==53) ) {
                    alt116=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 3, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 1, input);

                throw nvae;
            }
        }
        else if ( (LA116_0==59) ) {
            alt116=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 116, 0, input);

            throw nvae;
        }
        switch (alt116) {
            case 1 :
                // InternalACMECNl.g:2376:6: (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' )
                {
                // InternalACMECNl.g:2376:6: (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' )
                // InternalACMECNl.g:2377:7: otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by'
                {
                otherlv_22=(Token)match(input,55,FOLLOW_35); if (state.failed) return ;
                otherlv_23=(Token)match(input,40,FOLLOW_52); if (state.failed) return ;
                otherlv_24=(Token)match(input,56,FOLLOW_30); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalACMECNl.g:2391:6: (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' )
                {
                // InternalACMECNl.g:2391:6: (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' )
                // InternalACMECNl.g:2392:7: otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before'
                {
                otherlv_25=(Token)match(input,59,FOLLOW_35); if (state.failed) return ;
                otherlv_26=(Token)match(input,40,FOLLOW_53); if (state.failed) return ;
                otherlv_27=(Token)match(input,55,FOLLOW_30); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalACMECNl.g:2406:6: (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' )
                {
                // InternalACMECNl.g:2406:6: (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' )
                // InternalACMECNl.g:2407:7: otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to'
                {
                otherlv_28=(Token)match(input,55,FOLLOW_35); if (state.failed) return ;
                otherlv_29=(Token)match(input,40,FOLLOW_42); if (state.failed) return ;
                otherlv_30=(Token)match(input,53,FOLLOW_43); if (state.failed) return ;
                otherlv_31=(Token)match(input,54,FOLLOW_30); if (state.failed) return ;

                }


                }
                break;

        }


        }

        // InternalACMECNl.g:2426:4: ( (lv_rhs_32_0= ruleBaseExpression ) )
        // InternalACMECNl.g:2427:5: (lv_rhs_32_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:2427:5: (lv_rhs_32_0= ruleBaseExpression )
        // InternalACMECNl.g:2428:6: lv_rhs_32_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDateExpressionAccess().getRhsBaseExpressionParserRuleCall_2_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_32_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred88_InternalACMECNl

    // $ANTLR start synpred110_InternalACMECNl
    public final void synpred110_InternalACMECNl_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_collection_5_0 = null;


        // InternalACMECNl.g:3078:4: (otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) ) )
        // InternalACMECNl.g:3078:4: otherlv_4= 'or' ( (lv_collection_5_0= ruleBaseExpression ) )
        {
        otherlv_4=(Token)match(input,40,FOLLOW_30); if (state.failed) return ;
        // InternalACMECNl.g:3082:4: ( (lv_collection_5_0= ruleBaseExpression ) )
        // InternalACMECNl.g:3083:5: (lv_collection_5_0= ruleBaseExpression )
        {
        // InternalACMECNl.g:3083:5: (lv_collection_5_0= ruleBaseExpression )
        // InternalACMECNl.g:3084:6: lv_collection_5_0= ruleBaseExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getValueContainmentAccess().getCollectionBaseExpressionParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_collection_5_0=ruleBaseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred110_InternalACMECNl

    // Delegated rules

    public final boolean synpred40_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalACMECNl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalACMECNl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\26\4\15\10\uffff";
    static final String dfa_3s = "\1\31\4\17\10\uffff";
    static final String dfa_4s = "\5\uffff\1\1\1\5\1\2\1\6\1\3\1\7\1\10\1\4";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\1\uffff\1\6",
            "\1\7\1\uffff\1\10",
            "\1\11\1\uffff\1\12",
            "\1\14\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "219:7: ( (otherlv_11= 'mandatory' otherlv_12= 'for' ) | (otherlv_13= 'required' otherlv_14= 'for' ) | (otherlv_15= 'needed' otherlv_16= 'for' ) | (otherlv_17= 'obligatory' otherlv_18= 'for' ) | (otherlv_19= 'mandatory' otherlv_20= 'in' ) | (otherlv_21= 'required' otherlv_22= 'in' ) | (otherlv_23= 'needed' otherlv_24= 'in' ) | (otherlv_25= 'obligatory' otherlv_26= 'in' ) )";
        }
    }
    static final String dfa_7s = "\147\uffff";
    static final String dfa_8s = "\1\1\146\uffff";
    static final String dfa_9s = "\1\4\1\uffff\3\4\5\uffff\1\4\1\0\1\57\7\0\1\101\1\4\1\0\1\57\7\0\1\101\1\0\4\4\1\117\1\22\1\0\4\4\1\uffff\1\117\1\22\2\4\1\0\2\4\1\0\2\4\1\0\2\4\1\0\1\102\2\4\1\0\2\4\1\0\2\4\1\0\2\4\1\0\1\102\4\0\1\17\4\0\1\17\3\4\1\52\1\4\1\52\2\4\1\57\2\4\1\57\1\4\1\52\1\104\1\4\1\52\1\104\2\0";
    static final String dfa_10s = "\1\117\1\uffff\3\117\5\uffff\1\117\1\0\1\57\7\0\1\101\1\77\1\0\1\57\7\0\1\101\1\0\4\23\1\117\1\22\1\0\4\23\1\uffff\1\117\1\22\1\23\1\4\1\0\1\23\1\4\1\0\1\23\1\4\1\0\1\23\1\4\1\0\1\102\1\23\1\4\1\0\1\23\1\4\1\0\1\23\1\4\1\0\1\23\1\4\1\0\1\102\4\0\1\17\4\0\1\17\2\23\1\4\1\103\1\4\1\103\2\23\1\57\2\23\1\57\1\4\1\103\1\104\1\4\1\103\1\104\2\0";
    static final String dfa_11s = "\1\uffff\1\7\3\uffff\1\1\1\2\1\4\1\5\1\6\42\uffff\1\3\72\uffff";
    static final String dfa_12s = "\13\uffff\1\0\1\uffff\1\12\1\33\1\4\1\27\1\40\1\30\1\13\2\uffff\1\25\1\uffff\1\37\1\16\1\22\1\17\1\11\1\20\1\35\1\uffff\1\10\6\uffff\1\1\11\uffff\1\34\2\uffff\1\31\2\uffff\1\2\2\uffff\1\26\3\uffff\1\14\2\uffff\1\3\2\uffff\1\6\2\uffff\1\5\1\uffff\1\21\1\24\1\36\1\23\1\uffff\1\7\1\41\1\43\1\42\23\uffff\1\15\1\32}>";
    static final String[] dfa_13s = {
            "\5\1\4\uffff\5\1\1\uffff\1\1\7\uffff\2\1\1\6\1\uffff\4\1\1\uffff\2\5\1\2\1\3\1\4\1\7\1\10\1\11\1\1\1\uffff\1\1\21\uffff\1\1\10\uffff\4\1\2\uffff\1\1",
            "",
            "\1\13\1\16\1\17\1\20\1\21\12\uffff\1\12\22\uffff\2\1\2\uffff\1\11\1\uffff\1\1\1\uffff\1\14\21\uffff\1\24\10\uffff\1\22\1\23\4\uffff\1\15",
            "\1\13\1\16\1\17\1\20\1\21\12\uffff\1\12\22\uffff\2\1\4\uffff\1\1\1\uffff\1\14\21\uffff\1\24\10\uffff\1\22\1\23\4\uffff\1\15",
            "\1\26\1\31\1\32\1\33\1\34\12\uffff\1\25\22\uffff\2\1\4\uffff\1\1\1\uffff\1\27\21\uffff\1\37\10\uffff\1\35\1\36\4\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "\1\40\4\1\12\uffff\1\1\22\uffff\2\1\4\uffff\1\1\1\uffff\1\1\15\uffff\1\42\1\41\1\44\1\43\1\1\10\uffff\2\1\4\uffff\1\1",
            "\1\uffff",
            "\1\45",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\46",
            "\1\47\67\uffff\1\51\1\53\1\52\1\50",
            "\1\uffff",
            "\1\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\56",
            "\1\uffff",
            "\1\61\15\uffff\1\57\1\60",
            "\1\64\15\uffff\1\62\1\63",
            "\1\67\15\uffff\1\65\1\66",
            "\1\72\15\uffff\1\70\1\71",
            "\1\15",
            "\1\73",
            "\1\uffff",
            "\1\76\15\uffff\1\74\1\75",
            "\1\101\15\uffff\1\77\1\100",
            "\1\104\15\uffff\1\102\1\103",
            "\1\107\15\uffff\1\105\1\106",
            "",
            "\1\30",
            "\1\110",
            "\1\61\16\uffff\1\60",
            "\1\111",
            "\1\uffff",
            "\1\64\16\uffff\1\63",
            "\1\112",
            "\1\uffff",
            "\1\67\16\uffff\1\66",
            "\1\113",
            "\1\uffff",
            "\1\72\16\uffff\1\71",
            "\1\114",
            "\1\uffff",
            "\1\115",
            "\1\76\16\uffff\1\75",
            "\1\116",
            "\1\uffff",
            "\1\101\16\uffff\1\100",
            "\1\117",
            "\1\uffff",
            "\1\104\16\uffff\1\103",
            "\1\120",
            "\1\uffff",
            "\1\107\16\uffff\1\106",
            "\1\121",
            "\1\uffff",
            "\1\122",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\123",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\124",
            "\1\126\16\uffff\1\125",
            "\1\130\16\uffff\1\127",
            "\1\126",
            "\1\132\3\uffff\1\133\24\uffff\1\131",
            "\1\130",
            "\1\135\3\uffff\1\136\24\uffff\1\134",
            "\1\140\16\uffff\1\137",
            "\1\140\16\uffff\1\137",
            "\1\141",
            "\1\143\16\uffff\1\142",
            "\1\143\16\uffff\1\142",
            "\1\144",
            "\1\140",
            "\1\132\3\uffff\1\133\24\uffff\1\131",
            "\1\145",
            "\1\143",
            "\1\135\3\uffff\1\136\24\uffff\1\134",
            "\1\146",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 925:4: ( ( () (otherlv_2= 'implies' | (otherlv_3= 'only' otherlv_4= 'if' ) ) ( (lv_rhs_5_0= ruleComparisonExpression ) ) ) | ( () (otherlv_7= 'when' | otherlv_8= 'if' | otherlv_9= 'where' ) ( (lv_lhs_10_0= ruleComparisonExpression ) ) ) | ( () otherlv_12= 'or' ( (lv_rhs_13_0= ruleComparisonExpression ) ) ) | ( () otherlv_15= 'xor' ( (lv_rhs_16_0= ruleComparisonExpression ) ) ) | ( () otherlv_18= 'and' ( (lv_rhs_19_0= ruleComparisonExpression ) ) ) | ( () (otherlv_21= 'iff' | (otherlv_22= 'if' otherlv_23= 'and' otherlv_24= 'only' otherlv_25= 'if' ) ) ( (lv_rhs_26_0= ruleComparisonExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_39 = input.LA(1);

                         
                        int index23_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_39);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_55 = input.LA(1);

                         
                        int index23_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_55);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_65 = input.LA(1);

                         
                        int index23_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_65);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_71 = input.LA(1);

                         
                        int index23_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_71);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_68 = input.LA(1);

                         
                        int index23_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_68);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_78 = input.LA(1);

                         
                        int index23_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_78);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_32 = input.LA(1);

                         
                        int index23_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_32);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_28 = input.LA(1);

                         
                        int index23_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_19 = input.LA(1);

                         
                        int index23_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_19);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_62 = input.LA(1);

                         
                        int index23_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_62);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_101 = input.LA(1);

                         
                        int index23_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_101);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_25 = input.LA(1);

                         
                        int index23_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_25);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA23_27 = input.LA(1);

                         
                        int index23_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA23_29 = input.LA(1);

                         
                        int index23_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_29);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA23_73 = input.LA(1);

                         
                        int index23_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_73);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA23_26 = input.LA(1);

                         
                        int index23_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_26);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA23_76 = input.LA(1);

                         
                        int index23_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_76);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA23_74 = input.LA(1);

                         
                        int index23_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_74);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA23_22 = input.LA(1);

                         
                        int index23_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA23_58 = input.LA(1);

                         
                        int index23_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_58);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA23_18 = input.LA(1);

                         
                        int index23_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_18);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA23_52 = input.LA(1);

                         
                        int index23_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_52);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA23_102 = input.LA(1);

                         
                        int index23_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_102);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA23_49 = input.LA(1);

                         
                        int index23_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA23_30 = input.LA(1);

                         
                        int index23_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA23_75 = input.LA(1);

                         
                        int index23_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_75);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA23_24 = input.LA(1);

                         
                        int index23_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_24);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalACMECNl()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA23_79 = input.LA(1);

                         
                        int index23_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_79);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA23_81 = input.LA(1);

                         
                        int index23_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_81);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA23_80 = input.LA(1);

                         
                        int index23_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalACMECNl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_80);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\4\13\0\2\uffff";
    static final String dfa_16s = "\1\117\13\0\2\uffff";
    static final String dfa_17s = "\14\uffff\1\1\1\2";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\5\1\6\1\7\1\10\12\uffff\1\1\32\uffff\1\3\21\uffff\1\13\10\uffff\1\11\1\12\4\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1338:2: (this_DateExpression_0= ruleDateExpression | (this_ArithmeticExpression_1= ruleArithmeticExpression ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_11 = input.LA(1);

                         
                        int index38_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalACMECNl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index38_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\23\uffff";
    static final String dfa_21s = "\1\1\22\uffff";
    static final String dfa_22s = "\1\4\1\uffff\1\57\1\0\2\uffff\1\4\1\uffff\1\4\1\uffff\2\63\1\0\2\4\4\uffff";
    static final String dfa_23s = "\1\120\1\uffff\1\121\1\0\2\uffff\1\117\1\uffff\1\117\1\uffff\2\63\1\0\2\117\4\uffff";
    static final String dfa_24s = "\1\uffff\1\11\2\uffff\1\1\1\3\1\uffff\1\4\1\uffff\1\2\5\uffff\1\5\1\7\1\10\1\6";
    static final String dfa_25s = "\3\uffff\1\0\10\uffff\1\1\6\uffff}>";
    static final String[] dfa_26s = {
            "\5\1\4\uffff\5\1\1\uffff\1\1\6\uffff\1\6\3\1\1\uffff\4\1\1\uffff\11\1\1\5\1\2\2\uffff\1\7\16\uffff\1\1\10\uffff\4\1\2\uffff\1\3\1\4",
            "",
            "\1\10\41\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "\5\5\12\uffff\1\5\32\uffff\1\5\1\uffff\1\7\1\uffff\1\12\1\uffff\1\13\13\uffff\1\5\10\uffff\2\5\4\uffff\1\5",
            "",
            "\5\5\12\uffff\1\5\32\uffff\1\5\3\uffff\1\12\1\uffff\1\13\13\uffff\1\5\10\uffff\2\5\4\uffff\1\14",
            "",
            "\1\15",
            "\1\16",
            "\1\uffff",
            "\5\17\12\uffff\1\17\24\uffff\1\20\5\uffff\1\17\21\uffff\1\17\10\uffff\2\17\4\uffff\1\17",
            "\5\22\12\uffff\1\22\24\uffff\1\21\5\uffff\1\22\21\uffff\1\22\10\uffff\2\22\4\uffff\1\22",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1363:4: ( ( () ( (lv_rhs_3_0= ruleExistanceValue ) ) ) | ( () ( (lv_rhs_5_0= ruleEmptyValue ) ) ) | ( () (otherlv_7= 'equals' | otherlv_8= 'is' | (otherlv_9= 'must' otherlv_10= 'be' ) ) ( (lv_rhs_11_0= ruleArithmeticExpression ) ) ) | ( () ( (otherlv_13= 'is' otherlv_14= 'not' ) | (otherlv_15= 'cannot' otherlv_16= 'be' ) ) ( (lv_rhs_17_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' ) otherlv_22= 'greater' otherlv_23= 'than' ) ( (lv_rhs_24_0= ruleArithmeticExpression ) ) ) | ( () ( ( (otherlv_26= 'must' otherlv_27= 'be' ) | otherlv_28= 'is' ) otherlv_29= 'less' otherlv_30= 'than' ) ( (lv_rhs_31_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_33= 'must' otherlv_34= 'be' ) | otherlv_35= 'is' ) otherlv_36= 'greater' otherlv_37= 'than' otherlv_38= 'or' otherlv_39= 'equal' otherlv_40= 'to' ) | ( ( (otherlv_41= 'must' otherlv_42= 'be' ) | otherlv_43= 'is' ) otherlv_44= 'greater' otherlv_45= 'than' otherlv_46= 'or' otherlv_47= 'equals' ) ) ( (lv_rhs_48_0= ruleArithmeticExpression ) ) ) | ( () ( ( ( (otherlv_50= 'must' otherlv_51= 'be' ) | otherlv_52= 'is' ) otherlv_53= 'less' otherlv_54= 'than' otherlv_55= 'or' otherlv_56= 'equal' otherlv_57= 'to' ) | ( ( (otherlv_58= 'must' otherlv_59= 'be' ) | otherlv_60= 'is' ) otherlv_61= 'less' otherlv_62= 'than' otherlv_63= 'or' otherlv_64= 'equals' ) ) ( (lv_rhs_65_0= ruleArithmeticExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalACMECNl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalACMECNl()) ) {s = 9;}

                        else if ( (synpred47_InternalACMECNl()) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\40\uffff";
    static final String dfa_28s = "\2\uffff\1\16\10\uffff\1\16\7\uffff\1\33\5\uffff\1\36\6\uffff";
    static final String dfa_29s = "\3\4\10\uffff\2\4\2\uffff\1\57\5\4\2\uffff\1\4\1\0\2\4\1\uffff\2\0\1\uffff\1\4";
    static final String dfa_30s = "\1\117\1\77\1\125\10\uffff\1\125\1\4\2\uffff\1\121\2\117\1\4\1\125\1\132\2\uffff\1\77\1\0\1\125\1\117\1\uffff\2\0\1\uffff\1\117";
    static final String dfa_31s = "\3\uffff\1\2\1\3\1\10\1\11\1\12\1\14\1\15\1\13\2\uffff\1\4\1\5\6\uffff\1\1\1\16\4\uffff\1\7\2\uffff\1\6\1\uffff";
    static final String dfa_32s = "\30\uffff\1\0\3\uffff\1\1\1\2\2\uffff}>";
    static final String[] dfa_33s = {
            "\1\2\1\4\1\5\1\6\1\7\12\uffff\1\1\32\uffff\1\3\21\uffff\1\11\10\uffff\2\10\4\uffff\1\3",
            "\1\13\67\uffff\4\12",
            "\5\16\4\uffff\5\16\1\22\1\16\6\uffff\1\20\3\16\1\uffff\4\16\1\uffff\6\16\1\21\3\16\1\17\2\uffff\1\16\5\uffff\5\16\4\uffff\1\16\2\uffff\1\11\1\uffff\1\14\1\uffff\1\15\1\uffff\4\16\2\uffff\2\16\1\uffff\4\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\16\4\uffff\5\16\1\uffff\1\16\6\uffff\1\20\3\16\1\uffff\4\16\1\uffff\6\16\1\21\3\16\1\17\2\uffff\1\16\5\uffff\5\16\4\uffff\1\16\2\uffff\1\11\4\uffff\1\15\4\16\2\uffff\2\16\1\uffff\4\16",
            "\1\23",
            "",
            "",
            "\1\24\41\uffff\1\16",
            "\5\16\7\uffff\1\25\1\uffff\1\25\1\16\30\uffff\1\26\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\2\uffff\5\16\4\uffff\1\16\10\uffff\2\16\4\uffff\1\16",
            "\1\30\4\16\12\uffff\1\27\32\uffff\1\16\21\uffff\1\16\10\uffff\2\16\4\uffff\1\16",
            "\1\31",
            "\5\33\4\uffff\5\33\1\uffff\1\33\6\uffff\1\32\3\33\1\uffff\4\33\1\uffff\13\33\2\uffff\1\33\5\uffff\5\33\4\uffff\1\33\10\uffff\4\33\2\uffff\2\33\1\uffff\4\33",
            "\1\34\4\16\6\uffff\2\25\2\uffff\1\16\32\uffff\1\16\3\uffff\1\16\1\uffff\1\16\2\uffff\5\16\4\uffff\1\16\3\uffff\1\11\4\uffff\2\16\4\uffff\1\16\6\uffff\5\25",
            "",
            "",
            "\1\35\67\uffff\4\16",
            "\1\uffff",
            "\5\36\4\uffff\5\36\1\uffff\1\36\6\uffff\1\37\3\36\1\uffff\4\36\1\uffff\13\36\2\uffff\1\36\5\uffff\5\36\4\uffff\1\36\10\uffff\4\36\2\uffff\2\36\1\uffff\4\36",
            "\5\33\12\uffff\1\33\30\uffff\1\26\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33\2\uffff\5\33\4\uffff\1\33\10\uffff\2\33\4\uffff\1\33",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\5\36\12\uffff\1\36\30\uffff\1\26\1\uffff\1\36\1\uffff\1\36\1\uffff\1\36\1\uffff\1\36\2\uffff\5\36\4\uffff\1\36\10\uffff\2\36\4\uffff\1\36"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1972:2: (this_TypeExpression_0= ruleTypeExpression | this_EmptyValue_1= ruleEmptyValue | this_StringValue_2= ruleStringValue | this_EnumValue_3= ruleEnumValue | this_FeatureValue_4= ruleFeatureValue | this_UnscopedFeatureValue_5= ruleUnscopedFeatureValue | this_VariableFeatureValue_6= ruleVariableFeatureValue | this_IntegerValue_7= ruleIntegerValue | this_DecimalValue_8= ruleDecimalValue | this_DateValue_9= ruleDateValue | this_NumericAggregation_10= ruleNumericAggregation | this_BooleanValue_11= ruleBooleanValue | this_UniquenessCheck_12= ruleUniquenessCheck | this_ValueContainment_13= ruleValueContainment )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_24 = input.LA(1);

                         
                        int index40_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalACMECNl()) ) {s = 14;}

                        else if ( (synpred75_InternalACMECNl()) ) {s = 9;}

                         
                        input.seek(index40_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_28 = input.LA(1);

                         
                        int index40_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalACMECNl()) ) {s = 21;}

                        else if ( (synpred67_InternalACMECNl()) ) {s = 14;}

                         
                        input.seek(index40_28);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_29 = input.LA(1);

                         
                        int index40_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalACMECNl()) ) {s = 14;}

                        else if ( (synpred75_InternalACMECNl()) ) {s = 9;}

                         
                        input.seek(index40_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\20\uffff";
    static final String dfa_35s = "\1\4\13\0\4\uffff";
    static final String dfa_36s = "\1\117\13\0\4\uffff";
    static final String dfa_37s = "\14\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_38s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff}>";
    static final String[] dfa_39s = {
            "\1\2\1\5\1\6\1\7\1\10\12\uffff\1\1\32\uffff\1\3\21\uffff\1\13\10\uffff\1\11\1\12\4\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "2158:2: ( ( () ( (lv_lhs_1_0= ruleBaseExpression ) ) ( ( (otherlv_2= 'must' otherlv_3= 'be' ) | otherlv_4= 'is' )? (otherlv_5= 'before' | otherlv_6= 'by' ) ) ( (lv_rhs_7_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_9_0= ruleBaseExpression ) ) ( ( (otherlv_10= 'must' otherlv_11= 'be' ) | otherlv_12= 'is' )? (otherlv_13= 'after' | (otherlv_14= 'later' otherlv_15= 'than' ) ) ) ( (lv_rhs_16_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_18_0= ruleBaseExpression ) ) ( ( (otherlv_19= 'must' otherlv_20= 'be' ) | otherlv_21= 'is' )? ( (otherlv_22= 'before' otherlv_23= 'or' otherlv_24= 'by' ) | (otherlv_25= 'on' otherlv_26= 'or' otherlv_27= 'before' ) | (otherlv_28= 'before' otherlv_29= 'or' otherlv_30= 'equal' otherlv_31= 'to' ) ) ) ( (lv_rhs_32_0= ruleBaseExpression ) ) ) | ( () ( (lv_lhs_34_0= ruleBaseExpression ) ) ( ( (otherlv_35= 'must' otherlv_36= 'be' ) | otherlv_37= 'is' )? ( (otherlv_38= 'after' otherlv_39= 'or' otherlv_40= 'by' ) | (otherlv_41= 'on' otherlv_42= 'or' otherlv_43= 'after' ) | (otherlv_44= 'after' otherlv_45= 'or' otherlv_46= 'equal' otherlv_47= 'to' ) ) ) ( (lv_rhs_48_0= ruleBaseExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_3 = input.LA(1);

                         
                        int index49_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_4 = input.LA(1);

                         
                        int index49_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_5 = input.LA(1);

                         
                        int index49_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_8 = input.LA(1);

                         
                        int index49_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalACMECNl()) ) {s = 12;}

                        else if ( (synpred83_InternalACMECNl()) ) {s = 13;}

                        else if ( (synpred88_InternalACMECNl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\2\4\1\32\1\20\1\57\1\4\1\106\1\4\2\uffff\3\4";
    static final String dfa_41s = "\1\23\1\4\1\56\1\22\1\57\1\132\1\106\1\132\2\uffff\3\132";
    static final String dfa_42s = "\10\uffff\1\1\1\2\3\uffff";
    static final String[] dfa_43s = {
            "\1\2\16\uffff\1\1",
            "\1\2",
            "\1\3\23\uffff\1\4",
            "\1\5\1\uffff\1\6",
            "\1\7",
            "\1\11\121\uffff\5\10",
            "\1\12",
            "\1\11\12\uffff\1\14\1\13\105\uffff\5\10",
            "",
            "",
            "\1\11\121\uffff\5\10",
            "\1\11\121\uffff\5\10",
            "\1\11\121\uffff\5\10"
    };
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_5;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "3224:2: (this_PrimitiveTypeExpression_0= rulePrimitiveTypeExpression | this_EnumTypeExpression_1= ruleEnumTypeExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000803E002L,0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000050C4800801F0L,0x0000000000008601L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000050C4800801F2L,0x0000000000008601L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010004010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000050C0800801F0L,0x0000000000008601L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000FF020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00004000000801F0L,0x0000000000008601L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002600004000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0180400004000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0600400004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0880400004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0A00400004000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000440000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000018000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}