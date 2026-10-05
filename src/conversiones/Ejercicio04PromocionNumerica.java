package conversiones;

/**
 * Promoción numérica: short * float da float.
 */
public class Ejercicio04PromocionNumerica {
    public static void main(String[] args) {
        short piezas = 500;
        float pesoUnitario = 2.5f;
        float pesoTotal = piezas * pesoUnitario;

        System.out.println("Peso total: " + pesoTotal);
    }
}
