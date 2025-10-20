package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String divisores = "";

        System.out.println("Introduce un numero natural");
        numero = sc.nextInt();
        System.out.println("Los divisores del numero son:");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + " ";
            }
        }

        System.out.println(divisores);
    }
}
