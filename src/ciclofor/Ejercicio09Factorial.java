package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Factorial de un número entero n (n!).
 */
public class Ejercicio09Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese un número entero n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else if (n > 20) {
            System.out.println("Use un n menor o igual a 20 (con long, valores mayores desbordan).");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        sc.close();
    }
}
