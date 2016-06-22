import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

/**
 * Created by ivandiaz on 6/21/16.
 */
public class MemVirtual {
    private HashMap<Integer,Object> virtualMem = new HashMap<>();

    public void declararVariable(int dir){
        int type = Compilador.ManejadorDeMemoria.Memoria.obtenerTipo(dir);

        switch (type){
            case Compilador.ManejadorDeMemoria.Memoria.VAR_INT:
                int x = 0;
                virtualMem.put(dir,x);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL:
                boolean y = true;
                virtualMem.put(dir,y);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_STRING:
                String z = "";
                virtualMem.put(dir,z);
                break;
            case Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT:
                double a = 0.0;
                virtualMem.put(dir,a);
                break;
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
        return virtualMem.get(dir).toString();
    }

    public int obtenerInt(int dir){
        return (int)virtualMem.get(dir);
    }

    public double obtenerDouble(int dir){
        return (double)virtualMem.get(dir);
    }

    public boolean obtenerBoolean(int dir){
        return (boolean)virtualMem.get(dir);
    }

    //Setters
    public void asignarString(int dir,String value){
        virtualMem.put(dir,value);
    }

    public void asignarInt(int dir, int value){
        virtualMem.put(dir,value);
    }

    public void asignarDouble(int dir, double value){
        virtualMem.put(dir,value);
    }

    public void asignarBoolean(int dir, boolean value){
        virtualMem.put(dir,value);
    }
}
