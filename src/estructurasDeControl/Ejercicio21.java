package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una topping:\n1. Sin topping\n2. Oreo\n3. Kitkat\n4. Brownie\n5. Lacasitos");
        int top = sc.nextInt();
        double precio = 1.90;
        switch (top){
            case 1 -> System.out.println("El helado cuesta: " + precio);
            case 2 -> System.out.println("El helado cuesta: " + (precio + 1));
            case 3 -> System.out.println("El helado cuesta: " + (precio + 1.50));
            case 4 -> System.out.println("El helado cuesta: " + (precio + 0.75));
            case 5 -> System.out.println("El helado cuesta: " + (precio + 0.95));
            default -> System.out.println("No tenemos ese topping, lo sentimos. El helado cuesta: " + precio);
        }
    }
}
