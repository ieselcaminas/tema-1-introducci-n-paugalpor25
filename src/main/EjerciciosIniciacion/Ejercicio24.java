package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sumaNotas = 0f;
        float nota;
        int contador_notas = 0;
        boolean HayUnDiez = false;

        System.out.println("Introduce las notas:");

        do {
            nota = teclado.nextInt();
            if (nota != -1) {
                sumaNotas += nota;
                contador_notas++;
            }
            if (nota ==10){
                HayUnDiez = true;
            }

        } while (nota != -1);

        System.out.println("La nota media es: " + sumaNotas / contador_notas);
        if (HayUnDiez) {
            System.out.println("Hay un diez en las notas introducidas");
        }

    }
}
