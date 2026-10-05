package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Mayor de n números, mostrando el mayor hasta el momento en cada vuelta.
 */
public class Ejercicio06MayorHastaElMomento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números va a ingresar? ");
        int n = sc.nextInt();

        double mayor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            double numero = sc.nextDouble();
            if (i == 1 || numero > mayor) {
                mayor = numero;
            }
            System.out.println("Mayor hasta el momento: " + mayor);
        }

        sc.close();
    }
}
