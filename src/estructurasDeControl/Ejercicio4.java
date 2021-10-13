package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int nivelDeEstudios = sc.nextInt();
        int ingresos = sc.nextInt();
        boolean jasp;
        if ((edad <= 28 && nivelDeEstudios > 3) || (edad < 30 && ingresos > 28_000)) {
            jasp = true;
            System.out.println(jasp);
        } else {
            jasp = false;
            System.out.println(jasp);
        }
    }
}
