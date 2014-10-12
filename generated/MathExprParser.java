package generated;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-10-20 00:17:12

import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "WHILE", "PROGRAM", "INCLUDE", "TYPE", "SEMANTIC", "FUNCTION", "ARGUMENTS", "CALL", "BLOCK", "INDEX", "WS", "DIGIT", "LETTER", "NUMBER", "STRING", "INCLUDE_STRING", "IDENTIFIER", "DELIMITER", "ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", "ASSIGN", "GE_OP", "LE_OP", "NEQUALS", "EQUALS", "GT", "LT", "FOR", "'int'", "'['", "']'", "'char'", "'void'", "'string'", "'short'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'('", "')'", "','", "'++'", "'--'", "'{'", "'}'", "'#include'"
    };
    public static final int FUNCTION = 12;
    public static final int INCLUDE_STRING = 22;
    public static final int LT = 37;
    public static final int BIT_AND = 29;
    public static final int WHILE = 7;
    public static final int LETTER = 19;
    public static final int FOR = 38;
    public static final int SUB = 26;
    public static final int EQUALS = 35;
    public static final int GE_OP = 32;
    public static final int EOF = -1;
    public static final int NEQUALS = 34;
    public static final int IF = 5;
    public static final int TYPE = 10;
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
    public static final int LE_OP = 33;
    public static final int DIV = 28;
    public static final int DELIMITER = 24;
    public static final int STRING = 21;

    // delegates
    // delegators
    public static final BitSet FOLLOW_39_in_typeBasic416 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_typeBasic419 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_typeBasic421 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_42_in_typeBasic426 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_typeBasic429 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_typeBasic431 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_43_in_typeBasic436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_typeBasic439 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_40_in_typeBasic442 = new BitSet(new long[]{0x0000020000000000L});
    // $ANTLR end "typeBasic"
    public static final BitSet FOLLOW_41_in_typeBasic444 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_45_in_typeBasic449 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "type"
    public static final BitSet FOLLOW_40_in_typeBasic452 = new BitSet(new long[]{0x0000020000000000L});
    ;
    public static final BitSet FOLLOW_41_in_typeBasic454 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "term"
    public static final BitSet FOLLOW_46_in_typeBasic459 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_40_in_typeBasic462 = new BitSet(new long[]{0x0000020000000000L});
    // $ANTLR end "arguments"
    public static final BitSet FOLLOW_41_in_typeBasic464 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_47_in_typeBasic469 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "functionCall"
    public static final BitSet FOLLOW_40_in_typeBasic472 = new BitSet(new long[]{0x0000020000000000L});
    ;
    public static final BitSet FOLLOW_41_in_typeBasic474 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "arrayIndex0"
    public static final BitSet FOLLOW_48_in_typeBasic479 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_40_in_typeBasic482 = new BitSet(new long[]{0x0000020000000000L});
    // $ANTLR end "lvalue"
    public static final BitSet FOLLOW_41_in_typeBasic484 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_49_in_typeBasic489 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "rvalue"
    public static final BitSet FOLLOW_40_in_typeBasic492 = new BitSet(new long[]{0x0000020000000000L});
    ;
    public static final BitSet FOLLOW_41_in_typeBasic494 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "increment"
    public static final BitSet FOLLOW_50_in_typeBasic499 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_40_in_typeBasic502 = new BitSet(new long[]{0x0000020000000000L});
    // $ANTLR end "multiplex"
    public static final BitSet FOLLOW_41_in_typeBasic504 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_typeBasic_in_type516 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "add"
    public static final BitSet FOLLOW_NUMBER_in_term533 = new BitSet(new long[]{0x0000000000000002L});
    ;
    public static final BitSet FOLLOW_STRING_in_term537 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "logic"
    public static final BitSet FOLLOW_lvalue_in_term541 = new BitSet(new long[]{0x0000000000000002L});
    ;
    public static final BitSet FOLLOW_functionCall_in_term545 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "expression"
    public static final BitSet FOLLOW_51_in_term549 = new BitSet(new long[]{0x0008000000B00000L});
    ;
    public static final BitSet FOLLOW_logic_in_term552 = new BitSet(new long[]{0x0010000000000000L});
    // $ANTLR end "expressionsList"
    public static final BitSet FOLLOW_52_in_term554 = new BitSet(new long[]{0x0000000000000002L});
    ;
    public static final BitSet FOLLOW_rvalue_in_arguments567 = new BitSet(new long[]{0x0020000000000002L});
    // $ANTLR end "argumentDeclaration"
    public static final BitSet FOLLOW_53_in_arguments570 = new BitSet(new long[]{0x0008000000B00000L});
    ;
    public static final BitSet FOLLOW_rvalue_in_arguments572 = new BitSet(new long[]{0x0020000000000002L});
    // $ANTLR end "argumentsDeclaration"
    public static final BitSet FOLLOW_IDENTIFIER_in_functionCall596 = new BitSet(new long[]{0x0008000000000000L});
    ;
    public static final BitSet FOLLOW_51_in_functionCall598 = new BitSet(new long[]{0x0018000000B00000L});
    // $ANTLR end "functionDeclaration"
    public static final BitSet FOLLOW_arguments_in_functionCall600 = new BitSet(new long[]{0x0010000000000000L});
    ;
    public static final BitSet FOLLOW_52_in_functionCall602 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "importDeclaration"
    public static final BitSet FOLLOW_40_in_arrayIndex0624 = new BitSet(new long[]{0x0000000000000002L});
    ;
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue642 = new BitSet(new long[]{0x0000010000000002L});
    // $ANTLR end "declaration"
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue645 = new BitSet(new long[]{0x0008000000B00000L});
    ;
    public static final BitSet FOLLOW_rvalue_in_lvalue648 = new BitSet(new long[]{0x0000020000000000L});
    // $ANTLR end "declarations"
    public static final BitSet FOLLOW_41_in_lvalue650 = new BitSet(new long[]{0x0000010000000002L});
    ;
    public static final BitSet FOLLOW_logic_in_rvalue664 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "code"
    public static final BitSet FOLLOW_IDENTIFIER_in_increment672 = new BitSet(new long[]{0x00C0000000000000L});
    ;
    public static final BitSet FOLLOW_set_in_increment674 = new BitSet(new long[]{0x0000000000000002L});
    // $ANTLR end "start"
    public static final BitSet FOLLOW_term_in_multiplex952 = new BitSet(new long[]{0x0000000018000002L});
    // $ANTLR end synpred41_MathExpr

    // Delegated rules
    public static final BitSet FOLLOW_set_in_multiplex955 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_term_in_multiplex966 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_multiplex_in_add979 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_set_in_add982 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_multiplex_in_add991 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_add_in_logic1004 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_set_in_logic1007 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_add_in_logic1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expression1046 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expression1048 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1051 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_expression1059 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression1065 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expression1073 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1076 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression1084 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1087 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1090 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1092 = new BitSet(new long[]{0x0107FCC0008000B0L});
    public static final BitSet FOLLOW_expression_in_expression1095 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expression1098 = new BitSet(new long[]{0x0107FCC0008000B0L});
    public static final BitSet FOLLOW_expression_in_expression1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_expression1107 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1110 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1113 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expression1115 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1117 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1119 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1122 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1124 = new BitSet(new long[]{0x0008000001B00000L});
    public static final BitSet FOLLOW_add_in_expression1128 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_increment_in_expression1130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1134 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1137 = new BitSet(new long[]{0x0107FCC0008000B0L});
    public static final BitSet FOLLOW_expression_in_expression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expression1143 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1146 = new BitSet(new long[]{0x0008000000B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression1149 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1151 = new BitSet(new long[]{0x0107FCC0008000B0L});
    public static final BitSet FOLLOW_expression_in_expression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_expression1158 = new BitSet(new long[]{0x0307FCC0008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_expression1161 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_expression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionsList1176 = new BitSet(new long[]{0x0107FCC0018000B2L});
    public static final BitSet FOLLOW_DELIMITER_in_expressionsList1178 = new BitSet(new long[]{0x0107FCC0018000B2L});
    public static final BitSet FOLLOW_type_in_argumentDeclaration1202 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration1216 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_argumentsDeclaration1219 = new BitSet(new long[]{0x0007FC8000000000L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration1221 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration1246 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration1248 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_functionDeclaration1250 = new BitSet(new long[]{0x0017FC8000000000L});
    public static final BitSet FOLLOW_argumentsDeclaration_in_functionDeclaration1252 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_functionDeclaration1254 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_functionDeclaration1256 = new BitSet(new long[]{0x0307FCC0008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclaration1258 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_functionDeclaration1260 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DELIMITER_in_functionDeclaration1262 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_58_in_importDeclaration1293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_STRING_in_importDeclaration1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_declaration1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDeclaration_in_declaration1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations1338 = new BitSet(new long[]{0x0407FC8000000002L});
    public static final BitSet FOLLOW_declarations_in_code1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_start1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred41_MathExpr1098 = new BitSet(new long[]{0x0107FCC0008000B0L});
    public static final BitSet FOLLOW_expression_in_synpred41_MathExpr1101 = new BitSet(new long[]{0x0000000000000002L});
    static final String DFA20_eotS =
            "\12\uffff";
    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final String DFA20_eofS =
            "\12\uffff";
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final String DFA20_minS =
            "\1\4\1\37\10\uffff";
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final String DFA20_maxS =
            "\1\70\1\63\10\uffff";
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final String DFA20_acceptS =
            "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\3\1\1";
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final String DFA20_specialS =
            "\12\uffff}>";
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final String[] DFA20_transitionS = {
            "\1\3\1\4\1\uffff\1\6\17\uffff\1\1\16\uffff\1\5\1\2\2\uffff" +
                    "\11\2\5\uffff\1\7",
            "\1\11\10\uffff\1\11\12\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();
    protected DFA20 dfa20 = new DFA20(this);

    public MathExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public MathExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);

    }

    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public String[] getTokenNames() {
        return MathExprParser.tokenNames;
    }

    public String getGrammarFileName() {
        return "MathExpr.g";
    }

    // $ANTLR start "typeBasic"
    // MathExpr.g:57:1: typeBasic : ( 'int' ( '[' ']' )* | 'char' ( '[' ']' )* | 'void' | 'string' ( '[' ']' )* | 'short' ( '[' ']' )* | 'long' ( '[' ']' )* | 'float' ( '[' ']' )* | 'double' ( '[' ']' )* | 'signed' ( '[' ']' )* | 'unsigned' ( '[' ']' )* );
    public final MathExprParser.typeBasic_return typeBasic() throws RecognitionException {
        MathExprParser.typeBasic_return retval = new MathExprParser.typeBasic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1 = null;
        Token char_literal2 = null;
        Token char_literal3 = null;
        Token string_literal4 = null;
        Token char_literal5 = null;
        Token char_literal6 = null;
        Token string_literal7 = null;
        Token string_literal8 = null;
        Token char_literal9 = null;
        Token char_literal10 = null;
        Token string_literal11 = null;
        Token char_literal12 = null;
        Token char_literal13 = null;
        Token string_literal14 = null;
        Token char_literal15 = null;
        Token char_literal16 = null;
        Token string_literal17 = null;
        Token char_literal18 = null;
        Token char_literal19 = null;
        Token string_literal20 = null;
        Token char_literal21 = null;
        Token char_literal22 = null;
        Token string_literal23 = null;
        Token char_literal24 = null;
        Token char_literal25 = null;
        Token string_literal26 = null;
        Token char_literal27 = null;
        Token char_literal28 = null;

        Object string_literal1_tree = null;
        Object char_literal2_tree = null;
        Object char_literal3_tree = null;
        Object string_literal4_tree = null;
        Object char_literal5_tree = null;
        Object char_literal6_tree = null;
        Object string_literal7_tree = null;
        Object string_literal8_tree = null;
        Object char_literal9_tree = null;
        Object char_literal10_tree = null;
        Object string_literal11_tree = null;
        Object char_literal12_tree = null;
        Object char_literal13_tree = null;
        Object string_literal14_tree = null;
        Object char_literal15_tree = null;
        Object char_literal16_tree = null;
        Object string_literal17_tree = null;
        Object char_literal18_tree = null;
        Object char_literal19_tree = null;
        Object string_literal20_tree = null;
        Object char_literal21_tree = null;
        Object char_literal22_tree = null;
        Object string_literal23_tree = null;
        Object char_literal24_tree = null;
        Object char_literal25_tree = null;
        Object string_literal26_tree = null;
        Object char_literal27_tree = null;
        Object char_literal28_tree = null;

        try {
            // MathExpr.g:57:10: ( 'int' ( '[' ']' )* | 'char' ( '[' ']' )* | 'void' | 'string' ( '[' ']' )* | 'short' ( '[' ']' )* | 'long' ( '[' ']' )* | 'float' ( '[' ']' )* | 'double' ( '[' ']' )* | 'signed' ( '[' ']' )* | 'unsigned' ( '[' ']' )* )
            int alt10 = 10;
            switch (input.LA(1)) {
                case 39: {
                    alt10 = 1;
                }
                break;
                case 42: {
                    alt10 = 2;
                }
                break;
                case 43: {
                    alt10 = 3;
                }
                break;
                case 44: {
                    alt10 = 4;
                }
                break;
                case 45: {
                    alt10 = 5;
                }
                break;
                case 46: {
                    alt10 = 6;
                }
                break;
                case 47: {
                    alt10 = 7;
                }
                break;
                case 48: {
                    alt10 = 8;
                }
                break;
                case 49: {
                    alt10 = 9;
                }
                break;
                case 50: {
                    alt10 = 10;
                }
                break;
                default:
                    if (state.backtracking > 0) {
                        state.failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                    throw nvae;
            }

            switch (alt10) {
                case 1:
                    // MathExpr.g:58:1: 'int' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal1 = (Token) match(input, 39, FOLLOW_39_in_typeBasic416);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal1_tree = (Object) adaptor.create(string_literal1);
                        adaptor.addChild(root_0, string_literal1_tree);
                    }
                    // MathExpr.g:58:7: ( '[' ']' )*
                    loop1:
                    do {
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);

                        if ((LA1_0 == 40)) {
                            alt1 = 1;
                        }


                        switch (alt1) {
                            case 1:
                                // MathExpr.g:58:8: '[' ']'
                            {
                                char_literal2 = (Token) match(input, 40, FOLLOW_40_in_typeBasic419);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal2_tree = (Object) adaptor.create(char_literal2);
                                    adaptor.addChild(root_0, char_literal2_tree);
                                }
                                char_literal3 = (Token) match(input, 41, FOLLOW_41_in_typeBasic421);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal3_tree = (Object) adaptor.create(char_literal3);
                                    adaptor.addChild(root_0, char_literal3_tree);
                                }

                            }
                            break;

                            default:
                                break loop1;
                        }
                    } while (true);


                }
                break;
                case 2:
                    // MathExpr.g:59:2: 'char' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal4 = (Token) match(input, 42, FOLLOW_42_in_typeBasic426);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal4_tree = (Object) adaptor.create(string_literal4);
                        adaptor.addChild(root_0, string_literal4_tree);
                    }
                    // MathExpr.g:59:9: ( '[' ']' )*
                    loop2:
                    do {
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);

                        if ((LA2_0 == 40)) {
                            alt2 = 1;
                        }


                        switch (alt2) {
                            case 1:
                                // MathExpr.g:59:10: '[' ']'
                            {
                                char_literal5 = (Token) match(input, 40, FOLLOW_40_in_typeBasic429);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal5_tree = (Object) adaptor.create(char_literal5);
                                    adaptor.addChild(root_0, char_literal5_tree);
                                }
                                char_literal6 = (Token) match(input, 41, FOLLOW_41_in_typeBasic431);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal6_tree = (Object) adaptor.create(char_literal6);
                                    adaptor.addChild(root_0, char_literal6_tree);
                                }

                            }
                            break;

                            default:
                                break loop2;
                        }
                    } while (true);


                }
                break;
                case 3:
                    // MathExpr.g:60:2: 'void'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal7 = (Token) match(input, 43, FOLLOW_43_in_typeBasic436);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal7_tree = (Object) adaptor.create(string_literal7);
                        adaptor.addChild(root_0, string_literal7_tree);
                    }

                }
                break;
                case 4:
                    // MathExpr.g:61:2: 'string' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal8 = (Token) match(input, 44, FOLLOW_44_in_typeBasic439);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal8_tree = (Object) adaptor.create(string_literal8);
                        adaptor.addChild(root_0, string_literal8_tree);
                    }
                    // MathExpr.g:61:11: ( '[' ']' )*
                    loop3:
                    do {
                        int alt3 = 2;
                        int LA3_0 = input.LA(1);

                        if ((LA3_0 == 40)) {
                            alt3 = 1;
                        }


                        switch (alt3) {
                            case 1:
                                // MathExpr.g:61:12: '[' ']'
                            {
                                char_literal9 = (Token) match(input, 40, FOLLOW_40_in_typeBasic442);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal9_tree = (Object) adaptor.create(char_literal9);
                                    adaptor.addChild(root_0, char_literal9_tree);
                                }
                                char_literal10 = (Token) match(input, 41, FOLLOW_41_in_typeBasic444);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal10_tree = (Object) adaptor.create(char_literal10);
                                    adaptor.addChild(root_0, char_literal10_tree);
                                }

                            }
                            break;

                            default:
                                break loop3;
                        }
                    } while (true);


                }
                break;
                case 5:
                    // MathExpr.g:62:2: 'short' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal11 = (Token) match(input, 45, FOLLOW_45_in_typeBasic449);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal11_tree = (Object) adaptor.create(string_literal11);
                        adaptor.addChild(root_0, string_literal11_tree);
                    }
                    // MathExpr.g:62:10: ( '[' ']' )*
                    loop4:
                    do {
                        int alt4 = 2;
                        int LA4_0 = input.LA(1);

                        if ((LA4_0 == 40)) {
                            alt4 = 1;
                        }


                        switch (alt4) {
                            case 1:
                                // MathExpr.g:62:11: '[' ']'
                            {
                                char_literal12 = (Token) match(input, 40, FOLLOW_40_in_typeBasic452);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal12_tree = (Object) adaptor.create(char_literal12);
                                    adaptor.addChild(root_0, char_literal12_tree);
                                }
                                char_literal13 = (Token) match(input, 41, FOLLOW_41_in_typeBasic454);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal13_tree = (Object) adaptor.create(char_literal13);
                                    adaptor.addChild(root_0, char_literal13_tree);
                                }

                            }
                            break;

                            default:
                                break loop4;
                        }
                    } while (true);


                }
                break;
                case 6:
                    // MathExpr.g:63:2: 'long' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal14 = (Token) match(input, 46, FOLLOW_46_in_typeBasic459);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal14_tree = (Object) adaptor.create(string_literal14);
                        adaptor.addChild(root_0, string_literal14_tree);
                    }
                    // MathExpr.g:63:9: ( '[' ']' )*
                    loop5:
                    do {
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);

                        if ((LA5_0 == 40)) {
                            alt5 = 1;
                        }


                        switch (alt5) {
                            case 1:
                                // MathExpr.g:63:10: '[' ']'
                            {
                                char_literal15 = (Token) match(input, 40, FOLLOW_40_in_typeBasic462);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal15_tree = (Object) adaptor.create(char_literal15);
                                    adaptor.addChild(root_0, char_literal15_tree);
                                }
                                char_literal16 = (Token) match(input, 41, FOLLOW_41_in_typeBasic464);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal16_tree = (Object) adaptor.create(char_literal16);
                                    adaptor.addChild(root_0, char_literal16_tree);
                                }

                            }
                            break;

                            default:
                                break loop5;
                        }
                    } while (true);


                }
                break;
                case 7:
                    // MathExpr.g:64:2: 'float' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal17 = (Token) match(input, 47, FOLLOW_47_in_typeBasic469);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal17_tree = (Object) adaptor.create(string_literal17);
                        adaptor.addChild(root_0, string_literal17_tree);
                    }
                    // MathExpr.g:64:10: ( '[' ']' )*
                    loop6:
                    do {
                        int alt6 = 2;
                        int LA6_0 = input.LA(1);

                        if ((LA6_0 == 40)) {
                            alt6 = 1;
                        }


                        switch (alt6) {
                            case 1:
                                // MathExpr.g:64:11: '[' ']'
                            {
                                char_literal18 = (Token) match(input, 40, FOLLOW_40_in_typeBasic472);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal18_tree = (Object) adaptor.create(char_literal18);
                                    adaptor.addChild(root_0, char_literal18_tree);
                                }
                                char_literal19 = (Token) match(input, 41, FOLLOW_41_in_typeBasic474);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal19_tree = (Object) adaptor.create(char_literal19);
                                    adaptor.addChild(root_0, char_literal19_tree);
                                }

                            }
                            break;

                            default:
                                break loop6;
                        }
                    } while (true);


                }
                break;
                case 8:
                    // MathExpr.g:65:2: 'double' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal20 = (Token) match(input, 48, FOLLOW_48_in_typeBasic479);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal20_tree = (Object) adaptor.create(string_literal20);
                        adaptor.addChild(root_0, string_literal20_tree);
                    }
                    // MathExpr.g:65:11: ( '[' ']' )*
                    loop7:
                    do {
                        int alt7 = 2;
                        int LA7_0 = input.LA(1);

                        if ((LA7_0 == 40)) {
                            alt7 = 1;
                        }


                        switch (alt7) {
                            case 1:
                                // MathExpr.g:65:12: '[' ']'
                            {
                                char_literal21 = (Token) match(input, 40, FOLLOW_40_in_typeBasic482);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal21_tree = (Object) adaptor.create(char_literal21);
                                    adaptor.addChild(root_0, char_literal21_tree);
                                }
                                char_literal22 = (Token) match(input, 41, FOLLOW_41_in_typeBasic484);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal22_tree = (Object) adaptor.create(char_literal22);
                                    adaptor.addChild(root_0, char_literal22_tree);
                                }

                            }
                            break;

                            default:
                                break loop7;
                        }
                    } while (true);


                }
                break;
                case 9:
                    // MathExpr.g:66:2: 'signed' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal23 = (Token) match(input, 49, FOLLOW_49_in_typeBasic489);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal23_tree = (Object) adaptor.create(string_literal23);
                        adaptor.addChild(root_0, string_literal23_tree);
                    }
                    // MathExpr.g:66:11: ( '[' ']' )*
                    loop8:
                    do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);

                        if ((LA8_0 == 40)) {
                            alt8 = 1;
                        }


                        switch (alt8) {
                            case 1:
                                // MathExpr.g:66:12: '[' ']'
                            {
                                char_literal24 = (Token) match(input, 40, FOLLOW_40_in_typeBasic492);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal24_tree = (Object) adaptor.create(char_literal24);
                                    adaptor.addChild(root_0, char_literal24_tree);
                                }
                                char_literal25 = (Token) match(input, 41, FOLLOW_41_in_typeBasic494);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal25_tree = (Object) adaptor.create(char_literal25);
                                    adaptor.addChild(root_0, char_literal25_tree);
                                }

                            }
                            break;

                            default:
                                break loop8;
                        }
                    } while (true);


                }
                break;
                case 10:
                    // MathExpr.g:67:2: 'unsigned' ( '[' ']' )*
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal26 = (Token) match(input, 50, FOLLOW_50_in_typeBasic499);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        string_literal26_tree = (Object) adaptor.create(string_literal26);
                        adaptor.addChild(root_0, string_literal26_tree);
                    }
                    // MathExpr.g:67:13: ( '[' ']' )*
                    loop9:
                    do {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);

                        if ((LA9_0 == 40)) {
                            alt9 = 1;
                        }


                        switch (alt9) {
                            case 1:
                                // MathExpr.g:67:14: '[' ']'
                            {
                                char_literal27 = (Token) match(input, 40, FOLLOW_40_in_typeBasic502);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal27_tree = (Object) adaptor.create(char_literal27);
                                    adaptor.addChild(root_0, char_literal27_tree);
                                }
                                char_literal28 = (Token) match(input, 41, FOLLOW_41_in_typeBasic504);
                                if (state.failed) return retval;
                                if (state.backtracking == 0) {
                                    char_literal28_tree = (Object) adaptor.create(char_literal28);
                                    adaptor.addChild(root_0, char_literal28_tree);
                                }

                            }
                            break;

                            default:
                                break loop9;
                        }
                    } while (true);


                }
                break;

            }
            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "type"
    // MathExpr.g:70:1: type : typeBasic -> TYPE[$type0.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.typeBasic_return typeBasic29 = null;


        RewriteRuleSubtreeStream stream_typeBasic = new RewriteRuleSubtreeStream(adaptor, "rule typeBasic");
        try {
            // MathExpr.g:70:5: ( typeBasic -> TYPE[$type0.text] )
            // MathExpr.g:71:3: typeBasic
            {
                pushFollow(FOLLOW_typeBasic_in_type516);
                typeBasic29 = typeBasic();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_typeBasic.add(typeBasic29.getTree());


                // AST REWRITE
                // elements:
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 71:14: -> TYPE[$type0.text]
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(TYPE, $type0.text));

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "term"
    // MathExpr.g:74:1: term : ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' );
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER30 = null;
        Token STRING31 = null;
        Token char_literal34 = null;
        Token char_literal36 = null;
        MathExprParser.lvalue_return lvalue32 = null;

        MathExprParser.functionCall_return functionCall33 = null;

        MathExprParser.logic_return logic35 = null;


        Object NUMBER30_tree = null;
        Object STRING31_tree = null;
        Object char_literal34_tree = null;
        Object char_literal36_tree = null;

        try {
            // MathExpr.g:74:5: ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' )
            int alt11 = 5;
            switch (input.LA(1)) {
                case NUMBER: {
                    alt11 = 1;
                }
                break;
                case STRING: {
                    alt11 = 2;
                }
                break;
                case IDENTIFIER: {
                    int LA11_3 = input.LA(2);

                    if ((LA11_3 == 51)) {
                        alt11 = 4;
                    } else if ((LA11_3 == EOF || (LA11_3 >= DELIMITER && LA11_3 <= DIV) || (LA11_3 >= GE_OP && LA11_3 <= LT) || (LA11_3 >= 40 && LA11_3 <= 41) || (LA11_3 >= 52 && LA11_3 <= 53))) {
                        alt11 = 3;
                    } else {
                        if (state.backtracking > 0) {
                            state.failed = true;
                            return retval;
                        }
                        NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                break;
                case 51: {
                    alt11 = 5;
                }
                break;
                default:
                    if (state.backtracking > 0) {
                        state.failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                    throw nvae;
            }

            switch (alt11) {
                case 1:
                    // MathExpr.g:75:3: NUMBER
                {
                    root_0 = (Object) adaptor.nil();

                    NUMBER30 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_term533);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        NUMBER30_tree = (Object) adaptor.create(NUMBER30);
                        adaptor.addChild(root_0, NUMBER30_tree);
                    }

                }
                break;
                case 2:
                    // MathExpr.g:76:3: STRING
                {
                    root_0 = (Object) adaptor.nil();

                    STRING31 = (Token) match(input, STRING, FOLLOW_STRING_in_term537);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        STRING31_tree = (Object) adaptor.create(STRING31);
                        adaptor.addChild(root_0, STRING31_tree);
                    }

                }
                break;
                case 3:
                    // MathExpr.g:77:3: lvalue
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term541);
                    lvalue32 = lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, lvalue32.getTree());

                }
                break;
                case 4:
                    // MathExpr.g:78:3: functionCall
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_term545);
                    functionCall33 = functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, functionCall33.getTree());

                }
                break;
                case 5:
                    // MathExpr.g:79:3: '(' logic ')'
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal34 = (Token) match(input, 51, FOLLOW_51_in_term549);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term552);
                    logic35 = logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, logic35.getTree());
                    char_literal36 = (Token) match(input, 52, FOLLOW_52_in_term554);
                    if (state.failed) return retval;

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "arguments"
    // MathExpr.g:82:1: arguments : ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) ;
    public final MathExprParser.arguments_return arguments() throws RecognitionException {
        MathExprParser.arguments_return retval = new MathExprParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal38 = null;
        MathExprParser.rvalue_return rvalue37 = null;

        MathExprParser.rvalue_return rvalue39 = null;


        Object char_literal38_tree = null;
        RewriteRuleTokenStream stream_53 = new RewriteRuleTokenStream(adaptor, "token 53");
        RewriteRuleSubtreeStream stream_rvalue = new RewriteRuleSubtreeStream(adaptor, "rule rvalue");
        try {
            // MathExpr.g:82:10: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) )
            // MathExpr.g:83:3: ( rvalue ( ',' rvalue )* )?
            {
                // MathExpr.g:83:3: ( rvalue ( ',' rvalue )* )?
                int alt13 = 2;
                int LA13_0 = input.LA(1);

                if (((LA13_0 >= NUMBER && LA13_0 <= STRING) || LA13_0 == IDENTIFIER || LA13_0 == 51)) {
                    alt13 = 1;
                }
                switch (alt13) {
                    case 1:
                        // MathExpr.g:83:4: rvalue ( ',' rvalue )*
                    {
                        pushFollow(FOLLOW_rvalue_in_arguments567);
                        rvalue37 = rvalue();

                        state._fsp--;
                        if (state.failed) return retval;
                        if (state.backtracking == 0) stream_rvalue.add(rvalue37.getTree());
                        // MathExpr.g:83:11: ( ',' rvalue )*
                        loop12:
                        do {
                            int alt12 = 2;
                            int LA12_0 = input.LA(1);

                            if ((LA12_0 == 53)) {
                                alt12 = 1;
                            }


                            switch (alt12) {
                                case 1:
                                    // MathExpr.g:83:12: ',' rvalue
                                {
                                    char_literal38 = (Token) match(input, 53, FOLLOW_53_in_arguments570);
                                    if (state.failed) return retval;
                                    if (state.backtracking == 0) stream_53.add(char_literal38);

                                    pushFollow(FOLLOW_rvalue_in_arguments572);
                                    rvalue39 = rvalue();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if (state.backtracking == 0) stream_rvalue.add(rvalue39.getTree());

                                }
                                break;

                                default:
                                    break loop12;
                            }
                        } while (true);


                    }
                    break;

                }


                // AST REWRITE
                // elements: rvalue
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 83:28: -> ^( ARGUMENTS ( rvalue )* )
                    {
                        // MathExpr.g:83:32: ^( ARGUMENTS ( rvalue )* )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                            // MathExpr.g:83:44: ( rvalue )*
                            while (stream_rvalue.hasNext()) {
                                adaptor.addChild(root_1, stream_rvalue.nextTree());

                            }
                            stream_rvalue.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "functionCall"
    // MathExpr.g:85:1: functionCall : IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) ;
    public final MathExprParser.functionCall_return functionCall() throws RecognitionException {
        MathExprParser.functionCall_return retval = new MathExprParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER40 = null;
        Token char_literal41 = null;
        Token char_literal43 = null;
        MathExprParser.arguments_return arguments42 = null;


        Object IDENTIFIER40_tree = null;
        Object char_literal41_tree = null;
        Object char_literal43_tree = null;
        RewriteRuleTokenStream stream_51 = new RewriteRuleTokenStream(adaptor, "token 51");
        RewriteRuleTokenStream stream_52 = new RewriteRuleTokenStream(adaptor, "token 52");
        RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(adaptor, "token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arguments = new RewriteRuleSubtreeStream(adaptor, "rule arguments");
        try {
            // MathExpr.g:85:13: ( IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) )
            // MathExpr.g:86:3: IDENTIFIER '(' arguments ')'
            {
                IDENTIFIER40 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_functionCall596);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_IDENTIFIER.add(IDENTIFIER40);

                char_literal41 = (Token) match(input, 51, FOLLOW_51_in_functionCall598);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_51.add(char_literal41);

                pushFollow(FOLLOW_arguments_in_functionCall600);
                arguments42 = arguments();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_arguments.add(arguments42.getTree());
                char_literal43 = (Token) match(input, 52, FOLLOW_52_in_functionCall602);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_52.add(char_literal43);


                // AST REWRITE
                // elements: IDENTIFIER, arguments
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 86:33: -> ^( CALL IDENTIFIER arguments )
                    {
                        // MathExpr.g:86:37: ^( CALL IDENTIFIER arguments )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(CALL, "CALL"), root_1);

                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "arrayIndex0"
    // MathExpr.g:89:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44 = null;

        Object char_literal44_tree = null;
        RewriteRuleTokenStream stream_40 = new RewriteRuleTokenStream(adaptor, "token 40");

        try {
            // MathExpr.g:89:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:90:3: '['
            {
                char_literal44 = (Token) match(input, 40, FOLLOW_40_in_arrayIndex0624);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_40.add(char_literal44);


                // AST REWRITE
                // elements:
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 90:8: -> INDEX[\"[]\"]
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(INDEX, "[]"));

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "lvalue"
    // MathExpr.g:92:1: lvalue : IDENTIFIER ( arrayIndex0 rvalue ']' )* ;
    public final MathExprParser.lvalue_return lvalue() throws RecognitionException {
        MathExprParser.lvalue_return retval = new MathExprParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER45 = null;
        Token char_literal48 = null;
        MathExprParser.arrayIndex0_return arrayIndex046 = null;

        MathExprParser.rvalue_return rvalue47 = null;


        Object IDENTIFIER45_tree = null;
        Object char_literal48_tree = null;

        try {
            // MathExpr.g:92:7: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* )
            // MathExpr.g:93:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
            {
                root_0 = (Object) adaptor.nil();

                IDENTIFIER45 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_lvalue642);
                if (state.failed) return retval;
                if (state.backtracking == 0) {
                    IDENTIFIER45_tree = (Object) adaptor.create(IDENTIFIER45);
                    adaptor.addChild(root_0, IDENTIFIER45_tree);
                }
                // MathExpr.g:93:14: ( arrayIndex0 rvalue ']' )*
                loop14:
                do {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);

                    if ((LA14_0 == 40)) {
                        alt14 = 1;
                    }


                    switch (alt14) {
                        case 1:
                            // MathExpr.g:93:15: arrayIndex0 rvalue ']'
                        {
                            pushFollow(FOLLOW_arrayIndex0_in_lvalue645);
                            arrayIndex046 = arrayIndex0();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0)
                                root_0 = (Object) adaptor.becomeRoot(arrayIndex046.getTree(), root_0);
                            pushFollow(FOLLOW_rvalue_in_lvalue648);
                            rvalue47 = rvalue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, rvalue47.getTree());
                            char_literal48 = (Token) match(input, 41, FOLLOW_41_in_lvalue650);
                            if (state.failed) return retval;

                        }
                        break;

                        default:
                            break loop14;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "rvalue"
    // MathExpr.g:96:1: rvalue : logic ;
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic49 = null;


        try {
            // MathExpr.g:96:7: ( logic )
            // MathExpr.g:97:3: logic
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_logic_in_rvalue664);
                logic49 = logic();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, logic49.getTree());

            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "increment"
    // MathExpr.g:100:1: increment : IDENTIFIER ( '++' | '--' ) ;
    public final MathExprParser.increment_return increment() throws RecognitionException {
        MathExprParser.increment_return retval = new MathExprParser.increment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER50 = null;
        Token set51 = null;

        Object IDENTIFIER50_tree = null;
        Object set51_tree = null;

        try {
            // MathExpr.g:100:10: ( IDENTIFIER ( '++' | '--' ) )
            // MathExpr.g:101:1: IDENTIFIER ( '++' | '--' )
            {
                root_0 = (Object) adaptor.nil();

                IDENTIFIER50 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_increment672);
                if (state.failed) return retval;
                if (state.backtracking == 0) {
                    IDENTIFIER50_tree = (Object) adaptor.create(IDENTIFIER50);
                    adaptor.addChild(root_0, IDENTIFIER50_tree);
                }
                set51 = (Token) input.LT(1);
                if ((input.LA(1) >= 54 && input.LA(1) <= 55)) {
                    input.consume();
                    if (state.backtracking == 0) adaptor.addChild(root_0, (Object) adaptor.create(set51));
                    state.errorRecovery = false;
                    state.failed = false;
                } else {
                    if (state.backtracking > 0) {
                        state.failed = true;
                        return retval;
                    }
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    throw mse;
                }


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "multiplex"
    // MathExpr.g:118:1: multiplex : term ( ( MUL | DIV ) term )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53 = null;
        MathExprParser.term_return term52 = null;

        MathExprParser.term_return term54 = null;


        Object set53_tree = null;

        try {
            // MathExpr.g:118:10: ( term ( ( MUL | DIV ) term )* )
            // MathExpr.g:119:3: term ( ( MUL | DIV ) term )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_term_in_multiplex952);
                term52 = term();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, term52.getTree());
                // MathExpr.g:119:8: ( ( MUL | DIV ) term )*
                loop15:
                do {
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);

                    if (((LA15_0 >= MUL && LA15_0 <= DIV))) {
                        alt15 = 1;
                    }


                    switch (alt15) {
                        case 1:
                            // MathExpr.g:119:9: ( MUL | DIV ) term
                        {
                            set53 = (Token) input.LT(1);
                            set53 = (Token) input.LT(1);
                            if ((input.LA(1) >= MUL && input.LA(1) <= DIV)) {
                                input.consume();
                                if (state.backtracking == 0)
                                    root_0 = (Object) adaptor.becomeRoot((Object) adaptor.create(set53), root_0);
                                state.errorRecovery = false;
                                state.failed = false;
                            } else {
                                if (state.backtracking > 0) {
                                    state.failed = true;
                                    return retval;
                                }
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_term_in_multiplex966);
                            term54 = term();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, term54.getTree());

                        }
                        break;

                        default:
                            break loop15;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "add"
    // MathExpr.g:122:1: add : multiplex ( ( ADD | SUB ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56 = null;
        MathExprParser.multiplex_return multiplex55 = null;

        MathExprParser.multiplex_return multiplex57 = null;


        Object set56_tree = null;

        try {
            // MathExpr.g:122:4: ( multiplex ( ( ADD | SUB ) multiplex )* )
            // MathExpr.g:123:3: multiplex ( ( ADD | SUB ) multiplex )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_multiplex_in_add979);
                multiplex55 = multiplex();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, multiplex55.getTree());
                // MathExpr.g:123:13: ( ( ADD | SUB ) multiplex )*
                loop16:
                do {
                    int alt16 = 2;
                    int LA16_0 = input.LA(1);

                    if (((LA16_0 >= ADD && LA16_0 <= SUB))) {
                        alt16 = 1;
                    }


                    switch (alt16) {
                        case 1:
                            // MathExpr.g:123:14: ( ADD | SUB ) multiplex
                        {
                            set56 = (Token) input.LT(1);
                            set56 = (Token) input.LT(1);
                            if ((input.LA(1) >= ADD && input.LA(1) <= SUB)) {
                                input.consume();
                                if (state.backtracking == 0)
                                    root_0 = (Object) adaptor.becomeRoot((Object) adaptor.create(set56), root_0);
                                state.errorRecovery = false;
                                state.failed = false;
                            } else {
                                if (state.backtracking > 0) {
                                    state.failed = true;
                                    return retval;
                                }
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_multiplex_in_add991);
                            multiplex57 = multiplex();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, multiplex57.getTree());

                        }
                        break;

                        default:
                            break loop16;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "logic"
    // MathExpr.g:126:1: logic : add ( ( EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set59 = null;
        MathExprParser.add_return add58 = null;

        MathExprParser.add_return add60 = null;


        Object set59_tree = null;

        try {
            // MathExpr.g:126:6: ( add ( ( EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP ) add )? )
            // MathExpr.g:127:3: add ( ( EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP ) add )?
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_add_in_logic1004);
                add58 = add();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, add58.getTree());
                // MathExpr.g:127:7: ( ( EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP ) add )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);

                if (((LA17_0 >= GE_OP && LA17_0 <= LT))) {
                    alt17 = 1;
                }
                switch (alt17) {
                    case 1:
                        // MathExpr.g:127:8: ( EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP ) add
                    {
                        set59 = (Token) input.LT(1);
                        set59 = (Token) input.LT(1);
                        if ((input.LA(1) >= GE_OP && input.LA(1) <= LT)) {
                            input.consume();
                            if (state.backtracking == 0)
                                root_0 = (Object) adaptor.becomeRoot((Object) adaptor.create(set59), root_0);
                            state.errorRecovery = false;
                            state.failed = false;
                        } else {
                            if (state.backtracking > 0) {
                                state.failed = true;
                                return retval;
                            }
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }

                        pushFollow(FOLLOW_add_in_logic1032);
                        add60 = add();

                        state._fsp--;
                        if (state.failed) return retval;
                        if (state.backtracking == 0) adaptor.addChild(root_0, add60.getTree());

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "expression"
    // MathExpr.g:130:1: expression : ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER '=' rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );
    public final MathExprParser.expression_return expression() throws RecognitionException {
        MathExprParser.expression_return retval = new MathExprParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN62 = null;
        Token DELIMITER64 = null;
        Token IDENTIFIER66 = null;
        Token DELIMITER68 = null;
        Token RETURN69 = null;
        Token DELIMITER71 = null;
        Token IF72 = null;
        Token char_literal73 = null;
        Token char_literal75 = null;
        Token ELSE77 = null;
        Token FOR79 = null;
        Token char_literal80 = null;
        Token IDENTIFIER81 = null;
        Token char_literal82 = null;
        Token DELIMITER84 = null;
        Token DELIMITER86 = null;
        Token DELIMITER89 = null;
        Token char_literal90 = null;
        Token WHILE92 = null;
        Token char_literal93 = null;
        Token char_literal95 = null;
        Token char_literal97 = null;
        Token char_literal99 = null;
        MathExprParser.lvalue_return lvalue61 = null;

        MathExprParser.rvalue_return rvalue63 = null;

        MathExprParser.type_return type65 = null;

        MathExprParser.functionCall_return functionCall67 = null;

        MathExprParser.rvalue_return rvalue70 = null;

        MathExprParser.rvalue_return rvalue74 = null;

        MathExprParser.expression_return expression76 = null;

        MathExprParser.expression_return expression78 = null;

        MathExprParser.rvalue_return rvalue83 = null;

        MathExprParser.rvalue_return rvalue85 = null;

        MathExprParser.add_return add87 = null;

        MathExprParser.increment_return increment88 = null;

        MathExprParser.expression_return expression91 = null;

        MathExprParser.rvalue_return rvalue94 = null;

        MathExprParser.expression_return expression96 = null;

        MathExprParser.expressionsList_return expressionsList98 = null;


        Object ASSIGN62_tree = null;
        Object DELIMITER64_tree = null;
        Object IDENTIFIER66_tree = null;
        Object DELIMITER68_tree = null;
        Object RETURN69_tree = null;
        Object DELIMITER71_tree = null;
        Object IF72_tree = null;
        Object char_literal73_tree = null;
        Object char_literal75_tree = null;
        Object ELSE77_tree = null;
        Object FOR79_tree = null;
        Object char_literal80_tree = null;
        Object IDENTIFIER81_tree = null;
        Object char_literal82_tree = null;
        Object DELIMITER84_tree = null;
        Object DELIMITER86_tree = null;
        Object DELIMITER89_tree = null;
        Object char_literal90_tree = null;
        Object WHILE92_tree = null;
        Object char_literal93_tree = null;
        Object char_literal95_tree = null;
        Object char_literal97_tree = null;
        Object char_literal99_tree = null;

        try {
            // MathExpr.g:130:11: ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER '=' rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' )
            int alt20 = 8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1:
                    // MathExpr.g:131:3: lvalue ASSIGN rvalue DELIMITER
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expression1046);
                    lvalue61 = lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, lvalue61.getTree());
                    ASSIGN62 = (Token) match(input, ASSIGN, FOLLOW_ASSIGN_in_expression1048);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        ASSIGN62_tree = (Object) adaptor.create(ASSIGN62);
                        root_0 = (Object) adaptor.becomeRoot(ASSIGN62_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression1051);
                    rvalue63 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue63.getTree());
                    DELIMITER64 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1053);
                    if (state.failed) return retval;

                }
                break;
                case 2:
                    // MathExpr.g:132:3: type IDENTIFIER
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_type_in_expression1059);
                    type65 = type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, type65.getTree());
                    IDENTIFIER66 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_expression1061);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        IDENTIFIER66_tree = (Object) adaptor.create(IDENTIFIER66);
                        adaptor.addChild(root_0, IDENTIFIER66_tree);
                    }

                }
                break;
                case 3:
                    // MathExpr.g:133:3: functionCall DELIMITER
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_expression1065);
                    functionCall67 = functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, functionCall67.getTree());
                    DELIMITER68 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1067);
                    if (state.failed) return retval;

                }
                break;
                case 4:
                    // MathExpr.g:134:3: RETURN rvalue DELIMITER
                {
                    root_0 = (Object) adaptor.nil();

                    RETURN69 = (Token) match(input, RETURN, FOLLOW_RETURN_in_expression1073);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        RETURN69_tree = (Object) adaptor.create(RETURN69);
                        root_0 = (Object) adaptor.becomeRoot(RETURN69_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression1076);
                    rvalue70 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue70.getTree());
                    DELIMITER71 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1078);
                    if (state.failed) return retval;

                }
                break;
                case 5:
                    // MathExpr.g:135:3: IF '(' rvalue ')' expression ( ELSE expression )?
                {
                    root_0 = (Object) adaptor.nil();

                    IF72 = (Token) match(input, IF, FOLLOW_IF_in_expression1084);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        IF72_tree = (Object) adaptor.create(IF72);
                        root_0 = (Object) adaptor.becomeRoot(IF72_tree, root_0);
                    }
                    char_literal73 = (Token) match(input, 51, FOLLOW_51_in_expression1087);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1090);
                    rvalue74 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue74.getTree());
                    char_literal75 = (Token) match(input, 52, FOLLOW_52_in_expression1092);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1095);
                    expression76 = expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, expression76.getTree());
                    // MathExpr.g:135:35: ( ELSE expression )?
                    int alt18 = 2;
                    int LA18_0 = input.LA(1);

                    if ((LA18_0 == ELSE)) {
                        int LA18_1 = input.LA(2);

                        if ((synpred41_MathExpr())) {
                            alt18 = 1;
                        }
                    }
                    switch (alt18) {
                        case 1:
                            // MathExpr.g:135:36: ELSE expression
                        {
                            ELSE77 = (Token) match(input, ELSE, FOLLOW_ELSE_in_expression1098);
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_expression1101);
                            expression78 = expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, expression78.getTree());

                        }
                        break;

                    }


                }
                break;
                case 6:
                    // MathExpr.g:136:3: FOR '(' IDENTIFIER '=' rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression
                {
                    root_0 = (Object) adaptor.nil();

                    FOR79 = (Token) match(input, FOR, FOLLOW_FOR_in_expression1107);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        FOR79_tree = (Object) adaptor.create(FOR79);
                        root_0 = (Object) adaptor.becomeRoot(FOR79_tree, root_0);
                    }
                    char_literal80 = (Token) match(input, 51, FOLLOW_51_in_expression1110);
                    if (state.failed) return retval;
                    IDENTIFIER81 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_expression1113);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        IDENTIFIER81_tree = (Object) adaptor.create(IDENTIFIER81);
                        adaptor.addChild(root_0, IDENTIFIER81_tree);
                    }
                    char_literal82 = (Token) match(input, ASSIGN, FOLLOW_ASSIGN_in_expression1115);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        char_literal82_tree = (Object) adaptor.create(char_literal82);
                        adaptor.addChild(root_0, char_literal82_tree);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression1117);
                    rvalue83 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue83.getTree());
                    DELIMITER84 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1119);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1122);
                    rvalue85 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue85.getTree());
                    DELIMITER86 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1124);
                    if (state.failed) return retval;
                    // MathExpr.g:136:64: ( add | increment )?
                    int alt19 = 3;
                    int LA19_0 = input.LA(1);

                    if (((LA19_0 >= NUMBER && LA19_0 <= STRING) || LA19_0 == 51)) {
                        alt19 = 1;
                    } else if ((LA19_0 == IDENTIFIER)) {
                        int LA19_2 = input.LA(2);

                        if (((LA19_2 >= DELIMITER && LA19_2 <= DIV) || LA19_2 == 40 || LA19_2 == 51)) {
                            alt19 = 1;
                        } else if (((LA19_2 >= 54 && LA19_2 <= 55))) {
                            alt19 = 2;
                        }
                    }
                    switch (alt19) {
                        case 1:
                            // MathExpr.g:136:65: add
                        {
                            pushFollow(FOLLOW_add_in_expression1128);
                            add87 = add();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, add87.getTree());

                        }
                        break;
                        case 2:
                            // MathExpr.g:136:69: increment
                        {
                            pushFollow(FOLLOW_increment_in_expression1130);
                            increment88 = increment();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, increment88.getTree());

                        }
                        break;

                    }

                    DELIMITER89 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expression1134);
                    if (state.failed) return retval;
                    char_literal90 = (Token) match(input, 52, FOLLOW_52_in_expression1137);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        char_literal90_tree = (Object) adaptor.create(char_literal90);
                        adaptor.addChild(root_0, char_literal90_tree);
                    }
                    pushFollow(FOLLOW_expression_in_expression1139);
                    expression91 = expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, expression91.getTree());

                }
                break;
                case 7:
                    // MathExpr.g:137:3: WHILE '(' rvalue ')' expression
                {
                    root_0 = (Object) adaptor.nil();

                    WHILE92 = (Token) match(input, WHILE, FOLLOW_WHILE_in_expression1143);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) {
                        WHILE92_tree = (Object) adaptor.create(WHILE92);
                        root_0 = (Object) adaptor.becomeRoot(WHILE92_tree, root_0);
                    }
                    char_literal93 = (Token) match(input, 51, FOLLOW_51_in_expression1146);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1149);
                    rvalue94 = rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, rvalue94.getTree());
                    char_literal95 = (Token) match(input, 52, FOLLOW_52_in_expression1151);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1154);
                    expression96 = expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, expression96.getTree());

                }
                break;
                case 8:
                    // MathExpr.g:138:3: '{' expressionsList '}'
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal97 = (Token) match(input, 56, FOLLOW_56_in_expression1158);
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList_in_expression1161);
                    expressionsList98 = expressionsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (state.backtracking == 0) adaptor.addChild(root_0, expressionsList98.getTree());
                    char_literal99 = (Token) match(input, 57, FOLLOW_57_in_expression1163);
                    if (state.failed) return retval;

                }
                break;

            }
            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "expressionsList"
    // MathExpr.g:141:1: expressionsList : ( expression ( DELIMITER )* )* -> ^( BLOCK ( expression )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELIMITER101 = null;
        MathExprParser.expression_return expression100 = null;


        Object DELIMITER101_tree = null;
        RewriteRuleTokenStream stream_DELIMITER = new RewriteRuleTokenStream(adaptor, "token DELIMITER");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(adaptor, "rule expression");
        try {
            // MathExpr.g:141:16: ( ( expression ( DELIMITER )* )* -> ^( BLOCK ( expression )* ) )
            // MathExpr.g:142:3: ( expression ( DELIMITER )* )*
            {
                // MathExpr.g:142:3: ( expression ( DELIMITER )* )*
                loop22:
                do {
                    int alt22 = 2;
                    int LA22_0 = input.LA(1);

                    if (((LA22_0 >= RETURN && LA22_0 <= IF) || LA22_0 == WHILE || LA22_0 == IDENTIFIER || (LA22_0 >= FOR && LA22_0 <= 39) || (LA22_0 >= 42 && LA22_0 <= 50) || LA22_0 == 56)) {
                        alt22 = 1;
                    }


                    switch (alt22) {
                        case 1:
                            // MathExpr.g:142:4: expression ( DELIMITER )*
                        {
                            pushFollow(FOLLOW_expression_in_expressionsList1176);
                            expression100 = expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) stream_expression.add(expression100.getTree());
                            // MathExpr.g:142:15: ( DELIMITER )*
                            loop21:
                            do {
                                int alt21 = 2;
                                int LA21_0 = input.LA(1);

                                if ((LA21_0 == DELIMITER)) {
                                    alt21 = 1;
                                }


                                switch (alt21) {
                                    case 1:
                                        // MathExpr.g:0:0: DELIMITER
                                    {
                                        DELIMITER101 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_expressionsList1178);
                                        if (state.failed) return retval;
                                        if (state.backtracking == 0) stream_DELIMITER.add(DELIMITER101);


                                    }
                                    break;

                                    default:
                                        break loop21;
                                }
                            } while (true);


                        }
                        break;

                        default:
                            break loop22;
                    }
                } while (true);


                // AST REWRITE
                // elements: expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 142:29: -> ^( BLOCK ( expression )* )
                    {
                        // MathExpr.g:142:33: ^( BLOCK ( expression )* )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(BLOCK, "BLOCK"), root_1);

                            // MathExpr.g:142:41: ( expression )*
                            while (stream_expression.hasNext()) {
                                adaptor.addChild(root_1, stream_expression.nextTree());

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "argumentDeclaration"
    // MathExpr.g:145:1: argumentDeclaration : type IDENTIFIER ;
    public final MathExprParser.argumentDeclaration_return argumentDeclaration() throws RecognitionException {
        MathExprParser.argumentDeclaration_return retval = new MathExprParser.argumentDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER103 = null;
        MathExprParser.type_return type102 = null;


        Object IDENTIFIER103_tree = null;

        try {
            // MathExpr.g:145:20: ( type IDENTIFIER )
            // MathExpr.g:146:3: type IDENTIFIER
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_type_in_argumentDeclaration1202);
                type102 = type();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, type102.getTree());
                IDENTIFIER103 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_argumentDeclaration1204);
                if (state.failed) return retval;
                if (state.backtracking == 0) {
                    IDENTIFIER103_tree = (Object) adaptor.create(IDENTIFIER103);
                    root_0 = (Object) adaptor.becomeRoot(IDENTIFIER103_tree, root_0);
                }

            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "argumentsDeclaration"
    // MathExpr.g:149:1: argumentsDeclaration : ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) ;
    public final MathExprParser.argumentsDeclaration_return argumentsDeclaration() throws RecognitionException {
        MathExprParser.argumentsDeclaration_return retval = new MathExprParser.argumentsDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal105 = null;
        MathExprParser.argumentDeclaration_return argumentDeclaration104 = null;

        MathExprParser.argumentDeclaration_return argumentDeclaration106 = null;


        Object char_literal105_tree = null;
        RewriteRuleTokenStream stream_53 = new RewriteRuleTokenStream(adaptor, "token 53");
        RewriteRuleSubtreeStream stream_argumentDeclaration = new RewriteRuleSubtreeStream(adaptor, "rule argumentDeclaration");
        try {
            // MathExpr.g:149:21: ( ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) )
            // MathExpr.g:150:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            {
                // MathExpr.g:150:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
                int alt24 = 2;
                int LA24_0 = input.LA(1);

                if ((LA24_0 == 39 || (LA24_0 >= 42 && LA24_0 <= 50))) {
                    alt24 = 1;
                }
                switch (alt24) {
                    case 1:
                        // MathExpr.g:150:4: argumentDeclaration ( ',' argumentDeclaration )*
                    {
                        pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration1216);
                        argumentDeclaration104 = argumentDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;
                        if (state.backtracking == 0) stream_argumentDeclaration.add(argumentDeclaration104.getTree());
                        // MathExpr.g:150:24: ( ',' argumentDeclaration )*
                        loop23:
                        do {
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);

                            if ((LA23_0 == 53)) {
                                alt23 = 1;
                            }


                            switch (alt23) {
                                case 1:
                                    // MathExpr.g:150:25: ',' argumentDeclaration
                                {
                                    char_literal105 = (Token) match(input, 53, FOLLOW_53_in_argumentsDeclaration1219);
                                    if (state.failed) return retval;
                                    if (state.backtracking == 0) stream_53.add(char_literal105);

                                    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration1221);
                                    argumentDeclaration106 = argumentDeclaration();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if (state.backtracking == 0)
                                        stream_argumentDeclaration.add(argumentDeclaration106.getTree());

                                }
                                break;

                                default:
                                    break loop23;
                            }
                        } while (true);


                    }
                    break;

                }


                // AST REWRITE
                // elements: argumentDeclaration
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 150:54: -> ^( SEMANTIC ( argumentDeclaration )* )
                    {
                        // MathExpr.g:150:58: ^( SEMANTIC ( argumentDeclaration )* )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(SEMANTIC, "SEMANTIC"), root_1);

                            // MathExpr.g:150:69: ( argumentDeclaration )*
                            while (stream_argumentDeclaration.hasNext()) {
                                adaptor.addChild(root_1, stream_argumentDeclaration.nextTree());

                            }
                            stream_argumentDeclaration.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "functionDeclaration"
    // MathExpr.g:153:1: functionDeclaration : type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) ;
    public final MathExprParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        MathExprParser.functionDeclaration_return retval = new MathExprParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER108 = null;
        Token char_literal109 = null;
        Token char_literal111 = null;
        Token char_literal112 = null;
        Token char_literal114 = null;
        Token DELIMITER115 = null;
        MathExprParser.type_return type107 = null;

        MathExprParser.argumentsDeclaration_return argumentsDeclaration110 = null;

        MathExprParser.expressionsList_return expressionsList113 = null;


        Object IDENTIFIER108_tree = null;
        Object char_literal109_tree = null;
        Object char_literal111_tree = null;
        Object char_literal112_tree = null;
        Object char_literal114_tree = null;
        Object DELIMITER115_tree = null;
        RewriteRuleTokenStream stream_57 = new RewriteRuleTokenStream(adaptor, "token 57");
        RewriteRuleTokenStream stream_56 = new RewriteRuleTokenStream(adaptor, "token 56");
        RewriteRuleTokenStream stream_51 = new RewriteRuleTokenStream(adaptor, "token 51");
        RewriteRuleTokenStream stream_52 = new RewriteRuleTokenStream(adaptor, "token 52");
        RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(adaptor, "token IDENTIFIER");
        RewriteRuleTokenStream stream_DELIMITER = new RewriteRuleTokenStream(adaptor, "token DELIMITER");
        RewriteRuleSubtreeStream stream_argumentsDeclaration = new RewriteRuleSubtreeStream(adaptor, "rule argumentsDeclaration");
        RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
        RewriteRuleSubtreeStream stream_expressionsList = new RewriteRuleSubtreeStream(adaptor, "rule expressionsList");
        try {
            // MathExpr.g:153:20: ( type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) )
            // MathExpr.g:154:3: type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )*
            {
                pushFollow(FOLLOW_type_in_functionDeclaration1246);
                type107 = type();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_type.add(type107.getTree());
                IDENTIFIER108 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_functionDeclaration1248);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_IDENTIFIER.add(IDENTIFIER108);

                char_literal109 = (Token) match(input, 51, FOLLOW_51_in_functionDeclaration1250);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_51.add(char_literal109);

                pushFollow(FOLLOW_argumentsDeclaration_in_functionDeclaration1252);
                argumentsDeclaration110 = argumentsDeclaration();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_argumentsDeclaration.add(argumentsDeclaration110.getTree());
                char_literal111 = (Token) match(input, 52, FOLLOW_52_in_functionDeclaration1254);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_52.add(char_literal111);

                char_literal112 = (Token) match(input, 56, FOLLOW_56_in_functionDeclaration1256);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_56.add(char_literal112);

                pushFollow(FOLLOW_expressionsList_in_functionDeclaration1258);
                expressionsList113 = expressionsList();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_expressionsList.add(expressionsList113.getTree());
                char_literal114 = (Token) match(input, 57, FOLLOW_57_in_functionDeclaration1260);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_57.add(char_literal114);

                // MathExpr.g:154:72: ( DELIMITER )*
                loop25:
                do {
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);

                    if ((LA25_0 == DELIMITER)) {
                        alt25 = 1;
                    }


                    switch (alt25) {
                        case 1:
                            // MathExpr.g:0:0: DELIMITER
                        {
                            DELIMITER115 = (Token) match(input, DELIMITER, FOLLOW_DELIMITER_in_functionDeclaration1262);
                            if (state.failed) return retval;
                            if (state.backtracking == 0) stream_DELIMITER.add(DELIMITER115);


                        }
                        break;

                        default:
                            break loop25;
                    }
                } while (true);


                // AST REWRITE
                // elements: type, expressionsList, argumentsDeclaration, IDENTIFIER
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 155:5: -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
                    {
                        // MathExpr.g:155:9: ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(FUNCTION, "FUNCTION"), root_1);

                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                            adaptor.addChild(root_1, stream_type.nextTree());
                            adaptor.addChild(root_1, stream_argumentsDeclaration.nextTree());
                            adaptor.addChild(root_1, stream_expressionsList.nextTree());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "importDeclaration"
    // MathExpr.g:158:1: importDeclaration : '#include' (s1= STRING ) -> ^( INCLUDE $s1) ;
    public final MathExprParser.importDeclaration_return importDeclaration() throws RecognitionException {
        MathExprParser.importDeclaration_return retval = new MathExprParser.importDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s1 = null;
        Token string_literal116 = null;

        Object s1_tree = null;
        Object string_literal116_tree = null;
        RewriteRuleTokenStream stream_58 = new RewriteRuleTokenStream(adaptor, "token 58");
        RewriteRuleTokenStream stream_STRING = new RewriteRuleTokenStream(adaptor, "token STRING");

        try {
            // MathExpr.g:158:18: ( '#include' (s1= STRING ) -> ^( INCLUDE $s1) )
            // MathExpr.g:159:3: '#include' (s1= STRING )
            {
                string_literal116 = (Token) match(input, 58, FOLLOW_58_in_importDeclaration1293);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_58.add(string_literal116);

                // MathExpr.g:159:14: (s1= STRING )
                // MathExpr.g:159:15: s1= STRING
                {
                    s1 = (Token) match(input, STRING, FOLLOW_STRING_in_importDeclaration1298);
                    if (state.failed) return retval;
                    if (state.backtracking == 0) stream_STRING.add(s1);


                }


                // AST REWRITE
                // elements: s1
                // token labels: s1
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_s1 = new RewriteRuleTokenStream(adaptor, "token s1", s1);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 159:26: -> ^( INCLUDE $s1)
                    {
                        // MathExpr.g:159:29: ^( INCLUDE $s1)
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(INCLUDE, "INCLUDE"), root_1);

                            adaptor.addChild(root_1, stream_s1.nextNode());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "declaration"
    // MathExpr.g:162:1: declaration : ( functionDeclaration | importDeclaration ) ;
    public final MathExprParser.declaration_return declaration() throws RecognitionException {
        MathExprParser.declaration_return retval = new MathExprParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.functionDeclaration_return functionDeclaration117 = null;

        MathExprParser.importDeclaration_return importDeclaration118 = null;


        try {
            // MathExpr.g:162:12: ( ( functionDeclaration | importDeclaration ) )
            // MathExpr.g:163:3: ( functionDeclaration | importDeclaration )
            {
                root_0 = (Object) adaptor.nil();

                // MathExpr.g:163:3: ( functionDeclaration | importDeclaration )
                int alt26 = 2;
                int LA26_0 = input.LA(1);

                if ((LA26_0 == 39 || (LA26_0 >= 42 && LA26_0 <= 50))) {
                    alt26 = 1;
                } else if ((LA26_0 == 58)) {
                    alt26 = 2;
                } else {
                    if (state.backtracking > 0) {
                        state.failed = true;
                        return retval;
                    }
                    NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                    throw nvae;
                }
                switch (alt26) {
                    case 1:
                        // MathExpr.g:163:5: functionDeclaration
                    {
                        pushFollow(FOLLOW_functionDeclaration_in_declaration1321);
                        functionDeclaration117 = functionDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;
                        if (state.backtracking == 0) adaptor.addChild(root_0, functionDeclaration117.getTree());

                    }
                    break;
                    case 2:
                        // MathExpr.g:163:27: importDeclaration
                    {
                        pushFollow(FOLLOW_importDeclaration_in_declaration1325);
                        importDeclaration118 = importDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;
                        if (state.backtracking == 0) adaptor.addChild(root_0, importDeclaration118.getTree());

                    }
                    break;

                }


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "declarations"
    // MathExpr.g:166:1: declarations : ( declaration )* ;
    public final MathExprParser.declarations_return declarations() throws RecognitionException {
        MathExprParser.declarations_return retval = new MathExprParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declaration_return declaration119 = null;


        try {
            // MathExpr.g:166:13: ( ( declaration )* )
            // MathExpr.g:167:3: ( declaration )*
            {
                root_0 = (Object) adaptor.nil();

                // MathExpr.g:167:3: ( declaration )*
                loop27:
                do {
                    int alt27 = 2;
                    int LA27_0 = input.LA(1);

                    if ((LA27_0 == 39 || (LA27_0 >= 42 && LA27_0 <= 50) || LA27_0 == 58)) {
                        alt27 = 1;
                    }


                    switch (alt27) {
                        case 1:
                            // MathExpr.g:0:0: declaration
                        {
                            pushFollow(FOLLOW_declaration_in_declarations1338);
                            declaration119 = declaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (state.backtracking == 0) adaptor.addChild(root_0, declaration119.getTree());

                        }
                        break;

                        default:
                            break loop27;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "code"
    // MathExpr.g:170:1: code : declarations ;
    public final MathExprParser.code_return code() throws RecognitionException {
        MathExprParser.code_return retval = new MathExprParser.code_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declarations_return declarations120 = null;


        try {
            // MathExpr.g:170:5: ( declarations )
            // MathExpr.g:171:3: declarations
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_declarations_in_code1350);
                declarations120 = declarations();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) adaptor.addChild(root_0, declarations120.getTree());

            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start "start"
    // MathExpr.g:174:1: start : code EOF -> ^( PROGRAM code ) ;
    public final MathExprParser.start_return start() throws RecognitionException {
        MathExprParser.start_return retval = new MathExprParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF122 = null;
        MathExprParser.code_return code121 = null;


        Object EOF122_tree = null;
        RewriteRuleTokenStream stream_EOF = new RewriteRuleTokenStream(adaptor, "token EOF");
        RewriteRuleSubtreeStream stream_code = new RewriteRuleSubtreeStream(adaptor, "rule code");
        try {
            // MathExpr.g:174:6: ( code EOF -> ^( PROGRAM code ) )
            // MathExpr.g:175:3: code EOF
            {
                pushFollow(FOLLOW_code_in_start1361);
                code121 = code();

                state._fsp--;
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_code.add(code121.getTree());
                EOF122 = (Token) match(input, EOF, FOLLOW_EOF_in_start1365);
                if (state.failed) return retval;
                if (state.backtracking == 0) stream_EOF.add(EOF122);


                // AST REWRITE
                // elements: code
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                if (state.backtracking == 0) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);

                    root_0 = (Object) adaptor.nil();
                    // 177:5: -> ^( PROGRAM code )
                    {
                        // MathExpr.g:177:9: ^( PROGRAM code )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(PROGRAM, "PROGRAM"), root_1);

                            adaptor.addChild(root_1, stream_code.nextTree());

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                }
            }

            retval.stop = input.LT(-1);

            if (state.backtracking == 0) {

                retval.tree = (Object) adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        } finally {
        }
        return retval;
    }

    // $ANTLR start synpred41_MathExpr
    public final void synpred41_MathExpr_fragment() throws RecognitionException {
        // MathExpr.g:135:36: ( ELSE expression )
        // MathExpr.g:135:36: ELSE expression
        {
            match(input, ELSE, FOLLOW_ELSE_in_synpred41_MathExpr1098);
            if (state.failed) return;
            pushFollow(FOLLOW_expression_in_synpred41_MathExpr1101);
            expression();

            state._fsp--;
            if (state.failed) return;

        }
    }

    public final boolean synpred41_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed = false;
        return success;
    }

    public static class typeBasic_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class type_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class term_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class arrayIndex0_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class rvalue_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class increment_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class multiplex_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class add_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class logic_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class expressionsList_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class argumentDeclaration_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class argumentsDeclaration_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class importDeclaration_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class code_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    public static class start_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }

        public String getDescription() {
            return "130:1: expression : ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER '=' rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );";
        }
    }

}