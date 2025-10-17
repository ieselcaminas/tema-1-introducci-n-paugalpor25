package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int factorial = 1;

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            factorial = factorial * i;

        }
        System.out.println("El resultado del factorial es: " + factorial);
    }
}
