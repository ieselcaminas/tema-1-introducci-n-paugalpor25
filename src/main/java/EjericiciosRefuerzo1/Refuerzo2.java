package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean EsPar = false;

        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            EsPar = true;
        }

        if (EsPar){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
    }
}
