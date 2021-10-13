package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos= sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;
        //minutos = minutos % 60 le damos otro valor
        System.out.println("En " + minutos + " minutos hay " + horas + " horas y " + resto + " minutos.");
    }
}
