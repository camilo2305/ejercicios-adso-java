package cicloforadicional;

/**
 * Múltiplos de 4 entre 1 y 20.
 */
public class Ejercicio05MultiplosDeCuatro {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
