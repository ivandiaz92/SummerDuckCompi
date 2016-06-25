import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ivandiaz on 6/25/16.
 */
public class ExpresionesAritmeticas {
    private Stack<Integer> vectorPolaco;
    private LinkedList<Integer> resultado;

    public int getDirResultado() {
        return dirResultado;
    }

    private int dirResultado;

    ExpresionesAritmeticas() {
        vectorPolaco = new Stack<>();
        resultado = new LinkedList<>();
        dirResultado = Errors.VARIABLE_NO_DEFINIDA;
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


        while(prioVP >= priorNewOP) {
            resultado.add(vectorPolaco.pop());

            if(vectorPolaco.isEmpty()){
                break;
            }
            prioVP = Prioridades.getPriority(vectorPolaco.peek());
        }

        vectorPolaco.add(Prioridades.parseOperator(operatorCode));
    }

    public void finishHim() {
        while(!vectorPolaco.isEmpty()){
            resultado.add(vectorPolaco.pop());
        }
    }

    // FUncion que parsea un vector de resultados para crear los cuadruplos correspondientes a la expresion
    public void endExpresion(){
        finishHim();

        Stack<Integer> auxStack = new Stack<>();

        while(!resultado.isEmpty()){

            int toRead = resultado.getFirst();
            resultado.removeFirst();

            if(Prioridades.isParsedOperator(toRead)){
                int operator = Prioridades.unparseOperator(toRead);
                int dir2 = auxStack.pop();
                int dir1 = auxStack.pop();
                int tipo = Cubo.esValido(Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir1), Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir2),operator);
                int dirR = Compilador.memManager.reservarNuevaTemporal(tipo);

                switch (operator){
                    case Prioridades.MULTIPLICACION:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.MUL,dir1,dir2,dirR);
                        break;
                    case Prioridades.DIVICION:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.DIV,dir1,dir2,dirR);
                        break;
                    case Prioridades.SUMA:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.ADD,dir1,dir2,dirR);
                        break;
                    case Prioridades.RESTA:
                        Compilador.cuadManager.agregarCuadruplo(Instrucciones.SUB,dir1,dir2,dirR);
                        break;
                }

                auxStack.push(dirR);

            }else {
                auxStack.push(toRead);
            }
        }
        dirResultado = auxStack.pop();
    }
}
