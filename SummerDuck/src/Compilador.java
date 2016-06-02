import java.io.*;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compilador {
    public static ManejadorDeCuadruplos cuadManager = new ManejadorDeCuadruplos();
    public static ManejadorDeVariables varManager = new ManejadorDeVariables();
    public static ManejadorDeMemoria memManager = new ManejadorDeMemoria();

    public static void main(String[] args){
        try{
            // Leemos el archivo
            InputStream ios = new FileInputStream(args[1]);
            // Parseamos el input Stream a tipo ANTLR Input Stream y lo usamos para crear el lexer
            summerDuckLexer lxr = new summerDuckLexer(new ANTLRInputStream(ios));
            // lo convertimos a tokens (ANTLR DOCS)
            CommonTokenStream commonTokenStream = new CommonTokenStream(lxr);
            // Enviamos la serie de tokens al parser para comenzar la compilacion
            summerDuckParser summerDuckParser = new summerDuckParser(commonTokenStream);
            // ejecutamos la primera regla
            summerDuckParser.SummerduckContext context = summerDuckParser.summerduck();
            // imprimimos el archivo
            cuadManager.print();

        }catch (FileNotFoundException e){
            System.out.println("File: [" + args[1] + "] Not Found");
        }catch (IOException e){
            System.out.print("IOException: " + e.getMessage());
        }
    }

    public static class ManejadorDeCuadruplos{
        ArrayList<Cuadruplo> cuadruplos;

        public ManejadorDeCuadruplos(){
            cuadruplos = new ArrayList<>();
        }

        /**
         * Clase que encapsula los cuatro enteros de un cuadruplo
         */
        public class Cuadruplo{
            long operando, operador1,operador2;
            int output;

            public Cuadruplo(long operando, long operador1, long operador2, int output) {
                this.operando = operando;
                this.operador1 = operador1;
                this.operador2 = operador2;
                this.output = output;
            }

            public String toString(){
                return operando + " " + operador1 + " " + operador2 + " " + output;
            }
        }

        /**
         * Imprime la lista de cuadriplos en un archivo
         */
        public void print() throws FileNotFoundException, UnsupportedEncodingException {
            PrintWriter writer = new PrintWriter("cuadruplos.txt", "UTF-8");
            for (Cuadruplo cuadruplo : cuadruplos) {
                writer.println(cuadruplo.toString());
            }
            writer.close();
        }

        /**
         * Agregamos un cuadruplo a la lista de cuadruplos
         */
        public void agregarCuadruplo(long operando, long operador1, long operador2, int output){
            cuadruplos.add(new Cuadruplo(operando,operador1,operador2,output));
        }
    }

    public static  class ManejadorDeVariables{
        private TablaVariables variablesGlobales;
        private TablaVariables variablesLocales;
        private TablaVariables variablesTemporales;
        private TablaVariables variablesConstantes;
        private boolean contextoGlobal;

        public  ManejadorDeVariables(){
            variablesGlobales = new TablaVariables();
            variablesLocales = new TablaVariables();
            variablesTemporales = new TablaVariables();
            variablesConstantes = new TablaVariables();
            contextoGlobal = true;
            entrandoEnContextoLocal();
        }

        public void entrandoEnContextoLocal(){
            contextoGlobal = false;
        }

        public void saliendoDeContextoLocal(){
            contextoGlobal = true;
            variablesLocales.clear();// limpiamos las direcciones locales
            memManager.local.resetTipo();
        }

        public int obtenDireccion(String id){
            int direccion;
            direccion = variablesLocales.obtenerDireccionVar(id);

            if(direccion != Errors.VARIABLE_NO_DEFINIDA){
                return direccion;
            }
            return variablesGlobales.obtenerDireccionVar(id);
        }

        public TablaVariables.Var obtenerVariable(String id){
            TablaVariables.Var variable;
            variable = variablesLocales.obtenerVariable(id);

            if(variable != null){
                return variable;
            }

            return variablesGlobales.obtenerVariable(id);
        }

        public int declararVariable(int tipo, String id, int direccion){

            return Errors.VARIABLE_REDEFINIDA;
        }
    }

    public static class ManejadorDeMemoria{
        Memoria global;
        Memoria local;
        Memoria temporal;
        Memoria constante;

        public ManejadorDeMemoria(){
            global = new Memoria(Memoria.SCOPE_GLOBAL);
            local = new Memoria(Memoria.SCOPE_LOCAL);
            temporal = new Memoria(Memoria.SCOPE_TEMPORAL);
            constante = new Memoria(Memoria.SCOPE_CONSTANTE);
        }



        /**
         * Reserva une spacio en memoria
         * @param scope contexto al cual pertenece (local, constante, etc)
         * @param type tipo int de variable (int, float, etc)
         * @return la direccion de memoria reservada
         */
        public int reservarEspacioEnMemoria(int scope, int type){
            switch (scope){
                case Memoria.SCOPE_GLOBAL:
                    return global.reservarMemoria(type);
                case Memoria.SCOPE_LOCAL:
                    return local.reservarMemoria(type);
                case Memoria.SCOPE_TEMPORAL:
                    return temporal.reservarMemoria(type);
                case Memoria.SCOPE_CONSTANTE:
                    return constante.reservarMemoria(type);
                default:
                    return Errors.UNKNOWN_SCOPE;
            }

        }

        public static class Memoria{
            // Tipos de memoria

            public static final int SCOPE_GLOBAL = 1;
            public static final int SCOPE_LOCAL = 2;
            public static final int SCOPE_TEMPORAL = 3;
            public static final int SCOPE_CONSTANTE = 4;
            
            
            /*
            Enteros (2000)
            Flotantes (2000)
            Cadenas (2000)
            Booleanos (1000)
             */

            public static final int VAR_INT = 1;
            public static final int VAR_FLOAT = 2;
            public static final int VAR_STRING = 3;
            public static final int VAR_BOOL = 4;

            // Indices de Memoria global 0 - 6999 (7000)
            public static final int bGlobalInt = 0;
            public static final int eGlobalInt = 1999;
            public static final int bGlobalFloat = 2000;
            public static final int eGlobalFloat = 3999;
            public static final int bGlobalString = 4000;
            public static final int eGlobalString = 5999;
            public static final int bGlobalBool = 6000;
            public static final int eGlobalBool = 6999;

            // Indices de Memoria local 7000 - 13999 (7000)
            public static final int bLocalInt = 7000;
            public static final int eLocalInt = 8999;
            public static final int bLocalFloat = 9000;
            public static final int eLocalFloat = 10999;
            public static final int bLocalString = 11000;
            public static final int eLocalString = 12999;
            public static final int bLocalBool = 13000;
            public static final int eLocalBool = 13999;

            // Indices de Memoria Temporal 14000 - 20999 (7000)
            public static final int bTemporalInt = 14000;
            public static final int eTemporalInt = 15999;
            public static final int bTemporalFloat = 16000;
            public static final int eTemporalFloat = 17999;
            public static final int bTemporalString = 18000;
            public static final int eTemporalString = 19999;
            public static final int bTemporalBool = 20000;
            public static final int eTemporalBool = 20999;

            // Indices de Memoria Constante 21000 - 27999 (7000)
            public static final int bConstanteInt = 21000;
            public static final int eConstanteInt = 22999;
            public static final int bConstanteFloat = 23000;
            public static final int eConstanteFloat = 24999;
            public static final int bConstanteString = 25000;
            public static final int eConstanteString = 26999;
            public static final int bConstanteBool = 27000;
            public static final int eConstanteBool = 27999;


            private int bInt;
            private int eInt;
            private int bFLoat;
            private int eFloat;
            private int bString;
            private int eString;
            private int bBool;
            private int eBool;

            public int tipo;

            public Memoria(int tipo){
                this.tipo = tipo;
                resetTipo();
            }

            public void resetTipo(){
                switch (tipo){
                    case SCOPE_GLOBAL:
                        bInt = bGlobalInt;
                        eInt = eGlobalInt;
                        bFLoat = bGlobalFloat;
                        eFloat = eGlobalFloat;
                        bString = bGlobalString;
                        eString = eGlobalString;
                        bBool = bGlobalBool;
                        eBool = eGlobalBool;
                        break;
                    case SCOPE_LOCAL:
                        bInt = bLocalInt;
                        eInt = eLocalInt;
                        bFLoat = bLocalFloat;
                        eFloat = eLocalFloat;
                        bString = bLocalString;
                        eString = eLocalString;
                        bBool = bLocalBool;
                        eBool = eLocalBool;
                        break;
                    case SCOPE_TEMPORAL:
                        bInt = bTemporalInt;
                        eInt = eTemporalInt;
                        bFLoat = bTemporalFloat;
                        eFloat = eTemporalFloat;
                        bString = bTemporalString;
                        eString = eTemporalString;
                        bBool = bTemporalBool;
                        eBool = eTemporalBool;
                        break;
                    case SCOPE_CONSTANTE:
                        bInt = bConstanteInt;
                        eInt = eConstanteInt;
                        bFLoat = bConstanteFloat;
                        eFloat = eConstanteFloat;
                        bString = bConstanteString;
                        eString = eConstanteString;
                        bBool = bConstanteBool;
                        eBool = eConstanteBool;
                        break;
                }
            }

            /**
             * Nos dice el tipo de variable
             * @param direccion direccion de dicha variable
             * @return tipo de variable
             */
            public static int obtenerTipo(int direccion){
                if(direccion < bGlobalInt || direccion > eConstanteBool){
                    return Errors.STACKOVERFLOW;
                }

                if((direccion >= bGlobalInt && direccion <= eGlobalInt)
                        || (direccion >= bLocalInt && direccion <= eLocalInt)
                        || (direccion >= bTemporalInt && direccion <= eTemporalInt)
                        || (direccion >= bConstanteInt && direccion <= eConstanteInt)){
                    return VAR_INT;
                }

                if((direccion >= bGlobalFloat && direccion <= eGlobalFloat)
                        || (direccion >= bLocalFloat && direccion <= eLocalFloat)
                        || (direccion >= bTemporalFloat && direccion <= eTemporalFloat)
                        || (direccion >= bConstanteFloat && direccion <= eConstanteFloat)){
                    return VAR_FLOAT;
                }

                if((direccion >= bGlobalString && direccion <= eGlobalString)
                        || (direccion >= bLocalString && direccion <= eLocalString)
                        || (direccion >= bTemporalString && direccion <= eTemporalString)
                        || (direccion >= bConstanteString && direccion <= eConstanteString)){
                    return VAR_STRING;
                }
                return  VAR_BOOL;
            }

            /**
             * Nos dice el tipo de scope de la variable
             * @param direccion direccion de dicha variable
             * @return regresa el tipo de scope
             */
            public static int obtenerScope(int direccion){
                if(direccion < bGlobalInt || direccion > eConstanteBool){
                    return Errors.STACKOVERFLOW;
                }

                if(direccion < bLocalInt){
                    return SCOPE_GLOBAL;
                }

                if(direccion < bTemporalInt){
                    return SCOPE_LOCAL;
                }

                if(direccion < bConstanteInt){
                    return SCOPE_TEMPORAL;
                }
                return  SCOPE_CONSTANTE;
            }

            /**
             * Reserva un espacio de memoria para el tipo de variable
             * @param tipo el tipo de variable para reservar memoria
             * @return la direccion de memoria
             */
            public int reservarMemoria(int tipo){
                switch (tipo){
                    case VAR_INT:
                        if(bInt > eInt){
                            return Errors.STACKOVERFLOW;
                        }
                        bInt++;
                        return bInt - 1;
                    case VAR_FLOAT:
                        if(bFLoat > eFloat){
                            return Errors.STACKOVERFLOW;
                        }
                        bFLoat++;
                        return bFLoat - 1;
                    case VAR_STRING:
                        if(bString > eString){
                            return Errors.STACKOVERFLOW;
                        }
                        bString++;
                        return bString - 1;
                    case VAR_BOOL:
                        if(bBool > eBool){
                            return Errors.STACKOVERFLOW;
                        }
                        bBool++;
                        return bBool - 1;
                }

                return Errors.UNKNOWN_TYPE;
            }
        }
    }
}
