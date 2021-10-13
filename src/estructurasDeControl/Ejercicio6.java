package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de tazas");
        int taza = sc.nextInt();
        System.out.println("¿Es fin de semana?");
        boolean finDeSemana = sc.nextBoolean();
        if ((taza > 10 && taza < 20) && !finDeSemana|| ((taza > 15 && taza < 25) && finDeSemana)){
            System.out.println("Exito");
        }else {
            System.out.println("Fracaso");
        }
    }
}
