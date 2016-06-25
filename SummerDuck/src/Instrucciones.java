public class Instrucciones {
    public static final int GOTO = 1000;
    public static final int GOTOF = 1001;
    public static final int GOTOT = 1002;
    public static final int VARDECL = 1003;
    public static final int ASIGNATION = 1004;
    public static final int SCAN = 1005;
    public static final int WRITE = 1006;
    public static final int CONSTANT = 1007;
    public static final int EOF = 1008;
    public static final int AND = 1009;
    public static final int OR = 1010;
    public static final int LT = 1011; //<
    public static final int GT = 1012; //>
    public static final int EQT = 1013; //==
    public static final int DIF = 1014; //!=
    public static final int GOE = 1015; //>=
    public static final int LOE = 1016; //<=
    public static final int ADD = 1017; // +
    public static final int SUB = 1018; // -
    public static final int MUL = 1019; // *
    public static final int DIV = 1020; // /

    public static String parse(int code){
        String msg = code + "";

        switch (code){
            case GOTO :
                msg = "GOTO";
                break;
            case GOTOF :
                msg = "GOTOF";
                break;
            case GOTOT :
                msg = "GOTOT";
                break;
            case VARDECL :
                msg = "VARDECL";
                break;
            case ASIGNATION :
                msg = "ASIGNATION";
                break;
            case SCAN :
                msg = "SCAN";
                break;
            case WRITE :
                msg = "WRITE";
                break;
            case CONSTANT :
                msg = "CONSTANT";
                break;
            case EOF :
                msg = "EOF";
                break;
            case AND :
                msg = "AND";
                break;
            case OR :
                msg = "OR";
                break;
            case LT :
                msg = "<";
                break;
            case GT :
                msg = ">";
                break;
            case EQT :
                msg = "==";
                break;
            case DIF :
                msg = "!=";
                break;
            case GOE :
                msg = ">=";
                break;
            case LOE :
                msg = "<=";
                break;
            case ADD :
                msg = "+";
                break;
            case SUB :
                msg = "-";
                break;
            case MUL :
                msg = "*";
                break;
            case DIV :
                msg = "/";
                break;
        }

        return msg;
    }
}

