package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Indica si un número es divisible entre cinco.
 */
public class Ejercicio04DivisiblePorCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre cinco.");
        } else {
            System.out.println("El número NO es divisible entre cinco.");
        }

        sc.close();
    }
}
