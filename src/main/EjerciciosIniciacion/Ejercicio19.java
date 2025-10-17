package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float HorasTrabajadas;
        float PrecioHora;
        float SalarioBruto;
        float Impuestos;
        float Neto;

        System.out.println("Introduce las horas trabajadas");
        HorasTrabajadas = sc.nextFloat();
        System.out.println("Introduce el precio hora");
        PrecioHora = sc.nextFloat();

        if (HorasTrabajadas <=35){
            SalarioBruto = HorasTrabajadas * PrecioHora;
        }else {
            SalarioBruto = 35 * PrecioHora + (HorasTrabajadas - 35) * (PrecioHora * 1.5f);
        }
        if (SalarioBruto <= 500){
            Impuestos = 0;
            Neto = SalarioBruto - SalarioBruto * Impuestos;
        }else if (SalarioBruto <=900) {
            Impuestos = (SalarioBruto - 500) * 0.25f;
            Neto = SalarioBruto - Impuestos;
        }else {
            Impuestos = (SalarioBruto - 900) * 0.45f + 400 * 0.25f;
            Neto = SalarioBruto - Impuestos;
        }

        System.out.println("El salario bruto es de: " + SalarioBruto + "€");
        System.out.println("El salario neto es de: " + Neto + "€");
        System.out.println("Los impuestos son de: " + Impuestos + "€");

    }
}
