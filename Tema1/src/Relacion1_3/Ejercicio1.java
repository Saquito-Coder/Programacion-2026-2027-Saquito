package Relacion1_3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        // Si n1 es el mayor
        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println("Ordenados: " + n3 + ", " + n2 + ", " + n1);
            } else {
                System.out.println("Ordenados: " + n2 + ", " + n3 + ", " + n1);
            }
        }
        // Si n2 es el mayor
        else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println("Ordenados: " + n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println("Ordenados: " + n1 + ", " + n3 + ", " + n2);
            }
        }
        // Si n3 es el mayor
        else {
            if (n1 >= n2) {
                System.out.println("Ordenados: " + n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println("Ordenados: " + n1 + ", " + n2 + ", " + n3);
            }
        }
    }
}