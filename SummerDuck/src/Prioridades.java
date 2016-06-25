/**
 * Created by ivandiaz on 6/25/16.
 */
public class Prioridades {
    // Definicion de operadores
    public static final int MULTIPLICACION = Cubo.MULTI;
    public static final int DIVICION = Cubo.DIVI;
    public static final int RESTA = Cubo.RESTA;
    public static final int SUMA = Cubo.SUMA;
    public static final int AND = Cubo.AND;
    public static final int OR = Cubo.OR;
    public static final int NOT = Cubo.NOT;
    public static final int MOD = Cubo.MOD;
    public static final int MAYOR = Cubo.MAY;

    public static final int MENOR = Cubo.MEN;
    public static final int MAYORIGUAL = Cubo.MAI;
    public static final int MENORIGUAL = Cubo.MEI;
    public static final int EQUIVALENTE = Cubo.EQU;
    public static final int DIFERENTE = Cubo.DIF;



    public static int getPriority(int codigoDeOperador){
        codigoDeOperador = codigoDeOperador >= 28000 ? codigoDeOperador - 28000 : codigoDeOperador;

        switch (codigoDeOperador){

            case MULTIPLICACION:
            case DIVICION:
                return 100;
            case SUMA:
            case RESTA:
                return 99;
            case MOD:
                return 98;
            case MAYOR:
            case MENOR:
            case MAYORIGUAL:
            case MENORIGUAL:
            case EQUIVALENTE:
            case DIFERENTE:
                return 97;
            case AND:
                return 95;
            case OR:
                return 94;
            case NOT:
                return 93;

            default:
                return Errors.OPERADOR_ILEGAL;

        }
    }

    public static int parseOperator(int opCode){
        return opCode + 28000;
    }

    public static boolean isParsedOperator(int opCode){
        return  opCode >= 28000;
    }

    public static int unparseOperator(int opCode){
        return opCode - 28000;
    }

}
