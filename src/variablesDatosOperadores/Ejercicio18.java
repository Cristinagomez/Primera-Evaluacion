package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es la temperatura en grados centígrados?");
        double centigrados = sc.nextDouble();
        double reaumur = centigrados * 0.8;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273;
        System.out.println(centigrados + " grados centígrados son: " + reaumur + " grados reamur, " + fahrenheit + " grados fahrenheit y " + kelvin + " grados kelvin.");

        //Hacerlo también con las formulas dentro del sout
        //Meter parentesis para aislar las operaciones

        System.out.println("Reamur= " + (centigrados * 0.8));
        System.out.println("Fahrenheit= " + ((centigrados * 1.8) + 32));
        System.out.println("Kelvin= " + (centigrados + 273));
    }
}
