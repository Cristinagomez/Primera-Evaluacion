package estructurasDeControl;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad");
        int edad = sc.nextInt();
        /*if (edad >= 18) {
            System.out.println("Mayor de edad. Adelante");
        }
        System.out.println("Siguiente instrucción tras el if.");
        boolean abierta = false;
        if (abierta) {
            System.out.println("Pasa");
        }
        System.out.println("Despues");
        */
        if (edad >= 18){
            System.out.println("Adelante");
        } else { //edad < 18
            System.out.println("No puedes pasar");
        }

    }
}
