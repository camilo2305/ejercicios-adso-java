package conversiones;

/**
 * Carácter numérico a entero real con Character.getNumericValue.
 */
public class Ejercicio05CharAEntero {
    public static void main(String[] args) {
        String serial = "L8";
        char digitoChar = serial.charAt(1);
        int digitoEntero = Character.getNumericValue(digitoChar);

        System.out.println("Dígito como entero: " + digitoEntero);
    }
}
