package arrays;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {

        int[] a = new int[10];


        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Elemento   cuadrado   cubo");
        System.out.println("**************************");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "        " + (a[i]*a[i]) + "       " + Math.pow(a[i],3));


        }

    }
}
