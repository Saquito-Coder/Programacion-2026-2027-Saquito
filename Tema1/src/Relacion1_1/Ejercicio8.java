package Relacion1_1;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una hora");
        int hora1 = scanner.nextInt();
        System.out.println("Introduce los minutos");
        int minutos1 = scanner.nextInt();
        System.out.println("Introduce los segundos");
        int segundos1 =scanner.nextInt();

        int horaTotal1 = segundos1 + (minutos1 * 60) + (hora1 * 3600);

        System.out.println("Introduce otra hora");
        int hora2 = scanner.nextInt();
        System.out.println("Introduce los minutos");
        int minutos2 = scanner.nextInt();
        System.out.println("Introduce los segundos");
        int segundos2 =scanner.nextInt();

        int horaTotal2 = segundos2 + (minutos2 * 60) + (hora2 * 3600);

        if (horaTotal1 > horaTotal2){
            System.out.println("La primera hora es mayor");
        }else {
            System.out.println("La segunda hora es mayor");
        }
        if (horaTotal1 == horaTotal2){
            System.out.println("Las dos horas son iguales");
        }
    }
}
