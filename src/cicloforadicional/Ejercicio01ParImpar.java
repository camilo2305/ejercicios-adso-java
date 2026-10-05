package cicloforadicional;

/**
 * Números del 1 al 50 indicando si son pares o impares.
 */
public class Ejercicio01ParImpar {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}
