package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        float numero = sc.nextFloat();
        if (numero >= 0) {
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo");

        }
    }
}
