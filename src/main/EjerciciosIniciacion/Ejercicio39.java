package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio39 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            int c;

            System.out.println("Introduce el valor de los lados (a, b , c): ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                if(Math.max(c,b) == Math.max(c,a)){
                    if (c*c < a*a + b*b){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es acutángulo");
                    } else if (c*c == a*a + b*b) {
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es rectángulo");
                    }else if (c*c > a*a + b*b){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es obtusángulo");
                    }
                }
                if (Math.max(a,b) == Math.max(a,c)){
                    if (a*a < c*c + b*b){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es acutángulo");
                    } else if (a*a == c*c + b*b) {
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es rectángulo");
                    }else if (a*a > c*c + b*b){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es obtusángulo");
                    }
                }
                if(Math.max(b,a) == Math.max(b,c)){
                    if (b*b < a*a + c*c){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es acutángulo");
                    } else if (b*b == a*a + c*c) {
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es rectángulo");
                    }else if (b*b > a*a + c*c){
                        System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> El triángulo es obtusángulo");
                    }
                }

            }else {
                System.out.println(a + " (a) " + b + " (b) " + c + " (c) " + " -> Es IMPOSIBLE");
            }

        }
}
