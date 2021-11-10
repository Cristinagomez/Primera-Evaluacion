package ejemplosChar;

public class Ejemplo {
    public static void main(String[] args) {
        char letra = 'A';
        while (letra <= 'z'){ // porque va siguiendo el orden de los números correspondientes en la tabla ascii
            System.out.print(letra);
            letra++;
        }
    }
}
