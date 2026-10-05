package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Indica si un número es par o impar.
 */
public class Ejercicio03ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        sc.close();
    }
}
