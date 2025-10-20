import java.util.Scanner;

public class refuerzo19practica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float distancia;
        float tiempo;
        float velMaxima;

        System.out.println("Introduce la distancia en metros, el tiempo en segundos y la velociad máxima permitida");
        distancia = teclado.nextInt();
        tiempo = teclado.nextInt();
        velMaxima = teclado.nextInt();

        distancia = distancia / 1000f;
        tiempo = tiempo / 3600f;

        if (distancia/tiempo < velMaxima){
            System.out.println("OK");
        } else if (distancia/tiempo <= velMaxima * 1.2f) {
            System.out.println("MULTA");
        }else {
            System.out.println("PUNTOS");
        }
    }
}
