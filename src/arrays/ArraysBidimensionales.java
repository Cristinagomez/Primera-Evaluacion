package arrays;

public class ArraysBidimensionales {
    public static void main(String[] args) {
        int [][] tabla = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};
        int [][] tabla2 = {{0,1,2,3, 100}, {4,5,6}, {8,9,10,11}};
        System.out.println("Longitud del array bidimensional: el número de arrays que lo componen");
        System.out.println("Longitud de tabla: " + tabla.length); //nº de filas, porque cada fila es un array
        System.out.println("Longitud de tabla 2: " +tabla2.length);
        //tamaño arrays de dentro
        System.out.println("Longitud del primer array de tabla 2: " + tabla2[0].length);
        System.out.println("Longitud del segundo array de tabla 2: " + tabla2[1].length);
        System.out.println("Longitud del tercer array de tabla 2: " + tabla2[2].length);
        //elementos concretos
        System.out.println("El tercer elemento de la segunda fila: " + tabla2[1][2]);
        //imprimir tabla completa
        System.out.println("\nInprimimos la tabla completa");
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2[i].length; j++) {
                System.out.print(tabla2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
