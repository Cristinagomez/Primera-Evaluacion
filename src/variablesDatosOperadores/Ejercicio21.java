package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué nota obtuviste en la primera evaluación de la asignatura Programación?");
        double eval1 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en la segunda evaluación de la asignatura Programación?");
        double eval2 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en la tercera evaluación de la asignatura Programación?");
        double eval3 = sc.nextDouble();
        double notaFinal = (eval1 + eval2 + eval3)/3;
        System.out.println("Tu nota final en la asignatura de Programación es: " + notaFinal);
        System.out.printf("Nta final: %.2f", notaFinal); //con dos decimales solo
    }
}
