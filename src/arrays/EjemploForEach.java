package arrays;

public class EjemploForEach {
    public static void main(String[] args) {
        char[] caracteres = {'a','b','c','a','b','c','a'};

        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a' ){
                contador++;
            }
        }
        //otra forma
        for (char elemento: caracteres){
            if (elemento == 'a') contador++;
        }
    }
}
