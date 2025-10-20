package Strings;

import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin1 = "";
        String bin2 = "";
        int bit1;
        int bit2;
        int acarreo = 0;
        int resultado;
        String resBinario = "";

        System.out.println("Introduce el primer binario: ");
        bin1 = sc.nextLine();
        System.out.println("Introduce el segundo binario: ");
        bin2 = sc.nextLine();

        for (int i = bin1.length() - 1; i >= 0 ; i--) {
            bit1 = Integer.parseInt("" + bin1.charAt(i));
            bit2 = Integer.parseInt("" + bin2.charAt(i));
            resultado = acarreo + bit1 + bit2;

            if (resultado == 0){
                acarreo = 0;
                resBinario = "0" + resBinario;
            }else if (resultado == 1){
                acarreo = 0;
                resBinario = "1" + resBinario;
            } else if (resultado == 2) {
                acarreo = 1;
                resBinario = "0" + resBinario;
            }else {
                acarreo = 1;
                resBinario = "1" + resBinario;
            }
        }
        if (acarreo == 1){
            resBinario = "1" + resBinario;
        }
        System.out.println("El resultado de la suma es: " + resBinario);
    }
}
