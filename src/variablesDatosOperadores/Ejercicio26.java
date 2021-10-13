package variablesDatosOperadores;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base");
        double sueldo = sc.nextDouble();
        System.out.println("Importe venta 1");
        double venta1 = sc.nextDouble();
        System.out.println("Importe venta 2");
        double venta2 = sc.nextDouble();
        System.out.println("Importe venta 3");
        double venta3 = sc.nextDouble();
        double ventas = venta1 + venta2 + venta3;
        double comisiones = ventas * 0.10;
        double sueldoFinal = sueldo + comisiones;
        System.out.println("El sueldo final que recibe es: " + sueldoFinal + "€, su sueldo base " + sueldo + "€ más " + comisiones + "€ en concepto de comisiones.");

    }
}
