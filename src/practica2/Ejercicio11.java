package practica2;

import java.util.Scanner;

/**
 * Ejercicio 11 validando que el número introducido sea de 2 dígitos.
 * @author Cristina Gómez Campos
 */

public class Ejercicio11 {
    public static void main(String[] args) {

        /*Dado un número de dos cifras, escribe un programa que permita obtener el número invertido.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras");
        int num = sc.nextInt();

        if ((num >= 10 && num < 100) || (num <= -10 && num > -100)) { //incluye números de dos cifras positivos o negativos
            int cifra1 = num / 10;
            int cifra2 = num % 10;
            int numinv = (cifra2 *10 ) + cifra1;
            System.out.println("El número invertido es: " + numinv);
        } else {
            System.out.println("El número introducido no es de dos cifras");
        }

    }
}
