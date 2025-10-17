package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;

        System.out.println("Introduce las hora: ");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        minuto = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        segundo = sc.nextInt();

        if (hora <=23 && minuto <= 59 && segundo < 59) {
            System.out.println("El próximo segundo serán las: " + hora + ":" + minuto + ":" + (segundo+1));
        }else if (hora <=23 && minuto < 59 && segundo == 59) {
            System.out.println("El próximo segundo serán las: " + hora + ":" + (minuto+1) + ":" + 0);
        }else if (hora <23 && minuto == 59 && segundo == 59) {
            System.out.println("El próximo segundo serán las: " + (hora+1) + ":" + 0 + ":" + 0);
        }else if  (hora == 23 && minuto == 59 && segundo == 59) {
            System.out.println("El próximo segundo serán las: " + 0 + ":" + 0 + ":" + 0 );
        }else {
            System.out.println("Mira la hora porque no puede ser");
        }


    }
}
