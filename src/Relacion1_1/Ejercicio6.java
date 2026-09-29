package Relacion1_1;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String caracter = scanner.nextLine();
        switch (caracter){
            case "A":
                System.out.println("Es la primera vocal A");
                break;
            case "E":
                System.out.println("Es la segunda vocal E");
                break;
            case "I":
                System.out.println("Es la tercera vocal I");
                break;
            case "O":
                System.out.println("Es la cuarta vocal O");
                break;
            case "U":
                System.out.println("Es la quinta vocal U");
                break;
        }
    }
}
