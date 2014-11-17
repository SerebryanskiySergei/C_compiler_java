// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-11-10 17:13:41
package generated;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MathExprLexer extends Lexer {
    public static final int ADD=26;
    public static final int LETTER=20;
    public static final int INCLUDE_STRING=23;
    public static final int ELSE=6;
    public static final int INDEX=17;
    public static final int INCLUDE=10;
    public static final int IF=5;
    public static final int TYPE=11;
    public static final int SUB=27;
    public static final int NUMBER=21;
    public static final int MUL=28;
    public static final int FOR=7;
    public static final int BLOCK=16;
    public static final int FUNCTION=13;
    public static final int AND=31;
    public static final int COMPARE=34;
    public static final int PROGRAM=9;
    public static final int CALL=15;
    public static final int ASSIGN=33;
    public static final int DELIMITER=25;
    public static final int RETURN=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int IDENTIFIER=24;
    public static final int WS=18;
    public static final int EOF=-1;
    public static final int OR=32;
    public static final int SEMANTIC=12;
    public static final int DIGIT=19;
    public static final int DIV=29;
    public static final int ARGUMENTS=14;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int STRING=22;
    public static final int T__46=46;
    public static final int WHILE=8;
    public static final int T__47=47;
    public static final int REM=30;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public MathExprLexer() {;} 
    public MathExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MathExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MathExpr.g"; }

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:7:8: ( 'return' )
            // MathExpr.g:7:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:8:4: ( 'if' )
            // MathExpr.g:8:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:9:6: ( 'else' )
            // MathExpr.g:9:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:10:5: ( 'for' )
            // MathExpr.g:10:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:7: ( 'while' )
            // MathExpr.g:11:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:12:7: ( 'int' )
            // MathExpr.g:12:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:7: ( '[' )
            // MathExpr.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:7: ( ']' )
            // MathExpr.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:7: ( 'double' )
            // MathExpr.g:15:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:7: ( 'char' )
            // MathExpr.g:16:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:7: ( 'void' )
            // MathExpr.g:17:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:7: ( '(' )
            // MathExpr.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:7: ( ')' )
            // MathExpr.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:7: ( ',' )
            // MathExpr.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:7: ( '++' )
            // MathExpr.g:21:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:7: ( '--' )
            // MathExpr.g:22:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:7: ( '{' )
            // MathExpr.g:23:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:7: ( '}' )
            // MathExpr.g:24:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:7: ( '#include' )
            // MathExpr.g:25:9: '#include'
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // MathExpr.g:29:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // MathExpr.g:29:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MathExpr.g:32:15: ( '0' .. '9' )
            // MathExpr.g:33:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // MathExpr.g:36:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // MathExpr.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:40:7: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // MathExpr.g:41:3: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // MathExpr.g:41:3: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MathExpr.g:41:3: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // MathExpr.g:41:10: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:41:11: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // MathExpr.g:41:15: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:41:15: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:44:7: ( '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"' )
            // MathExpr.g:45:3: '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"'
            {
            match('\"'); 
            // MathExpr.g:45:7: ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )*
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2=='\"') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }

                        else {
                            alt5=3;
                        }

                    }
                    else if ( (LA5_2=='\\') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_2>='\u0000' && LA5_2<='!')||(LA5_2>='#' && LA5_2<='[')||(LA5_2>=']' && LA5_2<='\uFFFF')) ) {
                        alt5=3;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // MathExpr.g:45:8: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 2 :
            	    // MathExpr.g:45:16: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // MathExpr.g:45:25: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "INCLUDE_STRING"
    public final void mINCLUDE_STRING() throws RecognitionException {
        try {
            int _type = INCLUDE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:48:15: ( '<' (~ '>' )* '>' )
            // MathExpr.g:49:3: '<' (~ '>' )* '>'
            {
            match('<'); 
            // MathExpr.g:49:7: (~ '>' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='=')||(LA6_0>='?' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:49:7: ~ '>'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE_STRING"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:52:11: ( LETTER ( LETTER | DIGIT )* )
            // MathExpr.g:53:3: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // MathExpr.g:53:10: ( LETTER | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "DELIMITER"
    public final void mDELIMITER() throws RecognitionException {
        try {
            int _type = DELIMITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:56:10: ( ';' )
            // MathExpr.g:56:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELIMITER"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:99:4: ( '+' )
            // MathExpr.g:99:17: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:100:4: ( '-' )
            // MathExpr.g:100:17: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:101:4: ( '*' )
            // MathExpr.g:101:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:102:4: ( '/' )
            // MathExpr.g:102:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:103:4: ( '%' )
            // MathExpr.g:103:17: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REM"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:104:4: ( '&' )
            // MathExpr.g:104:17: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:105:3: ( '|' )
            // MathExpr.g:105:17: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:106:7: ( '=' )
            // MathExpr.g:106:17: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COMPARE"
    public final void mCOMPARE() throws RecognitionException {
        try {
            int _type = COMPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:107:8: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='=') ) {
                    alt8=2;
                }
                else {
                    alt8=1;}
                }
                break;
            case '<':
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='=') ) {
                    alt8=4;
                }
                else {
                    alt8=3;}
                }
                break;
            case '=':
                {
                alt8=5;
                }
                break;
            case '!':
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // MathExpr.g:107:13: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // MathExpr.g:107:19: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // MathExpr.g:107:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // MathExpr.g:107:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // MathExpr.g:107:39: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // MathExpr.g:107:46: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPARE"

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( RETURN | IF | ELSE | FOR | WHILE | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER | ADD | SUB | MUL | DIV | REM | AND | OR | ASSIGN | COMPARE )
        int alt9=34;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // MathExpr.g:1:10: RETURN
                {
                mRETURN(); 

                }
                break;
            case 2 :
                // MathExpr.g:1:17: IF
                {
                mIF(); 

                }
                break;
            case 3 :
                // MathExpr.g:1:20: ELSE
                {
                mELSE(); 

                }
                break;
            case 4 :
                // MathExpr.g:1:25: FOR
                {
                mFOR(); 

                }
                break;
            case 5 :
                // MathExpr.g:1:29: WHILE
                {
                mWHILE(); 

                }
                break;
            case 6 :
                // MathExpr.g:1:35: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // MathExpr.g:1:41: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // MathExpr.g:1:47: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // MathExpr.g:1:53: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // MathExpr.g:1:59: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // MathExpr.g:1:65: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // MathExpr.g:1:71: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // MathExpr.g:1:77: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // MathExpr.g:1:83: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // MathExpr.g:1:89: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // MathExpr.g:1:95: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // MathExpr.g:1:101: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // MathExpr.g:1:107: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // MathExpr.g:1:113: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // MathExpr.g:1:119: WS
                {
                mWS(); 

                }
                break;
            case 21 :
                // MathExpr.g:1:122: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 22 :
                // MathExpr.g:1:129: STRING
                {
                mSTRING(); 

                }
                break;
            case 23 :
                // MathExpr.g:1:136: INCLUDE_STRING
                {
                mINCLUDE_STRING(); 

                }
                break;
            case 24 :
                // MathExpr.g:1:151: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 25 :
                // MathExpr.g:1:162: DELIMITER
                {
                mDELIMITER(); 

                }
                break;
            case 26 :
                // MathExpr.g:1:172: ADD
                {
                mADD(); 

                }
                break;
            case 27 :
                // MathExpr.g:1:176: SUB
                {
                mSUB(); 

                }
                break;
            case 28 :
                // MathExpr.g:1:180: MUL
                {
                mMUL(); 

                }
                break;
            case 29 :
                // MathExpr.g:1:184: DIV
                {
                mDIV(); 

                }
                break;
            case 30 :
                // MathExpr.g:1:188: REM
                {
                mREM(); 

                }
                break;
            case 31 :
                // MathExpr.g:1:192: AND
                {
                mAND(); 

                }
                break;
            case 32 :
                // MathExpr.g:1:196: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // MathExpr.g:1:199: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 34 :
                // MathExpr.g:1:206: COMPARE
                {
                mCOMPARE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\5\27\2\uffff\3\27\3\uffff\1\52\1\54\6\uffff\1\37\7\uffff"+
        "\1\57\1\uffff\1\27\1\61\7\27\4\uffff\1\37\2\uffff\1\27\1\uffff\1"+
        "\72\1\27\1\74\5\27\1\uffff\1\102\1\uffff\2\27\1\105\1\106\1\27\1"+
        "\uffff\1\110\1\27\2\uffff\1\112\1\uffff\1\113\2\uffff";
    static final String DFA9_eofS =
        "\114\uffff";
    static final String DFA9_minS =
        "\1\11\1\145\1\146\1\154\1\157\1\150\2\uffff\1\157\1\150\1\157\3"+
        "\uffff\1\53\1\55\6\uffff\1\0\7\uffff\1\75\1\uffff\1\164\1\60\1\164"+
        "\1\163\1\162\1\151\1\165\1\141\1\151\4\uffff\1\0\2\uffff\1\165\1"+
        "\uffff\1\60\1\145\1\60\1\154\1\142\1\162\1\144\1\162\1\uffff\1\60"+
        "\1\uffff\1\145\1\154\2\60\1\156\1\uffff\1\60\1\145\2\uffff\1\60"+
        "\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\175\1\145\1\156\1\154\1\157\1\150\2\uffff\1\157\1\150\1\157"+
        "\3\uffff\1\53\1\55\6\uffff\1\uffff\7\uffff\1\75\1\uffff\1\164\1"+
        "\172\1\164\1\163\1\162\1\151\1\165\1\141\1\151\4\uffff\1\uffff\2"+
        "\uffff\1\165\1\uffff\1\172\1\145\1\172\1\154\1\142\1\162\1\144\1"+
        "\162\1\uffff\1\172\1\uffff\1\145\1\154\2\172\1\156\1\uffff\1\172"+
        "\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\6\uffff\1\7\1\10\3\uffff\1\14\1\15\1\16\2\uffff\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\uffff\1\30\1\31\1\34\1\35\1\36\1\37\1\40\1\uffff"+
        "\1\42\11\uffff\1\17\1\32\1\20\1\33\1\uffff\1\27\1\41\1\uffff\1\2"+
        "\10\uffff\1\6\1\uffff\1\4\5\uffff\1\3\2\uffff\1\12\1\13\1\uffff"+
        "\1\5\1\uffff\1\1\1\11";
    static final String DFA9_specialS =
        "\26\uffff\1\1\26\uffff\1\0\36\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\23\1\uffff\2\23\22\uffff\1\23\1\37\1\25\1\22\1\uffff\1\33"+
            "\1\34\1\uffff\1\13\1\14\1\31\1\16\1\15\1\17\1\uffff\1\32\12"+
            "\24\1\uffff\1\30\1\26\1\36\1\37\2\uffff\32\27\1\6\1\uffff\1"+
            "\7\1\uffff\1\27\1\uffff\2\27\1\11\1\10\1\3\1\4\2\27\1\2\10\27"+
            "\1\1\3\27\1\12\1\5\3\27\1\20\1\35\1\21",
            "\1\40",
            "\1\41\7\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "\1\51",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\75\56\1\55\uffc2\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\60",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "\0\56",
            "",
            "",
            "\1\71",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\103",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\107",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\111",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RETURN | IF | ELSE | FOR | WHILE | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER | ADD | SUB | MUL | DIV | REM | AND | OR | ASSIGN | COMPARE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_45 = input.LA(1);

                        s = -1;
                        if ( ((LA9_45>='\u0000' && LA9_45<='\uFFFF')) ) {s = 46;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_22 = input.LA(1);

                        s = -1;
                        if ( (LA9_22=='=') ) {s = 45;}

                        else if ( ((LA9_22>='\u0000' && LA9_22<='<')||(LA9_22>='>' && LA9_22<='\uFFFF')) ) {s = 46;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}