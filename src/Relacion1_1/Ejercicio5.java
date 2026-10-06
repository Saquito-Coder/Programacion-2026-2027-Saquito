package Relacion1_1;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 4 numeros");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("La media es de" + media);
    //Creo un scanner y lee 4 numeros y hago el precalculo de la media
        if (n1 > media) {
            System.out.println(n1 + "es mayor a la media");
        }
        if (n2 > media) {
            System.out.println(n2 + "es mayor a la media");
        }
        if (n3 > media) {
            System.out.println(n3 + "es mayor a la media");
        }
        if (n4 > media) {
            System.out.println(n4 + "es mayor a la media");
        }
    //Compruebo los datos contra la media y doy el resultado por pantalla
    }
}
