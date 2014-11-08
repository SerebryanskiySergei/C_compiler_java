// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-10-12 22:46:43
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "WHILE", "PROGRAM", "INCLUDE", "TYPE", "SEMANTIC", "FUNCTION", "ARGUMENTS", "CALL", "BLOCK", "INDEX", "WS", "DIGIT", "LETTER", "NUMBER", "STRING", "INCLUDE_STRING", "IDENTIFIER", "DELIMITER", "'['", "']'", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "'{'", "'}'", "'#include'"
    };
    public static final int FUNCTION=12;
    public static final int INCLUDE_STRING=22;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int WHILE=7;
    public static final int T__25=25;
    public static final int LETTER=19;
    public static final int EOF=-1;
    public static final int IF=5;
    public static final int TYPE=10;
    public static final int INDEX=16;
    public static final int IDENTIFIER=23;
    public static final int INCLUDE=9;
    public static final int RETURN=4;
    public static final int DIGIT=18;
    public static final int SEMANTIC=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int ARGUMENTS=13;
    public static final int ELSE=6;
    public static final int NUMBER=20;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=17;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BLOCK=15;
    public static final int PROGRAM=8;
    public static final int CALL=14;
    public static final int DELIMITER=24;
    public static final int STRING=21;

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


    public static class type0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type0"
    // MathExpr.g:58:1: type0 : IDENTIFIER ( '[' ']' )* ;
    public final MathExprParser.type0_return type0() throws RecognitionException {
        MathExprParser.type0_return retval = new MathExprParser.type0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER1=null;
        Token char_literal2=null;
        Token char_literal3=null;

        Object IDENTIFIER1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;

        try {
            // MathExpr.g:58:6: ( IDENTIFIER ( '[' ']' )* )
            // MathExpr.g:59:3: IDENTIFIER ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type0419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER1_tree = (Object)adaptor.create(IDENTIFIER1);
            adaptor.addChild(root_0, IDENTIFIER1_tree);
            }
            // MathExpr.g:59:14: ( '[' ']' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:59:15: '[' ']'
            	    {
            	    char_literal2=(Token)match(input,25,FOLLOW_25_in_type0422); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal2_tree = (Object)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);
            	    }
            	    char_literal3=(Token)match(input,26,FOLLOW_26_in_type0424); if (state.failed) return retval;
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
    // $ANTLR end "type0"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // MathExpr.g:61:1: type : type0 -> TYPE[$type0.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.type0_return type04 = null;


        RewriteRuleSubtreeStream stream_type0=new RewriteRuleSubtreeStream(adaptor,"rule type0");
        try {
            // MathExpr.g:61:5: ( type0 -> TYPE[$type0.text] )
            // MathExpr.g:62:3: type0
            {
            pushFollow(FOLLOW_type0_in_type435);
            type04=type0();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type0.add(type04.getTree());


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
            // 62:10: -> TYPE[$type0.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(TYPE, (type04!=null?input.toString(type04.start,type04.stop):null)));

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
    // MathExpr.g:65:1: term : ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' );
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER5=null;
        Token STRING6=null;
        Token char_literal9=null;
        Token char_literal11=null;
        MathExprParser.lvalue_return lvalue7 = null;

        MathExprParser.functionCall_return functionCall8 = null;

        MathExprParser.logic_return logic10 = null;


        Object NUMBER5_tree=null;
        Object STRING6_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try {
            // MathExpr.g:65:5: ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt2=1;
                }
                break;
            case STRING:
                {
                alt2=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==27) ) {
                    alt2=4;
                }
                else if ( (LA2_3==EOF||(LA2_3>=DELIMITER && LA2_3<=26)||(LA2_3>=28 && LA2_3<=39)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // MathExpr.g:66:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER5_tree = (Object)adaptor.create(NUMBER5);
                    adaptor.addChild(root_0, NUMBER5_tree);
                    }

                    }
                    break;
                case 2 :
                    // MathExpr.g:67:3: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_term456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING6_tree = (Object)adaptor.create(STRING6);
                    adaptor.addChild(root_0, STRING6_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:68:3: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term460);
                    lvalue7=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue7.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:69:3: functionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_term464);
                    functionCall8=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall8.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:70:3: '(' logic ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,27,FOLLOW_27_in_term468); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term471);
                    logic10=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic10.getTree());
                    char_literal11=(Token)match(input,28,FOLLOW_28_in_term473); if (state.failed) return retval;

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
    // MathExpr.g:73:1: arguments : ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) ;
    public final MathExprParser.arguments_return arguments() throws RecognitionException {
        MathExprParser.arguments_return retval = new MathExprParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        MathExprParser.rvalue_return rvalue12 = null;

        MathExprParser.rvalue_return rvalue14 = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        try {
            // MathExpr.g:73:10: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) )
            // MathExpr.g:74:3: ( rvalue ( ',' rvalue )* )?
            {
            // MathExpr.g:74:3: ( rvalue ( ',' rvalue )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=NUMBER && LA4_0<=STRING)||LA4_0==IDENTIFIER||LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:74:4: rvalue ( ',' rvalue )*
                    {
                    pushFollow(FOLLOW_rvalue_in_arguments486);
                    rvalue12=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rvalue.add(rvalue12.getTree());
                    // MathExpr.g:74:11: ( ',' rvalue )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:74:12: ',' rvalue
                    	    {
                    	    char_literal13=(Token)match(input,29,FOLLOW_29_in_arguments489); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal13);

                    	    pushFollow(FOLLOW_rvalue_in_arguments491);
                    	    rvalue14=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rvalue.add(rvalue14.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
            // 74:28: -> ^( ARGUMENTS ( rvalue )* )
            {
                // MathExpr.g:74:32: ^( ARGUMENTS ( rvalue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // MathExpr.g:74:44: ( rvalue )*
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
    // MathExpr.g:76:1: functionCall : IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) ;
    public final MathExprParser.functionCall_return functionCall() throws RecognitionException {
        MathExprParser.functionCall_return retval = new MathExprParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        MathExprParser.arguments_return arguments17 = null;


        Object IDENTIFIER15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // MathExpr.g:76:13: ( IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER arguments ) )
            // MathExpr.g:77:3: IDENTIFIER '(' arguments ')'
            {
            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionCall515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);

            char_literal16=(Token)match(input,27,FOLLOW_27_in_functionCall517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal16);

            pushFollow(FOLLOW_arguments_in_functionCall519);
            arguments17=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments17.getTree());
            char_literal18=(Token)match(input,28,FOLLOW_28_in_functionCall521); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal18);



            // AST REWRITE
            // elements: arguments, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:33: -> ^( CALL IDENTIFIER arguments )
            {
                // MathExpr.g:77:37: ^( CALL IDENTIFIER arguments )
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
    // MathExpr.g:80:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;

        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");

        try {
            // MathExpr.g:80:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:81:3: '['
            {
            char_literal19=(Token)match(input,25,FOLLOW_25_in_arrayIndex0543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal19);



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
            // 81:8: -> INDEX[\"[]\"]
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
    // MathExpr.g:83:1: lvalue : ( IDENTIFIER ( arrayIndex0 rvalue ']' )* | IDENTIFIER );
    public final MathExprParser.lvalue_return lvalue() throws RecognitionException {
        MathExprParser.lvalue_return retval = new MathExprParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER20=null;
        Token char_literal23=null;
        Token IDENTIFIER24=null;
        MathExprParser.arrayIndex0_return arrayIndex021 = null;

        MathExprParser.rvalue_return rvalue22 = null;


        Object IDENTIFIER20_tree=null;
        Object char_literal23_tree=null;
        Object IDENTIFIER24_tree=null;

        try {
            // MathExpr.g:83:7: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* | IDENTIFIER )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred9_MathExpr()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // MathExpr.g:84:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER20_tree = (Object)adaptor.create(IDENTIFIER20);
                    adaptor.addChild(root_0, IDENTIFIER20_tree);
                    }
                    // MathExpr.g:84:14: ( arrayIndex0 rvalue ']' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MathExpr.g:84:15: arrayIndex0 rvalue ']'
                    	    {
                    	    pushFollow(FOLLOW_arrayIndex0_in_lvalue564);
                    	    arrayIndex021=arrayIndex0();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(arrayIndex021.getTree(), root_0);
                    	    pushFollow(FOLLOW_rvalue_in_lvalue567);
                    	    rvalue22=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue22.getTree());
                    	    char_literal23=(Token)match(input,26,FOLLOW_26_in_lvalue569); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // MathExpr.g:85:3: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
                    adaptor.addChild(root_0, IDENTIFIER24_tree);
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
    // $ANTLR end "lvalue"

    public static class rvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rvalue"
    // MathExpr.g:88:1: rvalue : logic ;
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic25 = null;



        try {
            // MathExpr.g:88:7: ( logic )
            // MathExpr.g:89:3: logic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logic_in_rvalue587);
            logic25=logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logic25.getTree());

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

    public static class multiplex_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplex"
    // MathExpr.g:92:1: multiplex : term ( ( '*' | '/' ) term )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;
        MathExprParser.term_return term26 = null;

        MathExprParser.term_return term28 = null;


        Object set27_tree=null;

        try {
            // MathExpr.g:92:10: ( term ( ( '*' | '/' ) term )* )
            // MathExpr.g:93:3: term ( ( '*' | '/' ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_multiplex598);
            term26=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());
            // MathExpr.g:93:8: ( ( '*' | '/' ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=30 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MathExpr.g:93:9: ( '*' | '/' ) term
            	    {
            	    set27=(Token)input.LT(1);
            	    set27=(Token)input.LT(1);
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set27), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_multiplex612);
            	    term28=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // MathExpr.g:96:1: add : multiplex ( ( '+' | '-' ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;
        MathExprParser.multiplex_return multiplex29 = null;

        MathExprParser.multiplex_return multiplex31 = null;


        Object set30_tree=null;

        try {
            // MathExpr.g:96:4: ( multiplex ( ( '+' | '-' ) multiplex )* )
            // MathExpr.g:97:3: multiplex ( ( '+' | '-' ) multiplex )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplex_in_add625);
            multiplex29=multiplex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex29.getTree());
            // MathExpr.g:97:13: ( ( '+' | '-' ) multiplex )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=32 && LA8_0<=33)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:97:14: ( '+' | '-' ) multiplex
            	    {
            	    set30=(Token)input.LT(1);
            	    set30=(Token)input.LT(1);
            	    if ( (input.LA(1)>=32 && input.LA(1)<=33) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set30), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplex_in_add637);
            	    multiplex31=multiplex();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex31.getTree());

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
    // $ANTLR end "add"

    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logic"
    // MathExpr.g:100:1: logic : add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;
        MathExprParser.add_return add32 = null;

        MathExprParser.add_return add34 = null;


        Object set33_tree=null;

        try {
            // MathExpr.g:100:6: ( add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? )
            // MathExpr.g:101:3: add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_logic650);
            add32=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add32.getTree());
            // MathExpr.g:101:7: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=34 && LA9_0<=39)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MathExpr.g:101:8: ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add
                    {
                    set33=(Token)input.LT(1);
                    set33=(Token)input.LT(1);
                    if ( (input.LA(1)>=34 && input.LA(1)<=39) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set33), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_logic678);
                    add34=add();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add34.getTree());

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
    // MathExpr.g:104:1: expression : ( lvalue '=' rvalue DELIMITER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );
    public final MathExprParser.expression_return expression() throws RecognitionException {
        MathExprParser.expression_return retval = new MathExprParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token DELIMITER38=null;
        Token DELIMITER40=null;
        Token RETURN41=null;
        Token DELIMITER43=null;
        Token IF44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token ELSE49=null;
        Token WHILE51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        MathExprParser.lvalue_return lvalue35 = null;

        MathExprParser.rvalue_return rvalue37 = null;

        MathExprParser.functionCall_return functionCall39 = null;

        MathExprParser.rvalue_return rvalue42 = null;

        MathExprParser.rvalue_return rvalue46 = null;

        MathExprParser.expression_return expression48 = null;

        MathExprParser.expression_return expression50 = null;

        MathExprParser.rvalue_return rvalue53 = null;

        MathExprParser.expression_return expression55 = null;

        MathExprParser.expressionsList_return expressionsList57 = null;


        Object char_literal36_tree=null;
        Object DELIMITER38_tree=null;
        Object DELIMITER40_tree=null;
        Object RETURN41_tree=null;
        Object DELIMITER43_tree=null;
        Object IF44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal47_tree=null;
        Object ELSE49_tree=null;
        Object WHILE51_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;

        try {
            // MathExpr.g:104:11: ( lvalue '=' rvalue DELIMITER | functionCall DELIMITER | RETURN rvalue DELIMITER | IF '(' rvalue ')' expression ( ELSE expression )? | WHILE '(' rvalue ')' expression | '{' expressionsList '}' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==27) ) {
                    alt11=2;
                }
                else if ( (LA11_1==25||LA11_1==40) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RETURN:
                {
                alt11=3;
                }
                break;
            case IF:
                {
                alt11=4;
                }
                break;
            case WHILE:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // MathExpr.g:105:3: lvalue '=' rvalue DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expression692);
                    lvalue35=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue35.getTree());
                    char_literal36=(Token)match(input,40,FOLLOW_40_in_expression694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression697);
                    rvalue37=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue37.getTree());
                    DELIMITER38=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression699); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:106:3: functionCall DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_expression705);
                    functionCall39=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall39.getTree());
                    DELIMITER40=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression707); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // MathExpr.g:107:3: RETURN rvalue DELIMITER
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_expression713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN41_tree = (Object)adaptor.create(RETURN41);
                    root_0 = (Object)adaptor.becomeRoot(RETURN41_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression716);
                    rvalue42=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue42.getTree());
                    DELIMITER43=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expression718); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // MathExpr.g:108:3: IF '(' rvalue ')' expression ( ELSE expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF44=(Token)match(input,IF,FOLLOW_IF_in_expression724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF44_tree = (Object)adaptor.create(IF44);
                    root_0 = (Object)adaptor.becomeRoot(IF44_tree, root_0);
                    }
                    char_literal45=(Token)match(input,27,FOLLOW_27_in_expression727); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression730);
                    rvalue46=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue46.getTree());
                    char_literal47=(Token)match(input,28,FOLLOW_28_in_expression732); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression735);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression48.getTree());
                    // MathExpr.g:108:35: ( ELSE expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ELSE) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred23_MathExpr()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // MathExpr.g:108:36: ELSE expression
                            {
                            ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression738); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_expression741);
                            expression50=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // MathExpr.g:109:3: WHILE '(' rvalue ')' expression
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE51=(Token)match(input,WHILE,FOLLOW_WHILE_in_expression747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE51_tree = (Object)adaptor.create(WHILE51);
                    root_0 = (Object)adaptor.becomeRoot(WHILE51_tree, root_0);
                    }
                    char_literal52=(Token)match(input,27,FOLLOW_27_in_expression750); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression753);
                    rvalue53=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue53.getTree());
                    char_literal54=(Token)match(input,28,FOLLOW_28_in_expression755); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression758);
                    expression55=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression55.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:110:3: '{' expressionsList '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,41,FOLLOW_41_in_expression762); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList_in_expression765);
                    expressionsList57=expressionsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList57.getTree());
                    char_literal58=(Token)match(input,42,FOLLOW_42_in_expression767); if (state.failed) return retval;

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
    // MathExpr.g:113:1: expressionsList : ( expression ( ';' )* )* -> ^( BLOCK ( expression )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        MathExprParser.expression_return expression59 = null;


        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_DELIMITER=new RewriteRuleTokenStream(adaptor,"token DELIMITER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // MathExpr.g:113:16: ( ( expression ( ';' )* )* -> ^( BLOCK ( expression )* ) )
            // MathExpr.g:114:3: ( expression ( ';' )* )*
            {
            // MathExpr.g:114:3: ( expression ( ';' )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RETURN && LA13_0<=IF)||LA13_0==WHILE||LA13_0==IDENTIFIER||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MathExpr.g:114:4: expression ( ';' )*
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionsList780);
            	    expression59=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
            	    // MathExpr.g:114:15: ( ';' )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==DELIMITER) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: ';'
            	    	    {
            	    	    char_literal60=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_expressionsList782); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_DELIMITER.add(char_literal60);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
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
            // 114:23: -> ^( BLOCK ( expression )* )
            {
                // MathExpr.g:114:27: ^( BLOCK ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:114:35: ( expression )*
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
    // MathExpr.g:117:1: argumentDeclaration : type IDENTIFIER ;
    public final MathExprParser.argumentDeclaration_return argumentDeclaration() throws RecognitionException {
        MathExprParser.argumentDeclaration_return retval = new MathExprParser.argumentDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER62=null;
        MathExprParser.type_return type61 = null;


        Object IDENTIFIER62_tree=null;

        try {
            // MathExpr.g:117:20: ( type IDENTIFIER )
            // MathExpr.g:118:3: type IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_argumentDeclaration806);
            type61=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type61.getTree());
            IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argumentDeclaration808); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER62_tree = (Object)adaptor.create(IDENTIFIER62);
            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER62_tree, root_0);
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
    // MathExpr.g:120:1: argumentsDeclaration : ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) ;
    public final MathExprParser.argumentsDeclaration_return argumentsDeclaration() throws RecognitionException {
        MathExprParser.argumentsDeclaration_return retval = new MathExprParser.argumentsDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        MathExprParser.argumentDeclaration_return argumentDeclaration63 = null;

        MathExprParser.argumentDeclaration_return argumentDeclaration65 = null;


        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_argumentDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentDeclaration");
        try {
            // MathExpr.g:120:21: ( ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) )
            // MathExpr.g:121:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            {
            // MathExpr.g:121:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // MathExpr.g:121:4: argumentDeclaration ( ',' argumentDeclaration )*
                    {
                    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration819);
                    argumentDeclaration63=argumentDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentDeclaration.add(argumentDeclaration63.getTree());
                    // MathExpr.g:121:24: ( ',' argumentDeclaration )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==29) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // MathExpr.g:121:25: ',' argumentDeclaration
                    	    {
                    	    char_literal64=(Token)match(input,29,FOLLOW_29_in_argumentsDeclaration822); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_29.add(char_literal64);

                    	    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration824);
                    	    argumentDeclaration65=argumentDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argumentDeclaration.add(argumentDeclaration65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
            // 121:54: -> ^( SEMANTIC ( argumentDeclaration )* )
            {
                // MathExpr.g:121:58: ^( SEMANTIC ( argumentDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEMANTIC, "SEMANTIC"), root_1);

                // MathExpr.g:121:69: ( argumentDeclaration )*
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
    // MathExpr.g:123:1: functionDeclaration : type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) ;
    public final MathExprParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        MathExprParser.functionDeclaration_return retval = new MathExprParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token DELIMITER74=null;
        MathExprParser.type_return type66 = null;

        MathExprParser.argumentsDeclaration_return argumentsDeclaration69 = null;

        MathExprParser.expressionsList_return expressionsList72 = null;


        Object IDENTIFIER67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object DELIMITER74_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_DELIMITER=new RewriteRuleTokenStream(adaptor,"token DELIMITER");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_argumentsDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDeclaration");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expressionsList=new RewriteRuleSubtreeStream(adaptor,"rule expressionsList");
        try {
            // MathExpr.g:123:20: ( type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) )
            // MathExpr.g:124:3: type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( DELIMITER )*
            {
            pushFollow(FOLLOW_type_in_functionDeclaration848);
            type66=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type66.getTree());
            IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionDeclaration850); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER67);

            char_literal68=(Token)match(input,27,FOLLOW_27_in_functionDeclaration852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal68);

            pushFollow(FOLLOW_argumentsDeclaration_in_functionDeclaration854);
            argumentsDeclaration69=argumentsDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDeclaration.add(argumentsDeclaration69.getTree());
            char_literal70=(Token)match(input,28,FOLLOW_28_in_functionDeclaration856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal70);

            char_literal71=(Token)match(input,41,FOLLOW_41_in_functionDeclaration858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal71);

            pushFollow(FOLLOW_expressionsList_in_functionDeclaration860);
            expressionsList72=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionsList.add(expressionsList72.getTree());
            char_literal73=(Token)match(input,42,FOLLOW_42_in_functionDeclaration862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal73);

            // MathExpr.g:124:72: ( DELIMITER )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==DELIMITER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MathExpr.g:0:0: DELIMITER
            	    {
            	    DELIMITER74=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_functionDeclaration864); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DELIMITER.add(DELIMITER74);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: expressionsList, IDENTIFIER, argumentsDeclaration, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:5: -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
            {
                // MathExpr.g:125:9: ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
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
    // MathExpr.g:128:1: importDeclaration : '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) ;
    public final MathExprParser.importDeclaration_return importDeclaration() throws RecognitionException {
        MathExprParser.importDeclaration_return retval = new MathExprParser.importDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s1=null;
        Token s2=null;
        Token string_literal75=null;

        Object s1_tree=null;
        Object s2_tree=null;
        Object string_literal75_tree=null;
        RewriteRuleTokenStream stream_INCLUDE_STRING=new RewriteRuleTokenStream(adaptor,"token INCLUDE_STRING");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // MathExpr.g:128:18: ( '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) )
            // MathExpr.g:129:3: '#include' (s1= STRING | s2= INCLUDE_STRING )
            {
            string_literal75=(Token)match(input,43,FOLLOW_43_in_importDeclaration895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal75);

            // MathExpr.g:129:14: (s1= STRING | s2= INCLUDE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==INCLUDE_STRING) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // MathExpr.g:129:15: s1= STRING
                    {
                    s1=(Token)match(input,STRING,FOLLOW_STRING_in_importDeclaration900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(s1);


                    }
                    break;
                case 2 :
                    // MathExpr.g:129:27: s2= INCLUDE_STRING
                    {
                    s2=(Token)match(input,INCLUDE_STRING,FOLLOW_INCLUDE_STRING_in_importDeclaration906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_STRING.add(s2);


                    }
                    break;

            }



            // AST REWRITE
            // elements: s2, s1
            // token labels: s2, s1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s2=new RewriteRuleTokenStream(adaptor,"token s2",s2);
            RewriteRuleTokenStream stream_s1=new RewriteRuleTokenStream(adaptor,"token s1",s1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:47: -> ^( INCLUDE ( $s1)? ( $s2)? )
            {
                // MathExpr.g:129:51: ^( INCLUDE ( $s1)? ( $s2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLUDE, "INCLUDE"), root_1);

                // MathExpr.g:129:61: ( $s1)?
                if ( stream_s1.hasNext() ) {
                    adaptor.addChild(root_1, stream_s1.nextNode());

                }
                stream_s1.reset();
                // MathExpr.g:129:66: ( $s2)?
                if ( stream_s2.hasNext() ) {
                    adaptor.addChild(root_1, stream_s2.nextNode());

                }
                stream_s2.reset();

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
    // MathExpr.g:132:1: declaration : ( functionDeclaration | importDeclaration ) ;
    public final MathExprParser.declaration_return declaration() throws RecognitionException {
        MathExprParser.declaration_return retval = new MathExprParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.functionDeclaration_return functionDeclaration76 = null;

        MathExprParser.importDeclaration_return importDeclaration77 = null;



        try {
            // MathExpr.g:132:12: ( ( functionDeclaration | importDeclaration ) )
            // MathExpr.g:133:3: ( functionDeclaration | importDeclaration )
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:133:3: ( functionDeclaration | importDeclaration )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==43) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // MathExpr.g:133:5: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_declaration936);
                    functionDeclaration76=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration76.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:133:27: importDeclaration
                    {
                    pushFollow(FOLLOW_importDeclaration_in_declaration940);
                    importDeclaration77=importDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration77.getTree());

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
    // MathExpr.g:136:1: declarations : ( declaration )* ;
    public final MathExprParser.declarations_return declarations() throws RecognitionException {
        MathExprParser.declarations_return retval = new MathExprParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declaration_return declaration78 = null;



        try {
            // MathExpr.g:136:13: ( ( declaration )* )
            // MathExpr.g:137:3: ( declaration )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:137:3: ( declaration )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==IDENTIFIER||LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MathExpr.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_declarations953);
            	    declaration78=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration78.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // MathExpr.g:140:1: code : declarations ;
    public final MathExprParser.code_return code() throws RecognitionException {
        MathExprParser.code_return retval = new MathExprParser.code_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declarations_return declarations79 = null;



        try {
            // MathExpr.g:140:5: ( declarations )
            // MathExpr.g:141:3: declarations
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_code965);
            declarations79=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations79.getTree());

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
    // MathExpr.g:144:1: start : code EOF -> ^( PROGRAM code ) ;
    public final MathExprParser.start_return start() throws RecognitionException {
        MathExprParser.start_return retval = new MathExprParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF81=null;
        MathExprParser.code_return code80 = null;


        Object EOF81_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_code=new RewriteRuleSubtreeStream(adaptor,"rule code");
        try {
            // MathExpr.g:144:6: ( code EOF -> ^( PROGRAM code ) )
            // MathExpr.g:145:3: code EOF
            {
            pushFollow(FOLLOW_code_in_start976);
            code80=code();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_code.add(code80.getTree());
            EOF81=(Token)match(input,EOF,FOLLOW_EOF_in_start980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF81);



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
            // 147:5: -> ^( PROGRAM code )
            {
                // MathExpr.g:147:9: ^( PROGRAM code )
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

    // $ANTLR start synpred9_MathExpr
    public final void synpred9_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:84:3: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* )
        // MathExpr.g:84:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred9_MathExpr561); if (state.failed) return ;
        // MathExpr.g:84:14: ( arrayIndex0 rvalue ']' )*
        loop21:
        do {
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }


            switch (alt21) {
        	case 1 :
        	    // MathExpr.g:84:15: arrayIndex0 rvalue ']'
        	    {
        	    pushFollow(FOLLOW_arrayIndex0_in_synpred9_MathExpr564);
        	    arrayIndex0();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_rvalue_in_synpred9_MathExpr567);
        	    rvalue();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,26,FOLLOW_26_in_synpred9_MathExpr569); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop21;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred9_MathExpr

    // $ANTLR start synpred23_MathExpr
    public final void synpred23_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:108:36: ( ELSE expression )
        // MathExpr.g:108:36: ELSE expression
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred23_MathExpr738); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred23_MathExpr741);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_MathExpr

    // Delegated rules

    public final boolean synpred9_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_IDENTIFIER_in_type0419 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_type0422 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_type0424 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type0_in_type435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_term464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_term468 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_logic_in_term471 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_term473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rvalue_in_arguments486 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_arguments489 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_arguments491 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionCall515 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_functionCall517 = new BitSet(new long[]{0x0000000018B00000L});
    public static final BitSet FOLLOW_arguments_in_functionCall519 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_functionCall521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_arrayIndex0543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue561 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue564 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_lvalue567 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_lvalue569 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_rvalue587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_multiplex598 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_multiplex601 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_term_in_multiplex612 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_multiplex_in_add625 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_add628 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_multiplex_in_add637 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_add_in_logic650 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_set_in_logic653 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_add_in_logic678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expression692 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expression694 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression697 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression705 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expression713 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression716 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DELIMITER_in_expression718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression724 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expression727 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression730 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_expression732 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression735 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expression738 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expression747 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expression750 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression753 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_expression755 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expression762 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_expression765 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionsList780 = new BitSet(new long[]{0x00000200018000B2L});
    public static final BitSet FOLLOW_DELIMITER_in_expressionsList782 = new BitSet(new long[]{0x00000200018000B2L});
    public static final BitSet FOLLOW_type_in_argumentDeclaration806 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration819 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_argumentsDeclaration822 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration824 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration848 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration850 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_functionDeclaration852 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_argumentsDeclaration_in_functionDeclaration854 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_functionDeclaration856 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionDeclaration858 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclaration860 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionDeclaration862 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DELIMITER_in_functionDeclaration864 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_43_in_importDeclaration895 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_STRING_in_importDeclaration900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_STRING_in_importDeclaration906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_declaration936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDeclaration_in_declaration940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations953 = new BitSet(new long[]{0x0000080000800002L});
    public static final BitSet FOLLOW_declarations_in_code965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_start976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred9_MathExpr561 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_synpred9_MathExpr564 = new BitSet(new long[]{0x0000000008B00000L});
    public static final BitSet FOLLOW_rvalue_in_synpred9_MathExpr567 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred9_MathExpr569 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred23_MathExpr738 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_synpred23_MathExpr741 = new BitSet(new long[]{0x0000000000000002L});

}