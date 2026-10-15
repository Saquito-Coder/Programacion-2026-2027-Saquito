package Relacion1_2;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros = 0;
        int suma = 0;
        int vueltas;
        do {
            System.out.println("Dime cuantos numeros calcular");
            vueltas = scanner.nextInt();
        }while (vueltas <= 0);

        for (int i = 0; i < vueltas; i++) {
            System.out.println("Introduce un numero");
            numeros = scanner.nextInt();
            suma += numeros;
        }
        int media =  suma / vueltas;
        System.out.printf("La media es %d",media);
    }
}

