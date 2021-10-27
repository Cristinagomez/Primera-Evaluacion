package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio24a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número");
        int a = sc.nextInt();
        System.out.println("Número");
        int b = sc.nextInt();
        int suma = 0;
        for (int i = a; i <= b ; i++) {
            suma = suma + i;
        }
        System.out.println("Resultado: " + suma);
    }
}
