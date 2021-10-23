package estructurasDeControl;

import java.util.Scanner;

/**
 * Esta clase comprueba si tres números introducidos pueden formar una fecha correcta.
 * @author Cristina Gómez Campos
 */

public class ComprobarFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pido que introduzca los números por teclado.

        System.out.println("Introduzca día");
        int dia = sc.nextInt();
        System.out.println("Introduzca mes");
        int mes = sc.nextInt();
        System.out.println("Introduzca año");
        int año = sc.nextInt();


        if (año > 0){  
            if (mes >= 1 && mes <= 12){
                if(mes == 2){
                    if ((dia >= 1 && dia <=28) || ((((año % 4 == 0)  && (año % 100 != 0)) || (año % 400 == 0)) && (dia  >= 1 && dia <=29))){
                        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if (dia >= 1 && dia <=30){
                        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
                    }else {
                        System.out.println("Fecha incorrecta");
                    }
                }
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
            } else {
                System.out.println("Fecha incorrecta");
              }
        } else {
            System.out.println("Fecha incorrecta");
        }








    }
}


