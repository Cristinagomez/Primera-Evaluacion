package variablesDatosOperadores;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº de ardillas");
        int N = sc.nextInt();
        System.out.println("Nº de nueces");
        int K = sc.nextInt();
        int div = K / N;
        int resto = K % N;
        System.out.println("Las ardillas tocan a " + div + " nueces, y sobran " + resto);


    }
}
