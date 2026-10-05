package conversiones;

/**
 * Desbordamiento numérico en tipo byte (casting explícito).
 */
public class Ejercicio03DesbordamientoByte {
    public static void main(String[] args) {
        int sensorValor = 300;
        byte sensorByte = (byte) sensorValor;

        // 300 no cabe en un byte (-128 a 127): 300 - 256 = 44
        System.out.println("Valor como byte: " + sensorByte);
    }
}
