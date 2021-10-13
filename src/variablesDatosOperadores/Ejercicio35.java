package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean t = (a + b == 20 ) || (b + c == 20) || (a + c == 20);
        System.out.println(t);
    }
}
