package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] a = new double[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nota");
            a[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(a));
        double suma = 0;
        double max, min;
        max = a[0];
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
            if (a[i] > max ){
                max = a[i];
            }
            if (a[i] < min){
                min = a [i];
            }
        }
        System.out.println("Media de las notas: " + suma/5);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}
