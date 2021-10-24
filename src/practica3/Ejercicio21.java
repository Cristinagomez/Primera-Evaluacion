package practica3;

import java.util.Scanner;

/**
 * Ejercicio 21 con for.
 * @author Cristina Gómez Campos
 */

public class Ejercicio21 {
    public static void main(String[] args) {

        /*Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones).*/
        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Notas módulo Programación");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
        double media = suma / 3;
        System.out.println("La nota final de Programación es: " + media);
    }
}
