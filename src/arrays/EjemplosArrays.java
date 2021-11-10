package arrays;

import java.util.Arrays;
import java.util.Scanner;

//arrays = listas/vectores/arreglos
public class EjemplosArrays {
    public static void main(String[] args) {

    double[] array = {10.8,14.3,13.5,12.1,9.7};
    // indice de los elementos: 0 para el 1º
    // el índice del elemento que vale 10.8 es 0
    // el índice del elemento 12.1 es 3
    // para recuperar un elemento utilizamos su índice
       // System.out.println(array); imprime: [D@e9e54c2 devuelve un indicador de la posición en memoria
        System.out.println(array[0]);
    // el último elemento es el igual al tamaño -1
        System.out.println(array[4]);
        // System.out.println(array[5]); compila pero da un error
        // Se inicializa así:
        int [] a = new int[5]; // entre corchetes va el tamaño
       //El array con esto se inicializa el valor por defecto 0
       //Podemos imprimir el contenido del array así:
        System.out.println(Arrays.toString(a));

        float[] numerosDecimales = new float[] {1.20f, 0.03f, 4f};
        System.out.println(Arrays.toString(numerosDecimales));

        //longitud de un array
        //Es la variable array.length
        System.out.println("***Longitud*****");
        System.out.println(array.length);
        System.out.println(a.length);
        System.out.println(numerosDecimales.length);

        //Acceder a los elementos
        System.out.println("****Acceder****");
        System.out.println(numerosDecimales[0]);
        System.out.println(numerosDecimales[1]);
        System.out.println(numerosDecimales[2]);

        //Ordenar arrays
        Arrays.sort(numerosDecimales);
        System.out.println(Arrays.toString(numerosDecimales));

        //Comparar Arrays
        int [] num1 = {1,2,5,8};
        int [] num2 = {1,2,5};
        int [] num3 = {1,2,5,8};
        System.out.println(Arrays.equals(num1,num2)); // imprime: false
        System.out.println(Arrays.equals(num1,num3)); // imprime: true

        //Iterar sobre arrays: recorrerlos
        //Creamos el array
        //Ejemplo 1
        int [] ej = new int[10];
        // que para cada elemento guarde el valor de su índice
        for (int i = 0; i < ej.length; i++) {
            ej[i] = i;
        }
        System.out.println("Después del for:");
        System.out.println(Arrays.toString(ej));
        //Ejemplo 2
        int [] ejemplo2 = new int[10];
        for (int i = 0; i < ejemplo2.length ; i++) {
            ejemplo2[i] = i * i;
        }
        System.out.println(Arrays.toString(ejemplo2));

        //Crear un arrays de boolean y rellenar las posiciones pares con true y las impares con false.
        boolean [] b = new boolean[10];
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 0){
               b[i] = true;
            } else {
                b[i] = false;
            }
        }
        System.out.println(Arrays.toString(b));

        //Pedimos que se teclee la longitud del array
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño array");
        int tamaño = sc.nextInt();
        //Ahora podemos crear el array
        int [] enteros = new int[tamaño];
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Número:");
            enteros[i]= sc.nextInt();
        }
        //lo imprimimos
        System.out.println(Arrays.toString(enteros));

    }
}
