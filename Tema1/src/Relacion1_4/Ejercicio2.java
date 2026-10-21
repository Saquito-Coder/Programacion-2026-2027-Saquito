package Relacion1_4;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        int numeroInvertido = 0;
        int aux = numero;
        while(numero > 0){
            int ultimoDigito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numero = numero / 10;
        }
        if (numeroInvertido == aux){
            System.out.printf("El numero %d es capicua",numeroInvertido);
        }else System.out.printf("El numero %d no es capicua",aux);
    }
}
