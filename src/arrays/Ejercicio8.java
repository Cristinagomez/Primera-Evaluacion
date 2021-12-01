package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int número;
        int posición = 0; // siempre con while y array necesitamos una variable posición
        do {
            System.out.println("Número");
            número = sc.nextInt();
            if (número < 0 ) break;
            a[posición] = número;
            posición++;
        } while (posición < a.length);
        System.out.println(Arrays.toString(a));
    }
}
