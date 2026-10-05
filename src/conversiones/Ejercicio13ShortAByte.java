package conversiones;

/**
 * Casting explícito de short a byte.
 */
public class Ejercicio13ShortAByte {
    public static void main(String[] args) {
        short nivelStock = 120;
        byte nivelByte = (byte) nivelStock;

        System.out.println("Nivel como byte: " + nivelByte);
    }
}
