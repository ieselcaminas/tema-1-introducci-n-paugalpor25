package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.println("Introduce el número del mes a comprobar");
        mes = teclado.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes tiene 31 días");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 días");
        }else {
            System.out.println("El mes tiene 30 días");
        }

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;
            case 2:
                System.out.println("El mes tiene 28 días");
                break;
            default:
                System.out.println("El mes tiene 30 días");
        }
    }
}
