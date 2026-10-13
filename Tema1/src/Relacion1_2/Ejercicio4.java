package Relacion1_2;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        boolean esValido = false;
        int contador;
        do {
            System.out.println("Cuantos numeros quieres sumar (ESTRICO POSITIVO)");
            contador = scanner.nextInt();
            if (contador > 0){
                esValido = true;
            }else System.out.println("Has introducido un numero negativo");
        }while (!esValido);
        for (int i = 1; i <= contador; i++) {
            suma += i;
        }
        System.out.printf("La suma es %d ",suma);
    }
}
