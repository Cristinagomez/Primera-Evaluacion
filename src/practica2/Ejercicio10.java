package practica2;

import java.util.Scanner;

/**
 * Ejercicio 10 validando que el número introducido sea de 2 dígitos.
 * @author Cristina Gómez Campos
 */

public class Ejercicio10 {
    public static void main(String[] args) {

        /*Dado un número de dos dígitos, imprime su primer número (las decenas)*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras");
        int num = sc.nextInt();
        int decenas = num / 10;
        if ((num >= 10 && num < 100) || (num <= -10 && num > -100)) { //incluye números de dos cifras positivos o negativos
            System.out.println("Las decenas del número " + num + " son: " + decenas);
        } else {
            System.out.println("El número no es de dos cifras");
        }
    }
}
