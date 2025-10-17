package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador =1;
        String lista = "1 ";

        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        do {
            contador++;
            lista = lista + contador + " ";
            System.out.println(lista);

        }while (contador < numero);
    }
}
