package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su sueldo anual");
        int sueldo = sc.nextInt();
        if (sueldo > 9000) {
            System.out.println("Debe abonar impuestos");
        } else {
            System.out.println("No debe abonar impuestos");
        }
    }
}
