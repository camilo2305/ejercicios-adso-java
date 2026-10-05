package cicloforadicional;

/**
 * Suma de los números del 1 al 50 divisibles por 3 o por 5.
 */
public class Ejercicio07DivisiblesPor3o5 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
