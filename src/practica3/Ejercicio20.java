package practica3;

/**
 * Ejercicio 20 con for.
 * @author Cristina Gómez Campos
 */

public class Ejercicio20 {
    public static void main(String[] args) {

        /*Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.*/


        System.out.println("\nCuatro valores");
        int valor;
        double suma = 0;
        for (int i = 1; i <5 ; i++) {
            valor = (int) (Math.random() *100 + 1);
            System.out.println(valor);
            suma = suma + valor;
        }
        double media = suma / 4;
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);


    }
}
