package Relacion1_2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;
        do {
            System.out.println("Introduce un numero (Si es negativo termina)");
            numero = scanner.nextInt();
            if (numero > -1) {
                contador++;
            }
        } while (numero > -1);
        System.out.printf("Has introducido %d numeros positivos",contador);
    }
}
