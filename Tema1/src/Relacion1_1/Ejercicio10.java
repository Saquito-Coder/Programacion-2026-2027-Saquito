package Relacion1_1;

import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos numeros enteros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Introduce un caracter");
        char caracter = scanner.next().charAt(0);

        switch (caracter){
            case '+':
                int resSuma = num1 + num2;
                System.out.printf("La suma es %d" ,resSuma);
                break;
            case '-':
                int resResta = num1 - num2;
                System.out.printf("La resta es %d" ,resResta);
                break;
            case '*':
                int resMulti = num1 * num2;
                System.out.printf("La multiplicacion es %d" ,resMulti);
                break;
            case '/':
                int resDivi = num1 / num2;
                System.out.printf("La division es de %d",resDivi);
                break;
            default:
                System.out.println("Has introducido un operador incoreecto");
                break;
        }


    }
}
