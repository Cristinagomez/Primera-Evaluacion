package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        //scanner
        // variable
        //contador
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Introduce un número (0 para terminar)");
        int n = sc.nextInt();
        while (n != 0){
            contador++;
            System.out.println("Introduce un número (0 para terminar)");
            n = sc.nextInt();

        }
        System.out.println(contador);
    }
}
