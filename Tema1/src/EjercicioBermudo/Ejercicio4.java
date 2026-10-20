//Hacer medio triangulo
package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cómo de grande quieres el triángulo");
        int vueltas = scanner.nextInt();
        String triangulo = "*";
        for (int i = 0; i < vueltas; i++) {
            System.out.println(triangulo);
            triangulo += "*";
        }
    }
}