package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMwe2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_20", "KEYWORD_18", "KEYWORD_19", "KEYWORD_17", "KEYWORD_16", "KEYWORD_14", "KEYWORD_15", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=24;
    public static final int RULE_ANY_OTHER=28;
    public static final int KEYWORD_1=16;
    public static final int KEYWORD_19=6;
    public static final int KEYWORD_17=7;
    public static final int KEYWORD_18=5;
    public static final int KEYWORD_5=20;
    public static final int KEYWORD_15=10;
    public static final int KEYWORD_16=8;
    public static final int KEYWORD_4=19;
    public static final int KEYWORD_13=15;
    public static final int KEYWORD_3=18;
    public static final int KEYWORD_14=9;
    public static final int KEYWORD_2=17;
    public static final int KEYWORD_11=13;
    public static final int KEYWORD_12=14;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=26;
    public static final int KEYWORD_10=12;
    public static final int RULE_ML_COMMENT=25;
    public static final int KEYWORD_6=21;
    public static final int KEYWORD_7=22;
    public static final int KEYWORD_8=23;
    public static final int KEYWORD_9=11;
    public static final int KEYWORD_20=4;
    public static final int RULE_WS=27;

    // delegates
    // delegators


        public InternalMwe2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMwe2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMwe2Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g"; }


     
     	private Mwe2GrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'\"'");
    		tokenNameToValue.put("KEYWORD_2", "'\''");
    		tokenNameToValue.put("KEYWORD_3", "'.'");
    		tokenNameToValue.put("KEYWORD_4", "':'");
    		tokenNameToValue.put("KEYWORD_5", "'='");
    		tokenNameToValue.put("KEYWORD_6", "'@'");
    		tokenNameToValue.put("KEYWORD_7", "'{'");
    		tokenNameToValue.put("KEYWORD_8", "'}'");
    		tokenNameToValue.put("KEYWORD_9", "'\u0024{'");
    		tokenNameToValue.put("KEYWORD_10", "'.*'");
    		tokenNameToValue.put("KEYWORD_11", "'\\\"'");
    		tokenNameToValue.put("KEYWORD_12", "'\\\''");
    		tokenNameToValue.put("KEYWORD_13", "'\\\\'");
    		tokenNameToValue.put("KEYWORD_14", "'\\\u0024{'");
    		tokenNameToValue.put("KEYWORD_15", "'var'");
    		tokenNameToValue.put("KEYWORD_16", "'true'");
    		tokenNameToValue.put("KEYWORD_17", "'false'");
    		tokenNameToValue.put("KEYWORD_18", "'import'");
    		tokenNameToValue.put("KEYWORD_19", "'module'");
    		tokenNameToValue.put("KEYWORD_20", "'auto-inject'");
     	}
     	
        public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModule"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:83:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:84:1: ( ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:85:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule54);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:92:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:96:5: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:97:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:97:1: ( ( rule__Module__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:98:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:99:1: ( rule__Module__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:99:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule91);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDeclaredProperty"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:111:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:112:1: ( ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:113:1: ruleDeclaredProperty EOF
            {
             before(grammarAccess.getDeclaredPropertyRule()); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty118);
            ruleDeclaredProperty();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredProperty125); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredProperty"


    // $ANTLR start "ruleDeclaredProperty"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:120:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:124:5: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:125:1: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:125:1: ( ( rule__DeclaredProperty__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:126:1: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:127:1: ( rule__DeclaredProperty__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:127:2: rule__DeclaredProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__0_in_ruleDeclaredProperty155);
            rule__DeclaredProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredProperty"


    // $ANTLR start "entryRuleRootComponent"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:139:1: entryRuleRootComponent : ruleRootComponent EOF ;
    public final void entryRuleRootComponent() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:140:1: ( ruleRootComponent EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:141:1: ruleRootComponent EOF
            {
             before(grammarAccess.getRootComponentRule()); 
            pushFollow(FOLLOW_ruleRootComponent_in_entryRuleRootComponent182);
            ruleRootComponent();

            state._fsp--;

             after(grammarAccess.getRootComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootComponent189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootComponent"


    // $ANTLR start "ruleRootComponent"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:148:1: ruleRootComponent : ( ( rule__RootComponent__Group__0 ) ) ;
    public final void ruleRootComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:152:5: ( ( ( rule__RootComponent__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:153:1: ( ( rule__RootComponent__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:153:1: ( ( rule__RootComponent__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:154:1: ( rule__RootComponent__Group__0 )
            {
             before(grammarAccess.getRootComponentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:155:1: ( rule__RootComponent__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:155:2: rule__RootComponent__Group__0
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__0_in_ruleRootComponent219);
            rule__RootComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootComponent"


    // $ANTLR start "entryRuleComponent"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:167:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:168:1: ( ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:169:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent246);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:176:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:180:5: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:181:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:181:1: ( ( rule__Component__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:182:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:183:1: ( rule__Component__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:183:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent283);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:195:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:196:1: ( ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:197:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport310);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:204:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:208:5: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:209:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:209:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:210:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:211:1: ( rule__Import__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:211:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport347);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:223:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:224:1: ( ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:225:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN374);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN381); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:232:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:236:5: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:237:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:237:1: ( ( rule__ImportedFQN__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:238:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:239:1: ( rule__ImportedFQN__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:239:2: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN411);
            rule__ImportedFQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleAssignment"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:251:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:252:1: ( ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:253:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment438);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:260:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:264:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:265:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:265:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:266:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:267:1: ( rule__Assignment__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:267:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment475);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:279:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:280:1: ( ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:281:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue502);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:288:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:292:5: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:293:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:293:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:294:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:295:1: ( rule__Value__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:295:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue539);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:307:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:308:1: ( ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:309:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral566);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral573); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:316:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:320:5: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:321:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:321:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:322:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:323:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:323:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral603);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleReference"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:335:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:336:1: ( ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:337:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference630);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference637); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:344:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:348:5: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:349:1: ( ( rule__Reference__ReferableAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:349:1: ( ( rule__Reference__ReferableAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:350:1: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:351:1: ( rule__Reference__ReferableAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:351:2: rule__Reference__ReferableAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ReferableAssignment_in_ruleReference667);
            rule__Reference__ReferableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFQN"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:363:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:364:1: ( ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:365:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN694);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN701); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:372:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:376:5: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:377:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:377:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:378:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:379:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:379:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN731);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:391:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:395:1: ( ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:396:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral763);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral770); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:406:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:411:5: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:412:1: ( ( rule__StringLiteral__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:412:1: ( ( rule__StringLiteral__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:413:1: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:414:1: ( rule__StringLiteral__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:414:2: rule__StringLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral804);
            rule__StringLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:427:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:431:1: ( rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:432:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference836);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference843); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:442:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:447:5: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:448:1: ( ( rule__PropertyReference__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:448:1: ( ( rule__PropertyReference__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:449:1: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:450:1: ( rule__PropertyReference__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:450:2: rule__PropertyReference__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyReference__Group__0_in_rulePropertyReference877);
            rule__PropertyReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRulePropertyReferenceImpl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:463:1: entryRulePropertyReferenceImpl : rulePropertyReferenceImpl EOF ;
    public final void entryRulePropertyReferenceImpl() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:467:1: ( rulePropertyReferenceImpl EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:468:1: rulePropertyReferenceImpl EOF
            {
             before(grammarAccess.getPropertyReferenceImplRule()); 
            pushFollow(FOLLOW_rulePropertyReferenceImpl_in_entryRulePropertyReferenceImpl909);
            rulePropertyReferenceImpl();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReferenceImpl916); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePropertyReferenceImpl"


    // $ANTLR start "rulePropertyReferenceImpl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:478:1: rulePropertyReferenceImpl : ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) ;
    public final void rulePropertyReferenceImpl() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:483:5: ( ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:484:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:484:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:485:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:486:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:486:2: rule__PropertyReferenceImpl__ReferableAssignment
            {
            pushFollow(FOLLOW_rule__PropertyReferenceImpl__ReferableAssignment_in_rulePropertyReferenceImpl950);
            rule__PropertyReferenceImpl__ReferableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePropertyReferenceImpl"


    // $ANTLR start "entryRulePlainString"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:499:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:500:1: ( rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:501:1: rulePlainString EOF
            {
             before(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString977);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getPlainStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString984); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlainString"


    // $ANTLR start "rulePlainString"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:508:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:512:5: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:513:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:513:1: ( ( rule__PlainString__ValueAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:514:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:515:1: ( rule__PlainString__ValueAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:515:2: rule__PlainString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1014);
            rule__PlainString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPlainStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlainString"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:527:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:528:1: ( ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:529:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue1041);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue1048); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:536:1: ruleConstantValue : ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:540:5: ( ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:541:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:541:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:542:1: ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:542:1: ( ( rule__ConstantValue__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:543:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:544:1: ( rule__ConstantValue__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:544:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1080);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }

            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:547:1: ( ( rule__ConstantValue__Alternatives )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:548:1: ( rule__ConstantValue__Alternatives )*
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:549:1: ( rule__ConstantValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_14||(LA1_0>=KEYWORD_11 && LA1_0<=KEYWORD_13)||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:549:2: rule__ConstantValue__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1092);
            	    rule__ConstantValue__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "rule__RootComponent__Alternatives_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:562:1: rule__RootComponent__Alternatives_1 : ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) );
    public final void rule__RootComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:566:1: ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==KEYWORD_6) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:567:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:567:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:568:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:569:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:569:2: rule__RootComponent__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__RootComponent__TypeAssignment_1_0_in_rule__RootComponent__Alternatives_11131);
                    rule__RootComponent__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:573:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:573:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:574:1: ( rule__RootComponent__Group_1_1__0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getGroup_1_1()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:575:1: ( rule__RootComponent__Group_1_1__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:575:2: rule__RootComponent__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__RootComponent__Group_1_1__0_in_rule__RootComponent__Alternatives_11149);
                    rule__RootComponent__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootComponentAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Alternatives_1"


    // $ANTLR start "rule__Component__Alternatives_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:584:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:588:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==KEYWORD_6) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:589:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:589:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:590:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:591:1: ( rule__Component__TypeAssignment_1_0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:591:2: rule__Component__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_11182);
                    rule__Component__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:595:6: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:595:6: ( ( rule__Component__Group_1_1__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:596:1: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:597:1: ( rule__Component__Group_1_1__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:597:2: rule__Component__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_1_1__0_in_rule__Component__Alternatives_11200);
                    rule__Component__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:606:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:610:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:611:1: ( ruleComponent )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:611:1: ( ruleComponent )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:612:1: ruleComponent
                    {
                     before(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__Value__Alternatives1233);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:617:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:617:6: ( ruleStringLiteral )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:618:1: ruleStringLiteral
                    {
                     before(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1250);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:623:6: ( ruleBooleanLiteral )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:623:6: ( ruleBooleanLiteral )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:624:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1267);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:629:6: ( ruleReference )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:629:6: ( ruleReference )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:630:1: ruleReference
                    {
                     before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1284);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__Alternatives_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:640:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( KEYWORD_17 ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:644:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( KEYWORD_17 ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_16) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:645:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:645:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:646:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:647:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:647:2: rule__BooleanLiteral__IsTrueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BooleanLiteral__IsTrueAssignment_1_0_in_rule__BooleanLiteral__Alternatives_11316);
                    rule__BooleanLiteral__IsTrueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:651:6: ( KEYWORD_17 )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:651:6: ( KEYWORD_17 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:652:1: KEYWORD_17
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); 
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__BooleanLiteral__Alternatives_11335); 
                     after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Alternatives_1"


    // $ANTLR start "rule__StringLiteral__Alternatives"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:664:1: rule__StringLiteral__Alternatives : ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:668:1: ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_2) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_1) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:669:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:669:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:670:1: ( rule__StringLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:671:1: ( rule__StringLiteral__Group_0__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:671:2: rule__StringLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__Group_0__0_in_rule__StringLiteral__Alternatives1369);
                    rule__StringLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:675:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:675:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:676:1: ( rule__StringLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:677:1: ( rule__StringLiteral__Group_1__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:677:2: rule__StringLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__Group_1__0_in_rule__StringLiteral__Alternatives1387);
                    rule__StringLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Alternatives"


    // $ANTLR start "rule__ConstantValue__Alternatives"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:686:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( KEYWORD_12 ) | ( KEYWORD_11 ) | ( KEYWORD_14 ) | ( KEYWORD_13 ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:690:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( KEYWORD_12 ) | ( KEYWORD_11 ) | ( KEYWORD_14 ) | ( KEYWORD_13 ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt7=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case KEYWORD_12:
                {
                alt7=4;
                }
                break;
            case KEYWORD_11:
                {
                alt7=5;
                }
                break;
            case KEYWORD_14:
                {
                alt7=6;
                }
                break;
            case KEYWORD_13:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:691:1: ( RULE_WS )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:691:1: ( RULE_WS )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:692:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives1420); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:697:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:697:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:698:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives1437); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:703:6: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:703:6: ( RULE_ID )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:704:1: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantValue__Alternatives1454); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:709:6: ( KEYWORD_12 )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:709:6: ( KEYWORD_12 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:710:1: KEYWORD_12
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__ConstantValue__Alternatives1472); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:717:6: ( KEYWORD_11 )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:717:6: ( KEYWORD_11 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:718:1: KEYWORD_11
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__ConstantValue__Alternatives1492); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:725:6: ( KEYWORD_14 )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:725:6: ( KEYWORD_14 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:726:1: KEYWORD_14
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__ConstantValue__Alternatives1512); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:733:6: ( KEYWORD_13 )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:733:6: ( KEYWORD_13 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:734:1: KEYWORD_13
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); 
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ConstantValue__Alternatives1532); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantValue__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:748:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:752:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:753:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01564);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01567);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:760:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:764:1: ( ( () ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:765:1: ( () )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:765:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:766:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:767:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:769:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:779:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:783:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:784:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11625);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11628);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:791:1: rule__Module__Group__1__Impl : ( KEYWORD_19 ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:795:1: ( ( KEYWORD_19 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:796:1: ( KEYWORD_19 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:796:1: ( KEYWORD_19 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:797:1: KEYWORD_19
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__Module__Group__1__Impl1656); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:810:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:814:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:815:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21687);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21690);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:822:1: rule__Module__Group__2__Impl : ( ( rule__Module__CanonicalNameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:826:1: ( ( ( rule__Module__CanonicalNameAssignment_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:827:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:827:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:828:1: ( rule__Module__CanonicalNameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:829:1: ( rule__Module__CanonicalNameAssignment_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:829:2: rule__Module__CanonicalNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__CanonicalNameAssignment_2_in_rule__Module__Group__2__Impl1717);
            rule__Module__CanonicalNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:839:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:843:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:844:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31747);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31750);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:851:1: rule__Module__Group__3__Impl : ( ( rule__Module__ImportsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:855:1: ( ( ( rule__Module__ImportsAssignment_3 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:856:1: ( ( rule__Module__ImportsAssignment_3 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:856:1: ( ( rule__Module__ImportsAssignment_3 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:857:1: ( rule__Module__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:858:1: ( rule__Module__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:858:2: rule__Module__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__ImportsAssignment_3_in_rule__Module__Group__3__Impl1777);
            	    rule__Module__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:868:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:872:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:873:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41808);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41811);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:880:1: rule__Module__Group__4__Impl : ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:884:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:885:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:885:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:886:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:887:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:887:2: rule__Module__DeclaredPropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Module__DeclaredPropertiesAssignment_4_in_rule__Module__Group__4__Impl1838);
            	    rule__Module__DeclaredPropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:897:1: rule__Module__Group__5 : rule__Module__Group__5__Impl ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:901:1: ( rule__Module__Group__5__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:902:2: rule__Module__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51869);
            rule__Module__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:908:1: rule__Module__Group__5__Impl : ( ( rule__Module__RootAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:912:1: ( ( ( rule__Module__RootAssignment_5 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:913:1: ( ( rule__Module__RootAssignment_5 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:913:1: ( ( rule__Module__RootAssignment_5 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:914:1: ( rule__Module__RootAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_5()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:915:1: ( rule__Module__RootAssignment_5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:915:2: rule__Module__RootAssignment_5
            {
            pushFollow(FOLLOW_rule__Module__RootAssignment_5_in_rule__Module__Group__5__Impl1896);
            rule__Module__RootAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getRootAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:937:1: rule__DeclaredProperty__Group__0 : rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:941:1: ( rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:942:2: rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__0__Impl_in_rule__DeclaredProperty__Group__01938);
            rule__DeclaredProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__1_in_rule__DeclaredProperty__Group__01941);
            rule__DeclaredProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__0"


    // $ANTLR start "rule__DeclaredProperty__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:949:1: rule__DeclaredProperty__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__DeclaredProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:953:1: ( ( KEYWORD_15 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:954:1: ( KEYWORD_15 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:954:1: ( KEYWORD_15 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:955:1: KEYWORD_15
            {
             before(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); 
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__DeclaredProperty__Group__0__Impl1969); 
             after(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__0__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:968:1: rule__DeclaredProperty__Group__1 : rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:972:1: ( rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:973:2: rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__1__Impl_in_rule__DeclaredProperty__Group__12000);
            rule__DeclaredProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__2_in_rule__DeclaredProperty__Group__12003);
            rule__DeclaredProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__1"


    // $ANTLR start "rule__DeclaredProperty__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:980:1: rule__DeclaredProperty__Group__1__Impl : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) ;
    public final void rule__DeclaredProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:984:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:985:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:985:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:986:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:987:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:987:2: rule__DeclaredProperty__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DeclaredProperty__TypeAssignment_1_in_rule__DeclaredProperty__Group__1__Impl2030);
                    rule__DeclaredProperty__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__1__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:997:1: rule__DeclaredProperty__Group__2 : rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1001:1: ( rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1002:2: rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__2__Impl_in_rule__DeclaredProperty__Group__22061);
            rule__DeclaredProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__3_in_rule__DeclaredProperty__Group__22064);
            rule__DeclaredProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__2"


    // $ANTLR start "rule__DeclaredProperty__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1009:1: rule__DeclaredProperty__Group__2__Impl : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) ;
    public final void rule__DeclaredProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1013:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1014:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1014:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1015:1: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1016:1: ( rule__DeclaredProperty__NameAssignment_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1016:2: rule__DeclaredProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__NameAssignment_2_in_rule__DeclaredProperty__Group__2__Impl2091);
            rule__DeclaredProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__2__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1026:1: rule__DeclaredProperty__Group__3 : rule__DeclaredProperty__Group__3__Impl ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1030:1: ( rule__DeclaredProperty__Group__3__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1031:2: rule__DeclaredProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__3__Impl_in_rule__DeclaredProperty__Group__32121);
            rule__DeclaredProperty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__3"


    // $ANTLR start "rule__DeclaredProperty__Group__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1037:1: rule__DeclaredProperty__Group__3__Impl : ( ( rule__DeclaredProperty__Group_3__0 )? ) ;
    public final void rule__DeclaredProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1041:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1042:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1042:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1043:1: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1044:1: ( rule__DeclaredProperty__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_5) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1044:2: rule__DeclaredProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__0_in_rule__DeclaredProperty__Group__3__Impl2148);
                    rule__DeclaredProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__3__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group_3__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1062:1: rule__DeclaredProperty__Group_3__0 : rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1066:1: ( rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1067:2: rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__0__Impl_in_rule__DeclaredProperty__Group_3__02187);
            rule__DeclaredProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__1_in_rule__DeclaredProperty__Group_3__02190);
            rule__DeclaredProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__0"


    // $ANTLR start "rule__DeclaredProperty__Group_3__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1074:1: rule__DeclaredProperty__Group_3__0__Impl : ( KEYWORD_5 ) ;
    public final void rule__DeclaredProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1078:1: ( ( KEYWORD_5 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1079:1: ( KEYWORD_5 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1079:1: ( KEYWORD_5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1080:1: KEYWORD_5
            {
             before(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__DeclaredProperty__Group_3__0__Impl2218); 
             after(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__0__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group_3__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1093:1: rule__DeclaredProperty__Group_3__1 : rule__DeclaredProperty__Group_3__1__Impl ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1097:1: ( rule__DeclaredProperty__Group_3__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1098:2: rule__DeclaredProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__1__Impl_in_rule__DeclaredProperty__Group_3__12249);
            rule__DeclaredProperty__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__1"


    // $ANTLR start "rule__DeclaredProperty__Group_3__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1104:1: rule__DeclaredProperty__Group_3__1__Impl : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1108:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1109:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1109:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1110:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1111:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1111:2: rule__DeclaredProperty__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__DefaultAssignment_3_1_in_rule__DeclaredProperty__Group_3__1__Impl2276);
            rule__DeclaredProperty__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__1__Impl"


    // $ANTLR start "rule__RootComponent__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1125:1: rule__RootComponent__Group__0 : rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 ;
    public final void rule__RootComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1129:1: ( rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1130:2: rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__0__Impl_in_rule__RootComponent__Group__02310);
            rule__RootComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__1_in_rule__RootComponent__Group__02313);
            rule__RootComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__0"


    // $ANTLR start "rule__RootComponent__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1137:1: rule__RootComponent__Group__0__Impl : ( () ) ;
    public final void rule__RootComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1141:1: ( ( () ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1142:1: ( () )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1142:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1143:1: ()
            {
             before(grammarAccess.getRootComponentAccess().getComponentAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1144:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1146:1: 
            {
            }

             after(grammarAccess.getRootComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__0__Impl"


    // $ANTLR start "rule__RootComponent__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1156:1: rule__RootComponent__Group__1 : rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 ;
    public final void rule__RootComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1160:1: ( rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1161:2: rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__1__Impl_in_rule__RootComponent__Group__12371);
            rule__RootComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__2_in_rule__RootComponent__Group__12374);
            rule__RootComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__1"


    // $ANTLR start "rule__RootComponent__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1168:1: rule__RootComponent__Group__1__Impl : ( ( rule__RootComponent__Alternatives_1 ) ) ;
    public final void rule__RootComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1172:1: ( ( ( rule__RootComponent__Alternatives_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1173:1: ( ( rule__RootComponent__Alternatives_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1173:1: ( ( rule__RootComponent__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1174:1: ( rule__RootComponent__Alternatives_1 )
            {
             before(grammarAccess.getRootComponentAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1175:1: ( rule__RootComponent__Alternatives_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1175:2: rule__RootComponent__Alternatives_1
            {
            pushFollow(FOLLOW_rule__RootComponent__Alternatives_1_in_rule__RootComponent__Group__1__Impl2401);
            rule__RootComponent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__1__Impl"


    // $ANTLR start "rule__RootComponent__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1185:1: rule__RootComponent__Group__2 : rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 ;
    public final void rule__RootComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1189:1: ( rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1190:2: rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__2__Impl_in_rule__RootComponent__Group__22431);
            rule__RootComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__3_in_rule__RootComponent__Group__22434);
            rule__RootComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__2"


    // $ANTLR start "rule__RootComponent__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1197:1: rule__RootComponent__Group__2__Impl : ( ( rule__RootComponent__Group_2__0 )? ) ;
    public final void rule__RootComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1201:1: ( ( ( rule__RootComponent__Group_2__0 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1202:1: ( ( rule__RootComponent__Group_2__0 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1202:1: ( ( rule__RootComponent__Group_2__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1203:1: ( rule__RootComponent__Group_2__0 )?
            {
             before(grammarAccess.getRootComponentAccess().getGroup_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1204:1: ( rule__RootComponent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_4) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1204:2: rule__RootComponent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RootComponent__Group_2__0_in_rule__RootComponent__Group__2__Impl2461);
                    rule__RootComponent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__2__Impl"


    // $ANTLR start "rule__RootComponent__Group__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1214:1: rule__RootComponent__Group__3 : rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 ;
    public final void rule__RootComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1218:1: ( rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1219:2: rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__3__Impl_in_rule__RootComponent__Group__32492);
            rule__RootComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__4_in_rule__RootComponent__Group__32495);
            rule__RootComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__3"


    // $ANTLR start "rule__RootComponent__Group__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1226:1: rule__RootComponent__Group__3__Impl : ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) ;
    public final void rule__RootComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1230:1: ( ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1231:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1231:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1232:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1233:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1233:2: rule__RootComponent__AutoInjectAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RootComponent__AutoInjectAssignment_3_in_rule__RootComponent__Group__3__Impl2522);
                    rule__RootComponent__AutoInjectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__3__Impl"


    // $ANTLR start "rule__RootComponent__Group__4"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1243:1: rule__RootComponent__Group__4 : rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 ;
    public final void rule__RootComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1247:1: ( rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1248:2: rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__4__Impl_in_rule__RootComponent__Group__42553);
            rule__RootComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__5_in_rule__RootComponent__Group__42556);
            rule__RootComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__4"


    // $ANTLR start "rule__RootComponent__Group__4__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1255:1: rule__RootComponent__Group__4__Impl : ( KEYWORD_7 ) ;
    public final void rule__RootComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1259:1: ( ( KEYWORD_7 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1260:1: ( KEYWORD_7 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1260:1: ( KEYWORD_7 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1261:1: KEYWORD_7
            {
             before(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__RootComponent__Group__4__Impl2584); 
             after(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__4__Impl"


    // $ANTLR start "rule__RootComponent__Group__5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1274:1: rule__RootComponent__Group__5 : rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 ;
    public final void rule__RootComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1278:1: ( rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1279:2: rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__5__Impl_in_rule__RootComponent__Group__52615);
            rule__RootComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group__6_in_rule__RootComponent__Group__52618);
            rule__RootComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__5"


    // $ANTLR start "rule__RootComponent__Group__5__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1286:1: rule__RootComponent__Group__5__Impl : ( ( rule__RootComponent__AssignmentAssignment_5 )* ) ;
    public final void rule__RootComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1290:1: ( ( ( rule__RootComponent__AssignmentAssignment_5 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1291:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1291:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1292:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1293:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1293:2: rule__RootComponent__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__RootComponent__AssignmentAssignment_5_in_rule__RootComponent__Group__5__Impl2645);
            	    rule__RootComponent__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__5__Impl"


    // $ANTLR start "rule__RootComponent__Group__6"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1303:1: rule__RootComponent__Group__6 : rule__RootComponent__Group__6__Impl ;
    public final void rule__RootComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1307:1: ( rule__RootComponent__Group__6__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1308:2: rule__RootComponent__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RootComponent__Group__6__Impl_in_rule__RootComponent__Group__62676);
            rule__RootComponent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__6"


    // $ANTLR start "rule__RootComponent__Group__6__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1314:1: rule__RootComponent__Group__6__Impl : ( KEYWORD_8 ) ;
    public final void rule__RootComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1318:1: ( ( KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1319:1: ( KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1319:1: ( KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1320:1: KEYWORD_8
            {
             before(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__RootComponent__Group__6__Impl2704); 
             after(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__6__Impl"


    // $ANTLR start "rule__RootComponent__Group_1_1__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1347:1: rule__RootComponent__Group_1_1__0 : rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 ;
    public final void rule__RootComponent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1351:1: ( rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1352:2: rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__RootComponent__Group_1_1__0__Impl_in_rule__RootComponent__Group_1_1__02749);
            rule__RootComponent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group_1_1__1_in_rule__RootComponent__Group_1_1__02752);
            rule__RootComponent__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__0"


    // $ANTLR start "rule__RootComponent__Group_1_1__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1359:1: rule__RootComponent__Group_1_1__0__Impl : ( KEYWORD_6 ) ;
    public final void rule__RootComponent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1363:1: ( ( KEYWORD_6 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1364:1: ( KEYWORD_6 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1364:1: ( KEYWORD_6 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1365:1: KEYWORD_6
            {
             before(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); 
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__RootComponent__Group_1_1__0__Impl2780); 
             after(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__0__Impl"


    // $ANTLR start "rule__RootComponent__Group_1_1__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1378:1: rule__RootComponent__Group_1_1__1 : rule__RootComponent__Group_1_1__1__Impl ;
    public final void rule__RootComponent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1382:1: ( rule__RootComponent__Group_1_1__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1383:2: rule__RootComponent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RootComponent__Group_1_1__1__Impl_in_rule__RootComponent__Group_1_1__12811);
            rule__RootComponent__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__1"


    // $ANTLR start "rule__RootComponent__Group_1_1__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1389:1: rule__RootComponent__Group_1_1__1__Impl : ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__RootComponent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1393:1: ( ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1394:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1394:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1395:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1396:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1396:2: rule__RootComponent__ModuleAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__RootComponent__ModuleAssignment_1_1_1_in_rule__RootComponent__Group_1_1__1__Impl2838);
            rule__RootComponent__ModuleAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__1__Impl"


    // $ANTLR start "rule__RootComponent__Group_2__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1410:1: rule__RootComponent__Group_2__0 : rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 ;
    public final void rule__RootComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1414:1: ( rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1415:2: rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1
            {
            pushFollow(FOLLOW_rule__RootComponent__Group_2__0__Impl_in_rule__RootComponent__Group_2__02872);
            rule__RootComponent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootComponent__Group_2__1_in_rule__RootComponent__Group_2__02875);
            rule__RootComponent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__0"


    // $ANTLR start "rule__RootComponent__Group_2__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1422:1: rule__RootComponent__Group_2__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__RootComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1426:1: ( ( KEYWORD_4 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1427:1: ( KEYWORD_4 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1427:1: ( KEYWORD_4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1428:1: KEYWORD_4
            {
             before(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__RootComponent__Group_2__0__Impl2903); 
             after(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__0__Impl"


    // $ANTLR start "rule__RootComponent__Group_2__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1441:1: rule__RootComponent__Group_2__1 : rule__RootComponent__Group_2__1__Impl ;
    public final void rule__RootComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1445:1: ( rule__RootComponent__Group_2__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1446:2: rule__RootComponent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RootComponent__Group_2__1__Impl_in_rule__RootComponent__Group_2__12934);
            rule__RootComponent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__1"


    // $ANTLR start "rule__RootComponent__Group_2__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1452:1: rule__RootComponent__Group_2__1__Impl : ( ( rule__RootComponent__NameAssignment_2_1 ) ) ;
    public final void rule__RootComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1456:1: ( ( ( rule__RootComponent__NameAssignment_2_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1457:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1457:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1458:1: ( rule__RootComponent__NameAssignment_2_1 )
            {
             before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1459:1: ( rule__RootComponent__NameAssignment_2_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1459:2: rule__RootComponent__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RootComponent__NameAssignment_2_1_in_rule__RootComponent__Group_2__1__Impl2961);
            rule__RootComponent__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1473:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1477:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1478:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02995);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02998);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1485:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1489:1: ( ( () ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1490:1: ( () )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1490:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1491:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1492:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1494:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1504:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1508:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1509:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__13056);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13059);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1516:1: rule__Component__Group__1__Impl : ( ( rule__Component__Alternatives_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1520:1: ( ( ( rule__Component__Alternatives_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1521:1: ( ( rule__Component__Alternatives_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1521:1: ( ( rule__Component__Alternatives_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1522:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1523:1: ( rule__Component__Alternatives_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_6||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1523:2: rule__Component__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__1__Impl3086);
                    rule__Component__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1533:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1537:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1538:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__23117);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23120);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1545:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1549:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1550:1: ( ( rule__Component__Group_2__0 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1550:1: ( ( rule__Component__Group_2__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1551:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1552:1: ( rule__Component__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_4) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1552:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__2__Impl3147);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1562:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1566:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1567:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__33178);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__33181);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1574:1: rule__Component__Group__3__Impl : ( ( rule__Component__AutoInjectAssignment_3 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1578:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1579:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1579:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1580:1: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1581:1: ( rule__Component__AutoInjectAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1581:2: rule__Component__AutoInjectAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Component__AutoInjectAssignment_3_in_rule__Component__Group__3__Impl3208);
                    rule__Component__AutoInjectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1591:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1595:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1596:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__43239);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__43242);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1603:1: rule__Component__Group__4__Impl : ( KEYWORD_7 ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1607:1: ( ( KEYWORD_7 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1608:1: ( KEYWORD_7 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1608:1: ( KEYWORD_7 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1609:1: KEYWORD_7
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__Component__Group__4__Impl3270); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1622:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1626:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1627:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__53301);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__53304);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1634:1: rule__Component__Group__5__Impl : ( ( rule__Component__AssignmentAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1638:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1639:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1639:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1640:1: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1641:1: ( rule__Component__AssignmentAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1641:2: rule__Component__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__AssignmentAssignment_5_in_rule__Component__Group__5__Impl3331);
            	    rule__Component__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1651:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1655:1: ( rule__Component__Group__6__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1656:2: rule__Component__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__63362);
            rule__Component__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1662:1: rule__Component__Group__6__Impl : ( KEYWORD_8 ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1666:1: ( ( KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1667:1: ( KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1667:1: ( KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1668:1: KEYWORD_8
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Component__Group__6__Impl3390); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group_1_1__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1695:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1699:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1700:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Component__Group_1_1__0__Impl_in_rule__Component__Group_1_1__03435);
            rule__Component__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_1_1__1_in_rule__Component__Group_1_1__03438);
            rule__Component__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0"


    // $ANTLR start "rule__Component__Group_1_1__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1707:1: rule__Component__Group_1_1__0__Impl : ( KEYWORD_6 ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1711:1: ( ( KEYWORD_6 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1712:1: ( KEYWORD_6 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1712:1: ( KEYWORD_6 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1713:1: KEYWORD_6
            {
             before(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Component__Group_1_1__0__Impl3466); 
             after(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0__Impl"


    // $ANTLR start "rule__Component__Group_1_1__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1726:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1730:1: ( rule__Component__Group_1_1__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1731:2: rule__Component__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_1_1__1__Impl_in_rule__Component__Group_1_1__13497);
            rule__Component__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__1"


    // $ANTLR start "rule__Component__Group_1_1__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1737:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1741:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1742:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1742:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1743:1: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1744:1: ( rule__Component__ModuleAssignment_1_1_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1744:2: rule__Component__ModuleAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Component__ModuleAssignment_1_1_1_in_rule__Component__Group_1_1__1__Impl3524);
            rule__Component__ModuleAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__1__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1758:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1762:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1763:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_rule__Component__Group_2__0__Impl_in_rule__Component__Group_2__03558);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03561);
            rule__Component__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1770:1: rule__Component__Group_2__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1774:1: ( ( KEYWORD_4 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1775:1: ( KEYWORD_4 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1775:1: ( KEYWORD_4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1776:1: KEYWORD_4
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_2_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Component__Group_2__0__Impl3589); 
             after(grammarAccess.getComponentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1789:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1793:1: ( rule__Component__Group_2__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1794:2: rule__Component__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_2__1__Impl_in_rule__Component__Group_2__13620);
            rule__Component__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1800:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1804:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1805:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1805:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1806:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1807:1: ( rule__Component__NameAssignment_2_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1807:2: rule__Component__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__1__Impl3647);
            rule__Component__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1821:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1825:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1826:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03681);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03684);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1833:1: rule__Import__Group__0__Impl : ( KEYWORD_18 ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1837:1: ( ( KEYWORD_18 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1838:1: ( KEYWORD_18 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1838:1: ( KEYWORD_18 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1839:1: KEYWORD_18
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__Import__Group__0__Impl3712); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1852:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1856:1: ( rule__Import__Group__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1857:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13743);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1863:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1867:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1868:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1868:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1869:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1870:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1870:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3770);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1884:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1888:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1889:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__0__Impl_in_rule__ImportedFQN__Group__03804);
            rule__ImportedFQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03807);
            rule__ImportedFQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0"


    // $ANTLR start "rule__ImportedFQN__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1896:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1900:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1901:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1901:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1902:1: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__0__Impl3834);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1913:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1917:1: ( rule__ImportedFQN__Group__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1918:2: rule__ImportedFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__1__Impl_in_rule__ImportedFQN__Group__13863);
            rule__ImportedFQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1"


    // $ANTLR start "rule__ImportedFQN__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1924:1: rule__ImportedFQN__Group__1__Impl : ( ( KEYWORD_10 )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1928:1: ( ( ( KEYWORD_10 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1929:1: ( ( KEYWORD_10 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1929:1: ( ( KEYWORD_10 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1930:1: ( KEYWORD_10 )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1931:1: ( KEYWORD_10 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_10) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1932:2: KEYWORD_10
                    {
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__ImportedFQN__Group__1__Impl3892); 

                    }
                    break;

            }

             after(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1947:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1951:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1952:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03929);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03932);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1959:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__FeatureAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1963:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1964:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1964:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1965:1: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1966:1: ( rule__Assignment__FeatureAssignment_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1966:2: rule__Assignment__FeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__FeatureAssignment_0_in_rule__Assignment__Group__0__Impl3959);
            rule__Assignment__FeatureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1976:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1980:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1981:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13989);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13992);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1988:1: rule__Assignment__Group__1__Impl : ( KEYWORD_5 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1992:1: ( ( KEYWORD_5 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1993:1: ( KEYWORD_5 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1993:1: ( KEYWORD_5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:1994:1: KEYWORD_5
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Assignment__Group__1__Impl4020); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2007:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2011:1: ( rule__Assignment__Group__2__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2012:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24051);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2018:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2022:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2023:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2023:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2024:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2025:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2025:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4078);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2041:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2045:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2046:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__04114);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__04117);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2053:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2057:1: ( ( () ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2058:1: ( () )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2058:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2059:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2060:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2062:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2072:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2076:1: ( rule__BooleanLiteral__Group__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2077:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__14175);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2083:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2087:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2088:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2088:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2089:1: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2090:1: ( rule__BooleanLiteral__Alternatives_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2090:2: rule__BooleanLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_1_in_rule__BooleanLiteral__Group__1__Impl4202);
            rule__BooleanLiteral__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2104:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2108:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2109:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04236);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04239);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2116:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2120:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2121:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2121:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2122:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4266); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2133:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2137:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2138:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14295);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2144:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2148:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2149:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2149:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2150:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2151:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==KEYWORD_3) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2151:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4322);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2165:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2169:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2170:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04357);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04360);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2177:1: rule__FQN__Group_1__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2181:1: ( ( KEYWORD_3 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2182:1: ( KEYWORD_3 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2182:1: ( KEYWORD_3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2183:1: KEYWORD_3
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__FQN__Group_1__0__Impl4388); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2196:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2200:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2201:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14419);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2207:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2211:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2212:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2212:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2213:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4446); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2228:1: rule__StringLiteral__Group_0__0 : rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 ;
    public final void rule__StringLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2232:1: ( rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2233:2: rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0__0__Impl_in_rule__StringLiteral__Group_0__04479);
            rule__StringLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_0__1_in_rule__StringLiteral__Group_0__04482);
            rule__StringLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__0"


    // $ANTLR start "rule__StringLiteral__Group_0__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2240:1: rule__StringLiteral__Group_0__0__Impl : ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) ;
    public final void rule__StringLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2244:1: ( ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2245:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2245:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2246:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2247:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2247:2: rule__StringLiteral__BeginAssignment_0_0
            {
            pushFollow(FOLLOW_rule__StringLiteral__BeginAssignment_0_0_in_rule__StringLiteral__Group_0__0__Impl4509);
            rule__StringLiteral__BeginAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2257:1: rule__StringLiteral__Group_0__1 : rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 ;
    public final void rule__StringLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2261:1: ( rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2262:2: rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0__1__Impl_in_rule__StringLiteral__Group_0__14539);
            rule__StringLiteral__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_0__2_in_rule__StringLiteral__Group_0__14542);
            rule__StringLiteral__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__1"


    // $ANTLR start "rule__StringLiteral__Group_0__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2269:1: rule__StringLiteral__Group_0__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) ;
    public final void rule__StringLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2273:1: ( ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2274:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2274:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2275:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2276:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_14||(LA21_0>=KEYWORD_11 && LA21_0<=KEYWORD_13)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2276:2: rule__StringLiteral__PartsAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_0_1_in_rule__StringLiteral__Group_0__1__Impl4569);
                    rule__StringLiteral__PartsAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2286:1: rule__StringLiteral__Group_0__2 : rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 ;
    public final void rule__StringLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2290:1: ( rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2291:2: rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0__2__Impl_in_rule__StringLiteral__Group_0__24600);
            rule__StringLiteral__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_0__3_in_rule__StringLiteral__Group_0__24603);
            rule__StringLiteral__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__2"


    // $ANTLR start "rule__StringLiteral__Group_0__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2298:1: rule__StringLiteral__Group_0__2__Impl : ( ( rule__StringLiteral__Group_0_2__0 )* ) ;
    public final void rule__StringLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2302:1: ( ( ( rule__StringLiteral__Group_0_2__0 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2303:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2303:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2304:1: ( rule__StringLiteral__Group_0_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2305:1: ( rule__StringLiteral__Group_0_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_9) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2305:2: rule__StringLiteral__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringLiteral__Group_0_2__0_in_rule__StringLiteral__Group_0__2__Impl4630);
            	    rule__StringLiteral__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2315:1: rule__StringLiteral__Group_0__3 : rule__StringLiteral__Group_0__3__Impl ;
    public final void rule__StringLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2319:1: ( rule__StringLiteral__Group_0__3__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2320:2: rule__StringLiteral__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0__3__Impl_in_rule__StringLiteral__Group_0__34661);
            rule__StringLiteral__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__3"


    // $ANTLR start "rule__StringLiteral__Group_0__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2326:1: rule__StringLiteral__Group_0__3__Impl : ( ( rule__StringLiteral__EndAssignment_0_3 ) ) ;
    public final void rule__StringLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2330:1: ( ( ( rule__StringLiteral__EndAssignment_0_3 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2331:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2331:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2332:1: ( rule__StringLiteral__EndAssignment_0_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2333:1: ( rule__StringLiteral__EndAssignment_0_3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2333:2: rule__StringLiteral__EndAssignment_0_3
            {
            pushFollow(FOLLOW_rule__StringLiteral__EndAssignment_0_3_in_rule__StringLiteral__Group_0__3__Impl4688);
            rule__StringLiteral__EndAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__3__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0_2__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2351:1: rule__StringLiteral__Group_0_2__0 : rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 ;
    public final void rule__StringLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2355:1: ( rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2356:2: rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0_2__0__Impl_in_rule__StringLiteral__Group_0_2__04726);
            rule__StringLiteral__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_0_2__1_in_rule__StringLiteral__Group_0_2__04729);
            rule__StringLiteral__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__0"


    // $ANTLR start "rule__StringLiteral__Group_0_2__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2363:1: rule__StringLiteral__Group_0_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) ;
    public final void rule__StringLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2367:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2368:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2368:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2369:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2370:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2370:2: rule__StringLiteral__PartsAssignment_0_2_0
            {
            pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_0_2_0_in_rule__StringLiteral__Group_0_2__0__Impl4756);
            rule__StringLiteral__PartsAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0_2__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2380:1: rule__StringLiteral__Group_0_2__1 : rule__StringLiteral__Group_0_2__1__Impl ;
    public final void rule__StringLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2384:1: ( rule__StringLiteral__Group_0_2__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2385:2: rule__StringLiteral__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_0_2__1__Impl_in_rule__StringLiteral__Group_0_2__14786);
            rule__StringLiteral__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__1"


    // $ANTLR start "rule__StringLiteral__Group_0_2__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2391:1: rule__StringLiteral__Group_0_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) ;
    public final void rule__StringLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2395:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2396:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2396:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2397:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2398:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_14||(LA23_0>=KEYWORD_11 && LA23_0<=KEYWORD_13)||LA23_0==RULE_ID||(LA23_0>=RULE_WS && LA23_0<=RULE_ANY_OTHER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2398:2: rule__StringLiteral__PartsAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_0_2_1_in_rule__StringLiteral__Group_0_2__1__Impl4813);
                    rule__StringLiteral__PartsAssignment_0_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2412:1: rule__StringLiteral__Group_1__0 : rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 ;
    public final void rule__StringLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2416:1: ( rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2417:2: rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1__0__Impl_in_rule__StringLiteral__Group_1__04848);
            rule__StringLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_1__1_in_rule__StringLiteral__Group_1__04851);
            rule__StringLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__0"


    // $ANTLR start "rule__StringLiteral__Group_1__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2424:1: rule__StringLiteral__Group_1__0__Impl : ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) ;
    public final void rule__StringLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2428:1: ( ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2429:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2429:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2430:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2431:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2431:2: rule__StringLiteral__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringLiteral__BeginAssignment_1_0_in_rule__StringLiteral__Group_1__0__Impl4878);
            rule__StringLiteral__BeginAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2441:1: rule__StringLiteral__Group_1__1 : rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 ;
    public final void rule__StringLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2445:1: ( rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2446:2: rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1__1__Impl_in_rule__StringLiteral__Group_1__14908);
            rule__StringLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_1__2_in_rule__StringLiteral__Group_1__14911);
            rule__StringLiteral__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__1"


    // $ANTLR start "rule__StringLiteral__Group_1__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2453:1: rule__StringLiteral__Group_1__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) ;
    public final void rule__StringLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2457:1: ( ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2458:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2458:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2459:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2460:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_14||(LA24_0>=KEYWORD_11 && LA24_0<=KEYWORD_13)||LA24_0==RULE_ID||(LA24_0>=RULE_WS && LA24_0<=RULE_ANY_OTHER)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2460:2: rule__StringLiteral__PartsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_1_1_in_rule__StringLiteral__Group_1__1__Impl4938);
                    rule__StringLiteral__PartsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2470:1: rule__StringLiteral__Group_1__2 : rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 ;
    public final void rule__StringLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2474:1: ( rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2475:2: rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1__2__Impl_in_rule__StringLiteral__Group_1__24969);
            rule__StringLiteral__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_1__3_in_rule__StringLiteral__Group_1__24972);
            rule__StringLiteral__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__2"


    // $ANTLR start "rule__StringLiteral__Group_1__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2482:1: rule__StringLiteral__Group_1__2__Impl : ( ( rule__StringLiteral__Group_1_2__0 )* ) ;
    public final void rule__StringLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2486:1: ( ( ( rule__StringLiteral__Group_1_2__0 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2487:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2487:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2488:1: ( rule__StringLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2489:1: ( rule__StringLiteral__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_9) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2489:2: rule__StringLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringLiteral__Group_1_2__0_in_rule__StringLiteral__Group_1__2__Impl4999);
            	    rule__StringLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2499:1: rule__StringLiteral__Group_1__3 : rule__StringLiteral__Group_1__3__Impl ;
    public final void rule__StringLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2503:1: ( rule__StringLiteral__Group_1__3__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2504:2: rule__StringLiteral__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1__3__Impl_in_rule__StringLiteral__Group_1__35030);
            rule__StringLiteral__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__3"


    // $ANTLR start "rule__StringLiteral__Group_1__3__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2510:1: rule__StringLiteral__Group_1__3__Impl : ( ( rule__StringLiteral__EndAssignment_1_3 ) ) ;
    public final void rule__StringLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2514:1: ( ( ( rule__StringLiteral__EndAssignment_1_3 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2515:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2515:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2516:1: ( rule__StringLiteral__EndAssignment_1_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2517:1: ( rule__StringLiteral__EndAssignment_1_3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2517:2: rule__StringLiteral__EndAssignment_1_3
            {
            pushFollow(FOLLOW_rule__StringLiteral__EndAssignment_1_3_in_rule__StringLiteral__Group_1__3__Impl5057);
            rule__StringLiteral__EndAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__3__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1_2__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2535:1: rule__StringLiteral__Group_1_2__0 : rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 ;
    public final void rule__StringLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2539:1: ( rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2540:2: rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1_2__0__Impl_in_rule__StringLiteral__Group_1_2__05095);
            rule__StringLiteral__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group_1_2__1_in_rule__StringLiteral__Group_1_2__05098);
            rule__StringLiteral__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__0"


    // $ANTLR start "rule__StringLiteral__Group_1_2__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2547:1: rule__StringLiteral__Group_1_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) ;
    public final void rule__StringLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2551:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2552:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2552:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2553:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2554:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2554:2: rule__StringLiteral__PartsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_1_2_0_in_rule__StringLiteral__Group_1_2__0__Impl5125);
            rule__StringLiteral__PartsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1_2__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2564:1: rule__StringLiteral__Group_1_2__1 : rule__StringLiteral__Group_1_2__1__Impl ;
    public final void rule__StringLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2568:1: ( rule__StringLiteral__Group_1_2__1__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2569:2: rule__StringLiteral__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group_1_2__1__Impl_in_rule__StringLiteral__Group_1_2__15155);
            rule__StringLiteral__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__1"


    // $ANTLR start "rule__StringLiteral__Group_1_2__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2575:1: rule__StringLiteral__Group_1_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) ;
    public final void rule__StringLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2579:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2580:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2580:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2581:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2582:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_14||(LA26_0>=KEYWORD_11 && LA26_0<=KEYWORD_13)||LA26_0==RULE_ID||(LA26_0>=RULE_WS && LA26_0<=RULE_ANY_OTHER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2582:2: rule__StringLiteral__PartsAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_rule__StringLiteral__PartsAssignment_1_2_1_in_rule__StringLiteral__Group_1_2__1__Impl5182);
                    rule__StringLiteral__PartsAssignment_1_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__1__Impl"


    // $ANTLR start "rule__PropertyReference__Group__0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2596:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2600:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2601:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyReference__Group__0__Impl_in_rule__PropertyReference__Group__05217);
            rule__PropertyReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReference__Group__1_in_rule__PropertyReference__Group__05220);
            rule__PropertyReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0"


    // $ANTLR start "rule__PropertyReference__Group__0__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2608:1: rule__PropertyReference__Group__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2612:1: ( ( KEYWORD_9 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2613:1: ( KEYWORD_9 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2613:1: ( KEYWORD_9 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2614:1: KEYWORD_9
            {
             before(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__PropertyReference__Group__0__Impl5248); 
             after(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0__Impl"


    // $ANTLR start "rule__PropertyReference__Group__1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2627:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2631:1: ( rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2632:2: rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyReference__Group__1__Impl_in_rule__PropertyReference__Group__15279);
            rule__PropertyReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyReference__Group__2_in_rule__PropertyReference__Group__15282);
            rule__PropertyReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1"


    // $ANTLR start "rule__PropertyReference__Group__1__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2639:1: rule__PropertyReference__Group__1__Impl : ( rulePropertyReferenceImpl ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2643:1: ( ( rulePropertyReferenceImpl ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2644:1: ( rulePropertyReferenceImpl )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2644:1: ( rulePropertyReferenceImpl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2645:1: rulePropertyReferenceImpl
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePropertyReferenceImpl_in_rule__PropertyReference__Group__1__Impl5309);
            rulePropertyReferenceImpl();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1__Impl"


    // $ANTLR start "rule__PropertyReference__Group__2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2656:1: rule__PropertyReference__Group__2 : rule__PropertyReference__Group__2__Impl ;
    public final void rule__PropertyReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2660:1: ( rule__PropertyReference__Group__2__Impl )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2661:2: rule__PropertyReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyReference__Group__2__Impl_in_rule__PropertyReference__Group__25338);
            rule__PropertyReference__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__2"


    // $ANTLR start "rule__PropertyReference__Group__2__Impl"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2667:1: rule__PropertyReference__Group__2__Impl : ( KEYWORD_8 ) ;
    public final void rule__PropertyReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2671:1: ( ( KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2672:1: ( KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2672:1: ( KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2673:1: KEYWORD_8
            {
             before(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__PropertyReference__Group__2__Impl5366); 
             after(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__2__Impl"


    // $ANTLR start "rule__Module__CanonicalNameAssignment_2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2693:1: rule__Module__CanonicalNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2697:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2698:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2698:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2699:1: ruleFQN
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Module__CanonicalNameAssignment_25408);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__CanonicalNameAssignment_2"


    // $ANTLR start "rule__Module__ImportsAssignment_3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2708:1: rule__Module__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2712:1: ( ( ruleImport ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2713:1: ( ruleImport )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2713:1: ( ruleImport )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2714:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_35439);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ImportsAssignment_3"


    // $ANTLR start "rule__Module__DeclaredPropertiesAssignment_4"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2723:1: rule__Module__DeclaredPropertiesAssignment_4 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2727:1: ( ( ruleDeclaredProperty ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2728:1: ( ruleDeclaredProperty )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2728:1: ( ruleDeclaredProperty )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2729:1: ruleDeclaredProperty
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_rule__Module__DeclaredPropertiesAssignment_45470);
            ruleDeclaredProperty();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__DeclaredPropertiesAssignment_4"


    // $ANTLR start "rule__Module__RootAssignment_5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2738:1: rule__Module__RootAssignment_5 : ( ruleRootComponent ) ;
    public final void rule__Module__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2742:1: ( ( ruleRootComponent ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2743:1: ( ruleRootComponent )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2743:1: ( ruleRootComponent )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2744:1: ruleRootComponent
            {
             before(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRootComponent_in_rule__Module__RootAssignment_55501);
            ruleRootComponent();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__RootAssignment_5"


    // $ANTLR start "rule__DeclaredProperty__TypeAssignment_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2753:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2757:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2758:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2758:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2759:1: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2760:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2761:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__DeclaredProperty__TypeAssignment_15536);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__TypeAssignment_1"


    // $ANTLR start "rule__DeclaredProperty__NameAssignment_2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2772:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2776:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2777:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2777:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2778:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__DeclaredProperty__NameAssignment_25571);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__NameAssignment_2"


    // $ANTLR start "rule__DeclaredProperty__DefaultAssignment_3_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2787:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2791:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2792:1: ( ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2792:1: ( ruleValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2793:1: ruleValue
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__DeclaredProperty__DefaultAssignment_3_15602);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__DefaultAssignment_3_1"


    // $ANTLR start "rule__RootComponent__TypeAssignment_1_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2802:1: rule__RootComponent__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2806:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2807:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2807:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2808:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2809:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2810:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__RootComponent__TypeAssignment_1_05637);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__TypeAssignment_1_0"


    // $ANTLR start "rule__RootComponent__ModuleAssignment_1_1_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2821:1: rule__RootComponent__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2825:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2826:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2826:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2827:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2828:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2829:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__RootComponent__ModuleAssignment_1_1_15676);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__ModuleAssignment_1_1_1"


    // $ANTLR start "rule__RootComponent__NameAssignment_2_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2840:1: rule__RootComponent__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__RootComponent__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2844:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2845:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2845:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2846:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__RootComponent__NameAssignment_2_15711);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__NameAssignment_2_1"


    // $ANTLR start "rule__RootComponent__AutoInjectAssignment_3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2855:1: rule__RootComponent__AutoInjectAssignment_3 : ( ( KEYWORD_20 ) ) ;
    public final void rule__RootComponent__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2859:1: ( ( ( KEYWORD_20 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2860:1: ( ( KEYWORD_20 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2860:1: ( ( KEYWORD_20 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2861:1: ( KEYWORD_20 )
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2862:1: ( KEYWORD_20 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2863:1: KEYWORD_20
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__RootComponent__AutoInjectAssignment_35747); 
             after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }

             after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__AutoInjectAssignment_3"


    // $ANTLR start "rule__RootComponent__AssignmentAssignment_5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2878:1: rule__RootComponent__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__RootComponent__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2882:1: ( ( ruleAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2883:1: ( ruleAssignment )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2883:1: ( ruleAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2884:1: ruleAssignment
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__RootComponent__AssignmentAssignment_55786);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__AssignmentAssignment_5"


    // $ANTLR start "rule__Component__TypeAssignment_1_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2893:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2897:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2898:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2898:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2899:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2900:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2901:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_05821);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__TypeAssignment_1_0"


    // $ANTLR start "rule__Component__ModuleAssignment_1_1_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2912:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2916:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2917:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2917:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2918:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2919:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2920:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__ModuleAssignment_1_1_15860);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ModuleAssignment_1_1_1"


    // $ANTLR start "rule__Component__NameAssignment_2_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2931:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2935:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2936:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2936:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2937:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__NameAssignment_2_15895);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_2_1"


    // $ANTLR start "rule__Component__AutoInjectAssignment_3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2946:1: rule__Component__AutoInjectAssignment_3 : ( ( KEYWORD_20 ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2950:1: ( ( ( KEYWORD_20 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2951:1: ( ( KEYWORD_20 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2951:1: ( ( KEYWORD_20 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2952:1: ( KEYWORD_20 )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2953:1: ( KEYWORD_20 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2954:1: KEYWORD_20
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__Component__AutoInjectAssignment_35931); 
             after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }

             after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AutoInjectAssignment_3"


    // $ANTLR start "rule__Component__AssignmentAssignment_5"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2969:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2973:1: ( ( ruleAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2974:1: ( ruleAssignment )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2974:1: ( ruleAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2975:1: ruleAssignment
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__Component__AssignmentAssignment_55970);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AssignmentAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2984:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2988:1: ( ( ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2989:1: ( ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2989:1: ( ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2990:1: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_16001);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Assignment__FeatureAssignment_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:2999:1: rule__Assignment__FeatureAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3003:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3004:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3004:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3005:1: ( ruleFQN )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3006:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3007:1: ruleFQN
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Assignment__FeatureAssignment_06036);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FeatureAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3018:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3022:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3023:1: ( ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3023:1: ( ruleValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3024:1: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_26071);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__BooleanLiteral__IsTrueAssignment_1_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3033:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( KEYWORD_16 ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3037:1: ( ( ( KEYWORD_16 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3038:1: ( ( KEYWORD_16 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3038:1: ( ( KEYWORD_16 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3039:1: ( KEYWORD_16 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3040:1: ( KEYWORD_16 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3041:1: KEYWORD_16
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__BooleanLiteral__IsTrueAssignment_1_06107); 
             after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__IsTrueAssignment_1_0"


    // $ANTLR start "rule__Reference__ReferableAssignment"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3056:1: rule__Reference__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3060:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3061:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3061:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3062:1: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3063:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3064:1: ruleFQN
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Reference__ReferableAssignment6150);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferableAssignment"


    // $ANTLR start "rule__StringLiteral__BeginAssignment_0_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3075:1: rule__StringLiteral__BeginAssignment_0_0 : ( ( KEYWORD_2 ) ) ;
    public final void rule__StringLiteral__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3079:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3080:1: ( ( KEYWORD_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3080:1: ( ( KEYWORD_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3081:1: ( KEYWORD_2 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3082:1: ( KEYWORD_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3083:1: KEYWORD_2
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__StringLiteral__BeginAssignment_0_06190); 
             after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__BeginAssignment_0_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3098:1: rule__StringLiteral__PartsAssignment_0_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3102:1: ( ( rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3103:1: ( rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3103:1: ( rulePlainString )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3104:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_0_16229);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_1"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_2_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3113:1: rule__StringLiteral__PartsAssignment_0_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3117:1: ( ( rulePropertyReference ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3118:1: ( rulePropertyReference )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3118:1: ( rulePropertyReference )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3119:1: rulePropertyReference
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__StringLiteral__PartsAssignment_0_2_06260);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_2_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_2_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3128:1: rule__StringLiteral__PartsAssignment_0_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3132:1: ( ( rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3133:1: ( rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3133:1: ( rulePlainString )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3134:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_0_2_16291);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_2_1"


    // $ANTLR start "rule__StringLiteral__EndAssignment_0_3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3143:1: rule__StringLiteral__EndAssignment_0_3 : ( ( KEYWORD_2 ) ) ;
    public final void rule__StringLiteral__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3147:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3148:1: ( ( KEYWORD_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3148:1: ( ( KEYWORD_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3149:1: ( KEYWORD_2 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3150:1: ( KEYWORD_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3151:1: KEYWORD_2
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__StringLiteral__EndAssignment_0_36327); 
             after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__EndAssignment_0_3"


    // $ANTLR start "rule__StringLiteral__BeginAssignment_1_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3166:1: rule__StringLiteral__BeginAssignment_1_0 : ( ( KEYWORD_1 ) ) ;
    public final void rule__StringLiteral__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3170:1: ( ( ( KEYWORD_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3171:1: ( ( KEYWORD_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3171:1: ( ( KEYWORD_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3172:1: ( KEYWORD_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3173:1: ( KEYWORD_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3174:1: KEYWORD_1
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__StringLiteral__BeginAssignment_1_06371); 
             after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__BeginAssignment_1_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3189:1: rule__StringLiteral__PartsAssignment_1_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3193:1: ( ( rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3194:1: ( rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3194:1: ( rulePlainString )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3195:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_1_16410);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_1"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_2_0"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3204:1: rule__StringLiteral__PartsAssignment_1_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3208:1: ( ( rulePropertyReference ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3209:1: ( rulePropertyReference )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3209:1: ( rulePropertyReference )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3210:1: rulePropertyReference
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__StringLiteral__PartsAssignment_1_2_06441);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_2_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_2_1"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3219:1: rule__StringLiteral__PartsAssignment_1_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3223:1: ( ( rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3224:1: ( rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3224:1: ( rulePlainString )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3225:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_1_2_16472);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_2_1"


    // $ANTLR start "rule__StringLiteral__EndAssignment_1_3"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3234:1: rule__StringLiteral__EndAssignment_1_3 : ( ( KEYWORD_1 ) ) ;
    public final void rule__StringLiteral__EndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3238:1: ( ( ( KEYWORD_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3239:1: ( ( KEYWORD_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3239:1: ( ( KEYWORD_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3240:1: ( KEYWORD_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3241:1: ( KEYWORD_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3242:1: KEYWORD_1
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__StringLiteral__EndAssignment_1_36508); 
             after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__EndAssignment_1_3"


    // $ANTLR start "rule__PropertyReferenceImpl__ReferableAssignment"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3257:1: rule__PropertyReferenceImpl__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReferenceImpl__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3261:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3262:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3262:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3263:1: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3264:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3265:1: ruleFQN
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__PropertyReferenceImpl__ReferableAssignment6551);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceImpl__ReferableAssignment"


    // $ANTLR start "rule__PlainString__ValueAssignment"
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3276:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3280:1: ( ( ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3281:1: ( ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3281:1: ( ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2Parser.g:3282:1: ruleConstantValue
            {
             before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6586);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlainString__ValueAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA4_eotS =
        "\10\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\6\5\uffff\1\6";
    static final String DFA4_minS =
        "\2\4\3\uffff\1\30\1\uffff\1\4";
    static final String DFA4_maxS =
        "\2\30\3\uffff\1\30\1\uffff\1\30";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\uffff\1\4\1\uffff";
    static final String DFA4_specialS =
        "\10\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\2\uffff\2\4\7\uffff\2\3\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\1",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "606:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) );";
        }
    }
    static final String DFA10_eotS =
        "\11\uffff";
    static final String DFA10_eofS =
        "\1\uffff\1\4\1\uffff\1\7\1\uffff\1\4\2\uffff\1\7";
    static final String DFA10_minS =
        "\1\30\1\12\1\30\1\4\1\uffff\1\12\1\30\1\uffff\1\4";
    static final String DFA10_maxS =
        "\4\30\1\uffff\2\30\1\uffff\1\30";
    static final String DFA10_acceptS =
        "\4\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA10_specialS =
        "\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\4\7\uffff\1\2\1\uffff\2\4\2\uffff\1\3",
            "\1\5",
            "\1\4\5\uffff\1\7\7\uffff\1\6\1\4\2\7\1\4\1\uffff\1\7",
            "",
            "\1\4\7\uffff\1\2\1\uffff\2\4\2\uffff\1\3",
            "\1\10",
            "",
            "\1\4\5\uffff\1\7\7\uffff\1\6\1\4\2\7\1\4\1\uffff\1\7"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "987:1: ( rule__DeclaredProperty__TypeAssignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredProperty125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__0_in_ruleDeclaredProperty155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootComponent_in_entryRuleRootComponent182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootComponent189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__0_in_ruleRootComponent219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferableAssignment_in_ruleReference667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__0_in_rulePropertyReference877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceImpl_in_entryRulePropertyReferenceImpl909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReferenceImpl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReferenceImpl__ReferableAssignment_in_rulePropertyReferenceImpl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1080 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1092 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_rule__RootComponent__TypeAssignment_1_0_in_rule__RootComponent__Alternatives_11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_1_1__0_in_rule__RootComponent__Alternatives_11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__0_in_rule__Component__Alternatives_11200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Value__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__IsTrueAssignment_1_0_in_rule__BooleanLiteral__Alternatives_11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__BooleanLiteral__Alternatives_11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__0_in_rule__StringLiteral__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__0_in_rule__StringLiteral__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantValue__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__ConstantValue__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__ConstantValue__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__ConstantValue__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ConstantValue__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01564 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11625 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__Module__Group__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21687 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__CanonicalNameAssignment_2_in_rule__Module__Group__2__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31747 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_3_in_rule__Module__Group__3__Impl1777 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41808 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__DeclaredPropertiesAssignment_4_in_rule__Module__Group__4__Impl1838 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__RootAssignment_5_in_rule__Module__Group__5__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__0__Impl_in_rule__DeclaredProperty__Group__01938 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__1_in_rule__DeclaredProperty__Group__01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__DeclaredProperty__Group__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__1__Impl_in_rule__DeclaredProperty__Group__12000 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__2_in_rule__DeclaredProperty__Group__12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__TypeAssignment_1_in_rule__DeclaredProperty__Group__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__2__Impl_in_rule__DeclaredProperty__Group__22061 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__3_in_rule__DeclaredProperty__Group__22064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__NameAssignment_2_in_rule__DeclaredProperty__Group__2__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__3__Impl_in_rule__DeclaredProperty__Group__32121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__0_in_rule__DeclaredProperty__Group__3__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__0__Impl_in_rule__DeclaredProperty__Group_3__02187 = new BitSet(new long[]{0x00000000016B0190L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__1_in_rule__DeclaredProperty__Group_3__02190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__DeclaredProperty__Group_3__0__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__1__Impl_in_rule__DeclaredProperty__Group_3__12249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__DefaultAssignment_3_1_in_rule__DeclaredProperty__Group_3__1__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__0__Impl_in_rule__RootComponent__Group__02310 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__1_in_rule__RootComponent__Group__02313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__1__Impl_in_rule__RootComponent__Group__12371 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__2_in_rule__RootComponent__Group__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Alternatives_1_in_rule__RootComponent__Group__1__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__2__Impl_in_rule__RootComponent__Group__22431 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__3_in_rule__RootComponent__Group__22434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_2__0_in_rule__RootComponent__Group__2__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__3__Impl_in_rule__RootComponent__Group__32492 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__4_in_rule__RootComponent__Group__32495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__AutoInjectAssignment_3_in_rule__RootComponent__Group__3__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__4__Impl_in_rule__RootComponent__Group__42553 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__5_in_rule__RootComponent__Group__42556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__RootComponent__Group__4__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__5__Impl_in_rule__RootComponent__Group__52615 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__6_in_rule__RootComponent__Group__52618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__AssignmentAssignment_5_in_rule__RootComponent__Group__5__Impl2645 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group__6__Impl_in_rule__RootComponent__Group__62676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__RootComponent__Group__6__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_1_1__0__Impl_in_rule__RootComponent__Group_1_1__02749 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_1_1__1_in_rule__RootComponent__Group_1_1__02752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__RootComponent__Group_1_1__0__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_1_1__1__Impl_in_rule__RootComponent__Group_1_1__12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__ModuleAssignment_1_1_1_in_rule__RootComponent__Group_1_1__1__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_2__0__Impl_in_rule__RootComponent__Group_2__02872 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_2__1_in_rule__RootComponent__Group_2__02875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__RootComponent__Group_2__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__Group_2__1__Impl_in_rule__RootComponent__Group_2__12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootComponent__NameAssignment_2_1_in_rule__RootComponent__Group_2__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02995 = new BitSet(new long[]{0x0000000001680010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__13056 = new BitSet(new long[]{0x0000000001680010L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__1__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__23117 = new BitSet(new long[]{0x0000000001680010L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__2__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__33178 = new BitSet(new long[]{0x0000000001680010L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__33181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__AutoInjectAssignment_3_in_rule__Component__Group__3__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__43239 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__43242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__Component__Group__4__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__53301 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__53304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__AssignmentAssignment_5_in_rule__Component__Group__5__Impl3331 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__63362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Component__Group__6__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__0__Impl_in_rule__Component__Group_1_1__03435 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__1_in_rule__Component__Group_1_1__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Component__Group_1_1__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__1__Impl_in_rule__Component__Group_1_1__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ModuleAssignment_1_1_1_in_rule__Component__Group_1_1__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0__Impl_in_rule__Component__Group_2__03558 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Component__Group_2__0__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1__Impl_in_rule__Component__Group_2__13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__1__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03681 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__Import__Group__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__0__Impl_in_rule__ImportedFQN__Group__03804 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__1__Impl_in_rule__ImportedFQN__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__ImportedFQN__Group__1__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03929 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__FeatureAssignment_0_in_rule__Assignment__Group__0__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13989 = new BitSet(new long[]{0x00000000016B0190L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Assignment__Group__1__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__04114 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__04117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__14175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_1_in_rule__BooleanLiteral__Group__1__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4322 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04357 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__FQN__Group_1__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__0__Impl_in_rule__StringLiteral__Group_0__04479 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__1_in_rule__StringLiteral__Group_0__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__BeginAssignment_0_0_in_rule__StringLiteral__Group_0__0__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__1__Impl_in_rule__StringLiteral__Group_0__14539 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__2_in_rule__StringLiteral__Group_0__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_0_1_in_rule__StringLiteral__Group_0__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__2__Impl_in_rule__StringLiteral__Group_0__24600 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__3_in_rule__StringLiteral__Group_0__24603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0_2__0_in_rule__StringLiteral__Group_0__2__Impl4630 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0__3__Impl_in_rule__StringLiteral__Group_0__34661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__EndAssignment_0_3_in_rule__StringLiteral__Group_0__3__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0_2__0__Impl_in_rule__StringLiteral__Group_0_2__04726 = new BitSet(new long[]{0x000000001900E200L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0_2__1_in_rule__StringLiteral__Group_0_2__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_0_2_0_in_rule__StringLiteral__Group_0_2__0__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_0_2__1__Impl_in_rule__StringLiteral__Group_0_2__14786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_0_2_1_in_rule__StringLiteral__Group_0_2__1__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__0__Impl_in_rule__StringLiteral__Group_1__04848 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__1_in_rule__StringLiteral__Group_1__04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__BeginAssignment_1_0_in_rule__StringLiteral__Group_1__0__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__1__Impl_in_rule__StringLiteral__Group_1__14908 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__2_in_rule__StringLiteral__Group_1__14911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_1_1_in_rule__StringLiteral__Group_1__1__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__2__Impl_in_rule__StringLiteral__Group_1__24969 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__3_in_rule__StringLiteral__Group_1__24972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1_2__0_in_rule__StringLiteral__Group_1__2__Impl4999 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1__3__Impl_in_rule__StringLiteral__Group_1__35030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__EndAssignment_1_3_in_rule__StringLiteral__Group_1__3__Impl5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1_2__0__Impl_in_rule__StringLiteral__Group_1_2__05095 = new BitSet(new long[]{0x000000001900E200L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1_2__1_in_rule__StringLiteral__Group_1_2__05098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_1_2_0_in_rule__StringLiteral__Group_1_2__0__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group_1_2__1__Impl_in_rule__StringLiteral__Group_1_2__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__PartsAssignment_1_2_1_in_rule__StringLiteral__Group_1_2__1__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__0__Impl_in_rule__PropertyReference__Group__05217 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__1_in_rule__PropertyReference__Group__05220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__PropertyReference__Group__0__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__1__Impl_in_rule__PropertyReference__Group__15279 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__2_in_rule__PropertyReference__Group__15282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceImpl_in_rule__PropertyReference__Group__1__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__Group__2__Impl_in_rule__PropertyReference__Group__25338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__PropertyReference__Group__2__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Module__CanonicalNameAssignment_25408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_35439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_rule__Module__DeclaredPropertiesAssignment_45470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootComponent_in_rule__Module__RootAssignment_55501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__DeclaredProperty__TypeAssignment_15536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__DeclaredProperty__NameAssignment_25571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DeclaredProperty__DefaultAssignment_3_15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__RootComponent__TypeAssignment_1_05637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__RootComponent__ModuleAssignment_1_1_15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__RootComponent__NameAssignment_2_15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__RootComponent__AutoInjectAssignment_35747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__RootComponent__AssignmentAssignment_55786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_05821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__ModuleAssignment_1_1_15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__NameAssignment_2_15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__Component__AutoInjectAssignment_35931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Component__AssignmentAssignment_55970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Assignment__FeatureAssignment_06036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_26071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__BooleanLiteral__IsTrueAssignment_1_06107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Reference__ReferableAssignment6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__StringLiteral__BeginAssignment_0_06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_0_16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__StringLiteral__PartsAssignment_0_2_06260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_0_2_16291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__StringLiteral__EndAssignment_0_36327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__StringLiteral__BeginAssignment_1_06371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_1_16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__StringLiteral__PartsAssignment_1_2_06441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__StringLiteral__PartsAssignment_1_2_16472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__StringLiteral__EndAssignment_1_36508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PropertyReferenceImpl__ReferableAssignment6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6586 = new BitSet(new long[]{0x0000000000000002L});

}