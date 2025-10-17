package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int x = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int y = teclado.nextInt();
        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;
        System.out.println("sum: " + sum);
        System.out.println("resta: " + sub);
        System.out.println("multiplicación: " + mult);
        System.out.println("división: " + div);

    }
}
