package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Muestra el mayor de dos números e indica si son iguales.
 */
public class Ejercicio06MayorDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();

        if (a == b) {
            System.out.println("Los números son iguales.");
        } else if (a > b) {
            System.out.println("El mayor es: " + a);
        } else {
            System.out.println("El mayor es: " + b);
        }

        sc.close();
    }
}
