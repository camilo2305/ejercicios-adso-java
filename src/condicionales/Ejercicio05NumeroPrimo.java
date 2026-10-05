package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Indica si un número entre 1 y 15 es primo.
 */
public class Ejercicio05NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 15: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 15) {
            System.out.println("El número debe estar entre 1 y 15.");
        } else {
            boolean primo = numero > 1;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " NO es primo.");
            }
        }

        sc.close();
    }
}
