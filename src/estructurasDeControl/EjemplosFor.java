package estructurasDeControl;

public class EjemplosFor {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 5; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n\nsaltando de n en n");
        for(int i=0; i <= 10; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=100; i >= 50; i-=5){
            System.out.print(i + " ");
        }
    }
}
