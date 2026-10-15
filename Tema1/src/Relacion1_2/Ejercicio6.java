package Relacion1_2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Introduce 2 numeros");
        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        for (int i = 0; i < numeroB; i++) {
            suma += numeroA;
        }
        System.out.printf("El resultado entre %d multiplicado por %d es : %d",numeroA,numeroB,suma);
    }
}
