package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras");
        int numero = sc.nextInt();
        int cifra1 = numero / 10 ;
        int cifra2 = numero % 10 ;
        int numinv = (cifra2 *10 ) + cifra1;
        System.out.println("El número invertido es: " + numinv);
    }
}
