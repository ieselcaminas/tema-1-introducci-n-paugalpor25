package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int num2;

        System.out.println("Introduce un primer número: ");
        num = teclado.nextInt();

        if (num == 0){
            System.out.println("El producto de 0 por cualquier número es 0");
        }else {
            System.out.println("Introduce un segundo número");
            num2 = teclado.nextInt();
            System.out.println("El resultado es: " + num * num2);
        }
    }
}
