package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int any;

        System.out.println("Ingresa el año a comprobar: ");
        any = sc.nextInt();
        if ((any % 400 == 0) || (any % 4 == 0) && (any % 100 != 0 )) {
            System.out.println("Es bisiesto");
        }else {
            System.out.println("No es bisiesto");
        }
    }
}
