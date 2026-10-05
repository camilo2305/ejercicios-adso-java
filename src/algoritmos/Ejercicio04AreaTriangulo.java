package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Área de un triángulo a partir de su base y su altura.
 */
public class Ejercicio04AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        sc.close();
    }
}
