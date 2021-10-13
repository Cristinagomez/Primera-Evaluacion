package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*a. 55% del promedio de sus tres calificaciones parciales.
        b. 30% de la calificación del examen final.
        c. 15% de la calificación de un trabajo final.*/
        System.out.println("Calificación parcial 1");
        double p1 = sc.nextDouble();
        System.out.println("Calificación parcial 2");
        double p2 = sc.nextDouble();
        System.out.println("Calificación parcial 3");
        double p3 = sc.nextDouble();
        double a = ((p1 + p2 + p3)/3)*0.55;
        System.out.println("Calificación del examen final");
        double exam = sc.nextDouble();
        double b = exam * 0.3;
        System.out.println("Calificación trabajo final");
        double tra = sc.nextDouble();
        double c = tra * 0.15;
        double notaFinal = a + b + c;
        System.out.printf("Nota final: %.2f", notaFinal);
    }
}
