package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo;
        int divisor;
        int resto;

        System.out.println("Introduce dos números a dividir (x / y): ");
        dividendo = sc.nextInt();
        divisor = sc.nextInt();
        System.out.println(dividendo + " / " + divisor + " equivale a las siguientes restas sucesivas");
        resto = dividendo;

        do {
            System.out.println(dividendo + " - " + divisor + " = " + (resto - divisor));
            resto -= divisor;

        }while (resto >= divisor);
        System.out.println("El resto es: " + resto);
    }
}