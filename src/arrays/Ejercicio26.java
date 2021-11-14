package arrays;

import java.util.Arrays;

public class Ejercicio26 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == marco.length -1 || j == 0 || j == marco[i].length -1){
                    marco[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
