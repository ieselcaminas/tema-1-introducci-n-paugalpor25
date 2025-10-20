package EjerciciosIniciacion;

import java.util.Scanner;

public class BinarioADecimalSolucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero decimal {máximo 255}: ");
        numero = sc.nextInt();



        System.out.println("El número en binario es: " + binario(numero));
    }
    public static String binario(int numero){
        String binario = "";
        int bit;
        do {
            bit = numero % 2;
            binario = bit + binario;
            numero /= 2;
        }while (numero > 0);


        return binario;
    }

}
