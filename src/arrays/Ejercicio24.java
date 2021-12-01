package arrays;

import java.util.Arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
        int[][] tabla = {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5},
        };
        // las j son las columnas
        // las i son las filas
        int[] sumaFila = new int[5]; //están a 0
        int[] sumaColumna = new int[5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
               // tabla[i][j] = (int)(Math.random() *10); para cuando no rellenado el array
                sumaFila[i] = sumaFila[i] + tabla[i][j];
                sumaColumna[j] = sumaColumna[j] + tabla[i][j];
            }
        }
        System.out.println(Arrays.toString(sumaFila));
        System.out.println(Arrays.toString(sumaColumna));
    }
}
