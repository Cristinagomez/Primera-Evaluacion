package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor 1");
        int a = sc.nextInt();
        System.out.println("Valor 2");
        int b = sc.nextInt();
        System.out.println("Caracter");
        char c = sc.next().charAt(0);


        if (a < b) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print( c + " ");


                }
                System.out.println();
            }
        } else {
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < a; j++) {
                        System.out.print(c + " ");


                }
                System.out.println();
            }
        }
    }
}
