public class Errors {
    public static final int SUCCESS = -200;

    public static final int OPERACION_ILEGAL = -400;

    public static final int VARIABLE_NO_DEFINIDA = -401;
    public static final int VARIABLE_REDEFINIDA = -402;

    public static final int PROCEDIMIENTO_NO_DEFINIDO = -403;
    public static final int PROCEDIMIENTO_REDEFINIDO = -404;

    public static final int STACKOVERFLOW = -405;
    public static final int UNKNOWN_TYPE = -406;
    public static final int UNKNOWN_SCOPE = -407;

    public static String getMessage(int error_code){
        switch (error_code){
            case UNKNOWN_SCOPE:
                return "Scope recibido no concuerda con los establecidos";
            case UNKNOWN_TYPE:
                return  "Tipo de dato desconocido";
            default:
                return "Error";
        }

    }
}

