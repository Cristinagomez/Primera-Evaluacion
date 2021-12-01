package practica4;
/**
 * @author Cristina Gómez Campos
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operacion;
        boolean seguir;


            do {
                System.out.println("Elige una operación:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
                operacion = sc.nextInt();
                System.out.println("Introduce un número");
                double num1 = sc.nextDouble();
                System.out.println("Introduce un número");
                double num2 = sc.nextDouble();
                System.out.println("¿Desea realizar otra operación?(true o false)");
                seguir = sc.nextBoolean();
                switch (operacion) {
                    case 1:
                        double suma = num1 + num2;
                        System.out.println("La suma es: " + suma);
                        break;
                    case 2:
                        double resta = num1 - num2;
                        System.out.println("La resta es: " + resta);
                        break;
                    case 3:
                        double multiplicacion = num1 * num2;
                        System.out.println("La multiplicación es: " + multiplicacion);
                        break;
                    case 4:
                        double division = num1 / num2;
                        System.out.println("La división es: " + division);
                        break;
                    default:
                        System.out.println("No es una operación válida");
                }
            } while (operacion != 1 && operacion != 2 && operacion != 3 && operacion != 4 || seguir == true);



    }
}
