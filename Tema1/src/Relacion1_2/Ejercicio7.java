package Relacion1_2;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros = 0;
        int suma = 0;
        int vueltas;
        do {
            System.out.println("Dime cuantos numeros calcular");
            vueltas = scanner.nextInt();
        }while (vueltas <= 0);
        //Pregunto el numero de numeros a calcular
        for (int i = 0; i < vueltas; i++) {
            System.out.println("Introduce un numero");
            numeros = scanner.nextInt();
            suma += numeros;
        }
        //Pidos los numeros el numero de veces q dijo el usuario y los sumo en total
        double media = (double) suma / vueltas;
        //Divido la suma entre las vueltas del for y hago un casting para q sea un valor de media real
        System.out.printf("La media es %.2f", media);
    }
}



