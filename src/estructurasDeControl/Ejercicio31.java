package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número");
        int num = sc.nextInt();
        int producto = 1;
        for (int i = 1; i <= num ; i++) {
            producto = producto * i;
        }
        System.out.println("Factorial: " + producto);
    }
}
