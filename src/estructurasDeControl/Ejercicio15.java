package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué lenguaje estás estudiando?\n1. Java\n2. Kotlin\n3. Scala\n4. Python");
        int opcion = sc.nextInt();
        if (opcion == 1){
            System.out.println("Sí");
        } else if (opcion >=2 && opcion <=4){
            System.out.println("No");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
