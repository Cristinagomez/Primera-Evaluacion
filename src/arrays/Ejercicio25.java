package arrays;

public class Ejercicio25 {
    public static void main(String[] args) {
        int [][] diagonal = new int [5][5];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j) diagonal[i][j] = 1;
                System.out.print(diagonal[i][j] + " ");

            }
            System.out.println();
        }
    }
}
