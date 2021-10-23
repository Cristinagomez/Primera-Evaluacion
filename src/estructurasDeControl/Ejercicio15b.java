package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué lenguaje estás estudiando?\na. Java\nb. Kotlin\nc. Scala\nd. Python");
        char opcion = sc.next().charAt(0); // para recoger por teclado variables de tipo char
        switch (opcion){
            case 'a' -> System.out.println("Sí");
            case 'b' -> System.out.println("No");
            case 'c' -> System.out.println("No");
            case 'd' -> System.out.println("No");
            default -> System.out.println("Opción desconocida");
        }
    }
}
