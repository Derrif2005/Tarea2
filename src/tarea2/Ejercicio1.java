
package tarea2;

import java.util.Scanner;

public class Ejercicio1 {
    public void tennis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de juegos ganados por el Jugador A: ");
        int juegosA = scanner.nextInt();

        System.out.print("Ingrese la cantidad de juegos ganados por el Jugador B: ");
        int juegosB = scanner.nextInt();

        if (juegosA < 0 || juegosB < 0) {
            System.out.println("El set es inválido.");
        } else if (juegosA > 7 || juegosB > 7) {
            System.out.println("El set es inválido.");
        } else if (juegosA >= 6 && juegosA >= juegosB + 2) {
            System.out.println("El Jugador A gana el set");
        } else if (juegosB >= 6 && juegosB >= juegosA + 2) {
            System.out.println("El Jugador B gana el set");
        } else if (juegosA == 6 && juegosB == 6) {
            System.out.println("El set se define en un último juego. Resultado final: 7-6.");
        } else if (juegosA == 5 && juegosB == 5) {
            System.out.println("El set está empatado a 5. El primer jugador que llegue a 7 gana.");
        } else if (juegosA >= 7 && juegosA >= juegosB + 2) {
            System.out.println("El Jugador A gana el set");
        } else if (juegosB >= 7 && juegosB >= juegosA + 2) {
            System.out.println("El Jugador B gana el set");
        } else {
            System.out.println("El set aún no termina.");
        }

        
    }
}


