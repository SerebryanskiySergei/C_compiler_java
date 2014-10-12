package generated;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2011-10-25 20:11:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "WHILE", "PROGRAM", "INCLUDE", "TYPE", "ARGS_DECL", "FUNC_DECL", "ARGS", "CALL", "BLOCK", "INDEX", "WS", "DIGIT", "LETTER", "NUMBER", "STRING", "INCLUDE_STRING", "IDENT", "'['", "']'", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "';'", "'{'", "'}'", "'#include'"
    };
    public static final int INCLUDE_STRING=22;
    public static final int T__29=29;
    public static final int ARGS_DECL=11;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int WHILE=7;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int LETTER=19;
    public static final int EOF=-1;
    public static final int IF=5;
    public static final int TYPE=10;
    public static final int INDEX=16;
    public static final int INCLUDE=9;
    public static final int RETURN=4;
    public static final int ARGS=13;
    public static final int IDENT=23;
    public static final int DIGIT=18;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int ELSE=6;
    public static final int NUMBER=20;
    public static final int FUNC_DECL=12;
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
    // MathExpr.g:56:1: type0 : IDENT ( '[' ']' )* ;
    public final MathExprParser.type0_return type0() throws RecognitionException {
        MathExprParser.type0_return retval = new MathExprParser.type0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT1=null;
        Token char_literal2=null;
        Token char_literal3=null;

        Object IDENT1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;

        try {
            // MathExpr.g:56:6: ( IDENT ( '[' ']' )* )
            // MathExpr.g:57:3: IDENT ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_type0410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT1_tree = (Object)adaptor.create(IDENT1);
            adaptor.addChild(root_0, IDENT1_tree);
            }
            // MathExpr.g:57:9: ( '[' ']' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:57:10: '[' ']'
            	    {
            	    char_literal2=(Token)match(input,24,FOLLOW_24_in_type0413); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal2_tree = (Object)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);
            	    }
            	    char_literal3=(Token)match(input,25,FOLLOW_25_in_type0415); if (state.failed) return retval;
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
    // MathExpr.g:59:1: type : type0 -> TYPE[$type0.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.type0_return type04 = null;


        RewriteRuleSubtreeStream stream_type0=new RewriteRuleSubtreeStream(adaptor,"rule type0");
        try {
            // MathExpr.g:59:5: ( type0 -> TYPE[$type0.text] )
            // MathExpr.g:60:3: type0
            {
            pushFollow(FOLLOW_type0_in_type426);
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
            // 60:10: -> TYPE[$type0.text]
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
    // MathExpr.g:64:1: term : ( NUMBER | STRING | lvalue | funcCall | '(' logic ')' );
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER5=null;
        Token STRING6=null;
        Token char_literal9=null;
        Token char_literal11=null;
        MathExprParser.lvalue_return lvalue7 = null;

        MathExprParser.funcCall_return funcCall8 = null;

        MathExprParser.logic_return logic10 = null;


        Object NUMBER5_tree=null;
        Object STRING6_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try {
            // MathExpr.g:64:5: ( NUMBER | STRING | lvalue | funcCall | '(' logic ')' )
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
            case IDENT:
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
                    // MathExpr.g:65:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER5_tree = (Object)adaptor.create(NUMBER5);
                    adaptor.addChild(root_0, NUMBER5_tree);
                    }

                    }
                    break;
                case 2 :
                    // MathExpr.g:66:3: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_term449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING6_tree = (Object)adaptor.create(STRING6);
                    adaptor.addChild(root_0, STRING6_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:67:3: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term453);
                    lvalue7=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue7.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:68:3: funcCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcCall_in_term457);
                    funcCall8=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcCall8.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:69:3: '(' logic ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,26,FOLLOW_26_in_term461); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term464);
                    logic10=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic10.getTree());
                    char_literal11=(Token)match(input,27,FOLLOW_27_in_term466); if (state.failed) return retval;

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

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // MathExpr.g:72:1: args : ( rvalue ( ',' rvalue )* )? -> ^( ARGS ( rvalue )* ) ;
    public final MathExprParser.args_return args() throws RecognitionException {
        MathExprParser.args_return retval = new MathExprParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        MathExprParser.rvalue_return rvalue12 = null;

        MathExprParser.rvalue_return rvalue14 = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        try {
            // MathExpr.g:72:5: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGS ( rvalue )* ) )
            // MathExpr.g:73:3: ( rvalue ( ',' rvalue )* )?
            {
            // MathExpr.g:73:3: ( rvalue ( ',' rvalue )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=NUMBER && LA4_0<=STRING)||LA4_0==IDENT||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:73:4: rvalue ( ',' rvalue )*
                    {
                    pushFollow(FOLLOW_rvalue_in_args479);
                    rvalue12=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rvalue.add(rvalue12.getTree());
                    // MathExpr.g:73:11: ( ',' rvalue )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==28) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:73:12: ',' rvalue
                    	    {
                    	    char_literal13=(Token)match(input,28,FOLLOW_28_in_args482); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal13);

                    	    pushFollow(FOLLOW_rvalue_in_args484);
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
            // 73:28: -> ^( ARGS ( rvalue )* )
            {
                // MathExpr.g:73:32: ^( ARGS ( rvalue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // MathExpr.g:73:39: ( rvalue )*
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
    // $ANTLR end "args"

    public static class funcCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcCall"
    // MathExpr.g:75:1: funcCall : IDENT '(' args ')' -> ^( CALL IDENT args ) ;
    public final MathExprParser.funcCall_return funcCall() throws RecognitionException {
        MathExprParser.funcCall_return retval = new MathExprParser.funcCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        MathExprParser.args_return args17 = null;


        Object IDENT15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // MathExpr.g:75:9: ( IDENT '(' args ')' -> ^( CALL IDENT args ) )
            // MathExpr.g:76:3: IDENT '(' args ')'
            {
            IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcCall508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT15);

            char_literal16=(Token)match(input,26,FOLLOW_26_in_funcCall510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal16);

            pushFollow(FOLLOW_args_in_funcCall512);
            args17=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_args.add(args17.getTree());
            char_literal18=(Token)match(input,27,FOLLOW_27_in_funcCall514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal18);



            // AST REWRITE
            // elements: args, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:23: -> ^( CALL IDENT args )
            {
                // MathExpr.g:76:27: ^( CALL IDENT args )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_args.nextTree());

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
    // $ANTLR end "funcCall"

    public static class arrayIndex0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayIndex0"
    // MathExpr.g:79:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;

        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");

        try {
            // MathExpr.g:79:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:80:3: '['
            {
            char_literal19=(Token)match(input,24,FOLLOW_24_in_arrayIndex0536); if (state.failed) return retval; 
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
            // 80:8: -> INDEX[\"[]\"]
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
    // MathExpr.g:82:1: lvalue : ( IDENT ( arrayIndex0 rvalue ']' )* | IDENT );
    public final MathExprParser.lvalue_return lvalue() throws RecognitionException {
        MathExprParser.lvalue_return retval = new MathExprParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT20=null;
        Token char_literal23=null;
        Token IDENT24=null;
        MathExprParser.arrayIndex0_return arrayIndex021 = null;

        MathExprParser.rvalue_return rvalue22 = null;


        Object IDENT20_tree=null;
        Object char_literal23_tree=null;
        Object IDENT24_tree=null;

        try {
            // MathExpr.g:82:7: ( IDENT ( arrayIndex0 rvalue ']' )* | IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
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
                    // MathExpr.g:83:3: IDENT ( arrayIndex0 rvalue ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_lvalue554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT20_tree = (Object)adaptor.create(IDENT20);
                    adaptor.addChild(root_0, IDENT20_tree);
                    }
                    // MathExpr.g:83:9: ( arrayIndex0 rvalue ']' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MathExpr.g:83:10: arrayIndex0 rvalue ']'
                    	    {
                    	    pushFollow(FOLLOW_arrayIndex0_in_lvalue557);
                    	    arrayIndex021=arrayIndex0();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(arrayIndex021.getTree(), root_0);
                    	    pushFollow(FOLLOW_rvalue_in_lvalue560);
                    	    rvalue22=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue22.getTree());
                    	    char_literal23=(Token)match(input,25,FOLLOW_25_in_lvalue562); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // MathExpr.g:84:3: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_lvalue569); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT24_tree = (Object)adaptor.create(IDENT24);
                    adaptor.addChild(root_0, IDENT24_tree);
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
    // MathExpr.g:87:1: rvalue : logic ;
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic25 = null;



        try {
            // MathExpr.g:87:7: ( logic )
            // MathExpr.g:88:3: logic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logic_in_rvalue580);
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

    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // MathExpr.g:91:1: mult : term ( ( '*' | '/' ) term )* ;
    public final MathExprParser.mult_return mult() throws RecognitionException {
        MathExprParser.mult_return retval = new MathExprParser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;
        MathExprParser.term_return term26 = null;

        MathExprParser.term_return term28 = null;


        Object set27_tree=null;

        try {
            // MathExpr.g:91:5: ( term ( ( '*' | '/' ) term )* )
            // MathExpr.g:92:3: term ( ( '*' | '/' ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_mult591);
            term26=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());
            // MathExpr.g:92:8: ( ( '*' | '/' ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MathExpr.g:92:9: ( '*' | '/' ) term
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

            	    pushFollow(FOLLOW_term_in_mult605);
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
    // $ANTLR end "mult"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // MathExpr.g:95:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;
        MathExprParser.mult_return mult29 = null;

        MathExprParser.mult_return mult31 = null;


        Object set30_tree=null;

        try {
            // MathExpr.g:95:4: ( mult ( ( '+' | '-' ) mult )* )
            // MathExpr.g:96:3: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add618);
            mult29=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult29.getTree());
            // MathExpr.g:96:8: ( ( '+' | '-' ) mult )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=32)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:96:9: ( '+' | '-' ) mult
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

            	    pushFollow(FOLLOW_mult_in_add630);
            	    mult31=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult31.getTree());

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
    // MathExpr.g:99:1: logic : add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;
        MathExprParser.add_return add32 = null;

        MathExprParser.add_return add34 = null;


        Object set33_tree=null;

        try {
            // MathExpr.g:99:6: ( add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? )
            // MathExpr.g:100:3: add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_logic643);
            add32=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add32.getTree());
            // MathExpr.g:100:7: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=38)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MathExpr.g:100:8: ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add
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

                    pushFollow(FOLLOW_add_in_logic671);
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

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // MathExpr.g:103:1: expr : ( lvalue '=' rvalue ';' | funcCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expr ( ELSE expr )? | WHILE '(' rvalue ')' expr | '{' exprList '}' );
    public final MathExprParser.expr_return expr() throws RecognitionException {
        MathExprParser.expr_return retval = new MathExprParser.expr_return();
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

        MathExprParser.funcCall_return funcCall39 = null;

        MathExprParser.rvalue_return rvalue42 = null;

        MathExprParser.rvalue_return rvalue46 = null;

        MathExprParser.expr_return expr48 = null;

        MathExprParser.expr_return expr50 = null;

        MathExprParser.rvalue_return rvalue53 = null;

        MathExprParser.expr_return expr55 = null;

        MathExprParser.exprList_return exprList57 = null;


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
            // MathExpr.g:103:5: ( lvalue '=' rvalue ';' | funcCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expr ( ELSE expr )? | WHILE '(' rvalue ')' expr | '{' exprList '}' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case IDENT:
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
                    // MathExpr.g:104:3: lvalue '=' rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expr685);
                    lvalue35=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue35.getTree());
                    char_literal36=(Token)match(input,39,FOLLOW_39_in_expr687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expr690);
                    rvalue37=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue37.getTree());
                    char_literal38=(Token)match(input,40,FOLLOW_40_in_expr692); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:105:3: funcCall ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcCall_in_expr697);
                    funcCall39=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcCall39.getTree());
                    char_literal40=(Token)match(input,40,FOLLOW_40_in_expr699); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // MathExpr.g:106:3: RETURN rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_expr704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN41_tree = (Object)adaptor.create(RETURN41);
                    root_0 = (Object)adaptor.becomeRoot(RETURN41_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expr707);
                    rvalue42=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue42.getTree());
                    char_literal43=(Token)match(input,40,FOLLOW_40_in_expr709); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // MathExpr.g:107:3: IF '(' rvalue ')' expr ( ELSE expr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF44=(Token)match(input,IF,FOLLOW_IF_in_expr714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF44_tree = (Object)adaptor.create(IF44);
                    root_0 = (Object)adaptor.becomeRoot(IF44_tree, root_0);
                    }
                    char_literal45=(Token)match(input,26,FOLLOW_26_in_expr717); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expr720);
                    rvalue46=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue46.getTree());
                    char_literal47=(Token)match(input,27,FOLLOW_27_in_expr722); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr725);
                    expr48=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr48.getTree());
                    // MathExpr.g:107:29: ( ELSE expr )?
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
                            // MathExpr.g:107:30: ELSE expr
                            {
                            ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr728); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr731);
                            expr50=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // MathExpr.g:108:3: WHILE '(' rvalue ')' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE51=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE51_tree = (Object)adaptor.create(WHILE51);
                    root_0 = (Object)adaptor.becomeRoot(WHILE51_tree, root_0);
                    }
                    char_literal52=(Token)match(input,26,FOLLOW_26_in_expr740); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expr743);
                    rvalue53=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue53.getTree());
                    char_literal54=(Token)match(input,27,FOLLOW_27_in_expr745); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr748);
                    expr55=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr55.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:109:3: '{' exprList '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)match(input,41,FOLLOW_41_in_expr752); if (state.failed) return retval;
                    pushFollow(FOLLOW_exprList_in_expr755);
                    exprList57=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList57.getTree());
                    char_literal58=(Token)match(input,42,FOLLOW_42_in_expr757); if (state.failed) return retval;

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
    // $ANTLR end "expr"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // MathExpr.g:112:1: exprList : ( expr ( ';' )* )* -> ^( BLOCK ( expr )* ) ;
    public final MathExprParser.exprList_return exprList() throws RecognitionException {
        MathExprParser.exprList_return retval = new MathExprParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        MathExprParser.expr_return expr59 = null;


        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MathExpr.g:112:9: ( ( expr ( ';' )* )* -> ^( BLOCK ( expr )* ) )
            // MathExpr.g:113:3: ( expr ( ';' )* )*
            {
            // MathExpr.g:113:3: ( expr ( ';' )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RETURN && LA13_0<=IF)||LA13_0==WHILE||LA13_0==IDENT||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MathExpr.g:113:4: expr ( ';' )*
            	    {
            	    pushFollow(FOLLOW_expr_in_exprList770);
            	    expr59=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr59.getTree());
            	    // MathExpr.g:113:9: ( ';' )*
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
            	    	    char_literal60=(Token)match(input,40,FOLLOW_40_in_exprList772); if (state.failed) return retval; 
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
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:17: -> ^( BLOCK ( expr )* )
            {
                // MathExpr.g:113:21: ^( BLOCK ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:113:29: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "exprList"

    public static class argDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argDecl"
    // MathExpr.g:116:1: argDecl : type IDENT ;
    public final MathExprParser.argDecl_return argDecl() throws RecognitionException {
        MathExprParser.argDecl_return retval = new MathExprParser.argDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT62=null;
        MathExprParser.type_return type61 = null;


        Object IDENT62_tree=null;

        try {
            // MathExpr.g:116:8: ( type IDENT )
            // MathExpr.g:117:3: type IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_argDecl796);
            type61=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type61.getTree());
            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_argDecl798); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT62_tree = (Object)adaptor.create(IDENT62);
            root_0 = (Object)adaptor.becomeRoot(IDENT62_tree, root_0);
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
    // $ANTLR end "argDecl"

    public static class argsDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argsDecl"
    // MathExpr.g:119:1: argsDecl : ( argDecl ( ',' argDecl )* )? -> ^( ARGS_DECL ( argDecl )* ) ;
    public final MathExprParser.argsDecl_return argsDecl() throws RecognitionException {
        MathExprParser.argsDecl_return retval = new MathExprParser.argsDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        MathExprParser.argDecl_return argDecl63 = null;

        MathExprParser.argDecl_return argDecl65 = null;


        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_argDecl=new RewriteRuleSubtreeStream(adaptor,"rule argDecl");
        try {
            // MathExpr.g:119:9: ( ( argDecl ( ',' argDecl )* )? -> ^( ARGS_DECL ( argDecl )* ) )
            // MathExpr.g:120:3: ( argDecl ( ',' argDecl )* )?
            {
            // MathExpr.g:120:3: ( argDecl ( ',' argDecl )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // MathExpr.g:120:4: argDecl ( ',' argDecl )*
                    {
                    pushFollow(FOLLOW_argDecl_in_argsDecl809);
                    argDecl63=argDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argDecl.add(argDecl63.getTree());
                    // MathExpr.g:120:12: ( ',' argDecl )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // MathExpr.g:120:13: ',' argDecl
                    	    {
                    	    char_literal64=(Token)match(input,28,FOLLOW_28_in_argsDecl812); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal64);

                    	    pushFollow(FOLLOW_argDecl_in_argsDecl814);
                    	    argDecl65=argDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argDecl.add(argDecl65.getTree());

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
            // elements: argDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:30: -> ^( ARGS_DECL ( argDecl )* )
            {
                // MathExpr.g:120:34: ^( ARGS_DECL ( argDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS_DECL, "ARGS_DECL"), root_1);

                // MathExpr.g:120:46: ( argDecl )*
                while ( stream_argDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_argDecl.nextTree());

                }
                stream_argDecl.reset();

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
    // $ANTLR end "argsDecl"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // MathExpr.g:122:1: funcDecl : type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )* -> ^( FUNC_DECL IDENT type argsDecl exprList ) ;
    public final MathExprParser.funcDecl_return funcDecl() throws RecognitionException {
        MathExprParser.funcDecl_return retval = new MathExprParser.funcDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal74=null;
        MathExprParser.type_return type66 = null;

        MathExprParser.argsDecl_return argsDecl69 = null;

        MathExprParser.exprList_return exprList72 = null;


        Object IDENT67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_argsDecl=new RewriteRuleSubtreeStream(adaptor,"rule argsDecl");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // MathExpr.g:122:9: ( type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )* -> ^( FUNC_DECL IDENT type argsDecl exprList ) )
            // MathExpr.g:123:3: type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )*
            {
            pushFollow(FOLLOW_type_in_funcDecl838);
            type66=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type66.getTree());
            IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcDecl840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT67);

            char_literal68=(Token)match(input,26,FOLLOW_26_in_funcDecl842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal68);

            pushFollow(FOLLOW_argsDecl_in_funcDecl844);
            argsDecl69=argsDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argsDecl.add(argsDecl69.getTree());
            char_literal70=(Token)match(input,27,FOLLOW_27_in_funcDecl846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal70);

            char_literal71=(Token)match(input,41,FOLLOW_41_in_funcDecl848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal71);

            pushFollow(FOLLOW_exprList_in_funcDecl850);
            exprList72=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList72.getTree());
            char_literal73=(Token)match(input,42,FOLLOW_42_in_funcDecl852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal73);

            // MathExpr.g:123:48: ( ';' )*
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
            	    char_literal74=(Token)match(input,40,FOLLOW_40_in_funcDecl854); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal74);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: type, exprList, argsDecl, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:5: -> ^( FUNC_DECL IDENT type argsDecl exprList )
            {
                // MathExpr.g:124:9: ^( FUNC_DECL IDENT type argsDecl exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_argsDecl.nextTree());
                adaptor.addChild(root_1, stream_exprList.nextTree());

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
    // $ANTLR end "funcDecl"

    public static class macroDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "macroDecl"
    // MathExpr.g:127:1: macroDecl : '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) ;
    public final MathExprParser.macroDecl_return macroDecl() throws RecognitionException {
        MathExprParser.macroDecl_return retval = new MathExprParser.macroDecl_return();
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
            // MathExpr.g:127:10: ( '#include' (s1= STRING | s2= INCLUDE_STRING ) -> ^( INCLUDE ( $s1)? ( $s2)? ) )
            // MathExpr.g:128:3: '#include' (s1= STRING | s2= INCLUDE_STRING )
            {
            string_literal75=(Token)match(input,43,FOLLOW_43_in_macroDecl885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal75);

            // MathExpr.g:128:14: (s1= STRING | s2= INCLUDE_STRING )
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
                    // MathExpr.g:128:15: s1= STRING
                    {
                    s1=(Token)match(input,STRING,FOLLOW_STRING_in_macroDecl890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(s1);


                    }
                    break;
                case 2 :
                    // MathExpr.g:128:27: s2= INCLUDE_STRING
                    {
                    s2=(Token)match(input,INCLUDE_STRING,FOLLOW_INCLUDE_STRING_in_macroDecl896); if (state.failed) return retval; 
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
            // 128:47: -> ^( INCLUDE ( $s1)? ( $s2)? )
            {
                // MathExpr.g:128:51: ^( INCLUDE ( $s1)? ( $s2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLUDE, "INCLUDE"), root_1);

                // MathExpr.g:128:61: ( $s1)?
                if ( stream_s1.hasNext() ) {
                    adaptor.addChild(root_1, stream_s1.nextNode());

                }
                stream_s1.reset();
                // MathExpr.g:128:66: ( $s2)?
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
    // $ANTLR end "macroDecl"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // MathExpr.g:131:1: decl : ( funcDecl | macroDecl ) ;
    public final MathExprParser.decl_return decl() throws RecognitionException {
        MathExprParser.decl_return retval = new MathExprParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.funcDecl_return funcDecl76 = null;

        MathExprParser.macroDecl_return macroDecl77 = null;



        try {
            // MathExpr.g:131:5: ( ( funcDecl | macroDecl ) )
            // MathExpr.g:132:3: ( funcDecl | macroDecl )
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:132:3: ( funcDecl | macroDecl )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
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
                    // MathExpr.g:132:5: funcDecl
                    {
                    pushFollow(FOLLOW_funcDecl_in_decl926);
                    funcDecl76=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl76.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:132:16: macroDecl
                    {
                    pushFollow(FOLLOW_macroDecl_in_decl930);
                    macroDecl77=macroDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macroDecl77.getTree());

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
    // $ANTLR end "decl"

    public static class declList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declList"
    // MathExpr.g:135:1: declList : ( decl )* ;
    public final MathExprParser.declList_return declList() throws RecognitionException {
        MathExprParser.declList_return retval = new MathExprParser.declList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.decl_return decl78 = null;



        try {
            // MathExpr.g:135:9: ( ( decl )* )
            // MathExpr.g:136:3: ( decl )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:136:3: ( decl )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==IDENT||LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MathExpr.g:0:0: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_declList943);
            	    decl78=decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl78.getTree());

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
    // $ANTLR end "declList"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // MathExpr.g:139:1: program : declList ;
    public final MathExprParser.program_return program() throws RecognitionException {
        MathExprParser.program_return retval = new MathExprParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declList_return declList79 = null;



        try {
            // MathExpr.g:139:8: ( declList )
            // MathExpr.g:140:3: declList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declList_in_program955);
            declList79=declList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declList79.getTree());

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
    // $ANTLR end "program"

    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // MathExpr.g:143:1: start : program EOF -> ^( PROGRAM program ) ;
    public final MathExprParser.start_return start() throws RecognitionException {
        MathExprParser.start_return retval = new MathExprParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF81=null;
        MathExprParser.program_return program80 = null;


        Object EOF81_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            // MathExpr.g:143:6: ( program EOF -> ^( PROGRAM program ) )
            // MathExpr.g:144:3: program EOF
            {
            pushFollow(FOLLOW_program_in_start966);
            program80=program();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_program.add(program80.getTree());
            EOF81=(Token)match(input,EOF,FOLLOW_EOF_in_start970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF81);



            // AST REWRITE
            // elements: program
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:5: -> ^( PROGRAM program )
            {
                // MathExpr.g:146:9: ^( PROGRAM program )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_program.nextTree());

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
        // MathExpr.g:83:3: ( IDENT ( arrayIndex0 rvalue ']' )* )
        // MathExpr.g:83:3: IDENT ( arrayIndex0 rvalue ']' )*
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred9_MathExpr554); if (state.failed) return ;
        // MathExpr.g:83:9: ( arrayIndex0 rvalue ']' )*
        loop21:
        do {
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }


            switch (alt21) {
        	case 1 :
        	    // MathExpr.g:83:10: arrayIndex0 rvalue ']'
        	    {
        	    pushFollow(FOLLOW_arrayIndex0_in_synpred9_MathExpr557);
        	    arrayIndex0();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_rvalue_in_synpred9_MathExpr560);
        	    rvalue();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,25,FOLLOW_25_in_synpred9_MathExpr562); if (state.failed) return ;

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
        // MathExpr.g:107:30: ( ELSE expr )
        // MathExpr.g:107:30: ELSE expr
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred23_MathExpr728); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred23_MathExpr731);
        expr();

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


 

    public static final BitSet FOLLOW_IDENT_in_type0410 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_type0413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_type0415 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_type0_in_type426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_term457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_term461 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_logic_in_term464 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_term466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rvalue_in_args479 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_args482 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_args484 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENT_in_funcCall508 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcCall510 = new BitSet(new long[]{0x000000000CB00000L});
    public static final BitSet FOLLOW_args_in_funcCall512 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_funcCall514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_arrayIndex0536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_lvalue554 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue557 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_lvalue560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_lvalue562 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_IDENT_in_lvalue569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_rvalue580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_mult591 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_mult594 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_term_in_mult605 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_mult_in_add618 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_add621 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_mult_in_add630 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_add_in_logic643 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_set_in_logic646 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_add_in_logic671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expr685 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_expr687 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expr690 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_expr697 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expr704 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expr707 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expr714 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr717 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expr720 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expr722 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expr_in_expr725 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expr728 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expr_in_expr731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expr737 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr740 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_expr743 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expr745 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expr_in_expr748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expr752 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_exprList_in_expr755 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expr757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList770 = new BitSet(new long[]{0x00000300008000B2L});
    public static final BitSet FOLLOW_40_in_exprList772 = new BitSet(new long[]{0x00000300008000B2L});
    public static final BitSet FOLLOW_type_in_argDecl796 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_argDecl798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argDecl_in_argsDecl809 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_argsDecl812 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_argDecl_in_argsDecl814 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_in_funcDecl838 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_funcDecl840 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcDecl842 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_argsDecl_in_funcDecl844 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_funcDecl846 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_funcDecl848 = new BitSet(new long[]{0x00000600008000B0L});
    public static final BitSet FOLLOW_exprList_in_funcDecl850 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_funcDecl852 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_funcDecl854 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_43_in_macroDecl885 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_STRING_in_macroDecl890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_STRING_in_macroDecl896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_decl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroDecl_in_decl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_declList943 = new BitSet(new long[]{0x0000080000800002L});
    public static final BitSet FOLLOW_declList_in_program955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_program_in_start966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred9_MathExpr554 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_arrayIndex0_in_synpred9_MathExpr557 = new BitSet(new long[]{0x0000000004B00000L});
    public static final BitSet FOLLOW_rvalue_in_synpred9_MathExpr560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred9_MathExpr562 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred23_MathExpr728 = new BitSet(new long[]{0x00000200008000B0L});
    public static final BitSet FOLLOW_expr_in_synpred23_MathExpr731 = new BitSet(new long[]{0x0000000000000002L});

}