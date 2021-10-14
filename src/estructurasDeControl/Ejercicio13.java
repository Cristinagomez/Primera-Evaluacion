package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio Inicial");
        int precioInicial = sc.nextInt();
        System.out.println("Tipo de uva (A o B)");
        String tipo = sc.next();
        System.out.println("Tamaño de uva (1 o 2)");
        int tamaño = sc.nextInt();
        System.out.println("Kilos de uvas:");
        int kilos = sc.nextInt();

        int precioFinal;

        if (tipo.equals("A")) {
            if (tamaño == 1){
                precioFinal = precioInicial + 20;
            } else {
                precioFinal = precioInicial + 30;
            }
        } else {
            if (tamaño == 1) {
                precioFinal = precioInicial - 30;
            } else {
                precioFinal = precioInicial - 50;
            }
        }
        System.out.println(precioFinal);
        System.out.println("La ganancia es: " + precioFinal * kilos);



    }
}
