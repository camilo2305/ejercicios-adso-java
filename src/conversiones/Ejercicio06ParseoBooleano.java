package conversiones;

/**
 * Cadena a boolean con Boolean.parseBoolean.
 */
public class Ejercicio06ParseoBooleano {
    public static void main(String[] args) {
        String entradaServidor = "true";
        boolean estadoConexion = Boolean.parseBoolean(entradaServidor);

        System.out.println("Estado de conexión: " + estadoConexion);
    }
}
