package conversiones;

/**
 * Decimal a hexadecimal y binario.
 */
public class Ejercicio08HexaBinario {
    public static void main(String[] args) {
        int numeroBase = 255;
        String enHexa = Integer.toHexString(numeroBase);
        String enBinario = Integer.toBinaryString(numeroBase);

        System.out.println("Hexadecimal: " + enHexa);
        System.out.println("Binario: " + enBinario);
    }
}
