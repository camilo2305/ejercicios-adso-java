package ciclofor;

/**
 * Números del 1 al 20 excepto el 11.
 */
public class Ejercicio02ExceptoOnce {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i != 11) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
