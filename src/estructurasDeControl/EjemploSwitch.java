package estructurasDeControl;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accion = sc.nextInt();
        switch (accion) {
            case 1 ->
                System.out.println("Comenzamos nueva partida...");

            case 2 ->
                System.out.println("Cargando una partida guardada");

            case 3 ->
                System.out.println("Mostrando la ayuda...");

            case 4 ->
                System.out.println("Saliendo...");

            default ->
                System.out.println("Acción no prevista, por favor inténtalo de nuevo");
        }
    }
}
