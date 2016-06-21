public class Cubo {
    private static Cubo instancia = new Cubo();

    // objeto
    private int cubito[][][]= new int [4][4][5];

    // metodos
    public static int esValido(int op1, int op2, int oper){
        return instancia.cubito[op1][op2][oper];
    }

    // Tipos de dato (DIMENSION 1 y 2)
    public static int ENTERO = 10;
    public static int REAL = 11;
    public static int CARACTER = 12;
    public static int BOLEANO = 13;

    // OPERADORES (DIMENSION 3)
    public static int SUMA = 20;  // +
    public static int RESTA = 21; // -
    public static int MULTI = 22; // *
    public static int DIVI = 23;  // /
    public static int MOD = 24;   // %

    public static int AND = 30; // &
    public static int OR = 31;  // |
    public static int MEN = 32; // <
    public static int MAY = 33; // >
    public static int MEI = 34; // <=
    public static int MAI = 35; // >=
    public static int EQU = 36; // ==
    //public static int NOT = 37; // ¡
    public static int DIF = 38; // !=

    // Error
    public static int ERROR = 666;

    // Reglas semanticas
    public Cubo(){
        // ENTEROOO
        //SUMA
        cubito[ENTERO][ENTERO][SUMA] = ENTERO;
        cubito[ENTERO][REAL][SUMA] = REAL;
        cubito[ENTERO][CARACTER][SUMA] = ERROR;
        cubito[ENTERO][BOLEANO][SUMA] = ERROR;
        // Resta
        cubito[ENTERO][ENTERO][RESTA] = ENTERO;
        cubito[ENTERO][REAL][RESTA] = REAL;
        cubito[ENTERO][CARACTER][RESTA] = ERROR;
        cubito[ENTERO][BOLEANO][RESTA] = ERROR;
        // Multiplicacion
        cubito[ENTERO][ENTERO][MULTI] = ENTERO;
        cubito[ENTERO][REAL][MULTI] = REAL;
        cubito[ENTERO][CARACTER][MULTI] = ERROR;
        cubito[ENTERO][BOLEANO][MULTI] = ERROR;
        // DIvicion
        cubito[ENTERO][ENTERO][DIVI] = ENTERO;
        cubito[ENTERO][REAL][DIVI] = REAL;
        cubito[ENTERO][CARACTER][DIVI] = ERROR;
        cubito[ENTERO][BOLEANO][DIVI] = ERROR;
        // Modulo
        cubito[ENTERO][ENTERO][MOD] = ENTERO;
        cubito[ENTERO][REAL][MOD] = REAL;
        cubito[ENTERO][CARACTER][MOD] = ERROR;
        cubito[ENTERO][BOLEANO][MOD] = ERROR;

        // REAAAL
        //SUMA
        cubito[REAL][ENTERO][SUMA] = REAL;
        cubito[REAL][REAL][SUMA] = REAL;
        cubito[REAL][CARACTER][SUMA] = ERROR;
        cubito[REAL][BOLEANO][SUMA] = ERROR;
        // Resta
        cubito[REAL][ENTERO][RESTA] = REAL;
        cubito[REAL][REAL][RESTA] = REAL;
        cubito[REAL][CARACTER][RESTA] = ERROR;
        cubito[REAL][BOLEANO][RESTA] = ERROR;
        // Multiplicacion
        cubito[REAL][ENTERO][MULTI] = REAL;
        cubito[REAL][REAL][MULTI] = REAL;
        cubito[REAL][CARACTER][MULTI] = ERROR;
        cubito[REAL][BOLEANO][MULTI] = ERROR;
        // DIvicion
        cubito[REAL][ENTERO][DIVI] = REAL;
        cubito[REAL][REAL][DIVI] = REAL;
        cubito[REAL][CARACTER][DIVI] = ERROR;
        cubito[REAL][BOLEANO][DIVI] = ERROR;
        // Modulo
        cubito[REAL][ENTERO][MOD] = REAL;
        cubito[REAL][REAL][MOD] = REAL;
        cubito[REAL][CARACTER][MOD] = ERROR;
        cubito[REAL][BOLEANO][MOD] = ERROR;

        // CARACTER
        //SUMA
        cubito[CARACTER][ENTERO][SUMA] = ERROR;
        cubito[CARACTER][REAL][SUMA] = ERROR;
        cubito[CARACTER][CARACTER][SUMA] = CARACTER;
        cubito[CARACTER][BOLEANO][SUMA] = ERROR;
        // Resta
        cubito[CARACTER][ENTERO][RESTA] = ERROR;
        cubito[CARACTER][REAL][RESTA] = ERROR;
        cubito[CARACTER][CARACTER][RESTA] = ERROR;
        cubito[CARACTER][BOLEANO][RESTA] = ERROR;
        // Multiplicacion
        cubito[CARACTER][ENTERO][MULTI] = ERROR;
        cubito[CARACTER][REAL][MULTI] = ERROR;
        cubito[CARACTER][CARACTER][MULTI] = ERROR;
        cubito[CARACTER][BOLEANO][MULTI] = ERROR;
        // DIvicion
        cubito[CARACTER][ENTERO][DIVI] = ERROR;
        cubito[CARACTER][REAL][DIVI] = ERROR;
        cubito[CARACTER][CARACTER][DIVI] = ERROR;
        cubito[CARACTER][BOLEANO][DIVI] = ERROR;
        // Modulo
        cubito[CARACTER][ENTERO][MOD] = ERROR;
        cubito[CARACTER][REAL][MOD] = ERROR;
        cubito[CARACTER][CARACTER][MOD] = ERROR;
        cubito[CARACTER][BOLEANO][MOD] = ERROR;

        // BOLEANO
        //SUMA
        cubito[BOLEANO][ENTERO][SUMA] = ERROR;
        cubito[BOLEANO][REAL][SUMA] = ERROR;
        cubito[BOLEANO][CARACTER][SUMA] = ERROR;
        cubito[BOLEANO][BOLEANO][SUMA] = ERROR;
        // Resta
        cubito[BOLEANO][ENTERO][RESTA] = ERROR;
        cubito[BOLEANO][REAL][RESTA] = ERROR;
        cubito[BOLEANO][CARACTER][RESTA] = ERROR;
        cubito[BOLEANO][BOLEANO][RESTA] = ERROR;
        // Multiplicacion
        cubito[BOLEANO][ENTERO][MULTI] = ERROR;
        cubito[BOLEANO][REAL][MULTI] = ERROR;
        cubito[BOLEANO][CARACTER][MULTI] = ERROR;
        cubito[BOLEANO][BOLEANO][MULTI] = ERROR;
        // DIvicion
        cubito[BOLEANO][ENTERO][DIVI] = ERROR;
        cubito[BOLEANO][REAL][DIVI] = ERROR;
        cubito[BOLEANO][CARACTER][DIVI] = ERROR;
        cubito[BOLEANO][BOLEANO][DIVI] = ERROR;
        // Modulo
        cubito[BOLEANO][ENTERO][MOD] = ERROR;
        cubito[BOLEANO][REAL][MOD] = ERROR;
        cubito[BOLEANO][CARACTER][MOD] = ERROR;
        cubito[BOLEANO][BOLEANO][MOD] = ERROR;


        // AND
        cubito[ENTERO][ENTERO][AND] = ERROR;
        cubito[ENTERO][REAL][AND] = ERROR;
        cubito[ENTERO][CARACTER][AND] = ERROR;
        cubito[ENTERO][BOLEANO][AND] = ERROR;

        cubito[REAL][ENTERO][AND] = ERROR;
        cubito[REAL][REAL][AND] = ERROR;
        cubito[REAL][CARACTER][AND] = ERROR;
        cubito[REAL][BOLEANO][AND] = ERROR;

        cubito[CARACTER][ENTERO][AND] = ERROR;
        cubito[CARACTER][REAL][AND] = ERROR;
        cubito[CARACTER][CARACTER][AND] = ERROR;
        cubito[CARACTER][BOLEANO][AND] = ERROR;

        cubito[BOLEANO][ENTERO][AND] = ERROR;
        cubito[BOLEANO][REAL][AND] = ERROR;
        cubito[BOLEANO][CARACTER][AND] = ERROR;
        cubito[BOLEANO][BOLEANO][AND] = BOLEANO;

        // OR
        cubito[ENTERO][ENTERO][OR] = ERROR;
        cubito[ENTERO][REAL][OR] = ERROR;
        cubito[ENTERO][CARACTER][OR] = ERROR;
        cubito[ENTERO][BOLEANO][OR] = ERROR;

        cubito[REAL][ENTERO][OR] = ERROR;
        cubito[REAL][REAL][OR] = ERROR;
        cubito[REAL][CARACTER][OR] = ERROR;
        cubito[REAL][BOLEANO][OR] = ERROR;

        cubito[CARACTER][ENTERO][OR] = ERROR;
        cubito[CARACTER][REAL][OR] = ERROR;
        cubito[CARACTER][CARACTER][OR] = ERROR;
        cubito[CARACTER][BOLEANO][OR] = ERROR;

        cubito[BOLEANO][ENTERO][OR] = ERROR;
        cubito[BOLEANO][REAL][OR] = ERROR;
        cubito[BOLEANO][CARACTER][OR] = ERROR;
        cubito[BOLEANO][BOLEANO][OR] = BOLEANO;

        // MEN
        cubito[ENTERO][ENTERO][MEN] = BOLEANO;
        cubito[ENTERO][REAL][MEN] = BOLEANO;
        cubito[ENTERO][CARACTER][MEN] = ERROR;
        cubito[ENTERO][BOLEANO][MEN] = ERROR;

        cubito[REAL][ENTERO][MEN] = BOLEANO;
        cubito[REAL][REAL][MEN] = BOLEANO;
        cubito[REAL][CARACTER][MEN] = ERROR;
        cubito[REAL][BOLEANO][MEN] = ERROR;

        cubito[CARACTER][ENTERO][MEN] = ERROR;
        cubito[CARACTER][REAL][MEN] = ERROR;
        cubito[CARACTER][CARACTER][MEN] = ERROR;
        cubito[CARACTER][BOLEANO][MEN] = ERROR;

        cubito[BOLEANO][ENTERO][MEN] = ERROR;
        cubito[BOLEANO][REAL][MEN] = ERROR;
        cubito[BOLEANO][CARACTER][MEN] = ERROR;
        cubito[BOLEANO][BOLEANO][MEN] = ERROR;

        // MAY
        cubito[ENTERO][ENTERO][MAY] = BOLEANO;
        cubito[ENTERO][REAL][MAY] = BOLEANO;
        cubito[ENTERO][CARACTER][MAY] = ERROR;
        cubito[ENTERO][BOLEANO][MAY] = ERROR;

        cubito[REAL][ENTERO][MAY] = BOLEANO;
        cubito[REAL][REAL][MAY] = BOLEANO;
        cubito[REAL][CARACTER][MAY] = ERROR;
        cubito[REAL][BOLEANO][MAY] = ERROR;

        cubito[CARACTER][ENTERO][MAY] = ERROR;
        cubito[CARACTER][REAL][MAY] = ERROR;
        cubito[CARACTER][CARACTER][MAY] = ERROR;
        cubito[CARACTER][BOLEANO][MAY] = ERROR;

        cubito[BOLEANO][ENTERO][MAY] = ERROR;
        cubito[BOLEANO][REAL][MAY] = ERROR;
        cubito[BOLEANO][CARACTER][MAY] = ERROR;
        cubito[BOLEANO][BOLEANO][MAY] = ERROR;

        // MAI
        cubito[ENTERO][ENTERO][MAI] = BOLEANO;
        cubito[ENTERO][REAL][MAI] = BOLEANO;
        cubito[ENTERO][CARACTER][MAI] = ERROR;
        cubito[ENTERO][BOLEANO][MAI] = ERROR;

        cubito[REAL][ENTERO][MAI] = BOLEANO;
        cubito[REAL][REAL][MAI] = BOLEANO;
        cubito[REAL][CARACTER][MAI] = ERROR;
        cubito[REAL][BOLEANO][MAI] = ERROR;

        cubito[CARACTER][ENTERO][MAI] = ERROR;
        cubito[CARACTER][REAL][MAI] = ERROR;
        cubito[CARACTER][CARACTER][MAI] = ERROR;
        cubito[CARACTER][BOLEANO][MAI] = ERROR;

        cubito[BOLEANO][ENTERO][MAI] = ERROR;
        cubito[BOLEANO][REAL][MAI] = ERROR;
        cubito[BOLEANO][CARACTER][MAI] = ERROR;
        cubito[BOLEANO][BOLEANO][MAI] = ERROR;

        // MEI
        cubito[ENTERO][ENTERO][MEI] = BOLEANO;
        cubito[ENTERO][REAL][MEI] = BOLEANO;
        cubito[ENTERO][CARACTER][MEI] = ERROR;
        cubito[ENTERO][BOLEANO][MEI] = ERROR;

        cubito[REAL][ENTERO][MEI] = BOLEANO;
        cubito[REAL][REAL][MEI] = BOLEANO;
        cubito[REAL][CARACTER][MEI] = ERROR;
        cubito[REAL][BOLEANO][MEI] = ERROR;

        cubito[CARACTER][ENTERO][MEI] = ERROR;
        cubito[CARACTER][REAL][MEI] = ERROR;
        cubito[CARACTER][CARACTER][MEI] = ERROR;
        cubito[CARACTER][BOLEANO][MEI] = ERROR;

        cubito[BOLEANO][ENTERO][MEI] = ERROR;
        cubito[BOLEANO][REAL][MEI] = ERROR;
        cubito[BOLEANO][CARACTER][MEI] = ERROR;
        cubito[BOLEANO][BOLEANO][MEI] = ERROR;

        // EQU
        cubito[ENTERO][ENTERO][EQU] = BOLEANO;
        cubito[ENTERO][REAL][EQU] = BOLEANO;
        cubito[ENTERO][CARACTER][EQU] = ERROR;
        cubito[ENTERO][BOLEANO][EQU] = ERROR;

        cubito[REAL][ENTERO][EQU] = BOLEANO;
        cubito[REAL][REAL][EQU] = BOLEANO;
        cubito[REAL][CARACTER][EQU] = ERROR;
        cubito[REAL][BOLEANO][EQU] = ERROR;

        cubito[CARACTER][ENTERO][EQU] = ERROR;
        cubito[CARACTER][REAL][EQU] = ERROR;
        cubito[CARACTER][CARACTER][EQU] = ERROR;
        cubito[CARACTER][BOLEANO][EQU] = ERROR;

        cubito[BOLEANO][ENTERO][EQU] = ERROR;
        cubito[BOLEANO][REAL][EQU] = ERROR;
        cubito[BOLEANO][CARACTER][EQU] = ERROR;
        cubito[BOLEANO][BOLEANO][EQU] = BOLEANO;

        // DIF
        cubito[ENTERO][ENTERO][DIF] = BOLEANO;
        cubito[ENTERO][REAL][DIF] = BOLEANO;
        cubito[ENTERO][CARACTER][DIF] = ERROR;
        cubito[ENTERO][BOLEANO][DIF] = ERROR;

        cubito[REAL][ENTERO][DIF] = BOLEANO;
        cubito[REAL][REAL][DIF] = BOLEANO;
        cubito[REAL][CARACTER][DIF] = ERROR;
        cubito[REAL][BOLEANO][DIF] = ERROR;

        cubito[CARACTER][ENTERO][DIF] = ERROR;
        cubito[CARACTER][REAL][DIF] = ERROR;
        cubito[CARACTER][CARACTER][DIF] = ERROR;
        cubito[CARACTER][BOLEANO][DIF] = ERROR;

        cubito[BOLEANO][ENTERO][DIF] = ERROR;
        cubito[BOLEANO][REAL][DIF] = ERROR;
        cubito[BOLEANO][CARACTER][DIF] = ERROR;
        cubito[BOLEANO][BOLEANO][DIF] = BOLEANO;
    }
}