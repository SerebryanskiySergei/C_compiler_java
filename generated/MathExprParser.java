// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-11-10 17:13:40
package generated;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "FOR", "WHILE", "PROGRAM", "INCLUDE", "TYPE", "SEMANTIC", "FUNCTION", "ARGUMENTS", "CALL", "BLOCK", "INDEX", "WS", "DIGIT", "LETTER", "NUMBER", "STRING", "INCLUDE_STRING", "IDENTIFIER", "DELIMITER", "ADD", "SUB", "MUL", "DIV", "REM", "AND", "OR", "ASSIGN", "COMPARE", "'int'", "'['", "']'", "'double'", "'char'", "'void'", "'('", "')'", "','", "'++'", "'--'", "'{'", "'}'", "'#include'"
    };
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


        public MathExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MathExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MathExprParser.tokenNames; }
    public String getGrammarFileName() { return "MathExpr.g"; }


    public static class typeBasic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBasic"
    // MathExpr.g:58:1: typeBasic : ( 'int' ( '[' ']' )* | 'double' ( '[' ']' )* | 'char' ( '[' ']' )* | 'void' );
    public final MathExprParser.typeBasic_return typeBasic() throws RecognitionException {
        MathExprParser.typeBasic_return retval = new MathExprParser.typeBasic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        Token string_literal4=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token string_literal7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token string_literal10=null;

        Object string_literal1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object string_literal7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;

        try {
            // MathExpr.g:58:10: ( 'int' ( '[' ']' )* | 'double' ( '[' ']' )* | 'char' ( '[' ']' )* | 'void' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // MathExpr.g:59:1: 'int' ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal1=(Token)match(input,35,FOLLOW_35_in_typeBasic432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal1_tree = (Object)adaptor.create(string_literal1);
                    adaptor.addChild(root_0, string_literal1_tree);
                    }
                    // MathExpr.g:59:7: ( '[' ']' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==36) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // MathExpr.g:59:8: '[' ']'
                    	    {
                    	    char_literal2=(Token)match(input,36,FOLLOW_36_in_typeBasic435); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal2_tree = (Object)adaptor.create(char_literal2);
                    	    adaptor.addChild(root_0, char_literal2_tree);
                    	    }
                    	    char_literal3=(Token)match(input,37,FOLLOW_37_in_typeBasic437); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal3_tree = (Object)adaptor.create(char_literal3);
                    	    adaptor.addChild(root_0, char_literal3_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // MathExpr.g:60:2: 'double' ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal4=(Token)match(input,38,FOLLOW_38_in_typeBasic442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal4_tree = (Object)adaptor.create(string_literal4);
                    adaptor.addChild(root_0, string_literal4_tree);
                    }
                    // MathExpr.g:60:11: ( '[' ']' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==36) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // MathExpr.g:60:12: '[' ']'
                    	    {
                    	    char_literal5=(Token)match(input,36,FOLLOW_36_in_typeBasic445); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal5_tree = (Object)adaptor.create(char_literal5);
                    	    adaptor.addChild(root_0, char_literal5_tree);
                    	    }
                    	    char_literal6=(Token)match(input,37,FOLLOW_37_in_typeBasic447); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal6_tree = (Object)adaptor.create(char_literal6);
                    	    adaptor.addChild(root_0, char_literal6_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // MathExpr.g:61:2: 'char' ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal7=(Token)match(input,39,FOLLOW_39_in_typeBasic452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal7_tree = (Object)adaptor.create(string_literal7);
                    adaptor.addChild(root_0, string_literal7_tree);
                    }
                    // MathExpr.g:61:9: ( '[' ']' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==36) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:61:10: '[' ']'
                    	    {
                    	    char_literal8=(Token)match(input,36,FOLLOW_36_in_typeBasic455); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal8_tree = (Object)adaptor.create(char_literal8);
                    	    adaptor.addChild(root_0, char_literal8_tree);
                    	    }
                    	    char_literal9=(Token)match(input,37,FOLLOW_37_in_typeBasic457); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal9_tree = (Object)adaptor.create(char_literal9);
                    	    adaptor.addChild(root_0, char_literal9_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // MathExpr.g:62:2: 'void'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal10=(Token)match(input,40,FOLLOW_40_in_typeBasic462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal10_tree = (Object)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeBasic"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // MathExpr.g:65:1: type : typeBasic -> TYPE[$typeBasic.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.typeBasic_return typeBasic11 = null;


        RewriteRuleSubtreeStream stream_typeBasic=new RewriteRuleSubtreeStream(adaptor,"rule typeBasic");
        try {
            // MathExpr.g:65:5: ( typeBasic -> TYPE[$typeBasic.text] )
            // MathExpr.g:66:3: typeBasic
            {
            pushFollow(FOLLOW_typeBasic_in_type472);
            typeBasic11=typeBasic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeBasic.add(typeBasic11.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:14: -> TYPE[$typeBasic.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(TYPE, (typeBasic11!=null?input.toString(typeBasic11.start,typeBasic11.stop):null)));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // MathExpr.g:69:1: term : ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' );
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER12=null;
        Token STRING13=null;
        Token char_literal16=null;
        Token char_literal18=null;
        MathExprParser.lvalue_return lvalue14 = null;

        MathExprParser.functionCall_return functionCall15 = null;

        MathExprParser.logic_return logic17 = null;


        Object NUMBER12_tree=null;
        Object STRING13_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;

        try {
            // MathExpr.g:69:5: ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt5=1;
                }
                break;
            case STRING:
                {
                alt5=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==41) ) {
                    alt5=4;
                }
                else if ( (LA5_3==EOF||(LA5_3>=DELIMITER && LA5_3<=DIV)||LA5_3==COMPARE||(LA5_3>=36 && LA5_3<=37)||(LA5_3>=42 && LA5_3<=43)) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // MathExpr.g:70:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER12=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER12_tree = (Object)adaptor.create(NUMBER12);
                    adaptor.addChild(root_0, NUMBER12_tree);
                    }

                    }
                    break;
                case 2 :
                    // MathExpr.g:71:3: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_term493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING13_tree = (Object)adaptor.create(STRING13);
                    adaptor.addChild(root_0, STRING13_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:72:3: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term497);
                    lvalue14=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue14.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:73:3: functionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_term501);
                    functionCall15=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall15.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:74:3: '(' logic ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal16=(Token)match(input,41,FOLLOW_41_in_term505); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term508);
                    logic17=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic17.getTree());
                    char_literal18=(Token)match(input,42,FOLLOW_42_in_term510); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // MathExpr.g:77:1: arguments : ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) ;
    public final MathExprParser.arguments_return arguments() throws RecognitionException {
        MathExprParser.arguments_return retval = new MathExprParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        MathExprParser.rvalue_return rvalue19 = null;

        MathExprParser.rvalue_return rvalue21 = null;


        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        try {
            // MathExpr.g:77:10: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) )
            // MathExpr.g:78:3: ( rvalue ( ',' rvalue )* )?
            {
            // MathExpr.g:78:3: ( rvalue ( ',' rvalue )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NUMBER && LA7_0<=STRING)||LA7_0==IDENTIFIER||LA7_0==41) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // MathExpr.g:78:4: rvalue ( ',' rvalue )*
                    {
                    pushFollow(FOLLOW_rvalue_in_arguments523);
                    rvalue19=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rvalue.add(rvalue19.getTree());
                    // MathExpr.g:78:11: ( ',' rvalue )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==43) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // MathExpr.g:78:12: ',' rvalue
                    	    {
                    	    char_literal20=(Token)match(input,43,FOLLOW_43_in_arguments526); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_43.add(char_literal20);

                    	    pushFollow(FOLLOW_rvalue_in_arguments528);
                    	    rvalue21=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rvalue.add(rvalue21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:28: -> ^( ARGUMENTS ( rvalue )* )
            {
                // MathExpr.g:78:32: ^( ARGUMENTS ( rvalue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // MathExpr.g:78:44: ( rvalue )*
                while ( stream_rvalue.hasNext() ) {
                    adaptor.addChild(root_1, stream_rvalue.nextTree());

                }
                stream_rvalue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // MathExpr.g:80:1: functionCall : IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) ;
    public final MathExprParser.functionCall_return functionCall() throws RecognitionException {
        MathExprParser.functionCall_return retval = new MathExprParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        MathExprParser.arguments_return arguments24 = null;


        Object IDENTIFIER22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // MathExpr.g:80:13: ( IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) )
            // MathExpr.g:81:3: IDENTIFIER '(' arguments ')'
            {
            IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionCall552); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER22);

            char_literal23=(Token)match(input,41,FOLLOW_41_in_functionCall554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal23);

            pushFollow(FOLLOW_arguments_in_functionCall556);
            arguments24=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments24.getTree());
            char_literal25=(Token)match(input,42,FOLLOW_42_in_functionCall558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal25);



            // AST REWRITE
            // elements: IDENTIFIER, arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:33: -> ^( CALL IDENTIFIER arguments )
            {
                // MathExpr.g:81:37: ^( CALL IDENTIFIER arguments )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_arguments.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class arrayIndex0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayIndex0"
    // MathExpr.g:84:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;

        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");

        try {
            // MathExpr.g:84:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:85:3: '['
            {
            char_literal26=(Token)match(input,36,FOLLOW_36_in_arrayIndex0580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal26);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:8: -> INDEX[\"[]\"]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INDEX, "[]"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayIndex0"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // MathExpr.g:87:1: lvalue : IDENTIFIER ( arrayIndex0 rvalue ']' )* ;
    public final MathExprParser.lvalue_return lvalue() throws RecognitionException {
        MathExprParser.lvalue_return retval = new MathExprParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER27=null;
        Token char_literal30=null;
        MathExprParser.arrayIndex0_return arrayIndex028 = null;

        MathExprParser.rvalue_return rvalue29 = null;


        Object IDENTIFIER27_tree=null;
        Object char_literal30_tree=null;

        try {
            // MathExpr.g:87:7: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* )
            // MathExpr.g:88:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue598); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
            adaptor.addChild(root_0, IDENTIFIER27_tree);
            }
            // MathExpr.g:88:14: ( arrayIndex0 rvalue ']' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:88:15: arrayIndex0 rvalue ']'
            	    {
            	    pushFollow(FOLLOW_arrayIndex0_in_lvalue601);
            	    arrayIndex028=arrayIndex0();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(arrayIndex028.getTree(), root_0);
            	    pushFollow(FOLLOW_rvalue_in_lvalue604);
            	    rvalue29=rvalue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue29.getTree());
            	    char_literal30=(Token)match(input,37,FOLLOW_37_in_lvalue606); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class rvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rvalue"
    // MathExpr.g:91:1: rvalue : logic ;
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic31 = null;



        try {
            // MathExpr.g:91:7: ( logic )
            // MathExpr.g:92:3: logic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logic_in_rvalue620);
            logic31=logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logic31.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rvalue"

    public static class increment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "increment"
    // MathExpr.g:95:1: increment : IDENTIFIER ( '++' | '--' ) ;
    public final MathExprParser.increment_return increment() throws RecognitionException {
        MathExprParser.increment_return retval = new MathExprParser.increment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER32=null;
        Token set33=null;

        Object IDENTIFIER32_tree=null;
        Object set33_tree=null;

        try {
            // MathExpr.g:95:10: ( IDENTIFIER ( '++' | '--' ) )
            // MathExpr.g:96:1: IDENTIFIER ( '++' | '--' )
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_increment628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
            adaptor.addChild(root_0, IDENTIFIER32_tree);
            }
            set33=(Token)input.LT(1);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set33));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "increment"

    public static class multiplex_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplex"
    // MathExpr.g:109:1: multiplex : term ( ( MUL | DIV ) term )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;
        MathExprParser.term_return term34 = null;

        MathExprParser.term_return term36 = null;


        Object set35_tree=null;

        try {
            // MathExpr.g:109:10: ( term ( ( MUL | DIV ) term )* )
            // MathExpr.g:110:3: term ( ( MUL | DIV ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_multiplex883);
            term34=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term34.getTree());
            // MathExpr.g:110:8: ( ( MUL | DIV ) term )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=MUL && LA9_0<=DIV)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MathExpr.g:110:9: ( MUL | DIV ) term
            	    {
            	    set35=(Token)input.LT(1);
            	    set35=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set35), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_multiplex897);
            	    term36=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term36.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplex"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // MathExpr.g:113:1: add : multiplex ( ( ADD | SUB ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set38=null;
        MathExprParser.multiplex_return multiplex37 = null;

        MathExprParser.multiplex_return multiplex39 = null;


        Object set38_tree=null;

        try {
            // MathExpr.g:113:4: ( multiplex ( ( ADD | SUB ) multiplex )* )
            // MathExpr.g:114:3: multiplex ( ( ADD | SUB ) multiplex )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplex_in_add910);
            multiplex37=multiplex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex37.getTree());
            // MathExpr.g:114:13: ( ( ADD | SUB ) multiplex )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=ADD && LA10_0<=SUB)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MathExpr.g:114:14: ( ADD | SUB ) multiplex
            	    {
            	    set38=(Token)input.LT(1);
            	    set38=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set38), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplex_in_add922);
            	    multiplex39=multiplex();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logic"
    // MathExpr.g:117:1: logic : add ( ( COMPARE ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE41=null;
        MathExprParser.add_return add40 = null;

        MathExprParser.add_return add42 = null;


        Object COMPARE41_tree=null;

        try {
            // MathExpr.g:117:6: ( add ( ( COMPARE ) add )? )
            // MathExpr.g:118:3: add ( ( COMPARE ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_logic935);
            add40=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add40.getTree());
            // MathExpr.g:118:7: ( ( COMPARE ) add )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==COMPARE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // MathExpr.g:118:8: ( COMPARE ) add
                    {
                    // MathExpr.g:118:8: ( COMPARE )
                    // MathExpr.g:118:9: COMPARE
                    {
                    COMPARE41=(Token)match(input,COMPARE,FOLLOW_COMPARE_in_logic939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMPARE41_tree = (Object)adaptor.create(COMPARE41);
                    adaptor.addChild(root_0, COMPARE41_tree);
                    }

                    }

                    pushFollow(FOLLOW_add_in_logic943);
                    add42=add();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add42.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logic"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // MathExpr.g:121:1: expression : ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER ASSIGN rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );
    public final MathExprParser.expression_return expression() throws RecognitionException {
        MathExprParser.expression_return retval = new MathExprParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN44=null;
        Token DELIMITER46=null;
        Token IDENTIFIER48=null;
        Token ASSIGN49=null;
        Token DELIMITER51=null;
        Token IDENTIFIER53=null;
        Token DELIMITER55=null;
        Token RETURN56=null;
        Token DELIMITER58=null;
        Token IF59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token ELSE64=null;
        Token FOR66=null;
        Token char_literal67=null;
        Token IDENTIFIER68=null;
        Token ASSIGN69=null;
        Token DELIMITER71=null;
        Token DELIMITER73=null;
        Token DELIMITER76=null;
        Token char_literal77=null;
        Token WHILE79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        MathExprParser.lvalue_return lvalue43 = null;

        MathExprParser.rvalue_return rvalue45 = null;

        MathExprParser.type_return type47 = null;

        MathExprParser.rvalue_return rvalue50 = null;

        MathExprParser.type_return type52 = null;

        MathExprParser.functionCall_return functionCall54 = null;

        MathExprParser.rvalue_return rvalue57 = null;

        MathExprParser.rvalue_return rvalue61 = null;

        MathExprParser.expression_return expression63 = null;

        MathExprParser.expression_return expression65 = null;

        MathExprParser.rvalue_return rvalue70 = null;

        MathExprParser.rvalue_return rvalue72 = null;

        MathExprParser.add_return add74 = null;

        MathExprParser.increment_return increment75 = null;

        MathExprParser.expression_return expression78 = null;

        MathExprParser.rvalue_return rvalue81 = null;

        MathExprParser.expression_return expression83 = null;

        MathExprParser.expressionsList_return expressionsList85 = null;


        Object ASSIGN44_tree=null;
        Object DELIMITER46_tree=null;
        Object IDENTIFIER48_tree=null;
        Object ASSIGN49_tree=null;
        Object DELIMITER51_tree=null;
        Object IDENTIFIER53_tree=null;
        Object DELIMITER55_tree=null;
        Object RETURN56_tree=null;
        Object DELIMITER58_tree=null;
        Object IF59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object ELSE64_tree=null;
        Object FOR66_tree=null;
        Object char_literal67_tree=null;
        Object IDENTIFIER68_tree=null;
        Object ASSIGN69_tree=null;
        Object DELIMITER71_tree=null;
        Object DELIMITER73_tree=null;
        Object DELIMITER76_tree=null;
        Object char_literal77_tree=null;
        Object WHILE79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;

        try {
            // MathExpr.g:121:11: ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER ASSIGN rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' )
            int alt14=9;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // MathExpr.g:122:3: lvalue ASSIGN rvalue DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expression957);
                    lvalue43=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue43.getTree());
                    ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expression959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN44_tree = (Object)adaptor.create(ASSIGN44);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN44_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression962);
                    rvalue45=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue45.getTree());
                    DELIMITER46=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression964); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:123:3: type IDENTIFIER ASSIGN rvalue DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_expression970);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENTIFIER48=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER48_tree = (Object)adaptor.create(IDENTIFIER48);
                    adaptor.addChild(root_0, IDENTIFIER48_tree);
                    }
                    ASSIGN49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expression975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN49_tree = (Object)adaptor.create(ASSIGN49);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN49_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression978);
                    rvalue50=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue50.getTree());
                    DELIMITER51=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression980); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // MathExpr.g:124:3: type IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_expression985);
                    type52=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type52.getTree());
                    IDENTIFIER53=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER53_tree = (Object)adaptor.create(IDENTIFIER53);
                    adaptor.addChild(root_0, IDENTIFIER53_tree);
                    }

                    }
                    break;
                case 4 :
                    // MathExpr.g:125:3: functionCall DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_expression991);
                    functionCall54=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall54.getTree());
                    DELIMITER55=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression993); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // MathExpr.g:126:3: RETURN rvalue DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN56=(Token)match(input,RETURN,FOLLOW_RETURN_in_expression999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN56_tree = (Object)adaptor.create(RETURN56);
                    root_0 = (Object)adaptor.becomeRoot(RETURN56_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression1002);
                    rvalue57=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue57.getTree());
                    DELIMITER58=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression1004); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // MathExpr.g:127:3: IF '(' rvalue ')' expression ( ELSE expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF59=(Token)match(input,IF,FOLLOW_IF_in_expression1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF59_tree = (Object)adaptor.create(IF59);
                    root_0 = (Object)adaptor.becomeRoot(IF59_tree, root_0);
                    }
                    char_literal60=(Token)match(input,41,FOLLOW_41_in_expression1013); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1016);
                    rvalue61=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue61.getTree());
                    char_literal62=(Token)match(input,42,FOLLOW_42_in_expression1018); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1021);
                    expression63=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression63.getTree());
                    // MathExpr.g:127:35: ( ELSE expression )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ELSE) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred25_MathExpr()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // MathExpr.g:127:36: ELSE expression
                            {
                            ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression1024); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_expression1027);
                            expression65=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // MathExpr.g:128:3: FOR '(' IDENTIFIER ASSIGN rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression
                    {
                    root_0 = (Object)adaptor.nil();

                    FOR66=(Token)match(input,FOR,FOLLOW_FOR_in_expression1033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR66_tree = (Object)adaptor.create(FOR66);
                    root_0 = (Object)adaptor.becomeRoot(FOR66_tree, root_0);
                    }
                    char_literal67=(Token)match(input,41,FOLLOW_41_in_expression1036); if (state.failed) return retval;
                    IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER68_tree = (Object)adaptor.create(IDENTIFIER68);
                    adaptor.addChild(root_0, IDENTIFIER68_tree);
                    }
                    ASSIGN69=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expression1041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN69_tree = (Object)adaptor.create(ASSIGN69);
                    adaptor.addChild(root_0, ASSIGN69_tree);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression1043);
                    rvalue70=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue70.getTree());
                    DELIMITER71=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression1045); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1048);
                    rvalue72=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue72.getTree());
                    DELIMITER73=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression1050); if (state.failed) return retval;
                    // MathExpr.g:128:67: ( add | increment )?
                    int alt13=3;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=NUMBER && LA13_0<=STRING)||LA13_0==41) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==IDENTIFIER) ) {
                        int LA13_2 = input.LA(2);

                        if ( ((LA13_2>=DELIMITER && LA13_2<=DIV)||LA13_2==36||LA13_2==41) ) {
                            alt13=1;
                        }
                        else if ( ((LA13_2>=44 && LA13_2<=45)) ) {
                            alt13=2;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // MathExpr.g:128:68: add
                            {
                            pushFollow(FOLLOW_add_in_expression1054);
                            add74=add();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, add74.getTree());

                            }
                            break;
                        case 2 :
                            // MathExpr.g:128:72: increment
                            {
                            pushFollow(FOLLOW_increment_in_expression1056);
                            increment75=increment();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, increment75.getTree());

                            }
                            break;

                    }

                    DELIMITER76=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression1060); if (state.failed) return retval;
                    char_literal77=(Token)match(input,42,FOLLOW_42_in_expression1063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    pushFollow(FOLLOW_expression_in_expression1065);
                    expression78=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression78.getTree());

                    }
                    break;
                case 8 :
                    // MathExpr.g:129:3: WHILE '(' rvalue ')' expression
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE79=(Token)match(input,WHILE,FOLLOW_WHILE_in_expression1069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE79_tree = (Object)adaptor.create(WHILE79);
                    root_0 = (Object)adaptor.becomeRoot(WHILE79_tree, root_0);
                    }
                    char_literal80=(Token)match(input,41,FOLLOW_41_in_expression1072); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression1075);
                    rvalue81=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue81.getTree());
                    char_literal82=(Token)match(input,42,FOLLOW_42_in_expression1077); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1080);
                    expression83=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression83.getTree());

                    }
                    break;
                case 9 :
                    // MathExpr.g:130:3: '{' expressionsList '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal84=(Token)match(input,46,FOLLOW_46_in_expression1084); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList_in_expression1087);
                    expressionsList85=expressionsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList85.getTree());
                    char_literal86=(Token)match(input,47,FOLLOW_47_in_expression1089); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionsList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionsList"
    // MathExpr.g:133:1: expressionsList : ( expression ( DELIMITER )* )* -> ^( BLOCK ( expression )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELIMITER88=null;
        MathExprParser.expression_return expression87 = null;


        Object DELIMITER88_tree=null;
        RewriteRuleTokenStream stream_DELIMITER=new RewriteRuleTokenStream(adaptor,"token DELIMITER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // MathExpr.g:133:16: ( ( expression ( DELIMITER )* )* -> ^( BLOCK ( expression )* ) )
            // MathExpr.g:134:3: ( expression ( DELIMITER )* )*
            {
            // MathExpr.g:134:3: ( expression ( DELIMITER )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RETURN && LA16_0<=IF)||(LA16_0>=FOR && LA16_0<=WHILE)||LA16_0==IDENTIFIER||LA16_0==35||(LA16_0>=38 && LA16_0<=40)||LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MathExpr.g:134:4: expression ( DELIMITER )*
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionsList1102);
            	    expression87=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression87.getTree());
            	    // MathExpr.g:134:15: ( DELIMITER )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==DELIMITER) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: DELIMITER
            	    	    {
            	    	    DELIMITER88=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expressionsList1104); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_DELIMITER.add(DELIMITER88);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:29: -> ^( BLOCK ( expression )* )
            {
                // MathExpr.g:134:33: ^( BLOCK ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:134:41: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionsList"

    public static class argumentDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentDeclaration"
    // MathExpr.g:137:1: argumentDeclaration : type IDENTIFIER ;
    public final MathExprParser.argumentDeclaration_return argumentDeclaration() throws RecognitionException {
        MathExprParser.argumentDeclaration_return retval = new MathExprParser.argumentDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER90=null;
        MathExprParser.type_return type89 = null;


        Object IDENTIFIER90_tree=null;

        try {
            // MathExpr.g:137:20: ( type IDENTIFIER )
            // MathExpr.g:138:3: type IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_argumentDeclaration1128);
            type89=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type89.getTree());
            IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argumentDeclaration1130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER90_tree = (Object)adaptor.create(IDENTIFIER90);
            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER90_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentDeclaration"

    public static class argumentsDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsDeclaration"
    // MathExpr.g:141:1: argumentsDeclaration : ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) ;
    public final MathExprParser.argumentsDeclaration_return argumentsDeclaration() throws RecognitionException {
        MathExprParser.argumentsDeclaration_return retval = new MathExprParser.argumentsDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        MathExprParser.argumentDeclaration_return argumentDeclaration91 = null;

        MathExprParser.argumentDeclaration_return argumentDeclaration93 = null;


        Object char_literal92_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_argumentDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentDeclaration");
        try {
            // MathExpr.g:141:21: ( ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) )
            // MathExpr.g:142:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            {
            // MathExpr.g:142:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35||(LA18_0>=38 && LA18_0<=40)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // MathExpr.g:142:4: argumentDeclaration ( ',' argumentDeclaration )*
                    {
                    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration1142);
                    argumentDeclaration91=argumentDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentDeclaration.add(argumentDeclaration91.getTree());
                    // MathExpr.g:142:24: ( ',' argumentDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==43) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // MathExpr.g:142:25: ',' argumentDeclaration
                    	    {
                    	    char_literal92=(Token)match(input,43,FOLLOW_43_in_argumentsDeclaration1145); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_43.add(char_literal92);

                    	    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration1147);
                    	    argumentDeclaration93=argumentDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argumentDeclaration.add(argumentDeclaration93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:54: -> ^( SEMANTIC ( argumentDeclaration )* )
            {
                // MathExpr.g:142:58: ^( SEMANTIC ( argumentDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEMANTIC, "SEMANTIC"), root_1);

                // MathExpr.g:142:69: ( argumentDeclaration )*
                while ( stream_argumentDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentDeclaration.nextTree());

                }
                stream_argumentDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentsDeclaration"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // MathExpr.g:145:1: functionDeclaration : type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) ;
    public final MathExprParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        MathExprParser.functionDeclaration_return retval = new MathExprParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token DELIMITER102=null;
        MathExprParser.type_return type94 = null;

        MathExprParser.argumentsDeclaration_return argumentsDeclaration97 = null;

        MathExprParser.expressionsList_return expressionsList100 = null;


        Object IDENTIFIER95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object DELIMITER102_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_DELIMITER=new RewriteRuleTokenStream(adaptor,"token DELIMITER");
        RewriteRuleSubtreeStream stream_expressionsList=new RewriteRuleSubtreeStream(adaptor,"rule expressionsList");
        RewriteRuleSubtreeStream stream_argumentsDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDeclaration");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // MathExpr.g:145:20: ( type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) )
            // MathExpr.g:146:3: type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )*
            {
            pushFollow(FOLLOW_type_in_functionDeclaration1172);
            type94=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type94.getTree());
            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionDeclaration1174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);

            char_literal96=(Token)match(input,41,FOLLOW_41_in_functionDeclaration1176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal96);

            pushFollow(FOLLOW_argumentsDeclaration_in_functionDeclaration1178);
            argumentsDeclaration97=argumentsDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDeclaration.add(argumentsDeclaration97.getTree());
            char_literal98=(Token)match(input,42,FOLLOW_42_in_functionDeclaration1180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal98);

            char_literal99=(Token)match(input,46,FOLLOW_46_in_functionDeclaration1182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal99);

            pushFollow(FOLLOW_expressionsList_in_functionDeclaration1184);
            expressionsList100=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionsList.add(expressionsList100.getTree());
            char_literal101=(Token)match(input,47,FOLLOW_47_in_functionDeclaration1186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal101);

            // MathExpr.g:146:72: ( DELIMITER )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DELIMITER) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MathExpr.g:0:0: DELIMITER
            	    {
            	    DELIMITER102=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_functionDeclaration1188); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DELIMITER.add(DELIMITER102);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: argumentsDeclaration, IDENTIFIER, expressionsList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:5: -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
            {
                // MathExpr.g:147:9: ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_argumentsDeclaration.nextTree());
                adaptor.addChild(root_1, stream_expressionsList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class importDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importDeclaration"
    // MathExpr.g:150:1: importDeclaration : '#include' (s1= STRING ) -> ^( INCLUDE $s1) ;
    public final MathExprParser.importDeclaration_return importDeclaration() throws RecognitionException {
        MathExprParser.importDeclaration_return retval = new MathExprParser.importDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s1=null;
        Token string_literal103=null;

        Object s1_tree=null;
        Object string_literal103_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // MathExpr.g:150:18: ( '#include' (s1= STRING ) -> ^( INCLUDE $s1) )
            // MathExpr.g:151:3: '#include' (s1= STRING )
            {
            string_literal103=(Token)match(input,48,FOLLOW_48_in_importDeclaration1219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal103);

            // MathExpr.g:151:14: (s1= STRING )
            // MathExpr.g:151:15: s1= STRING
            {
            s1=(Token)match(input,STRING,FOLLOW_STRING_in_importDeclaration1224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(s1);


            }



            // AST REWRITE
            // elements: s1
            // token labels: s1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s1=new RewriteRuleTokenStream(adaptor,"token s1",s1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:26: -> ^( INCLUDE $s1)
            {
                // MathExpr.g:151:29: ^( INCLUDE $s1)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLUDE, "INCLUDE"), root_1);

                adaptor.addChild(root_1, stream_s1.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // MathExpr.g:154:1: declaration : ( functionDeclaration | importDeclaration ) ;
    public final MathExprParser.declaration_return declaration() throws RecognitionException {
        MathExprParser.declaration_return retval = new MathExprParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.functionDeclaration_return functionDeclaration104 = null;

        MathExprParser.importDeclaration_return importDeclaration105 = null;



        try {
            // MathExpr.g:154:12: ( ( functionDeclaration | importDeclaration ) )
            // MathExpr.g:155:3: ( functionDeclaration | importDeclaration )
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:155:3: ( functionDeclaration | importDeclaration )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35||(LA20_0>=38 && LA20_0<=40)) ) {
                alt20=1;
            }
            else if ( (LA20_0==48) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // MathExpr.g:155:5: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_declaration1247);
                    functionDeclaration104=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration104.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:155:27: importDeclaration
                    {
                    pushFollow(FOLLOW_importDeclaration_in_declaration1251);
                    importDeclaration105=importDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration105.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // MathExpr.g:158:1: declarations : ( declaration )* ;
    public final MathExprParser.declarations_return declarations() throws RecognitionException {
        MathExprParser.declarations_return retval = new MathExprParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declaration_return declaration106 = null;



        try {
            // MathExpr.g:158:13: ( ( declaration )* )
            // MathExpr.g:159:3: ( declaration )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:159:3: ( declaration )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35||(LA21_0>=38 && LA21_0<=40)||LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // MathExpr.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_declarations1264);
            	    declaration106=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration106.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "code"
    // MathExpr.g:162:1: code : declarations ;
    public final MathExprParser.code_return code() throws RecognitionException {
        MathExprParser.code_return retval = new MathExprParser.code_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declarations_return declarations107 = null;



        try {
            // MathExpr.g:162:5: ( declarations )
            // MathExpr.g:163:3: declarations
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_code1276);
            declarations107=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations107.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "code"

    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // MathExpr.g:166:1: start : code EOF -> ^( PROGRAM code ) ;
    public final MathExprParser.start_return start() throws RecognitionException {
        MathExprParser.start_return retval = new MathExprParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF109=null;
        MathExprParser.code_return code108 = null;


        Object EOF109_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_code=new RewriteRuleSubtreeStream(adaptor,"rule code");
        try {
            // MathExpr.g:166:6: ( code EOF -> ^( PROGRAM code ) )
            // MathExpr.g:167:3: code EOF
            {
            pushFollow(FOLLOW_code_in_start1287);
            code108=code();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_code.add(code108.getTree());
            EOF109=(Token)match(input,EOF,FOLLOW_EOF_in_start1291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF109);



            // AST REWRITE
            // elements: code
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:5: -> ^( PROGRAM code )
            {
                // MathExpr.g:169:9: ^( PROGRAM code )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_code.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    // $ANTLR start synpred25_MathExpr
    public final void synpred25_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:127:36: ( ELSE expression )
        // MathExpr.g:127:36: ELSE expression
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred25_MathExpr1024); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred25_MathExpr1027);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_MathExpr

    // Delegated rules

    public final boolean synpred25_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\26\uffff";
    static final String DFA14_eofS =
        "\16\uffff\1\23\7\uffff";
    static final String DFA14_minS =
        "\1\4\1\41\4\30\7\uffff\1\45\1\4\2\45\1\30\2\uffff\2\30";
    static final String DFA14_maxS =
        "\1\56\1\51\3\44\1\30\7\uffff\1\45\1\57\2\45\1\44\2\uffff\2\44";
    static final String DFA14_acceptS =
        "\6\uffff\1\5\1\6\1\7\1\10\1\11\1\4\1\1\5\uffff\1\2\1\3\2\uffff";
    static final String DFA14_specialS =
        "\26\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\1\uffff\1\10\1\11\17\uffff\1\1\12\uffff\1\2\2\uffff"+
            "\1\3\1\4\1\5\5\uffff\1\12",
            "\1\14\2\uffff\1\14\4\uffff\1\13",
            "\1\16\13\uffff\1\15",
            "\1\16\13\uffff\1\17",
            "\1\16\13\uffff\1\20",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\5\23\17\uffff\2\23\7\uffff\1\22\1\uffff\1\23\2\uffff\3\23"+
            "\5\uffff\2\23",
            "\1\24",
            "\1\25",
            "\1\16\13\uffff\1\15",
            "",
            "",
            "\1\16\13\uffff\1\17",
            "\1\16\13\uffff\1\20"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "121:1: expression : ( lvalue ASSIGN rvalue DELIMITER | type IDENTIFIER ASSIGN rvalue DELIMITER | type IDENTIFIER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | FOR '(' IDENTIFIER ASSIGN rvalue DELIMITER rvalue DELIMITER ( add | increment )? DELIMITER ')' expression | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );";
        }
    }
 

    public static final BitSet FOLLOW_35_in_typeBasic432 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_typeBasic435 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_typeBasic437 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38_in_typeBasic442 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_typeBasic445 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_typeBasic447 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_39_in_typeBasic452 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_typeBasic455 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_typeBasic457 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_40_in_typeBasic462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBasic_in_type472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_term501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_term505 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_logic_in_term508 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_term510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rvalue_in_arguments523 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_arguments526 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_arguments528 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionCall552 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionCall554 = new BitSet(new long[]{0x0000060001600000L});
    public static final BitSet FOLLOW_arguments_in_functionCall556 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionCall558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_arrayIndex0580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue598 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue601 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_lvalue604 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_lvalue606 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_logic_in_rvalue620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_increment628 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_set_in_increment630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_multiplex883 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_multiplex886 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_term_in_multiplex897 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_multiplex_in_add910 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_set_in_add913 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_multiplex_in_add922 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_add_in_logic935 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMPARE_in_logic939 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_add_in_logic943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expression957 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expression959 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_expression970 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression973 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expression975 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression978 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_expression985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression991 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expression999 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression1002 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression1010 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_expression1013 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression1016 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expression1018 = new BitSet(new long[]{0x000041C8010001B0L});
    public static final BitSet FOLLOW_expression_in_expression1021 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expression1024 = new BitSet(new long[]{0x000041C8010001B0L});
    public static final BitSet FOLLOW_expression_in_expression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_expression1033 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_expression1036 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expression1041 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression1043 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1045 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression1048 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1050 = new BitSet(new long[]{0x0000020003600000L});
    public static final BitSet FOLLOW_add_in_expression1054 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_increment_in_expression1056 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression1060 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expression1063 = new BitSet(new long[]{0x000041C8010001B0L});
    public static final BitSet FOLLOW_expression_in_expression1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expression1069 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_expression1072 = new BitSet(new long[]{0x0000020001600000L});
    public static final BitSet FOLLOW_rvalue_in_expression1075 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expression1077 = new BitSet(new long[]{0x000041C8010001B0L});
    public static final BitSet FOLLOW_expression_in_expression1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_expression1084 = new BitSet(new long[]{0x0000C1C8010001B0L});
    public static final BitSet FOLLOW_expressionsList_in_expression1087 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_expression1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionsList1102 = new BitSet(new long[]{0x000041C8030001B2L});
    public static final BitSet FOLLOW_DELIMITER_in_expressionsList1104 = new BitSet(new long[]{0x000041C8030001B2L});
    public static final BitSet FOLLOW_type_in_argumentDeclaration1128 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration1142 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_argumentsDeclaration1145 = new BitSet(new long[]{0x000001C800000000L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration1147 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration1172 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration1174 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionDeclaration1176 = new BitSet(new long[]{0x000005C800000000L});
    public static final BitSet FOLLOW_argumentsDeclaration_in_functionDeclaration1178 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionDeclaration1180 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_functionDeclaration1182 = new BitSet(new long[]{0x0000C1C8010001B0L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclaration1184 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_functionDeclaration1186 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DELIMITER_in_functionDeclaration1188 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_48_in_importDeclaration1219 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_importDeclaration1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_declaration1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDeclaration_in_declaration1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations1264 = new BitSet(new long[]{0x000101C800000002L});
    public static final BitSet FOLLOW_declarations_in_code1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_start1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred25_MathExpr1024 = new BitSet(new long[]{0x000041C8010001B0L});
    public static final BitSet FOLLOW_expression_in_synpred25_MathExpr1027 = new BitSet(new long[]{0x0000000000000002L});

}