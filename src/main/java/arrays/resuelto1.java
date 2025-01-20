package arrays;

import java.util.Arrays;

public class resuelto1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][8];

        // Rellenar el array con valores de ejemplo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j; // Puedes cambiar esto para rellenar con otros valores
            }
        }

        // Mostrar el array
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int k=0; k<8;k++){
            System.out.println(Arrays.toString(matriz[k]));
        }
    }
}