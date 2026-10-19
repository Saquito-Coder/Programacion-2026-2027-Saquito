package Relacion1_3;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y le doy la vuelta");
        int numero = scanner.nextInt();
        int invertido = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10;
            invertido = (invertido * 10) + ultimoDigito;
            numero = numero / 10;
        }
        System.out.printf("Tu numero invertido es %d",invertido);
    }
}

