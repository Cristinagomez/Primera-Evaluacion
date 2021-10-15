package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio16b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una casa de Hogwarts:\n1. Gryffindor\n2. Hufflepuff\n3. Slytherin\n4. Ravenclaw");
        int casa = sc.nextInt();
        switch (casa){
            case 1 -> System.out.println("Valentía");
            case 2 -> System.out.println("Lealtad");
            case 3 -> System.out.println("Astucia");
            case 4 -> System.out.println("Intelecto");
            default -> System.out.println("No es una casa válida.");
        }
    }
}
