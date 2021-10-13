package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de tres cifras");
        int numero = sc.nextInt();
        int centena = numero / 100;
        int decena = (numero % 100) / 10;
        int unidad = (numero % 100) % 10;
        int numinv = (unidad * 100) + (decena *10) + centena;
        System.out.println("El número invertido es: " + numinv);
    }
}
