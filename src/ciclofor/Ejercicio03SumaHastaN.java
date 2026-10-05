package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Suma de los números naturales entre 1 y n.
 */
public class Ejercicio03SumaHastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de 1 a " + n + " es: " + suma);

        sc.close();
    }
}
