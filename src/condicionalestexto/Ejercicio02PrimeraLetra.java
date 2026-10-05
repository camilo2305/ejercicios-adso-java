package condicionalestexto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Determina si la primera letra de una palabra es mayúscula o minúscula (charAt y Character.isUpperCase).
 */
public class Ejercicio02PrimeraLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();
        char primera = palabra.charAt(0);

        if (Character.isUpperCase(primera)) {
            System.out.println("La primera letra es mayúscula.");
        } else {
            System.out.println("La primera letra es minúscula.");
        }

        sc.close();
    }
}
