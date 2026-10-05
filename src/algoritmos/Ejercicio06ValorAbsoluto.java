package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Valor absoluto de un número real.
 */
public class Ejercicio06ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese un número real: ");
        double numero = sc.nextDouble();

        System.out.println("El valor absoluto es: " + Math.abs(numero));

        sc.close();
    }
}
