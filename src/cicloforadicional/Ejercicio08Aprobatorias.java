package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Cuenta cuántas de cinco calificaciones son aprobatorias (>= 60).
 */
public class Ejercicio08Aprobatorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int aprobadas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación " + i + ": ");
            double nota = sc.nextDouble();
            if (nota >= 60) {
                aprobadas++;
            }
        }
        System.out.println("Calificaciones aprobatorias: " + aprobadas);

        sc.close();
    }
}
