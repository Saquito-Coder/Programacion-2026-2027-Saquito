package Relacion1_1;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo un Scanner
        System.out.println("Introduce un numero:");
        int numero1 = scanner.nextInt();
        //Introduzco un dato
        if (numero1 % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("Es  impar");
        }
        //Compruebo el resto del numero si es 0 es par si no impar
    }
}

