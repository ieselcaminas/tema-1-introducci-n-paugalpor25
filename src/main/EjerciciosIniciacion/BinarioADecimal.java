package EjerciciosIniciacion;

import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binario;
        char bit;
        int decimal = 0;
        int potencia;

        System.out.println("Introduce el número en binario: ");
        binario = sc.nextLine();

        for (int i = binario.length() - 1; i >= 0; i--) {
            bit = binario.charAt(i);
            if (bit == '1') {
                potencia = binario.length() -1 - i;
                decimal += Math.pow(2, potencia);
            }
        }
        System.out.println("El número en decimal es: " + decimal);
    }
}



// 1 1 1 0 1 -> 2⁴ 2³ 2² 2¹ 2⁰