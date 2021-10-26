package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Números a introducir: ");
        int n = sc.nextInt();
        int numero;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 1; i <=n ; i++) {
            System.out.println("Número");
            numero = sc.nextInt();
            if (numero > 0){
                contadorPositivos++; // contadorPositivos = contadorPositivos +1 o contadorPositivos += contadorPositivos
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }
        System.out.println("Número de positivos: " + contadorPositivos);
        System.out.println("Número de negativos: " + contadorNegativos);
        System.out.println("Número de ceros: " + contadorCeros);


    }
}
