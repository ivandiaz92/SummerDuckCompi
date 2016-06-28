import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MemVirtual {
    private HashMap<Integer,Object> virtualMem = new HashMap<>();
    private LinkedList<HashMap<Integer,Object>> localsMem = new LinkedList<>();

    public void entrandoAContextoLocal(){
        localsMem.push(new HashMap<Integer, Object>());
    }

    public void saliendoDeContextoLocal(){
        localsMem.removeLast();
    }

    public void declararVariable(int dir){
        int type = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir);
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        if (scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL){
            switch (type) {
                case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                    int x = 0;
                    localsMem.getLast().put(dir, x);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                    boolean y = true;
                    localsMem.getLast().put(dir, y);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                    String z = "";
                    localsMem.getLast().put(dir, z);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                    double a = 0.0;
                    localsMem.getLast().put(dir, a);
                    break;
            }
        }else {
            switch (type) {
                case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                    int x = 0;
                    virtualMem.put(dir, x);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                    boolean y = true;
                    virtualMem.put(dir, y);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                    String z = "";
                    virtualMem.put(dir, z);
                    break;
                case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                    double a = 0.0;
                    virtualMem.put(dir, a);
                    break;
            }
        }
    }

    public void declararConstante(int dir, String cte){
        int type = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir);

        switch (type){
            case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                int x = Integer.parseInt(cte);
                virtualMem.put(dir,x);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                boolean y = Boolean.parseBoolean(cte);
                virtualMem.put(dir,y);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                virtualMem.put(dir,cte);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                double a = Double.parseDouble(cte);
                virtualMem.put(dir,a);
                break;
        }
    }

    // Getters
    public String obtenerString(int dir){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        return scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL ? localsMem.getLast().get(dir).toString() : virtualMem.get(dir).toString();
    }

    public int obtenerInt(int dir){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        return scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL ? (int)localsMem.getLast().get(dir) : (int)virtualMem.get(dir);
    }

    public double obtenerDouble(int dir){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        return scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL ? (double)localsMem.getLast().get(dir) :  (double)virtualMem.get(dir);
    }

    public boolean obtenerBoolean(int dir){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        return scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL ? (boolean)localsMem.getLast().get(dir) : (boolean)virtualMem.get(dir);
    }

    //Setters
    public void asignarString(int dir,String value){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        if(scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL){
            localsMem.getLast().put(dir,value);
            return;
        }
        virtualMem.put(dir,value);
    }

    public void asignarInt(int dir, int value){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        if(scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL){
            localsMem.getLast().put(dir,value);
            return;
        }
        virtualMem.put(dir,value);
    }

    public void asignarDouble(int dir, double value){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        if(scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL){
            localsMem.getLast().put(dir,value);
            return;
        }
        virtualMem.put(dir,value);
    }

    public void asignarBoolean(int dir, boolean value){
        int scope = Compilador.ManejadorDeMemoria.Memoria.obtenerScope(dir);
        if(scope == Compilador.ManejadorDeMemoria.Memoria.SCOPE_LOCAL){
            localsMem.getLast().put(dir,value);
            return;
        }
        virtualMem.put(dir,value);
    }
}
