package Relacion1_3;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es primo");
        int numero = scanner.nextInt();

        if (numero % numero == 0 && numero / 1 == numero){
            System.out.printf("El numero %d es primo",numero);
        }
    }
}
