package practica4;

import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el número de invitados?");
        int inv = sc.nextInt();
        int precio;

        if (inv > 0 && inv <= 200){
            precio = 95;
            System.out.println("Precio por invitado " + precio + "€");
            int presupuesto = inv * precio;
            System.out.println("El presupuesto del banquete es de " + presupuesto + " euros.");
        } else if (inv > 200 && inv <= 300){
            precio = 85;
            System.out.println("Precio por invitado " + precio + "€");
            int presupuesto = inv * precio;
            System.out.println("El presupuesto del banquete es de " + presupuesto + " euros.");
        } else if (inv > 300){
            precio = 75;
            System.out.println("Precio por invitado " + precio + "€");
            int presupuesto = inv * precio;
            System.out.println("El presupuesto del banquete es de " + presupuesto + " euros.");
        } else {
            System.out.println("Nos es posible calcular el presupuesto");
        }


    }
}
