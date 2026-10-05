package conversiones;

/**
 * Detección de infinito con Double.isInfinite.
 */
public class Ejercicio11DeteccionInfinito {
    public static void main(String[] args) {
        double resultadoDivision = 5.0 / 0.0;
        boolean esInfinito = Double.isInfinite(resultadoDivision);

        System.out.println("Resultado: " + resultadoDivision);
        System.out.println("¿Es infinito? " + esInfinito);
    }
}
