package Relacion1_4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedimos al usuario que introduzca el número en romano
        System.out.print("Introduce un número en romano (en mayúsculas): ");
        String romano = scanner.next();

        int total = 0;

        // 2. Recorro la cadena letra a letra
        for (int i = 0; i < romano.length(); i++) {

            char letraActual = romano.charAt(i);
            int valorActual = 0;

            switch (letraActual) {
                case 'M': valorActual = 1000; break;
                case 'D': valorActual = 500;  break;
                case 'C': valorActual = 100;  break;
                case 'L': valorActual = 50;   break;
                case 'X': valorActual = 10;   break;
                case 'V': valorActual = 5;    break;
                case 'I': valorActual = 1;    break;
                default:  valorActual = 0;    break;
            }

            // 3. Compruebo si existe una letra a la derecha (i + 1)
            if (i + 1 < romano.length()) {

                char letraSiguiente = romano.charAt(i + 1);
                int valorSiguiente = 0;

                switch (letraSiguiente) {
                    case 'M': valorSiguiente = 1000; break;
                    case 'D': valorSiguiente = 500;  break;
                    case 'C': valorSiguiente = 100;  break;
                    case 'L': valorSiguiente = 50;   break;
                    case 'X': valorSiguiente = 10;   break;
                    case 'V': valorSiguiente = 5;    break;
                    case 'I': valorSiguiente = 1;    break;
                    default:  valorSiguiente = 0;    break;
                }


                // Si la letra actual vale menos que la de la derecha, se resta.
                // Si vale igual o más, se suma.
                if (valorActual < valorSiguiente) {
                    total -= valorActual;
                } else {
                    total += valorActual;
                }

            } else {
                total += valorActual;
            }
        }

        System.out.printf("El número romano %s equivale a %d en decimal.%n", romano, total);
    }
}