//Hacer arbol
package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cómo de grande quieres el triángulo");
        int vueltas = scanner.nextInt();
        for (int i = 0; i < vueltas; i++) {

            for (int j = 0; j < vueltas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
