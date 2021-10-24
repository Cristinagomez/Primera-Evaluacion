package practica2;

import java.util.Scanner;

/**
 * Ejercicio 13 controlando datos de entrada.
 * @author Cristina Gómez Campos
 */

public class Ejercicio13 {
    public static void main(String[] args) {

        /*13. Escribe un programa que, dado un importe en euros, indique el número mínimo de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un importe en euros");
        int cantidad = sc.nextInt();
        int b500 = cantidad / 500;
        int resto = cantidad % 500;
        int b200 = resto / 200;
        resto = resto % 200;
        int b100 = resto / 100;
        resto = resto % 100;
        int b50 = resto / 50;
        resto = resto % 50;
        int b20 = resto / 20;
        resto = resto % 20;
        int b10 = resto / 10;
        resto = resto % 10;
        int b5 = resto / 5;
        resto = resto % 5;
        int m2 = resto / 2;
        resto = resto % 2;

        if (cantidad > 0){ //la cantidad de dinero tiene que ser positiva y mayor que 0.
            System.out.println("Billetes de 500: " + b500 + "\nBilletes de 200: " + b200 + "\nBilletes de 100: " + b100 + "\nBilletes de 50: " + b50 + "\nBilletes de 20: " + b20 + "\nBilletes de 10: " + b10 + "\nBilletes de 5: " + b5 + "\nMonedas de 2: " + m2 + "\nMonedas de 1: " + resto);
        } else {
            System.out.println("No es posible hacer la conversión");
        }
       

    }

}
