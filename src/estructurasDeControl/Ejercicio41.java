package estructurasDeControl;

public class Ejercicio41 {
    public static void main(String[] args) {
        int i = 1;
        int contadorMultiplos5 = 0;

        while(contadorMultiplos5 < 50){
            if (i % 5 == 0){
                System.out.print(i + "\t");
                contadorMultiplos5++;
                if(contadorMultiplos5 % 10 == 0){
                    System.out.println();
                }
            }
            i++;

        }




    }
}
