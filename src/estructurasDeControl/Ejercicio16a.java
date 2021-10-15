package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio16a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una casa de Hogwarts:\n1. Gryffindor\n2. Hufflepuff\n3. Slytherin\n4. Ravenclaw");
        int casa = sc.nextInt();
        if (casa == 1){
            System.out.println("Valentía");
        } else if (casa == 2) {
            System.out.println("Lealtad");
        } else if (casa == 3) {
            System.out.println("Astucia");
        } else if (casa == 4) {
            System.out.println("Intelecto");
        } else {
            System.out.println("No es una casa válida.");
        }

    }
}
