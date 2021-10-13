package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        System.out.println("Usuario");
        String usuario = sc.next();
        if (usuario.equals(usuarioCorrecto)) {
            System.out.println("Contraseña");
            String contraseña = sc.next();
            if (contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Has entrado en el sistema");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Usuario incorrecto");
        }
    }
}
