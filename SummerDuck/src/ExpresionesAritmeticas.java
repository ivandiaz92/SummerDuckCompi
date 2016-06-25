import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ivandiaz on 6/25/16.
 */
public class ExpresionesAritmeticas {
    Stack<Integer> vectorPolaco;
    LinkedList<Integer> resultado;

    ExpresionesAritmeticas() {
        vectorPolaco = new Stack<>();
        resultado = new LinkedList<>();
    }

    public void addValue(int dir){
        resultado.add(dir);
    }

    public void addOperator(int operatorCode){
        if(vectorPolaco.isEmpty()) {
            vectorPolaco.add(Prioridades.parseOperator(operatorCode));
            return;
        }

        int prioVP = Prioridades.getPriority(vectorPolaco.peek());
        int priorNewOP = Prioridades.getPriority(operatorCode);


        while(vectorPolaco.size() != 0 && prioVP >= priorNewOP) {
            resultado.add(vectorPolaco.pop());
            prioVP = Prioridades.getPriority(vectorPolaco.peek());
        }

        vectorPolaco.add(Prioridades.parseOperator(operatorCode));
    }

    public void concatenate(LinkedList<Integer> aux){
        while (!aux.isEmpty()){
            resultado.push(aux.getFirst());
            aux.removeFirst();
        }
    }

    public LinkedList<Integer> getResultado(){
        return this.resultado;
    }

    // FUncion que parsea un vector de resultados para crear los cuadruplos correspondientes a la expresion
    public static void endExpresion(LinkedList<Integer> resultQUeue){
        Stack<Integer> auxStack = new Stack<>();

        while(!resultQUeue.isEmpty()){

            int toRead = resultQUeue.getFirst();
            resultQUeue.removeFirst();

            if(Prioridades.isParsedOperator(toRead)){
                int operator = Prioridades.unparseOperator(toRead);
                int dir2 = auxStack.pop();
                int dir1 = auxStack.pop();
                int tipo = Cubo.esValido(Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir1), Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir2),operator);
                int dirR = Compilador.memManager.reservarNuevaTemporal(tipo);

                switch (operator){
                    case Prioridades.MULTIPLICACION:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.MUL,dir1,dir2,dirR);
                    case Prioridades.DIVICION:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.DIV,dir1,dir2,dirR);
                    case Prioridades.SUMA:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.ADD,dir1,dir2,dirR);
                    case Prioridades.RESTA:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.SUB,dir1,dir2,dirR);
                }

                auxStack.push(dirR);

            }else {
                auxStack.push(toRead);
            }
        }

    }
}
