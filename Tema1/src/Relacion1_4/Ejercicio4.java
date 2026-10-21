package Relacion1_4;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora base:");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos base:");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos base:");
        int segundos = sc.nextInt();
        System.out.print("¿Cuántas horas quieres sumar?:");
        int horasSumar = sc.nextInt();
        System.out.print("¿Cuántos minutos quieres sumar?:");
        int minutosSumar = sc.nextInt();
        System.out.print("¿Cuántos segundos quieres sumar?:");
        int segundosSumar = sc.nextInt();

        int totalSegundos = hora * 3600 + minutos * 60 + segundos + horasSumar * 3600 + minutosSumar * 60 + segundosSumar;

        int dias = totalSegundos / 86400;
        int segundosRestantes = totalSegundos % 86400;

        int horaFinal = segundosRestantes / 3600;
        int minutosFinal = (segundosRestantes % 3600) / 60;
        int segundosFinal = segundosRestantes % 60;


        if (dias > 0) {
            System.out.printf("La hora resultante es: %02d:%02d:%02d han pasado %d dias %n",horaFinal, minutosFinal, segundosFinal,dias);
        } else {
            System.out.printf("La hora resultante es: %02d:%02d:%02d%n",horaFinal, minutosFinal, segundosFinal);
        }
    }
}
