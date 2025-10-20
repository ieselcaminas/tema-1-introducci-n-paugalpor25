import java.util.Scanner;

public class Practicaej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float horas;
        float precioHora;
        float bruto;
        float neto;
        float impuestos;

        System.out.println("Introduce el número de horas trabajadas");
        horas = sc.nextFloat();
        System.out.println("Introduce el precio por hora");
        precioHora = sc.nextFloat();

        if (horas <= 35){
            bruto = horas * precioHora;
        } else {
            bruto = 35 * precioHora + (horas - 35) * precioHora * 1.5f;
        }

        if (bruto <= 500){
            impuestos = 0;
            neto = bruto - bruto*0;
            System.out.println("El salario bruto es: " + bruto + "€ y el salario neto: " + neto + "€");
            System.out.println("Los impuestos son del " + impuestos + "%");
        }else if (bruto <=900) {
            impuestos = 0.25f;
            neto = 500 + (bruto - 500) - (bruto - 500) * impuestos;
            System.out.println("El salario bruto es: " + bruto + "€ y el salario neto: " + neto + "€");
            System.out.println("Los impuestos son del " + impuestos + "%");
        }else {
            impuestos = 0.45f;
            neto = 500 + (400 - 400 * 0.25f) + (bruto - 900) - (bruto - 900) * impuestos;
            System.out.println("El salario bruto es: " + bruto + "€ y el salario neto: " + neto + "€");
            System.out.println("Los impuestos son del " + impuestos + "%");
        }

    }
}
