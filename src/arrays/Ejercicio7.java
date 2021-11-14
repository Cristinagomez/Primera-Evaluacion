package arrays;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño de array");
        int n = sc.nextInt();
        int [] a =  new int[n];
        for (int i = 0; i < a.length; i++) {
           int num = (int)(Math.random() * (5 - 1 + 1) + 1);
            if (num % 2 == 0){
                a[i] = num;
            } if (num % 2 != 0){}

        }




    }
}
