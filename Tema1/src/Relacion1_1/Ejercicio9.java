package Relacion1_1;

import java.util.Scanner;

public class Ejercicio9 {

    static void main(String[] args) {
        final double DESCUENTO_A = 0.07;
        final double DESCUENTO_B = 0.09;
        final double DESCUENTO_C = 0.12;
        //Creo los descuentos constantes ya que no pueden cambiar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("¿De que tipo es el producto?");
        char tipoProducto = scanner.nextLine().charAt(0);

        double precioFinal;

        if (tipoProducto == 'A') {
            precioFinal = precio - (precio * DESCUENTO_A);

        } else if (tipoProducto == 'C' || precio < 500) {
            precioFinal = precio - (precio * DESCUENTO_C);

        }else
            precioFinal = precio - (precio * DESCUENTO_B);

        System.out.printf("El precio final sería  %.2f €%n",precioFinal);
    }
}

