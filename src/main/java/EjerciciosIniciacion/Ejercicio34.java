package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicando;
        int multiplicador;
        int incremento = 0;

        System.out.println("Introduce dos números a multiplicar (x * y): ");
        multiplicando = sc.nextInt();
        multiplicador = sc.nextInt();
        System.out.println(multiplicando + " x " + multiplicador + " equivale a las siguientes sumas incrementales");

        for (int i = 1; i <= multiplicador; i++) {

            System.out.println(incremento + " + " + multiplicando + " = " + (incremento + multiplicando));
            incremento += multiplicando;
        }

    }
}
