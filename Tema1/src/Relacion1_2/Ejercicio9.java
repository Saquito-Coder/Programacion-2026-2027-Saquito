package Relacion1_2;

import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean esValido = false;
        int suma = 0;
        do {
            System.out.println("Introduce un numero (ESTRICO POSITIVO)");
            numero = scanner.nextInt();
            if (numero > 1){
                esValido = true;
            }else System.out.println("Has introducido un numero negativo");
        }while (!esValido);
        //Pido un numero en un rango q tenga que ser al menos de 1
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero){
            System.out.printf("El numero %d es perfecto",numero);
        }else System.out.printf("El numero %d no es perfecto",numero);
        //Calculo mediante los divisores de "numero" la "suma" y si es igual a "numero"
    }
}
