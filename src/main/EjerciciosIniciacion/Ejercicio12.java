package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("Mostrando el número mayor: " + numero1);
        }else {
            System.out.println("Mostrando el número mayor: " + numero2);
        }
    }
}
