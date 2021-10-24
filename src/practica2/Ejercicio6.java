package practica2;


import java.util.Scanner;

/**
 * Ejercicio 6 controlando datos de entrada.
 * @author Cristina Gómez Campos
 */

public class Ejercicio6 {
    public static void main(String[] args) {

        /*N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nº de ardillas:");
        int N = sc.nextInt();
        System.out.println("Nº de nueces:");
        int K = sc.nextInt();
        int div = K / N;
        int resto = K % N;

        if ((N > 0 && K > 0) && (K > N)){ // el nº de ardillas y el nº de nueces tiene que ser positivo. Y para poder repartirlas equitativamente las nueces tienen que ser más que las ardillas entre las que se reparte.
            System.out.println("Las ardillas tocan a " + div + " nueces, y sobran " + resto);
        } else {
            System.out.println("No es posible dividirlas equitativamente o el dato introducido es erróneo.");
        }



    }
}
