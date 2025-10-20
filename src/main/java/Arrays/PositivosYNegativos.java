package Arrays;

import java.util.Scanner;

public class PositivosYNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Numeros = new int[10];

        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = teclado.nextInt();
        }
        System.out.println("La suma de los positivos es: " + positivos(Numeros) + " y la suma de los negativos es: " + negativos(Numeros));
    }
    public static int positivos(int[] Numeros){
        int suma = 0;
        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[i] >= 0){
                suma += Numeros[i];
            }
        }
        return suma;
    }
    public static int negativos(int[] Numeros){
        int suma = 0;
        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[i] < 0){
                suma += Numeros[i];
            }
        }
        return suma;
    }
}
