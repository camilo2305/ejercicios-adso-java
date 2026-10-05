package conversiones;

/**
 * Autoboxing (double a Double) y unboxing (Double a double).
 */
public class Ejercicio14AutoboxingUnboxing {
    public static void main(String[] args) {
        double temperaturaPrimitiva = 36.6;
        Double temperaturaWrapper = temperaturaPrimitiva;   // autoboxing
        double retornoPrimitivo = temperaturaWrapper;       // unboxing

        System.out.println("Wrapper: " + temperaturaWrapper);
        System.out.println("Primitivo: " + retornoPrimitivo);
    }
}
