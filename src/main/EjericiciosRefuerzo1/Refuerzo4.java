package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        do {
            System.out.println("Introduce otro número");
            num = teclado.nextInt();

        }while (num % 10 == 0);


    }
}
