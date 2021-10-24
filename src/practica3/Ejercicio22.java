package practica3;

import java.util.Scanner;

/**
 * Ejercicio 22 con for.
 * @author Cristina Gómez Campos
 */

public class Ejercicio22 {
    public static void main(String[] args) {

        /*Realiza un programa que pida las notas finales de todos los módulos de 1º y muestre la nota final del curso. La nota final es la media de las notas de todos los módulos, redondeada a un número entero.*/

        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Nota módulo");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
        double notaFinal = suma / 6;
        System.out.println("La nota final es: " + Math.round(notaFinal));
    }
}
