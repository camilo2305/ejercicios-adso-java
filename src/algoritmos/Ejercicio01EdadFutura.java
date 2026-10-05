package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Edad que tendrá el usuario dentro de N años.
 */
public class Ejercicio01EdadFutura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("¿Dentro de cuántos años quiere saber su edad? ");
        int anios = sc.nextInt();

        System.out.println("Dentro de " + anios + " años tendrá " + (edad + anios) + " años.");

        sc.close();
    }
}
