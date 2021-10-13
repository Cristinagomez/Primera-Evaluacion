package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número");
        double numero = sc.nextDouble();
        System.out.println("Porcentaje");
        double porcentaje = sc.nextDouble();
        double incremento = numero + ((numero * porcentaje)/100) ;
        double decremento = numero - ((numero * porcentaje)/100);
        System.out.println("El número " + numero + " incrementado en " + porcentaje + "% es " + incremento);
        System.out.println("El número " + numero + " decrementado en " + porcentaje + "% es " + decremento);
    }
}
