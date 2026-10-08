package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = scanner.nextInt();
        int divisor = 2;
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println("El primer divisor de " + numero + " es: " + divisor);
                break;
            }
            divisor++;
        }
    }
}
