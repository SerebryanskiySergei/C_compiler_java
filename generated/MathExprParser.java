// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-12-07 19:10:57

package generated;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.util.HashMap;



public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UNKNOWN", "BLOCK", "PARAMS", "CALL", "CONVERT", "IF", "ELSE", "FOR", "WHILE", "AND", "OR", "NOT", "XOR", "INT_DIV", "INT_MOD", "SHR", "SHL", "IN", "VAR", "RETURN", "ARRAY", "FUNCTION", "PROGRAM", "TRUE", "FALSE", "DO", "COUNT", "WS", "COMMENT", "DIGIT", "LETTER", "NUMBER", "STRING", "IDENTIFIER", "ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", "ASSIGN", "NOTEQUALS", "EQUALS", "GT", "LT", "GE", "LE", "'('", "')'", "','", "'{'", "'}'", "';'", "'['", "']'"
    };
    public static final int SHR=19;
    public static final int FUNCTION=25;
    public static final int LT=48;
    public static final int BIT_AND=42;
    public static final int WHILE=12;
    public static final int SHL=20;
    public static final int LETTER=34;
    public static final int FOR=11;
    public static final int DO=29;
    public static final int SUB=39;
    public static final int EQUALS=46;
    public static final int COUNT=30;
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
    public static final int MUL=40;
    public static final int TRUE=27;
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


        public MathExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MathExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[83+1];
             
             
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


    public static class identifier_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // MathExpr.g:70:1: identifier : IDENTIFIER ;
    public final MathExprParser.identifier_return identifier() throws RecognitionException {
        MathExprParser.identifier_return retval = new MathExprParser.identifier_return();
        retval.start = input.LT(1);
        int identifier_StartIndex = input.index();
        AstNode root_0 = null;

        Token IDENTIFIER1=null;

        AstNode IDENTIFIER1_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // MathExpr.g:70:11: ( IDENTIFIER )
            // MathExpr.g:70:13: IDENTIFIER
            {
            root_0 = (AstNode)adaptor.nil();

            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier980); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER1_tree = (AstNode)adaptor.create(IDENTIFIER1);
            adaptor.addChild(root_0, IDENTIFIER1_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, identifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class group_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "group"
    // MathExpr.g:72:1: group : ( '(' term ')' | DIGIT | TRUE | FALSE | identifier | call );
    public final MathExprParser.group_return group() throws RecognitionException {
        MathExprParser.group_return retval = new MathExprParser.group_return();
        retval.start = input.LT(1);
        int group_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        Token DIGIT5=null;
        Token TRUE6=null;
        Token FALSE7=null;
        MathExprParser.term_return term3 = null;

        MathExprParser.identifier_return identifier8 = null;

        MathExprParser.call_return call9 = null;


        AstNode char_literal2_tree=null;
        AstNode char_literal4_tree=null;
        AstNode DIGIT5_tree=null;
        AstNode TRUE6_tree=null;
        AstNode FALSE7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // MathExpr.g:72:6: ( '(' term ')' | DIGIT | TRUE | FALSE | identifier | call )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt1=1;
                }
                break;
            case DIGIT:
                {
                alt1=2;
                }
                break;
            case TRUE:
                {
                alt1=3;
                }
                break;
            case FALSE:
                {
                alt1=4;
                }
                break;
            case IDENTIFIER:
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5==51) ) {
                    alt1=6;
                }
                else if ( (LA1_5==EOF||(LA1_5>=AND && LA1_5<=OR)||(LA1_5>=INT_DIV && LA1_5<=INT_MOD)||(LA1_5>=ADD && LA1_5<=BIT_OR)||(LA1_5>=NOTEQUALS && LA1_5<=LE)||(LA1_5>=52 && LA1_5<=53)||LA1_5==56||LA1_5==58) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // MathExpr.g:73:3: '(' term ')'
                    {
                    root_0 = (AstNode)adaptor.nil();

                    char_literal2=(Token)match(input,51,FOLLOW_51_in_group990); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_group993);
                    term3=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term3.getTree());
                    char_literal4=(Token)match(input,52,FOLLOW_52_in_group995); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:74:5: DIGIT
                    {
                    root_0 = (AstNode)adaptor.nil();

                    DIGIT5=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_group1002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIGIT5_tree = (AstNode)adaptor.create(DIGIT5);
                    adaptor.addChild(root_0, DIGIT5_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:75:5: TRUE
                    {
                    root_0 = (AstNode)adaptor.nil();

                    TRUE6=(Token)match(input,TRUE,FOLLOW_TRUE_in_group1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE6_tree = (AstNode)adaptor.create(TRUE6);
                    adaptor.addChild(root_0, TRUE6_tree);
                    }

                    }
                    break;
                case 4 :
                    // MathExpr.g:76:5: FALSE
                    {
                    root_0 = (AstNode)adaptor.nil();

                    FALSE7=(Token)match(input,FALSE,FOLLOW_FALSE_in_group1014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE7_tree = (AstNode)adaptor.create(FALSE7);
                    adaptor.addChild(root_0, FALSE7_tree);
                    }

                    }
                    break;
                case 5 :
                    // MathExpr.g:77:5: identifier
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_group1020);
                    identifier8=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier8.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:78:5: call
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_call_in_group1026);
                    call9=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, group_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "group"

    public static class parameters_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // MathExpr.g:81:1: parameters : ( term ( ',' term )* )? ;
    public final MathExprParser.parameters_return parameters() throws RecognitionException {
        MathExprParser.parameters_return retval = new MathExprParser.parameters_return();
        retval.start = input.LT(1);
        int parameters_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal11=null;
        MathExprParser.term_return term10 = null;

        MathExprParser.term_return term12 = null;


        AstNode char_literal11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // MathExpr.g:81:11: ( ( term ( ',' term )* )? )
            // MathExpr.g:81:13: ( term ( ',' term )* )?
            {
            root_0 = (AstNode)adaptor.nil();

            // MathExpr.g:81:13: ( term ( ',' term )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NOT||(LA3_0>=TRUE && LA3_0<=FALSE)||LA3_0==DIGIT||LA3_0==IDENTIFIER||LA3_0==51) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MathExpr.g:81:15: term ( ',' term )*
                    {
                    pushFollow(FOLLOW_term_in_parameters1036);
                    term10=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term10.getTree());
                    // MathExpr.g:81:20: ( ',' term )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==53) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // MathExpr.g:81:21: ',' term
                    	    {
                    	    char_literal11=(Token)match(input,53,FOLLOW_53_in_parameters1039); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_term_in_parameters1042);
                    	    term12=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameters"

    public static class call_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // MathExpr.g:83:1: call : identifier '(' parameters ')' -> ^( CALL identifier ^( PARAMS ( parameters )? ) ) ;
    public final MathExprParser.call_return call() throws RecognitionException {
        MathExprParser.call_return retval = new MathExprParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        MathExprParser.identifier_return identifier13 = null;

        MathExprParser.parameters_return parameters15 = null;


        AstNode char_literal14_tree=null;
        AstNode char_literal16_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // MathExpr.g:83:5: ( identifier '(' parameters ')' -> ^( CALL identifier ^( PARAMS ( parameters )? ) ) )
            // MathExpr.g:83:7: identifier '(' parameters ')'
            {
            pushFollow(FOLLOW_identifier_in_call1056);
            identifier13=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier13.getTree());
            char_literal14=(Token)match(input,51,FOLLOW_51_in_call1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal14);

            pushFollow(FOLLOW_parameters_in_call1060);
            parameters15=parameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameters.add(parameters15.getTree());
            char_literal16=(Token)match(input,52,FOLLOW_52_in_call1062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal16);



            // AST REWRITE
            // elements: parameters, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 83:38: -> ^( CALL identifier ^( PARAMS ( parameters )? ) )
            {
                // MathExpr.g:83:41: ^( CALL identifier ^( PARAMS ( parameters )? ) )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:83:59: ^( PARAMS ( parameters )? )
                {
                AstNode root_2 = (AstNode)adaptor.nil();
                root_2 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(PARAMS, "PARAMS"), root_2);

                // MathExpr.g:83:68: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class not_logic_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_logic"
    // MathExpr.g:85:1: not_logic : ( group | NOT not_logic );
    public final MathExprParser.not_logic_return not_logic() throws RecognitionException {
        MathExprParser.not_logic_return retval = new MathExprParser.not_logic_return();
        retval.start = input.LT(1);
        int not_logic_StartIndex = input.index();
        AstNode root_0 = null;

        Token NOT18=null;
        MathExprParser.group_return group17 = null;

        MathExprParser.not_logic_return not_logic19 = null;


        AstNode NOT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // MathExpr.g:85:10: ( group | NOT not_logic )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=TRUE && LA4_0<=FALSE)||LA4_0==DIGIT||LA4_0==IDENTIFIER||LA4_0==51) ) {
                alt4=1;
            }
            else if ( (LA4_0==NOT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:85:14: group
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_group_in_not_logic1088);
                    group17=group();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, group17.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:85:22: NOT not_logic
                    {
                    root_0 = (AstNode)adaptor.nil();

                    NOT18=(Token)match(input,NOT,FOLLOW_NOT_in_not_logic1092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT18_tree = (AstNode)adaptor.create(NOT18);
                    root_0 = (AstNode)adaptor.becomeRoot(NOT18_tree, root_0);
                    }
                    pushFollow(FOLLOW_not_logic_in_not_logic1095);
                    not_logic19=not_logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, not_logic19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, not_logic_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "not_logic"

    public static class multiplex_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplex"
    // MathExpr.g:87:1: multiplex : not_logic ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not_logic )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);
        int multiplex_StartIndex = input.index();
        AstNode root_0 = null;

        Token set21=null;
        MathExprParser.not_logic_return not_logic20 = null;

        MathExprParser.not_logic_return not_logic22 = null;


        AstNode set21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // MathExpr.g:87:10: ( not_logic ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not_logic )* )
            // MathExpr.g:87:13: not_logic ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not_logic )*
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_not_logic_in_multiplex1104);
            not_logic20=not_logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, not_logic20.getTree());
            // MathExpr.g:87:23: ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not_logic )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=INT_DIV && LA5_0<=INT_MOD)||(LA5_0>=MUL && LA5_0<=BIT_AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MathExpr.g:87:25: ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not_logic
            	    {
            	    set21=(Token)input.LT(1);
            	    set21=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT_DIV && input.LA(1)<=INT_MOD)||(input.LA(1)>=MUL && input.LA(1)<=BIT_AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(set21), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_not_logic_in_multiplex1131);
            	    not_logic22=not_logic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, not_logic22.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, multiplex_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplex"

    public static class add_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // MathExpr.g:89:1: add : multiplex ( ( ADD | SUB | BIT_OR ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);
        int add_StartIndex = input.index();
        AstNode root_0 = null;

        Token set24=null;
        MathExprParser.multiplex_return multiplex23 = null;

        MathExprParser.multiplex_return multiplex25 = null;


        AstNode set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // MathExpr.g:89:4: ( multiplex ( ( ADD | SUB | BIT_OR ) multiplex )* )
            // MathExpr.g:89:8: multiplex ( ( ADD | SUB | BIT_OR ) multiplex )*
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_multiplex_in_add1145);
            multiplex23=multiplex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex23.getTree());
            // MathExpr.g:89:19: ( ( ADD | SUB | BIT_OR ) multiplex )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ADD && LA6_0<=SUB)||LA6_0==BIT_OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:89:21: ( ADD | SUB | BIT_OR ) multiplex
            	    {
            	    set24=(Token)input.LT(1);
            	    set24=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB)||input.LA(1)==BIT_OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(set24), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplex_in_add1165);
            	    multiplex25=multiplex();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, add_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class compare_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // MathExpr.g:91:1: compare : add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )? ;
    public final MathExprParser.compare_return compare() throws RecognitionException {
        MathExprParser.compare_return retval = new MathExprParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        AstNode root_0 = null;

        Token set27=null;
        MathExprParser.add_return add26 = null;

        MathExprParser.add_return add28 = null;


        AstNode set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // MathExpr.g:91:8: ( add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )? )
            // MathExpr.g:91:10: add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_add_in_compare1195);
            add26=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add26.getTree());
            // MathExpr.g:91:14: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // MathExpr.g:91:16: ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add
                    {
                    set27=(Token)input.LT(1);
                    set27=(Token)input.LT(1);
                    if ( (input.LA(1)>=NOTEQUALS && input.LA(1)<=LE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(set27), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_compare1227);
                    add28=add();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add28.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class and_logic_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_logic"
    // MathExpr.g:93:1: and_logic : compare ( AND compare )* ;
    public final MathExprParser.and_logic_return and_logic() throws RecognitionException {
        MathExprParser.and_logic_return retval = new MathExprParser.and_logic_return();
        retval.start = input.LT(1);
        int and_logic_StartIndex = input.index();
        AstNode root_0 = null;

        Token AND30=null;
        MathExprParser.compare_return compare29 = null;

        MathExprParser.compare_return compare31 = null;


        AstNode AND30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // MathExpr.g:93:10: ( compare ( AND compare )* )
            // MathExpr.g:93:12: compare ( AND compare )*
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_compare_in_and_logic1240);
            compare29=compare();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compare29.getTree());
            // MathExpr.g:93:20: ( AND compare )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:93:22: AND compare
            	    {
            	    AND30=(Token)match(input,AND,FOLLOW_AND_in_and_logic1244); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND30_tree = (AstNode)adaptor.create(AND30);
            	    root_0 = (AstNode)adaptor.becomeRoot(AND30_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_compare_in_and_logic1247);
            	    compare31=compare();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, and_logic_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_logic"

    public static class or_logic_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_logic"
    // MathExpr.g:95:1: or_logic : and_logic ( OR and_logic )* ;
    public final MathExprParser.or_logic_return or_logic() throws RecognitionException {
        MathExprParser.or_logic_return retval = new MathExprParser.or_logic_return();
        retval.start = input.LT(1);
        int or_logic_StartIndex = input.index();
        AstNode root_0 = null;

        Token OR33=null;
        MathExprParser.and_logic_return and_logic32 = null;

        MathExprParser.and_logic_return and_logic34 = null;


        AstNode OR33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // MathExpr.g:95:9: ( and_logic ( OR and_logic )* )
            // MathExpr.g:95:11: and_logic ( OR and_logic )*
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_and_logic_in_or_logic1261);
            and_logic32=and_logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic32.getTree());
            // MathExpr.g:95:21: ( OR and_logic )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MathExpr.g:95:23: OR and_logic
            	    {
            	    OR33=(Token)match(input,OR,FOLLOW_OR_in_or_logic1265); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR33_tree = (AstNode)adaptor.create(OR33);
            	    root_0 = (AstNode)adaptor.becomeRoot(OR33_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_logic_in_or_logic1268);
            	    and_logic34=and_logic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic34.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, or_logic_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "or_logic"

    public static class term_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // MathExpr.g:97:1: term : or_logic ;
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.or_logic_return or_logic35 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // MathExpr.g:97:5: ( or_logic )
            // MathExpr.g:97:7: or_logic
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_or_logic_in_term1280);
            or_logic35=or_logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_logic35.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, term_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // MathExpr.g:99:1: varDeclaration : identifier ( ASSIGN term )? ;
    public final MathExprParser.varDeclaration_return varDeclaration() throws RecognitionException {
        MathExprParser.varDeclaration_return retval = new MathExprParser.varDeclaration_return();
        retval.start = input.LT(1);
        int varDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        Token ASSIGN37=null;
        MathExprParser.identifier_return identifier36 = null;

        MathExprParser.term_return term38 = null;


        AstNode ASSIGN37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // MathExpr.g:99:15: ( identifier ( ASSIGN term )? )
            // MathExpr.g:99:17: identifier ( ASSIGN term )?
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_varDeclaration1289);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier36.getTree());
            // MathExpr.g:99:28: ( ASSIGN term )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // MathExpr.g:99:29: ASSIGN term
                    {
                    ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration1292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN37_tree = (AstNode)adaptor.create(ASSIGN37);
                    root_0 = (AstNode)adaptor.becomeRoot(ASSIGN37_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_varDeclaration1295);
                    term38=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term38.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, varDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varsDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varsDeclaration"
    // MathExpr.g:101:1: varsDeclaration : identifier varDeclaration ( ',' varDeclaration )* -> ^( VAR ^( identifier ( varDeclaration )+ ) ) ;
    public final MathExprParser.varsDeclaration_return varsDeclaration() throws RecognitionException {
        MathExprParser.varsDeclaration_return retval = new MathExprParser.varsDeclaration_return();
        retval.start = input.LT(1);
        int varsDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal41=null;
        MathExprParser.identifier_return identifier39 = null;

        MathExprParser.varDeclaration_return varDeclaration40 = null;

        MathExprParser.varDeclaration_return varDeclaration42 = null;


        AstNode char_literal41_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // MathExpr.g:101:16: ( identifier varDeclaration ( ',' varDeclaration )* -> ^( VAR ^( identifier ( varDeclaration )+ ) ) )
            // MathExpr.g:101:18: identifier varDeclaration ( ',' varDeclaration )*
            {
            pushFollow(FOLLOW_identifier_in_varsDeclaration1304);
            identifier39=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier39.getTree());
            pushFollow(FOLLOW_varDeclaration_in_varsDeclaration1306);
            varDeclaration40=varDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclaration.add(varDeclaration40.getTree());
            // MathExpr.g:101:44: ( ',' varDeclaration )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==53) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred26_MathExpr()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // MathExpr.g:101:46: ',' varDeclaration
            	    {
            	    char_literal41=(Token)match(input,53,FOLLOW_53_in_varsDeclaration1310); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal41);

            	    pushFollow(FOLLOW_varDeclaration_in_varsDeclaration1312);
            	    varDeclaration42=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDeclaration.add(varDeclaration42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: varDeclaration, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 101:68: -> ^( VAR ^( identifier ( varDeclaration )+ ) )
            {
                // MathExpr.g:101:71: ^( VAR ^( identifier ( varDeclaration )+ ) )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(VAR, "VAR"), root_1);

                // MathExpr.g:101:77: ^( identifier ( varDeclaration )+ )
                {
                AstNode root_2 = (AstNode)adaptor.nil();
                root_2 = (AstNode)adaptor.becomeRoot(stream_identifier.nextNode(), root_2);

                if ( !(stream_varDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, varsDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varsDeclaration"

    public static class blockExpr_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExpr"
    // MathExpr.g:104:1: blockExpr : '{' expressionsList '}' ;
    public final MathExprParser.blockExpr_return blockExpr() throws RecognitionException {
        MathExprParser.blockExpr_return retval = new MathExprParser.blockExpr_return();
        retval.start = input.LT(1);
        int blockExpr_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        MathExprParser.expressionsList_return expressionsList44 = null;


        AstNode char_literal43_tree=null;
        AstNode char_literal45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // MathExpr.g:104:10: ( '{' expressionsList '}' )
            // MathExpr.g:104:12: '{' expressionsList '}'
            {
            root_0 = (AstNode)adaptor.nil();

            char_literal43=(Token)match(input,54,FOLLOW_54_in_blockExpr1337); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionsList_in_blockExpr1340);
            expressionsList44=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList44.getTree());
            char_literal45=(Token)match(input,55,FOLLOW_55_in_blockExpr1342); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, blockExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExpr"

    public static class termOrTrue_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termOrTrue"
    // MathExpr.g:106:1: termOrTrue : ( term | () -> TRUE );
    public final MathExprParser.termOrTrue_return termOrTrue() throws RecognitionException {
        MathExprParser.termOrTrue_return retval = new MathExprParser.termOrTrue_return();
        retval.start = input.LT(1);
        int termOrTrue_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.term_return term46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // MathExpr.g:106:11: ( term | () -> TRUE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT||(LA12_0>=TRUE && LA12_0<=FALSE)||LA12_0==DIGIT||LA12_0==IDENTIFIER||LA12_0==51) ) {
                alt12=1;
            }
            else if ( (LA12_0==56) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // MathExpr.g:107:3: term
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_term_in_termOrTrue1353);
                    term46=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term46.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:108:5: ()
                    {
                    // MathExpr.g:108:5: ()
                    // MathExpr.g:108:7: 
                    {
                    }



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

                    root_0 = (AstNode)adaptor.nil();
                    // 108:9: -> TRUE
                    {
                        adaptor.addChild(root_0, (AstNode)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, termOrTrue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termOrTrue"

    public static class expressionBase_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionBase"
    // MathExpr.g:111:1: expressionBase : ( identifier ASSIGN term | call | varsDeclaration );
    public final MathExprParser.expressionBase_return expressionBase() throws RecognitionException {
        MathExprParser.expressionBase_return retval = new MathExprParser.expressionBase_return();
        retval.start = input.LT(1);
        int expressionBase_StartIndex = input.index();
        AstNode root_0 = null;

        Token ASSIGN48=null;
        MathExprParser.identifier_return identifier47 = null;

        MathExprParser.term_return term49 = null;

        MathExprParser.call_return call50 = null;

        MathExprParser.varsDeclaration_return varsDeclaration51 = null;


        AstNode ASSIGN48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // MathExpr.g:111:15: ( identifier ASSIGN term | call | varsDeclaration )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    alt13=3;
                    }
                    break;
                case ASSIGN:
                    {
                    alt13=1;
                    }
                    break;
                case 51:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // MathExpr.g:112:3: identifier ASSIGN term
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_expressionBase1375);
                    identifier47=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier47.getTree());
                    ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expressionBase1377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN48_tree = (AstNode)adaptor.create(ASSIGN48);
                    root_0 = (AstNode)adaptor.becomeRoot(ASSIGN48_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_expressionBase1380);
                    term49=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term49.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:113:3: call
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_call_in_expressionBase1384);
                    call50=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call50.getTree());

                    }
                    break;
                case 3 :
                    // MathExpr.g:114:3: varsDeclaration
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_varsDeclaration_in_expressionBase1388);
                    varsDeclaration51=varsDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varsDeclaration51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, expressionBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionBase"

    public static class expression_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // MathExpr.g:117:1: expression : ( expressionBase ';' | IF '(' term ')' expression ( ELSE expression )? | WHILE '(' term ')' expression | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expression | DO expression WHILE '(' term ')' -> ^( DO expression ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration );
    public final MathExprParser.expression_return expression() throws RecognitionException {
        MathExprParser.expression_return retval = new MathExprParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal53=null;
        Token IF54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token ELSE59=null;
        Token WHILE61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token FOR66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token DO75=null;
        Token WHILE77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token RETURN81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        MathExprParser.expressionBase_return expressionBase52 = null;

        MathExprParser.term_return term56 = null;

        MathExprParser.expression_return expression58 = null;

        MathExprParser.expression_return expression60 = null;

        MathExprParser.term_return term63 = null;

        MathExprParser.expression_return expression65 = null;

        MathExprParser.expressionsList2_return expressionsList268 = null;

        MathExprParser.termOrTrue_return termOrTrue70 = null;

        MathExprParser.expressionsList2_return expressionsList272 = null;

        MathExprParser.expression_return expression74 = null;

        MathExprParser.expression_return expression76 = null;

        MathExprParser.term_return term79 = null;

        MathExprParser.term_return term82 = null;

        MathExprParser.call_return call84 = null;

        MathExprParser.blockExpr_return blockExpr86 = null;

        MathExprParser.array_declaration_return array_declaration87 = null;


        AstNode char_literal53_tree=null;
        AstNode IF54_tree=null;
        AstNode char_literal55_tree=null;
        AstNode char_literal57_tree=null;
        AstNode ELSE59_tree=null;
        AstNode WHILE61_tree=null;
        AstNode char_literal62_tree=null;
        AstNode char_literal64_tree=null;
        AstNode FOR66_tree=null;
        AstNode char_literal67_tree=null;
        AstNode char_literal69_tree=null;
        AstNode char_literal71_tree=null;
        AstNode char_literal73_tree=null;
        AstNode DO75_tree=null;
        AstNode WHILE77_tree=null;
        AstNode char_literal78_tree=null;
        AstNode char_literal80_tree=null;
        AstNode RETURN81_tree=null;
        AstNode char_literal83_tree=null;
        AstNode char_literal85_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // MathExpr.g:117:11: ( expressionBase ';' | IF '(' term ')' expression ( ELSE expression )? | WHILE '(' term ')' expression | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expression | DO expression WHILE '(' term ')' -> ^( DO expression ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // MathExpr.g:118:3: expressionBase ';'
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_expressionBase_in_expression1398);
                    expressionBase52=expressionBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionBase52.getTree());
                    char_literal53=(Token)match(input,56,FOLLOW_56_in_expression1400); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:119:3: IF '(' term ')' expression ( ELSE expression )?
                    {
                    root_0 = (AstNode)adaptor.nil();

                    IF54=(Token)match(input,IF,FOLLOW_IF_in_expression1405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF54_tree = (AstNode)adaptor.create(IF54);
                    root_0 = (AstNode)adaptor.becomeRoot(IF54_tree, root_0);
                    }
                    char_literal55=(Token)match(input,51,FOLLOW_51_in_expression1408); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_expression1411);
                    term56=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term56.getTree());
                    char_literal57=(Token)match(input,52,FOLLOW_52_in_expression1413); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1416);
                    expression58=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression58.getTree());
                    // MathExpr.g:119:33: ( ELSE expression )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred31_MathExpr()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // MathExpr.g:119:34: ELSE expression
                            {
                            ELSE59=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression1419); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_expression1422);
                            expression60=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MathExpr.g:120:3: WHILE '(' term ')' expression
                    {
                    root_0 = (AstNode)adaptor.nil();

                    WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_expression1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE61_tree = (AstNode)adaptor.create(WHILE61);
                    root_0 = (AstNode)adaptor.becomeRoot(WHILE61_tree, root_0);
                    }
                    char_literal62=(Token)match(input,51,FOLLOW_51_in_expression1431); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_expression1434);
                    term63=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term63.getTree());
                    char_literal64=(Token)match(input,52,FOLLOW_52_in_expression1436); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1439);
                    expression65=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:121:3: FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expression
                    {
                    root_0 = (AstNode)adaptor.nil();

                    FOR66=(Token)match(input,FOR,FOLLOW_FOR_in_expression1443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR66_tree = (AstNode)adaptor.create(FOR66);
                    root_0 = (AstNode)adaptor.becomeRoot(FOR66_tree, root_0);
                    }
                    char_literal67=(Token)match(input,51,FOLLOW_51_in_expression1446); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList2_in_expression1449);
                    expressionsList268=expressionsList2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList268.getTree());
                    char_literal69=(Token)match(input,56,FOLLOW_56_in_expression1451); if (state.failed) return retval;
                    pushFollow(FOLLOW_termOrTrue_in_expression1454);
                    termOrTrue70=termOrTrue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrTrue70.getTree());
                    char_literal71=(Token)match(input,56,FOLLOW_56_in_expression1456); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList2_in_expression1459);
                    expressionsList272=expressionsList2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList272.getTree());
                    char_literal73=(Token)match(input,52,FOLLOW_52_in_expression1461); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_expression1464);
                    expression74=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression74.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:122:3: DO expression WHILE '(' term ')'
                    {
                    DO75=(Token)match(input,DO,FOLLOW_DO_in_expression1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO75);

                    pushFollow(FOLLOW_expression_in_expression1471);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression76.getTree());
                    WHILE77=(Token)match(input,WHILE,FOLLOW_WHILE_in_expression1473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE77);

                    char_literal78=(Token)match(input,51,FOLLOW_51_in_expression1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal78);

                    pushFollow(FOLLOW_term_in_expression1477);
                    term79=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term79.getTree());
                    char_literal80=(Token)match(input,52,FOLLOW_52_in_expression1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal80);



                    // AST REWRITE
                    // elements: WHILE, DO, expression, term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AstNode)adaptor.nil();
                    // 122:37: -> ^( DO expression ^( WHILE term ) )
                    {
                        // MathExpr.g:122:40: ^( DO expression ^( WHILE term ) )
                        {
                        AstNode root_1 = (AstNode)adaptor.nil();
                        root_1 = (AstNode)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // MathExpr.g:122:56: ^( WHILE term )
                        {
                        AstNode root_2 = (AstNode)adaptor.nil();
                        root_2 = (AstNode)adaptor.becomeRoot(stream_WHILE.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_term.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // MathExpr.g:123:3: RETURN term ';'
                    {
                    root_0 = (AstNode)adaptor.nil();

                    RETURN81=(Token)match(input,RETURN,FOLLOW_RETURN_in_expression1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN81_tree = (AstNode)adaptor.create(RETURN81);
                    root_0 = (AstNode)adaptor.becomeRoot(RETURN81_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_expression1501);
                    term82=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term82.getTree());
                    char_literal83=(Token)match(input,56,FOLLOW_56_in_expression1503); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // MathExpr.g:124:3: call ';'
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_call_in_expression1508);
                    call84=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call84.getTree());
                    char_literal85=(Token)match(input,56,FOLLOW_56_in_expression1510); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // MathExpr.g:125:3: blockExpr
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_blockExpr_in_expression1515);
                    blockExpr86=blockExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExpr86.getTree());

                    }
                    break;
                case 9 :
                    // MathExpr.g:126:3: array_declaration
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_array_declaration_in_expression1519);
                    array_declaration87=array_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_declaration87.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionsList_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionsList"
    // MathExpr.g:129:1: expressionsList : ( expression ( ( ';' )* expression )* )? ( ';' )* -> ^( BLOCK ( expression )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);
        int expressionsList_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal89=null;
        Token char_literal91=null;
        MathExprParser.expression_return expression88 = null;

        MathExprParser.expression_return expression90 = null;


        AstNode char_literal89_tree=null;
        AstNode char_literal91_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // MathExpr.g:129:16: ( ( expression ( ( ';' )* expression )* )? ( ';' )* -> ^( BLOCK ( expression )* ) )
            // MathExpr.g:129:18: ( expression ( ( ';' )* expression )* )? ( ';' )*
            {
            // MathExpr.g:129:18: ( expression ( ( ';' )* expression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IF||(LA18_0>=FOR && LA18_0<=WHILE)||LA18_0==RETURN||LA18_0==DO||LA18_0==IDENTIFIER||LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // MathExpr.g:129:20: expression ( ( ';' )* expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expressionsList1529);
                    expression88=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());
                    // MathExpr.g:129:31: ( ( ';' )* expression )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // MathExpr.g:129:33: ( ';' )* expression
                    	    {
                    	    // MathExpr.g:129:33: ( ';' )*
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==56) ) {
                    	            alt16=1;
                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // MathExpr.g:0:0: ';'
                    	    	    {
                    	    	    char_literal89=(Token)match(input,56,FOLLOW_56_in_expressionsList1533); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_56.add(char_literal89);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop16;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_expression_in_expressionsList1536);
                    	    expression90=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // MathExpr.g:129:55: ( ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MathExpr.g:0:0: ';'
            	    {
            	    char_literal91=(Token)match(input,56,FOLLOW_56_in_expressionsList1544); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_56.add(char_literal91);


            	    }
            	    break;

            	default :
            	    break loop19;
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

            root_0 = (AstNode)adaptor.nil();
            // 129:61: -> ^( BLOCK ( expression )* )
            {
                // MathExpr.g:129:65: ^( BLOCK ( expression )* )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:129:73: ( expression )*
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

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, expressionsList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionsList"

    public static class expressionsList2_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionsList2"
    // MathExpr.g:130:1: expressionsList2 : ( expressionBase ( ',' expressionBase )* )? -> ^( BLOCK ( expressionBase )* ) ;
    public final MathExprParser.expressionsList2_return expressionsList2() throws RecognitionException {
        MathExprParser.expressionsList2_return retval = new MathExprParser.expressionsList2_return();
        retval.start = input.LT(1);
        int expressionsList2_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal93=null;
        MathExprParser.expressionBase_return expressionBase92 = null;

        MathExprParser.expressionBase_return expressionBase94 = null;


        AstNode char_literal93_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expressionBase=new RewriteRuleSubtreeStream(adaptor,"rule expressionBase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // MathExpr.g:130:17: ( ( expressionBase ( ',' expressionBase )* )? -> ^( BLOCK ( expressionBase )* ) )
            // MathExpr.g:130:19: ( expressionBase ( ',' expressionBase )* )?
            {
            // MathExpr.g:130:19: ( expressionBase ( ',' expressionBase )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // MathExpr.g:130:21: expressionBase ( ',' expressionBase )*
                    {
                    pushFollow(FOLLOW_expressionBase_in_expressionsList21566);
                    expressionBase92=expressionBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionBase.add(expressionBase92.getTree());
                    // MathExpr.g:130:36: ( ',' expressionBase )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==53) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // MathExpr.g:130:38: ',' expressionBase
                    	    {
                    	    char_literal93=(Token)match(input,53,FOLLOW_53_in_expressionsList21570); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal93);

                    	    pushFollow(FOLLOW_expressionBase_in_expressionsList21572);
                    	    expressionBase94=expressionBase();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionBase.add(expressionBase94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 130:64: -> ^( BLOCK ( expressionBase )* )
            {
                // MathExpr.g:130:68: ^( BLOCK ( expressionBase )* )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:130:76: ( expressionBase )*
                while ( stream_expressionBase.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionBase.nextTree());

                }
                stream_expressionBase.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, expressionsList2_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionsList2"

    public static class array_type_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_type"
    // MathExpr.g:132:1: array_type : identifier '[' ( term )? ']' -> ^( ARRAY identifier ^( COUNT ( term )? ) ) ;
    public final MathExprParser.array_type_return array_type() throws RecognitionException {
        MathExprParser.array_type_return retval = new MathExprParser.array_type_return();
        retval.start = input.LT(1);
        int array_type_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal96=null;
        Token char_literal98=null;
        MathExprParser.identifier_return identifier95 = null;

        MathExprParser.term_return term97 = null;


        AstNode char_literal96_tree=null;
        AstNode char_literal98_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // MathExpr.g:132:11: ( identifier '[' ( term )? ']' -> ^( ARRAY identifier ^( COUNT ( term )? ) ) )
            // MathExpr.g:132:13: identifier '[' ( term )? ']'
            {
            pushFollow(FOLLOW_identifier_in_array_type1598);
            identifier95=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier95.getTree());
            char_literal96=(Token)match(input,57,FOLLOW_57_in_array_type1600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal96);

            // MathExpr.g:132:28: ( term )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NOT||(LA22_0>=TRUE && LA22_0<=FALSE)||LA22_0==DIGIT||LA22_0==IDENTIFIER||LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // MathExpr.g:0:0: term
                    {
                    pushFollow(FOLLOW_term_in_array_type1602);
                    term97=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term97.getTree());

                    }
                    break;

            }

            char_literal98=(Token)match(input,58,FOLLOW_58_in_array_type1605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal98);



            // AST REWRITE
            // elements: term, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 132:38: -> ^( ARRAY identifier ^( COUNT ( term )? ) )
            {
                // MathExpr.g:132:41: ^( ARRAY identifier ^( COUNT ( term )? ) )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:132:60: ^( COUNT ( term )? )
                {
                AstNode root_2 = (AstNode)adaptor.nil();
                root_2 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(COUNT, "COUNT"), root_2);

                // MathExpr.g:132:68: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_2, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, array_type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_type"

    public static class array_initialising_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_initialising"
    // MathExpr.g:133:1: array_initialising : identifier ( '<' term ( ',' term )* '>' )? -> ^( identifier ( term )* ) ;
    public final MathExprParser.array_initialising_return array_initialising() throws RecognitionException {
        MathExprParser.array_initialising_return retval = new MathExprParser.array_initialising_return();
        retval.start = input.LT(1);
        int array_initialising_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        MathExprParser.identifier_return identifier99 = null;

        MathExprParser.term_return term101 = null;

        MathExprParser.term_return term103 = null;


        AstNode char_literal100_tree=null;
        AstNode char_literal102_tree=null;
        AstNode char_literal104_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // MathExpr.g:133:19: ( identifier ( '<' term ( ',' term )* '>' )? -> ^( identifier ( term )* ) )
            // MathExpr.g:133:21: identifier ( '<' term ( ',' term )* '>' )?
            {
            pushFollow(FOLLOW_identifier_in_array_initialising1627);
            identifier99=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier99.getTree());
            // MathExpr.g:133:32: ( '<' term ( ',' term )* '>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // MathExpr.g:133:33: '<' term ( ',' term )* '>'
                    {
                    char_literal100=(Token)match(input,LT,FOLLOW_LT_in_array_initialising1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(char_literal100);

                    pushFollow(FOLLOW_term_in_array_initialising1632);
                    term101=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term101.getTree());
                    // MathExpr.g:133:42: ( ',' term )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==53) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // MathExpr.g:133:43: ',' term
                    	    {
                    	    char_literal102=(Token)match(input,53,FOLLOW_53_in_array_initialising1635); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal102);

                    	    pushFollow(FOLLOW_term_in_array_initialising1637);
                    	    term103=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_term.add(term103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    char_literal104=(Token)match(input,GT,FOLLOW_GT_in_array_initialising1641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal104);


                    }
                    break;

            }



            // AST REWRITE
            // elements: identifier, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 133:60: -> ^( identifier ( term )* )
            {
                // MathExpr.g:133:63: ^( identifier ( term )* )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                // MathExpr.g:133:76: ( term )*
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, array_initialising_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_initialising"

    public static class array_declaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_declaration"
    // MathExpr.g:134:1: array_declaration : array_type array_initialising ( ',' array_initialising )* -> ^( array_type ( array_initialising )+ ) ;
    public final MathExprParser.array_declaration_return array_declaration() throws RecognitionException {
        MathExprParser.array_declaration_return retval = new MathExprParser.array_declaration_return();
        retval.start = input.LT(1);
        int array_declaration_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal107=null;
        MathExprParser.array_type_return array_type105 = null;

        MathExprParser.array_initialising_return array_initialising106 = null;

        MathExprParser.array_initialising_return array_initialising108 = null;


        AstNode char_literal107_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_array_initialising=new RewriteRuleSubtreeStream(adaptor,"rule array_initialising");
        RewriteRuleSubtreeStream stream_array_type=new RewriteRuleSubtreeStream(adaptor,"rule array_type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // MathExpr.g:134:18: ( array_type array_initialising ( ',' array_initialising )* -> ^( array_type ( array_initialising )+ ) )
            // MathExpr.g:135:3: array_type array_initialising ( ',' array_initialising )*
            {
            pushFollow(FOLLOW_array_type_in_array_declaration1660);
            array_type105=array_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_type.add(array_type105.getTree());
            pushFollow(FOLLOW_array_initialising_in_array_declaration1662);
            array_initialising106=array_initialising();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_initialising.add(array_initialising106.getTree());
            // MathExpr.g:135:33: ( ',' array_initialising )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // MathExpr.g:135:34: ',' array_initialising
            	    {
            	    char_literal107=(Token)match(input,53,FOLLOW_53_in_array_declaration1665); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal107);

            	    pushFollow(FOLLOW_array_initialising_in_array_declaration1667);
            	    array_initialising108=array_initialising();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array_initialising.add(array_initialising108.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: array_initialising, array_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 135:59: -> ^( array_type ( array_initialising )+ )
            {
                // MathExpr.g:135:62: ^( array_type ( array_initialising )+ )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot(stream_array_type.nextNode(), root_1);

                if ( !(stream_array_initialising.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_array_initialising.hasNext() ) {
                    adaptor.addChild(root_1, stream_array_initialising.nextTree());

                }
                stream_array_initialising.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, array_declaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_declaration"

    public static class parameterDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDeclaration"
    // MathExpr.g:138:1: parameterDeclaration : identifier identifier ;
    public final MathExprParser.parameterDeclaration_return parameterDeclaration() throws RecognitionException {
        MathExprParser.parameterDeclaration_return retval = new MathExprParser.parameterDeclaration_return();
        retval.start = input.LT(1);
        int parameterDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.identifier_return identifier109 = null;

        MathExprParser.identifier_return identifier110 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // MathExpr.g:138:21: ( identifier identifier )
            // MathExpr.g:138:23: identifier identifier
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_parameterDeclaration1686);
            identifier109=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (AstNode)adaptor.becomeRoot(identifier109.getTree(), root_0);
            pushFollow(FOLLOW_identifier_in_parameterDeclaration1689);
            identifier110=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier110.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parameterDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameterDeclaration"

    public static class parametersDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametersDeclaration"
    // MathExpr.g:139:1: parametersDeclaration : parameterDeclaration ( ',' parameterDeclaration )* ;
    public final MathExprParser.parametersDeclaration_return parametersDeclaration() throws RecognitionException {
        MathExprParser.parametersDeclaration_return retval = new MathExprParser.parametersDeclaration_return();
        retval.start = input.LT(1);
        int parametersDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal112=null;
        MathExprParser.parameterDeclaration_return parameterDeclaration111 = null;

        MathExprParser.parameterDeclaration_return parameterDeclaration113 = null;


        AstNode char_literal112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // MathExpr.g:139:22: ( parameterDeclaration ( ',' parameterDeclaration )* )
            // MathExpr.g:139:24: parameterDeclaration ( ',' parameterDeclaration )*
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_parameterDeclaration_in_parametersDeclaration1696);
            parameterDeclaration111=parameterDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDeclaration111.getTree());
            // MathExpr.g:139:45: ( ',' parameterDeclaration )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // MathExpr.g:139:47: ',' parameterDeclaration
            	    {
            	    char_literal112=(Token)match(input,53,FOLLOW_53_in_parametersDeclaration1700); if (state.failed) return retval;
            	    pushFollow(FOLLOW_parameterDeclaration_in_parametersDeclaration1703);
            	    parameterDeclaration113=parameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDeclaration113.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parametersDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parametersDeclaration"

    public static class func_return_type_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "func_return_type"
    // MathExpr.g:140:1: func_return_type : identifier ;
    public final MathExprParser.func_return_type_return func_return_type() throws RecognitionException {
        MathExprParser.func_return_type_return retval = new MathExprParser.func_return_type_return();
        retval.start = input.LT(1);
        int func_return_type_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.identifier_return identifier114 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // MathExpr.g:140:17: ( identifier )
            // MathExpr.g:140:19: identifier
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_func_return_type1713);
            identifier114=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier114.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, func_return_type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "func_return_type"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // MathExpr.g:141:1: functionDeclaration : func_return_type identifier '(' ( parametersDeclaration )? ')' '{' expressionsList '}' -> ^( FUNCTION func_return_type identifier ^( PARAMS ( parametersDeclaration )? ) expressionsList ) ;
    public final MathExprParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        MathExprParser.functionDeclaration_return retval = new MathExprParser.functionDeclaration_return();
        retval.start = input.LT(1);
        int functionDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal117=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        MathExprParser.func_return_type_return func_return_type115 = null;

        MathExprParser.identifier_return identifier116 = null;

        MathExprParser.parametersDeclaration_return parametersDeclaration118 = null;

        MathExprParser.expressionsList_return expressionsList121 = null;


        AstNode char_literal117_tree=null;
        AstNode char_literal119_tree=null;
        AstNode char_literal120_tree=null;
        AstNode char_literal122_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_func_return_type=new RewriteRuleSubtreeStream(adaptor,"rule func_return_type");
        RewriteRuleSubtreeStream stream_parametersDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule parametersDeclaration");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expressionsList=new RewriteRuleSubtreeStream(adaptor,"rule expressionsList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // MathExpr.g:141:20: ( func_return_type identifier '(' ( parametersDeclaration )? ')' '{' expressionsList '}' -> ^( FUNCTION func_return_type identifier ^( PARAMS ( parametersDeclaration )? ) expressionsList ) )
            // MathExpr.g:142:2: func_return_type identifier '(' ( parametersDeclaration )? ')' '{' expressionsList '}'
            {
            pushFollow(FOLLOW_func_return_type_in_functionDeclaration1720);
            func_return_type115=func_return_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_func_return_type.add(func_return_type115.getTree());
            pushFollow(FOLLOW_identifier_in_functionDeclaration1722);
            identifier116=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier116.getTree());
            char_literal117=(Token)match(input,51,FOLLOW_51_in_functionDeclaration1724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal117);

            // MathExpr.g:142:34: ( parametersDeclaration )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENTIFIER) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // MathExpr.g:0:0: parametersDeclaration
                    {
                    pushFollow(FOLLOW_parametersDeclaration_in_functionDeclaration1726);
                    parametersDeclaration118=parametersDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDeclaration.add(parametersDeclaration118.getTree());

                    }
                    break;

            }

            char_literal119=(Token)match(input,52,FOLLOW_52_in_functionDeclaration1729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal119);

            char_literal120=(Token)match(input,54,FOLLOW_54_in_functionDeclaration1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal120);

            pushFollow(FOLLOW_expressionsList_in_functionDeclaration1735);
            expressionsList121=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionsList.add(expressionsList121.getTree());
            char_literal122=(Token)match(input,55,FOLLOW_55_in_functionDeclaration1737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal122);



            // AST REWRITE
            // elements: identifier, expressionsList, parametersDeclaration, func_return_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AstNode)adaptor.nil();
            // 144:3: -> ^( FUNCTION func_return_type identifier ^( PARAMS ( parametersDeclaration )? ) expressionsList )
            {
                // MathExpr.g:144:6: ^( FUNCTION func_return_type identifier ^( PARAMS ( parametersDeclaration )? ) expressionsList )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_func_return_type.nextTree());
                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:144:45: ^( PARAMS ( parametersDeclaration )? )
                {
                AstNode root_2 = (AstNode)adaptor.nil();
                root_2 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(PARAMS, "PARAMS"), root_2);

                // MathExpr.g:144:54: ( parametersDeclaration )?
                if ( stream_parametersDeclaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_parametersDeclaration.nextTree());

                }
                stream_parametersDeclaration.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressionsList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, functionDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class expressionOrFunctionDeclaration_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionOrFunctionDeclaration"
    // MathExpr.g:147:1: expressionOrFunctionDeclaration : ( functionDeclaration | expression );
    public final MathExprParser.expressionOrFunctionDeclaration_return expressionOrFunctionDeclaration() throws RecognitionException {
        MathExprParser.expressionOrFunctionDeclaration_return retval = new MathExprParser.expressionOrFunctionDeclaration_return();
        retval.start = input.LT(1);
        int expressionOrFunctionDeclaration_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.functionDeclaration_return functionDeclaration123 = null;

        MathExprParser.expression_return expression124 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // MathExpr.g:147:32: ( functionDeclaration | expression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==ASSIGN||LA28_1==51||LA28_1==57) ) {
                    alt28=2;
                }
                else if ( (LA28_1==IDENTIFIER) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==ASSIGN||LA28_3==53||LA28_3==56) ) {
                        alt28=2;
                    }
                    else if ( (LA28_3==51) ) {
                        alt28=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==IF||(LA28_0>=FOR && LA28_0<=WHILE)||LA28_0==RETURN||LA28_0==DO||LA28_0==54) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // MathExpr.g:147:34: functionDeclaration
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclaration_in_expressionOrFunctionDeclaration1766);
                    functionDeclaration123=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration123.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:147:56: expression
                    {
                    root_0 = (AstNode)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expressionOrFunctionDeclaration1770);
                    expression124=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, expressionOrFunctionDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionOrFunctionDeclaration"

    public static class program_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // MathExpr.g:149:1: program : ( expressionOrFunctionDeclaration ( ';' )* )* ;
    public final MathExprParser.program_return program() throws RecognitionException {
        MathExprParser.program_return retval = new MathExprParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        AstNode root_0 = null;

        Token char_literal126=null;
        MathExprParser.expressionOrFunctionDeclaration_return expressionOrFunctionDeclaration125 = null;


        AstNode char_literal126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // MathExpr.g:149:8: ( ( expressionOrFunctionDeclaration ( ';' )* )* )
            // MathExpr.g:149:10: ( expressionOrFunctionDeclaration ( ';' )* )*
            {
            root_0 = (AstNode)adaptor.nil();

            // MathExpr.g:149:10: ( expressionOrFunctionDeclaration ( ';' )* )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IF||(LA30_0>=FOR && LA30_0<=WHILE)||LA30_0==RETURN||LA30_0==DO||LA30_0==IDENTIFIER||LA30_0==54) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // MathExpr.g:149:12: expressionOrFunctionDeclaration ( ';' )*
            	    {
            	    pushFollow(FOLLOW_expressionOrFunctionDeclaration_in_program1780);
            	    expressionOrFunctionDeclaration125=expressionOrFunctionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrFunctionDeclaration125.getTree());
            	    // MathExpr.g:149:47: ( ';' )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==56) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: ';'
            	    	    {
            	    	    char_literal126=(Token)match(input,56,FOLLOW_56_in_program1782); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class result_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "result"
    // MathExpr.g:151:1: result : program -> ^( PROGRAM program ) ;
    public final MathExprParser.result_return result() throws RecognitionException {
        MathExprParser.result_return retval = new MathExprParser.result_return();
        retval.start = input.LT(1);
        int result_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.program_return program127 = null;


        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // MathExpr.g:151:7: ( program -> ^( PROGRAM program ) )
            // MathExpr.g:151:9: program
            {
            pushFollow(FOLLOW_program_in_result1795);
            program127=program();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_program.add(program127.getTree());


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

            root_0 = (AstNode)adaptor.nil();
            // 151:17: -> ^( PROGRAM program )
            {
                // MathExpr.g:151:20: ^( PROGRAM program )
                {
                AstNode root_1 = (AstNode)adaptor.nil();
                root_1 = (AstNode)adaptor.becomeRoot((AstNode)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_program.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, result_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "result"

    public static class execute_return extends ParserRuleReturnScope {
        AstNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute"
    // MathExpr.g:153:1: execute : result ;
    public final MathExprParser.execute_return execute() throws RecognitionException {
        MathExprParser.execute_return retval = new MathExprParser.execute_return();
        retval.start = input.LT(1);
        int execute_StartIndex = input.index();
        AstNode root_0 = null;

        MathExprParser.result_return result128 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // MathExpr.g:153:8: ( result )
            // MathExpr.g:154:3: result
            {
            root_0 = (AstNode)adaptor.nil();

            pushFollow(FOLLOW_result_in_execute1813);
            result128=result();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, result128.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (AstNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AstNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, execute_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "execute"

    // $ANTLR start synpred22_MathExpr
    public final void synpred22_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:91:16: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )
        // MathExpr.g:91:16: ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add
        {
        if ( (input.LA(1)>=NOTEQUALS && input.LA(1)<=LE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_add_in_synpred22_MathExpr1227);
        add();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_MathExpr

    // $ANTLR start synpred26_MathExpr
    public final void synpred26_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:101:46: ( ',' varDeclaration )
        // MathExpr.g:101:46: ',' varDeclaration
        {
        match(input,53,FOLLOW_53_in_synpred26_MathExpr1310); if (state.failed) return ;
        pushFollow(FOLLOW_varDeclaration_in_synpred26_MathExpr1312);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_MathExpr

    // $ANTLR start synpred30_MathExpr
    public final void synpred30_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:118:3: ( expressionBase ';' )
        // MathExpr.g:118:3: expressionBase ';'
        {
        pushFollow(FOLLOW_expressionBase_in_synpred30_MathExpr1398);
        expressionBase();

        state._fsp--;
        if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred30_MathExpr1400); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_MathExpr

    // $ANTLR start synpred31_MathExpr
    public final void synpred31_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:119:34: ( ELSE expression )
        // MathExpr.g:119:34: ELSE expression
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred31_MathExpr1419); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred31_MathExpr1422);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_MathExpr

    // $ANTLR start synpred37_MathExpr
    public final void synpred37_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:124:3: ( call ';' )
        // MathExpr.g:124:3: call ';'
        {
        pushFollow(FOLLOW_call_in_synpred37_MathExpr1508);
        call();

        state._fsp--;
        if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred37_MathExpr1510); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_MathExpr

    // Delegated rules

    public final boolean synpred30_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\2\11\uffff";
    static final String DFA7_minS =
        "\1\15\1\0\10\uffff";
    static final String DFA7_maxS =
        "\1\72\1\0\10\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA7_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\2\36\uffff\2\11\1\1\3\11\1\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "91:14: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_MathExpr()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\11\1\0\11\uffff";
    static final String DFA15_maxS =
        "\1\66\1\0\11\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\1\1\7\1\11";
    static final String DFA15_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\1\4\1\3\12\uffff\1\6\5\uffff\1\5\7\uffff\1\1\20"+
            "\uffff\1\7",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "117:1: expression : ( expressionBase ';' | IF '(' term ')' expression ( ELSE expression )? | WHILE '(' term ')' expression | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expression | DO expression WHILE '(' term ')' -> ^( DO expression ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_MathExpr()) ) {s = 8;}

                        else if ( (synpred37_MathExpr()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\11\2\uffff";
    static final String DFA17_maxS =
        "\2\70\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\1\uffff\2\3\12\uffff\1\3\5\uffff\1\3\7\uffff\1\3\20\uffff"+
            "\1\3\1\2\1\1",
            "\1\3\1\uffff\2\3\12\uffff\1\3\5\uffff\1\3\7\uffff\1\3\20\uffff"+
            "\1\3\1\2\1\1",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 129:31: ( ( ';' )* expression )*";
        }
    }
 

    public static final BitSet FOLLOW_IDENTIFIER_in_identifier980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_group990 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_group993 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_group995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_group1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_group1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_group1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_group1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_group1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_parameters1036 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_parameters1039 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_parameters1042 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_call1056 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_call1058 = new BitSet(new long[]{0x0018002218008000L});
    public static final BitSet FOLLOW_parameters_in_call1060 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_call1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_not_logic1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not_logic1092 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_not_logic_in_not_logic1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_logic_in_multiplex1104 = new BitSet(new long[]{0x0000070000060002L});
    public static final BitSet FOLLOW_set_in_multiplex1108 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_not_logic_in_multiplex1131 = new BitSet(new long[]{0x0000070000060002L});
    public static final BitSet FOLLOW_multiplex_in_add1145 = new BitSet(new long[]{0x000008C000000002L});
    public static final BitSet FOLLOW_set_in_add1150 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_multiplex_in_add1165 = new BitSet(new long[]{0x000008C000000002L});
    public static final BitSet FOLLOW_add_in_compare1195 = new BitSet(new long[]{0x0007E00000000002L});
    public static final BitSet FOLLOW_set_in_compare1199 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_add_in_compare1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_and_logic1240 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_AND_in_and_logic1244 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_compare_in_and_logic1247 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_and_logic_in_or_logic1261 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_OR_in_or_logic1265 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_and_logic_in_or_logic1268 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_or_logic_in_term1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varDeclaration1289 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration1292 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_varDeclaration1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varsDeclaration1304 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varDeclaration_in_varsDeclaration1306 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_varsDeclaration1310 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varDeclaration_in_varsDeclaration1312 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_54_in_blockExpr1337 = new BitSet(new long[]{0x01C8002238801A00L});
    public static final BitSet FOLLOW_expressionsList_in_blockExpr1340 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_blockExpr1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termOrTrue1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expressionBase1375 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expressionBase1377 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_expressionBase1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expressionBase1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varsDeclaration_in_expressionBase1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionBase_in_expression1398 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression1405 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1408 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_expression1411 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1413 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_expression1416 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ELSE_in_expression1419 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_expression1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expression1428 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1431 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_expression1434 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1436 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_expression1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_expression1443 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1446 = new BitSet(new long[]{0x0108002218000000L});
    public static final BitSet FOLLOW_expressionsList2_in_expression1449 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1451 = new BitSet(new long[]{0x0108002218008000L});
    public static final BitSet FOLLOW_termOrTrue_in_expression1454 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1456 = new BitSet(new long[]{0x0018002218000000L});
    public static final BitSet FOLLOW_expressionsList2_in_expression1459 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1461 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_expression1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_expression1468 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_expression1471 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_WHILE_in_expression1473 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_expression1475 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_expression1477 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expression1498 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_expression1501 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expression1508 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockExpr_in_expression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_declaration_in_expression1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionsList1529 = new BitSet(new long[]{0x0148002238801A02L});
    public static final BitSet FOLLOW_56_in_expressionsList1533 = new BitSet(new long[]{0x0148002238801A00L});
    public static final BitSet FOLLOW_expression_in_expressionsList1536 = new BitSet(new long[]{0x0148002238801A02L});
    public static final BitSet FOLLOW_56_in_expressionsList1544 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_expressionBase_in_expressionsList21566 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expressionsList21570 = new BitSet(new long[]{0x0008002218000000L});
    public static final BitSet FOLLOW_expressionBase_in_expressionsList21572 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_array_type1598 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_array_type1600 = new BitSet(new long[]{0x0408002218008000L});
    public static final BitSet FOLLOW_term_in_array_type1602 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_array_type1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_array_initialising1627 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_LT_in_array_initialising1630 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_array_initialising1632 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_53_in_array_initialising1635 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_term_in_array_initialising1637 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_GT_in_array_initialising1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_type_in_array_declaration1660 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_initialising_in_array_declaration1662 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_array_declaration1665 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_initialising_in_array_declaration1667 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_parameterDeclaration1686 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_identifier_in_parameterDeclaration1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parametersDeclaration1696 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_parametersDeclaration1700 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parametersDeclaration1703 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_func_return_type1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_return_type_in_functionDeclaration1720 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration1722 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_functionDeclaration1724 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_parametersDeclaration_in_functionDeclaration1726 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_functionDeclaration1729 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_functionDeclaration1733 = new BitSet(new long[]{0x01C8002238801A00L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclaration1735 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_functionDeclaration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_expressionOrFunctionDeclaration1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOrFunctionDeclaration1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionOrFunctionDeclaration_in_program1780 = new BitSet(new long[]{0x0148002238801A02L});
    public static final BitSet FOLLOW_56_in_program1782 = new BitSet(new long[]{0x0148002238801A02L});
    public static final BitSet FOLLOW_program_in_result1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_result_in_execute1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred22_MathExpr1199 = new BitSet(new long[]{0x0008002218008000L});
    public static final BitSet FOLLOW_add_in_synpred22_MathExpr1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred26_MathExpr1310 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred26_MathExpr1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionBase_in_synpred30_MathExpr1398 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred30_MathExpr1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred31_MathExpr1419 = new BitSet(new long[]{0x0048002238801A00L});
    public static final BitSet FOLLOW_expression_in_synpred31_MathExpr1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_synpred37_MathExpr1508 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred37_MathExpr1510 = new BitSet(new long[]{0x0000000000000002L});

}