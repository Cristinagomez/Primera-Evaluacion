package arrays;

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);

        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
