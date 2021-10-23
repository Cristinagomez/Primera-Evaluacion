package estructurasDeControl;

public class Ejercicio26b {
    public static void main(String[] args) {

        int num;
        double suma = 0;
        System.out.println("Números de 0 a 100");

        for (int i = 0; i < 10 ; i++) {
            num = (int) (Math.random() * 100 + 1);
            System.out.println("Números: " + num);
            suma = suma + num;
        }
        double media = suma / 10;
        System.out.println("La media es " + media);
    }
}
