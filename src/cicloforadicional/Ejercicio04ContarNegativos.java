package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Cuenta cuántos de diez números ingresados son negativos.
 */
public class Ejercicio04ContarNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            double numero = sc.nextDouble();
            if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Cantidad de números negativos: " + negativos);

        sc.close();
    }
}
