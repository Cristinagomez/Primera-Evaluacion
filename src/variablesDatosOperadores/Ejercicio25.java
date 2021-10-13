package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total compra");
        double total = sc.nextDouble();
        double precioFinal= total - (total*0.15);
        System.out.println("El precio final es: " + precioFinal);
    }
}
