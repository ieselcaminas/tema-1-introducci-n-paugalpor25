package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean EsPrimo = true;

        System.out.println("Introduce el número a comprobar");
        num = sc.nextInt();

        if (num == 1) {
            EsPrimo = false;
        }else if (num == 2) {
            EsPrimo = true;
        }else if (num % 2 == 0) {
            EsPrimo = false;
        }else {
            for (int i = 3; i < num - 1; i++) {
                if (num % i == 0) {
                    EsPrimo = false;
                    break;
                }
            }
        }
        if (EsPrimo){
            System.out.println("El número es primo");
        }else {
            System.out.println("No es primo");
        }


    }
}
