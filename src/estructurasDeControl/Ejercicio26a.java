package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio26a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double suma = 0;
        for (int i = 0; i < 10 ; i++) { // también desde 1 mientras <=10
            System.out.println("Números:");
            num = sc.nextDouble();
            suma = suma + num;
            /*para saber lo que suma en cada vuelta
            *  System.out.println("Suma en vuelta:" + i + ": " +suma);*/
        }
        double media = suma / 10;
        System.out.println("Media:" + media);
    }
}
