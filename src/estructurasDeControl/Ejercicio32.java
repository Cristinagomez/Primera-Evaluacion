package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("Número");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i % 5 == 0){
                System.out.print(i + " ");
            }

        }


    }
}
