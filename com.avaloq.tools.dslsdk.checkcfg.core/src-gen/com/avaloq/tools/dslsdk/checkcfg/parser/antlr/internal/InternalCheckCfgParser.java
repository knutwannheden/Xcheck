package com.avaloq.tools.dslsdk.checkcfg.parser.antlr.internal; 

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
import com.avaloq.tools.dslsdk.checkcfg.services.CheckCfgGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCheckCfgParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'check'", "'configuration'", "'{'", "'}'", "'catalog'", "'('", "','", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'inherit'", "'error'", "'warning'", "'info'", "'ignore'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalCheckCfgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCheckCfgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCheckCfgParser.tokenNames; }
    public String getGrammarFileName() { return "../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g"; }



     	private CheckCfgGrammarAccess grammarAccess;
     	
        public InternalCheckCfgParser(TokenStream input, CheckCfgGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CheckConfiguration";	
       	}
       	
       	@Override
       	protected CheckCfgGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCheckConfiguration"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:68:1: entryRuleCheckConfiguration returns [EObject current=null] : iv_ruleCheckConfiguration= ruleCheckConfiguration EOF ;
    public final EObject entryRuleCheckConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckConfiguration = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:69:2: (iv_ruleCheckConfiguration= ruleCheckConfiguration EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:70:2: iv_ruleCheckConfiguration= ruleCheckConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleCheckConfiguration_in_entryRuleCheckConfiguration75);
            iv_ruleCheckConfiguration=ruleCheckConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckConfiguration85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCheckConfiguration"


    // $ANTLR start "ruleCheckConfiguration"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:77:1: ruleCheckConfiguration returns [EObject current=null] : (otherlv_0= 'check' otherlv_1= 'configuration' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )* otherlv_5= '}' ) ;
    public final EObject ruleCheckConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_catalogConfigurations_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:80:28: ( (otherlv_0= 'check' otherlv_1= 'configuration' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )* otherlv_5= '}' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:81:1: (otherlv_0= 'check' otherlv_1= 'configuration' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )* otherlv_5= '}' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:81:1: (otherlv_0= 'check' otherlv_1= 'configuration' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )* otherlv_5= '}' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:81:3: otherlv_0= 'check' otherlv_1= 'configuration' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCheckConfiguration122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCheckConfigurationAccess().getCheckKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCheckConfiguration134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCheckConfigurationAccess().getConfigurationKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:89:1: ( (lv_label_2_0= RULE_STRING ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:90:1: (lv_label_2_0= RULE_STRING )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:90:1: (lv_label_2_0= RULE_STRING )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:91:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckConfiguration151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getCheckConfigurationAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCheckConfigurationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCheckConfiguration168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckConfigurationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:111:1: ( (lv_catalogConfigurations_4_0= ruleConfiguredCatalog ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:112:1: (lv_catalogConfigurations_4_0= ruleConfiguredCatalog )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:112:1: (lv_catalogConfigurations_4_0= ruleConfiguredCatalog )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:113:3: lv_catalogConfigurations_4_0= ruleConfiguredCatalog
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCheckConfigurationAccess().getCatalogConfigurationsConfiguredCatalogParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfiguredCatalog_in_ruleCheckConfiguration189);
            	    lv_catalogConfigurations_4_0=ruleConfiguredCatalog();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCheckConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catalogConfigurations",
            	              		lv_catalogConfigurations_4_0, 
            	              		"ConfiguredCatalog");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCheckConfiguration202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCheckConfigurationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleCheckConfiguration"


    // $ANTLR start "entryRuleConfiguredCatalog"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:141:1: entryRuleConfiguredCatalog returns [EObject current=null] : iv_ruleConfiguredCatalog= ruleConfiguredCatalog EOF ;
    public final EObject entryRuleConfiguredCatalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguredCatalog = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:142:2: (iv_ruleConfiguredCatalog= ruleConfiguredCatalog EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:143:2: iv_ruleConfiguredCatalog= ruleConfiguredCatalog EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfiguredCatalogRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguredCatalog_in_entryRuleConfiguredCatalog238);
            iv_ruleConfiguredCatalog=ruleConfiguredCatalog();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguredCatalog; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguredCatalog248); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfiguredCatalog"


    // $ANTLR start "ruleConfiguredCatalog"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:150:1: ruleConfiguredCatalog returns [EObject current=null] : ( () otherlv_1= 'catalog' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )* otherlv_5= '}' ) ;
    public final EObject ruleConfiguredCatalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_checkConfigurations_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:153:28: ( ( () otherlv_1= 'catalog' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )* otherlv_5= '}' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:154:1: ( () otherlv_1= 'catalog' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )* otherlv_5= '}' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:154:1: ( () otherlv_1= 'catalog' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )* otherlv_5= '}' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:154:2: () otherlv_1= 'catalog' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )* otherlv_5= '}'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:154:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:155:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfiguredCatalogAccess().getConfiguredCatalogAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleConfiguredCatalog294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfiguredCatalogAccess().getCatalogKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:164:1: ( ( ruleQualifiedName ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:165:1: ( ruleQualifiedName )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:165:1: ( ruleQualifiedName )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:166:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConfiguredCatalogRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfiguredCatalogAccess().getCatalogCheckCatalogCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConfiguredCatalog317);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleConfiguredCatalog329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConfiguredCatalogAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:183:1: ( (lv_checkConfigurations_4_0= ruleConfiguredCheck ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=74 && LA2_0<=78)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:184:1: (lv_checkConfigurations_4_0= ruleConfiguredCheck )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:184:1: (lv_checkConfigurations_4_0= ruleConfiguredCheck )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:185:3: lv_checkConfigurations_4_0= ruleConfiguredCheck
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfiguredCatalogAccess().getCheckConfigurationsConfiguredCheckParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfiguredCheck_in_ruleConfiguredCatalog350);
            	    lv_checkConfigurations_4_0=ruleConfiguredCheck();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConfiguredCatalogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"checkConfigurations",
            	              		lv_checkConfigurations_4_0, 
            	              		"ConfiguredCheck");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleConfiguredCatalog363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConfiguredCatalogAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleConfiguredCatalog"


    // $ANTLR start "entryRuleConfiguredCheck"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:213:1: entryRuleConfiguredCheck returns [EObject current=null] : iv_ruleConfiguredCheck= ruleConfiguredCheck EOF ;
    public final EObject entryRuleConfiguredCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguredCheck = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:214:2: (iv_ruleConfiguredCheck= ruleConfiguredCheck EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:215:2: iv_ruleConfiguredCheck= ruleConfiguredCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfiguredCheckRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguredCheck_in_entryRuleConfiguredCheck399);
            iv_ruleConfiguredCheck=ruleConfiguredCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguredCheck; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguredCheck409); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfiguredCheck"


    // $ANTLR start "ruleConfiguredCheck"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:222:1: ruleConfiguredCheck returns [EObject current=null] : ( () ( (lv_severity_1_0= ruleSeverityKind ) ) ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleConfiguredCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_severity_1_0 = null;

        EObject lv_parameterConfigurations_4_0 = null;

        EObject lv_parameterConfigurations_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:225:28: ( ( () ( (lv_severity_1_0= ruleSeverityKind ) ) ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:226:1: ( () ( (lv_severity_1_0= ruleSeverityKind ) ) ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:226:1: ( () ( (lv_severity_1_0= ruleSeverityKind ) ) ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:226:2: () ( (lv_severity_1_0= ruleSeverityKind ) ) ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:226:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfiguredCheckAccess().getConfiguredCheckAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:232:2: ( (lv_severity_1_0= ruleSeverityKind ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:233:1: (lv_severity_1_0= ruleSeverityKind )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:233:1: (lv_severity_1_0= ruleSeverityKind )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:234:3: lv_severity_1_0= ruleSeverityKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfiguredCheckAccess().getSeveritySeverityKindEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSeverityKind_in_ruleConfiguredCheck464);
            lv_severity_1_0=ruleSeverityKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConfiguredCheckRule());
              	        }
                     		set(
                     			current, 
                     			"severity",
                      		lv_severity_1_0, 
                      		"SeverityKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:250:2: ( ( ruleQualifiedName ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:251:1: ( ruleQualifiedName )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:251:1: ( ruleQualifiedName )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:252:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConfiguredCheckRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfiguredCheckAccess().getCheckCheckCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConfiguredCheck487);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:265:2: (otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:265:4: otherlv_3= '(' ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) ) (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConfiguredCheck500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getConfiguredCheckAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:269:1: ( (lv_parameterConfigurations_4_0= ruleConfiguredParameter ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:270:1: (lv_parameterConfigurations_4_0= ruleConfiguredParameter )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:270:1: (lv_parameterConfigurations_4_0= ruleConfiguredParameter )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:271:3: lv_parameterConfigurations_4_0= ruleConfiguredParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConfiguredCheckAccess().getParameterConfigurationsConfiguredParameterParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConfiguredParameter_in_ruleConfiguredCheck521);
                    lv_parameterConfigurations_4_0=ruleConfiguredParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConfiguredCheckRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterConfigurations",
                              		lv_parameterConfigurations_4_0, 
                              		"ConfiguredParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:287:2: (otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:287:4: otherlv_5= ',' ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleConfiguredCheck534); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getConfiguredCheckAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:291:1: ( (lv_parameterConfigurations_6_0= ruleConfiguredParameter ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:292:1: (lv_parameterConfigurations_6_0= ruleConfiguredParameter )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:292:1: (lv_parameterConfigurations_6_0= ruleConfiguredParameter )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:293:3: lv_parameterConfigurations_6_0= ruleConfiguredParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConfiguredCheckAccess().getParameterConfigurationsConfiguredParameterParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConfiguredParameter_in_ruleConfiguredCheck555);
                    	    lv_parameterConfigurations_6_0=ruleConfiguredParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConfiguredCheckRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterConfigurations",
                    	              		lv_parameterConfigurations_6_0, 
                    	              		"ConfiguredParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleConfiguredCheck569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getConfiguredCheckAccess().getRightParenthesisKeyword_3_3());
                          
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
    // $ANTLR end "ruleConfiguredCheck"


    // $ANTLR start "entryRuleConfiguredParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:321:1: entryRuleConfiguredParameter returns [EObject current=null] : iv_ruleConfiguredParameter= ruleConfiguredParameter EOF ;
    public final EObject entryRuleConfiguredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguredParameter = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:322:2: (iv_ruleConfiguredParameter= ruleConfiguredParameter EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:323:2: iv_ruleConfiguredParameter= ruleConfiguredParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfiguredParameterRule()); 
            }
            pushFollow(FOLLOW_ruleConfiguredParameter_in_entryRuleConfiguredParameter607);
            iv_ruleConfiguredParameter=ruleConfiguredParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguredParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguredParameter617); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfiguredParameter"


    // $ANTLR start "ruleConfiguredParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:330:1: ruleConfiguredParameter returns [EObject current=null] : ( () ( ( ruleValidID ) ) otherlv_2= '=' ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) ) ) ;
    public final EObject ruleConfiguredParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:333:28: ( ( () ( ( ruleValidID ) ) otherlv_2= '=' ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:334:1: ( () ( ( ruleValidID ) ) otherlv_2= '=' ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:334:1: ( () ( ( ruleValidID ) ) otherlv_2= '=' ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:334:2: () ( ( ruleValidID ) ) otherlv_2= '=' ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:334:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfiguredParameterAccess().getConfiguredParameterAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:340:2: ( ( ruleValidID ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:341:1: ( ruleValidID )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:341:1: ( ruleValidID )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:342:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConfiguredParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfiguredParameterAccess().getParameterFormalParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleConfiguredParameter674);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConfiguredParameter686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConfiguredParameterAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:359:1: ( (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:360:1: (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:360:1: (lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:361:3: lv_newValue_3_0= ruleXFormalParameterDefaultValueLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfiguredParameterAccess().getNewValueXFormalParameterDefaultValueLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXFormalParameterDefaultValueLiteral_in_ruleConfiguredParameter707);
            lv_newValue_3_0=ruleXFormalParameterDefaultValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConfiguredParameterRule());
              	        }
                     		set(
                     			current, 
                     			"newValue",
                      		lv_newValue_3_0, 
                      		"XFormalParameterDefaultValueLiteral");
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
    // $ANTLR end "ruleConfiguredParameter"


    // $ANTLR start "entryRuleXFormalParameterDefaultValueLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:385:1: entryRuleXFormalParameterDefaultValueLiteral returns [EObject current=null] : iv_ruleXFormalParameterDefaultValueLiteral= ruleXFormalParameterDefaultValueLiteral EOF ;
    public final EObject entryRuleXFormalParameterDefaultValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormalParameterDefaultValueLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:386:2: (iv_ruleXFormalParameterDefaultValueLiteral= ruleXFormalParameterDefaultValueLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:387:2: iv_ruleXFormalParameterDefaultValueLiteral= ruleXFormalParameterDefaultValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFormalParameterDefaultValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXFormalParameterDefaultValueLiteral_in_entryRuleXFormalParameterDefaultValueLiteral743);
            iv_ruleXFormalParameterDefaultValueLiteral=ruleXFormalParameterDefaultValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFormalParameterDefaultValueLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFormalParameterDefaultValueLiteral753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFormalParameterDefaultValueLiteral"


    // $ANTLR start "ruleXFormalParameterDefaultValueLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:394:1: ruleXFormalParameterDefaultValueLiteral returns [EObject current=null] : (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XIntLiteral_1= ruleXIntLiteral | this_XStringLiteral_2= ruleXStringLiteral ) ;
    public final EObject ruleXFormalParameterDefaultValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XBooleanLiteral_0 = null;

        EObject this_XIntLiteral_1 = null;

        EObject this_XStringLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:397:28: ( (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XIntLiteral_1= ruleXIntLiteral | this_XStringLiteral_2= ruleXStringLiteral ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:398:1: (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XIntLiteral_1= ruleXIntLiteral | this_XStringLiteral_2= ruleXStringLiteral )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:398:1: (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XIntLiteral_1= ruleXIntLiteral | this_XStringLiteral_2= ruleXStringLiteral )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:399:5: this_XBooleanLiteral_0= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXFormalParameterDefaultValueLiteralAccess().getXBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXFormalParameterDefaultValueLiteral800);
                    this_XBooleanLiteral_0=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:409:5: this_XIntLiteral_1= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXFormalParameterDefaultValueLiteralAccess().getXIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXFormalParameterDefaultValueLiteral827);
                    this_XIntLiteral_1=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:419:5: this_XStringLiteral_2= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXFormalParameterDefaultValueLiteralAccess().getXStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXFormalParameterDefaultValueLiteral854);
                    this_XStringLiteral_2=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_2; 
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
    // $ANTLR end "ruleXFormalParameterDefaultValueLiteral"


    // $ANTLR start "entryRuleXExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:435:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:436:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:437:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression889);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression899); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:444:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:447:28: (this_XAssignment_0= ruleXAssignment )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:449:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression945);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:465:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:466:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:467:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment979);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment989); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:474:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:477:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_STRING && LA7_1<=RULE_ID)||(LA7_1>=13 && LA7_1<=14)||(LA7_1>=16 && LA7_1<=18)||(LA7_1>=20 && LA7_1<=43)||(LA7_1>=45 && LA7_1<=70)) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_INT)||LA7_0==13||LA7_0==16||LA7_0==29||(LA7_0>=32 && LA7_0<=33)||LA7_0==38||LA7_0==43||LA7_0==47||LA7_0==49||(LA7_0>=53 && LA7_0<=55)||LA7_0==58||(LA7_0>=60 && LA7_0<=67)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:478:3: ()
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:484:2: ( ( ruleValidID ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:485:1: ( ruleValidID )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:485:1: ( ruleValidID )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:486:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1047);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1063);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:507:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:508:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:508:1: (lv_value_3_0= ruleXAssignment )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:509:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1083);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:526:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:526:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:527:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1113);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred1_InternalCheckCfg()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:540:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:540:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:540:7: ()
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:541:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:546:2: ( ( ruleOpMultiAssign ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:547:1: ( ruleOpMultiAssign )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:547:1: ( ruleOpMultiAssign )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:548:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1166);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:561:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:562:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:562:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:563:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1189);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:587:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:588:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:589:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1229);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:596:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:599:28: (kw= '=' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:601:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:614:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:615:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:616:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1317);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:623:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:626:28: (kw= '+=' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:628:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:641:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:642:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:643:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1404);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1414); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:650:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:653:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:654:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:654:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:655:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1461);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred2_InternalCheckCfg()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:668:6: ( () ( ( ruleOpOr ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:668:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:668:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:669:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:674:2: ( ( ruleOpOr ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:675:1: ( ruleOpOr )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:675:1: ( ruleOpOr )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:676:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1514);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:689:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:690:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:690:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:691:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1537);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:715:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:716:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:717:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1576);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1587); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:724:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:727:28: (kw= '||' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:729:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:742:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:743:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:744:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1663);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1673); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:751:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:754:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:755:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:755:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:756:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1720);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred3_InternalCheckCfg()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:769:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:769:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:769:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:770:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:775:2: ( ( ruleOpAnd ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:776:1: ( ruleOpAnd )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:776:1: ( ruleOpAnd )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:777:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1773);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:790:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:791:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:791:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:792:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1796);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:816:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:817:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:818:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1835);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1846); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:825:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:828:28: (kw= '&&' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:830:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd1883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:843:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:844:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:845:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1922);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1932); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:852:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:855:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:856:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:856:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:857:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1979);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred4_InternalCheckCfg()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==24) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred4_InternalCheckCfg()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:870:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:870:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:870:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:871:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:876:2: ( ( ruleOpEquality ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:877:1: ( ruleOpEquality )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:877:1: ( ruleOpEquality )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:878:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2032);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:891:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:892:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:892:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:893:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2055);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:917:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:918:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:919:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2094);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2105); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:926:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:929:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:930:1: (kw= '==' | kw= '!=' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:930:1: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:931:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:938:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:951:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:952:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:953:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2202);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2212); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:960:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:963:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:964:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:964:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:965:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2259);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop12:
            do {
                int alt12=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred5_InternalCheckCfg()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalCheckCfg()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred6_InternalCheckCfg()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred6_InternalCheckCfg()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred6_InternalCheckCfg()) ) {
                        alt12=2;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:975:5: ( () otherlv_2= 'instanceof' )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:975:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:975:6: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:976:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:985:3: ( ( ruleQualifiedName ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:986:1: ( ruleQualifiedName )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:986:1: ( ruleQualifiedName )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:987:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2320);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1006:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1006:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1006:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1007:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1012:2: ( ( ruleOpCompare ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1013:1: ( ruleOpCompare )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1013:1: ( ruleOpCompare )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1014:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2381);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1027:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1028:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1028:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1029:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2404);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1053:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1054:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1055:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2444);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1062:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1065:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1066:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1066:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1067:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1074:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1081:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1088:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1101:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1102:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1103:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2590);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2600); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1110:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1113:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1114:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1114:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1115:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2647);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred7_InternalCheckCfg()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==31) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred7_InternalCheckCfg()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1128:6: ( () ( ( ruleOpOther ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1128:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1128:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1129:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1134:2: ( ( ruleOpOther ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1135:1: ( ruleOpOther )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1135:1: ( ruleOpOther )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1136:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2700);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1149:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1150:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1150:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1151:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2723);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1175:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1176:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1177:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2762);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1184:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1187:28: ( (kw= '->' | kw= '..' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1188:1: (kw= '->' | kw= '..' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1188:1: (kw= '->' | kw= '..' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1189:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1196:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1209:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1210:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1211:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2870);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2880); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1218:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1221:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1222:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1222:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1223:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2927);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred8_InternalCheckCfg()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==33) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred8_InternalCheckCfg()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1236:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1236:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1236:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1237:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1242:2: ( ( ruleOpAdd ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1243:1: ( ruleOpAdd )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1243:1: ( ruleOpAdd )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1244:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2980);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1257:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1258:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1258:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1259:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3003);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1283:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1284:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1285:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3042);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1292:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1295:28: ( (kw= '+' | kw= '-' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1296:1: (kw= '+' | kw= '-' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1296:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1297:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1304:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1317:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1318:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1319:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3150);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3160); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1326:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1329:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1330:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1330:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1331:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3207);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred9_InternalCheckCfg()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred9_InternalCheckCfg()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred9_InternalCheckCfg()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred9_InternalCheckCfg()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1344:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1344:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1344:7: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1345:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1350:2: ( ( ruleOpMulti ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1351:1: ( ruleOpMulti )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1351:1: ( ruleOpMulti )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1352:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3260);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1365:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1366:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1366:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1367:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3283);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1391:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1392:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1393:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3322);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1400:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1403:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1404:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1404:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1405:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1412:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1419:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1426:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1439:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1440:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1441:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3468);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1448:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1451:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=33)||LA20_0==38) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==13||LA20_0==16||LA20_0==29||LA20_0==43||LA20_0==47||LA20_0==49||(LA20_0>=53 && LA20_0<=55)||LA20_0==58||(LA20_0>=60 && LA20_0<=67)) ) {
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1452:3: ()
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1453:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1458:2: ( ( ruleOpUnary ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1459:1: ( ruleOpUnary )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1459:1: ( ruleOpUnary )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1460:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3536);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1473:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1474:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1474:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1475:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3557);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1493:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3586);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1509:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1510:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1511:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3622);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3633); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1518:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1521:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1522:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1522:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 33:
                {
                alt21=2;
                }
                break;
            case 32:
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1523:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1530:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1537:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1550:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1551:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1552:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3749);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1559:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1562:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1563:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1563:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1564:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3806);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalCheckCfg()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1574:5: ( () otherlv_2= 'as' )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1574:6: () otherlv_2= 'as'
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1574:6: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1575:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression3841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1584:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1585:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1585:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1586:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3864);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1610:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1611:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1612:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3902);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3912); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1619:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1622:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1623:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1623:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1624:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3959);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred11_InternalCheckCfg()) ) {
                        alt30=1;
                    }
                    else if ( (synpred12_InternalCheckCfg()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred12_InternalCheckCfg()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred12_InternalCheckCfg()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1638:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1638:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1638:26: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1639:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4008); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1648:1: ( ( ruleValidID ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1649:1: ( ruleValidID )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1649:1: ( ruleValidID )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1650:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4031);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4047);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1671:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1672:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1672:1: (lv_value_5_0= ruleXAssignment )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1673:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4069);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1706:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1706:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1706:8: ()
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1707:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1712:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1712:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4155); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1717:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1717:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1718:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1718:1: (lv_nullSafe_8_0= '?.' )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1719:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4179); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1733:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1733:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1734:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1734:1: (lv_spreading_9_0= '*.' )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1735:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4216); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1748:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==29) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1748:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4245); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1752:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1753:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1753:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1754:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4266);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1770:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==17) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1770:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4279); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1774:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1775:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1775:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1776:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4300);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4314); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1796:3: ( ( ruleValidID ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1797:1: ( ruleValidID )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1797:1: ( ruleValidID )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1798:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4339);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1811:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1811:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1811:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1811:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1818:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1819:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4373); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1849:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1850:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4458);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1867:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1867:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1867:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1867:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1868:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1868:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1869:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4486);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1885:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==17) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1885:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4499); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1889:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1890:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1890:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1891:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4520);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall4537); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1911:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1911:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1916:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1917:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4570);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1941:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1942:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1943:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4610);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4620); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1950:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1953:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1954:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1954:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt31=1;
                }
                break;
            case 13:
                {
                alt31=2;
                }
                break;
            case 49:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
            case 29:
            case 58:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 43:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt31=5;
                }
                break;
            case 47:
                {
                alt31=6;
                }
                break;
            case 53:
                {
                alt31=7;
                }
                break;
            case 54:
                {
                alt31=8;
                }
                break;
            case 55:
                {
                alt31=9;
                }
                break;
            case 65:
                {
                alt31=10;
                }
                break;
            case 66:
                {
                alt31=11;
                }
                break;
            case 67:
                {
                alt31=12;
                }
                break;
            case 16:
                {
                alt31=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1955:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4667);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1965:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4694);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1975:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4721);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1985:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4748);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1995:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4775);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2005:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4802);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2015:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4829);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2025:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4856);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2035:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4883);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2045:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4910);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2055:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4937);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2065:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4964);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2075:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4991);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2091:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2092:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2093:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5026);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2100:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2103:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2104:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2104:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 61:
            case 62:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 63:
                {
                alt32=4;
                }
                break;
            case RULE_STRING:
                {
                alt32=5;
                }
                break;
            case 64:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2105:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5083);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2115:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5110);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2125:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5137);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2135:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5164);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2145:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5191);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2155:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5218);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2171:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2172:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2173:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5253);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2180:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2183:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2184:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2184:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2184:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2184:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2185:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2209:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2209:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2209:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==16||LA34_0==70) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2209:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2209:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2210:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2210:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2211:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5380);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2227:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==17) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2227:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXClosure5393); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2231:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2232:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2232:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2233:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5414);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2249:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2250:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2250:1: (lv_explicitSyntax_5_0= '|' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2251:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2264:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2265:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2265:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2266:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5473);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2294:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2295:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2296:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5521);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5531); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2303:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2306:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2307:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2307:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2307:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2307:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2313:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==13||LA37_0==16||LA37_0==29||(LA37_0>=32 && LA37_0<=33)||LA37_0==38||LA37_0==43||LA37_0==47||LA37_0==49||(LA37_0>=53 && LA37_0<=58)||(LA37_0>=60 && LA37_0<=67)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2313:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2313:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2314:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2314:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2315:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5587);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2331:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==46) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2331:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXExpressionInClosure5600); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2343:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2344:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2345:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5640);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2352:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2355:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2356:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2356:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2356:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2356:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2356:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2372:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2372:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2372:7: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2373:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2378:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==16||LA39_0==70) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2378:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2378:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2379:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2379:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2380:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5758);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2396:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==17) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2396:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXShortClosure5771); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2400:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2401:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2401:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2402:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5792);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2418:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2419:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2419:1: (lv_explicitSyntax_4_0= '|' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2420:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2433:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2434:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2434:1: (lv_expression_5_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2435:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5850);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2459:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2460:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2461:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5886);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5896); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2468:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2471:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2472:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2472:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2472:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleXParenthesizedExpression5933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5955);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXParenthesizedExpression5966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2497:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2498:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2499:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6002);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6012); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2506:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2509:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2510:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2510:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2510:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2510:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2511:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXIfExpression6070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2524:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2525:1: (lv_if_3_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2525:1: (lv_if_3_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2526:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6091);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXIfExpression6103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2546:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2547:1: (lv_then_5_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2547:1: (lv_then_5_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2548:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6124);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred18_InternalCheckCfg()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2569:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2570:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2570:1: (lv_else_7_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2571:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6167);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2595:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2596:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2597:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6205);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6215); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2604:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2607:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2608:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2608:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2608:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2608:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==50) && (synpred19_InternalCheckCfg())) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2623:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2623:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2623:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2624:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2624:1: (lv_localVarName_2_0= ruleValidID )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2625:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6302);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2645:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2646:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2646:1: (lv_switch_4_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2647:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6338);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression6350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2667:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==16||LA42_0==50||LA42_0==52||LA42_0==70) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2668:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2668:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2669:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6371);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2685:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2685:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2693:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2694:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2694:1: (lv_default_9_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2695:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6418);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression6432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2723:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2724:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2725:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6468);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2732:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2735:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2736:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2736:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2736:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2736:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==16||LA44_0==70) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2737:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2737:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2738:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6524);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2754:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2754:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2758:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2759:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2759:1: (lv_case_2_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2760:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6559);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2780:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2781:1: (lv_then_4_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2781:1: (lv_then_4_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2782:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6594);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2806:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2807:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2808:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6630);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2815:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2818:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2819:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2819:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2819:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2819:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2820:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXForLoopExpression6698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2833:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2834:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2834:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2835:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6719);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression6731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2855:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2856:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2856:1: (lv_forExpression_5_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2857:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6752);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression6764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2877:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2878:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2878:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2879:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6785);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2903:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2904:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2905:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6821);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6831); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2912:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2915:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2916:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2916:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2916:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2916:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2917:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXWhileExpression6889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2930:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2931:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2931:1: (lv_predicate_3_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2932:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6910);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXWhileExpression6922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2952:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2953:1: (lv_body_5_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2953:1: (lv_body_5_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2954:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6943);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2978:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2979:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2980:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6979);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6989); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2987:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2990:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2991:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2991:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2991:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2991:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2992:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression7035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3001:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3002:1: (lv_body_2_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3002:1: (lv_body_2_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3003:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7056);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression7068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXDoWhileExpression7080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3027:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3028:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3028:1: (lv_predicate_5_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3029:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7101);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXDoWhileExpression7113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3057:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3058:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3059:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7149);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7159); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3066:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3069:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3070:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3070:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3070:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3070:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3071:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3080:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||LA47_0==13||LA47_0==16||LA47_0==29||(LA47_0>=32 && LA47_0<=33)||LA47_0==38||LA47_0==43||LA47_0==47||LA47_0==49||(LA47_0>=53 && LA47_0<=58)||(LA47_0>=60 && LA47_0<=67)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3080:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3080:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3081:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3081:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3082:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7227);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3098:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==46) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3098:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXBlockExpression7240); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3114:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3115:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3116:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7292);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7302); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3123:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3126:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3127:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3127:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=56 && LA48_0<=57)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==13||LA48_0==16||LA48_0==29||(LA48_0>=32 && LA48_0<=33)||LA48_0==38||LA48_0==43||LA48_0==47||LA48_0==49||(LA48_0>=53 && LA48_0<=55)||LA48_0==58||(LA48_0>=60 && LA48_0<=67)) ) {
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3128:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7349);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3138:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7376);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3154:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3155:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3156:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7411);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7421); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3163:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3166:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3167:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3167:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3167:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3167:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3168:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3173:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==56) ) {
                alt49=1;
            }
            else if ( (LA49_0==57) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3173:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3173:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3174:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3174:1: (lv_writeable_1_0= 'var' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3175:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,56,FOLLOW_56_in_ruleXVariableDeclaration7474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3189:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred20_InternalCheckCfg()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==16) && (synpred20_InternalCheckCfg())) {
                alt50=1;
            }
            else if ( (LA50_0==70) && (synpred20_InternalCheckCfg())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3201:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3201:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3201:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3202:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3202:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3203:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7553);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3219:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3220:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3220:1: (lv_name_4_0= ruleValidID )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3221:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7574);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3238:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3238:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3239:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3239:1: (lv_name_5_0= ruleValidID )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3240:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7603);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3256:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3256:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3260:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3261:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3261:1: (lv_right_7_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3262:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7638);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3286:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3287:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3288:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7676);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7686); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3295:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3298:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3299:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3299:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3299:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3299:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==29||LA52_1==40||LA52_1==43) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==16||LA52_0==70) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3300:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3300:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3301:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7732);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3317:3: ( (lv_name_1_0= ruleValidID ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3318:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3318:1: (lv_name_1_0= ruleValidID )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3319:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7754);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3343:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3344:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3345:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7790);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3352:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3355:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3356:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3356:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3356:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3356:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3357:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3357:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3358:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7846);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3374:2: ( (lv_name_1_0= ruleValidID ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3375:1: (lv_name_1_0= ruleValidID )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3375:1: (lv_name_1_0= ruleValidID )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3376:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7867);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3400:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3401:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3402:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7903);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7913); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3409:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3412:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3413:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3413:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3413:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3413:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3414:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3419:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==59) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3420:1: ( ruleStaticQualifier )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3420:1: ( ruleStaticQualifier )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3421:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7970);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3434:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3434:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3438:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3439:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3439:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3440:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8005);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3456:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==17) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3456:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall8018); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3460:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3461:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3461:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3462:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8039);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3482:3: ( ( ruleIdOrSuper ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3483:1: ( ruleIdOrSuper )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3483:1: ( ruleIdOrSuper )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3484:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8078);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3497:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3497:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3497:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3497:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3504:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3505:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3535:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3536:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8197);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3553:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3553:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3553:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3553:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3554:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3554:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3555:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8225);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3571:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==17) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3571:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall8238); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3575:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3576:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3576:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3577:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8259);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall8276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3597:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3597:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3602:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3603:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8309);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3627:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3628:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3629:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8347);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3636:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3639:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3640:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3640:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==58) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3641:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8405);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3653:2: kw= 'super'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleIdOrSuper8429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3666:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3667:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3668:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8470);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8481); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3675:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3678:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3679:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3679:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    int LA61_2 = input.LA(2);

                    if ( (LA61_2==59) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3680:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8528);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,59,FOLLOW_59_in_ruleStaticQualifier8546); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3704:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3705:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3706:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8587);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8597); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3713:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3716:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3717:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3717:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3717:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3717:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3718:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXConstructorCall8643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3727:1: ( ( ruleQualifiedName ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3728:1: ( ruleQualifiedName )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3728:1: ( ruleQualifiedName )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3729:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8666);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3742:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3742:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3746:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3747:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3747:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3748:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8700);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3764:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==17) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3764:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8713); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3768:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3769:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3769:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3770:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8734);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall8762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3811:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3812:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8834);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3829:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3829:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3829:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3829:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3830:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3830:1: (lv_arguments_10_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3831:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8862);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3847:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==17) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3847:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall8875); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3851:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3852:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3852:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3853:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8896);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall8913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3873:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3873:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3878:1: (lv_arguments_14_0= ruleXClosure )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3879:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8944);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3903:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3904:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3905:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8981);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3912:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3915:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3916:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3916:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3916:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3916:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3917:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3922:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==61) ) {
                alt67=1;
            }
            else if ( (LA67_0==62) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3922:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral9038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3927:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3927:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3928:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3928:1: (lv_isTrue_2_0= 'true' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3929:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral9062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3950:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3951:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3952:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9112);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3959:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3962:28: ( ( () otherlv_1= 'null' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3963:1: ( () otherlv_1= 'null' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3963:1: ( () otherlv_1= 'null' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3963:2: () otherlv_1= 'null'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3963:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3964:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXNullLiteral9168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3981:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3982:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3983:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9204);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9214); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3990:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3993:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3994:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3994:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3994:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3994:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3995:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4000:2: ( (lv_value_1_0= RULE_INT ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4001:1: (lv_value_1_0= RULE_INT )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4001:1: (lv_value_1_0= RULE_INT )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4002:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4026:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4027:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4028:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9306);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9316); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4035:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4038:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4039:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4039:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4039:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4039:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4040:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4045:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4046:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4046:1: (lv_value_1_0= RULE_STRING )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4047:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4071:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4072:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4073:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9408);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4080:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4083:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4084:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4084:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4084:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4084:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4085:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXTypeLiteral9464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXTypeLiteral9476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4098:1: ( ( ruleQualifiedName ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4099:1: ( ruleQualifiedName )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4099:1: ( ruleQualifiedName )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4100:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9499);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXTypeLiteral9511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4125:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4126:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4127:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9547);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4134:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4137:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4138:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4138:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4138:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4138:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXThrowExpression9603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4148:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4149:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4149:1: (lv_expression_2_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4150:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9624);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4174:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4175:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4176:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9660);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9670); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4183:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4186:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4187:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4187:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4187:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4187:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4188:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXReturnExpression9716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4197:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4197:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4202:1: (lv_expression_2_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4203:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9747);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4227:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4228:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4229:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9784);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9794); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4236:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4239:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4240:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4240:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4240:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4240:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4241:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4250:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4251:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4251:1: (lv_expression_2_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4252:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9861);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            else if ( (LA71_0==68) ) {
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==69) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred27_InternalCheckCfg()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4270:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4271:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9891);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==68) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred28_InternalCheckCfg()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9913); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4292:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4293:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4293:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4294:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9935);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4311:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4311:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4311:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4315:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4316:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4316:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4317:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4341:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4342:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4343:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10016);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4350:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4353:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4354:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4354:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4354:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4354:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4354:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleXCatchClause10071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXCatchClause10084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4363:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4364:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4364:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4365:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10105);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXCatchClause10117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4385:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4386:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4386:1: (lv_expression_4_0= ruleXExpression )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4387:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10138);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4411:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4412:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4413:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10175);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10186); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4420:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4423:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4424:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4424:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4425:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10233);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4435:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==40) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred30_InternalCheckCfg()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4435:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4435:2: ( ( '.' )=>kw= '.' )
            	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4435:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName10261); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10284);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4462:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4463:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4464:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10331);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4471:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4474:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4475:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4475:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==16||LA74_0==70) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4475:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4475:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4476:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10389);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==43) ) {
                            int LA73_2 = input.LA(2);

                            if ( (LA73_2==45) ) {
                                int LA73_3 = input.LA(3);

                                if ( (synpred31_InternalCheckCfg()) ) {
                                    alt73=1;
                                }


                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4487:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4487:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4487:6: ()
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4488:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleJvmTypeReference10427); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmTypeReference10439); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
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
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4503:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10471);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4519:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4520:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4521:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10506);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10516); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4528:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4531:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4532:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4532:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4532:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4532:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==16) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4532:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef10554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4536:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4537:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4537:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4538:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10575);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4554:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==17) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4554:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXFunctionTypeRef10588); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4558:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4559:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4559:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4560:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10609);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
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

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXFunctionTypeRef10623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleXFunctionTypeRef10637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4584:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4585:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4585:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4586:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10658);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4610:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4611:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4612:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10694);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10704); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4619:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4622:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4623:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4623:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4623:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4623:2: ( ( ruleQualifiedName ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4624:1: ( ruleQualifiedName )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4624:1: ( ruleQualifiedName )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4625:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10752);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference10773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4643:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4644:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4644:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4645:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10795);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4661:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==17) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4661:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference10808); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4665:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4666:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4666:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4667:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10829);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4695:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4696:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4697:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10881);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10891); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4704:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4707:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4708:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4708:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||LA79_0==16||LA79_0==70) ) {
                alt79=1;
            }
            else if ( (LA79_0==71) ) {
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4709:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10938);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4719:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10965);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4735:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4736:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4737:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11000);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4744:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4747:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4748:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4748:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4748:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4748:2: ()
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4749:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleJvmWildcardTypeReference11056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4758:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==72) ) {
                alt80=1;
            }
            else if ( (LA80_0==58) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4758:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4758:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4759:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4759:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4760:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11078);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4777:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4777:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4778:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4778:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4779:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11105);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4803:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4804:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4805:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11143);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11153); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4812:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4815:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4816:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4816:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4816:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBound11190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4820:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4821:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4821:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4822:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11211);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4846:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4847:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4848:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11247);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11257); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4855:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4858:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4859:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4859:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4859:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBoundAnded11294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4863:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4864:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4864:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4865:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11315);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4889:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4890:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4891:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11351);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4898:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4901:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4902:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4902:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4902:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleJvmLowerBound11398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4906:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4907:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4907:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4908:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11419);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4934:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4935:2: (iv_ruleValidID= ruleValidID EOF )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4936:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11458);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11469); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4943:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4946:28: (this_ID_0= RULE_ID )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4947:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleSeverityKind"
    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4962:1: ruleSeverityKind returns [Enumerator current=null] : ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warning' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'ignore' ) ) ;
    public final Enumerator ruleSeverityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4964:28: ( ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warning' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'ignore' ) ) )
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4965:1: ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warning' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'ignore' ) )
            {
            // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4965:1: ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warning' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'ignore' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt81=1;
                }
                break;
            case 75:
                {
                alt81=2;
                }
                break;
            case 76:
                {
                alt81=3;
                }
                break;
            case 77:
                {
                alt81=4;
                }
                break;
            case 78:
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
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4965:2: (enumLiteral_0= 'inherit' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4965:2: (enumLiteral_0= 'inherit' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4965:4: enumLiteral_0= 'inherit'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleSeverityKind11566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSeverityKindAccess().getInheritEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSeverityKindAccess().getInheritEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4971:6: (enumLiteral_1= 'error' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4971:6: (enumLiteral_1= 'error' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4971:8: enumLiteral_1= 'error'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleSeverityKind11583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSeverityKindAccess().getErrorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSeverityKindAccess().getErrorEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4977:6: (enumLiteral_2= 'warning' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4977:6: (enumLiteral_2= 'warning' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4977:8: enumLiteral_2= 'warning'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleSeverityKind11600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSeverityKindAccess().getWarningEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSeverityKindAccess().getWarningEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4983:6: (enumLiteral_3= 'info' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4983:6: (enumLiteral_3= 'info' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4983:8: enumLiteral_3= 'info'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleSeverityKind11617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSeverityKindAccess().getInfoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSeverityKindAccess().getInfoEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4989:6: (enumLiteral_4= 'ignore' )
                    {
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4989:6: (enumLiteral_4= 'ignore' )
                    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4989:8: enumLiteral_4= 'ignore'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleSeverityKind11634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSeverityKindAccess().getIgnoreEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSeverityKindAccess().getIgnoreEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleSeverityKind"

    // $ANTLR start synpred1_InternalCheckCfg
    public final void synpred1_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:535:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:536:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:536:2: ( ( ruleOpMultiAssign ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:537:1: ( ruleOpMultiAssign )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:537:1: ( ruleOpMultiAssign )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:538:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalCheckCfg1134);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalCheckCfg

    // $ANTLR start synpred2_InternalCheckCfg
    public final void synpred2_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:4: ( () ( ( ruleOpOr ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:5: () ( ( ruleOpOr ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:663:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:664:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:664:2: ( ( ruleOpOr ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:665:1: ( ruleOpOr )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:665:1: ( ruleOpOr )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:666:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalCheckCfg1482);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalCheckCfg

    // $ANTLR start synpred3_InternalCheckCfg
    public final void synpred3_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:4: ( () ( ( ruleOpAnd ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:5: () ( ( ruleOpAnd ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:764:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:765:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:765:2: ( ( ruleOpAnd ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:766:1: ( ruleOpAnd )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:766:1: ( ruleOpAnd )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:767:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalCheckCfg1741);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCheckCfg

    // $ANTLR start synpred4_InternalCheckCfg
    public final void synpred4_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:4: ( () ( ( ruleOpEquality ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:5: () ( ( ruleOpEquality ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:865:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:866:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:866:2: ( ( ruleOpEquality ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:867:1: ( ruleOpEquality )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:867:1: ( ruleOpEquality )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:868:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalCheckCfg2000);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCheckCfg

    // $ANTLR start synpred5_InternalCheckCfg
    public final void synpred5_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:4: ( ( () 'instanceof' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:5: ( () 'instanceof' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:5: ( () 'instanceof' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:6: () 'instanceof'
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:973:6: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:974:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalCheckCfg2276); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalCheckCfg

    // $ANTLR start synpred6_InternalCheckCfg
    public final void synpred6_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:9: ( () ( ( ruleOpCompare ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:10: () ( ( ruleOpCompare ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1001:10: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1002:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1002:2: ( ( ruleOpCompare ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1003:1: ( ruleOpCompare )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1003:1: ( ruleOpCompare )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1004:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalCheckCfg2349);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalCheckCfg

    // $ANTLR start synpred7_InternalCheckCfg
    public final void synpred7_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:4: ( () ( ( ruleOpOther ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:5: () ( ( ruleOpOther ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1123:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1124:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1124:2: ( ( ruleOpOther ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1125:1: ( ruleOpOther )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1125:1: ( ruleOpOther )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1126:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalCheckCfg2668);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalCheckCfg

    // $ANTLR start synpred8_InternalCheckCfg
    public final void synpred8_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:4: ( () ( ( ruleOpAdd ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:5: () ( ( ruleOpAdd ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1231:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1232:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1232:2: ( ( ruleOpAdd ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1233:1: ( ruleOpAdd )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1233:1: ( ruleOpAdd )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1234:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalCheckCfg2948);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalCheckCfg

    // $ANTLR start synpred9_InternalCheckCfg
    public final void synpred9_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:4: ( () ( ( ruleOpMulti ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:5: () ( ( ruleOpMulti ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1339:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1340:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1340:2: ( ( ruleOpMulti ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1341:1: ( ruleOpMulti )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1341:1: ( ruleOpMulti )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1342:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalCheckCfg3228);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalCheckCfg

    // $ANTLR start synpred10_InternalCheckCfg
    public final void synpred10_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:3: ( ( () 'as' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:4: ( () 'as' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:4: ( () 'as' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:5: () 'as'
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1572:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1573:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred10_InternalCheckCfg3822); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalCheckCfg

    // $ANTLR start synpred11_InternalCheckCfg
    public final void synpred11_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1632:6: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1633:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred11_InternalCheckCfg3976); if (state.failed) return ;
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1634:1: ( ( ruleValidID ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1635:1: ( ruleValidID )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1635:1: ( ruleValidID )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1636:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalCheckCfg3985);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalCheckCfg3991);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalCheckCfg

    // $ANTLR start synpred12_InternalCheckCfg
    public final void synpred12_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1690:10: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1691:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1691:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt82=3;
        switch ( input.LA(1) ) {
        case 40:
            {
            alt82=1;
            }
            break;
        case 41:
            {
            alt82=2;
            }
            break;
        case 42:
            {
            alt82=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 82, 0, input);

            throw nvae;
        }

        switch (alt82) {
            case 1 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1691:4: '.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalCheckCfg4094); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1693:6: ( ( '?.' ) )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1693:6: ( ( '?.' ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1694:1: ( '?.' )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1694:1: ( '?.' )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1695:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalCheckCfg4108); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1700:6: ( ( '*.' ) )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1700:6: ( ( '*.' ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1701:1: ( '*.' )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1701:1: ( '*.' )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1702:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalCheckCfg4128); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalCheckCfg

    // $ANTLR start synpred13_InternalCheckCfg
    public final void synpred13_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1811:4: ( ( '(' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1812:1: ( '(' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1812:1: ( '(' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1813:2: '('
        {
        match(input,16,FOLLOW_16_in_synpred13_InternalCheckCfg4355); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalCheckCfg

    // $ANTLR start synpred14_InternalCheckCfg
    public final void synpred14_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1832:6: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1833:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1833:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==16||LA84_0==70) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1833:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1833:3: ( ( ruleJvmFormalParameter ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1834:1: ( ruleJvmFormalParameter )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1834:1: ( ruleJvmFormalParameter )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1835:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalCheckCfg4407);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1837:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==17) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1837:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred14_InternalCheckCfg4414); if (state.failed) return ;
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1838:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1839:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1839:1: ( ruleJvmFormalParameter )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1840:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalCheckCfg4421);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1842:6: ( ( '|' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1843:1: ( '|' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1843:1: ( '|' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1844:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred14_InternalCheckCfg4435); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalCheckCfg

    // $ANTLR start synpred15_InternalCheckCfg
    public final void synpred15_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1911:4: ( ( ruleXClosure ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1912:1: ( ruleXClosure )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1912:1: ( ruleXClosure )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:1913:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalCheckCfg4553);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalCheckCfg

    // $ANTLR start synpred16_InternalCheckCfg
    public final void synpred16_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==16||LA86_0==70) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2194:5: ( ( ruleJvmFormalParameter ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2195:1: ( ruleJvmFormalParameter )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2195:1: ( ruleJvmFormalParameter )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2196:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCheckCfg5326);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2198:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==17) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2198:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred16_InternalCheckCfg5333); if (state.failed) return ;
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2199:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2200:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2200:1: ( ruleJvmFormalParameter )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2201:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCheckCfg5340);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2203:6: ( ( '|' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2204:1: ( '|' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2204:1: ( '|' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2205:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred16_InternalCheckCfg5354); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalCheckCfg

    // $ANTLR start synpred18_InternalCheckCfg
    public final void synpred18_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:4: ( 'else' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2564:6: 'else'
        {
        match(input,48,FOLLOW_48_in_synpred18_InternalCheckCfg6137); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalCheckCfg

    // $ANTLR start synpred19_InternalCheckCfg
    public final void synpred19_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:3: ( ( ( ruleValidID ) ) ':' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:4: ( ( ruleValidID ) ) ':'
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2618:4: ( ( ruleValidID ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2619:1: ( ruleValidID )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2619:1: ( ruleValidID )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:2620:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalCheckCfg6277);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,50,FOLLOW_50_in_synpred19_InternalCheckCfg6283); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalCheckCfg

    // $ANTLR start synpred20_InternalCheckCfg
    public final void synpred20_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3193:6: ( ( ruleJvmTypeReference ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3194:1: ( ruleJvmTypeReference )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3194:1: ( ruleJvmTypeReference )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3195:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalCheckCfg7523);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3197:2: ( ( ruleValidID ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3198:1: ( ruleValidID )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3198:1: ( ruleValidID )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3199:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalCheckCfg7532);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalCheckCfg

    // $ANTLR start synpred21_InternalCheckCfg
    public final void synpred21_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3497:4: ( ( '(' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3498:1: ( '(' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3498:1: ( '(' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3499:2: '('
        {
        match(input,16,FOLLOW_16_in_synpred21_InternalCheckCfg8094); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalCheckCfg

    // $ANTLR start synpred22_InternalCheckCfg
    public final void synpred22_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3518:6: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3519:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3519:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==16||LA90_0==70) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3519:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3519:3: ( ( ruleJvmFormalParameter ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3520:1: ( ruleJvmFormalParameter )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3520:1: ( ruleJvmFormalParameter )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3521:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalCheckCfg8146);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3523:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==17) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3523:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred22_InternalCheckCfg8153); if (state.failed) return ;
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3524:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3525:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3525:1: ( ruleJvmFormalParameter )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3526:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalCheckCfg8160);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3528:6: ( ( '|' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3529:1: ( '|' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3529:1: ( '|' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3530:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred22_InternalCheckCfg8174); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalCheckCfg

    // $ANTLR start synpred23_InternalCheckCfg
    public final void synpred23_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3597:4: ( ( ruleXClosure ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3598:1: ( ruleXClosure )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3598:1: ( ruleXClosure )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3599:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalCheckCfg8292);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalCheckCfg

    // $ANTLR start synpred24_InternalCheckCfg
    public final void synpred24_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3794:5: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3795:1: 
        {
        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3795:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==16||LA92_0==70) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3795:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3795:3: ( ( ruleJvmFormalParameter ) )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3796:1: ( ruleJvmFormalParameter )
                {
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3796:1: ( ruleJvmFormalParameter )
                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3797:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalCheckCfg8783);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3799:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==17) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3799:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred24_InternalCheckCfg8790); if (state.failed) return ;
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3800:1: ( ( ruleJvmFormalParameter ) )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3801:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3801:1: ( ruleJvmFormalParameter )
                	    // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3802:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalCheckCfg8797);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3804:6: ( ( '|' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3805:1: ( '|' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3805:1: ( '|' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3806:2: '|'
        {
        match(input,44,FOLLOW_44_in_synpred24_InternalCheckCfg8811); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalCheckCfg

    // $ANTLR start synpred25_InternalCheckCfg
    public final void synpred25_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3873:2: ( ( ruleXClosure ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3874:1: ( ruleXClosure )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3874:1: ( ruleXClosure )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:3875:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalCheckCfg8927);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalCheckCfg

    // $ANTLR start synpred26_InternalCheckCfg
    public final void synpred26_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4197:2: ( ( ruleXExpression ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4198:1: ( ruleXExpression )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4198:1: ( ruleXExpression )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4199:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalCheckCfg9730);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalCheckCfg

    // $ANTLR start synpred27_InternalCheckCfg
    public final void synpred27_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:5: ( 'catch' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4268:7: 'catch'
        {
        match(input,69,FOLLOW_69_in_synpred27_InternalCheckCfg9875); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalCheckCfg

    // $ANTLR start synpred28_InternalCheckCfg
    public final void synpred28_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:5: ( 'finally' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4287:7: 'finally'
        {
        match(input,68,FOLLOW_68_in_synpred28_InternalCheckCfg9905); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalCheckCfg

    // $ANTLR start synpred30_InternalCheckCfg
    public final void synpred30_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4435:3: ( '.' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4436:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred30_InternalCheckCfg10252); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalCheckCfg

    // $ANTLR start synpred31_InternalCheckCfg
    public final void synpred31_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:2: ( ( () '[' ']' ) )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:3: ( () '[' ']' )
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:3: ( () '[' ']' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:4: () '[' ']'
        {
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4484:4: ()
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4485:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred31_InternalCheckCfg10404); if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred31_InternalCheckCfg10408); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalCheckCfg

    // $ANTLR start synpred32_InternalCheckCfg
    public final void synpred32_InternalCheckCfg_fragment() throws RecognitionException {   
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:4: ( '<' )
        // ../com.avaloq.tools.dslsdk.checkcfg.core/src-gen/com/avaloq/tools/dslsdk/checkcfg/parser/antlr/internal/InternalCheckCfg.g:4638:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred32_InternalCheckCfg10765); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalCheckCfg

    // Delegated rules

    public final boolean synpred25_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCheckCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCheckCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA28_eotS =
        "\74\uffff";
    static final String DFA28_eofS =
        "\1\2\73\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA28_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\1\1\2\2\1\uffff\30\2\1\uffff\16\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1811:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\34\uffff";
    static final String DFA27_eofS =
        "\34\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA27_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1832:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==16) ) {s = 2;}

                        else if ( (LA27_0==70) && (synpred14_InternalCheckCfg())) {s = 3;}

                        else if ( (LA27_0==44) && (synpred14_InternalCheckCfg())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_INT)||LA27_0==13||LA27_0==29||(LA27_0>=32 && LA27_0<=33)||LA27_0==38||LA27_0==43||LA27_0==47||LA27_0==49||(LA27_0>=53 && LA27_0<=55)||LA27_0==58||(LA27_0>=60 && LA27_0<=67)) ) {s = 5;}

                        else if ( (LA27_0==18) ) {s = 27;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\74\uffff";
    static final String DFA29_eofS =
        "\1\2\73\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA29_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\3\2\1\uffff\27\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1911:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\36\uffff";
    static final String DFA35_eofS =
        "\36\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA35_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\5\1\1\6\uffff\1\5\2\uffff\1\2\14\uffff\1\5\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2194:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==16) ) {s = 2;}

                        else if ( (LA35_0==70) && (synpred16_InternalCheckCfg())) {s = 3;}

                        else if ( (LA35_0==44) && (synpred16_InternalCheckCfg())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||LA35_0==13||LA35_0==29||(LA35_0>=32 && LA35_0<=33)||LA35_0==38||LA35_0==43||LA35_0==45||LA35_0==47||LA35_0==49||(LA35_0>=53 && LA35_0<=58)||(LA35_0>=60 && LA35_0<=67)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\74\uffff";
    static final String DFA58_eofS =
        "\1\2\73\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA58_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA58_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\1\1\2\2\1\uffff\30\2\1\uffff\16\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3497:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\34\uffff";
    static final String DFA57_eofS =
        "\34\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA57_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3518:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==16) ) {s = 2;}

                        else if ( (LA57_0==70) && (synpred22_InternalCheckCfg())) {s = 3;}

                        else if ( (LA57_0==44) && (synpred22_InternalCheckCfg())) {s = 4;}

                        else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_INT)||LA57_0==13||LA57_0==29||(LA57_0>=32 && LA57_0<=33)||LA57_0==38||LA57_0==43||LA57_0==47||LA57_0==49||(LA57_0>=53 && LA57_0<=55)||LA57_0==58||(LA57_0>=60 && LA57_0<=67)) ) {s = 5;}

                        else if ( (LA57_0==18) ) {s = 27;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\74\uffff";
    static final String DFA59_eofS =
        "\1\2\73\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA59_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA59_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\3\2\1\uffff\27\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3597:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\34\uffff";
    static final String DFA65_eofS =
        "\34\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA65_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA65_transitionS = {
            "\2\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3794:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==16) ) {s = 2;}

                        else if ( (LA65_0==70) && (synpred24_InternalCheckCfg())) {s = 3;}

                        else if ( (LA65_0==44) && (synpred24_InternalCheckCfg())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_INT)||LA65_0==13||LA65_0==29||(LA65_0>=32 && LA65_0<=33)||LA65_0==38||LA65_0==43||LA65_0==47||LA65_0==49||(LA65_0>=53 && LA65_0<=55)||LA65_0==58||(LA65_0>=60 && LA65_0<=67)) ) {s = 5;}

                        else if ( (LA65_0==18) ) {s = 27;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalCheckCfg()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\74\uffff";
    static final String DFA66_eofS =
        "\1\2\73\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA66_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA66_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\3\2\1\uffff\27\2\1\1\1\uffff\16\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3873:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\74\uffff";
    static final String DFA68_eofS =
        "\1\31\73\uffff";
    static final String DFA68_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA68_maxS =
        "\1\106\30\0\43\uffff";
    static final String DFA68_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\17\1\15\1\1\6\uffff\1\6\1\31\1\uffff\1\30\2\31\1\uffff\11"+
            "\31\1\10\2\31\1\4\1\3\4\31\1\2\4\31\1\12\1\uffff\2\31\1\21\1"+
            "\31\1\7\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14"+
            "\1\16\1\20\1\25\1\26\1\27\3\31",
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
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "4197:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\74\uffff";
    static final String DFA78_eofS =
        "\1\2\73\uffff";
    static final String DFA78_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA78_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA78_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\3\2\1\uffff\11\2\1\1\16\2\1\uffff"+
            "\16\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4638:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCheckCfg()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleCheckConfiguration_in_entryRuleCheckConfiguration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckConfiguration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCheckConfiguration122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheckConfiguration134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckConfiguration151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCheckConfiguration168 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleConfiguredCatalog_in_ruleCheckConfiguration189 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCheckConfiguration202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguredCatalog_in_entryRuleConfiguredCatalog238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguredCatalog248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConfiguredCatalog294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConfiguredCatalog317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguredCatalog329 = new BitSet(new long[]{0x0000000000004000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_ruleConfiguredCheck_in_ruleConfiguredCatalog350 = new BitSet(new long[]{0x0000000000004000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_14_in_ruleConfiguredCatalog363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguredCheck_in_entryRuleConfiguredCheck399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguredCheck409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeverityKind_in_ruleConfiguredCheck464 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConfiguredCheck487 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConfiguredCheck500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleConfiguredParameter_in_ruleConfiguredCheck521 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleConfiguredCheck534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleConfiguredParameter_in_ruleConfiguredCheck555 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleConfiguredCheck569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguredParameter_in_entryRuleConfiguredParameter607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguredParameter617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleConfiguredParameter674 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConfiguredParameter686 = new BitSet(new long[]{0x6000000000000030L});
    public static final BitSet FOLLOW_ruleXFormalParameterDefaultValueLiteral_in_ruleConfiguredParameter707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFormalParameterDefaultValueLiteral_in_entryRuleXFormalParameterDefaultValueLiteral743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFormalParameterDefaultValueLiteral753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXFormalParameterDefaultValueLiteral800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXFormalParameterDefaultValueLiteral827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXFormalParameterDefaultValueLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1063 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1113 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1166 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1461 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1514 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1537 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1720 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1773 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1796 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1979 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2032 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2055 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2259 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2320 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2381 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2404 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2647 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2700 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2723 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2927 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2980 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3003 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3207 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3260 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3283 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3536 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3806 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression3841 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3864 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3959 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4031 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4047 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4069 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4155 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4179 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4216 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4245 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4266 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4279 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4300 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4339 = new BitSet(new long[]{0x00000F0000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4373 = new BitSet(new long[]{0xF4E2984320052070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4458 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4486 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4499 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4520 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall4537 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4570 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5309 = new BitSet(new long[]{0xF7E2B84320012070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5380 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_ruleXClosure5393 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5414 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5436 = new BitSet(new long[]{0xF7E2A84320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5473 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5587 = new BitSet(new long[]{0xF7E2C84320012072L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_ruleXExpressionInClosure5600 = new BitSet(new long[]{0xF7E2884320012072L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5758 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_ruleXShortClosure5771 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5792 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5814 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXParenthesizedExpression5933 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5955 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXParenthesizedExpression5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXIfExpression6070 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6091 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXIfExpression6103 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6124 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6145 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6261 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6302 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6314 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6338 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression6350 = new BitSet(new long[]{0x0014000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6371 = new BitSet(new long[]{0x001C000000014040L,0x0000000000000040L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6385 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6397 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6418 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6524 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6538 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6559 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6573 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXForLoopExpression6698 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6719 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression6731 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression6764 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXWhileExpression6889 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXWhileExpression6922 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression7035 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7056 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression7068 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXDoWhileExpression7080 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXDoWhileExpression7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7205 = new BitSet(new long[]{0xF7E2884320016070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7227 = new BitSet(new long[]{0xF7E2C84320016070L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_ruleXBlockExpression7240 = new BitSet(new long[]{0xF7E2884320016070L,0x000000000000000FL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXVariableDeclaration7474 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7505 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7574 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7603 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7617 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7732 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7846 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7970 = new BitSet(new long[]{0x0400000020000040L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7984 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8005 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall8018 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8039 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8053 = new BitSet(new long[]{0x0400000020000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8078 = new BitSet(new long[]{0x0000080000010002L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8112 = new BitSet(new long[]{0xF4E2984320052070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8225 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall8238 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8259 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall8276 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleIdOrSuper8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8528 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleStaticQualifier8546 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXConstructorCall8643 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8666 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8679 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8700 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8713 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8734 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8748 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall8762 = new BitSet(new long[]{0xF4E2984320052070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8862 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall8875 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8896 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall8913 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXNullLiteral9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXTypeLiteral9464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXTypeLiteral9476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXTypeLiteral9511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXThrowExpression9603 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXReturnExpression9716 = new BitSet(new long[]{0xF4E2884320012072L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9840 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9913 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9957 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXCatchClause10071 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXCatchClause10084 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10105 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCatchClause10117 = new BitSet(new long[]{0xF4E2884320012070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10233 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName10261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10284 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10389 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleJvmTypeReference10427 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmTypeReference10439 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef10554 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10575 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleXFunctionTypeRef10588 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10609 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleXFunctionTypeRef10623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXFunctionTypeRef10637 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10752 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference10773 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10795 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference10808 = new BitSet(new long[]{0x0000000000010040L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10829 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmWildcardTypeReference11056 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBound11190 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBoundAnded11294 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleJvmLowerBound11398 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSeverityKind11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSeverityKind11583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSeverityKind11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleSeverityKind11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSeverityKind11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalCheckCfg1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalCheckCfg1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalCheckCfg1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalCheckCfg2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalCheckCfg2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalCheckCfg2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalCheckCfg2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalCheckCfg2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalCheckCfg3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred10_InternalCheckCfg3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred11_InternalCheckCfg3976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalCheckCfg3985 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalCheckCfg3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalCheckCfg4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalCheckCfg4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalCheckCfg4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred13_InternalCheckCfg4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalCheckCfg4407 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_synpred14_InternalCheckCfg4414 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalCheckCfg4421 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalCheckCfg4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalCheckCfg4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCheckCfg5326 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_synpred16_InternalCheckCfg5333 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCheckCfg5340 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalCheckCfg5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalCheckCfg6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalCheckCfg6277 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred19_InternalCheckCfg6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalCheckCfg7523 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalCheckCfg7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred21_InternalCheckCfg8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalCheckCfg8146 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_synpred22_InternalCheckCfg8153 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalCheckCfg8160 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_synpred22_InternalCheckCfg8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalCheckCfg8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalCheckCfg8783 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_17_in_synpred24_InternalCheckCfg8790 = new BitSet(new long[]{0x0000000000010040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalCheckCfg8797 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalCheckCfg8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalCheckCfg8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalCheckCfg9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred27_InternalCheckCfg9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred28_InternalCheckCfg9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred30_InternalCheckCfg10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred31_InternalCheckCfg10404 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalCheckCfg10408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred32_InternalCheckCfg10765 = new BitSet(new long[]{0x0000000000000002L});

}