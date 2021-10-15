package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dirección:\n1 - arriba\n2 - abajo\n3 - izquierda\n4 - derecha\n0 - no mover");
        int dir = sc.nextInt();
        switch (dir){
            case 1 -> System.out.println("Subir");
            case 2 -> System.out.println("Bajar");
            case 3 -> System.out.println("Mover a la izquierda");
            case 4 -> System.out.println("Mover a la derecha");
            case 0 -> System.out.println("No mover");
            default -> System.out.println("Error");
        }


    }
}
