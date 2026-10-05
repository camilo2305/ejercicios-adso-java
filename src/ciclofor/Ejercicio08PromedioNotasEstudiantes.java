package ciclofor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Promedio de tres notas para n estudiantes.
 */
public class Ejercicio08PromedioNotasEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes son? ");
        int n = sc.nextInt();

        for (int estudiante = 1; estudiante <= n; estudiante++) {
            double suma = 0;
            System.out.println("Estudiante " + estudiante);
            for (int nota = 1; nota <= 3; nota++) {
                System.out.print("  Nota " + nota + ": ");
                suma += sc.nextDouble();
            }
            System.out.println("  Promedio: " + (suma / 3));
        }

        sc.close();
    }
}
