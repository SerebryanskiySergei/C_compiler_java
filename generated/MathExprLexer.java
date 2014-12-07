// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-12-07 19:10:57
package generated;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MathExprLexer extends Lexer {
    public static final int SHR=19;
    public static final int FUNCTION=25;
    public static final int LT=48;
    public static final int WHILE=12;
    public static final int BIT_AND=42;
    public static final int LETTER=34;
    public static final int SHL=20;
    public static final int DO=29;
    public static final int FOR=11;
    public static final int SUB=39;
    public static final int COUNT=30;
    public static final int EQUALS=46;
    public static final int NOT=15;
    public static final int AND=13;
    public static final int EOF=-1;
    public static final int IF=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int IN=21;
    public static final int T__53=53;
    public static final int BIT_OR=43;
    public static final int UNKNOWN=4;
    public static final int T__54=54;
    public static final int IDENTIFIER=37;
    public static final int INT_DIV=17;
    public static final int RETURN=23;
    public static final int VAR=22;
    public static final int DIGIT=33;
    public static final int COMMENT=32;
    public static final int ARRAY=24;
    public static final int ADD=38;
    public static final int PARAMS=6;
    public static final int INT_MOD=18;
    public static final int GE=49;
    public static final int XOR=16;
    public static final int CONVERT=8;
    public static final int ELSE=10;
    public static final int NUMBER=35;
    public static final int NOTEQUALS=45;
    public static final int TRUE=27;
    public static final int MUL=40;
    public static final int WS=31;
    public static final int BLOCK=5;
    public static final int OR=14;
    public static final int ASSIGN=44;
    public static final int GT=47;
    public static final int PROGRAM=26;
    public static final int CALL=7;
    public static final int DIV=41;
    public static final int FALSE=28;
    public static final int LE=50;
    public static final int STRING=36;

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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:7:4: ( 'if' )
            // MathExpr.g:7:6: 'if'
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
            // MathExpr.g:8:6: ( 'else' )
            // MathExpr.g:8:8: 'else'
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
            // MathExpr.g:9:5: ( 'for' )
            // MathExpr.g:9:7: 'for'
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
            // MathExpr.g:10:7: ( 'while' )
            // MathExpr.g:10:9: 'while'
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:5: ( '&&' )
            // MathExpr.g:11:7: '&&'
            {
            match("&&"); 


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
            // MathExpr.g:12:4: ( '||' )
            // MathExpr.g:12:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:5: ( '!' )
            // MathExpr.g:13:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:5: ( 'xor' )
            // MathExpr.g:14:7: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "INT_DIV"
    public final void mINT_DIV() throws RecognitionException {
        try {
            int _type = INT_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:9: ( 'div' )
            // MathExpr.g:15:11: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_DIV"

    // $ANTLR start "INT_MOD"
    public final void mINT_MOD() throws RecognitionException {
        try {
            int _type = INT_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:9: ( 'mod' )
            // MathExpr.g:16:11: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_MOD"

    // $ANTLR start "SHR"
    public final void mSHR() throws RecognitionException {
        try {
            int _type = SHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:5: ( 'shr' )
            // MathExpr.g:17:7: 'shr'
            {
            match("shr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHR"

    // $ANTLR start "SHL"
    public final void mSHL() throws RecognitionException {
        try {
            int _type = SHL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:5: ( 'shl' )
            // MathExpr.g:18:7: 'shl'
            {
            match("shl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHL"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:4: ( 'in' )
            // MathExpr.g:19:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:5: ( 'var' )
            // MathExpr.g:20:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:8: ( 'return' )
            // MathExpr.g:21:10: 'return'
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

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:7: ( 'array' )
            // MathExpr.g:22:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:10: ( 'function' )
            // MathExpr.g:23:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:9: ( 'program' )
            // MathExpr.g:24:11: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:6: ( 'true' )
            // MathExpr.g:25:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:26:7: ( 'false' )
            // MathExpr.g:26:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:4: ( 'do' )
            // MathExpr.g:27:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:7: ( 'count' )
            // MathExpr.g:28:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:29:7: ( '(' )
            // MathExpr.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:30:7: ( ')' )
            // MathExpr.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:31:7: ( ',' )
            // MathExpr.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:32:7: ( '{' )
            // MathExpr.g:32:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:33:7: ( '}' )
            // MathExpr.g:33:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:34:7: ( ';' )
            // MathExpr.g:34:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:35:7: ( '[' )
            // MathExpr.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:36:7: ( ']' )
            // MathExpr.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:42:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // MathExpr.g:42:5: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // MathExpr.g:42:5: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:45:8: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // MathExpr.g:45:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // MathExpr.g:45:15: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MathExpr.g:45:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MathExpr.g:47:15: ( '0' .. '9' )
            // MathExpr.g:47:17: '0' .. '9'
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
            // MathExpr.g:48:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // MathExpr.g:50:7: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // MathExpr.g:50:9: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // MathExpr.g:50:9: ( DIGIT )+
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
            	    // MathExpr.g:50:9: DIGIT
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

            // MathExpr.g:50:16: ( '.' ( DIGIT )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // MathExpr.g:50:17: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // MathExpr.g:50:21: ( DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // MathExpr.g:50:21: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
            // MathExpr.g:51:7: ( '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"' )
            // MathExpr.g:51:9: '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"'
            {
            match('\"'); 
            // MathExpr.g:51:13: ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )*
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='\"') ) {
                        int LA6_4 = input.LA(3);

                        if ( ((LA6_4>='\u0000' && LA6_4<='\uFFFF')) ) {
                            alt6=1;
                        }

                        else {
                            alt6=3;
                        }

                    }
                    else if ( (LA6_2=='\\') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_2>='\u0000' && LA6_2<='!')||(LA6_2>='#' && LA6_2<='[')||(LA6_2>=']' && LA6_2<='\uFFFF')) ) {
                        alt6=3;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:51:14: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 2 :
            	    // MathExpr.g:51:22: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // MathExpr.g:51:31: ~ '\"'
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
            	    break loop6;
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:53:11: ( LETTER ( LETTER | DIGIT )* )
            // MathExpr.g:53:13: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // MathExpr.g:53:20: ( LETTER | DIGIT )*
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

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:55:4: ( '+' )
            // MathExpr.g:55:11: '+'
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
            // MathExpr.g:56:4: ( '-' )
            // MathExpr.g:56:11: '-'
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
            // MathExpr.g:57:4: ( '*' )
            // MathExpr.g:57:11: '*'
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
            // MathExpr.g:58:4: ( '/' )
            // MathExpr.g:58:11: '/'
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

    // $ANTLR start "BIT_AND"
    public final void mBIT_AND() throws RecognitionException {
        try {
            int _type = BIT_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:59:8: ( '&' )
            // MathExpr.g:59:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_AND"

    // $ANTLR start "BIT_OR"
    public final void mBIT_OR() throws RecognitionException {
        try {
            int _type = BIT_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:60:7: ( '|' )
            // MathExpr.g:60:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_OR"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:61:7: ( '=' )
            // MathExpr.g:61:11: '='
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

    // $ANTLR start "NOTEQUALS"
    public final void mNOTEQUALS() throws RecognitionException {
        try {
            int _type = NOTEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:62:10: ( '!=' )
            // MathExpr.g:62:11: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUALS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:63:7: ( '==' )
            // MathExpr.g:63:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:64:3: ( '>' )
            // MathExpr.g:64:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:65:3: ( '<' )
            // MathExpr.g:65:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:66:3: ( '>=' )
            // MathExpr.g:66:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:67:3: ( '<=' )
            // MathExpr.g:67:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( IF | ELSE | FOR | WHILE | AND | OR | NOT | XOR | INT_DIV | INT_MOD | SHR | SHL | IN | VAR | RETURN | ARRAY | FUNCTION | PROGRAM | TRUE | FALSE | DO | COUNT | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | WS | COMMENT | NUMBER | STRING | IDENTIFIER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | NOTEQUALS | EQUALS | GT | LT | GE | LE )
        int alt8=48;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // MathExpr.g:1:10: IF
                {
                mIF(); 

                }
                break;
            case 2 :
                // MathExpr.g:1:13: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // MathExpr.g:1:18: FOR
                {
                mFOR(); 

                }
                break;
            case 4 :
                // MathExpr.g:1:22: WHILE
                {
                mWHILE(); 

                }
                break;
            case 5 :
                // MathExpr.g:1:28: AND
                {
                mAND(); 

                }
                break;
            case 6 :
                // MathExpr.g:1:32: OR
                {
                mOR(); 

                }
                break;
            case 7 :
                // MathExpr.g:1:35: NOT
                {
                mNOT(); 

                }
                break;
            case 8 :
                // MathExpr.g:1:39: XOR
                {
                mXOR(); 

                }
                break;
            case 9 :
                // MathExpr.g:1:43: INT_DIV
                {
                mINT_DIV(); 

                }
                break;
            case 10 :
                // MathExpr.g:1:51: INT_MOD
                {
                mINT_MOD(); 

                }
                break;
            case 11 :
                // MathExpr.g:1:59: SHR
                {
                mSHR(); 

                }
                break;
            case 12 :
                // MathExpr.g:1:63: SHL
                {
                mSHL(); 

                }
                break;
            case 13 :
                // MathExpr.g:1:67: IN
                {
                mIN(); 

                }
                break;
            case 14 :
                // MathExpr.g:1:70: VAR
                {
                mVAR(); 

                }
                break;
            case 15 :
                // MathExpr.g:1:74: RETURN
                {
                mRETURN(); 

                }
                break;
            case 16 :
                // MathExpr.g:1:81: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 17 :
                // MathExpr.g:1:87: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 18 :
                // MathExpr.g:1:96: PROGRAM
                {
                mPROGRAM(); 

                }
                break;
            case 19 :
                // MathExpr.g:1:104: TRUE
                {
                mTRUE(); 

                }
                break;
            case 20 :
                // MathExpr.g:1:109: FALSE
                {
                mFALSE(); 

                }
                break;
            case 21 :
                // MathExpr.g:1:115: DO
                {
                mDO(); 

                }
                break;
            case 22 :
                // MathExpr.g:1:118: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 23 :
                // MathExpr.g:1:124: T__51
                {
                mT__51(); 

                }
                break;
            case 24 :
                // MathExpr.g:1:130: T__52
                {
                mT__52(); 

                }
                break;
            case 25 :
                // MathExpr.g:1:136: T__53
                {
                mT__53(); 

                }
                break;
            case 26 :
                // MathExpr.g:1:142: T__54
                {
                mT__54(); 

                }
                break;
            case 27 :
                // MathExpr.g:1:148: T__55
                {
                mT__55(); 

                }
                break;
            case 28 :
                // MathExpr.g:1:154: T__56
                {
                mT__56(); 

                }
                break;
            case 29 :
                // MathExpr.g:1:160: T__57
                {
                mT__57(); 

                }
                break;
            case 30 :
                // MathExpr.g:1:166: T__58
                {
                mT__58(); 

                }
                break;
            case 31 :
                // MathExpr.g:1:172: WS
                {
                mWS(); 

                }
                break;
            case 32 :
                // MathExpr.g:1:175: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 33 :
                // MathExpr.g:1:183: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 34 :
                // MathExpr.g:1:190: STRING
                {
                mSTRING(); 

                }
                break;
            case 35 :
                // MathExpr.g:1:197: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 36 :
                // MathExpr.g:1:208: ADD
                {
                mADD(); 

                }
                break;
            case 37 :
                // MathExpr.g:1:212: SUB
                {
                mSUB(); 

                }
                break;
            case 38 :
                // MathExpr.g:1:216: MUL
                {
                mMUL(); 

                }
                break;
            case 39 :
                // MathExpr.g:1:220: DIV
                {
                mDIV(); 

                }
                break;
            case 40 :
                // MathExpr.g:1:224: BIT_AND
                {
                mBIT_AND(); 

                }
                break;
            case 41 :
                // MathExpr.g:1:232: BIT_OR
                {
                mBIT_OR(); 

                }
                break;
            case 42 :
                // MathExpr.g:1:239: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 43 :
                // MathExpr.g:1:246: NOTEQUALS
                {
                mNOTEQUALS(); 

                }
                break;
            case 44 :
                // MathExpr.g:1:256: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 45 :
                // MathExpr.g:1:263: GT
                {
                mGT(); 

                }
                break;
            case 46 :
                // MathExpr.g:1:266: LT
                {
                mLT(); 

                }
                break;
            case 47 :
                // MathExpr.g:1:269: GE
                {
                mGE(); 

                }
                break;
            case 48 :
                // MathExpr.g:1:272: LE
                {
                mLE(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\4\36\1\55\1\57\1\61\12\36\11\uffff\1\76\6\uffff\1\100"+
        "\1\102\1\104\1\105\1\106\5\36\6\uffff\2\36\1\116\10\36\12\uffff"+
        "\1\36\1\131\3\36\1\135\1\136\1\uffff\1\137\1\140\1\141\1\142\5\36"+
        "\1\150\1\uffff\3\36\6\uffff\3\36\1\157\1\36\1\uffff\1\36\1\162\1"+
        "\163\1\36\1\165\1\36\1\uffff\1\167\1\36\2\uffff\1\171\1\uffff\1"+
        "\36\1\uffff\1\36\1\uffff\1\174\1\175\2\uffff";
    static final String DFA8_eofS =
        "\176\uffff";
    static final String DFA8_minS =
        "\1\11\1\146\1\154\1\141\1\150\1\46\1\174\1\75\1\157\1\151\1\157"+
        "\1\150\1\141\1\145\3\162\1\157\11\uffff\1\52\6\uffff\3\75\2\60\1"+
        "\163\1\162\1\156\1\154\1\151\6\uffff\1\162\1\166\1\60\1\144\1\154"+
        "\1\162\1\164\1\162\1\157\2\165\12\uffff\1\145\1\60\1\143\1\163\1"+
        "\154\2\60\1\uffff\4\60\1\165\1\141\1\147\1\145\1\156\1\60\1\uffff"+
        "\1\164\2\145\6\uffff\1\162\1\171\1\162\1\60\1\164\1\uffff\1\151"+
        "\2\60\1\156\1\60\1\141\1\uffff\1\60\1\157\2\uffff\1\60\1\uffff\1"+
        "\155\1\uffff\1\156\1\uffff\2\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\156\1\154\1\165\1\150\1\46\1\174\1\75\3\157\1\150\1\141"+
        "\1\145\3\162\1\157\11\uffff\1\52\6\uffff\3\75\2\172\1\163\1\162"+
        "\1\156\1\154\1\151\6\uffff\1\162\1\166\1\172\1\144\2\162\1\164\1"+
        "\162\1\157\2\165\12\uffff\1\145\1\172\1\143\1\163\1\154\2\172\1"+
        "\uffff\4\172\1\165\1\141\1\147\1\145\1\156\1\172\1\uffff\1\164\2"+
        "\145\6\uffff\1\162\1\171\1\162\1\172\1\164\1\uffff\1\151\2\172\1"+
        "\156\1\172\1\141\1\uffff\1\172\1\157\2\uffff\1\172\1\uffff\1\155"+
        "\1\uffff\1\156\1\uffff\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\22\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\12\uffff\1\5\1\50\1\6\1\51\1\53\1"+
        "\7\13\uffff\1\40\1\47\1\54\1\52\1\57\1\55\1\60\1\56\1\1\1\15\7\uffff"+
        "\1\25\12\uffff\1\3\3\uffff\1\10\1\11\1\12\1\13\1\14\1\16\5\uffff"+
        "\1\2\6\uffff\1\23\2\uffff\1\24\1\4\1\uffff\1\20\1\uffff\1\26\1\uffff"+
        "\1\17\2\uffff\1\22\1\21";
    static final String DFA8_specialS =
        "\176\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\32\1\uffff\2\32\22\uffff\1\32\1\7\1\35\3\uffff\1\5\1\uffff"+
            "\1\22\1\23\1\41\1\37\1\24\1\40\1\uffff\1\33\12\34\1\uffff\1"+
            "\27\1\44\1\42\1\43\2\uffff\32\36\1\30\1\uffff\1\31\1\uffff\1"+
            "\36\1\uffff\1\16\1\36\1\21\1\11\1\2\1\3\2\36\1\1\3\36\1\12\2"+
            "\36\1\17\1\36\1\15\1\13\1\20\1\36\1\14\1\4\1\10\2\36\1\25\1"+
            "\6\1\26",
            "\1\45\7\uffff\1\46",
            "\1\47",
            "\1\52\15\uffff\1\50\5\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\56",
            "\1\60",
            "\1\62",
            "\1\63\5\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\101",
            "\1\103",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\117",
            "\1\121\5\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\160",
            "",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\164",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\166",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\172",
            "",
            "\1\173",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( IF | ELSE | FOR | WHILE | AND | OR | NOT | XOR | INT_DIV | INT_MOD | SHR | SHL | IN | VAR | RETURN | ARRAY | FUNCTION | PROGRAM | TRUE | FALSE | DO | COUNT | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | WS | COMMENT | NUMBER | STRING | IDENTIFIER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | NOTEQUALS | EQUALS | GT | LT | GE | LE );";
        }
    }
 

}