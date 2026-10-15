package Relacion1_2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Di un numero y te calculo su factorial");
            numero = scanner.nextInt();
        } while (numero < 0);
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es %d",numero,factorial);
    }
}
