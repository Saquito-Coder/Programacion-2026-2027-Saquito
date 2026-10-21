package Relacion1_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es primo");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            // Si la división es exacta, significa que tiene un divisor
            if (numero % i == 0) {
                esPrimo = false;
                break;
                //Como ya se que no es primo dejo de buscar para evitar iteraciones
            }
        }

        if (esPrimo) {
            System.out.printf("El numero %d es primo", numero);
        } else {
            System.out.printf("El numero %d no es un numero primo", numero);
        }
    }
}