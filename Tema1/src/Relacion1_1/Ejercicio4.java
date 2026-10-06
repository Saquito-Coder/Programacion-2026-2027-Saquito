package Relacion1_1;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo un scanner
        int edad;
        //Creo la variable edad
        do {
            System.out.println("Introduce una edad:");
            edad = scanner.nextInt();
        } while (edad < 0 || edad >= 100);
        //Hago un bucle hasta q los datos de edad no puedan ser erroneos
        if (edad <= 12) {
            System.out.println("Eres un niño");
        } else if (edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad <= 29) {
            System.out.println("Eres un joven");
        } else if (edad <= 100) {
            System.out.println("Eres un adulto");
        }
        //Comparo las edad introducida segun el rango de edades del ejercicio para saber la respuesta
    }
}

