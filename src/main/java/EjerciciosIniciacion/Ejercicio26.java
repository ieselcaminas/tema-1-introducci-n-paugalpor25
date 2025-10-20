package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplicador = 0;

        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        System.out.println("La tabla de multiplicar de " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            multiplicador++;
            System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
        }
    }
}
