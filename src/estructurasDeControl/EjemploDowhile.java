package estructurasDeControl;

import java.util.Scanner;

public class EjemploDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int contador = 0;
        do{
            System.out.println("Introduce un número (0 para terminar)");
            n = sc.nextInt();
            if (n != 0){
                contador++;
            }
        } while (n != 0);
        System.out.println(contador);
    }
}
