package cicloforadicional;

/**
 * Suma de los números pares del 1 al 100.
 */
public class Ejercicio03SumaPares {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los pares de 1 a 100 es: " + suma);
    }
}
