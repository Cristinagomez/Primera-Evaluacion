package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número");
        int n = sc.nextInt();
        System.out.println("Carácter");
        char c = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( c + " ");


            }
            System.out.println();
        }
    }
}