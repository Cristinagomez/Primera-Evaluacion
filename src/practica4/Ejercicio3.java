package practica4;

import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Número");
        int n = sc.nextInt();

        int suma = 0;
        int i = 1;

        System.out.println("Los múltiplos son:");

        int contadorMúltiplosDe3 = 0;

        do {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.print(i + "\t");
                contadorMúltiplosDe3++;
                suma += i;
            }
            i++;
        } while (contadorMúltiplosDe3 < n);

        System.out.println();
        System.out.println("La suma es: " + suma);
    }
}
