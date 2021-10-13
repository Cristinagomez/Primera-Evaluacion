package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Mayor");
        } else {
            System.out.println("Menor");
        }
    }
}
