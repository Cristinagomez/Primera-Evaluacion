package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("La tabla del " + i + ": ");
            for (int j = 1 ; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");


            }
            System.out.println("");

        }
    }
}
