package cicloforadicional;

/**
 * Números del 1 al 30, con "Fizz" en lugar de los múltiplos de 3.
 */
public class Ejercicio02Fizz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
