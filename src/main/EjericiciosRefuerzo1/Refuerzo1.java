package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número entero");
        num = sc.nextInt();

        System.out.println("El número es: " + num);
        System.out.println("El doble del número es: " + num * 2 + " | Y el triple es: " + num * 3);

    }
}
