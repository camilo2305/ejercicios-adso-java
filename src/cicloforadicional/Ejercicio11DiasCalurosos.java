package cicloforadicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Cuenta cuántas de diez temperaturas son de días calurosos (> 30 °C).
 */
public class Ejercicio11DiasCalurosos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int calurosos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Temperatura " + i + " (°C): ");
            double temperatura = sc.nextDouble();
            if (temperatura > 30) {
                calurosos++;
            }
        }
        System.out.println("Días calurosos: " + calurosos);

        sc.close();
    }
}
