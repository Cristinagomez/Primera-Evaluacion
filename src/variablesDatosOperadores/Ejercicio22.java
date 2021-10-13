package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué nota obtuviste en el módulo de Programación?");
        double nota1 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en el módulo de Bases de datos?");
        double nota2 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en el módulo de Lenguaje de marcas?");
        double nota3 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en el módulo de FOL?");
        double nota4 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en el módulo de Sistemas informáticos?");
        double nota5 = sc.nextDouble();
        System.out.println("¿Qué nota obtuviste en el módulo de Entornos de desarrollo?");
        double nota6 = sc.nextDouble();
        double notaFinal = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6)/6;
        //notaFinal = Math.round(notaFinal);
        System.out.println("Nota final: " + Math.round(notaFinal));//mejor esta opción


    }
}
