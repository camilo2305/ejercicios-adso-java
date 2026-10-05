package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Suma de los números entre m y n.
 */
public class Ejercicio04SumaEntreMyN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        // Si el usuario escribe m mayor que n, se intercambian.
        if (m > n) {
            int temporal = m;
            m = n;
            n = temporal;
        }

        long suma = 0;
        for (int i = m; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma entre " + m + " y " + n + " es: " + suma);

        sc.close();
    }
}
