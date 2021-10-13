package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable? (true/false)");
        boolean culpable = sc.nextBoolean();
        if (culpable){
            System.out.println("A la cárcel");
        } else {
            System.out.println("A casa");
        }
    }
}
