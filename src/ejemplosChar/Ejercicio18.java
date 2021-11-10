package ejemplosChar;

public class Ejercicio18 {
    public static void main(String[] args) {
        // las letras minusculas van del 97 - 122
        // las letras mayusculas van del 65 - 90

        char letra;
        for (int i = 0; i < 30; i++) {
            letra = (char) (Math.random() * (90 - 65 + 1) + 65);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra =='U'){
                System.out.println("Vocal: " + letra);
            } else {
                System.out.println("Consonante: " + letra);
            }

        }
    }
}
