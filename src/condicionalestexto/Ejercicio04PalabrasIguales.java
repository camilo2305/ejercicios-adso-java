package condicionalestexto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Determina si dos palabras son exactamente iguales (equals).
 */
public class Ejercicio04PalabrasIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String primera = sc.next();
        System.out.print("Segunda palabra: ");
        String segunda = sc.next();

        if (primera.equals(segunda)) {
            System.out.println("Las palabras son exactamente iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        sc.close();
    }
}
