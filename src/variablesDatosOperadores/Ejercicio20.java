package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Introduce cuatro valores númericos");
        Scanner sc = new Scanner(System.in);
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();
        double val4 = sc.nextDouble();
        double suma = val1 + val2 + val3 + val4;
        double media = suma / 4;
        System.out.println("La suma de los cuatro valores númericos es " + suma + " y su media es " + media);
    }
}
