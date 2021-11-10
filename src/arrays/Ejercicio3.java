package arrays;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
            System.out.print(a[i] + "\t");
            suma = suma + a[i];
        }
        System.out.println();
        System.out.println(suma);

    }
}
