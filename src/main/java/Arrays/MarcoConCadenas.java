package Arrays;

import java.util.Scanner;

public class MarcoConCadenas {
    public static void main(String[] args){
        Scanner miScanner = new Scanner(System.in);

        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");

        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = miScanner.next();
        }
        cadenas=marco(cadenas);
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }

    }
    public static String[] marco(String[] cadenaconmarco) {
        int MaxLetras = 0;
        String[] Marco = new String[7];
        for (int i = 0; i < cadenaconmarco.length; i++) {
            if (cadenaconmarco[i].length() > MaxLetras) {
                MaxLetras = cadenaconmarco[i].length();
            }

        }
        for (int i = 0; i < Marco.length; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < MaxLetras + 4; j++) {
                    Marco[i] += "*";
                }
            }
            if (i > 0) {
                Marco[i] = "* " + cadenaconmarco[i-1];
            }
            if (i > 0) {
                for (int j = 1; j < MaxLetras - Marco[i].length(); j++) {
                    Marco[i] += " ";
                }
            }
            if (i > 0) {
                    Marco[i] += "*";
            }
        }
        return Marco;
    }
}
