import java.util.HashMap;

/**
 * Created by ivandiaz on 5/28/16.
 */
public class DirProcs {

    public class Procedimiento{
        public int tipoRetorno;
        public String nombre;
        public int direccion;

        public Procedimiento(int tipoRetorno, String nombre, int direccion){
            this.tipoRetorno = tipoRetorno;
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }

    HashMap<String, Procedimiento> tabla = new HashMap<String, Procedimiento>();

    public int registrarProc(int tipoRetorno, String nombre, int direccion){
        if (tabla.containsKey(nombre)){
            return Errors.PROCEDIMIENTO_REDEFINIDO;
        }

        tabla.put(nombre, new Procedimiento(tipoRetorno, nombre, direccion));
        return Errors.SUCCESS;
    }
}
