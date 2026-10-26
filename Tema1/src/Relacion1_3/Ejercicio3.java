package Relacion1_3;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y te digo las cifras");
        int numero = scanner.nextInt();
        int contadorCifras = 0;
        while (numero > 0){
            numero = numero /10;
            contadorCifras++;
        }
        System.out.printf("El numero %d tiene %d",numero,contadorCifras);
    }
}
