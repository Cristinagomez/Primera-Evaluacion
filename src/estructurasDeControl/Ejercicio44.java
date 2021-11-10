package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * (100 - 1 + 1) +1);
        System.out.println(numAleatorio);
        int numUsuario;

       do {
           System.out.println("Introduce un número entre 1 y 100 (O para rendirse)");
           numUsuario = sc.nextInt();
           if (numUsuario == 0){
               break;
           } else {
               if (numUsuario < 0 || numUsuario > 100) {
                   System.out.println("El número está fuera del rango solicitado");
               } else {
                   if (numAleatorio == numUsuario) {
                       System.out.println("Adivinaste");
                   } else if (numAleatorio < numUsuario) {
                       System.out.println("El número a adivinar es menor que " + numUsuario);
                   } else {
                       System.out.println("El número a adivinar es mayor que " + numUsuario);
                   }
               }
           }
       }  while ((numUsuario < 0 || numUsuario > 100) && numAleatorio != numUsuario || numUsuario != 0);
    }
}
