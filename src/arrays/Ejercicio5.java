package arrays;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {


        int [] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (10 -(-10) + 1) + (-10));
        }
        System.out.println(Arrays.toString(a));
        int contadorPos= 0, contadorNeg = 0, contadorCeros = 0;
        double sumaPos = 0, sumaNeg = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                sumaPos = sumaPos + a[i];
                contadorPos ++;
            } else if (a[i] < 0){
                sumaNeg = sumaNeg + a[i];
                contadorNeg++;
            } else {
                contadorCeros++;
            }

        }
        System.out.println("Media positivos: " + (sumaPos/contadorPos) + ", media negativos: " + (sumaNeg/contadorNeg) + ", cantidad de ceros: " + contadorCeros);
    }
}
