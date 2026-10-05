package Relacion1_1;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
    }
}
