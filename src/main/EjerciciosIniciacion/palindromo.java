package EjerciciosIniciacion;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = teclado.next();

    }
    public static boolean palindromo(String palabra) {
        boolean EsPalindromo = true;

        for (int i = 0; i < palabra.length(); i++) {

        }
       if (EsPalindromo){
           return true;
       } else {
           return false;
       }

       //ACABAR
    }


}
