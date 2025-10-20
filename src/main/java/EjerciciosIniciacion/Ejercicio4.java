package EjerciciosIniciacion;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el valor del lado ");
    int x = teclado.nextInt();
    int AreaCuadrado = x * x;
    System.out.println(AreaCuadrado);
    }
}
