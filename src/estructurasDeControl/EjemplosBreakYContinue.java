package estructurasDeControl;

public class EjemplosBreakYContinue {
    public static void main(String[] args) {
        int i = 10;
        while (true){
            if (i == 0){
                break;
            }
            i--;
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j + " ");
                if (j == k){
                    break;
                }
            }
            System.out.println();
        }


        int n = 10;
        for (int j = 0; j < n; j++) {
            if (j % 2 != 0){
                continue;
            }
            System.out.println(j + " ");
        }
    }
}
