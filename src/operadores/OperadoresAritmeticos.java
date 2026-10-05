package operadores;

/**
 * Resultado de las 12 operaciones aritméticas (Java aplica la jerarquía y la división entera).
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("1) "  + (10%2*5/10+3*(5+2*3)%60));
        System.out.println("2) "  + (-3*(4-8)+15-3*15-0%5));
        System.out.println("3) "  + (-15%3-15000/3000*(4*(-12+15*6))/10));
        System.out.println("4) "  + (-1*(15/5-2)+2-4%4+2));
        System.out.println("5) "  + (-50/-3-50%60-4*(-5-9-4*(-3-7)-49)-7%-7));
        System.out.println("6) "  + (3*50/5+90%100-100/(4*-3+2)));
        System.out.println("7) "  + (8*(17-3*-9-(15+21%7-2)/13-(-1-100)/10)+17*8-1));
        System.out.println("8) "  + (5%1+2%2*12565-7*(4/2/2*8-8)));
        System.out.println("9) "  + ((5/3)+(((48%15)-1)/3)+10/5*2));
        System.out.println("10) " + (((-5*12)/5)-6%2+3));
        System.out.println("11) " + (5*(4/4*4-(44+4/-4))-6%9));
        System.out.println("12) " + (12/4%5+7/(8*((11/3)/17)-23%8)+78));
    }
}
