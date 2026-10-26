package Relacion1_3;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int base;
        int exponente;
        do {
            System.out.println("Introduce la base");
            base = scanner.nextInt();
            if (base >= 0) {
                esValido = true;
            }
        }while (!esValido);

        do {
            System.out.println("Introduce el exponente");
             exponente = scanner.nextInt();
            if (exponente > 0) {
                esValido = true;
            }
        }while (!esValido);

        int suma = 1;

        for (int i = 0; i < exponente ; i++) {
            suma *= base;
        }
        System.out.println(suma);
    }
}
