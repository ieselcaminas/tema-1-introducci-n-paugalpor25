package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldo;
        float gastos;

        System.out.println("Introduce el saldo y los gastos");
        saldo = sc.nextFloat();
        gastos = sc.nextFloat();

        if (saldo + gastos >= 0){
            System.out.println("SÍ");
        }else{
            System.out.println("NO");
        }
    }
}
