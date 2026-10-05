package ciclofor;

/**
 * Suma de los números entre 1 y 100.
 */
public class Ejercicio05SumaUnoACien {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de 1 a 100 es: " + suma);
    }
}
