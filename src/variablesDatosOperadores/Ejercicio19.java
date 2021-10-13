package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Introduce un par de números");
        double x1 = sc.nextDouble();
        double y1 = sc. nextDouble();
        System.out.println("Introduce otro par de números");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double resta1 = x2 - x1;
        double resta2 = y2 - y1;
        double cuadrado1 = Math.pow(resta1,2);
        double cuadrado2 = Math.pow(resta2,2);
        double suma = cuadrado1 + cuadrado2;
        double raiz = Math.sqrt(suma);
        System.out.println("La distancia entre los dos puntos del plano es: " + raiz);*/

        //Hecho en clase por la profe

        System.out.println("x1");
        double x11 = sc.nextDouble();
        System.out.println("y1");
        double y11 = sc.nextDouble();
        System.out.println("x2");
        double x21 = sc.nextDouble();
        System.out.println("y2");
        double y21 = sc.nextDouble();

        double d = Math.sqrt(Math.pow(x21-x11,2) + Math.pow(y21-y11,2));
        System.out.println("Distancia: " + d);
        System.out.printf("%.2f",d);
        // para mostrar dos decimales




    }
}
