package practica4;

import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas monedas tienes de 2€?");
        int dos = sc.nextInt();
        System.out.println("¿Cuantas monedas tienes de 1€?");
        int uno = sc.nextInt();
        System.out.println("¿Cuantas monedas tienes de 50 céntimos?");
        int cent50 = sc.nextInt();
        System.out.println("¿Cuantas monedas tienes de 20 céntimos?");
        int cent20 = sc.nextInt();
        System.out.println("¿Cuantas monedas tienes de 10 céntimos?");
        int cent10 = sc.nextInt();

        int centimos = (cent10 * 10) + (cent20 * 20) + (cent50 * 50);
        int euros = (dos * 2) + (uno);
        int centimosEnEuros = centimos / 100;
        double totalCentimos = centimos % 100;
        int totalEuros = euros + centimosEnEuros;
        System.out.println("Tienes " + totalEuros + " euros y " + totalCentimos + " céntimos.");
    }
}
