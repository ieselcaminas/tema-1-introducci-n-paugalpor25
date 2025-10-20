package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Elija el orden de ordenado Ascendente (1) o Descendente (2)");
        int ordenDisplay = sc.nextInt();
       if (ordenDisplay == 1) {
           if (numero1 <= numero2) {
               System.out.println("Mostrando números en orden ascendente: " + numero1 + " , " + numero2);
           }else {
               System.out.println("Mostrando números en orden ascendente: " + numero2 + " , " + numero1);
           }
       }else {
           if (numero1 >= numero2) {
               System.out.println("Mostrando números en orden descendente: " + numero1 + " , " + numero2);
           }else {
               System.out.println("Mostrando números en orden descendente: " + numero2 + " , " + numero1);
           }

       }

    }
}
