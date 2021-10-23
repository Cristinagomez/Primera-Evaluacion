package estructurasDeControl;

public class EjemplosMathRandom {
    public static void main(String[] args) {

        for (int i = 0; i < 100 ; i++) {
            System.out.printf("%.2f ",Math.random()); // número de tipo double entre 0 y 0.999999
        }
        System.out.println();
        int num;
        for (int i = 0; i < 100 ; i++) {
            num = (int) Math.random(); // no sirve da siempre 0
            System.out.print(num + " ");
        }
        System.out.println("\n\nNúmeros de 0 a 9");
        for (int i = 0; i < 100 ; i++) {
            num = (int) (Math.random() * 10);
            System.out.print(num + " ");
        }
        System.out.println("\n\nNúmeros de 0 a 10");
        for (int i = 0; i < 100 ; i++) {
            num = (int) (Math.random() * 10 + 1); // la formula podría ser: (int) (Math.random() * maximo + minimo)
            System.out.print(num + " ");
        }

        System.out.println("\n\n100 números entre 1 y 49");
        for (int i = 0; i < 100; i++) {
            num = (int)(Math.random()* 49 + 1);
            System.out.print(num + "");
        }
        System.out.println("\n\n200 números entre 1 y 75");
        for (int i = 0; i < 200; i++) {
            num = (int)(Math.random()* 75 + 1);
            System.out.print(num + "");
        }



    }
}
