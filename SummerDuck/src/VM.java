import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
import java.lang.*;


public class VM {

    public static void main(String[] args) throws IOException {
        MemVirtual memVirtual = new MemVirtual();

        ArrayList<Compilador.ManejadorDeCuadruplos.Cuadruplo> cuadruplos = new ArrayList<>();

        try {
            String fileName = System.getProperty("user.dir") + "/" + "cuadruplos.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] lineArray = line.split("\\s+");
                cuadruplos.add(new Compilador.ManejadorDeCuadruplos.Cuadruplo(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3])));
                line = reader.readLine();
            }

            // Close the BufferedReader.
            reader.close();

            int i = 0, tipoIn,tipoOut, tipoR;
            Boolean running = true;



            while(running){
                if (i >= cuadruplos.size()){
                    System.out.println("Error en fin de archivo");
                    break;
                }

                Compilador.ManejadorDeCuadruplos.Cuadruplo cuad = cuadruplos.get(i);
                //System.out.println(cuad.operando + " " + cuad.operador1 + " " + cuad.operador2 + " " + cuad.output);

                print(i + ") ");

                switch (cuad.operando){
                    case Instrucciones.GOTO:
                        i = cuad.output - 1;
                        println("GOTO -> " + (i + 1));
                        break;
                    case Instrucciones.GOTOT:
                        println("GOTOT -> " + (i + 1));
                        break;
                    case Instrucciones.GOTOF:
                        println("GOTOF -> " + (i + 1));
                        break;

                    case Instrucciones.VARDECL:
                        println("Declaracion -> " + cuad.output);
                        memVirtual.declararVariable(cuad.output);
                        break;

                    case Instrucciones.CONSTANT:
                        println("Constante [" + cuad.operador1 + "] -> " + cuad.output);
                        memVirtual.declararConstante(cuad.output,cuad.operador1.toString());
                        break;

                    case Instrucciones.ASIGNATION:
                        println("Asignacion -> " + cuad.operador1 + " = " + cuad.output);
                        tipoIn = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operador1);
                        tipoOut = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.output);

                        tipoR = Cubo.esValido(tipoIn,tipoOut,Cubo.ASIGN);
                        if(tipoR == Errors.OPERACION_ILEGAL){
                            println("OPERACION ILEGAL");
                            running = false;
                            break;
                        }

                        switch (tipoOut){
                            case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                                        memVirtual.asignarInt(cuad.output,memVirtual.obtenerInt((int)cuad.operador1));
                                        break;
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                        memVirtual.asignarInt(cuad.output,(int)memVirtual.obtenerDouble((int)cuad.operador1));
                                        break;
                                }
                                break;

                            case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                                        memVirtual.asignarDouble(cuad.output,memVirtual.obtenerInt((int)cuad.operador1));
                                        break;
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                        memVirtual.asignarDouble(cuad.output,memVirtual.obtenerDouble((int)cuad.operador1));
                                        break;
                                }
                                break;

                            case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                                        memVirtual.asignarBoolean(cuad.output,memVirtual.obtenerBoolean((int)cuad.operador1));
                                        break;
                                }
                                break;
                            case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                                        memVirtual.asignarString(cuad.output,memVirtual.obtenerString((int)cuad.operador1));
                                        break;
                                }
                                break;
                        }

                        break;

                    case Instrucciones.EOF:
                        println("Fin del programa. Exit(24)");
                        running = false;
                        break;



                    default:
                        System.out.println(cuad.operando + " " + cuad.operador1 + " " + cuad.operador2 + " " + cuad.output);
                        break;
                }

                i++;
            }


        } catch (FileNotFoundException e) {
            System.out.println("File: cuadruplos.txt Not Found");
        } catch (IOException e) {
            System.out.print("IOException: " + e.getMessage());
        }

    }

    public static void println(String msg){
        System.out.println(msg);
    }

    public static void print(String msg){
        System.out.print(msg);
    }

}