package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable? (sí/no)");
        String culpable = sc.next();

        if (culpable.equals("sí")){
            System.out.println("A la cárcel");
        } else if (culpable.equals("no")) {
            System.out.println("A casa");
        } else {
            System.out.println("Respuesta incorrecta");
        }

    }
}
