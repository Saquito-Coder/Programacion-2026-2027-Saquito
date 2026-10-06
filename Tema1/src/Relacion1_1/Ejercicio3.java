package Relacion1_1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo un scanner
        System.out.println("Introduce un numero:");
        int numero1 = scanner.nextInt();
        //Creo una variable y le doy datos
        if (numero1 % 2 == 0 &&  numero1 % 3 == 0) {
            System.out.println("El numero es multiplo tanto de 2 como 3");
        } else if (numero1 % 2 == 0) {
            System.out.println("El numero es multiplo de 2");
        } else if (numero1 % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
        }
        //Compruebo mediante el resto si son multiplos de 2 y 3 o 2,3
    }
}

