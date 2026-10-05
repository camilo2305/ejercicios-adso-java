package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Producto, cociente, suma y resta de dos números.
 */
public class Ejercicio02OperacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primer número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Producto: " + (a * b));
        if (b != 0) {
            System.out.println("Cociente: " + (a / b));
        } else {
            System.out.println("Cociente: no se puede dividir entre cero");
        }

        sc.close();
    }
}
