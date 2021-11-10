package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] a = new double[5];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println("Número:");
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
