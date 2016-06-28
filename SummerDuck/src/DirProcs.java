import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ivandiaz on 5/28/16.
 */
public class DirProcs {

    HashMap<String, Procedimiento> tabla = new HashMap<String, Procedimiento>();

    // registra un procedimiento en la tabla de directorios
    public int registrarProc(Procedimiento proc){
        if (tabla.containsKey(proc.getName())){
            return Errors.PROCEDIMIENTO_REDEFINIDO;
        }

        tabla.put(proc.getName(), proc);
        return Errors.SUCCESS;
    }
}
