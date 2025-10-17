package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio18_Resolucion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;

        System.out.println("Introduce la hora (h m s):");
        hora = teclado.nextInt();
        minuto = teclado.nextInt();
        segundo = teclado.nextInt();

        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
        }

        System.out.println("Son las: " + hora + ":" + minuto + ":" + segundo);
    }
}
