package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce varios números");
        int num;
        int positivos = 0;

        do {
            num = teclado.nextInt();
            if (num > 0) {
                positivos++;
            }
        } while (num != 0);
        System.out.println("Hay " +  positivos + " numeros positivos");
    }
}
