import java.util.Stack;

public class Reglas {
    public static class VarDec{
        private static int tipo;
        private static int direccion;

        public static void R1(){
            tipo = Type.getTipo();
        }

        public static void R2(){
            int direccion = Variables.getDireccion();
            String id = Variables.getId();
            Compilador.varManager.declararVariable(tipo,id,direccion, Compilador.ManejadorDeMemoria.Memoria.obtenerScope(direccion));
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

    public static class Variables{
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
            return Variables.id;
        }
        public static int obtenerUltimaDireccion(){
            return Variables.direccion;
        }
    }
}
