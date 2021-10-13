package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto es la base del triangulo?");
        int base1 = sc.nextInt();
        System.out.println("¿Cuanto es la altura del triangulo?");
        int altura1 = sc.nextInt();
        int A1 = (base1 * altura1)/2;
        System.out.println("El área del triangulo es " + A1);

        System.out.println("¿Cuanto es la base del triangulo?");
        float base2 = sc.nextFloat();
        System.out.println("¿Cuanto es la altura del triangulo?");
        float altura2 = sc.nextFloat();
        float A2 = (base2 * altura2)/2;
        System.out.println("El área del triangulo es " + A2);

    }
}
