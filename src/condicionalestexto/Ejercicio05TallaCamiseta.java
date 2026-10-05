package condicionalestexto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Valida una talla de camiseta: solo S, M o L son válidas.
 */
public class Ejercicio05TallaCamiseta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la talla (S, M, L): ");
        String talla = sc.next();

        if (talla.equals("S") || talla.equals("M") || talla.equals("L")) {
            System.out.println("Talla válida.");
        } else {
            System.out.println("Talla inválida.");
        }

        sc.close();
    }
}
