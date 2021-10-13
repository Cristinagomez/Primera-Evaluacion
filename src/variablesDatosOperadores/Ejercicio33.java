package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        boolean t = (v1 < v2) && (v2 < v3);
        System.out.println(t);

    }
}
