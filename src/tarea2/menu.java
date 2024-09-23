
package tarea2;

import java.util.Scanner;

public class menu { 
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Sets");
            System.out.println("2. Votaciones");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ejecutando código");
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.tennis(); 
                    break;
                case 2:
                    System.out.println("Ejecutando código de votaciones...");
                    ejercicio2 sistemaVotacion = new ejercicio2(); 
                    sistemaVotacion.menu(); 
                    break;
                case 3:
                    System.out.println("Adiós....");
                    break;
                default:
                    System.out.println("Opción inválida, escoge otra");
            }
        } while (option != 3);
        
        scanner.close(); 
    }
}
