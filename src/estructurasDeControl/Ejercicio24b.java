package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número");
        int a = sc.nextInt();
        System.out.println("Número");
        int b = sc.nextInt();
        int suma = 0;
        while (a <= b) {
            suma = suma + a;
            a++;
        }
        System.out.println(suma);
    }
}
