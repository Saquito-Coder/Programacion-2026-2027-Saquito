package Relacion1_3;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el coeficiente A:");
        double a = scanner.nextDouble();

        System.out.println("Introduce el coeficiente B:");
        double b = scanner.nextDouble();

        System.out.println("Introduce el coeficiente C:");
        double c = scanner.nextDouble();

        double discriminante = (b * b) - (4 * a * c);
        if (discriminante > 0){
            System.out.printf("La solucion tiene 2 soluciones");
        } else if (discriminante == 0) {
            System.out.printf("La solucion tiene 1 solucion");
        }else System.out.printf("La solucion no existe");
    }
}
