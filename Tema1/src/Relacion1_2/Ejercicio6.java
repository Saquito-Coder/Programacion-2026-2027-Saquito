package Relacion1_2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numeroA = scanner.nextInt();
        System.out.println("Introduce otro numero");
        int numeroB = scanner.nextInt();

        int suma = 0;

        for (int i = 0; i < numeroB; i++) {
            suma += numeroA;
        }
        System.out.printf("La multiplicacion entre %d y %d es: %d", numeroA, numeroB, suma);
        suma = 0;
        System.out.println("Introduce 2 numeros");
        numeroA = scanner.nextInt();
        numeroB = scanner.nextInt();

        for (int i = 0; i < numeroB; i++) {
            suma += numeroA;
        }
        System.out.printf("El resultado entre %d multiplicado por %d es : %d",numeroA,numeroB,suma);
    }
}
