package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Recorre de 1 a n (n puede ser negativo) e indica cuáles números son positivos.
 */
public class Ejercicio09Positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese n (puede ser negativo): ");
        int n = sc.nextInt();

        // Si n es negativo, se recorre desde n hasta 1.
        int inicio = Math.min(1, n);
        int fin = Math.max(1, n);

        for (int i = inicio; i <= fin; i++) {
            if (i > 0) {
                System.out.println(i + " positivo");
            } else {
                System.out.println(i + " no es positivo");
            }
        }

        sc.close();
    }
}
