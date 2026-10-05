package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Indica si tres ángulos internos corresponden a un triángulo (suman 180° y todos son positivos).
 */
public class Ejercicio02AngulosTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primer ángulo: ");
        double a = sc.nextDouble();
        System.out.print("Segundo ángulo: ");
        double b = sc.nextDouble();
        System.out.print("Tercer ángulo: ");
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180) {
            System.out.println("Los ángulos SÍ corresponden a un triángulo.");
        } else {
            System.out.println("Los ángulos NO corresponden a un triángulo.");
        }

        sc.close();
    }
}
