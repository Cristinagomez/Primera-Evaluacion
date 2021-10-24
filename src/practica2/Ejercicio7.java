package practica2;

import java.util.Scanner;

/**
 * Ejercicio 7 controlando datos de entrada.
 * @author Cristina Gómez Campos
 */

public class Ejercicio7 {
    public static void main(String[] args) {

        /*Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Minutos:");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;

        if (minutos > 0) { // solo tiene sentido pedir números positivos y distintos de 0.
            System.out.println("En " + minutos + " minutos hay " + horas + " horas y " + resto + " minutos.");
        } else {
            System.out.println("Formato de minutos incorrecto");
        }

    }
}
