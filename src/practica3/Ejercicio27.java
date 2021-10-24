package practica3;

import java.util.Scanner;

/**
 * Ejercicio 27 con for.
 * @author Cristina Gómez Campos
 */

public class Ejercicio27 {
    public static void main(String[] args) {

        /*Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
        a. 55% del promedio de sus tres calificaciones parciales.
        b. 30% de la calificación del examen final.
        c. 15% de la calificación de un trabajo final.*/

        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Calificación parcial");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
        double a = (suma/3) * 0.55;

        System.out.println("Calificación examen final");
        double exam = sc.nextDouble();
        double b = exam * 0.33;

        System.out.println("Calificación trabajo final");
        double trabajo = sc.nextDouble();
        double c = trabajo * 0.15;

        double notaFinal = a + b +c;
        System.out.printf("La nota final es: %.2f", notaFinal);
    }
}
