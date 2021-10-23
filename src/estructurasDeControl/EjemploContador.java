package estructurasDeControl;

import java.util.Scanner;

public class EjemploContador {
    public static void main(String[] args) {
        //meto números y que los vaya contando
        Scanner sc = new Scanner(System.in);
        int contador = 0; //guarda la cuenta de números introducidos
        int numero; // guarda temporalmente el número que introduzco
        int suma = 0; // va guardando la suma y acumulando con los números en cada vuelta

        //al final quiero imprimir:
        // a) la suma de los números introducidos
        // b) el número de números introducidos


        for (int i = 0; i < 10; i++) {
            System.out.println("Número:");
            numero = sc.nextInt();
            suma = suma + numero;
            contador++; // cada vez que introducimos un número, incremento el contador
            System.out.print("i= " + i + " suma=" + suma);

        }
        System.out.println("\n\nSuma total: " + suma + "\n");
        System.out.println("contador = " + contador);

    }
}
