package Relacion1_2;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros = 0;
        int suma = 0;
        System.out.println("¿Cuantos numeros quieres introducir?");
        int vueltas = scanner.nextInt();
        for (int i = 0; i < vueltas; i++) {
            System.out.println("Introduce un numero");
            numeros = scanner.nextInt();
            suma += numeros;
        }
        int media = suma / vueltas;
        System.out.printf("La media es %d",media);
    }
}

