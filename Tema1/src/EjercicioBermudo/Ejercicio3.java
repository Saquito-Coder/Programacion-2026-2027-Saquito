package EjercicioBermudo;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String PASSWORD = "password";
        String password;
        do {
            System.out.println("Introduce una contraseña");
            password = scanner.nextLine();
        }while (password == password);
            if (PASSWORD.equals(password))
            System.out.println("La contraseña es valida");
    }
}
