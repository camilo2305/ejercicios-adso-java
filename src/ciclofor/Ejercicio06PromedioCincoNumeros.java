package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Promedio de cinco números pedidos al usuario.
 */
public class Ejercicio06PromedioCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("El promedio es: " + (suma / 5));

        sc.close();
    }
}
