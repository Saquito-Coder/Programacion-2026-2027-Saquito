package Relacion1_2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        boolean esValido = false;
        int numero1;
        do {
            numero1 = scanner.nextInt();
            if (numero1 > 0){
                esValido = true;
            }else System.out.println("Has introducido un numero negativo");
        }while (!esValido);

        for (int i = 0; i < 11; i++) {
            int tabla = numero1 * i;
            System.out.printf("%d * %d %d\n",numero1,i,tabla);
        }
    }
}
