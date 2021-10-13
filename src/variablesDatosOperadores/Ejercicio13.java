package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un importe en euros");
        int cantidad = sc.nextInt();

        int b500 = cantidad / 500;
        int resto = cantidad % 500;
        System.out.println("Billetes de 500: " + b500);

        int b200 = resto / 200;
        resto = resto % 200;
        System.out.println("Billetes de 200: " + b200);

        int b100 = resto / 100;
        resto = resto % 100;
        System.out.println("Billetes de 100: " + b100);

        int b50 = resto / 50;
        resto = resto % 50;
        System.out.println("Billetes de 50 " + b50);

        int b20 = resto / 20;
        resto = resto % 20;
        System.out.println("Billetes de 50 " + b20);

        int b10 = resto / 10;
        resto = resto % 10;
        System.out.println("Billetes de 50 " + b10);

        int b5 = resto / 5;
        resto = resto % 5;
        System.out.println("Billetes de 50 " + b5);

        int m2 = resto / 2;
        resto = resto % 2;
        System.out.println("Monedas de 2€" + m2);
        System.out.println("Monedas de 2€" + resto);


    }
}
