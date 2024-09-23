

package tarea2;

import java.util.Scanner;

public class ejercicio2 { 
    private static final String PROVINCIA_A = "Heredia";
    private static final String PROVINCIA_B = "San José";
    private static final String PROVINCIA_C = "Limón";

    private static final String CANDIDATO_1 = "Juan";
    private static final String CANDIDATO_2 = "Ana";
    private static final String CANDIDATO_3 = "Carlos";

    private int votosJuan = 0;
    private int votosAna = 0;
    private int votosCarlos = 0;

    private int votosHeredia = 0;
    private int votosSanJose = 0;
    private int votosLimon = 0;

    private int votos18_29 = 0;
    private int votos30_59 = 0;
    private int votos60_plus = 0;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Votar");
            System.out.println("2. Reporte 1");
            System.out.println("3. Reporte 2");
            System.out.println("4. Reporte 3");
            System.out.println("5. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    votar(scanner);
                    break;
                case 2:
                    reporte1();
                    break;
                case 3:
                    reporte2();
                    break;
                case 4:
                    reporte3();
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida, escoge otra");
            }
        } while (option != 5);
    }

    public void votar(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("No es mayor de edad, no puede votar.");
            return;
        }

        if (edad <= 29) {
            votos18_29++;
        } else if (edad <= 59) {
            votos30_59++;
        } else {
            votos60_plus++;
        }

        System.out.println("Seleccione su provincia:");
        System.out.println("1. " + PROVINCIA_A);
        System.out.println("2. " + PROVINCIA_B);
        System.out.println("3. " + PROVINCIA_C);
        int provincia = scanner.nextInt();

        System.out.println("Seleccione su candidato:");
        System.out.println("1. " + CANDIDATO_1);
        System.out.println("2. " + CANDIDATO_2);
        System.out.println("3. " + CANDIDATO_3);
        int candidato = scanner.nextInt();

        switch (candidato) {
            case 1:
                votosJuan++;
                break;
            case 2:
                votosAna++;
                break;
            case 3:
                votosCarlos++;
                break;
            default:
                System.out.println("Candidato inválido.");
                return;
        }

        switch (provincia) {
            case 1:
                votosHeredia++;
                break;
            case 2:
                votosSanJose++;
                break;
            case 3:
                votosLimon++;
                break;
            default:
                System.out.println("Provincia inválida.");
                return;
        }

        System.out.println("Gracias por participar.");
    }

    public void reporte1() {
        System.out.println("Resultados de los candidatos:");
        System.out.println(CANDIDATO_1 + " con " + votosJuan + " votos.");
        System.out.println(CANDIDATO_2 + " con " + votosAna + " votos.");
        System.out.println(CANDIDATO_3 + " con " + votosCarlos + " votos.");
    }

    public void reporte2() {
        System.out.println("Votos por provincia:");
        System.out.println(PROVINCIA_A + " con " + votosHeredia + " votos.");
        System.out.println(PROVINCIA_B + " con " + votosSanJose + " votos.");
        System.out.println(PROVINCIA_C + " con " + votosLimon + " votos.");
    }

    public void reporte3() {
        System.out.println("Votos por rango de edad:");
        System.out.println("De 18 a 29 años = " + votos18_29 + " votos");
        System.out.println("De 30 a 59 años = " + votos30_59 + " votos");
        System.out.println("Mayores de 60 = " + votos60_plus + " votos");
    }

}
