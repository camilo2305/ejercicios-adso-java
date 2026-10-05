package conversiones;

/**
 * Ampliación de capacidad entera (conversión implícita).
 */
public class Ejercicio01AmpliacionEntera {
    public static void main(String[] args) {
        int capacidadAlmacen = 45000;
        long capacidadLong = capacidadAlmacen;
        double capacidadDecimal = capacidadAlmacen;

        System.out.println("long: " + capacidadLong);
        System.out.println("double: " + capacidadDecimal);
    }
}
