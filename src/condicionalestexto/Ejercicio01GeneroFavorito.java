package condicionalestexto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Verifica si el género favorito de película es terror (equalsIgnoreCase).
 */
public class Ejercicio01GeneroFavorito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("¿Cuál es su género favorito de película? ");
        String genero = sc.nextLine();

        if (genero.equalsIgnoreCase("terror")) {
            System.out.println("¡Le gustan las películas de miedo!");
        } else {
            System.out.println("No le gustan las películas de miedo.");
        }

        sc.close();
    }
}
