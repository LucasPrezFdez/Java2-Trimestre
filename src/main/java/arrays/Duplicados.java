package arrays;

import java.util.Arrays;

public class Duplicados {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,4,4,5,2};
//        Definicion de un array de datos
        System.out.println(Arrays.toString(array));

        for (int i=0; i< array.length;i++){
//            System.out.println("indice "+i+" tiene un valor "+array[i]);
            for (int j=i+1; j<array.length; j++){
//                System.out.println("\t indice j "+j+" tiene un valor "+array[j]);
                if (array[i]==array[j]){
                    System.out.println("Elemento duplicado encontrado: " + array[i]);
                }

            }
        }
    }
}
