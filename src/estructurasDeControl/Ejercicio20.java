package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1");
        int num1 = sc.nextInt();
        System.out.println("Número 2");
        int num2 = sc.nextInt();
        System.out.println("Escoge una operación:\n+\n-\n*\n/");
        char operacion = sc.next().charAt(0);
        switch (operacion){
            case '+' -> System.out.println("El resultado de la suma es: " + (num1 + num2));
            case '-' -> System.out.println("El resultado de la resta es: " + (num1 - num2));
            case '*' -> System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
            case '/' -> System.out.println("El resultado de la división es: " + (num1 / num2));
            default -> System.out.println("Operación incorrecta.");
        }
    }
}
