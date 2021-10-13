package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }
}
