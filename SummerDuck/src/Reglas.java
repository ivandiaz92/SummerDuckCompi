import java.util.Stack;

public class Reglas {

    public static class Asignacion{
        private static int dirVar;
        private static int dirExp;

        public static void R1(){
            dirVar = Variable.getDireccion();
        }

        public static void R2(){
            // TODO obtener la direccion de EXP
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.ASIGNATION,dirExp,-1,dirVar);
        }
    }

    public static class VarDec{
        private static int tipo;
        private static int direccion;

        public static void R1(){
            tipo = Type.getTipo();
        }

        public static void R2(){
            String id = Variable.getId();
            int direccion = Compilador.varManager.declararVariable(tipo,id);
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.VARDECL,direccion,-1,-1);
        }
    }

    public static class Type{
        private static int tipo;

        public static int getTipo() {
            return tipo;
        }

        public static void R1(String token){
            switch (token){
                case "INT":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_INT;
                    break;
                case "FLOAT":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT;
                    break;
                case "CHAR":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_STRING;
                    break;
                case "BOOL":
                    Type.tipo = Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL;
                    break;
            }        }
    }

    public static class Expresion{
    }

    public static class Condicional{
        private static int expDir;

        public static void R1(){
            Compilador.cuadManager.registrarSalto();
            // TODO obtener la direccion de la expresion
            // expDir = blabla;
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOF,expDir,-1,-1);
        }

        public static void R2(){
            Compilador.cuadManager.rellenarSalto();
        }

        public static void R3() {
            Compilador.cuadManager.registrarSalto();
            // TODO obtener la direccion de la expresion
            // expDir = blabla;
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOT,expDir,-1,-1);
        }

    }

    public static class Variable {
        private static Stack<String> pilaO = new Stack<>();

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
            return Variable.id;
        }
        public static int obtenerUltimaDireccion(){
            return Variable.direccion;
        }
    }

    public static class Mientras{
        private static int dirExp;

        public static void R1(){
            Compilador.cuadManager.registrarSalto();
        }

        public static void R2(){
            Compilador.cuadManager.registrarSalto();
            // TODO obtener valor de la direccion del ultimo exp
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
        private static int dirExp;
        public static void R1(){
            Compilador.cuadManager.registrarSalto();
        }

        public static void R2(){
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.GOTOT,dirExp,-1,Compilador.cuadManager.obtenerUltimoSalto());
        }
    }

    public static class Leer{
        public static void R1(){
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.SCAN,-1,-1,Variable.getDireccion());
        }
    }

    public static class Escribir{
        public static void R1(){
            Compilador.cuadManager.agregarCuadruplo(Instrucciones.WRITE,-1,-1,Variable.getDireccion());
        }
    }
}