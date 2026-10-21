package Relacion1_3;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        int numeroOculto = (int) (Math.random() * 100) + 1;
        boolean jugando = false;

        while (intentos > 0 ){
            System.out.println("Intenta adivinar el numero del 1 al 100");
            int numero = scanner.nextInt();
            if (numero == numeroOculto){
                System.out.println("!Enhorabuena has ganado¡");
            } else if (numero > numeroOculto) {
                System.out.println("Casi pero es mas pequeño");
            } else if (numero < numeroOculto) {
                System.out.println("Casi pero es mas grande");
            }
            intentos--;
        }
        if (intentos == 0){
            System.out.printf("Casi pero perdiste el numero era %d",numeroOculto);
        }
    }
}

