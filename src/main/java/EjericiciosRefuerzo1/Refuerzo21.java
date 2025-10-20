package EjericiciosRefuerzo1;

import java.util.Scanner;

public class Refuerzo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grosor;
        int altura;
        int dobleces = 0;
        System.out.println("Introduce el groso (en micras) y la altura del edificio");
        grosor = sc.nextFloat() * 0.000001f;
        altura = sc.nextInt();

        do {
            grosor *= 2;
            dobleces++;
        }while (grosor < altura);
        System.out.println(dobleces);
    }
}
