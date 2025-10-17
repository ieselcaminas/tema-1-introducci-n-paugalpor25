package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Introduce dos números a comprobar: ");
        a = teclado.nextInt();
        b = teclado.nextInt();

        if (a % b == 0){
            System.out.println(a + " Es múltiplo de " + b);
        }else {
            System.out.println(a + " No es múltiplo de " + b);
        }
    }
}
