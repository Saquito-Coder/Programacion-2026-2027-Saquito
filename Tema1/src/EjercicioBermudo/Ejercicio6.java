//Hacer cuadrado
package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime como quieres el cuadrado");
        int vueltas = scanner.nextInt();
        for (int i = 0; i < vueltas; i++) {
            for (int j = 0; j < vueltas; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
