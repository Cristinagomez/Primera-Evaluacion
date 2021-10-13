package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número de dos cifras");
        int numero = sc.nextInt();
        int decenas = numero / 10;
        System.out.println("Las decenas del número " + numero + " son: " + decenas);
    }
}