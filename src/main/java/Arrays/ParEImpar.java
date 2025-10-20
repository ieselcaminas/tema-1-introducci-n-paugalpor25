package Arrays;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cuantos números quieras: ");
        int[] Numeros = new int[]{teclado.nextInt()};


        System.out.println("Hay " + CuantosPares(Numeros) + " números pares y " + CuantosImpares(Numeros) + " números impares");
    }
    public static int CuantosPares(int[] Numeros){
     int contador = 0;
        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[i] % 2 == 0){
                contador += 1;
            }
        }
        return  contador;
    }
    public static int CuantosImpares(int[] Numeros){
        int contador = 0;
        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[i] % 2 != 0){
                contador += 1;
            }
        }
        return  contador;
    }
}
