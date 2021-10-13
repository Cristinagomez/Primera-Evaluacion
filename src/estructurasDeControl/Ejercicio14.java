package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de alumnos");
        int num = sc.nextInt();
        int coste;
        double precioAlumno;

        if (num >= 100){
            coste = num*65;
        } else if (num >= 50 && num < 100){
            coste = num*70;
        } else if (num >= 30 && num < 50){
            coste = num*95;
        } else {
           coste = 4000;
        }
        System.out.println("Hay que abonar a la compañía " + coste + "€");
        precioAlumno = (double) coste / (double) num;
        System.out.printf("Precio a pagar por alumno %.2f €",precioAlumno);


    }
}
