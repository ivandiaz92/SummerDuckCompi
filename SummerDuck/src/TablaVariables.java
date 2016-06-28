import java.util.HashMap;
import java.util.LinkedList;

public class TablaVariables {
    // Contenedor de variables
    private HashMap<String,Var> tabla = new HashMap<String,Var>();

    public int agregarVariable(int tipo, String nombre, int direccion){
        if(tabla.containsKey(nombre)){
            return Errors.VARIABLE_REDEFINIDA;
        }
        tabla.put(nombre,new Var(tipo,nombre,direccion));
        return  Errors.SUCCESS;
    }

    // obtener la direccion de la variable
    public int obtenerDireccionVar(String nombre){
        if(!tabla.containsKey(nombre)){
            return Errors.VARIABLE_NO_DEFINIDA;
        }
        return tabla.get(nombre).direccion;
    }

    // limpiar tabla
    public void clear(){
        tabla.clear();
    }

    // Obtener la variable
    public Var obtenerVariable(String nombre){
        if(!tabla.containsKey(nombre)){
            return null;
        }
        return tabla.get(nombre);
    }

    public static class Var{
        public int tipo;
        public String nombre;
        public int direccion;
        private LinkedList<Dimension> dimensiones;

        public Var(int tipo, String nombre, int direccion){
            this.tipo = tipo;
            this.nombre = nombre;
            this.direccion = direccion;
            dimensiones = new LinkedList<>();
            dimensiones.push(new Dimension(1,0));
        }

        public void AgregarDimension(int celdas, int m){
            dimensiones.push(new Dimension(celdas,m));
        }

        public boolean esMultiDim(){
            return dimensiones.size() > 1;
        }

        public class Dimension{
            int cantidad;
            int m;

            public Dimension(int cantidad, int m) {
                this.cantidad = cantidad;
                this.m = m;
            }
        }
    }
}
