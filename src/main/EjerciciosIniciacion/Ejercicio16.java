package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        String operacion;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextInt();
        System.out.println("Operación a realizar: (+ , - , * , /)");
        operacion = teclado.next();

        switch (operacion) {
            case "+":
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case "/":
                System.out.println("El resultado de la división es: " + (num1 / num2));
                break;
        }

    }
}
