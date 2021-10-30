package estructurasDeControl;

public class Ejercicio40 {
    public static void main(String[] args) {

        int i = 1;
        int contadorMultiplos5 = 0;
        do {
            if (i % 5 == 0){
                System.out.print(i + "\t");
                contadorMultiplos5++;
            }
            i++;
        } while (contadorMultiplos5 < 20);
    }
}
