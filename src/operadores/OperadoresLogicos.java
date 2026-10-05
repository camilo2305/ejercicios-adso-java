package operadores;

/**
 * Valor de verdad de las expresiones lógicas (numeradas 4 a 13 como en la guía).
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("4) "  + ((true && false) || (false || true)));
        System.out.println("5) "  + ((true && false) || (true && (false || true))));
        System.out.println("6) "  + ((false == !true) && ((false && true) && true)));
        System.out.println("7) "  + ((false == !true) || (false && false) || (false || true)));
        System.out.println("8) "  + ((false == true) && (true && true) && (false && true)));
        System.out.println("9) "  + (4>6 && 10==10 && 3%3<=0));
        System.out.println("10) " + (7!=8 && 5*(8-9)>-3 && 4==5 || 6!=5));
        System.out.println("11) " + ((5%5 > 1 || !(5 == 4)) || 4 != 1 || 4 < -4));
        System.out.println("12) " + (!(6*-1 == 6) && (2<3*-1) || (3==3) || (9<50/10) || !(18==2*9)));
        System.out.println("13) " + ((false != 2>1) && (true == 4 < 2)));
    }
}
