package ejemplosChar;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Introduce una letra");
            c = sc.nextLine().charAt(0); //nextline porque next no lee los espacios
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println("Vocal");
                } else {
                    System.out.println("No vocal");
                }
            }
        } while (c != ' ');
    }
}

