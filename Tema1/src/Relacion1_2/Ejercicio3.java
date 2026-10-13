package Relacion1_2;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int contador;
        do {
            System.out.println("Cuantos numeros quieres comprobar");
            contador = scanner.nextInt();
            if (contador > 0){
                esValido = true;
            }else System.out.println("Has introducido un numero negativo");
        }while (!esValido);

        for (int i = 0; i < contador; i++) {
            System.out.println("Introduce el numero");
            int numero1 = scanner.nextInt();
            if (numero1 %2 == 0){
                System.out.printf("%d es un numero par\n",numero1);
            }else System.out.printf("%d no es par\n",numero1);
        }
    }
}
