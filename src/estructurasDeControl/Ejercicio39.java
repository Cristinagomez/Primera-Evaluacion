package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (0 para finalizar)");
        int n = sc.nextInt();
        int máximo = n; //el primer elemento introducido es de momento el mayor
        while (n != 0){
            System.out.println("Introduce un número (0 para finalizar)");
            n = sc.nextInt();
            if (n != 0){
                if (n > máximo){
                    máximo = n;
                }
            }

        }
        System.out.println("Máximo: " + máximo);




    }
}
