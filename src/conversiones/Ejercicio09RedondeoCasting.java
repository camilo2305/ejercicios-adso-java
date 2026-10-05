package conversiones;

/**
 * Redondeo al entero más próximo sumando 0.5 y haciendo casting a int.
 */
public class Ejercicio09RedondeoCasting {
    public static void main(String[] args) {
        double valorMedido = 47.85;
        int valorRedondeado = (int) (valorMedido + 0.5);

        System.out.println("Valor redondeado: " + valorRedondeado);
    }
}
