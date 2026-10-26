package ExamenT1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vueltas;
        double tiempoVueltas;
        double tiempoVueltaActual = 0.0;
        int mejorVuelta = 0;
        double tiempoEmpleado;
        double sumaTiempoTotal = 0;
        double mediaVueltas = 0;
        int contadorMejoras = 0;

        System.out.println("Introduce el nombre del piloto");
        String nombrePiloto = scanner.next();


        do {
            System.out.println("Cuantas vueltas ha hecho (ENTRE 3 y 10)");
            vueltas = scanner.nextInt();
        } while (vueltas < 3 || vueltas > 10);

        scanner.nextLine();

        for (int i = 0; i < vueltas; i++) {
            System.out.println("Introduce el tiempo de la vuelta");
            tiempoVueltas = Double.parseDouble(scanner.nextLine());

            do {
            System.out.println("Introduce el tiempo empleado en la vuelta");
            tiempoEmpleado = Double.parseDouble(scanner.nextLine());
            }while (tiempoEmpleado < 0.0);


            if (tiempoVueltas < tiempoEmpleado) {
                System.out.println("<<Objetivo mejorado>>");
                contadorMejoras++;
            } else if (tiempoVueltas == tiempoEmpleado) {
                System.out.println("<<Objetivo igualado>>");
            } else System.out.println("<<Por encima del objetivo>>");

            if (tiempoVueltaActual < tiempoVueltas) {
                tiempoVueltaActual = tiempoVueltas;
                mejorVuelta++;
            } else tiempoVueltaActual = tiempoVueltas;

            sumaTiempoTotal += tiempoVueltas;
            mediaVueltas = sumaTiempoTotal / vueltas;

        }
        System.out.println("-------------------");
        System.out.println("Informe:");
        System.out.printf("Nombre piloto:%s\n ", nombrePiloto);
        System.out.printf("Tiempo total:%f\n ", sumaTiempoTotal);
        System.out.printf("Tiempo medio:%f\n ", mediaVueltas);
        System.out.printf("Mejor tiempo:%f\n", tiempoVueltaActual);
        System.out.printf("Conseguido en:%d\n", mejorVuelta);
        System.out.printf("Vueltas que mejoran el objetivo:%d\n ", contadorMejoras);
        System.out.println("Preparado para competir");
    }
}
