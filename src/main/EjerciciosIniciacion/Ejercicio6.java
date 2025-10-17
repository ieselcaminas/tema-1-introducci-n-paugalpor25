package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor del radio");
        int radio = teclado.nextInt();

        double PI = Math.PI;
        double perímetro = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("El perímetro es: " + perímetro);
        System.out.println("El área es: " + area);
    }
}
