package variablesDatosOperadores;

public class Ejercicio36 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double d = 6;
        char c = 7;
        boolean bool = true;

        s = b; //si
        i = b;
        l = b;
        f = b;
        d = b;
        c = (char) b;
        // bool = b; //no

        b = (byte) s;
        i = s;
        l = s;
        f = s;
        d = s;
       // c = s;
       // bool = s;

       // b = i;
       // s = i;
        l = i;
        f = i;
        d = i;
        //c = i; //no
        //bool = i; //no

       // b = l;
       // s = l;
        // i = l;
        f = l;
        d = l;
       // c = l; //no
       // bool = l; //no

        //b = f;
       // s = f;
        //l = f;
        //i = f;
        d = f;
        //c = f; //no
        //bool = f; //no

        long numeroGrande = 100_000_000_000_000L;
        int numero = (int) numeroGrande;
        //System.out.println(numero);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



    }
}
