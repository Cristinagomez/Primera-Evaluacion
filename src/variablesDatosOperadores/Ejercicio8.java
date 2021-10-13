package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minutos = resto / 60;
        int resto1 = resto % 60;
        System.out.println("En " + segundos + " hay " + horas + " horas, " + minutos + " minutos y " + resto1 + " segundos.");
    }
}
