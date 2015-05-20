// $ANTLR 3.0b8 ANTLR.g 2007-05-11 14:32:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ANTLRLexer extends Lexer {
    public static final int COMMA=23;
    public static final int NESTED_ACTION=42;
    public static final int T58=58;
    public static final int BANG=20;
    public static final int QUESTION=27;
    public static final int T45=45;
    public static final int OR=10;
    public static final int CLOSE_ELEMENT_OPTION=17;
    public static final int RCURLY=15;
    public static final int NOT_OP=25;
    public static final int IMPLIES=30;
    public static final int CHAR_LITERAL=11;
    public static final int INT=9;
    public static final int STRING_LITERAL=6;
    public static final int T51=51;
    public static final int RPAREN=19;
    public static final int OPTIONS=8;
    public static final int TOKENS=13;
    public static final int LPAREN=18;
    public static final int T46=46;
    public static final int PLUS=29;
    public static final int ML_COMMENT=35;
    public static final int DIGIT=39;
    public static final int SL_COMMENT=34;
    public static final int WS_OPT=44;
    public static final int T55=55;
    public static final int RANGE=12;
    public static final int T50=50;
    public static final int WS=33;
    public static final int ARG_ACTION=21;
    public static final int TOKEN_REF=14;
    public static final int ACTION=7;
    public static final int WILDCARD=32;
    public static final int COMMENT=36;
    public static final int WS_LOOP=40;
    public static final int T57=57;
    public static final int CARET=31;
    public static final int ESC=37;
    public static final int OPEN_ELEMENT_OPTION=16;
    public static final int XDIGIT=38;
    public static final int RULE_REF=24;
    public static final int TREE_BEGIN=26;
    public static final int T56=56;
    public static final int SEMPRED=4;
    public static final int NESTED_ARG_ACTION=41;
    public static final int T59=59;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int INTERNAL_RULE_REF=43;
    public static final int Tokens=60;
    public static final int T53=53;
    public static final int COLON=22;
    public static final int T49=49;
    public static final int STAR=28;
    public static final int T52=52;
    public static final int DOC_COMMENT=5;
    public ANTLRLexer() {;} 
    public ANTLRLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ANTLR.g"; }

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ANTLR.g:3:7: ( 'header' )
            // ANTLR.g:3:7: 'header'
            {
            match("header"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ANTLR.g:4:7: ( '=' )
            // ANTLR.g:4:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ANTLR.g:5:7: ( ';' )
            // ANTLR.g:5:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ANTLR.g:6:7: ( 'class' )
            // ANTLR.g:6:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ANTLR.g:7:7: ( 'extends' )
            // ANTLR.g:7:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ANTLR.g:8:7: ( 'Parser' )
            // ANTLR.g:8:7: 'Parser'
            {
            match("Parser"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ANTLR.g:9:7: ( 'Lexer' )
            // ANTLR.g:9:7: 'Lexer'
            {
            match("Lexer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ANTLR.g:10:7: ( 'TreeParser' )
            // ANTLR.g:10:7: 'TreeParser'
            {
            match("TreeParser"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ANTLR.g:11:7: ( 'protected' )
            // ANTLR.g:11:7: 'protected'
            {
            match("protected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ANTLR.g:12:7: ( 'public' )
            // ANTLR.g:12:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ANTLR.g:13:7: ( 'private' )
            // ANTLR.g:13:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ANTLR.g:14:7: ( 'returns' )
            // ANTLR.g:14:7: 'returns'
            {
            match("returns"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ANTLR.g:15:7: ( 'throws' )
            // ANTLR.g:15:7: 'throws'
            {
            match("throws"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ANTLR.g:16:7: ( 'exception' )
            // ANTLR.g:16:7: 'exception'
            {
            match("exception"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ANTLR.g:17:7: ( 'catch' )
            // ANTLR.g:17:7: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // ANTLR.g:438:6: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' ) )
            // ANTLR.g:438:6: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )
            {
            // ANTLR.g:438:6: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt1=1;
                }
                break;
            case '\t':
                {
                alt1=2;
                }
                break;
            case '\r':
                {
                alt1=3;
                }
                break;
            case '\n':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("438:6: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ANTLR.g:438:8: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // ANTLR.g:439:5: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // ANTLR.g:440:5: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // ANTLR.g:441:5: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            // ANTLR.g:448:4: ( SL_COMMENT | ML_COMMENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='/') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='*') ) {
                    alt2=2;
                }
                else if ( (LA2_1=='/') ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("446:1: fragment COMMENT : ( SL_COMMENT | ML_COMMENT );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("446:1: fragment COMMENT : ( SL_COMMENT | ML_COMMENT );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ANTLR.g:448:4: SL_COMMENT
                    {
                    mSL_COMMENT(); 

                    }
                    break;
                case 2 :
                    // ANTLR.g:448:17: ML_COMMENT
                    {
                    mML_COMMENT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start SL_COMMENT
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            // ANTLR.g:452:9: ( '//' ( . )* ( '\\r' )? '\\n' )
            // ANTLR.g:452:9: '//' ( . )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ANTLR.g:452:14: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ANTLR.g:452:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ANTLR.g:452:17: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ANTLR.g:452:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SL_COMMENT

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // ANTLR.g:456:9: ( '/*' ( '*' )? ( . )* '*/' )
            // ANTLR.g:456:9: '/*' ( '*' )? ( . )* '*/'
            {
            match("/*"); 

            // ANTLR.g:456:14: ( '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='*') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ANTLR.g:456:15: '*'
                    {
                    match('*'); 
                    type=DOC_COMMENT;

                    }
                    break;

            }

            // ANTLR.g:456:41: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFE')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ANTLR.g:456:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start OPEN_ELEMENT_OPTION
    public final void mOPEN_ELEMENT_OPTION() throws RecognitionException {
        try {
            int _type = OPEN_ELEMENT_OPTION;
            // ANTLR.g:460:4: ( '<' )
            // ANTLR.g:460:4: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPEN_ELEMENT_OPTION

    // $ANTLR start CLOSE_ELEMENT_OPTION
    public final void mCLOSE_ELEMENT_OPTION() throws RecognitionException {
        try {
            int _type = CLOSE_ELEMENT_OPTION;
            // ANTLR.g:464:4: ( '>' )
            // ANTLR.g:464:4: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSE_ELEMENT_OPTION

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // ANTLR.g:467:9: ( ',' )
            // ANTLR.g:467:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // ANTLR.g:469:12: ( '?' )
            // ANTLR.g:469:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start TREE_BEGIN
    public final void mTREE_BEGIN() throws RecognitionException {
        try {
            int _type = TREE_BEGIN;
            // ANTLR.g:471:14: ( '#(' )
            // ANTLR.g:471:14: '#('
            {
            match("#("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TREE_BEGIN

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // ANTLR.g:473:9: ( '(' )
            // ANTLR.g:473:9: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // ANTLR.g:475:9: ( ')' )
            // ANTLR.g:475:9: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // ANTLR.g:477:9: ( ':' )
            // ANTLR.g:477:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // ANTLR.g:479:7: ( '*' )
            // ANTLR.g:479:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // ANTLR.g:481:7: ( '+' )
            // ANTLR.g:481:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start IMPLIES
    public final void mIMPLIES() throws RecognitionException {
        try {
            int _type = IMPLIES;
            // ANTLR.g:483:11: ( '=>' )
            // ANTLR.g:483:11: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IMPLIES

    // $ANTLR start CARET
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            // ANTLR.g:485:9: ( '^' )
            // ANTLR.g:485:9: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CARET

    // $ANTLR start BANG
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            // ANTLR.g:487:8: ( '!' )
            // ANTLR.g:487:8: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BANG

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // ANTLR.g:489:6: ( '|' )
            // ANTLR.g:489:6: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start WILDCARD
    public final void mWILDCARD() throws RecognitionException {
        try {
            int _type = WILDCARD;
            // ANTLR.g:491:12: ( '.' )
            // ANTLR.g:491:12: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WILDCARD

    // $ANTLR start RANGE
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            // ANTLR.g:493:9: ( '..' )
            // ANTLR.g:493:9: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RANGE

    // $ANTLR start NOT_OP
    public final void mNOT_OP() throws RecognitionException {
        try {
            int _type = NOT_OP;
            // ANTLR.g:495:10: ( '~' )
            // ANTLR.g:495:10: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_OP

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // ANTLR.g:497:9: ( '}' )
            // ANTLR.g:497:9: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start CHAR_LITERAL
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            // ANTLR.g:500:4: ( '\\'' ( ESC | ~ '\\'' ) '\\'' )
            // ANTLR.g:500:4: '\\'' ( ESC | ~ '\\'' ) '\\''
            {
            match('\''); 
            // ANTLR.g:500:9: ( ESC | ~ '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\"'||(LA7_1>='0' && LA7_1<='7')||LA7_1=='\\'||(LA7_1>='a' && LA7_1<='b')||LA7_1=='f'||LA7_1=='n'||LA7_1=='r'||(LA7_1>='t' && LA7_1<='u')||LA7_1=='w') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='\'') ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4=='\'') ) {
                        alt7=1;
                    }
                    else {
                        alt7=2;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("500:9: ( ESC | ~ '\\'' )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("500:9: ( ESC | ~ '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ANTLR.g:500:10: ESC
                    {
                    mESC(); 

                    }
                    break;
                case 2 :
                    // ANTLR.g:500:14: ~ '\\''
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR_LITERAL

    // $ANTLR start STRING_LITERAL
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            // ANTLR.g:504:4: ( '\"' ( ESC | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ANTLR.g:504:4: '\"' ( ESC | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // ANTLR.g:504:8: ( ESC | ~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ANTLR.g:504:9: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // ANTLR.g:504:13: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            			String s = getText();
            			s = s.substring(1,s.length()-1);
            			setText("'"+s+"'");
            		

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_LITERAL

    // $ANTLR start ESC
    public final void mESC() throws RecognitionException {
        try {
            // ANTLR.g:513:7: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT ) )
            // ANTLR.g:513:7: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT )
            {
            match('\\'); 
            // ANTLR.g:514:3: ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt12=1;
                }
                break;
            case 'r':
                {
                alt12=2;
                }
                break;
            case 't':
                {
                alt12=3;
                }
                break;
            case 'b':
                {
                alt12=4;
                }
                break;
            case 'f':
                {
                alt12=5;
                }
                break;
            case 'w':
                {
                alt12=6;
                }
                break;
            case 'a':
                {
                alt12=7;
                }
                break;
            case '\"':
                {
                alt12=8;
                }
                break;
            case '\'':
                {
                alt12=9;
                }
                break;
            case '\\':
                {
                alt12=10;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                alt12=11;
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt12=12;
                }
                break;
            case 'u':
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("514:3: ( 'n' | 'r' | 't' | 'b' | 'f' | 'w' | 'a' | '\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )? | ( '4' .. '7' ) ( '0' .. '7' )? | 'u' XDIGIT XDIGIT XDIGIT XDIGIT )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ANTLR.g:514:5: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // ANTLR.g:515:5: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // ANTLR.g:516:5: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // ANTLR.g:517:5: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // ANTLR.g:518:5: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // ANTLR.g:519:5: 'w'
                    {
                    match('w'); 

                    }
                    break;
                case 7 :
                    // ANTLR.g:520:5: 'a'
                    {
                    match('a'); 

                    }
                    break;
                case 8 :
                    // ANTLR.g:521:5: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 9 :
                    // ANTLR.g:522:5: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 10 :
                    // ANTLR.g:523:5: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 11 :
                    // ANTLR.g:524:5: ( '0' .. '3' ) ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    // ANTLR.g:524:5: ( '0' .. '3' )
                    // ANTLR.g:524:6: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ANTLR.g:525:4: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ANTLR.g:525:6: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); 
                            // ANTLR.g:525:15: ( '0' .. '7' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ANTLR.g:525:17: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // ANTLR.g:526:5: ( '4' .. '7' ) ( '0' .. '7' )?
                    {
                    // ANTLR.g:526:5: ( '4' .. '7' )
                    // ANTLR.g:526:6: '4' .. '7'
                    {
                    matchRange('4','7'); 

                    }

                    // ANTLR.g:527:4: ( '0' .. '7' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='7')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ANTLR.g:527:6: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // ANTLR.g:528:5: 'u' XDIGIT XDIGIT XDIGIT XDIGIT
                    {
                    match('u'); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESC

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // ANTLR.g:534:4: ( '0' .. '9' )
            // ANTLR.g:534:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start XDIGIT
    public final void mXDIGIT() throws RecognitionException {
        try {
            // ANTLR.g:539:3: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // ANTLR.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end XDIGIT

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // ANTLR.g:544:7: ( ( '0' .. '9' )+ )
            // ANTLR.g:544:7: ( '0' .. '9' )+
            {
            // ANTLR.g:544:7: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ANTLR.g:544:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start OPTIONS
    public final void mOPTIONS() throws RecognitionException {
        try {
            int _type = OPTIONS;
            // ANTLR.g:548:4: ( 'options' WS_LOOP '{' )
            // ANTLR.g:548:4: 'options' WS_LOOP '{'
            {
            match("options"); 

            mWS_LOOP(); 
            match('{'); 
            channel=0;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPTIONS

    // $ANTLR start TOKENS
    public final void mTOKENS() throws RecognitionException {
        try {
            int _type = TOKENS;
            // ANTLR.g:552:4: ( 'tokens' WS_LOOP '{' )
            // ANTLR.g:552:4: 'tokens' WS_LOOP '{'
            {
            match("tokens"); 

            mWS_LOOP(); 
            match('{'); 
            channel=0;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKENS

    // $ANTLR start ARG_ACTION
    public final void mARG_ACTION() throws RecognitionException {
        try {
            int _type = ARG_ACTION;
            // ANTLR.g:557:2: ( NESTED_ARG_ACTION )
            // ANTLR.g:557:2: NESTED_ARG_ACTION
            {
            mNESTED_ARG_ACTION(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARG_ACTION

    // $ANTLR start NESTED_ARG_ACTION
    public final void mNESTED_ARG_ACTION() throws RecognitionException {
        try {
            // ANTLR.g:563:4: ( '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )* ']' )
            // ANTLR.g:563:4: '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )* ']'
            {
            match('['); 
            // ANTLR.g:564:3: ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | CHAR_LITERAL | STRING_LITERAL | . )*
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==']') ) {
                    alt14=5;
                }
                else if ( (LA14_0=='[') ) {
                    alt14=1;
                }
                else if ( (LA14_0=='\'') ) {
                    alt14=2;
                }
                else if ( (LA14_0=='\"') ) {
                    alt14=3;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='Z')||LA14_0=='\\'||(LA14_0>='^' && LA14_0<='\uFFFE')) ) {
                    alt14=4;
                }


                switch (alt14) {
            	case 1 :
            	    // ANTLR.g:565:5: NESTED_ARG_ACTION
            	    {
            	    mNESTED_ARG_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // ANTLR.g:566:5: CHAR_LITERAL
            	    {
            	    mCHAR_LITERAL(); 

            	    }
            	    break;
            	case 3 :
            	    // ANTLR.g:567:5: STRING_LITERAL
            	    {
            	    mSTRING_LITERAL(); 

            	    }
            	    break;
            	case 4 :
            	    // ANTLR.g:568:5: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(']'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end NESTED_ARG_ACTION

    // $ANTLR start ACTION
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            // ANTLR.g:574:4: ( NESTED_ACTION ( '?' )? )
            // ANTLR.g:574:4: NESTED_ACTION ( '?' )?
            {
            mNESTED_ACTION(); 
            // ANTLR.g:574:18: ( '?' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='?') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ANTLR.g:574:19: '?'
                    {
                    match('?'); 
                    type=SEMPRED;

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ACTION

    // $ANTLR start NESTED_ACTION
    public final void mNESTED_ACTION() throws RecognitionException {
        try {
            // ANTLR.g:579:4: ( '{' ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )* '}' )
            // ANTLR.g:579:4: '{' ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )* '}'
            {
            match('{'); 
            // ANTLR.g:580:3: ( options {greedy=false; k=1; } : NESTED_ACTION | CHAR_LITERAL | COMMENT | STRING_LITERAL | . )*
            loop16:
            do {
                int alt16=6;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='}') ) {
                    alt16=6;
                }
                else if ( (LA16_0=='{') ) {
                    alt16=1;
                }
                else if ( (LA16_0=='\'') ) {
                    alt16=2;
                }
                else if ( (LA16_0=='/') ) {
                    alt16=3;
                }
                else if ( (LA16_0=='\"') ) {
                    alt16=4;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='.')||(LA16_0>='0' && LA16_0<='z')||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFE')) ) {
                    alt16=5;
                }


                switch (alt16) {
            	case 1 :
            	    // ANTLR.g:581:5: NESTED_ACTION
            	    {
            	    mNESTED_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // ANTLR.g:582:5: CHAR_LITERAL
            	    {
            	    mCHAR_LITERAL(); 

            	    }
            	    break;
            	case 3 :
            	    // ANTLR.g:583:5: COMMENT
            	    {
            	    mCOMMENT(); 

            	    }
            	    break;
            	case 4 :
            	    // ANTLR.g:584:5: STRING_LITERAL
            	    {
            	    mSTRING_LITERAL(); 

            	    }
            	    break;
            	case 5 :
            	    // ANTLR.g:585:5: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('}'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end NESTED_ACTION

    // $ANTLR start TOKEN_REF
    public final void mTOKEN_REF() throws RecognitionException {
        try {
            int _type = TOKEN_REF;
            // ANTLR.g:591:4: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ANTLR.g:591:4: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // ANTLR.g:592:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ANTLR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKEN_REF

    // $ANTLR start RULE_REF
    public final void mRULE_REF() throws RecognitionException {
        try {
            int _type = RULE_REF;
            // ANTLR.g:596:4: ( INTERNAL_RULE_REF )
            // ANTLR.g:596:4: INTERNAL_RULE_REF
            {
            mINTERNAL_RULE_REF(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REF

    // $ANTLR start WS_LOOP
    public final void mWS_LOOP() throws RecognitionException {
        try {
            // ANTLR.g:601:4: ( ( WS | COMMENT )* )
            // ANTLR.g:601:4: ( WS | COMMENT )*
            {
            // ANTLR.g:601:4: ( WS | COMMENT )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }
                else if ( (LA18_0=='/') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ANTLR.g:601:8: WS
            	    {
            	    mWS(); 

            	    }
            	    break;
            	case 2 :
            	    // ANTLR.g:602:5: COMMENT
            	    {
            	    mCOMMENT(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end WS_LOOP

    // $ANTLR start INTERNAL_RULE_REF
    public final void mINTERNAL_RULE_REF() throws RecognitionException {
        try {
            // ANTLR.g:608:4: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ANTLR.g:608:4: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ANTLR.g:609:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ANTLR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end INTERNAL_RULE_REF

    // $ANTLR start WS_OPT
    public final void mWS_OPT() throws RecognitionException {
        try {
            // ANTLR.g:616:10: ( ( WS )? )
            // ANTLR.g:616:10: ( WS )?
            {
            // ANTLR.g:616:10: ( WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ANTLR.g:616:10: WS
                    {
                    mWS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end WS_OPT

    public void mTokens() throws RecognitionException {
        // ANTLR.g:1:10: ( T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | WS | SL_COMMENT | ML_COMMENT | OPEN_ELEMENT_OPTION | CLOSE_ELEMENT_OPTION | COMMA | QUESTION | TREE_BEGIN | LPAREN | RPAREN | COLON | STAR | PLUS | IMPLIES | CARET | BANG | OR | WILDCARD | RANGE | NOT_OP | RCURLY | CHAR_LITERAL | STRING_LITERAL | INT | OPTIONS | TOKENS | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF )
        int alt21=45;
        switch ( input.LA(1) ) {
        case 'h':
            {
            int LA21_1 = input.LA(2);

            if ( (LA21_1=='e') ) {
                int LA21_38 = input.LA(3);

                if ( (LA21_38=='a') ) {
                    int LA21_57 = input.LA(4);

                    if ( (LA21_57=='d') ) {
                        int LA21_72 = input.LA(5);

                        if ( (LA21_72=='e') ) {
                            int LA21_87 = input.LA(6);

                            if ( (LA21_87=='r') ) {
                                int LA21_102 = input.LA(7);

                                if ( ((LA21_102>='0' && LA21_102<='9')||(LA21_102>='A' && LA21_102<='Z')||LA21_102=='_'||(LA21_102>='a' && LA21_102<='z')) ) {
                                    alt21=45;
                                }
                                else {
                                    alt21=1;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
            }
            else {
                alt21=45;}
            }
            break;
        case '=':
            {
            int LA21_2 = input.LA(2);

            if ( (LA21_2=='>') ) {
                alt21=29;
            }
            else {
                alt21=2;}
            }
            break;
        case ';':
            {
            alt21=3;
            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA21_41 = input.LA(3);

                if ( (LA21_41=='a') ) {
                    int LA21_58 = input.LA(4);

                    if ( (LA21_58=='s') ) {
                        int LA21_73 = input.LA(5);

                        if ( (LA21_73=='s') ) {
                            int LA21_88 = input.LA(6);

                            if ( ((LA21_88>='0' && LA21_88<='9')||(LA21_88>='A' && LA21_88<='Z')||LA21_88=='_'||(LA21_88>='a' && LA21_88<='z')) ) {
                                alt21=45;
                            }
                            else {
                                alt21=4;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
                }
                break;
            case 'a':
                {
                int LA21_42 = input.LA(3);

                if ( (LA21_42=='t') ) {
                    int LA21_59 = input.LA(4);

                    if ( (LA21_59=='c') ) {
                        int LA21_74 = input.LA(5);

                        if ( (LA21_74=='h') ) {
                            int LA21_89 = input.LA(6);

                            if ( ((LA21_89>='0' && LA21_89<='9')||(LA21_89>='A' && LA21_89<='Z')||LA21_89=='_'||(LA21_89>='a' && LA21_89<='z')) ) {
                                alt21=45;
                            }
                            else {
                                alt21=15;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
                }
                break;
            default:
                alt21=45;}

            }
            break;
        case 'e':
            {
            int LA21_5 = input.LA(2);

            if ( (LA21_5=='x') ) {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA21_60 = input.LA(4);

                    if ( (LA21_60=='e') ) {
                        int LA21_75 = input.LA(5);

                        if ( (LA21_75=='p') ) {
                            int LA21_90 = input.LA(6);

                            if ( (LA21_90=='t') ) {
                                int LA21_105 = input.LA(7);

                                if ( (LA21_105=='i') ) {
                                    int LA21_118 = input.LA(8);

                                    if ( (LA21_118=='o') ) {
                                        int LA21_129 = input.LA(9);

                                        if ( (LA21_129=='n') ) {
                                            int LA21_136 = input.LA(10);

                                            if ( ((LA21_136>='0' && LA21_136<='9')||(LA21_136>='A' && LA21_136<='Z')||LA21_136=='_'||(LA21_136>='a' && LA21_136<='z')) ) {
                                                alt21=45;
                                            }
                                            else {
                                                alt21=14;}
                                        }
                                        else {
                                            alt21=45;}
                                    }
                                    else {
                                        alt21=45;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                    }
                    break;
                case 't':
                    {
                    int LA21_61 = input.LA(4);

                    if ( (LA21_61=='e') ) {
                        int LA21_76 = input.LA(5);

                        if ( (LA21_76=='n') ) {
                            int LA21_91 = input.LA(6);

                            if ( (LA21_91=='d') ) {
                                int LA21_106 = input.LA(7);

                                if ( (LA21_106=='s') ) {
                                    int LA21_119 = input.LA(8);

                                    if ( ((LA21_119>='0' && LA21_119<='9')||(LA21_119>='A' && LA21_119<='Z')||LA21_119=='_'||(LA21_119>='a' && LA21_119<='z')) ) {
                                        alt21=45;
                                    }
                                    else {
                                        alt21=5;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                    }
                    break;
                default:
                    alt21=45;}

            }
            else {
                alt21=45;}
            }
            break;
        case 'P':
            {
            int LA21_6 = input.LA(2);

            if ( (LA21_6=='a') ) {
                int LA21_44 = input.LA(3);

                if ( (LA21_44=='r') ) {
                    int LA21_62 = input.LA(4);

                    if ( (LA21_62=='s') ) {
                        int LA21_77 = input.LA(5);

                        if ( (LA21_77=='e') ) {
                            int LA21_92 = input.LA(6);

                            if ( (LA21_92=='r') ) {
                                int LA21_107 = input.LA(7);

                                if ( ((LA21_107>='0' && LA21_107<='9')||(LA21_107>='A' && LA21_107<='Z')||LA21_107=='_'||(LA21_107>='a' && LA21_107<='z')) ) {
                                    alt21=44;
                                }
                                else {
                                    alt21=6;}
                            }
                            else {
                                alt21=44;}
                        }
                        else {
                            alt21=44;}
                    }
                    else {
                        alt21=44;}
                }
                else {
                    alt21=44;}
            }
            else {
                alt21=44;}
            }
            break;
        case 'L':
            {
            int LA21_7 = input.LA(2);

            if ( (LA21_7=='e') ) {
                int LA21_45 = input.LA(3);

                if ( (LA21_45=='x') ) {
                    int LA21_63 = input.LA(4);

                    if ( (LA21_63=='e') ) {
                        int LA21_78 = input.LA(5);

                        if ( (LA21_78=='r') ) {
                            int LA21_93 = input.LA(6);

                            if ( ((LA21_93>='0' && LA21_93<='9')||(LA21_93>='A' && LA21_93<='Z')||LA21_93=='_'||(LA21_93>='a' && LA21_93<='z')) ) {
                                alt21=44;
                            }
                            else {
                                alt21=7;}
                        }
                        else {
                            alt21=44;}
                    }
                    else {
                        alt21=44;}
                }
                else {
                    alt21=44;}
            }
            else {
                alt21=44;}
            }
            break;
        case 'T':
            {
            int LA21_8 = input.LA(2);

            if ( (LA21_8=='r') ) {
                int LA21_46 = input.LA(3);

                if ( (LA21_46=='e') ) {
                    int LA21_64 = input.LA(4);

                    if ( (LA21_64=='e') ) {
                        int LA21_79 = input.LA(5);

                        if ( (LA21_79=='P') ) {
                            int LA21_94 = input.LA(6);

                            if ( (LA21_94=='a') ) {
                                int LA21_109 = input.LA(7);

                                if ( (LA21_109=='r') ) {
                                    int LA21_121 = input.LA(8);

                                    if ( (LA21_121=='s') ) {
                                        int LA21_131 = input.LA(9);

                                        if ( (LA21_131=='e') ) {
                                            int LA21_137 = input.LA(10);

                                            if ( (LA21_137=='r') ) {
                                                int LA21_140 = input.LA(11);

                                                if ( ((LA21_140>='0' && LA21_140<='9')||(LA21_140>='A' && LA21_140<='Z')||LA21_140=='_'||(LA21_140>='a' && LA21_140<='z')) ) {
                                                    alt21=44;
                                                }
                                                else {
                                                    alt21=8;}
                                            }
                                            else {
                                                alt21=44;}
                                        }
                                        else {
                                            alt21=44;}
                                    }
                                    else {
                                        alt21=44;}
                                }
                                else {
                                    alt21=44;}
                            }
                            else {
                                alt21=44;}
                        }
                        else {
                            alt21=44;}
                    }
                    else {
                        alt21=44;}
                }
                else {
                    alt21=44;}
            }
            else {
                alt21=44;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA21_47 = input.LA(3);

                if ( (LA21_47=='b') ) {
                    int LA21_65 = input.LA(4);

                    if ( (LA21_65=='l') ) {
                        int LA21_80 = input.LA(5);

                        if ( (LA21_80=='i') ) {
                            int LA21_95 = input.LA(6);

                            if ( (LA21_95=='c') ) {
                                int LA21_110 = input.LA(7);

                                if ( ((LA21_110>='0' && LA21_110<='9')||(LA21_110>='A' && LA21_110<='Z')||LA21_110=='_'||(LA21_110>='a' && LA21_110<='z')) ) {
                                    alt21=45;
                                }
                                else {
                                    alt21=10;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA21_66 = input.LA(4);

                    if ( (LA21_66=='v') ) {
                        int LA21_81 = input.LA(5);

                        if ( (LA21_81=='a') ) {
                            int LA21_96 = input.LA(6);

                            if ( (LA21_96=='t') ) {
                                int LA21_111 = input.LA(7);

                                if ( (LA21_111=='e') ) {
                                    int LA21_123 = input.LA(8);

                                    if ( ((LA21_123>='0' && LA21_123<='9')||(LA21_123>='A' && LA21_123<='Z')||LA21_123=='_'||(LA21_123>='a' && LA21_123<='z')) ) {
                                        alt21=45;
                                    }
                                    else {
                                        alt21=11;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                    }
                    break;
                case 'o':
                    {
                    int LA21_67 = input.LA(4);

                    if ( (LA21_67=='t') ) {
                        int LA21_82 = input.LA(5);

                        if ( (LA21_82=='e') ) {
                            int LA21_97 = input.LA(6);

                            if ( (LA21_97=='c') ) {
                                int LA21_112 = input.LA(7);

                                if ( (LA21_112=='t') ) {
                                    int LA21_124 = input.LA(8);

                                    if ( (LA21_124=='e') ) {
                                        int LA21_133 = input.LA(9);

                                        if ( (LA21_133=='d') ) {
                                            int LA21_138 = input.LA(10);

                                            if ( ((LA21_138>='0' && LA21_138<='9')||(LA21_138>='A' && LA21_138<='Z')||LA21_138=='_'||(LA21_138>='a' && LA21_138<='z')) ) {
                                                alt21=45;
                                            }
                                            else {
                                                alt21=9;}
                                        }
                                        else {
                                            alt21=45;}
                                    }
                                    else {
                                        alt21=45;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                    }
                    break;
                default:
                    alt21=45;}

                }
                break;
            default:
                alt21=45;}

            }
            break;
        case 'r':
            {
            int LA21_10 = input.LA(2);

            if ( (LA21_10=='e') ) {
                int LA21_49 = input.LA(3);

                if ( (LA21_49=='t') ) {
                    int LA21_68 = input.LA(4);

                    if ( (LA21_68=='u') ) {
                        int LA21_83 = input.LA(5);

                        if ( (LA21_83=='r') ) {
                            int LA21_98 = input.LA(6);

                            if ( (LA21_98=='n') ) {
                                int LA21_113 = input.LA(7);

                                if ( (LA21_113=='s') ) {
                                    int LA21_125 = input.LA(8);

                                    if ( ((LA21_125>='0' && LA21_125<='9')||(LA21_125>='A' && LA21_125<='Z')||LA21_125=='_'||(LA21_125>='a' && LA21_125<='z')) ) {
                                        alt21=45;
                                    }
                                    else {
                                        alt21=12;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
            }
            else {
                alt21=45;}
            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA21_50 = input.LA(3);

                if ( (LA21_50=='k') ) {
                    int LA21_69 = input.LA(4);

                    if ( (LA21_69=='e') ) {
                        int LA21_84 = input.LA(5);

                        if ( (LA21_84=='n') ) {
                            int LA21_99 = input.LA(6);

                            if ( (LA21_99=='s') ) {
                                int LA21_114 = input.LA(7);

                                if ( ((LA21_114>='\t' && LA21_114<='\n')||LA21_114=='\r'||LA21_114==' '||LA21_114=='/'||LA21_114=='{') ) {
                                    alt21=41;
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
                }
                break;
            case 'h':
                {
                int LA21_51 = input.LA(3);

                if ( (LA21_51=='r') ) {
                    int LA21_70 = input.LA(4);

                    if ( (LA21_70=='o') ) {
                        int LA21_85 = input.LA(5);

                        if ( (LA21_85=='w') ) {
                            int LA21_100 = input.LA(6);

                            if ( (LA21_100=='s') ) {
                                int LA21_115 = input.LA(7);

                                if ( ((LA21_115>='0' && LA21_115<='9')||(LA21_115>='A' && LA21_115<='Z')||LA21_115=='_'||(LA21_115>='a' && LA21_115<='z')) ) {
                                    alt21=45;
                                }
                                else {
                                    alt21=13;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
                }
                break;
            default:
                alt21=45;}

            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt21=16;
            }
            break;
        case '/':
            {
            int LA21_13 = input.LA(2);

            if ( (LA21_13=='*') ) {
                alt21=18;
            }
            else if ( (LA21_13=='/') ) {
                alt21=17;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | WS | SL_COMMENT | ML_COMMENT | OPEN_ELEMENT_OPTION | CLOSE_ELEMENT_OPTION | COMMA | QUESTION | TREE_BEGIN | LPAREN | RPAREN | COLON | STAR | PLUS | IMPLIES | CARET | BANG | OR | WILDCARD | RANGE | NOT_OP | RCURLY | CHAR_LITERAL | STRING_LITERAL | INT | OPTIONS | TOKENS | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF );", 21, 13, input);

                throw nvae;
            }
            }
            break;
        case '<':
            {
            alt21=19;
            }
            break;
        case '>':
            {
            alt21=20;
            }
            break;
        case ',':
            {
            alt21=21;
            }
            break;
        case '?':
            {
            alt21=22;
            }
            break;
        case '#':
            {
            alt21=23;
            }
            break;
        case '(':
            {
            alt21=24;
            }
            break;
        case ')':
            {
            alt21=25;
            }
            break;
        case ':':
            {
            alt21=26;
            }
            break;
        case '*':
            {
            alt21=27;
            }
            break;
        case '+':
            {
            alt21=28;
            }
            break;
        case '^':
            {
            alt21=30;
            }
            break;
        case '!':
            {
            alt21=31;
            }
            break;
        case '|':
            {
            alt21=32;
            }
            break;
        case '.':
            {
            int LA21_27 = input.LA(2);

            if ( (LA21_27=='.') ) {
                alt21=34;
            }
            else {
                alt21=33;}
            }
            break;
        case '~':
            {
            alt21=35;
            }
            break;
        case '}':
            {
            alt21=36;
            }
            break;
        case '\'':
            {
            alt21=37;
            }
            break;
        case '\"':
            {
            alt21=38;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt21=39;
            }
            break;
        case 'o':
            {
            int LA21_33 = input.LA(2);

            if ( (LA21_33=='p') ) {
                int LA21_56 = input.LA(3);

                if ( (LA21_56=='t') ) {
                    int LA21_71 = input.LA(4);

                    if ( (LA21_71=='i') ) {
                        int LA21_86 = input.LA(5);

                        if ( (LA21_86=='o') ) {
                            int LA21_101 = input.LA(6);

                            if ( (LA21_101=='n') ) {
                                int LA21_116 = input.LA(7);

                                if ( (LA21_116=='s') ) {
                                    int LA21_128 = input.LA(8);

                                    if ( ((LA21_128>='\t' && LA21_128<='\n')||LA21_128=='\r'||LA21_128==' '||LA21_128=='/'||LA21_128=='{') ) {
                                        alt21=40;
                                    }
                                    else {
                                        alt21=45;}
                                }
                                else {
                                    alt21=45;}
                            }
                            else {
                                alt21=45;}
                        }
                        else {
                            alt21=45;}
                    }
                    else {
                        alt21=45;}
                }
                else {
                    alt21=45;}
            }
            else {
                alt21=45;}
            }
            break;
        case '[':
            {
            alt21=42;
            }
            break;
        case '{':
            {
            alt21=43;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'M':
        case 'N':
        case 'O':
        case 'Q':
        case 'R':
        case 'S':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt21=44;
            }
            break;
        case 'a':
        case 'b':
        case 'd':
        case 'f':
        case 'g':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'q':
        case 's':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt21=45;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | WS | SL_COMMENT | ML_COMMENT | OPEN_ELEMENT_OPTION | CLOSE_ELEMENT_OPTION | COMMA | QUESTION | TREE_BEGIN | LPAREN | RPAREN | COLON | STAR | PLUS | IMPLIES | CARET | BANG | OR | WILDCARD | RANGE | NOT_OP | RCURLY | CHAR_LITERAL | STRING_LITERAL | INT | OPTIONS | TOKENS | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF );", 21, 0, input);

            throw nvae;
        }

        switch (alt21) {
            case 1 :
                // ANTLR.g:1:10: T45
                {
                mT45(); 

                }
                break;
            case 2 :
                // ANTLR.g:1:14: T46
                {
                mT46(); 

                }
                break;
            case 3 :
                // ANTLR.g:1:18: T47
                {
                mT47(); 

                }
                break;
            case 4 :
                // ANTLR.g:1:22: T48
                {
                mT48(); 

                }
                break;
            case 5 :
                // ANTLR.g:1:26: T49
                {
                mT49(); 

                }
                break;
            case 6 :
                // ANTLR.g:1:30: T50
                {
                mT50(); 

                }
                break;
            case 7 :
                // ANTLR.g:1:34: T51
                {
                mT51(); 

                }
                break;
            case 8 :
                // ANTLR.g:1:38: T52
                {
                mT52(); 

                }
                break;
            case 9 :
                // ANTLR.g:1:42: T53
                {
                mT53(); 

                }
                break;
            case 10 :
                // ANTLR.g:1:46: T54
                {
                mT54(); 

                }
                break;
            case 11 :
                // ANTLR.g:1:50: T55
                {
                mT55(); 

                }
                break;
            case 12 :
                // ANTLR.g:1:54: T56
                {
                mT56(); 

                }
                break;
            case 13 :
                // ANTLR.g:1:58: T57
                {
                mT57(); 

                }
                break;
            case 14 :
                // ANTLR.g:1:62: T58
                {
                mT58(); 

                }
                break;
            case 15 :
                // ANTLR.g:1:66: T59
                {
                mT59(); 

                }
                break;
            case 16 :
                // ANTLR.g:1:70: WS
                {
                mWS(); 

                }
                break;
            case 17 :
                // ANTLR.g:1:73: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 18 :
                // ANTLR.g:1:84: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 19 :
                // ANTLR.g:1:95: OPEN_ELEMENT_OPTION
                {
                mOPEN_ELEMENT_OPTION(); 

                }
                break;
            case 20 :
                // ANTLR.g:1:115: CLOSE_ELEMENT_OPTION
                {
                mCLOSE_ELEMENT_OPTION(); 

                }
                break;
            case 21 :
                // ANTLR.g:1:136: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 22 :
                // ANTLR.g:1:142: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 23 :
                // ANTLR.g:1:151: TREE_BEGIN
                {
                mTREE_BEGIN(); 

                }
                break;
            case 24 :
                // ANTLR.g:1:162: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 25 :
                // ANTLR.g:1:169: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 26 :
                // ANTLR.g:1:176: COLON
                {
                mCOLON(); 

                }
                break;
            case 27 :
                // ANTLR.g:1:182: STAR
                {
                mSTAR(); 

                }
                break;
            case 28 :
                // ANTLR.g:1:187: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // ANTLR.g:1:192: IMPLIES
                {
                mIMPLIES(); 

                }
                break;
            case 30 :
                // ANTLR.g:1:200: CARET
                {
                mCARET(); 

                }
                break;
            case 31 :
                // ANTLR.g:1:206: BANG
                {
                mBANG(); 

                }
                break;
            case 32 :
                // ANTLR.g:1:211: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // ANTLR.g:1:214: WILDCARD
                {
                mWILDCARD(); 

                }
                break;
            case 34 :
                // ANTLR.g:1:223: RANGE
                {
                mRANGE(); 

                }
                break;
            case 35 :
                // ANTLR.g:1:229: NOT_OP
                {
                mNOT_OP(); 

                }
                break;
            case 36 :
                // ANTLR.g:1:236: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 37 :
                // ANTLR.g:1:243: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 38 :
                // ANTLR.g:1:256: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 39 :
                // ANTLR.g:1:271: INT
                {
                mINT(); 

                }
                break;
            case 40 :
                // ANTLR.g:1:275: OPTIONS
                {
                mOPTIONS(); 

                }
                break;
            case 41 :
                // ANTLR.g:1:283: TOKENS
                {
                mTOKENS(); 

                }
                break;
            case 42 :
                // ANTLR.g:1:290: ARG_ACTION
                {
                mARG_ACTION(); 

                }
                break;
            case 43 :
                // ANTLR.g:1:301: ACTION
                {
                mACTION(); 

                }
                break;
            case 44 :
                // ANTLR.g:1:308: TOKEN_REF
                {
                mTOKEN_REF(); 

                }
                break;
            case 45 :
                // ANTLR.g:1:318: RULE_REF
                {
                mRULE_REF(); 

                }
                break;

        }

    }


 

}