package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1");
        int num1 = sc.nextInt();
        System.out.println("Número 2");
        int num2 = sc.nextInt();
        System.out.println("Escoge una operación:\n1. suma\n2. resta\n3. multiplicación\n4. resta");
        int operacion = sc.nextInt();
        switch (operacion){
            case 1 -> System.out.println("La suma es: " + (num1 + num2));
            case 2 -> System.out.println("La resta es: " + (num1 - num2));
            case 3 -> System.out.println("La multiplicación es: " + (num1 * num2));
            case 4 -> System.out.println("La división es: " + (num1 / num2));
            default -> System.out.println("Operación incorrecta.");
        }
    }
}
