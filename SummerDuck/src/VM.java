import java.io.*;
import java.util.ArrayList;
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

                if(lineArray.length > 4) {
                    String acum = "";
                    int limit = lineArray.length - 3;

                    for(int i = 1; i <= limit; i++) {
                        acum += lineArray[i] + " ";
                    }
                    acum = acum.substring(0,acum.length()-1);
                    cuadruplos.add(new Compilador.ManejadorDeCuadruplos.Cuadruplo(Integer.parseInt(lineArray[0]),(Object)acum,Integer.parseInt(lineArray[lineArray.length-2]),Integer.parseInt(lineArray[lineArray.length-1])));
                }else{
                    try {
                        cuadruplos.add(new Compilador.ManejadorDeCuadruplos.Cuadruplo(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3])));
                    } catch (Exception e){
                        cuadruplos.add(new Compilador.ManejadorDeCuadruplos.Cuadruplo(Integer.parseInt(lineArray[0]), (lineArray[1]), Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3])));
                    }
                }


                line = reader.readLine();
            }

            // Close the BufferedReader.
            reader.close();

            int i = 0, tipoIn,tipoOut, tipoR, tipo1, tipo2;
            Boolean running = true;



            while(running){
                if (i >= cuadruplos.size()){
                    System.out.println("Error en fin de archivo");
                    break;
                }

                Compilador.ManejadorDeCuadruplos.Cuadruplo cuad = cuadruplos.get(i);
                //System.out.println(cuad.operador + " " + cuad.operando1 + " " + cuad.operando2 + " " + cuad.output);

                //print(i + ") ");

                switch (cuad.operador){
                    case Instrucciones.ENTRALOCAL:
                        memVirtual.entrandoAContextoLocal();
                       // println("ENTRALOCAL");
                        break;

                    case Instrucciones.SALLOCAL:
                        memVirtual.saliendoDeContextoLocal();
                        //println("SALLOCAL");
                        break;

                    case Instrucciones.GOTO:
                        i = cuad.output - 1;
                        //println("GOTO -> " + (i + 1));
                        break;
                    case Instrucciones.GOTOT:
                        if(memVirtual.obtenerBoolean((int)cuad.operando1)){
                            i = cuad.output - 1;
                            //println("GOTOT[true] -> " + (i + 1));
                            break;
                        }
                        //println("GOTOT[false] -> " + cuad.output);
                        break;
                    case Instrucciones.GOTOF:
                        if(!memVirtual.obtenerBoolean((int)cuad.operando1)){
                            i = cuad.output - 1;
                            //println("GOTOF[false] -> " + (i + 1));
                            break;
                        }
                       // println("GOTOF[true] -> " + cuad.output);
                        break;

                    case Instrucciones.VARDECL:
                        //println("Declaracion -> " + cuad.output);
                        memVirtual.declararVariable(cuad.output);
                        break;

                    case Instrucciones.CONSTANT:
                        //println("Constante [" + cuad.operando1 + "] -> " + cuad.output);
                        memVirtual.declararConstante(cuad.output,cuad.operando1.toString());
                        break;

                    case Instrucciones.ASIGNATION:
                       // println("Asignacion -> " + cuad.operando1 + " = " + cuad.output);
                        tipoIn = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
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
                                        memVirtual.asignarInt(cuad.output,memVirtual.obtenerInt((int)cuad.operando1));
                                        break;
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                        memVirtual.asignarInt(cuad.output,(int)memVirtual.obtenerDouble((int)cuad.operando1));
                                        break;
                                }
                                break;

                            case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                                        memVirtual.asignarDouble(cuad.output,memVirtual.obtenerInt((int)cuad.operando1));
                                        break;
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                                        memVirtual.asignarDouble(cuad.output,memVirtual.obtenerDouble((int)cuad.operando1));
                                        break;
                                }
                                break;

                            case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                                        memVirtual.asignarBoolean(cuad.output,memVirtual.obtenerBoolean((int)cuad.operando1));
                                        break;
                                }
                                break;
                            case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                                switch (tipoIn){
                                    case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                                        memVirtual.asignarString(cuad.output,memVirtual.obtenerString((int)cuad.operando1));
                                        break;
                                }
                                break;
                        }

                        break;

                    case Instrucciones.AND:
                        //println("AND -> " + cuad.operando1 + "&&" + cuad.operando2 + " = " + cuad.output);
                        memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerBoolean((int)cuad.operando1) && memVirtual.obtenerBoolean(cuad.operando2));
                        break;

                    case Instrucciones.OR:
                        //println("OR -> " + cuad.operando1 + "||" + cuad.operando2 + " = " + cuad.output);
                        memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerBoolean((int)cuad.operando1) || memVirtual.obtenerBoolean(cuad.operando2));
                        break;

                    case Instrucciones.LT:
                        //println(cuad.operando1 + " < " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) < memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) < memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) < memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) < memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.GT:
                        //println(cuad.operando1 + " > " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) > memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) > memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) > memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) > memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.EQT:
                        //println(cuad.operando1 + " == " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) == memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) == memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) == memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) == memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.DIF:
                       // println(cuad.operando1 + " != " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) != memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) != memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) != memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) != memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.GOE:
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) >= memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) >= memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) >= memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) >= memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.LOE:
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) <= memVirtual.obtenerInt(cuad.operando2));
                            } else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT) {
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) <= memVirtual.obtenerDouble(cuad.operando2));;
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) <= memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarBoolean(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) <= memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.ADD:
                        //println(cuad.operando1 + " + " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarInt(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) + memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if(tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) + memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) + memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) + memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_STRING && tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_STRING){
                            memVirtual.asignarString(cuad.output, memVirtual.obtenerString((int)cuad.operando1) + memVirtual.obtenerString(cuad.operando2));
                        }
                        break;

                    case Instrucciones.SUB:
                        //println(cuad.operando1 + " - " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarInt(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) - memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if(tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) - memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) - memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) - memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.MUL:
                       // println(cuad.operando1 + " * " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarInt(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) * memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if(tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) * memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) * memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) * memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.DIV:
                       // println(cuad.operando1 + " / " + cuad.operando2 + " = " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo((int)cuad.operando1);
                        tipo2 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.operando2);

                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarInt(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) / memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if(tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerInt((int)cuad.operando1) / memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) / memVirtual.obtenerInt(cuad.operando2));
                            }
                            else if (tipo2 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                                memVirtual.asignarDouble(cuad.output, memVirtual.obtenerDouble((int)cuad.operando1) / memVirtual.obtenerDouble(cuad.operando2));
                            }
                        }
                        break;

                    case Instrucciones.EOF:
                        println("Fin del programa. Exit()");
                        running = false;
                        break;

                    case Instrucciones.WRITE:
                        //println("Imprime: " + cuad.output);
                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.output);
                        String res = "";
                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            res = memVirtual.obtenerInt(cuad.output) + "";
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            res = memVirtual.obtenerDouble(cuad.output) + "";
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_STRING){
                            res = memVirtual.obtenerString(cuad.output);
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL){
                            res = memVirtual.obtenerBoolean(cuad.output) ? "verdadero" : "falso";
                        }
                        System.out.println(res);
                        break;

                    case Instrucciones.SCAN:
                        //println("Leer: " + cuad.output);

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        String s = br.readLine();
                        br.close();

                        tipo1 = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(cuad.output);
                        if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_INT){
                            memVirtual.asignarInt(cuad.output,Integer.parseInt(s));
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT){
                            memVirtual.asignarDouble(cuad.output,Double.parseDouble(s));
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_STRING){
                            memVirtual.asignarString(cuad.output,s);
                        }else if (tipo1 == Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL){
                            memVirtual.asignarBoolean(cuad.output,Boolean.parseBoolean(s));
                        }
                    default:
                        //System.out.println(cuad.operador + " " + cuad.operando1 + " " + cuad.operando2 + " " + cuad.output);
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