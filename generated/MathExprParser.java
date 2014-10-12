// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-10-12 22:09:25
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "WHILE", "PROGRAM", "INCLUDE", "TYPE", "SEMANTIC", "FUNCTION", "ARGUMENTS", "CALL", "BLOCK", "INDEX", "WS", "DIGIT", "LETTER", "NUMBER", "STRING", "INCLUDE_STRING", "IDENTIFIER", "'['", "']'", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "';'", "'{'", "'}'", "'#include'"
    };
    public static final int FUNCTION=12;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int INCLUDE_STRING=22;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int ARGUMENTS=13;
    public static final int T__27=27;
    public static final int WHILE=7;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int LETTER=19;
    public static final int ELSE=6;
    public static final int NUMBER=20;
    public static final int EOF=-1;
    public static final int TYPE=10;
    public static final int IF=5;
    public static final int INDEX=16;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=17;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int IDENTIFIER=23;
    public static final int BLOCK=15;
    public static final int INCLUDE=9;
    public static final int RETURN=4;
    public static final int PROGRAM=8;
    public static final int CALL=14;
    public static final int DIGIT=18;
    public static final int SEMANTIC=11;
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
    // MathExpr.g:55:1: type0 : IDENTIFIER ( '[' ']' )* ;
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
            // MathExpr.g:55:6: ( IDENTIFIER ( '[' ']' )* )
            // MathExpr.g:56:3: IDENTIFIER ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type0406); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER1_tree = (Object)adaptor.create(IDENTIFIER1);
            adaptor.addChild(root_0, IDENTIFIER1_tree);
            }
            // MathExpr.g:56:14: ( '[' ']' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:56:15: '[' ']'
            	    {
            	    char_literal2=(Token)match(input,24,FOLLOW_24_in_type0409); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal2_tree = (Object)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);
            	    }
            	    char_literal3=(Token)match(input,25,FOLLOW_25_in_type0411); if (state.failed) return retval;
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
    // MathExpr.g:58:1: type : type0 -> TYPE[$type0.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.type0_return type04 = null;


        RewriteRuleSubtreeStream stream_type0=new RewriteRuleSubtreeStream(adaptor,"rule type0");
        try {
            // MathExpr.g:58:5: ( type0 -> TYPE[$type0.text] )
            // MathExpr.g:59:3: type0
            {
            pushFollow(FOLLOW_type0_in_type422);
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
            // 59:10: -> TYPE[$type0.text]
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
    // MathExpr.g:63:1: term : ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' );
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
            // MathExpr.g:63:5: ( NUMBER | STRING | lvalue | functionCall | '(' logic ')' )
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

                if ( (LA2_3==26) ) {
                    alt2=4;
                }
                else if ( (LA2_3==EOF||(LA2_3>=24 && LA2_3<=25)||(LA2_3>=27 && LA2_3<=38)||LA2_3==40) ) {
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
            case 26:
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
                    // MathExpr.g:64:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER5_tree = (Object)adaptor.create(NUMBER5);
                    adaptor.addChild(root_0, NUMBER5_tree);
                    }

                    }
                    break;
                case 2 :
                    // MathExpr.g:65:3: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_term445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING6_tree = (Object)adaptor.create(STRING6);
                    adaptor.addChild(root_0, STRING6_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:66:3: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term449);
                    lvalue7=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue7.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:67:3: functionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_term453);
                    functionCall8=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall8.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:68:3: '(' logic ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,26,FOLLOW_26_in_term457); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term460);
                    logic10=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic10.getTree());
                    char_literal11=(Token)match(input,27,FOLLOW_27_in_term462); if (state.failed) return retval;

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
    // MathExpr.g:71:1: arguments : ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) ;
    public final MathExprParser.arguments_return arguments() throws RecognitionException {
        MathExprParser.arguments_return retval = new MathExprParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        MathExprParser.rvalue_return rvalue12 = null;

        MathExprParser.rvalue_return rvalue14 = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        try {
            // MathExpr.g:71:10: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGUMENTS ( rvalue )* ) )
            // MathExpr.g:72:3: ( rvalue ( ',' rvalue )* )?
            {
            // MathExpr.g:72:3: ( rvalue ( ',' rvalue )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=NUMBER && LA4_0<=STRING)||LA4_0==IDENTIFIER||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:72:4: rvalue ( ',' rvalue )*
                    {
                    pushFollow(FOLLOW_rvalue_in_arguments475);
                    rvalue12=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rvalue.add(rvalue12.getTree());
                    // MathExpr.g:72:11: ( ',' rvalue )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==28) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:72:12: ',' rvalue
                    	    {
                    	    char_literal13=(Token)match(input,28,FOLLOW_28_in_arguments478); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal13);

                    	    pushFollow(FOLLOW_rvalue_in_arguments480);
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
            // 72:28: -> ^( ARGUMENTS ( rvalue )* )
            {
                // MathExpr.g:72:32: ^( ARGUMENTS ( rvalue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // MathExpr.g:72:44: ( rvalue )*
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
    // MathExpr.g:74:1: functionCall : IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER ARGUMENTS ) ;
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
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // MathExpr.g:74:13: ( IDENTIFIER '(' arguments ')' -> ^( CALL IDENTIFIER ARGUMENTS ) )
            // MathExpr.g:75:3: IDENTIFIER '(' arguments ')'
            {
            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionCall504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);

            char_literal16=(Token)match(input,26,FOLLOW_26_in_functionCall506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal16);

            pushFollow(FOLLOW_arguments_in_functionCall508);
            arguments17=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments17.getTree());
            char_literal18=(Token)match(input,27,FOLLOW_27_in_functionCall510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal18);



            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:33: -> ^( CALL IDENTIFIER ARGUMENTS )
            {
                // MathExpr.g:75:37: ^( CALL IDENTIFIER ARGUMENTS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, (Object)adaptor.create(ARGUMENTS, "ARGUMENTS"));

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
    // MathExpr.g:78:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;

        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");

        try {
            // MathExpr.g:78:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:79:3: '['
            {
            char_literal19=(Token)match(input,24,FOLLOW_24_in_arrayIndex0532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal19);



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
            // 79:8: -> INDEX[\"[]\"]
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
    // MathExpr.g:81:1: lvalue : ( IDENTIFIER ( arrayIndex0 rvalue ']' )* | IDENTIFIER );
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
            // MathExpr.g:81:7: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* | IDENTIFIER )
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
                    // MathExpr.g:82:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER20_tree = (Object)adaptor.create(IDENTIFIER20);
                    adaptor.addChild(root_0, IDENTIFIER20_tree);
                    }
                    // MathExpr.g:82:14: ( arrayIndex0 rvalue ']' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MathExpr.g:82:15: arrayIndex0 rvalue ']'
                    	    {
                    	    pushFollow(FOLLOW_arrayIndex0_in_lvalue553);
                    	    arrayIndex021=arrayIndex0();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(arrayIndex021.getTree(), root_0);
                    	    pushFollow(FOLLOW_rvalue_in_lvalue556);
                    	    rvalue22=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue22.getTree());
                    	    char_literal23=(Token)match(input,25,FOLLOW_25_in_lvalue558); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // MathExpr.g:83:3: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue565); if (state.failed) return retval;
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
    // MathExpr.g:86:1: rvalue : logic ;
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic25 = null;



        try {
            // MathExpr.g:86:7: ( logic )
            // MathExpr.g:87:3: logic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logic_in_rvalue576);
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
    // MathExpr.g:90:1: multiplex : term ( ( '*' | '/' ) term )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;
        MathExprParser.term_return term26 = null;

        MathExprParser.term_return term28 = null;


        Object set27_tree=null;

        try {
            // MathExpr.g:90:10: ( term ( ( '*' | '/' ) term )* )
            // MathExpr.g:91:3: term ( ( '*' | '/' ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_multiplex587);
            term26=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());
            // MathExpr.g:91:8: ( ( '*' | '/' ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MathExpr.g:91:9: ( '*' | '/' ) term
            	    {
            	    set27=(Token)input.LT(1);
            	    set27=(Token)input.LT(1);
            	    if ( (input.LA(1)>=29 && input.LA(1)<=30) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set27), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_multiplex601);
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
    // MathExpr.g:94:1: add : multiplex ( ( '+' | '-' ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;
        MathExprParser.multiplex_return multiplex29 = null;

        MathExprParser.multiplex_return multiplex31 = null;


        Object set30_tree=null;

        try {
            // MathExpr.g:94:4: ( multiplex ( ( '+' | '-' ) multiplex )* )
            // MathExpr.g:95:3: multiplex ( ( '+' | '-' ) multiplex )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplex_in_add614);
            multiplex29=multiplex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex29.getTree());
            // MathExpr.g:95:13: ( ( '+' | '-' ) multiplex )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=32)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:95:14: ( '+' | '-' ) multiplex
            	    {
            	    set30=(Token)input.LT(1);
            	    set30=(Token)input.LT(1);
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set30), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplex_in_add626);
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
    // MathExpr.g:98:1: logic : add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;
        MathExprParser.add_return add32 = null;

        MathExprParser.add_return add34 = null;


        Object set33_tree=null;

        try {
            // MathExpr.g:98:6: ( add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? )
            // MathExpr.g:99:3: add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_logic639);
            add32=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add32.getTree());
            // MathExpr.g:99:7: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=38)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MathExpr.g:99:8: ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add
                    {
                    set33=(Token)input.LT(1);
                    set33=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=38) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set33), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_logic667);
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
    // MathExpr.g:102:1: expression : ( lvalue '=' rvalue ';' | functionCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expression ( ELSE expression )? | WHILE '(' rvalue ')' expression | '{' expressionsList '}' );
    public final MathExprParser.expression_return expression() throws RecognitionException {
        MathExprParser.expression_return retval = new MathExprParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token RETURN41=null;
        Token char_literal43=null;
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
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        Object RETURN41_tree=null;
        Object char_literal43_tree=null;
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
            // MathExpr.g:102:11: ( lvalue '=' rvalue ';' | functionCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expression ( ELSE expression )? | WHILE '(' rvalue ')' expression | '{' expressionsList '}' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    alt11=2;
                }
                else if ( (LA11_1==24||LA11_1==39) ) {
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
                    // MathExpr.g:103:3: lvalue '=' rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expression681);
                    lvalue35=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue35.getTree());
                    char_literal36=(Token)match(input,39,FOLLOW_39_in_expression683); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression686);
                    rvalue37=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue37.getTree());
                    char_literal38=(Token)match(input,40,FOLLOW_40_in_expression688); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:104:3: functionCall ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_expression693);
                    functionCall39=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall39.getTree());
                    char_literal40=(Token)match(input,40,FOLLOW_40_in_expression695); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // MathExpr.g:105:3: RETURN rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_expression700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN41_tree = (Object)adaptor.create(RETURN41);
                    root_0 = (Object)adaptor.becomeRoot(RETURN41_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expression703);
                    rvalue42=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue42.getTree());
                    char_literal43=(Token)match(input,40,FOLLOW_40_in_expression705); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // MathExpr.g:106:3: IF '(' rvalue ')' expression ( ELSE expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF44=(Token)match(input,IF,FOLLOW_IF_in_expression710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF44_tree = (Object)adaptor.create(IF44);
                    root_0 = (Object)adaptor.becomeRoot(IF44_tree, root_0);
                    }
                    char_literal45=(Token)match(input,26,FOLLOW_26_in_expression713); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression716);
                    rvalue46=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue46.getTree());
                    char_literal47=(Token)match(input,27,FOLLOW_27_in_expression718); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression721);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression48.getTree());
                    // MathExpr.g:106:35: ( ELSE expression )?
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
                            // MathExpr.g:106:36: ELSE expression
                            {
                            ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression724); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_expression727);
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
                    // MathExpr.g:107:3: WHILE '(' rvalue ')' expression
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE51=(Token)match(input,WHILE,FOLLOW_WHILE_in_expression733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE51_tree = (Object)adaptor.create(WHILE51);
                    root_0 = (Object)adaptor.becomeRoot(WHILE51_tree, root_0);
                    }
                    char_literal52=(Token)match(input,26,FOLLOW_26_in_expression736); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expression739);
                    rvalue53=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue53.getTree());
                    char_literal54=(Token)match(input,27,FOLLOW_27_in_expression741); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression744);
                    expression55=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression55.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:108:3: '{' expressionsList '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,41,FOLLOW_41_in_expression748); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList_in_expression751);
                    expressionsList57=expressionsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList57.getTree());
                    char_literal58=(Token)match(input,42,FOLLOW_42_in_expression753); if (state.failed) return retval;

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
    // MathExpr.g:111:1: expressionsList : ( expression ( ';' )* )* -> ^( BLOCK ( expression )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        MathExprParser.expression_return expression59 = null;


        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // MathExpr.g:111:16: ( ( expression ( ';' )* )* -> ^( BLOCK ( expression )* ) )
            // MathExpr.g:112:3: ( expression ( ';' )* )*
            {
            // MathExpr.g:112:3: ( expression ( ';' )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RETURN && LA13_0<=IF)||LA13_0==WHILE||LA13_0==IDENTIFIER||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MathExpr.g:112:4: expression ( ';' )*
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionsList766);
            	    expression59=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
            	    // MathExpr.g:112:15: ( ';' )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==40) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: ';'
            	    	    {
            	    	    char_literal60=(Token)match(input,40,FOLLOW_40_in_expressionsList768); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_40.add(char_literal60);


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
            // 112:23: -> ^( BLOCK ( expression )* )
            {
                // MathExpr.g:112:27: ^( BLOCK ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:112:35: ( expression )*
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
    // MathExpr.g:115:1: argumentDeclaration : type IDENTIFIER ;
    public final MathExprParser.argumentDeclaration_return argumentDeclaration() throws RecognitionException {
        MathExprParser.argumentDeclaration_return retval = new MathExprParser.argumentDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER62=null;
        MathExprParser.type_return type61 = null;


        Object IDENTIFIER62_tree=null;

        try {
            // MathExpr.g:115:20: ( type IDENTIFIER )
            // MathExpr.g:116:3: type IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_argumentDeclaration792);
            type61=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type61.getTree());
            IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argumentDeclaration794); if (state.failed) return retval;
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
    // MathExpr.g:118:1: argumentsDeclaration : ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) ;
    public final MathExprParser.argumentsDeclaration_return argumentsDeclaration() throws RecognitionException {
        MathExprParser.argumentsDeclaration_return retval = new MathExprParser.argumentsDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        MathExprParser.argumentDeclaration_return argumentDeclaration63 = null;

        MathExprParser.argumentDeclaration_return argumentDeclaration65 = null;


        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_argumentDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentDeclaration");
        try {
            // MathExpr.g:118:21: ( ( argumentDeclaration ( ',' argumentDeclaration )* )? -> ^( SEMANTIC ( argumentDeclaration )* ) )
            // MathExpr.g:119:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            {
            // MathExpr.g:119:3: ( argumentDeclaration ( ',' argumentDeclaration )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // MathExpr.g:119:4: argumentDeclaration ( ',' argumentDeclaration )*
                    {
                    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration805);
                    argumentDeclaration63=argumentDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentDeclaration.add(argumentDeclaration63.getTree());
                    // MathExpr.g:119:24: ( ',' argumentDeclaration )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // MathExpr.g:119:25: ',' argumentDeclaration
                    	    {
                    	    char_literal64=(Token)match(input,28,FOLLOW_28_in_argumentsDeclaration808); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal64);

                    	    pushFollow(FOLLOW_argumentDeclaration_in_argumentsDeclaration810);
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
            // 119:54: -> ^( SEMANTIC ( argumentDeclaration )* )
            {
                // MathExpr.g:119:58: ^( SEMANTIC ( argumentDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEMANTIC, "SEMANTIC"), root_1);

                // MathExpr.g:119:69: ( argumentDeclaration )*
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
    // MathExpr.g:121:1: functionDeclaration : type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( ';' )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) ;
    public final MathExprParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        MathExprParser.functionDeclaration_return retval = new MathExprParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal74=null;
        MathExprParser.type_return type66 = null;

        MathExprParser.argumentsDeclaration_return argumentsDeclaration69 = null;

        MathExprParser.expressionsList_return expressionsList72 = null;


        Object IDENTIFIER67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_argumentsDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDeclaration");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expressionsList=new RewriteRuleSubtreeStream(adaptor,"rule expressionsList");
        try {
            // MathExpr.g:121:20: ( type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( ';' )* -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList ) )
            // MathExpr.g:122:3: type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ( ';' )*
            {
            pushFollow(FOLLOW_type_in_functionDeclaration834);
            type66=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type66.getTree());
            IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionDeclaration836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER67);

            char_literal68=(Token)match(input,26,FOLLOW_26_in_functionDeclaration838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal68);

            pushFollow(FOLLOW_argumentsDeclaration_in_functionDeclaration840);
            argumentsDeclaration69=argumentsDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDeclaration.add(argumentsDeclaration69.getTree());
            char_literal70=(Token)match(input,27,FOLLOW_27_in_functionDeclaration842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal70);

            char_literal71=(Token)match(input,41,FOLLOW_41_in_functionDeclaration844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal71);

            pushFollow(FOLLOW_expressionsList_in_functionDeclaration846);
            expressionsList72=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionsList.add(expressionsList72.getTree());
            char_literal73=(Token)match(input,42,FOLLOW_42_in_functionDeclaration848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal73);

            // MathExpr.g:122:72: ( ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // MathExpr.g:0:0: ';'
            	    {
            	    char_literal74=(Token)match(input,40,FOLLOW_40_in_functionDeclaration850); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal74);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: type, argumentsDeclaration, expressionsList, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:5: -> ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
            {
                // MathExpr.g:123:9: ^( FUNCTION IDENTIFIER type argumentsDeclaration expressionsList )
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
    // MathExpr.g:126:1: importDeclaration : '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) ;
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
            // MathExpr.g:126:18: ( '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) )
            // MathExpr.g:127:3: '#include' (s1= STRING | s2= INCLUDE_STRING )
            {
            string_literal75=(Token)match(input,43,FOLLOW_43_in_importDeclaration881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal75);

            // MathExpr.g:127:14: (s1= STRING | s2= INCLUDE_STRING )
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
                    // MathExpr.g:127:15: s1= STRING
                    {
                    s1=(Token)match(input,STRING,FOLLOW_STRING_in_importDeclaration886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(s1);


                    }
                    break;
                case 2 :
                    // MathExpr.g:127:27: s2= INCLUDE_STRING
                    {
                    s2=(Token)match(input,INCLUDE_STRING,FOLLOW_INCLUDE_STRING_in_importDeclaration892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_STRING.add(s2);


                    }
                    break;

            }



            // AST REWRITE
            // elements: s1, s2
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
            // 127:47: -> ^( INCLUDE ( $s1)? ( $s2)? )
            {
                // MathExpr.g:127:51: ^( INCLUDE ( $s1)? ( $s2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLUDE, "INCLUDE"), root_1);

                // MathExpr.g:127:61: ( $s1)?
                if ( stream_s1.hasNext() ) {
                    adaptor.addChild(root_1, stream_s1.nextNode());

                }
                stream_s1.reset();
                // MathExpr.g:127:66: ( $s2)?
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
    // MathExpr.g:130:1: declaration : ( functionDeclaration | importDeclaration ) ;
    public final MathExprParser.declaration_return declaration() throws RecognitionException {
        MathExprParser.declaration_return retval = new MathExprParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.functionDeclaration_return functionDeclaration76 = null;

        MathExprParser.importDeclaration_return importDeclaration77 = null;



        try {
            // MathExpr.g:130:12: ( ( functionDeclaration | importDeclaration ) )
            // MathExpr.g:131:3: ( functionDeclaration | importDeclaration )
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:131:3: ( functionDeclaration | importDeclaration )
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
                    // MathExpr.g:131:5: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_declaration922);
                    functionDeclaration76=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration76.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:131:27: importDeclaration
                    {
                    pushFollow(FOLLOW_importDeclaration_in_declaration926);
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
    // MathExpr.g:134:1: declarations : ( declaration )* ;
    public final MathExprParser.declarations_return declarations() throws RecognitionException {
        MathExprParser.declarations_return retval = new MathExprParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declaration_return declaration78 = null;



        try {
            // MathExpr.g:134:13: ( ( declaration )* )
            // MathExpr.g:135:3: ( declaration )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:135:3: ( declaration )*
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
            	    pushFollow(FOLLOW_declaration_in_declarations939);
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
    // MathExpr.g:138:1: code : declarations ;
    public final MathExprParser.code_return code() throws RecognitionException {
        MathExprParser.code_return retval = new MathExprParser.code_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declarations_return declarations79 = null;



        try {
            // MathExpr.g:138:5: ( declarations )
            // MathExpr.g:139:3: declarations
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_code951);
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
    // MathExpr.g:142:1: start : code EOF -> ^( PROGRAM code ) ;
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
            // MathExpr.g:142:6: ( code EOF -> ^( PROGRAM code ) )
            // MathExpr.g:143:3: code EOF
            {
            pushFollow(FOLLOW_code_in_start962);
            code80=code();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_code.add(code80.getTree());
            EOF81=(Token)match(input,EOF,FOLLOW_EOF_in_start966); if (state.failed) return retval; 
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
            // 145:5: -> ^( PROGRAM code )
            {
                // MathExpr.g:145:9: ^( PROGRAM code )
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
        // MathExpr.g:82:3: ( IDENTIFIER ( arrayIndex0 rvalue ']' )* )
        // MathExpr.g:82:3: IDENTIFIER ( arrayIndex0 rvalue ']' )*
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred9_MathExpr550); if (state.failed) return ;
        // MathExpr.g:82:14: ( arrayIndex0 rvalue ']' )*
        loop21:
        do {
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }


            switch (alt21) {
        	case 1 :
        	    // MathExpr.g:82:15: arrayIndex0 rvalue ']'
        	    {
        	    pushFollow(FOLLOW_arrayIndex0_in_synpred9_MathExpr553);
        	    arrayIndex0();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_rvalue_in_synpred9_MathExpr556);
        	    rvalue();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,25,FOLLOW_25_in_synpred9_MathExpr558); if (state.failed) return ;

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
        // MathExpr.g:106:36: ( ELSE expression )
        // MathExpr.g:106:36: ELSE expression
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred23_MathExpr724); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred23_MathExpr727);
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


 

    public static final BitSet FOLLOW_IDENTIFIER_in_type0406 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_type0409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_type0411 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_type0_in_type422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_term453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_term457 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_logic_in_term460 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_term462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rvalue_in_arguments475 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_arguments478 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_arguments480 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionCall504 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_functionCall506 = new BitSet(new long[]{0x000000000CB00000L});
    public static final BitSet FOLLOW_arguments_in_functionCall508 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_functionCall510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_arrayIndex0532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue550 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue553 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_lvalue556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_lvalue558 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lvalue565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_rvalue576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_multiplex587 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_multiplex590 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_term_in_multiplex601 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_multiplex_in_add614 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_add617 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_multiplex_in_add626 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_add_in_logic639 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_set_in_logic642 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_add_in_logic667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expression681 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_expression683 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression686 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression693 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expression695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expression700 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression703 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expression705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression710 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expression713 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression716 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expression718 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression721 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expression724 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expression733 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expression736 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expression739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expression741 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_expression744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expression748 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_expression751 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expression753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionsList766 = new BitSet(new long[]{0x00000300008000B2L});
    public static final BitSet FOLLOW_40_in_expressionsList768 = new BitSet(new long[]{0x00000300008000B2L});
    public static final BitSet FOLLOW_type_in_argumentDeclaration792 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration805 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_argumentsDeclaration808 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_argumentDeclaration_in_argumentsDeclaration810 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration834 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration836 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_functionDeclaration838 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_argumentsDeclaration_in_functionDeclaration840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_functionDeclaration842 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_functionDeclaration844 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclaration846 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_functionDeclaration848 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_functionDeclaration850 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_43_in_importDeclaration881 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_STRING_in_importDeclaration886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_STRING_in_importDeclaration892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_declaration922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDeclaration_in_declaration926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations939 = new BitSet(new long[]{0x0000080000800002L});
    public static final BitSet FOLLOW_declarations_in_code951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_start962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred9_MathExpr550 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_synpred9_MathExpr553 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_synpred9_MathExpr556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred9_MathExpr558 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred23_MathExpr724 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expression_in_synpred23_MathExpr727 = new BitSet(new long[]{0x0000000000000002L});

}