package estructurasDeControl;

public class EjemploBucleForAnidado {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) { // normalmente son los valores de cada fila
            System.out.println("Iteración del bucle externo i= " + i);
            for (int j = 0; j < 10; j++) { //normalmento son los valores de la columna
                System.out.print("(i=" + i +")(j=" +  j + ")\t"); //esto suele imprimir una fila: nº de la fila lo da i y el nº de columna lo da j.
            }// cada vez que hace una vuelta el bucle interno quiero que salte de línea
            System.out.println();
        }
    }
}
