import java.util.*;
import java.lang.Math;

public class exel1401_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        
        System.out.println("informe os MB`s usados");
        a = input.nextInt();
        if (a > 100) {
            b = (a - 100) * 2 + 40;
            System.out.println("Valor á ser pago: R$" + b);
        } else {
            System.out.println("valor a pagar R$ 40");
        }
    }
}
