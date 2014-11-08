import generated.MathExprLexer;
import org.antlr.runtime.CommonToken;

import java.util.HashMap;
import java.util.Hashtable;
import java.lang.Exception;
/**
 * Created by V on 19.10.2014.
 */
public class SemanticChecker {

    private static DataType stringToDataType(String type) throws Exception {
        if (type.equals("int")) {
            return DataType.INT;
        } else if (type.equals("double")) {
            return DataType.DOUBLE;
        } else if (type.equals("bool")) {
            return DataType.BOOL;
        } else if (type.equals("void") || type.equals("")) {
            return DataType.VOID;
        } else {
            throw new Exception("Invalid data type"); //TODO
        }
    }

    public static String dataTypeToString(DataType dataType) {
        switch (dataType) {
            case INT:
                return "int";
            case DOUBLE:
                return "double";
            case BOOL:
                return "bool";
            case VOID:
                return "void";
            default:
                return "unknown";
        }
    }

    private static void convert(AstNode node, DataType dataType) {
        AstNode convert = new AstNode(new CommonToken(MathExprLexer.CALL, "CONVERT"));
        node.parent.setChild(node.childIndex, convert);
        convert.dataType = dataType;
        convert.addChild(node);
        convert.addChild(new AstNode(new CommonToken(MathExprLexer.IDENTIFIER, dataTypeToString(dataType))));
    }

    public DataType check(AstNode node, Context context) throws Exception {
        switch (node.getType()) {
            case MathExprLexer.PROGRAM: {

            }

            case MathExprLexer.BLOCK: {
                context = new Context(context);
                for (int i = 0; i < node.getChildCount(); i++) {
                    check((AstNode) node.getChild(i), context);
                }
                node.getType();
                return DataType.VOID;
            }

            case MathExprLexer.FUNCTION: {
                DataType dataType = stringToDataType(node.getChild(0).getText());
                String name = node.getChild(1).getText();
                Identifier identifier = context.InThisContext(name);//TODO context[name]
                if (identifier != null) {
                    throw new Exception(String.format("Identifier " + name + " already exists."));
                }
                Identifier func = new Identifier(name, IdentifierType.FUNCTION, dataType, node);
                context.setIdentifier(name,func);
                context = new Context(context);
                AstNode params = (AstNode) node.getChild(2);
                for (int i = 0; i < params.getChildCount(); i++) {
                    DataType paramDataType = stringToDataType(params.getChild(i).getText());
                    String paramName = params.getChild(i).getChild(0).getText();
                    if (paramDataType == DataType.VOID) {
                        throw new Exception(String.format("In function " + name + " void param " + paramName));
                    }
                    context.setIdentifier(paramName,new Identifier(paramName, IdentifierType.PARAM, paramDataType, (AstNode) params.getChild(i)));
                }
                context.function = func;
                check((AstNode) node.getChild(3), context);
                return DataType.VOID;

            }

            case MathExprLexer.IDENTIFIER: {
                Identifier identifier = context.InThisContext(node.getText());
                if (identifier == null)
                    throw new Exception(String.format("Unknown identifier " + node.getText()));
                if (identifier.identifierType == IdentifierType.FUNCTION) {
                    if (identifier.dataType == DataType.VOID)
                        throw new Exception(String.format("Function " + identifier.name + " returns void"));
                    if (identifier.node.getChild(1).getChildCount() > 0)
                        throw new Exception(String.format("No params for function" + identifier.name + " call"));
                    AstNode call = new AstNode(new CommonToken(MathExprLexer.CALL));
                    call.addChild(node);
                    call.addChild(new AstNode(new CommonToken(MathExprLexer.ARGUMENTS)));
                    node.parent.setChild(node.childIndex, call);

                    node.dataType = identifier.dataType;
                    return node.dataType;
                } else {
                    node.dataType = identifier.dataType;
                    return node.dataType;
                }
            }

            case MathExprLexer.NUMBER: {
                node.dataType = node.getText().contains(".") ? DataType.DOUBLE : DataType.INT;
                return node.dataType;
            }

            case MathExprLexer.RETURN: {
                if (context.function == null)
                    throw new Exception(String.format("Return not in function in line " + node.getLine()));

                DataType returnDataType = check((AstNode) node.getChild(0), context);
                if (context.function.dataType != returnDataType) {
                    if (context.function.dataType == DataType.DOUBLE && returnDataType == DataType.INT)
                        convert((AstNode) node.getChild(0), DataType.DOUBLE);
                    else
                        throw new Exception(String.format("Return incopotible types " + dataTypeToString(context.function.dataType)
                                + " " + dataTypeToString(returnDataType)));
                }
                return DataType.VOID;
            }

            //TODO !!!
            case MathExprLexer.ADD: {

            }
            case MathExprLexer.SUB: {

            }
            case MathExprLexer.MUL: {

            }
            case MathExprLexer.DIV: {

            }
            case MathExprLexer.GE_OP: {

            }
            case MathExprLexer.LE_OP: {

            }
            case MathExprLexer.NEQUALS: {

            }
            case MathExprLexer.EQUALS: {

            }
            case MathExprLexer.GT: {

            }

            case MathExprLexer.LETTER: {
                boolean compareOperation = true;
                //TODO !!!
                switch (node.getType()) {
                    case MathExprLexer.ADD:
                    case MathExprLexer.SUB:
                    case MathExprLexer.MUL:
                    case MathExprLexer.DIV:
                        compareOperation = false;
                        break;
                }

                DataType leftDataType = check((AstNode) node.getChild(0), context);
                DataType rightDataType = check((AstNode) node.getChild(1), context);
                if (leftDataType != DataType.DOUBLE && leftDataType != DataType.INT)
                    throw new Exception(String.format("Left operand invalid type for operation " + node.getText() +
                            ", line = " + node.getLine() + ", pos = " + node.getTokenStartIndex()));
                if (rightDataType != DataType.DOUBLE && rightDataType != DataType.INT)
                    throw new Exception(String.format("Right operand invalid type for operation " + node.getText() +
                            ", line = " + node.getLine() + ", pos = " + node.getTokenStartIndex()));
                if (leftDataType == DataType.DOUBLE) {
                    if (rightDataType == DataType.INT)
                        convert((AstNode) node.getChild(1), DataType.DOUBLE);
                    node.dataType = compareOperation ? DataType.BOOL : DataType.DOUBLE;
                    return node.dataType;
                }
                if (rightDataType == DataType.DOUBLE) {
                    if (leftDataType == DataType.INT)
                        convert((AstNode) node.getChild(0), DataType.DOUBLE);
                    node.dataType = compareOperation ? DataType.BOOL : DataType.DOUBLE;
                    return node.dataType;
                }
                node.dataType = compareOperation ? DataType.BOOL : DataType.INT;
                return node.dataType;
            }

            case MathExprLexer.WHILE: {
                DataType conditionDataType = check((AstNode) node.getChild(0), context);
                if (conditionDataType != DataType.BOOL)
                    throw new Exception(String.format("In while condition type is " + dataTypeToString(conditionDataType)));
                //context = new Context(context);
                check((AstNode) node.getChild(1), context);
                return DataType.VOID;
            }

            case MathExprLexer.IF: {
                DataType conditionDataType = check((AstNode) node.getChild(0), context);
                if (conditionDataType != DataType.BOOL)
                    throw new Exception(String.format("In if condition type is " + dataTypeToString(conditionDataType)));
                //context = new Context(context);
                check((AstNode) node.getChild(1), context);
                if (node.getChildCount() == 3)
                    check((AstNode) node.getChild(2), context);
                return DataType.VOID;
            }

            //TODO !!!!
            case MathExprLexer.FOR: {

            }

            default: {
                throw new Exception("Unknown token type");
            }
            break;
        }
    }

    public enum IdentifierType {
        GLOBAL, LOCAL, PARAM, FUNCTION;
    }

    public enum DataType {
        VOID, INT, DOUBLE, BOOL;
    }

    public class Identifier {
        public String name;
        public IdentifierType identifierType;
        public DataType dataType;
        public AstNode node;

        public Identifier(String name, IdentifierType identifierType, DataType dataType, AstNode node) {
            this.name = name;
            this.identifierType = identifierType;
            this.dataType = dataType;
            this.node = node;
        }
    }

    public class Context {

        private Context parentContext;
        private HashMap<String, Identifier> identifiers = new HashMap<String, Identifier>();
        private Identifier function = null;

        public Context(Context parentContext) {
            this.parentContext = parentContext;
        }
        public Identifier getIdentifier(String name){
            if(identifiers.containsKey(name))
                return identifiers.get(name);
            else {
                if (parentContext != null)
                    return parentContext.getIdentifier(name);
                else
                    return null;
            }
        }
        public void setIdentifier(String name, Identifier value){
            identifiers.put(name,value);
        }
        public Identifier InThisContext(String name) {
            if (identifiers.containsKey(name)) {
                return identifiers.get(name);
            } else {
                return null;
            }
        }

        public Identifier getFunction() {
            if (function != null) {
                return function;
            } else {
                if (parentContext != null) {
                    return parentContext.function;
                } else {
                    return null;
                }
            }
        }

        public void setFunction(Identifier function) {
            this.function = function;
        }

        public Context getParentContext() {
            return parentContext;
        }
    }



}
