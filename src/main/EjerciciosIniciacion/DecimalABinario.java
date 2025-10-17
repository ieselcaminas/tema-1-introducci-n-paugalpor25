package EjerciciosIniciacion;

import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero decimal {máximo 255}: ");
        numero = sc.nextInt();



        System.out.println("El número en binario es: " + binario(numero));
    }
    public static String binario(int numero){
        String binarioInvertido = "";
        String binarioFinal = "";
        do {
            if (numero % 2 == 0) {
                binarioInvertido += "0 ";
            }else {
                binarioInvertido += "1 ";
            }
            numero /= 2;
        }while (numero > 0);

        for (int i = binarioInvertido.length() - 1; i >= 0; i--) {
            binarioFinal = binarioFinal + binarioInvertido.charAt(i);
        }

        return binarioFinal;
    }
}
