package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        System.out.println("Usuario");
        String usuario = sc.next();
        System.out.println("Contraseña");
        String contraseña = sc.next();

        if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Usuario o contraseña incorrecto");
        }
    }
}
