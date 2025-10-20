package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;
        float descuento_calculado;

        System.out.println("Introduzca el precio del producto:");
        precio = teclado.nextFloat();

        if (precio < 6) {
            System.out.println("El precio es: " + precio);
        }else if (precio >= 6 && precio < 60) {
            descuento_calculado = 0.95f;
            System.out.println("El precio final es: " + (precio * descuento_calculado) + "€" );
        }else {
            descuento_calculado = 0.90f;
            System.out.println("El precio final es: " + (precio * descuento_calculado) + "€");
        }
    }
}
