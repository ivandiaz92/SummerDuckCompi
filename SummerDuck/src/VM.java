import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
import java.lang.*;


public class VM {

    public static void main(String[] args) throws IOException {

        ArrayList<Compilador.ManejadorDeCuadruplos.Cuadruplo> cuadruplos = new ArrayList<>();
        try {
            String fileName = System.getProperty("user.dir") + "/" + "cuadruplos.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                //System.out.println(line);
                String[] lineArray = line.split("\\s+");
                cuadruplos.add(new Compilador.ManejadorDeCuadruplos.Cuadruplo(Long.parseLong(lineArray[0]), Long.parseLong(lineArray[1]), Long.parseLong(lineArray[2]), (int) Long.parseLong(lineArray[3])));
            }

            // Close the BufferedReader.
            reader.close();

            int i = 0;

            while(true){
                System.out.println(cuadruplos.get(i).operando + " " + cuadruplos.get(i).operador1 + " " + cuadruplos.get(i).operador2 + " " + cuadruplos.get(i).output);
                Compilador.ManejadorDeCuadruplos.Cuadruplo cuad = cuadruplos.get(i);

                i++;

                if (i >= cuadruplos.size())
                    break;
            }


        } catch (FileNotFoundException e) {
            System.out.println("File: cuadruplos.txt Not Found");
        } catch (IOException e) {
            System.out.print("IOException: " + e.getMessage());
        }

    }

}