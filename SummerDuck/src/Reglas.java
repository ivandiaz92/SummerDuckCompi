import java.util.Stack;

public class Reglas {

    public static class Asignacion{
        private static int dirVar;
        private static int dirExp;

        public static void R1(){
            dirVar = Var1.getUltimaDireccion();
        }

        public static void R2(){
            dirExp = Expresion.dirResult;
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.ASIGNATION,dirExp,-1,dirVar);
        }
    }

    public static class VarDec{
        private static int tipo;
        private static int direccion;
        private static String id;

        public static void R1(){
            tipo = Type.getTipo();
        }

        public static void R2(String nombre) {
            id = nombre;
            direccion = Compilador.varManager.declararVariable(tipo,id);
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.VARDECL,-1,-1,direccion);
        }

        public static void R3(){
            // TODO agregar dimenciones y asi
        }
    }

    public static class Type{
        private static int tipo;

        public static int getTipo() {
            return tipo;
        }

        public static void R1(String token){
            tipo = 0;
            switch (token){
                case "entero":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_INT;
                    break;
                case "real":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT;
                    break;
                case "char":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_STRING;
                    break;
                case "boleano":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL;
                    break;
            }        }
    }

    public static class Condicional{
        private static int expDir = Errors.VARIABLE_NO_DEFINIDA;
        public static void R1(){
            expDir = Expresion.dirResult;

            Compilador.cuadManager.registrarSalto();
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOF,expDir,-1,-1);
        }

        public static void R2(){
            Compilador.cuadManager.rellenarSalto();
        }

        public static void R3() {
            Compilador.cuadManager.registrarSalto();
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOT,expDir,-1,-1);
        }

    }

    public static class Var1 {

        private static int ultimaDireccion;


        public static int getUltimaDireccion() {
            return ultimaDireccion;
        }


        public static void EntrandoAID(String ID){
            ultimaDireccion = Compilador.varManager.obtenDireccion(ID);
        }


        /*private static Stack<String> pilaO = new Stack<>();

        public static String getId() {
            return id;
        }

        private static String id = "";

        public static int getDireccion() {
            return direccion;
        }

        private static int direccion;
        private static TablaVariables.Var variable;

        public static void R1(String id){
            // RESETEO
            pilaO.empty(); // vaciamos la pila ( la pila DEBERIA estar vacia al iniciar esta inst)
            direccion = Errors.STACKOVERFLOW;
            variable = null;

            // inicializacion
            pilaO.push(id);
        }

        public static void R2(){
            id = pilaO.pop();
            variable = Compilador.varManager.obtenerVariable(id);
            direccion = variable.direccion;
        }

        public static String obtenerUltimoId(){
            return Var1.id;
        }
        public static int obtenerUltimaDireccion(){
            return Var1.direccion;
        }*/
    }

    public static class Mientras{

        public static void R1(){
            Compilador.cuadManager.registrarSalto();// Salto al inicio de la expresion
        }

        public static void R2(){
            int dirExp = Expresion.dirResult;
            Compilador.cuadManager.registrarSalto();
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOF,dirExp,-1,-1);
        }

        public static void R3(){
            int saltoGOTOF = Compilador.cuadManager.obtenerUltimoSalto();
            int saltoEXP = Compilador.cuadManager.obtenerUltimoSalto();
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTO,-1,-1,saltoEXP);
            Compilador.cuadManager.registrarSalto(saltoGOTOF);
            Compilador.cuadManager.rellenarSalto();
        }
    }

    public static class HazMientras{
        public static void R1(){
            Compilador.cuadManager.registrarSalto();
        }

        public static void R2(){
            int dirExp = Expresion.dirResult;
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOT,dirExp,-1,Compilador.cuadManager.obtenerUltimoSalto());
        }
    }

    public static class Leer{
        public static void R1(){
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.SCAN,-1,-1, Var1.getUltimaDireccion());
        }
    }

    public static class Escribir{
        public static void R1(){
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.WRITE,-1,-1, Expresion.dirResult);
        }
    }


    public static class FuncDecl{

        public static void R1(){
            Compilador.varManager.entrandoEnContextoLocal();
        }

        public static void R2(){
            Compilador.varManager.saliendoDeContextoLocal();
        }
    }

    public static class Constante{
        public static int lastConstantDir = -1;
        public static void R1(int type, String variable){
            lastConstantDir = Compilador.varManager.declararConstante(type, variable);
        }
    }

    public static class Programa {

        public static void R1(){
            //Generamos un GOTO para ir a principal
            Compilador.cuadManager.registrarSalto();
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTO,-1,-1,-1);
        }

        public static void R2() {
            // Al llegar al token principal rellenamos el GOTO inicial
            Compilador.cuadManager.rellenarSalto();
        }

        public static void R3() {
            // Al llegar al final de la funcion 'principal' Generamos un fin de archivo
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.EOF,-1,-1,-1);
        }
    }


    public static class Expresion {
        private static Stack<ExpresionesAritmeticas> exps = new Stack<>();
        private static int deepness = 0;
        public static int dirResult = Errors.VARIABLE_NO_DEFINIDA;

        // Se inicia a resolver una expresion aritmetica
        public static void IniciaExp() {
            Expresion.deepness++;
            exps.push(new ExpresionesAritmeticas());
        }

        public static void TerminaExp() {
            Expresion.deepness--;
            exps.peek().endExpresion();
            if(deepness == 0) {
                dirResult = exps.pop().getDirResultado();
            }
        }

        public static void CierraParentesis() {
            int dirR = exps.pop().getDirResultado();
            exps.peek().addValue(dirR);
        }

        public static void Factor(String ID){
            int dir = Compilador.varManager.obtenDireccion(ID);
            exps.peek().addValue(dir);
        }

        public static void CTE(int tipo, String value){
            int dir = Compilador.varManager.obtenerConstante(tipo,value);
            exps.peek().addValue(dir);
        }

        public static void Operador(int op){
            exps.peek().addOperator(op);
        }
    }

}
