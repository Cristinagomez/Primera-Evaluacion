package arrays;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int [] A = new int[10];
        int [] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 10 + 1);
            B[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int [] C = new int[20];

        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0){
                C[i] = A[i/2];
            } else {
                C[i] = B[i/2];
            }

        }
        System.out.println(Arrays.toString(C));
    }
}
