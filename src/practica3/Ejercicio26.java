package practica3;

import java.util.Scanner;

/**
 * Ejercicio 26 pidiendo por teclado el número de ventas realizadas y el importe de cada venta.
 * @author Cristina Gómez Campos
 */

public class Ejercicio26 {
    public static void main(String[] args) {

        /*Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base");
        double base = sc.nextDouble();
        double suma = 0;
        System.out.println("Número de ventas");
        int venta = sc.nextInt();
        for (int i = 1; i <=venta ; i++) {
            System.out.println("Importe venta");
            double importe = sc.nextDouble();
            suma = suma + importe;
        }
        double comisiones = suma * 0.10;
        double sueldoFinal = base + comisiones;
        System.out.println("El sueldo final que recibe es: " + sueldoFinal + "€, su sueldo base " + base + "€ más " + comisiones + "€ en concepto de comisiones.");
    }
}
