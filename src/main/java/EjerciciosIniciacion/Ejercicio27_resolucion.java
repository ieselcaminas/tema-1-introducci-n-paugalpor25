package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio27_resolucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String lista = "";

        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            lista = lista + i + " ";
            System.out.println(lista);

        }


    }
}
