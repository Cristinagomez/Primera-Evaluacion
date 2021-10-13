package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuanto mide el lado de un cuadrado");
        double lado = sc.nextDouble();
        double perimetro = lado * 4;
        System.out.println("El perímetro del cuadrado es " + perimetro);

        //soutprintf("%.2f", area)

    }
}
