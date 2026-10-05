package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Números de 1 a n que son mayores al promedio de 1 a n.
 */
public class Ejercicio10MayoresAlPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1.");
        } else {
            // Promedio de 1..n = (n + 1) / 2
            double promedio = (n + 1) / 2.0;
            System.out.println("Promedio de 1 a " + n + ": " + promedio);
            for (int i = 1; i <= n; i++) {
                if (i > promedio) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
