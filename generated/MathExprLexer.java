// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-10-12 22:46:44
package generated;

import org.antlr.runtime.*;

public class MathExprLexer extends Lexer {
    public static final int FUNCTION = 12;
    public static final int INCLUDE_STRING = 22;
    public static final int T__29 = 29;
    public static final int T__28 = 28;
    public static final int T__27 = 27;
    public static final int WHILE = 7;
    public static final int T__26 = 26;
    public static final int T__25 = 25;
    public static final int LETTER = 19;
    public static final int EOF = -1;
    public static final int TYPE = 10;
    public static final int IF = 5;
    public static final int INDEX = 16;
    public static final int IDENTIFIER = 23;
    public static final int INCLUDE = 9;
    public static final int RETURN = 4;
    public static final int DIGIT = 18;
    public static final int SEMANTIC = 11;
    public static final int T__42 = 42;
    public static final int T__43 = 43;
    public static final int T__40 = 40;
    public static final int T__41 = 41;
    public static final int ARGUMENTS = 13;
    public static final int ELSE = 6;
    public static final int NUMBER = 20;
    public static final int T__30 = 30;
    public static final int T__31 = 31;
    public static final int T__32 = 32;
    public static final int T__33 = 33;
    public static final int WS = 17;
    public static final int T__34 = 34;
    public static final int T__35 = 35;
    public static final int T__36 = 36;
    public static final int T__37 = 37;
    public static final int T__38 = 38;
    public static final int T__39 = 39;
    public static final int BLOCK = 15;
    public static final int PROGRAM = 8;
    public static final int CALL = 14;
    public static final int STRING = 21;
    public static final int DELIMITER = 24;

    // delegates
    // delegators
    static final String DFA8_eotS =
            "\1\uffff\4\30\11\uffff\1\37\1\uffff\1\41\1\44\10\uffff\1\30\1\46" +
                    "\2\30\4\uffff\1\51\2\uffff\1\30\1\uffff\2\30\1\uffff\1\30\1\56\2" +
                    "\30\1\uffff\1\61\1\62\2\uffff";
    static final String DFA8_eofS =
            "\63\uffff";
    static final String DFA8_minS =
            "\1\11\1\145\1\146\1\154\1\150\11\uffff\1\75\1\uffff\1\75\1\0\10" +
                    "\uffff\1\164\1\60\1\163\1\151\4\uffff\1\0\2\uffff\1\165\1\uffff" +
                    "\1\145\1\154\1\uffff\1\162\1\60\1\145\1\156\1\uffff\2\60\2\uffff";
    static final String DFA8_maxS =
            "\1\175\1\145\1\146\1\154\1\150\11\uffff\1\75\1\uffff\1\75\1\uffff" +
                    "\10\uffff\1\164\1\172\1\163\1\151\4\uffff\1\uffff\2\uffff\1\165" +
                    "\1\uffff\1\145\1\154\1\uffff\1\162\1\172\1\145\1\156\1\uffff\2\172" +
                    "\2\uffff";
    static final String DFA8_acceptS =
            "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\17" +
                    "\2\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\34\1\35\4\uffff\1\16\1" +
                    "\24\1\22\1\20\1\uffff\1\33\1\21\1\uffff\1\2\2\uffff\1\23\4\uffff" +
                    "\1\3\2\uffff\1\4\1\1";
    // $ANTLR end "RETURN"
    static final String DFA8_specialS =
            "\21\uffff\1\0\20\uffff\1\1\20\uffff}>";
    // $ANTLR end "IF"
    static final String[] DFA8_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\1\17\1\27\1\24\4\uffff\1\7" +
                    "\1\10\1\12\1\14\1\11\1\15\1\uffff\1\13\12\26\1\uffff\1\31\1" +
                    "\21\1\16\1\20\2\uffff\32\30\1\5\1\uffff\1\6\1\uffff\1\30\1\uffff" +
                    "\4\30\1\3\3\30\1\2\10\30\1\1\4\30\1\4\3\30\1\22\1\uffff\1\23",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "",
            "\1\40",
            "\75\43\1\42\uffc2\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\0\43",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "",
            "\1\55",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\57",
            "\1\60",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };
    // $ANTLR end "ELSE"
    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    // $ANTLR end "WHILE"
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    // $ANTLR end "T__25"
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    // $ANTLR end "T__26"
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    // $ANTLR end "T__27"
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    // $ANTLR end "T__28"
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    // $ANTLR end "T__29"
    static final short[][] DFA8_transition;
    // $ANTLR end "T__30"
    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }
    // $ANTLR end "T__31"
    protected DFA8 dfa8 = new DFA8(this);
    // $ANTLR end "T__32"

    public MathExprLexer() {
        ;
    }
    // $ANTLR end "T__33"

    public MathExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    // $ANTLR end "T__34"

    public MathExprLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);

    }
    // $ANTLR end "T__35"

    public String getGrammarFileName() {
        return "MathExpr.g";
    }
    // $ANTLR end "T__36"

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
        } finally {
        }
    }
    // $ANTLR end "T__37"

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
        } finally {
        }
    }
    // $ANTLR end "T__38"

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
        } finally {
        }
    }
    // $ANTLR end "T__39"

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
        } finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:7: ( '[' )
            // MathExpr.g:11:9: '['
            {
                match('[');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:12:7: ( ']' )
            // MathExpr.g:12:9: ']'
            {
                match(']');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:7: ( '(' )
            // MathExpr.g:13:9: '('
            {
                match('(');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:7: ( ')' )
            // MathExpr.g:14:9: ')'
            {
                match(')');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:7: ( ',' )
            // MathExpr.g:15:9: ','
            {
                match(',');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:7: ( '*' )
            // MathExpr.g:16:9: '*'
            {
                match('*');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:7: ( '/' )
            // MathExpr.g:17:9: '/'
            {
                match('/');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:7: ( '+' )
            // MathExpr.g:18:9: '+'
            {
                match('+');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:7: ( '-' )
            // MathExpr.g:19:9: '-'
            {
                match('-');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "INCLUDE_STRING"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:7: ( '==' )
            // MathExpr.g:20:9: '=='
            {
                match("==");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:7: ( '!=' )
            // MathExpr.g:21:9: '!='
            {
                match("!=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DELIMITER"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:7: ( '>' )
            // MathExpr.g:22:9: '>'
            {
                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:7: ( '<' )
            // MathExpr.g:23:9: '<'
            {
                match('<');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:7: ( '>=' )
            // MathExpr.g:24:9: '>='
            {
                match(">=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:7: ( '<=' )
            // MathExpr.g:25:9: '<='
            {
                match("<=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:26:7: ( '=' )
            // MathExpr.g:26:9: '='
            {
                match('=');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:7: ( '{' )
            // MathExpr.g:27:9: '{'
            {
                match('{');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:7: ( '}' )
            // MathExpr.g:28:9: '}'
            {
                match('}');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:29:7: ( '#include' )
            // MathExpr.g:29:9: '#include'
            {
                match("#include");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // MathExpr.g:28:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
                // MathExpr.g:28:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
                int cnt1 = 0;
                loop1:
                do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);

                    if (((LA1_0 >= '\t' && LA1_0 <= '\n') || (LA1_0 >= '\f' && LA1_0 <= '\r') || LA1_0 == ' ')) {
                        alt1 = 1;
                    }


                    switch (alt1) {
                        case 1:
                            // MathExpr.g:
                        {
                            if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || (input.LA(1) >= '\f' && input.LA(1) <= '\r') || input.LA(1) == ' ') {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }


                        }
                        break;

                        default:
                            if (cnt1 >= 1) break loop1;
                            EarlyExitException eee =
                                    new EarlyExitException(1, input);
                            throw eee;
                    }
                    cnt1++;
                } while (true);

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MathExpr.g:31:15: ( '0' .. '9' )
            // MathExpr.g:32:3: '0' .. '9'
            {
                matchRange('0', '9');

            }

        } finally {
        }
    }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // MathExpr.g:35:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // MathExpr.g:
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }


            }

        } finally {
        }
    }

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:39:7: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // MathExpr.g:40:3: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
                // MathExpr.g:40:3: ( DIGIT )+
                int cnt2 = 0;
                loop2:
                do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);

                    if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
                        alt2 = 1;
                    }


                    switch (alt2) {
                        case 1:
                            // MathExpr.g:40:3: DIGIT
                        {
                            mDIGIT();

                        }
                        break;

                        default:
                            if (cnt2 >= 1) break loop2;
                            EarlyExitException eee =
                                    new EarlyExitException(2, input);
                            throw eee;
                    }
                    cnt2++;
                } while (true);

                // MathExpr.g:40:10: ( '.' ( DIGIT )+ )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);

                if ((LA4_0 == '.')) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1:
                        // MathExpr.g:40:11: '.' ( DIGIT )+
                    {
                        match('.');
                        // MathExpr.g:40:15: ( DIGIT )+
                        int cnt3 = 0;
                        loop3:
                        do {
                            int alt3 = 2;
                            int LA3_0 = input.LA(1);

                            if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
                                alt3 = 1;
                            }


                            switch (alt3) {
                                case 1:
                                    // MathExpr.g:40:15: DIGIT
                                {
                                    mDIGIT();

                                }
                                break;

                                default:
                                    if (cnt3 >= 1) break loop3;
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
        } finally {
        }
    }

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:43:7: ( '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"' )
            // MathExpr.g:44:3: '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"'
            {
                match('\"');
                // MathExpr.g:44:7: ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )*
                loop5:
                do {
                    int alt5 = 4;
                    int LA5_0 = input.LA(1);

                    if ((LA5_0 == '\\')) {
                        int LA5_2 = input.LA(2);

                        if ((LA5_2 == '\"')) {
                            int LA5_4 = input.LA(3);

                            if (((LA5_4 >= '\u0000' && LA5_4 <= '\uFFFF'))) {
                                alt5 = 1;
                            } else {
                                alt5 = 3;
                            }

                        } else if ((LA5_2 == '\\')) {
                            alt5 = 2;
                        } else if (((LA5_2 >= '\u0000' && LA5_2 <= '!') || (LA5_2 >= '#' && LA5_2 <= '[') || (LA5_2 >= ']' && LA5_2 <= '\uFFFF'))) {
                            alt5 = 3;
                        }


                    } else if (((LA5_0 >= '\u0000' && LA5_0 <= '!') || (LA5_0 >= '#' && LA5_0 <= '[') || (LA5_0 >= ']' && LA5_0 <= '\uFFFF'))) {
                        alt5 = 3;
                    }


                    switch (alt5) {
                        case 1:
                            // MathExpr.g:44:8: '\\\\\"'
                        {
                            match("\\\"");


                        }
                        break;
                        case 2:
                            // MathExpr.g:44:16: '\\\\\\\\'
                        {
                            match("\\\\");


                        }
                        break;
                        case 3:
                            // MathExpr.g:44:25: ~ '\"'
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '\uFFFF')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }


                        }
                        break;

                        default:
                            break loop5;
                    }
                } while (true);

                match('\"');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "INCLUDE_STRING"
    public final void mINCLUDE_STRING() throws RecognitionException {
        try {
            int _type = INCLUDE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:47:15: ( '<' (~ '>' )* '>' )
            // MathExpr.g:48:3: '<' (~ '>' )* '>'
            {
                match('<');
                // MathExpr.g:48:7: (~ '>' )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if (((LA6_0 >= '\u0000' && LA6_0 <= '=') || (LA6_0 >= '?' && LA6_0 <= '\uFFFF'))) {
                        alt6 = 1;
                    }


                    switch (alt6) {
                        case 1:
                            // MathExpr.g:48:7: ~ '>'
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '=') || (input.LA(1) >= '?' && input.LA(1) <= '\uFFFF')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }


                        }
                        break;

                        default:
                            break loop6;
                    }
                } while (true);

                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:51:11: ( LETTER ( LETTER | DIGIT )* )
            // MathExpr.g:52:3: LETTER ( LETTER | DIGIT )*
            {
                mLETTER();
                // MathExpr.g:52:10: ( LETTER | DIGIT )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if (((LA7_0 >= '0' && LA7_0 <= '9') || (LA7_0 >= 'A' && LA7_0 <= 'Z') || LA7_0 == '_' || (LA7_0 >= 'a' && LA7_0 <= 'z'))) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // MathExpr.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }


                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "DELIMITER"
    public final void mDELIMITER() throws RecognitionException {
        try {
            int _type = DELIMITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:56:5: ( ';' )
            // MathExpr.g:56:9: ';'
            {
                match(';');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( RETURN | IF | ELSE | WHILE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER )
        int alt8 = 29;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1:
                // MathExpr.g:1:10: RETURN
            {
                mRETURN();

            }
            break;
            case 2:
                // MathExpr.g:1:17: IF
            {
                mIF();

            }
            break;
            case 3:
                // MathExpr.g:1:20: ELSE
            {
                mELSE();

            }
            break;
            case 4:
                // MathExpr.g:1:25: WHILE
            {
                mWHILE();

            }
            break;
            case 5:
                // MathExpr.g:1:31: T__25
            {
                mT__25();

            }
            break;
            case 6:
                // MathExpr.g:1:37: T__26
            {
                mT__26();

            }
            break;
            case 7:
                // MathExpr.g:1:43: T__27
            {
                mT__27();

            }
            break;
            case 8:
                // MathExpr.g:1:49: T__28
            {
                mT__28();

            }
            break;
            case 9:
                // MathExpr.g:1:55: T__29
            {
                mT__29();

            }
            break;
            case 10:
                // MathExpr.g:1:61: T__30
            {
                mT__30();

            }
            break;
            case 11:
                // MathExpr.g:1:67: T__31
            {
                mT__31();

            }
            break;
            case 12:
                // MathExpr.g:1:73: T__32
            {
                mT__32();

            }
            break;
            case 13:
                // MathExpr.g:1:79: T__33
            {
                mT__33();

            }
            break;
            case 14:
                // MathExpr.g:1:85: T__34
            {
                mT__34();

            }
            break;
            case 15:
                // MathExpr.g:1:91: T__35
            {
                mT__35();

            }
            break;
            case 16:
                // MathExpr.g:1:97: T__36
            {
                mT__36();

            }
            break;
            case 17:
                // MathExpr.g:1:103: T__37
            {
                mT__37();

            }
            break;
            case 18:
                // MathExpr.g:1:109: T__38
            {
                mT__38();

            }
            break;
            case 19:
                // MathExpr.g:1:115: T__39
            {
                mT__39();

            }
            break;
            case 20:
                // MathExpr.g:1:121: T__40
            {
                mT__40();

            }
            break;
            case 21:
                // MathExpr.g:1:127: T__41
            {
                mT__41();

            }
            break;
            case 22:
                // MathExpr.g:1:133: T__42
            {
                mT__42();

            }
            break;
            case 23:
                // MathExpr.g:1:139: T__43
            {
                mT__43();

            }
            break;
            case 24:
                // MathExpr.g:1:145: WS
            {
                mWS();

            }
            break;
            case 25:
                // MathExpr.g:1:148: NUMBER
            {
                mNUMBER();

            }
            break;
            case 26:
                // MathExpr.g:1:155: STRING
            {
                mSTRING();

            }
            break;
            case 27:
                // MathExpr.g:1:162: INCLUDE_STRING
            {
                mINCLUDE_STRING();

            }
            break;
            case 28:
                // MathExpr.g:1:177: IDENTIFIER
            {
                mIDENTIFIER();

            }
            break;
            case 29:
                // MathExpr.g:1:188: DELIMITER
            {
                mDELIMITER();

            }
            break;

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
            return "1:1: Tokens : ( RETURN | IF | ELSE | WHILE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER );";
        }

        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch (s) {
                case 0:
                    int LA8_17 = input.LA(1);

                    s = -1;
                    if ((LA8_17 == '=')) {
                        s = 34;
                    } else if (((LA8_17 >= '\u0000' && LA8_17 <= '<') || (LA8_17 >= '>' && LA8_17 <= '\uFFFF'))) {
                        s = 35;
                    } else s = 36;

                    if (s >= 0) return s;
                    break;
                case 1:
                    int LA8_34 = input.LA(1);

                    s = -1;
                    if (((LA8_34 >= '\u0000' && LA8_34 <= '\uFFFF'))) {
                        s = 35;
                    } else s = 41;

                    if (s >= 0) return s;
                    break;
            }
            NoViableAltException nvae =
                    new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}