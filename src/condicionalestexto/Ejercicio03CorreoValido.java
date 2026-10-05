package condicionalestexto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Verifica si un correo contiene el símbolo @ (contains).
 */
public class Ejercicio03CorreoValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese su correo electrónico: ");
        String correo = sc.next();

        if (correo.contains("@")) {
            System.out.println("El formato del correo parece válido.");
        } else {
            System.out.println("El formato del correo NO parece válido.");
        }

        sc.close();
    }
}
