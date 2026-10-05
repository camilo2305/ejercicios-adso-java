package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Volumen de un cubo a partir de su lado.
 */
public class Ejercicio05VolumenCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado del cubo: ");
        double lado = sc.nextDouble();

        double volumen = lado * lado * lado;
        System.out.println("El volumen del cubo es: " + volumen);

        sc.close();
    }
}
