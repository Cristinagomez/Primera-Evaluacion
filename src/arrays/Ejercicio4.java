package arrays;

public class Ejercicio4 {
    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 -1 +1) + 1);

            double cuadrado = Math.pow(a[i], 2);
            double cubo = Math.pow(a[i], 3);
            System.out.println(cuadrado);
            System.out.println(cubo);
        }

    }
}
