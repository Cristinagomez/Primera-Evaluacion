package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num1 = sc.nextInt();
        System.out.println("Escribe otro número");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("Escribe un número");
        int num3 = sc.nextInt();
        System.out.println("Escribe otro número");
        int num4 = sc.nextInt();
        int mult = num3 * num4;
        System.out.println("El producto de " + num3 + " y " + num4 + " es: " + mult);


    }
}
