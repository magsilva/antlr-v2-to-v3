// $ANTLR 3.0b8 ANTLR.g 2007-05-11 14:32:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/** ANTLR v2 to v3 converter
Currently does this kind of stuff:

new keywords: grammar, tree; must warn with comment.

convert class T extends Parser -> grammar T if combined or
parser grammar T if not

header {...} -> @header {...} and move to action section after grammar.

option names; importVocab -> tokenVocab, buildAST=true -> output=AST

keyword protected->fragment

labels goes from colon to =

literals "abc" -> 'abc'

kill empty strings in tokens; don't need to add to literals table.
tokens {
	"options";
}

add @members to member actions.

add @init to rule actions

comment out return value init expressions

move lexer member action to grammar member area if combined
*/
public class ANTLRParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMPRED", "DOC_COMMENT", "STRING_LITERAL", "ACTION", "OPTIONS", "INT", "OR", "CHAR_LITERAL", "RANGE", "TOKENS", "TOKEN_REF", "RCURLY", "OPEN_ELEMENT_OPTION", "CLOSE_ELEMENT_OPTION", "LPAREN", "RPAREN", "BANG", "ARG_ACTION", "COLON", "COMMA", "RULE_REF", "NOT_OP", "TREE_BEGIN", "QUESTION", "STAR", "PLUS", "IMPLIES", "CARET", "WILDCARD", "WS", "SL_COMMENT", "ML_COMMENT", "COMMENT", "ESC", "XDIGIT", "DIGIT", "WS_LOOP", "NESTED_ARG_ACTION", "NESTED_ACTION", "INTERNAL_RULE_REF", "WS_OPT", "'header'", "'='", "';'", "'class'", "'extends'", "'Parser'", "'Lexer'", "'TreeParser'", "'protected'", "'public'", "'private'", "'returns'", "'throws'", "'exception'", "'catch'"
    };
    public static final int COMMA=23;
    public static final int NESTED_ACTION=42;
    public static final int BANG=20;
    public static final int QUESTION=27;
    public static final int OR=10;
    public static final int CLOSE_ELEMENT_OPTION=17;
    public static final int RCURLY=15;
    public static final int NOT_OP=25;
    public static final int CHAR_LITERAL=11;
    public static final int IMPLIES=30;
    public static final int INT=9;
    public static final int STRING_LITERAL=6;
    public static final int RPAREN=19;
    public static final int TOKENS=13;
    public static final int OPTIONS=8;
    public static final int LPAREN=18;
    public static final int PLUS=29;
    public static final int ML_COMMENT=35;
    public static final int DIGIT=39;
    public static final int SL_COMMENT=34;
    public static final int WS_OPT=44;
    public static final int RANGE=12;
    public static final int WS=33;
    public static final int ARG_ACTION=21;
    public static final int TOKEN_REF=14;
    public static final int ACTION=7;
    public static final int WILDCARD=32;
    public static final int COMMENT=36;
    public static final int WS_LOOP=40;
    public static final int CARET=31;
    public static final int ESC=37;
    public static final int OPEN_ELEMENT_OPTION=16;
    public static final int XDIGIT=38;
    public static final int RULE_REF=24;
    public static final int TREE_BEGIN=26;
    public static final int SEMPRED=4;
    public static final int NESTED_ARG_ACTION=41;
    public static final int EOF=-1;
    public static final int INTERNAL_RULE_REF=43;
    public static final int COLON=22;
    public static final int STAR=28;
    public static final int DOC_COMMENT=5;

        public ANTLRParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "ANTLR.g"; }


    protected TokenRewriteStream tokens;
    protected Token headerActionToken;
    protected boolean seenParser = false;
    protected boolean combined = false;
    protected Token lastTokenBeforeRules = null;

    public void setTokenBuffer(TokenRewriteStream tokens) {
    	this.tokens = tokens;
    }
    public void setCombined(boolean combined) {
    	this.combined = combined;
    }



    // $ANTLR start antlrGrammar
    // ANTLR.g:55:1: antlrGrammar : ( 'header' STRING_LITERAL ACTION | h= 'header' a= ACTION )* ( optionsSpec )? ( classDef )* EOF ;
    public final void antlrGrammar() throws RecognitionException {
        Token h=null;
        Token a=null;

        try {
            // ANTLR.g:57:2: ( ( 'header' STRING_LITERAL ACTION | h= 'header' a= ACTION )* ( optionsSpec )? ( classDef )* EOF )
            // ANTLR.g:57:2: ( 'header' STRING_LITERAL ACTION | h= 'header' a= ACTION )* ( optionsSpec )? ( classDef )* EOF
            {
            // ANTLR.g:57:2: ( 'header' STRING_LITERAL ACTION | h= 'header' a= ACTION )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ACTION) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==STRING_LITERAL) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ANTLR.g:57:5: 'header' STRING_LITERAL ACTION
            	    {
            	    match(input,45,FOLLOW_45_in_antlrGrammar39); 
            	    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_antlrGrammar41); 
            	    match(input,ACTION,FOLLOW_ACTION_in_antlrGrammar43); 

            	    }
            	    break;
            	case 2 :
            	    // ANTLR.g:58:4: h= 'header' a= ACTION
            	    {
            	    h=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_antlrGrammar50); 
            	    a=(Token)input.LT(1);
            	    match(input,ACTION,FOLLOW_ACTION_in_antlrGrammar54); 
            	    headerActionToken = a; tokens.delete(h,a);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ANTLR.g:60:2: ( optionsSpec )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==OPTIONS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ANTLR.g:60:4: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_antlrGrammar65);
                    optionsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:61:2: ( classDef )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DOC_COMMENT||LA3_0==ACTION||LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ANTLR.g:61:4: classDef
            	    {
            	    pushFollow(FOLLOW_classDef_in_antlrGrammar73);
            	    classDef();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_antlrGrammar79); 

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
    // $ANTLR end antlrGrammar


    // $ANTLR start classDef
    // ANTLR.g:65:1: classDef : ( ACTION )? ( DOC_COMMENT )? ( lexerSpec | treeParserSpec | parserSpec ) rules ;
    public final void classDef() throws RecognitionException {

        boolean justSawLexer=false;

        try {
            // ANTLR.g:70:2: ( ( ACTION )? ( DOC_COMMENT )? ( lexerSpec | treeParserSpec | parserSpec ) rules )
            // ANTLR.g:70:2: ( ACTION )? ( DOC_COMMENT )? ( lexerSpec | treeParserSpec | parserSpec ) rules
            {
            // ANTLR.g:70:2: ( ACTION )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ACTION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ANTLR.g:70:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_classDef98); 

                    }
                    break;

            }

            // ANTLR.g:71:2: ( DOC_COMMENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOC_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ANTLR.g:71:4: DOC_COMMENT
                    {
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_classDef106); 

                    }
                    break;

            }

            // ANTLR.g:72:2: ( lexerSpec | treeParserSpec | parserSpec )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==TOKEN_REF||LA6_1==RULE_REF) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==49) ) {
                        switch ( input.LA(4) ) {
                        case 50:
                            {
                            alt6=3;
                            }
                            break;
                        case 52:
                            {
                            alt6=2;
                            }
                            break;
                        case 51:
                            {
                            alt6=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("72:2: ( lexerSpec | treeParserSpec | parserSpec )", 6, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA6_2==47) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: ( lexerSpec | treeParserSpec | parserSpec )", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: ( lexerSpec | treeParserSpec | parserSpec )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("72:2: ( lexerSpec | treeParserSpec | parserSpec )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ANTLR.g:72:4: lexerSpec
                    {
                    pushFollow(FOLLOW_lexerSpec_in_classDef114);
                    lexerSpec();
                    _fsp--;

                    justSawLexer=true;

                    }
                    break;
                case 2 :
                    // ANTLR.g:73:4: treeParserSpec
                    {
                    pushFollow(FOLLOW_treeParserSpec_in_classDef121);
                    treeParserSpec();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // ANTLR.g:74:4: parserSpec
                    {
                    pushFollow(FOLLOW_parserSpec_in_classDef126);
                    parserSpec();
                    _fsp--;


                    }
                    break;

            }


            	lastTokenBeforeRules = input.LT(-1);
            	if ( (!combined||(combined&&!justSawLexer)) && headerActionToken!=null ) {
            		tokens.insertAfter(lastTokenBeforeRules,
            			"\n@header "+headerActionToken.getText()+"\n");
            	}
            	
            pushFollow(FOLLOW_rules_in_classDef135);
            rules();
            _fsp--;


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
    // $ANTLR end classDef

    public static class optionsSpec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start optionsSpec
    // ANTLR.g:86:1: optionsSpec : OPTIONS ( id '=' v= optionValue ';' )* '}' ;
    public final optionsSpec_return optionsSpec() throws RecognitionException {
        optionsSpec_return retval = new optionsSpec_return();
        retval.start = input.LT(1);

        optionValue_return v = null;

        id_return id1 = null;


        try {
            // ANTLR.g:87:4: ( OPTIONS ( id '=' v= optionValue ';' )* '}' )
            // ANTLR.g:87:4: OPTIONS ( id '=' v= optionValue ';' )* '}'
            {
            match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec146); 
            // ANTLR.g:88:3: ( id '=' v= optionValue ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TOKEN_REF||LA7_0==RULE_REF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ANTLR.g:88:5: id '=' v= optionValue ';'
            	    {
            	    pushFollow(FOLLOW_id_in_optionsSpec152);
            	    id1=id();
            	    _fsp--;

            	    match(input,46,FOLLOW_46_in_optionsSpec154); 
            	    pushFollow(FOLLOW_optionValue_in_optionsSpec158);
            	    v=optionValue();
            	    _fsp--;

            	    match(input,47,FOLLOW_47_in_optionsSpec160); 

            	    			if ( input.toString(id1.start,id1.stop).equals("importVocab") )
            	    				tokens.replace(((Token)id1.start), "tokenVocab");
            	    			else if ( input.toString(id1.start,id1.stop).equals("buildAST") )
            	    				tokens.replace(((Token)id1.start), ((Token)v.start), "output=AST");
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,RCURLY,FOLLOW_RCURLY_in_optionsSpec174); 

            		tokens.insertBefore(((Token)retval.start), "/*");
            		tokens.insertAfter(input.LT(-1), "*/"); // .stop not set yet
            		

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end optionsSpec

    public static class optionValue_return extends ParserRuleReturnScope {
    };

    // $ANTLR start optionValue
    // ANTLR.g:108:1: optionValue : ( qualifiedID | STRING_LITERAL | INT | charSet );
    public final optionValue_return optionValue() throws RecognitionException {
        optionValue_return retval = new optionValue_return();
        retval.start = input.LT(1);

        try {
            // ANTLR.g:109:4: ( qualifiedID | STRING_LITERAL | INT | charSet )
            int alt8=4;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt8=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt8=2;
                }
                break;
            case INT:
                {
                alt8=3;
                }
                break;
            case CHAR_LITERAL:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("108:1: optionValue : ( qualifiedID | STRING_LITERAL | INT | charSet );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ANTLR.g:109:4: qualifiedID
                    {
                    pushFollow(FOLLOW_qualifiedID_in_optionValue194);
                    qualifiedID();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ANTLR.g:110:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue199); 

                    }
                    break;
                case 3 :
                    // ANTLR.g:111:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_optionValue204); 

                    }
                    break;
                case 4 :
                    // ANTLR.g:112:4: charSet
                    {
                    pushFollow(FOLLOW_charSet_in_optionValue209);
                    charSet();
                    _fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end optionValue


    // $ANTLR start charSet
    // ANTLR.g:115:1: charSet : setBlockElement ( OR setBlockElement )* ;
    public final void charSet() throws RecognitionException {
        try {
            // ANTLR.g:116:4: ( setBlockElement ( OR setBlockElement )* )
            // ANTLR.g:116:4: setBlockElement ( OR setBlockElement )*
            {
            pushFollow(FOLLOW_setBlockElement_in_charSet220);
            setBlockElement();
            _fsp--;

            // ANTLR.g:116:20: ( OR setBlockElement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ANTLR.g:116:22: OR setBlockElement
            	    {
            	    match(input,OR,FOLLOW_OR_in_charSet224); 
            	    pushFollow(FOLLOW_setBlockElement_in_charSet226);
            	    setBlockElement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end charSet


    // $ANTLR start setBlockElement
    // ANTLR.g:119:1: setBlockElement : CHAR_LITERAL ( RANGE CHAR_LITERAL )? ;
    public final void setBlockElement() throws RecognitionException {
        try {
            // ANTLR.g:120:4: ( CHAR_LITERAL ( RANGE CHAR_LITERAL )? )
            // ANTLR.g:120:4: CHAR_LITERAL ( RANGE CHAR_LITERAL )?
            {
            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_setBlockElement240); 
            // ANTLR.g:120:17: ( RANGE CHAR_LITERAL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RANGE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ANTLR.g:120:18: RANGE CHAR_LITERAL
                    {
                    match(input,RANGE,FOLLOW_RANGE_in_setBlockElement243); 
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_setBlockElement245); 

                    }
                    break;

            }


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
    // $ANTLR end setBlockElement


    // $ANTLR start tokensSpec
    // ANTLR.g:123:1: tokensSpec : TOKENS ( ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? ) ';' )+ RCURLY ;
    public final void tokensSpec() throws RecognitionException {
        Token s=null;
        Token TOKENS2=null;
        Token RCURLY3=null;

        int n=0;
        try {
            // ANTLR.g:125:4: ( TOKENS ( ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? ) ';' )+ RCURLY )
            // ANTLR.g:125:4: TOKENS ( ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? ) ';' )+ RCURLY
            {
            TOKENS2=(Token)input.LT(1);
            match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec263); 
            // ANTLR.g:126:4: ( ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? ) ';' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==STRING_LITERAL||LA15_0==TOKEN_REF) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ANTLR.g:126:6: ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? ) ';'
            	    {
            	    // ANTLR.g:126:6: ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==TOKEN_REF) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==STRING_LITERAL) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("126:6: ( TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )? | s= STRING_LITERAL ( tokensSpecOptions )? )", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ANTLR.g:126:8: TOKEN_REF ( '=' STRING_LITERAL )? ( tokensSpecOptions )?
            	            {
            	            match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokensSpec272); 
            	            // ANTLR.g:126:18: ( '=' STRING_LITERAL )?
            	            int alt11=2;
            	            int LA11_0 = input.LA(1);

            	            if ( (LA11_0==46) ) {
            	                alt11=1;
            	            }
            	            switch (alt11) {
            	                case 1 :
            	                    // ANTLR.g:126:20: '=' STRING_LITERAL
            	                    {
            	                    match(input,46,FOLLOW_46_in_tokensSpec276); 
            	                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokensSpec278); 

            	                    }
            	                    break;

            	            }

            	            // ANTLR.g:126:42: ( tokensSpecOptions )?
            	            int alt12=2;
            	            int LA12_0 = input.LA(1);

            	            if ( (LA12_0==OPEN_ELEMENT_OPTION) ) {
            	                alt12=1;
            	            }
            	            switch (alt12) {
            	                case 1 :
            	                    // ANTLR.g:126:43: tokensSpecOptions
            	                    {
            	                    pushFollow(FOLLOW_tokensSpecOptions_in_tokensSpec284);
            	                    tokensSpecOptions();
            	                    _fsp--;


            	                    }
            	                    break;

            	            }

            	            n++;

            	            }
            	            break;
            	        case 2 :
            	            // ANTLR.g:127:7: s= STRING_LITERAL ( tokensSpecOptions )?
            	            {
            	            s=(Token)input.LT(1);
            	            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokensSpec298); 
            	            // ANTLR.g:127:24: ( tokensSpecOptions )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==OPEN_ELEMENT_OPTION) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // ANTLR.g:127:25: tokensSpecOptions
            	                    {
            	                    pushFollow(FOLLOW_tokensSpecOptions_in_tokensSpec301);
            	                    tokensSpecOptions();
            	                    _fsp--;


            	                    }
            	                    break;

            	            }

            	            tokens.insertBefore(s, "// ");

            	            }
            	            break;

            	    }

            	    match(input,47,FOLLOW_47_in_tokensSpec322); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            RCURLY3=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_tokensSpec332); 

            		if ( n==0 ) {
            			tokens.insertBefore(TOKENS2, "/*");
            			tokens.insertAfter(RCURLY3, "*/");
            		}
            		

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
    // $ANTLR end tokensSpec


    // $ANTLR start tokensSpecOptions
    // ANTLR.g:141:1: tokensSpecOptions : OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION ;
    public final void tokensSpecOptions() throws RecognitionException {
        try {
            // ANTLR.g:142:4: ( OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION )
            // ANTLR.g:142:4: OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION
            {
            match(input,OPEN_ELEMENT_OPTION,FOLLOW_OPEN_ELEMENT_OPTION_in_tokensSpecOptions347); 
            pushFollow(FOLLOW_id_in_tokensSpecOptions351);
            id();
            _fsp--;

            match(input,46,FOLLOW_46_in_tokensSpecOptions353); 
            pushFollow(FOLLOW_optionValue_in_tokensSpecOptions355);
            optionValue();
            _fsp--;

            // ANTLR.g:144:3: ( ';' id '=' optionValue )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ANTLR.g:145:4: ';' id '=' optionValue
            	    {
            	    match(input,47,FOLLOW_47_in_tokensSpecOptions364); 
            	    pushFollow(FOLLOW_id_in_tokensSpecOptions369);
            	    id();
            	    _fsp--;

            	    match(input,46,FOLLOW_46_in_tokensSpecOptions371); 
            	    pushFollow(FOLLOW_optionValue_in_tokensSpecOptions373);
            	    optionValue();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,CLOSE_ELEMENT_OPTION,FOLLOW_CLOSE_ELEMENT_OPTION_in_tokensSpecOptions383); 

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
    // $ANTLR end tokensSpecOptions


    // $ANTLR start superClass
    // ANTLR.g:152:1: superClass : LPAREN ( STRING_LITERAL ) RPAREN ;
    public final void superClass() throws RecognitionException {
        try {
            // ANTLR.g:153:4: ( LPAREN ( STRING_LITERAL ) RPAREN )
            // ANTLR.g:153:4: LPAREN ( STRING_LITERAL ) RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_superClass394); 
            // ANTLR.g:155:4: ( STRING_LITERAL )
            // ANTLR.g:155:5: STRING_LITERAL
            {
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_superClass401); 

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_superClass406); 

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
    // $ANTLR end superClass

    public static class parserSpec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start parserSpec
    // ANTLR.g:159:1: parserSpec : 'class' id ( 'extends' 'Parser' ( superClass )? | ) ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? ;
    public final parserSpec_return parserSpec() throws RecognitionException {
        parserSpec_return retval = new parserSpec_return();
        retval.start = input.LT(1);

        Token ACTION5=null;
        id_return id4 = null;


        try {
            // ANTLR.g:160:4: ( 'class' id ( 'extends' 'Parser' ( superClass )? | ) ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? )
            // ANTLR.g:160:4: 'class' id ( 'extends' 'Parser' ( superClass )? | ) ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )?
            {
            match(input,48,FOLLOW_48_in_parserSpec417); 
            pushFollow(FOLLOW_id_in_parserSpec419);
            id4=id();
            _fsp--;

            // ANTLR.g:161:3: ( 'extends' 'Parser' ( superClass )? | )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            else if ( (LA18_0==47) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("161:3: ( 'extends' 'Parser' ( superClass )? | )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ANTLR.g:161:5: 'extends' 'Parser' ( superClass )?
                    {
                    match(input,49,FOLLOW_49_in_parserSpec425); 
                    match(input,50,FOLLOW_50_in_parserSpec427); 
                    // ANTLR.g:161:24: ( superClass )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LPAREN) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ANTLR.g:161:25: superClass
                            {
                            pushFollow(FOLLOW_superClass_in_parserSpec430);
                            superClass();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:163:3: 
                    {
                    }
                    break;

            }


            		String gname = input.toString(id4.start,id4.stop);
            		if ( gname.endsWith("Parser") ) {
            			gname = gname.substring(0,gname.length()-"Parser".length());
            		}
            		String prefix="";
            		if ( !combined ) {
            			prefix = "parser ";
            		}
            		tokens.replace(((Token)retval.start), input.LT(-1), prefix+"grammar "+gname);
            		
            match(input,47,FOLLOW_47_in_parserSpec448); 
            // ANTLR.g:176:3: ( optionsSpec )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==OPTIONS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ANTLR.g:176:4: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_parserSpec453);
                    optionsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:177:3: ( tokensSpec )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TOKENS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ANTLR.g:177:4: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_parserSpec460);
                    tokensSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:178:3: ( ACTION )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ACTION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ANTLR.g:178:5: ACTION
                    {
                    ACTION5=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_parserSpec468); 
                    tokens.insertBefore(ACTION5, "@members ");

                    }
                    break;

            }

            seenParser=true;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end parserSpec

    public static class lexerSpec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start lexerSpec
    // ANTLR.g:182:1: lexerSpec : 'class' id 'extends' 'Lexer' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? ;
    public final lexerSpec_return lexerSpec() throws RecognitionException {
        lexerSpec_return retval = new lexerSpec_return();
        retval.start = input.LT(1);

        Token semi=null;
        Token ACTION7=null;
        id_return id6 = null;


        try {
            // ANTLR.g:183:6: ( 'class' id 'extends' 'Lexer' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? )
            // ANTLR.g:183:6: 'class' id 'extends' 'Lexer' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )?
            {
            match(input,48,FOLLOW_48_in_lexerSpec489); 
            pushFollow(FOLLOW_id_in_lexerSpec491);
            id6=id();
            _fsp--;

            match(input,49,FOLLOW_49_in_lexerSpec493); 
            match(input,51,FOLLOW_51_in_lexerSpec495); 
            // ANTLR.g:183:35: ( superClass )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LPAREN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ANTLR.g:183:36: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_lexerSpec498);
                    superClass();
                    _fsp--;


                    }
                    break;

            }

            semi=(Token)input.LT(1);
            match(input,47,FOLLOW_47_in_lexerSpec504); 

            		String gname = input.toString(id6.start,id6.stop);
            		if ( gname.endsWith("Lexer") ) {
            			gname = gname.substring(0,gname.length()-"Lexer".length());
            		}
            		if ( combined ) {
            			tokens.delete(((Token)retval.start), semi);
            		}
            		else {
            			tokens.replace(((Token)retval.start), semi, "lexer grammar "+gname+";");
            		}
            		
            // ANTLR.g:196:3: ( optionsSpec )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==OPTIONS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ANTLR.g:196:4: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_lexerSpec513);
                    optionsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:197:3: ( tokensSpec )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TOKENS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ANTLR.g:197:4: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_lexerSpec520);
                    tokensSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:198:3: ( ACTION )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ACTION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ANTLR.g:198:5: ACTION
                    {
                    ACTION7=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_lexerSpec528); 

                    			if ( combined ) {
                    				// move up to other members
                    				tokens.insertBefore(lastTokenBeforeRules, "@lexer::members "+ACTION7.getText());
                    				tokens.delete(ACTION7);
                    			}
                    			else  {
                    				tokens.insertBefore(ACTION7, "@lexer::members ");
                    			}
                    			

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lexerSpec

    public static class treeParserSpec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start treeParserSpec
    // ANTLR.g:212:1: treeParserSpec : 'class' id 'extends' 'TreeParser' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? ;
    public final treeParserSpec_return treeParserSpec() throws RecognitionException {
        treeParserSpec_return retval = new treeParserSpec_return();
        retval.start = input.LT(1);

        Token semi=null;
        Token ACTION9=null;
        id_return id8 = null;


        try {
            // ANTLR.g:213:4: ( 'class' id 'extends' 'TreeParser' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )? )
            // ANTLR.g:213:4: 'class' id 'extends' 'TreeParser' ( superClass )? semi= ';' ( optionsSpec )? ( tokensSpec )? ( ACTION )?
            {
            match(input,48,FOLLOW_48_in_treeParserSpec549); 
            pushFollow(FOLLOW_id_in_treeParserSpec551);
            id8=id();
            _fsp--;

            match(input,49,FOLLOW_49_in_treeParserSpec553); 
            match(input,52,FOLLOW_52_in_treeParserSpec555); 
            // ANTLR.g:213:38: ( superClass )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LPAREN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ANTLR.g:213:39: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_treeParserSpec558);
                    superClass();
                    _fsp--;


                    }
                    break;

            }

            semi=(Token)input.LT(1);
            match(input,47,FOLLOW_47_in_treeParserSpec564); 

            		String gname = input.toString(id8.start,id8.stop);
            		if ( gname.endsWith("TreeParser") ) {
            			gname = gname.substring(0,gname.length()-"TreeParser".length());
            		}
            		tokens.replace(((Token)retval.start), semi, "tree grammar "+gname+";");
            		
            // ANTLR.g:221:3: ( optionsSpec )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==OPTIONS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ANTLR.g:221:4: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_treeParserSpec573);
                    optionsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:222:3: ( tokensSpec )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==TOKENS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ANTLR.g:222:4: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_treeParserSpec580);
                    tokensSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:223:3: ( ACTION )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ACTION) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ANTLR.g:223:5: ACTION
                    {
                    ACTION9=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_treeParserSpec588); 
                    tokens.insertBefore(ACTION9, "@members ");

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end treeParserSpec


    // $ANTLR start rules
    // ANTLR.g:226:1: rules : ( rule )+ ;
    public final void rules() throws RecognitionException {
        try {
            // ANTLR.g:227:9: ( ( rule )+ )
            // ANTLR.g:227:9: ( rule )+
            {
            // ANTLR.g:227:9: ( rule )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DOC_COMMENT) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==TOKEN_REF||LA30_2==RULE_REF||(LA30_2>=53 && LA30_2<=55)) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==TOKEN_REF||LA30_0==RULE_REF||(LA30_0>=53 && LA30_0<=55)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ANTLR.g:227:9: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_rules608);
            	    rule();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


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
    // $ANTLR end rules


    // $ANTLR start rule
    // ANTLR.g:230:1: rule : ( DOC_COMMENT )? (p= 'protected' | 'public' | 'private' )? id ( BANG )? ( ARG_ACTION )? (r= 'returns' ret= ARG_ACTION )? ( throwsSpec )? ( ruleOptionsSpec )? (a= ACTION )? COLON block ';' ( exceptionGroup )? ;
    public final void rule() throws RecognitionException {
        Token p=null;
        Token r=null;
        Token ret=null;
        Token a=null;
        id_return id10 = null;


        try {
            // ANTLR.g:230:7: ( ( DOC_COMMENT )? (p= 'protected' | 'public' | 'private' )? id ( BANG )? ( ARG_ACTION )? (r= 'returns' ret= ARG_ACTION )? ( throwsSpec )? ( ruleOptionsSpec )? (a= ACTION )? COLON block ';' ( exceptionGroup )? )
            // ANTLR.g:230:7: ( DOC_COMMENT )? (p= 'protected' | 'public' | 'private' )? id ( BANG )? ( ARG_ACTION )? (r= 'returns' ret= ARG_ACTION )? ( throwsSpec )? ( ruleOptionsSpec )? (a= ACTION )? COLON block ';' ( exceptionGroup )?
            {
            // ANTLR.g:230:7: ( DOC_COMMENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DOC_COMMENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ANTLR.g:230:7: DOC_COMMENT
                    {
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule621); 

                    }
                    break;

            }

            // ANTLR.g:231:3: (p= 'protected' | 'public' | 'private' )?
            int alt32=4;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt32=1;
                    }
                    break;
                case 54:
                    {
                    alt32=2;
                    }
                    break;
                case 55:
                    {
                    alt32=3;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // ANTLR.g:231:5: p= 'protected'
                    {
                    p=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_rule630); 
                    tokens.replace(p,"fragment");

                    }
                    break;
                case 2 :
                    // ANTLR.g:232:5: 'public'
                    {
                    match(input,54,FOLLOW_54_in_rule638); 

                    }
                    break;
                case 3 :
                    // ANTLR.g:233:5: 'private'
                    {
                    match(input,55,FOLLOW_55_in_rule644); 

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_rule653);
            id10=id();
            _fsp--;

            // ANTLR.g:235:6: ( BANG )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BANG) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ANTLR.g:235:6: BANG
                    {
                    match(input,BANG,FOLLOW_BANG_in_rule655); 

                    }
                    break;

            }

            // ANTLR.g:235:12: ( ARG_ACTION )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ARG_ACTION) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ANTLR.g:235:12: ARG_ACTION
                    {
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule658); 

                    }
                    break;

            }

            // ANTLR.g:235:24: (r= 'returns' ret= ARG_ACTION )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ANTLR.g:235:26: r= 'returns' ret= ARG_ACTION
                    {
                    r=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_rule665); 
                    ret=(Token)input.LT(1);
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule669); 

                    }
                    break;

            }


            		if ( input.toString(id10.start,id10.stop).equals("tree") ) {
            			tokens.replace(((Token)id10.start), input.toString(id10.start,id10.stop)+"_");
            			tokens.insertAfter(((Token)id10.start), "/* tree is a keyword in v3! */");
            		}
            		if ( input.toString(id10.start,id10.stop).equals("grammar") ) {
            			tokens.replace(((Token)id10.start), input.toString(id10.start,id10.stop)+"_");
            			tokens.insertAfter(((Token)id10.start), "/* grammar is a keyword in v3! */");
            		}
            		if ( ret!=null && ret.getText().indexOf("=")>0 ) { // put in comment about assignment
            			tokens.insertBefore(r, "/* cannot use = (yet) in v3: ");
            			tokens.insertAfter(ret, "*/");
            		}
            		
            // ANTLR.g:250:3: ( throwsSpec )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ANTLR.g:250:3: throwsSpec
                    {
                    pushFollow(FOLLOW_throwsSpec_in_rule680);
                    throwsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:251:3: ( ruleOptionsSpec )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==OPTIONS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ANTLR.g:251:3: ruleOptionsSpec
                    {
                    pushFollow(FOLLOW_ruleOptionsSpec_in_rule685);
                    ruleOptionsSpec();
                    _fsp--;


                    }
                    break;

            }

            // ANTLR.g:252:3: (a= ACTION )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ACTION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ANTLR.g:252:4: a= ACTION
                    {
                    a=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_rule693); 
                    tokens.insertBefore(a,"@init ");

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_rule701); 
            pushFollow(FOLLOW_block_in_rule703);
            block();
            _fsp--;

            match(input,47,FOLLOW_47_in_rule705); 
            // ANTLR.g:254:3: ( exceptionGroup )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ANTLR.g:254:3: exceptionGroup
                    {
                    pushFollow(FOLLOW_exceptionGroup_in_rule709);
                    exceptionGroup();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end rule

    public static class ruleOptionsSpec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start ruleOptionsSpec
    // ANTLR.g:257:1: ruleOptionsSpec : OPTIONS ( id '=' optionValue ';' )* '}' ;
    public final ruleOptionsSpec_return ruleOptionsSpec() throws RecognitionException {
        ruleOptionsSpec_return retval = new ruleOptionsSpec_return();
        retval.start = input.LT(1);

        try {
            // ANTLR.g:258:4: ( OPTIONS ( id '=' optionValue ';' )* '}' )
            // ANTLR.g:258:4: OPTIONS ( id '=' optionValue ';' )* '}'
            {
            match(input,OPTIONS,FOLLOW_OPTIONS_in_ruleOptionsSpec721); 
            // ANTLR.g:258:12: ( id '=' optionValue ';' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TOKEN_REF||LA40_0==RULE_REF) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ANTLR.g:258:14: id '=' optionValue ';'
            	    {
            	    pushFollow(FOLLOW_id_in_ruleOptionsSpec725);
            	    id();
            	    _fsp--;

            	    match(input,46,FOLLOW_46_in_ruleOptionsSpec727); 
            	    pushFollow(FOLLOW_optionValue_in_ruleOptionsSpec729);
            	    optionValue();
            	    _fsp--;

            	    match(input,47,FOLLOW_47_in_ruleOptionsSpec731); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,RCURLY,FOLLOW_RCURLY_in_ruleOptionsSpec736); 

            		tokens.insertBefore(((Token)retval.start), "/*");
            		tokens.insertAfter(input.LT(-1), "*/"); // .stop not set yet
            		

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ruleOptionsSpec


    // $ANTLR start throwsSpec
    // ANTLR.g:265:1: throwsSpec : 'throws' id ( COMMA id )* ;
    public final void throwsSpec() throws RecognitionException {
        try {
            // ANTLR.g:266:4: ( 'throws' id ( COMMA id )* )
            // ANTLR.g:266:4: 'throws' id ( COMMA id )*
            {
            match(input,57,FOLLOW_57_in_throwsSpec751); 
            pushFollow(FOLLOW_id_in_throwsSpec753);
            id();
            _fsp--;

            // ANTLR.g:267:3: ( COMMA id )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ANTLR.g:267:5: COMMA id
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_throwsSpec759); 
            	    pushFollow(FOLLOW_id_in_throwsSpec761);
            	    id();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


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
    // $ANTLR end throwsSpec


    // $ANTLR start block
    // ANTLR.g:271:1: block : alternative ( OR alternative )* ;
    public final void block() throws RecognitionException {
        try {
            // ANTLR.g:273:3: ( alternative ( OR alternative )* )
            // ANTLR.g:273:3: alternative ( OR alternative )*
            {
            pushFollow(FOLLOW_alternative_in_block782);
            alternative();
            _fsp--;

            // ANTLR.g:273:15: ( OR alternative )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==OR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ANTLR.g:273:17: OR alternative
            	    {
            	    match(input,OR,FOLLOW_OR_in_block786); 
            	    pushFollow(FOLLOW_alternative_in_block788);
            	    alternative();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // $ANTLR end block


    // $ANTLR start alternative
    // ANTLR.g:277:1: alternative : ( BANG )? ( element )* ( exceptionSpecNoLabel )? ;
    public final void alternative() throws RecognitionException {
        try {
            // ANTLR.g:280:3: ( ( BANG )? ( element )* ( exceptionSpecNoLabel )? )
            // ANTLR.g:280:3: ( BANG )? ( element )* ( exceptionSpecNoLabel )?
            {
            // ANTLR.g:280:3: ( BANG )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==BANG) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ANTLR.g:280:4: BANG
                    {
                    match(input,BANG,FOLLOW_BANG_in_alternative813); 

                    }
                    break;

            }

            // ANTLR.g:280:11: ( element )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==SEMPRED||(LA44_0>=STRING_LITERAL && LA44_0<=ACTION)||LA44_0==CHAR_LITERAL||LA44_0==TOKEN_REF||LA44_0==LPAREN||(LA44_0>=RULE_REF && LA44_0<=TREE_BEGIN)||LA44_0==WILDCARD) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ANTLR.g:280:13: element
            	    {
            	    pushFollow(FOLLOW_element_in_alternative819);
            	    element();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ANTLR.g:280:24: ( exceptionSpecNoLabel )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ANTLR.g:280:26: exceptionSpecNoLabel
                    {
                    pushFollow(FOLLOW_exceptionSpecNoLabel_in_alternative826);
                    exceptionSpecNoLabel();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end alternative


    // $ANTLR start exceptionGroup
    // ANTLR.g:284:1: exceptionGroup : ( exceptionSpec )+ ;
    public final void exceptionGroup() throws RecognitionException {
        try {
            // ANTLR.g:285:4: ( ( exceptionSpec )+ )
            // ANTLR.g:285:4: ( exceptionSpec )+
            {
            // ANTLR.g:285:4: ( exceptionSpec )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==58) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ANTLR.g:285:6: exceptionSpec
            	    {
            	    pushFollow(FOLLOW_exceptionSpec_in_exceptionGroup846);
            	    exceptionSpec();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


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
    // $ANTLR end exceptionGroup


    // $ANTLR start exceptionSpec
    // ANTLR.g:288:1: exceptionSpec : 'exception' ( ARG_ACTION )? ( exceptionHandler )* ;
    public final void exceptionSpec() throws RecognitionException {
        try {
            // ANTLR.g:289:8: ( 'exception' ( ARG_ACTION )? ( exceptionHandler )* )
            // ANTLR.g:289:8: 'exception' ( ARG_ACTION )? ( exceptionHandler )*
            {
            match(input,58,FOLLOW_58_in_exceptionSpec866); 
            // ANTLR.g:289:19: ( ARG_ACTION )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ARG_ACTION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ANTLR.g:289:21: ARG_ACTION
                    {
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionSpec869); 

                    }
                    break;

            }

            // ANTLR.g:289:36: ( exceptionHandler )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==59) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ANTLR.g:289:38: exceptionHandler
            	    {
            	    pushFollow(FOLLOW_exceptionHandler_in_exceptionSpec877);
            	    exceptionHandler();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


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
    // $ANTLR end exceptionSpec


    // $ANTLR start exceptionSpecNoLabel
    // ANTLR.g:292:1: exceptionSpecNoLabel : 'exception' ( exceptionHandler )* ;
    public final void exceptionSpecNoLabel() throws RecognitionException {
        try {
            // ANTLR.g:293:8: ( 'exception' ( exceptionHandler )* )
            // ANTLR.g:293:8: 'exception' ( exceptionHandler )*
            {
            match(input,58,FOLLOW_58_in_exceptionSpecNoLabel897); 
            // ANTLR.g:293:20: ( exceptionHandler )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==59) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ANTLR.g:293:22: exceptionHandler
            	    {
            	    pushFollow(FOLLOW_exceptionHandler_in_exceptionSpecNoLabel901);
            	    exceptionHandler();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


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
    // $ANTLR end exceptionSpecNoLabel


    // $ANTLR start exceptionHandler
    // ANTLR.g:296:1: exceptionHandler : 'catch' ARG_ACTION ACTION ;
    public final void exceptionHandler() throws RecognitionException {
        try {
            // ANTLR.g:297:8: ( 'catch' ARG_ACTION ACTION )
            // ANTLR.g:297:8: 'catch' ARG_ACTION ACTION
            {
            match(input,59,FOLLOW_59_in_exceptionHandler921); 
            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler923); 
            match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler925); 

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
    // $ANTLR end exceptionHandler


    // $ANTLR start element
    // ANTLR.g:300:1: element : elementNoOptionSpec ( elementOptionSpec )? ;
    public final void element() throws RecognitionException {
        try {
            // ANTLR.g:301:4: ( elementNoOptionSpec ( elementOptionSpec )? )
            // ANTLR.g:301:4: elementNoOptionSpec ( elementOptionSpec )?
            {
            pushFollow(FOLLOW_elementNoOptionSpec_in_element938);
            elementNoOptionSpec();
            _fsp--;

            // ANTLR.g:301:24: ( elementOptionSpec )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==OPEN_ELEMENT_OPTION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ANTLR.g:301:25: elementOptionSpec
                    {
                    pushFollow(FOLLOW_elementOptionSpec_in_element941);
                    elementOptionSpec();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end element


    // $ANTLR start elementOptionSpec
    // ANTLR.g:304:1: elementOptionSpec : OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION ;
    public final void elementOptionSpec() throws RecognitionException {
        try {
            // ANTLR.g:305:4: ( OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION )
            // ANTLR.g:305:4: OPEN_ELEMENT_OPTION id '=' optionValue ( ';' id '=' optionValue )* CLOSE_ELEMENT_OPTION
            {
            match(input,OPEN_ELEMENT_OPTION,FOLLOW_OPEN_ELEMENT_OPTION_in_elementOptionSpec954); 
            pushFollow(FOLLOW_id_in_elementOptionSpec958);
            id();
            _fsp--;

            match(input,46,FOLLOW_46_in_elementOptionSpec960); 
            pushFollow(FOLLOW_optionValue_in_elementOptionSpec962);
            optionValue();
            _fsp--;

            // ANTLR.g:306:22: ( ';' id '=' optionValue )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==47) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ANTLR.g:306:24: ';' id '=' optionValue
            	    {
            	    match(input,47,FOLLOW_47_in_elementOptionSpec966); 
            	    pushFollow(FOLLOW_id_in_elementOptionSpec968);
            	    id();
            	    _fsp--;

            	    match(input,46,FOLLOW_46_in_elementOptionSpec970); 
            	    pushFollow(FOLLOW_optionValue_in_elementOptionSpec972);
            	    optionValue();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match(input,CLOSE_ELEMENT_OPTION,FOLLOW_CLOSE_ELEMENT_OPTION_in_elementOptionSpec979); 

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
    // $ANTLR end elementOptionSpec


    // $ANTLR start elementNoOptionSpec
    // ANTLR.g:310:1: elementNoOptionSpec : ( id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? ) | ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf ) | ACTION | SEMPRED | treeSpec );
    public final void elementNoOptionSpec() throws RecognitionException {
        Token ruleRef=null;
        Token c=null;

        try {
            // ANTLR.g:321:4: ( id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? ) | ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf ) | ACTION | SEMPRED | treeSpec )
            int alt62=5;
            switch ( input.LA(1) ) {
            case RULE_REF:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==SEMPRED||(LA62_1>=STRING_LITERAL && LA62_1<=ACTION)||(LA62_1>=OR && LA62_1<=CHAR_LITERAL)||LA62_1==TOKEN_REF||LA62_1==OPEN_ELEMENT_OPTION||(LA62_1>=LPAREN && LA62_1<=COLON)||(LA62_1>=RULE_REF && LA62_1<=TREE_BEGIN)||LA62_1==WILDCARD||LA62_1==47||LA62_1==58) ) {
                    alt62=2;
                }
                else if ( (LA62_1==46) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("310:1: elementNoOptionSpec : ( id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? ) | ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf ) | ACTION | SEMPRED | treeSpec );", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case TOKEN_REF:
                {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==SEMPRED||(LA62_2>=STRING_LITERAL && LA62_2<=ACTION)||(LA62_2>=OR && LA62_2<=RANGE)||LA62_2==TOKEN_REF||LA62_2==OPEN_ELEMENT_OPTION||(LA62_2>=LPAREN && LA62_2<=COLON)||(LA62_2>=RULE_REF && LA62_2<=TREE_BEGIN)||(LA62_2>=CARET && LA62_2<=WILDCARD)||LA62_2==47||LA62_2==58) ) {
                    alt62=2;
                }
                else if ( (LA62_2==46) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("310:1: elementNoOptionSpec : ( id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? ) | ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf ) | ACTION | SEMPRED | treeSpec );", 62, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case LPAREN:
            case NOT_OP:
            case WILDCARD:
                {
                alt62=2;
                }
                break;
            case ACTION:
                {
                alt62=3;
                }
                break;
            case SEMPRED:
                {
                alt62=4;
                }
                break;
            case TREE_BEGIN:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("310:1: elementNoOptionSpec : ( id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? ) | ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf ) | ACTION | SEMPRED | treeSpec );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ANTLR.g:321:4: id '=' ( id COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec995);
                    id();
                    _fsp--;

                    match(input,46,FOLLOW_46_in_elementNoOptionSpec997); 
                    // ANTLR.g:321:11: ( id COLON )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_REF) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==COLON) ) {
                            alt52=1;
                        }
                    }
                    else if ( (LA52_0==TOKEN_REF) ) {
                        int LA52_2 = input.LA(2);

                        if ( (LA52_2==COLON) ) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // ANTLR.g:321:13: id COLON
                            {
                            pushFollow(FOLLOW_id_in_elementNoOptionSpec1001);
                            id();
                            _fsp--;

                            match(input,COLON,FOLLOW_COLON_in_elementNoOptionSpec1003); 

                            }
                            break;

                    }

                    // ANTLR.g:322:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_REF) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==TOKEN_REF) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("322:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | TOKEN_REF ( ARG_ACTION )? )", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // ANTLR.g:322:5: ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )?
                            {
                            ruleRef=(Token)input.LT(1);
                            match(input,RULE_REF,FOLLOW_RULE_REF_in_elementNoOptionSpec1015); 
                            // ANTLR.g:322:22: ( ARG_ACTION )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==ARG_ACTION) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ANTLR.g:322:24: ARG_ACTION
                                    {
                                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_elementNoOptionSpec1019); 

                                    }
                                    break;

                            }

                            // ANTLR.g:322:38: ( BANG )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==BANG) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // ANTLR.g:322:40: BANG
                                    {
                                    match(input,BANG,FOLLOW_BANG_in_elementNoOptionSpec1026); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ANTLR.g:324:4: TOKEN_REF ( ARG_ACTION )?
                            {
                            match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_elementNoOptionSpec1039); 
                            // ANTLR.g:324:14: ( ARG_ACTION )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==ARG_ACTION) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ANTLR.g:324:16: ARG_ACTION
                                    {
                                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_elementNoOptionSpec1043); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:327:4: ( id c= COLON )? (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )
                    {
                    // ANTLR.g:327:4: ( id c= COLON )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_REF) ) {
                        int LA57_1 = input.LA(2);

                        if ( (LA57_1==COLON) ) {
                            alt57=1;
                        }
                    }
                    else if ( (LA57_0==TOKEN_REF) ) {
                        int LA57_2 = input.LA(2);

                        if ( (LA57_2==COLON) ) {
                            alt57=1;
                        }
                    }
                    switch (alt57) {
                        case 1 :
                            // ANTLR.g:327:5: id c= COLON
                            {
                            pushFollow(FOLLOW_id_in_elementNoOptionSpec1057);
                            id();
                            _fsp--;

                            c=(Token)input.LT(1);
                            match(input,COLON,FOLLOW_COLON_in_elementNoOptionSpec1061); 
                            tokens.replace(c,"=");

                            }
                            break;

                    }

                    // ANTLR.g:328:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )
                    int alt61=5;
                    switch ( input.LA(1) ) {
                    case RULE_REF:
                        {
                        alt61=1;
                        }
                        break;
                    case CHAR_LITERAL:
                        {
                        int LA61_2 = input.LA(2);

                        if ( (LA61_2==RANGE) ) {
                            alt61=2;
                        }
                        else if ( (LA61_2==SEMPRED||(LA61_2>=STRING_LITERAL && LA61_2<=ACTION)||(LA61_2>=OR && LA61_2<=CHAR_LITERAL)||LA61_2==TOKEN_REF||LA61_2==OPEN_ELEMENT_OPTION||(LA61_2>=LPAREN && LA61_2<=BANG)||(LA61_2>=RULE_REF && LA61_2<=TREE_BEGIN)||LA61_2==WILDCARD||LA61_2==47||LA61_2==58) ) {
                            alt61=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("328:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )", 61, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case TOKEN_REF:
                        {
                        int LA61_3 = input.LA(2);

                        if ( (LA61_3==RANGE) ) {
                            alt61=2;
                        }
                        else if ( (LA61_3==SEMPRED||(LA61_3>=STRING_LITERAL && LA61_3<=ACTION)||(LA61_3>=OR && LA61_3<=CHAR_LITERAL)||LA61_3==TOKEN_REF||LA61_3==OPEN_ELEMENT_OPTION||(LA61_3>=LPAREN && LA61_3<=ARG_ACTION)||(LA61_3>=RULE_REF && LA61_3<=TREE_BEGIN)||(LA61_3>=CARET && LA61_3<=WILDCARD)||LA61_3==47||LA61_3==58) ) {
                            alt61=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("328:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )", 61, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING_LITERAL:
                        {
                        int LA61_4 = input.LA(2);

                        if ( (LA61_4==RANGE) ) {
                            alt61=2;
                        }
                        else if ( (LA61_4==SEMPRED||(LA61_4>=STRING_LITERAL && LA61_4<=ACTION)||(LA61_4>=OR && LA61_4<=CHAR_LITERAL)||LA61_4==TOKEN_REF||LA61_4==OPEN_ELEMENT_OPTION||(LA61_4>=LPAREN && LA61_4<=BANG)||(LA61_4>=RULE_REF && LA61_4<=TREE_BEGIN)||(LA61_4>=CARET && LA61_4<=WILDCARD)||LA61_4==47||LA61_4==58) ) {
                            alt61=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("328:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )", 61, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WILDCARD:
                        {
                        alt61=3;
                        }
                        break;
                    case NOT_OP:
                        {
                        alt61=4;
                        }
                        break;
                    case LPAREN:
                        {
                        alt61=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("328:3: (ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )? | range | terminal | NOT_OP ( notTerminal | ebnf ) | ebnf )", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // ANTLR.g:328:5: ruleRef= RULE_REF ( ARG_ACTION )? ( BANG )?
                            {
                            ruleRef=(Token)input.LT(1);
                            match(input,RULE_REF,FOLLOW_RULE_REF_in_elementNoOptionSpec1074); 
                            // ANTLR.g:329:4: ( ARG_ACTION )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==ARG_ACTION) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // ANTLR.g:329:6: ARG_ACTION
                                    {
                                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_elementNoOptionSpec1081); 

                                    }
                                    break;

                            }

                            // ANTLR.g:330:4: ( BANG )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==BANG) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // ANTLR.g:330:6: BANG
                                    {
                                    match(input,BANG,FOLLOW_BANG_in_elementNoOptionSpec1092); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ANTLR.g:331:5: range
                            {
                            pushFollow(FOLLOW_range_in_elementNoOptionSpec1102);
                            range();
                            _fsp--;


                            }
                            break;
                        case 3 :
                            // ANTLR.g:332:5: terminal
                            {
                            pushFollow(FOLLOW_terminal_in_elementNoOptionSpec1109);
                            terminal();
                            _fsp--;


                            }
                            break;
                        case 4 :
                            // ANTLR.g:333:5: NOT_OP ( notTerminal | ebnf )
                            {
                            match(input,NOT_OP,FOLLOW_NOT_OP_in_elementNoOptionSpec1115); 
                            // ANTLR.g:334:4: ( notTerminal | ebnf )
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==CHAR_LITERAL||LA60_0==TOKEN_REF) ) {
                                alt60=1;
                            }
                            else if ( (LA60_0==LPAREN) ) {
                                alt60=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("334:4: ( notTerminal | ebnf )", 60, 0, input);

                                throw nvae;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ANTLR.g:334:6: notTerminal
                                    {
                                    pushFollow(FOLLOW_notTerminal_in_elementNoOptionSpec1122);
                                    notTerminal();
                                    _fsp--;


                                    }
                                    break;
                                case 2 :
                                    // ANTLR.g:335:6: ebnf
                                    {
                                    pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1129);
                                    ebnf();
                                    _fsp--;


                                    }
                                    break;

                            }


                            }
                            break;
                        case 5 :
                            // ANTLR.g:337:5: ebnf
                            {
                            pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1140);
                            ebnf();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ANTLR.g:339:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1149); 

                    }
                    break;
                case 4 :
                    // ANTLR.g:340:4: SEMPRED
                    {
                    match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1154); 

                    }
                    break;
                case 5 :
                    // ANTLR.g:341:4: treeSpec
                    {
                    pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1159);
                    treeSpec();
                    _fsp--;


                    }
                    break;

            }

            	if ( ruleRef!=null && ruleRef.getText().equals("tree") ) {
            		tokens.replace(ruleRef, ruleRef.getText()+"_");
            		tokens.insertAfter(ruleRef, "/* tree is a keyword in v3! */");
            	}
            	else if ( ruleRef!=null && ruleRef.getText().equals("grammar") ) {
            		tokens.replace(ruleRef, ruleRef.getText()+"_");
            		tokens.insertAfter(ruleRef, "/* grammar is a keyword in v3! */");
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
    // $ANTLR end elementNoOptionSpec


    // $ANTLR start treeSpec
    // ANTLR.g:344:1: treeSpec : TREE_BEGIN rootNode ( element )+ RPAREN ;
    public final void treeSpec() throws RecognitionException {
        Token TREE_BEGIN11=null;

        try {
            // ANTLR.g:345:2: ( TREE_BEGIN rootNode ( element )+ RPAREN )
            // ANTLR.g:345:2: TREE_BEGIN rootNode ( element )+ RPAREN
            {
            TREE_BEGIN11=(Token)input.LT(1);
            match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec1170); 
            tokens.replace(TREE_BEGIN11, "^(");
            pushFollow(FOLLOW_rootNode_in_treeSpec1175);
            rootNode();
            _fsp--;

            // ANTLR.g:346:11: ( element )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==SEMPRED||(LA63_0>=STRING_LITERAL && LA63_0<=ACTION)||LA63_0==CHAR_LITERAL||LA63_0==TOKEN_REF||LA63_0==LPAREN||(LA63_0>=RULE_REF && LA63_0<=TREE_BEGIN)||LA63_0==WILDCARD) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ANTLR.g:346:11: element
            	    {
            	    pushFollow(FOLLOW_element_in_treeSpec1177);
            	    element();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_treeSpec1180); 

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
    // $ANTLR end treeSpec


    // $ANTLR start rootNode
    // ANTLR.g:349:1: rootNode : ( id COLON )? terminal ;
    public final void rootNode() throws RecognitionException {
        try {
            // ANTLR.g:350:4: ( ( id COLON )? terminal )
            // ANTLR.g:350:4: ( id COLON )? terminal
            {
            // ANTLR.g:350:4: ( id COLON )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==TOKEN_REF) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==COLON) ) {
                    alt64=1;
                }
            }
            else if ( (LA64_0==RULE_REF) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ANTLR.g:350:5: id COLON
                    {
                    pushFollow(FOLLOW_id_in_rootNode1192);
                    id();
                    _fsp--;

                    match(input,COLON,FOLLOW_COLON_in_rootNode1194); 

                    }
                    break;

            }

            pushFollow(FOLLOW_terminal_in_rootNode1199);
            terminal();
            _fsp--;


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
    // $ANTLR end rootNode


    // $ANTLR start ebnf
    // ANTLR.g:353:1: ebnf : LPAREN ( optionsSpec (a= ACTION c= COLON | c= COLON ) | a= ACTION COLON )? block RPAREN ( ( QUESTION | STAR | PLUS )? ( BANG )? | IMPLIES ) ;
    public final void ebnf() throws RecognitionException {
        Token a=null;
        Token c=null;

        try {
            // ANTLR.g:354:4: ( LPAREN ( optionsSpec (a= ACTION c= COLON | c= COLON ) | a= ACTION COLON )? block RPAREN ( ( QUESTION | STAR | PLUS )? ( BANG )? | IMPLIES ) )
            // ANTLR.g:354:4: LPAREN ( optionsSpec (a= ACTION c= COLON | c= COLON ) | a= ACTION COLON )? block RPAREN ( ( QUESTION | STAR | PLUS )? ( BANG )? | IMPLIES )
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_ebnf1210); 
            // ANTLR.g:355:3: ( optionsSpec (a= ACTION c= COLON | c= COLON ) | a= ACTION COLON )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==OPTIONS) ) {
                alt66=1;
            }
            else if ( (LA66_0==ACTION) ) {
                int LA66_2 = input.LA(2);

                if ( (LA66_2==COLON) ) {
                    alt66=2;
                }
            }
            switch (alt66) {
                case 1 :
                    // ANTLR.g:355:7: optionsSpec (a= ACTION c= COLON | c= COLON )
                    {
                    pushFollow(FOLLOW_optionsSpec_in_ebnf1218);
                    optionsSpec();
                    _fsp--;

                    // ANTLR.g:356:4: (a= ACTION c= COLON | c= COLON )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==ACTION) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==COLON) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("356:4: (a= ACTION c= COLON | c= COLON )", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ANTLR.g:356:6: a= ACTION c= COLON
                            {
                            a=(Token)input.LT(1);
                            match(input,ACTION,FOLLOW_ACTION_in_ebnf1227); 
                            tokens.insertBefore(a,"@init ");
                            c=(Token)input.LT(1);
                            match(input,COLON,FOLLOW_COLON_in_ebnf1233); 

                            }
                            break;
                        case 2 :
                            // ANTLR.g:357:6: c= COLON
                            {
                            c=(Token)input.LT(1);
                            match(input,COLON,FOLLOW_COLON_in_ebnf1242); 
                            tokens.delete(c);

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:359:5: a= ACTION COLON
                    {
                    a=(Token)input.LT(1);
                    match(input,ACTION,FOLLOW_ACTION_in_ebnf1258); 
                    tokens.insertBefore(a,"@init ");
                    match(input,COLON,FOLLOW_COLON_in_ebnf1262); 

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_ebnf1271);
            block();
            _fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_ebnf1275); 
            // ANTLR.g:363:3: ( ( QUESTION | STAR | PLUS )? ( BANG )? | IMPLIES )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==SEMPRED||(LA69_0>=STRING_LITERAL && LA69_0<=ACTION)||(LA69_0>=OR && LA69_0<=CHAR_LITERAL)||LA69_0==TOKEN_REF||LA69_0==OPEN_ELEMENT_OPTION||(LA69_0>=LPAREN && LA69_0<=BANG)||(LA69_0>=RULE_REF && LA69_0<=PLUS)||LA69_0==WILDCARD||LA69_0==47||LA69_0==58) ) {
                alt69=1;
            }
            else if ( (LA69_0==IMPLIES) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("363:3: ( ( QUESTION | STAR | PLUS )? ( BANG )? | IMPLIES )", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ANTLR.g:363:5: ( QUESTION | STAR | PLUS )? ( BANG )?
                    {
                    // ANTLR.g:363:5: ( QUESTION | STAR | PLUS )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=QUESTION && LA67_0<=PLUS)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ANTLR.g:
                            {
                            if ( (input.LA(1)>=QUESTION && input.LA(1)<=PLUS) ) {
                                input.consume();
                                errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ebnf1281);    throw mse;
                            }


                            }
                            break;

                    }

                    // ANTLR.g:367:4: ( BANG )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ANTLR.g:367:6: BANG
                            {
                            match(input,BANG,FOLLOW_BANG_in_ebnf1310); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:368:5: IMPLIES
                    {
                    match(input,IMPLIES,FOLLOW_IMPLIES_in_ebnf1319); 

                    }
                    break;

            }


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
    // $ANTLR end ebnf


    // $ANTLR start ast_type_spec
    // ANTLR.g:372:1: ast_type_spec : ( CARET | BANG )? ;
    public final void ast_type_spec() throws RecognitionException {
        try {
            // ANTLR.g:373:4: ( ( CARET | BANG )? )
            // ANTLR.g:373:4: ( CARET | BANG )?
            {
            // ANTLR.g:373:4: ( CARET | BANG )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BANG||LA70_0==CARET) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ANTLR.g:
                    {
                    if ( input.LA(1)==BANG||input.LA(1)==CARET ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ast_type_spec1334);    throw mse;
                    }


                    }
                    break;

            }


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
    // $ANTLR end ast_type_spec


    // $ANTLR start range
    // ANTLR.g:378:1: range : ( CHAR_LITERAL RANGE CHAR_LITERAL ( BANG )? | ( TOKEN_REF | STRING_LITERAL ) RANGE ( TOKEN_REF | STRING_LITERAL ) ast_type_spec );
    public final void range() throws RecognitionException {
        try {
            // ANTLR.g:380:4: ( CHAR_LITERAL RANGE CHAR_LITERAL ( BANG )? | ( TOKEN_REF | STRING_LITERAL ) RANGE ( TOKEN_REF | STRING_LITERAL ) ast_type_spec )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==CHAR_LITERAL) ) {
                alt72=1;
            }
            else if ( (LA72_0==STRING_LITERAL||LA72_0==TOKEN_REF) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("378:1: range : ( CHAR_LITERAL RANGE CHAR_LITERAL ( BANG )? | ( TOKEN_REF | STRING_LITERAL ) RANGE ( TOKEN_REF | STRING_LITERAL ) ast_type_spec );", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ANTLR.g:380:4: CHAR_LITERAL RANGE CHAR_LITERAL ( BANG )?
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1359); 
                    match(input,RANGE,FOLLOW_RANGE_in_range1361); 
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1363); 
                    // ANTLR.g:381:3: ( BANG )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==BANG) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ANTLR.g:381:5: BANG
                            {
                            match(input,BANG,FOLLOW_BANG_in_range1369); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:384:3: ( TOKEN_REF | STRING_LITERAL ) RANGE ( TOKEN_REF | STRING_LITERAL ) ast_type_spec
                    {
                    if ( input.LA(1)==STRING_LITERAL||input.LA(1)==TOKEN_REF ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_range1381);    throw mse;
                    }

                    match(input,RANGE,FOLLOW_RANGE_in_range1389); 
                    if ( input.LA(1)==STRING_LITERAL||input.LA(1)==TOKEN_REF ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_range1393);    throw mse;
                    }

                    pushFollow(FOLLOW_ast_type_spec_in_range1401);
                    ast_type_spec();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end range


    // $ANTLR start terminal
    // ANTLR.g:390:1: terminal : ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec ( ARG_ACTION )? | STRING_LITERAL ast_type_spec | WILDCARD ast_type_spec );
    public final void terminal() throws RecognitionException {
        try {
            // ANTLR.g:393:3: ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec ( ARG_ACTION )? | STRING_LITERAL ast_type_spec | WILDCARD ast_type_spec )
            int alt75=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt75=1;
                }
                break;
            case TOKEN_REF:
                {
                alt75=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt75=3;
                }
                break;
            case WILDCARD:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("390:1: terminal : ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec ( ARG_ACTION )? | STRING_LITERAL ast_type_spec | WILDCARD ast_type_spec );", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ANTLR.g:393:3: CHAR_LITERAL ( BANG )?
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal1415); 
                    // ANTLR.g:394:3: ( BANG )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==BANG) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ANTLR.g:394:5: BANG
                            {
                            match(input,BANG,FOLLOW_BANG_in_terminal1421); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:397:3: TOKEN_REF ast_type_spec ( ARG_ACTION )?
                    {
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal1433); 
                    pushFollow(FOLLOW_ast_type_spec_in_terminal1437);
                    ast_type_spec();
                    _fsp--;

                    // ANTLR.g:400:3: ( ARG_ACTION )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==ARG_ACTION) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ANTLR.g:400:5: ARG_ACTION
                            {
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal1446); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ANTLR.g:403:3: STRING_LITERAL ast_type_spec
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal1458); 
                    pushFollow(FOLLOW_ast_type_spec_in_terminal1462);
                    ast_type_spec();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // ANTLR.g:407:3: WILDCARD ast_type_spec
                    {
                    match(input,WILDCARD,FOLLOW_WILDCARD_in_terminal1470); 
                    pushFollow(FOLLOW_ast_type_spec_in_terminal1474);
                    ast_type_spec();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end terminal


    // $ANTLR start notTerminal
    // ANTLR.g:412:1: notTerminal : ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec );
    public final void notTerminal() throws RecognitionException {
        try {
            // ANTLR.g:414:3: ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CHAR_LITERAL) ) {
                alt77=1;
            }
            else if ( (LA77_0==TOKEN_REF) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("412:1: notTerminal : ( CHAR_LITERAL ( BANG )? | TOKEN_REF ast_type_spec );", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ANTLR.g:414:3: CHAR_LITERAL ( BANG )?
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_notTerminal1488); 
                    // ANTLR.g:415:3: ( BANG )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BANG) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ANTLR.g:415:5: BANG
                            {
                            match(input,BANG,FOLLOW_BANG_in_notTerminal1494); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ANTLR.g:418:3: TOKEN_REF ast_type_spec
                    {
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_notTerminal1506); 
                    pushFollow(FOLLOW_ast_type_spec_in_notTerminal1510);
                    ast_type_spec();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end notTerminal


    // $ANTLR start qualifiedID
    // ANTLR.g:423:1: qualifiedID : id ( WILDCARD id )* ;
    public final void qualifiedID() throws RecognitionException {
        try {
            // ANTLR.g:427:4: ( id ( WILDCARD id )* )
            // ANTLR.g:427:4: id ( WILDCARD id )*
            {
            pushFollow(FOLLOW_id_in_qualifiedID1524);
            id();
            _fsp--;

            // ANTLR.g:428:3: ( WILDCARD id )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==WILDCARD) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ANTLR.g:428:5: WILDCARD id
            	    {
            	    match(input,WILDCARD,FOLLOW_WILDCARD_in_qualifiedID1530); 
            	    pushFollow(FOLLOW_id_in_qualifiedID1532);
            	    id();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


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
    // $ANTLR end qualifiedID

    public static class id_return extends ParserRuleReturnScope {
    };

    // $ANTLR start id
    // ANTLR.g:434:1: id : ( TOKEN_REF | RULE_REF );
    public final id_return id() throws RecognitionException {
        id_return retval = new id_return();
        retval.start = input.LT(1);

        try {
            // ANTLR.g:434:6: ( TOKEN_REF | RULE_REF )
            // ANTLR.g:
            {
            if ( input.LA(1)==TOKEN_REF||input.LA(1)==RULE_REF ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_id0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end id


 

    public static final BitSet FOLLOW_45_in_antlrGrammar39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_antlrGrammar41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ACTION_in_antlrGrammar43 = new BitSet(new long[]{0x00012000000001A0L});
    public static final BitSet FOLLOW_45_in_antlrGrammar50 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ACTION_in_antlrGrammar54 = new BitSet(new long[]{0x00012000000001A0L});
    public static final BitSet FOLLOW_optionsSpec_in_antlrGrammar65 = new BitSet(new long[]{0x00010000000000A0L});
    public static final BitSet FOLLOW_classDef_in_antlrGrammar73 = new BitSet(new long[]{0x00010000000000A0L});
    public static final BitSet FOLLOW_EOF_in_antlrGrammar79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_classDef98 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_classDef106 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_lexerSpec_in_classDef114 = new BitSet(new long[]{0x00E0000001004020L});
    public static final BitSet FOLLOW_treeParserSpec_in_classDef121 = new BitSet(new long[]{0x00E0000001004020L});
    public static final BitSet FOLLOW_parserSpec_in_classDef126 = new BitSet(new long[]{0x00E0000001004020L});
    public static final BitSet FOLLOW_rules_in_classDef135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_optionsSpec146 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_id_in_optionsSpec152 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_optionsSpec154 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_optionsSpec158 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_optionsSpec160 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_RCURLY_in_optionsSpec174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_optionValue194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_optionValue204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charSet_in_optionValue209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setBlockElement_in_charSet220 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OR_in_charSet224 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_setBlockElement_in_charSet226 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_setBlockElement240 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RANGE_in_setBlockElement243 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_setBlockElement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKENS_in_tokensSpec263 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_TOKEN_REF_in_tokensSpec272 = new BitSet(new long[]{0x0000C00000010000L});
    public static final BitSet FOLLOW_46_in_tokensSpec276 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokensSpec278 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_tokensSpecOptions_in_tokensSpec284 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokensSpec298 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_tokensSpecOptions_in_tokensSpec301 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_tokensSpec322 = new BitSet(new long[]{0x000000000000C040L});
    public static final BitSet FOLLOW_RCURLY_in_tokensSpec332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_ELEMENT_OPTION_in_tokensSpecOptions347 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_tokensSpecOptions351 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_tokensSpecOptions353 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_tokensSpecOptions355 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_47_in_tokensSpecOptions364 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_tokensSpecOptions369 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_tokensSpecOptions371 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_tokensSpecOptions373 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_CLOSE_ELEMENT_OPTION_in_tokensSpecOptions383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_superClass394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_superClass401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_superClass406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parserSpec417 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_parserSpec419 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_parserSpec425 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parserSpec427 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_superClass_in_parserSpec430 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parserSpec448 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_optionsSpec_in_parserSpec453 = new BitSet(new long[]{0x0000000000002082L});
    public static final BitSet FOLLOW_tokensSpec_in_parserSpec460 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ACTION_in_parserSpec468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_lexerSpec489 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_lexerSpec491 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_lexerSpec493 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_lexerSpec495 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_superClass_in_lexerSpec498 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_lexerSpec504 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_optionsSpec_in_lexerSpec513 = new BitSet(new long[]{0x0000000000002082L});
    public static final BitSet FOLLOW_tokensSpec_in_lexerSpec520 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ACTION_in_lexerSpec528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_treeParserSpec549 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_treeParserSpec551 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_treeParserSpec553 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_treeParserSpec555 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_superClass_in_treeParserSpec558 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_treeParserSpec564 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_optionsSpec_in_treeParserSpec573 = new BitSet(new long[]{0x0000000000002082L});
    public static final BitSet FOLLOW_tokensSpec_in_treeParserSpec580 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ACTION_in_treeParserSpec588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_rules608 = new BitSet(new long[]{0x00E0000001004022L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_rule621 = new BitSet(new long[]{0x00E0000001004000L});
    public static final BitSet FOLLOW_53_in_rule630 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_54_in_rule638 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_55_in_rule644 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_rule653 = new BitSet(new long[]{0x0300000000700180L});
    public static final BitSet FOLLOW_BANG_in_rule655 = new BitSet(new long[]{0x0300000000600180L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule658 = new BitSet(new long[]{0x0300000000400180L});
    public static final BitSet FOLLOW_56_in_rule665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule669 = new BitSet(new long[]{0x0200000000400180L});
    public static final BitSet FOLLOW_throwsSpec_in_rule680 = new BitSet(new long[]{0x0000000000400180L});
    public static final BitSet FOLLOW_ruleOptionsSpec_in_rule685 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_ACTION_in_rule693 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_rule701 = new BitSet(new long[]{0x0400800107144CD0L});
    public static final BitSet FOLLOW_block_in_rule703 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rule705 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_exceptionGroup_in_rule709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_ruleOptionsSpec721 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_id_in_ruleOptionsSpec725 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleOptionsSpec727 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_ruleOptionsSpec729 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleOptionsSpec731 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_RCURLY_in_ruleOptionsSpec736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_throwsSpec751 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_throwsSpec753 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_throwsSpec759 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_throwsSpec761 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_alternative_in_block782 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OR_in_block786 = new BitSet(new long[]{0x0400000107144CD2L});
    public static final BitSet FOLLOW_alternative_in_block788 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_BANG_in_alternative813 = new BitSet(new long[]{0x04000001070448D2L});
    public static final BitSet FOLLOW_element_in_alternative819 = new BitSet(new long[]{0x04000001070448D2L});
    public static final BitSet FOLLOW_exceptionSpecNoLabel_in_alternative826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exceptionSpec_in_exceptionGroup846 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_exceptionSpec866 = new BitSet(new long[]{0x0800000000200002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionSpec869 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionSpec877 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_58_in_exceptionSpecNoLabel897 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionSpecNoLabel901 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_exceptionHandler921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler923 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ACTION_in_exceptionHandler925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementNoOptionSpec_in_element938 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_elementOptionSpec_in_element941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_ELEMENT_OPTION_in_elementOptionSpec954 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_elementOptionSpec958 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_elementOptionSpec960 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_elementOptionSpec962 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_47_in_elementOptionSpec966 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_elementOptionSpec968 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_elementOptionSpec970 = new BitSet(new long[]{0x0000000001004A40L});
    public static final BitSet FOLLOW_optionValue_in_elementOptionSpec972 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_CLOSE_ELEMENT_OPTION_in_elementOptionSpec979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec995 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_elementNoOptionSpec997 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_elementNoOptionSpec1003 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_RULE_REF_in_elementNoOptionSpec1015 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_elementNoOptionSpec1019 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_elementNoOptionSpec1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_elementNoOptionSpec1039 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_elementNoOptionSpec1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_elementNoOptionSpec1061 = new BitSet(new long[]{0x0000000103044840L});
    public static final BitSet FOLLOW_RULE_REF_in_elementNoOptionSpec1074 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_elementNoOptionSpec1081 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_elementNoOptionSpec1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_elementNoOptionSpec1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminal_in_elementNoOptionSpec1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_OP_in_elementNoOptionSpec1115 = new BitSet(new long[]{0x0000000000044800L});
    public static final BitSet FOLLOW_notTerminal_in_elementNoOptionSpec1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec1170 = new BitSet(new long[]{0x0000000101004840L});
    public static final BitSet FOLLOW_rootNode_in_treeSpec1175 = new BitSet(new long[]{0x00000001070448D0L});
    public static final BitSet FOLLOW_element_in_treeSpec1177 = new BitSet(new long[]{0x00000001070C48D0L});
    public static final BitSet FOLLOW_RPAREN_in_treeSpec1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rootNode1192 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_rootNode1194 = new BitSet(new long[]{0x0000000100004840L});
    public static final BitSet FOLLOW_terminal_in_rootNode1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ebnf1210 = new BitSet(new long[]{0x04000001071C4DD0L});
    public static final BitSet FOLLOW_optionsSpec_in_ebnf1218 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_ACTION_in_ebnf1227 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_ebnf1233 = new BitSet(new long[]{0x04000001071C4CD0L});
    public static final BitSet FOLLOW_COLON_in_ebnf1242 = new BitSet(new long[]{0x04000001071C4CD0L});
    public static final BitSet FOLLOW_ACTION_in_ebnf1258 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_ebnf1262 = new BitSet(new long[]{0x04000001071C4CD0L});
    public static final BitSet FOLLOW_block_in_ebnf1271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_ebnf1275 = new BitSet(new long[]{0x0000000078100002L});
    public static final BitSet FOLLOW_set_in_ebnf1281 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_ebnf1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLIES_in_ebnf1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ast_type_spec1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RANGE_in_range1361 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1363 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_range1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_range1381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RANGE_in_range1389 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_set_in_range1393 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ast_type_spec_in_range1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal1415 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_terminal1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_terminal1433 = new BitSet(new long[]{0x0000000080300002L});
    public static final BitSet FOLLOW_ast_type_spec_in_terminal1437 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_terminal1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_terminal1458 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ast_type_spec_in_terminal1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WILDCARD_in_terminal1470 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ast_type_spec_in_terminal1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_notTerminal1488 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BANG_in_notTerminal1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_notTerminal1506 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ast_type_spec_in_notTerminal1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualifiedID1524 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_WILDCARD_in_qualifiedID1530 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_id_in_qualifiedID1532 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});

}