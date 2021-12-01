package arrays;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        do {
           System.out.println("Tamaño de array");
           tamaño = sc.nextInt();
           if (tamaño < 0)
               System.out.println("Error");
        } while (tamaño < 0);

        int [] a = new int[tamaño];

        int número;
        int posición = 0;
        do{
            número = (int) (Math.random() * 50 +1);
            if (número % 2 == 0){
               a[posición] = número;
               posición++;
            }
        } while (posición < tamaño);





    }
}
