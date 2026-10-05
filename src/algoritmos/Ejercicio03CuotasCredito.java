package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Valor de la cuota mensual de un electrodoméstico a crédito (recargo del 25%).
 */
public class Ejercicio03CuotasCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final double RECARGO_CREDITO = 0.25;

        System.out.print("Precio del electrodoméstico: ");
        double precio = sc.nextDouble();
        System.out.print("Plazo en meses: ");
        int meses = sc.nextInt();

        if (meses <= 0) {
            System.out.println("El plazo debe ser mayor que cero.");
        } else {
            double valorTotal = precio * (1 + RECARGO_CREDITO);
            double cuota = valorTotal / meses;
            System.out.println("Valor total a crédito: " + valorTotal);
            System.out.println("Cuota mensual: " + cuota);
        }

        sc.close();
    }
}
