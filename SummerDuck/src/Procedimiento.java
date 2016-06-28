/**
 * Created by ivandiaz on 6/26/16.
 */
import java.util.ArrayList;

public class Procedimiento{
    private int tipoRetorno; // entero, boleano, string
    private int direccion; // Direccion de # de caudruplo
    private int numParams; // Cantidad de parametros que tiene la funcion
    private String nombre; // ID de la funcion
    private ArrayList<TablaVariables.Var> params; // Arreglo con los parametros


    public Procedimiento(int tipoRetorno, String nombre, int direccion){
        this.tipoRetorno = tipoRetorno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numParams = 0;
        this.params = new ArrayList<>();
    }

    public void addParam(int tipo, String nombre, int direccion){
        numParams++;
        params.add(new TablaVariables.Var(tipo,nombre,direccion));
    }

    public String getName() {
        return  this.nombre + "-" + numParams;
    }
}
