package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio real");
        float PrecioReal = teclado.nextFloat();
        System.out.println("Introduce el precio rebajado");
        float PrecioRebajado = teclado.nextFloat();
        float descuento = (PrecioReal - PrecioRebajado) / PrecioReal * 100;

        System.out.println("El descuento es: "  + descuento);
    }
}
