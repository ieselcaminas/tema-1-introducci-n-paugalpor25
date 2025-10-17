package EjerciciosIniciacion;

import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        int lado;
        Scanner teclado = new Scanner(System.in);
        lado = teclado.nextInt();
        System.out.println(lado * lado);
    }
}
