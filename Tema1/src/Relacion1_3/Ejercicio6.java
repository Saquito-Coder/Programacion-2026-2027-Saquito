package Relacion1_3;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos alumnos han hecho el examen?");
        int totalAlumnos = scanner.nextInt();
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < totalAlumnos; i++) {
            System.out.println("Introduce la nota de cada alumno");
            int notas = scanner.nextInt();
            if (notas >= 5){
                aprobados++;
            }else suspensos++;
        }
        double porcentajeAprobados = (aprobados * 100.0) / totalAlumnos;
        double porcentajeSuspensos = (suspensos * 100.0) / totalAlumnos;
        System.out.printf("Han aprobado %d y suspendido %d y el porcetaje de aprobados es de %.2f%% y de suspensos %.2f%%",aprobados,suspensos,porcentajeAprobados,porcentajeSuspensos);
    }
}
