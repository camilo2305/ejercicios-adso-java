package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Promedio de 10 números.
 */
public class Ejercicio10PromedioDiezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("El promedio es: " + (suma / 10));

        sc.close();
    }
}
