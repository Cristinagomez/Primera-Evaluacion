package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio43DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opción;

        do {
            System.out.println("Menú:\n1.\n2.\n3.\n4. Salir");
            opción = sc.nextInt();
            switch (opción){
                case 1 :
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta");
        }

        } while (opción != 4);
        System.out.println("**** FIN ****");

    }
}
