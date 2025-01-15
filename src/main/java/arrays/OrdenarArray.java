package arrays;

import java.util.Arrays;

public class OrdenarArray {
//tecnica de swap o intercambio para elementos de un array

    public static void main(String[] args) {

        int[] arr = {0, 3, 7, 7, 9, 4, 2, 8};

        System.out.println("antes de ordenar...");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("indice i " + i + " tiene un valor " + arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                //System.out.println("\t indice j " + j + " tiene un valor " + arr[j]);

                if (arr[j] < arr[i]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        System.out.println("ordenando...");
        System.out.println(Arrays.toString(arr));

    }
}
