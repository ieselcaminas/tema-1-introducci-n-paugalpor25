package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int metros;
        int velocidadMax; //Km/h
        int segundos;
        float km;
        float horas;
        float velocidad;

        System.out.println("Introduzca los metros, la velocidad máxima y el tiempo en segundos");
        metros = sc.nextInt();
        velocidadMax = sc.nextInt();
        segundos = sc.nextInt();

        //La velocidad máxima está en km/h por lo que hay que pasar la unidades
        km = metros/ 1000f;
        horas = segundos / 3600f;

        velocidad = km/horas;

        if (velocidad > velocidadMax * 1.2f){
            System.out.println("PUNTOS");
        } else if (velocidad > velocidadMax) {
            System.out.println("MULTA");
        }else {
            System.out.println("OK");
        }
    }
}
