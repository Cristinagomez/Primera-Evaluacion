package practica2;

import java.util.Scanner;

/**
 * Ejercicio 9 validando que el momento inicial sea anterior al momento final.
 * @author Cristina Gómez Campos
 */

public class Ejercicio9 {
    public static void main(String[] args) {

        /*Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han transcurrido entre dos momentos del mismo día.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora del momento inicial.");
        int h1 = sc.nextInt();
        System.out.println("Introduce los minutos del momento inicial.");
        int m1 = sc.nextInt();
        System.out.println("Introduce la segundos del momento inicial.");
        int s1 = sc.nextInt();

        System.out.println("Introduce la hora del momento final.");
        int h2 = sc.nextInt();
        System.out.println("Introduce los minutos del momento final.");
        int m2 = sc.nextInt();
        System.out.println("Introduce la segundos del momento final.");
        int s2 = sc.nextInt();

        System.out.println("Los datos introducidos son: momento inicial: " + h1 + ":" + m1 + ":" + s1 + "         momento final: " + h2 + ":" + m2 + ":" + s2);

        if ((h1 > 0 && h1 <=24) && (h2 <=24)) { //formato de hora 24 horas, las 12pm las considero como 24:00 y no como 00:00.
            if (h2 >= h1) { //hora final mayor que inicial.
            int h1s = h1 * 3600 ;
            int m1s = m1 *60;
            int momento1 = h1s + m1s +s1;

            int h2s = h2 * 3600;
            int m2s = m2 *60;
            int momento2 = h2s + m2s +s2;

            int D = momento2 - momento1;

            int hora = D / 3600;
            int resto1 = D % 3600;
            int minutos = resto1 /60;
            int segundos = resto1 % 60;
            System.out.println("La diferencia entre ambos momentos es: " + hora + ":" + minutos + ":" + segundos);
            } else {
                System.out.println("El momento final es anterior al inicial. No se puede calcular la diferencia.");
            }
        } else {
            System.out.println("El formato de hora es erróneo.");
        }





    }
}
