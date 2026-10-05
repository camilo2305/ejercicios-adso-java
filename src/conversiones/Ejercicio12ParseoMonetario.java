package conversiones;

/**
 * Limpieza de texto y parseo de cifra monetaria con Double.parseDouble.
 */
public class Ejercicio12ParseoMonetario {
    public static void main(String[] args) {
        String saldoTexto = "$1,250.75";
        String textoLimpio = saldoTexto.replace("$", "").replace(",", "");
        double saldoNumerico = Double.parseDouble(textoLimpio);

        System.out.println("Saldo numérico: " + saldoNumerico);
    }
}
