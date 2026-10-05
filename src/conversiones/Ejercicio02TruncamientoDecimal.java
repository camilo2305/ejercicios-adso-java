package conversiones;

/**
 * Truncamiento de la parte decimal (conversión explícita).
 */
public class Ejercicio02TruncamientoDecimal {
    public static void main(String[] args) {
        double costoProducto = 1299.99;
        int parteEntera = (int) costoProducto;

        System.out.println("Parte entera: " + parteEntera);
    }
}
