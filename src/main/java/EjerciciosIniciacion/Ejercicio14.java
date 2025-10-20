package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Escriba la nota (Entre 0 y 10)");
        nota = sc.nextInt();
        if (nota <=3) {
            System.out.println("Muy deficiente");
        } else if (nota <5) {
            System.out.println("Insuficiente");
        }else if (nota <6) {
            System.out.println("Suficiente");
        } else if (nota <7) {
            System.out.println("Bien");
        } else if (nota <9) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }

    }
}
