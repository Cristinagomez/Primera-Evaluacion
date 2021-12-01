package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Valor lista1: ");
            lista1[i] = sc.nextInt();
            System.out.println("Valor lista2: ");
            lista2[i] = sc.nextInt();
            lista3[i] = lista1[i] + lista2[i];

        }
        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));


    }
}
