package arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMes;
        do {
            System.out.println("Introduce un número de mes");
            nMes = sc.nextInt();
            if (nMes < 1 || nMes > 12) System.out.println("Error");
        } while (nMes < 1 || nMes > 12);
        // vamos a hacer un array de string con los nombres
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int [] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println(nombresMeses[nMes - 1] + " tiene " + diasMeses[nMes - 1] + " dias.");
    }
}
