package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número entre 1 y 100 (ambos inclusive)");
        int n = sc.nextInt();
        while (n < 1 || n > 100){
            System.out.println("Error. Por favor introduce un número entre 1 y 100 (ambos inclusive)");
            n = sc.nextInt();
        }
        System.out.println(n);
    }
}
