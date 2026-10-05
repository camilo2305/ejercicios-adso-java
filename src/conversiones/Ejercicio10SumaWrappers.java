package conversiones;

/**
 * Suma de objetos Integer (unboxing) y promedio con precisión decimal.
 */
public class Ejercicio10SumaWrappers {
    public static void main(String[] args) {
        Integer[] notas = {90, 85, 88};

        int sumaNotas = 0;
        for (Integer nota : notas) {
            sumaNotas += nota; // unboxing automático
        }
        double promedioFinal = (double) sumaNotas / notas.length;

        System.out.println("Suma: " + sumaNotas);
        System.out.println("Promedio: " + promedioFinal);
    }
}
