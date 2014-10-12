package generated;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-10-20 00:17:13

import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MathExprLexer extends Lexer {
    public static final int FUNCTION = 12;
    public static final int INCLUDE_STRING = 22;
    public static final int LT = 37;
    public static final int WHILE = 7;
    public static final int BIT_AND = 29;
    public static final int LETTER = 19;
    public static final int FOR = 38;
    public static final int SUB = 26;
    public static final int GE_OP = 32;
    public static final int EQUALS = 35;
    public static final int EOF = -1;
    public static final int NEQUALS = 34;
    public static final int TYPE = 10;
    public static final int IF = 5;
    public static final int T__55 = 55;
    public static final int T__56 = 56;
    public static final int INDEX = 16;
    public static final int T__57 = 57;
    public static final int T__58 = 58;
    public static final int T__51 = 51;
    public static final int T__52 = 52;
    public static final int T__53 = 53;
    public static final int BIT_OR = 30;
    public static final int T__54 = 54;
    public static final int IDENTIFIER = 23;
    public static final int INCLUDE = 9;
    public static final int RETURN = 4;
    public static final int DIGIT = 18;
    public static final int SEMANTIC = 11;
    public static final int T__50 = 50;
    public static final int ADD = 25;
    public static final int T__42 = 42;
    public static final int T__43 = 43;
    public static final int T__40 = 40;
    public static final int T__41 = 41;
    public static final int T__46 = 46;
    public static final int T__47 = 47;
    public static final int T__44 = 44;
    public static final int ARGUMENTS = 13;
    public static final int T__45 = 45;
    public static final int T__48 = 48;
    public static final int T__49 = 49;
    public static final int ELSE = 6;
    public static final int NUMBER = 20;
    public static final int MUL = 27;
    public static final int WS = 17;
    public static final int T__39 = 39;
    public static final int BLOCK = 15;
    public static final int ASSIGN = 31;
    public static final int GT = 36;
    public static final int PROGRAM = 8;
    public static final int CALL = 14;
    public static final int DIV = 28;
    public static final int LE_OP = 33;
    public static final int STRING = 21;
    public static final int DELIMITER = 24;

    // delegates
    // delegators
    static final String DFA8_eotS =
            "\1\uffff\4\32\2\uffff\7\32\3\uffff\1\62\1\64\6\uffff\1\67\6\uffff" +
                    "\1\71\1\73\1\uffff\1\32\1\75\14\32\4\uffff\1\112\6\uffff\1\32\1" +
                    "\uffff\1\114\13\32\1\uffff\1\32\1\uffff\1\131\1\32\1\133\1\134\3" +
                    "\32\1\140\4\32\1\uffff\1\145\2\uffff\1\32\1\147\1\32\1\uffff\1\151" +
                    "\2\32\1\154\1\uffff\1\155\1\uffff\1\156\1\uffff\1\157\1\32\4\uffff" +
                    "\1\32\1\162\1\uffff";
    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final String DFA8_eofS =
            "\163\uffff";
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final String DFA8_minS =
            "\1\11\1\145\1\146\1\154\1\150\2\uffff\1\150\1\157\1\150\1\157\1" +
                    "\154\1\157\1\156\3\uffff\1\53\1\55\6\uffff\1\0\6\uffff\2\75\1\uffff" +
                    "\1\164\1\60\1\164\1\163\1\151\1\141\1\151\1\162\1\157\1\147\1\156" +
                    "\1\157\1\165\1\163\4\uffff\1\0\6\uffff\1\165\1\uffff\1\60\1\145" +
                    "\1\154\1\162\1\144\1\151\1\162\1\156\1\147\1\141\1\142\1\151\1\uffff" +
                    "\1\162\1\uffff\1\60\1\145\2\60\1\156\1\164\1\145\1\60\1\164\1\154" +
                    "\1\147\1\156\1\uffff\1\60\2\uffff\1\147\1\60\1\144\1\uffff\1\60" +
                    "\1\145\1\156\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\145\4" +
                    "\uffff\1\144\1\60\1\uffff";
    // $ANTLR end "RETURN"
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    // $ANTLR end "IF"
    static final String DFA8_maxS =
            "\1\175\1\145\1\156\1\154\1\150\2\uffff\1\150\1\157\1\164\1\157" +
                    "\1\154\1\157\1\156\3\uffff\1\53\1\55\6\uffff\1\uffff\6\uffff\2\75" +
                    "\1\uffff\1\164\1\172\1\164\1\163\1\151\1\141\1\151\1\162\1\157\1" +
                    "\147\1\156\1\157\1\165\1\163\4\uffff\1\uffff\6\uffff\1\165\1\uffff" +
                    "\1\172\1\145\1\154\1\162\1\144\1\151\1\162\1\156\1\147\1\141\1\142" +
                    "\1\151\1\uffff\1\162\1\uffff\1\172\1\145\2\172\1\156\1\164\1\145" +
                    "\1\172\1\164\1\154\1\147\1\156\1\uffff\1\172\2\uffff\1\147\1\172" +
                    "\1\144\1\uffff\1\172\1\145\1\156\1\172\1\uffff\1\172\1\uffff\1\172" +
                    "\1\uffff\1\172\1\145\4\uffff\1\144\1\172\1\uffff";
    // $ANTLR end "ELSE"
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    // $ANTLR end "WHILE"
    static final String DFA8_acceptS =
            "\5\uffff\1\6\1\7\7\uffff\1\21\1\22\1\23\2\uffff\1\26\1\27\1\30" +
                    "\1\31\1\32\1\33\1\uffff\1\35\1\36\1\41\1\42\1\43\1\44\2\uffff\1" +
                    "\50\16\uffff\1\24\1\37\1\25\1\40\1\uffff\1\34\1\53\1\51\1\45\1\46" +
                    "\1\52\1\uffff\1\2\14\uffff\1\47\1\uffff\1\5\14\uffff\1\3\1\uffff" +
                    "\1\10\1\11\3\uffff\1\14\4\uffff\1\4\1\uffff\1\13\1\uffff\1\15\2" +
                    "\uffff\1\1\1\12\1\17\1\16\2\uffff\1\20";
    // $ANTLR end "T__39"
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    // $ANTLR end "T__40"
    static final String DFA8_specialS =
            "\31\uffff\1\0\33\uffff\1\1\75\uffff}>";
    // $ANTLR end "T__41"
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    // $ANTLR end "T__42"
    static final String[] DFA8_transitionS = {
            "\2\26\1\uffff\2\26\22\uffff\1\26\1\42\1\30\1\25\2\uffff\1\36" +
                    "\1\uffff\1\16\1\17\1\34\1\21\1\20\1\22\1\uffff\1\35\12\27\1" +
                    "\uffff\1\33\1\31\1\40\1\41\2\uffff\32\32\1\5\1\uffff\1\6\1\uffff" +
                    "\1\32\1\uffff\2\32\1\7\1\14\1\3\1\13\2\32\1\2\2\32\1\12\5\32" +
                    "\1\1\1\11\1\32\1\15\1\10\1\4\3\32\1\23\1\37\1\24",
            "\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\53\1\54\12\uffff\1\52",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "\1\61",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\75\66\1\65\uffc2\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\72",
            "",
            "\1\74",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "\0\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\146",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\150",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\152",
            "\1\153",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\160",
            "",
            "",
            "",
            "",
            "\1\161",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };
    // $ANTLR end "T__43"
    static final short[][] DFA8_transition;

    // $ANTLR end "T__44"
    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    // $ANTLR end "T__45"
    protected DFA8 dfa8 = new DFA8(this);
    // $ANTLR end "T__46"

    public MathExprLexer() {
        ;
    }
    // $ANTLR end "T__47"

    public MathExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    // $ANTLR end "T__48"

    public MathExprLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);

    }
    // $ANTLR end "T__49"

    public String getGrammarFileName() {
        return "MathExpr.g";
    }
    // $ANTLR end "T__50"

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
    // $ANTLR end "T__51"

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
    // $ANTLR end "T__52"

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
    // $ANTLR end "T__53"

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
    // $ANTLR end "T__54"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:7: ( 'int' )
            // MathExpr.g:11:9: 'int'
            {
                match("int");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:12:7: ( '[' )
            // MathExpr.g:12:9: '['
            {
                match('[');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:7: ( ']' )
            // MathExpr.g:13:9: ']'
            {
                match(']');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:7: ( 'char' )
            // MathExpr.g:14:9: 'char'
            {
                match("char");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:7: ( 'void' )
            // MathExpr.g:15:9: 'void'
            {
                match("void");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:7: ( 'string' )
            // MathExpr.g:16:9: 'string'
            {
                match("string");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:7: ( 'short' )
            // MathExpr.g:17:9: 'short'
            {
                match("short");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:7: ( 'long' )
            // MathExpr.g:18:9: 'long'
            {
                match("long");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:7: ( 'float' )
            // MathExpr.g:19:9: 'float'
            {
                match("float");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:7: ( 'double' )
            // MathExpr.g:20:9: 'double'
            {
                match("double");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "INCLUDE_STRING"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:7: ( 'signed' )
            // MathExpr.g:21:9: 'signed'
            {
                match("signed");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:7: ( 'unsigned' )
            // MathExpr.g:22:9: 'unsigned'
            {
                match("unsigned");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DELIMITER"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:7: ( '(' )
            // MathExpr.g:23:9: '('
            {
                match('(');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:7: ( ')' )
            // MathExpr.g:24:9: ')'
            {
                match(')');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:7: ( ',' )
            // MathExpr.g:25:9: ','
            {
                match(',');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:26:7: ( '++' )
            // MathExpr.g:26:9: '++'
            {
                match("++");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:7: ( '--' )
            // MathExpr.g:27:9: '--'
            {
                match("--");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "BIT_AND"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:7: ( '{' )
            // MathExpr.g:28:9: '{'
            {
                match('{');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "BIT_OR"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:29:7: ( '}' )
            // MathExpr.g:29:9: '}'
            {
                match('}');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:30:7: ( '#include' )
            // MathExpr.g:30:9: '#include'
            {
                match("#include");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "GE_OP"

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
    // $ANTLR end "LE_OP"

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
    // $ANTLR end "NEQUALS"

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
    // $ANTLR end "EQUALS"

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
    // $ANTLR end "GT"

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
    // $ANTLR end "LT"

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
            // MathExpr.g:55:10: ( ';' )
            // MathExpr.g:55:13: ';'
            {
                match(';');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:104:4: ( '+' )
            // MathExpr.g:104:17: '+'
            {
                match('+');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:105:4: ( '-' )
            // MathExpr.g:105:17: '-'
            {
                match('-');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:106:4: ( '*' )
            // MathExpr.g:106:17: '*'
            {
                match('*');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:107:4: ( '/' )
            // MathExpr.g:107:17: '/'
            {
                match('/');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "BIT_AND"
    public final void mBIT_AND() throws RecognitionException {
        try {
            int _type = BIT_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:108:8: ( '&' )
            // MathExpr.g:108:17: '&'
            {
                match('&');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "BIT_OR"
    public final void mBIT_OR() throws RecognitionException {
        try {
            int _type = BIT_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:109:7: ( '|' )
            // MathExpr.g:109:17: '|'
            {
                match('|');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:110:7: ( '=' )
            // MathExpr.g:110:17: '='
            {
                match('=');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "GE_OP"
    public final void mGE_OP() throws RecognitionException {
        try {
            int _type = GE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:111:6: ( '>=' )
            // MathExpr.g:111:17: '>='
            {
                match(">=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "LE_OP"
    public final void mLE_OP() throws RecognitionException {
        try {
            int _type = LE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:112:6: ( '<=' )
            // MathExpr.g:112:17: '<='
            {
                match("<=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "NEQUALS"
    public final void mNEQUALS() throws RecognitionException {
        try {
            int _type = NEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:113:8: ( '!=' )
            // MathExpr.g:113:17: '!='
            {
                match("!=");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:114:7: ( '==' )
            // MathExpr.g:114:17: '=='
            {
                match("==");


            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:115:3: ( '>' )
            // MathExpr.g:115:17: '>'
            {
                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:116:3: ( '<' )
            // MathExpr.g:116:17: '<'
            {
                match('<');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( RETURN | IF | ELSE | WHILE | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | GE_OP | LE_OP | NEQUALS | EQUALS | GT | LT )
        int alt8 = 43;
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
                // MathExpr.g:1:31: T__39
            {
                mT__39();

            }
            break;
            case 6:
                // MathExpr.g:1:37: T__40
            {
                mT__40();

            }
            break;
            case 7:
                // MathExpr.g:1:43: T__41
            {
                mT__41();

            }
            break;
            case 8:
                // MathExpr.g:1:49: T__42
            {
                mT__42();

            }
            break;
            case 9:
                // MathExpr.g:1:55: T__43
            {
                mT__43();

            }
            break;
            case 10:
                // MathExpr.g:1:61: T__44
            {
                mT__44();

            }
            break;
            case 11:
                // MathExpr.g:1:67: T__45
            {
                mT__45();

            }
            break;
            case 12:
                // MathExpr.g:1:73: T__46
            {
                mT__46();

            }
            break;
            case 13:
                // MathExpr.g:1:79: T__47
            {
                mT__47();

            }
            break;
            case 14:
                // MathExpr.g:1:85: T__48
            {
                mT__48();

            }
            break;
            case 15:
                // MathExpr.g:1:91: T__49
            {
                mT__49();

            }
            break;
            case 16:
                // MathExpr.g:1:97: T__50
            {
                mT__50();

            }
            break;
            case 17:
                // MathExpr.g:1:103: T__51
            {
                mT__51();

            }
            break;
            case 18:
                // MathExpr.g:1:109: T__52
            {
                mT__52();

            }
            break;
            case 19:
                // MathExpr.g:1:115: T__53
            {
                mT__53();

            }
            break;
            case 20:
                // MathExpr.g:1:121: T__54
            {
                mT__54();

            }
            break;
            case 21:
                // MathExpr.g:1:127: T__55
            {
                mT__55();

            }
            break;
            case 22:
                // MathExpr.g:1:133: T__56
            {
                mT__56();

            }
            break;
            case 23:
                // MathExpr.g:1:139: T__57
            {
                mT__57();

            }
            break;
            case 24:
                // MathExpr.g:1:145: T__58
            {
                mT__58();

            }
            break;
            case 25:
                // MathExpr.g:1:151: WS
            {
                mWS();

            }
            break;
            case 26:
                // MathExpr.g:1:154: NUMBER
            {
                mNUMBER();

            }
            break;
            case 27:
                // MathExpr.g:1:161: STRING
            {
                mSTRING();

            }
            break;
            case 28:
                // MathExpr.g:1:168: INCLUDE_STRING
            {
                mINCLUDE_STRING();

            }
            break;
            case 29:
                // MathExpr.g:1:183: IDENTIFIER
            {
                mIDENTIFIER();

            }
            break;
            case 30:
                // MathExpr.g:1:194: DELIMITER
            {
                mDELIMITER();

            }
            break;
            case 31:
                // MathExpr.g:1:204: ADD
            {
                mADD();

            }
            break;
            case 32:
                // MathExpr.g:1:208: SUB
            {
                mSUB();

            }
            break;
            case 33:
                // MathExpr.g:1:212: MUL
            {
                mMUL();

            }
            break;
            case 34:
                // MathExpr.g:1:216: DIV
            {
                mDIV();

            }
            break;
            case 35:
                // MathExpr.g:1:220: BIT_AND
            {
                mBIT_AND();

            }
            break;
            case 36:
                // MathExpr.g:1:228: BIT_OR
            {
                mBIT_OR();

            }
            break;
            case 37:
                // MathExpr.g:1:235: ASSIGN
            {
                mASSIGN();

            }
            break;
            case 38:
                // MathExpr.g:1:242: GE_OP
            {
                mGE_OP();

            }
            break;
            case 39:
                // MathExpr.g:1:248: LE_OP
            {
                mLE_OP();

            }
            break;
            case 40:
                // MathExpr.g:1:254: NEQUALS
            {
                mNEQUALS();

            }
            break;
            case 41:
                // MathExpr.g:1:262: EQUALS
            {
                mEQUALS();

            }
            break;
            case 42:
                // MathExpr.g:1:269: GT
            {
                mGT();

            }
            break;
            case 43:
                // MathExpr.g:1:272: LT
            {
                mLT();

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
            return "1:1: Tokens : ( RETURN | IF | ELSE | WHILE | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | WS | NUMBER | STRING | INCLUDE_STRING | IDENTIFIER | DELIMITER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | GE_OP | LE_OP | NEQUALS | EQUALS | GT | LT );";
        }

        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch (s) {
                case 0:
                    int LA8_25 = input.LA(1);

                    s = -1;
                    if ((LA8_25 == '=')) {
                        s = 53;
                    } else if (((LA8_25 >= '\u0000' && LA8_25 <= '<') || (LA8_25 >= '>' && LA8_25 <= '\uFFFF'))) {
                        s = 54;
                    } else s = 55;

                    if (s >= 0) return s;
                    break;
                case 1:
                    int LA8_53 = input.LA(1);

                    s = -1;
                    if (((LA8_53 >= '\u0000' && LA8_53 <= '\uFFFF'))) {
                        s = 54;
                    } else s = 74;

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