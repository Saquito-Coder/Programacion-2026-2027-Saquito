package Relacion1_1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu estado civil");
        char estadoCivil = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("Ahora dime tu edad");
        int edad = scanner.nextInt();

        if (edad >= 50){
            System.out.println("Tienes un 8.5% de porcentaje de retencion");
        } else if (estadoCivil == 'S' || estadoCivil == 'D' && edad <= 35) {
            System.out.println("Tienes un 12% de porcentaje de retencion");
        } else if (estadoCivil == 'V' || estadoCivil == 'C' && edad <= 35) {
            System.out.println("Tienes un 11.3% de porcentaje de retencion");
        }else {
            System.out.println("Tienes un 10.5% de porcentaje de retencion");
        }
    }
}
