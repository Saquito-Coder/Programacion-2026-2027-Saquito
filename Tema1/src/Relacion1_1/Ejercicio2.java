package Relacion1_1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo un scanner
        System.out.println("Introduce un numero:");
        int n1 = scanner.nextInt();
        System.out.println("Introduce otro numero mas:");
        int n2 = scanner.nextInt();
        //Introduzco ambos numeros
        if (n1 == n2) {
            System.out.println("Los dos numero son iguales");

        } else if (n1 > n2) {
            System.out.println("El numero" + n1 + "es mayor");

        } else if (n1 < n2) {
            System.out.println("El numero " + n1 + " es mayor");

        }
        //Compruebo si los numeros son iguales o mayores entro los dos
    }
}
