package practica2;

import java.util.Scanner;

/**
 * Ejercicio 8 controlando datos de entrada.
 * @author Cristina Gómez Campos
 */

public class Ejercicio8 {
    public static void main(String[] args) {

    /*Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiempo en segundos");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minutos = resto / 60;
        int resto1 = resto % 60;

        if (segundos > 0){ // solo tiene sentido pedir números positivos y distintos de 0.
            System.out.println("En " + segundos + " segundos hay " + horas + " horas, " + minutos + " minutos y " + resto1 + " segundos.");
        } else {
            System.out.println("Formato de datos incorrecto.");
        }




    }
}
