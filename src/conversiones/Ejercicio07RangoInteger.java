package conversiones;

/**
 * Verificación del rango de int con las constantes de Integer.
 */
public class Ejercicio07RangoInteger {
    public static void main(String[] args) {
        long entradaGrande = 2147483648L;
        boolean esValidoParaInt = entradaGrande <= Integer.MAX_VALUE && entradaGrande >= Integer.MIN_VALUE;

        System.out.println("¿Cabe en un int? " + esValidoParaInt);
    }
}
