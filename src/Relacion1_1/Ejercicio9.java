package Relacion1_1;

import java.util.Scanner;

public class Ejercicio9 {
    public final double DESCUENTO_A = 0.07;
    public final double DESCUENTO_B = 0.09;
    public final double DESCUENTO_C = 0.12;

    //Creo los descuento constantes ya q no pueden cambiar

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("¿De que tipo es el producto?");
        char tipoProducto = scanner.nextLine().charAt(0);

        if (tipoProducto == 'A' ){
            System.out.printf("El precio final seria %f");
        }
    }
}

