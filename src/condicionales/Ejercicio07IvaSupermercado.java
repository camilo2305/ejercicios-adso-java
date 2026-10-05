package condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Indica si un producto del supermercado paga IVA (lentejas y arroz no; crema y vino sí).
 */
public class Ejercicio07IvaSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Producto (lentejas, crema, arroz o vino): ");
        String producto = sc.next();

        if (producto.equalsIgnoreCase("lentejas") || producto.equalsIgnoreCase("arroz")) {
            System.out.println(producto + " NO paga IVA.");
        } else if (producto.equalsIgnoreCase("crema") || producto.equalsIgnoreCase("vino")) {
            System.out.println(producto + " SÍ paga IVA.");
        } else {
            System.out.println("Producto no reconocido.");
        }

        sc.close();
    }
}
