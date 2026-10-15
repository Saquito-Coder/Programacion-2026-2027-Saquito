package Relacion1_2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finBucle = false;
        boolean esValido;
        char respuesta;
        int menor = 0;
        boolean primerNumero = true;
        do {
            System.out.println("Introduce un número:");
            int numero = scanner.nextInt();
            if (primerNumero || numero < menor) {
                menor = numero;
                primerNumero = false;
            }
            do {
                System.out.println("¿Desea introducir más números (S/N)?");
                respuesta = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
                esValido = respuesta == 'S' || respuesta == 'N';
                if (!esValido) {
                    System.out.println("Introduce S o N.");
                }
            } while (!esValido);
            if (respuesta == 'N') {
                finBucle = true;
            }
        } while (!finBucle);
        System.out.println("El menor número introducido es: " + menor);
    }
}