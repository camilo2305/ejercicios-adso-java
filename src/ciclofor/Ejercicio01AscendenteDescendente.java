package ciclofor;

/**
 * Números entre 0 y 100 en orden ascendente y descendente.
 */
public class Ejercicio01AscendenteDescendente {
    public static void main(String[] args) {
        System.out.println("Ascendente:");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nDescendente:");
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
