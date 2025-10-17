package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio20_Resolucion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;
        float descuento;

        System.out.println("Introduzca el precio del producto:");
        precio = teclado.nextFloat();

        if (precio < 6) {
            descuento = 0;
        }else if (precio >= 6 && precio < 60) {
            descuento = precio * 0.05f;
        }else {
            descuento = precio * 0.1f;
        }

        System.out.println("El precio final es: " + (precio - descuento) + "€");
    }
}