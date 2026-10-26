//Hacer rectangulo
package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime como quieres el rectangulo");
        System.out.println("Altura: ");
        int altura = scanner.nextInt();
        System.out.println("Anchura: ");
        int anchura = scanner.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
    }
}
