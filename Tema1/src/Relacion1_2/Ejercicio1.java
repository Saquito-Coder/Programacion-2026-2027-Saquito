package Relacion1_2;

public class Ejercicio1 {
    static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
           if (i %7 == 0 && i %13 == 0){
               System.out.printf("El numero %d es multiplo de 7 y 13\n",i);
           } else if (i %7 == 0) {
               System.out.printf("El numero %d es multiplo de 7\n",i);
           } else if (i %13 == 0) {
               System.out.printf("El numero %d es multiplo de 13\n",i);
           }
        }

    }
}
