package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio venta del producto");
        double precio = sc.nextDouble();
        System.out.println("Cantidad de productos comprados");
        int cantidad = sc.nextInt();
        System.out.println("Porcentaje de IVA aplicado");
        double IVA = sc.nextDouble();
        double importe = precio * cantidad;
        double impIVA = importe * IVA /100;
        double impfinal = importe + impIVA ;

        System.out.println("El importe a abonar es: " + impfinal +"€");
    }
}
