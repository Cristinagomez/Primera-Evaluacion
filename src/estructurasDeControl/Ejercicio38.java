package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        System.out.println("Introduce un número (0 para terminar)");
        int n = sc.nextInt();
        while (n != 0){
            suma = suma + n;
            contador++;
            System.out.println("Introduce un número (0 para terminar)");
            n = sc.nextInt();


        }
        double media = suma / contador;
        System.out.println("La suma es: " + suma + " y la media es: " + media);

    }
}
