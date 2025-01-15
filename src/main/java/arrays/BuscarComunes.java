package arrays;

import java.util.Arrays;

public class BuscarComunes {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 3, 4, 4, 5, 2};
        int[] array2 = {0, 3, 7, 7, 9, 4, 2, 8};

        int kont = 0;

        for (int i = 0; i < array1.length; i++) {
            //System.out.println("de uno: " + array1[i]);
            for (int j = 0; j < array2.length; j++) {
                //System.out.println("\t de dos: " + array2[j]);
                if (array1[i] == array2[j])
                    //System.out.println("Esta repetido!!");
                    kont++;
            }
        }
        int[] repes = new int[kont];
        int k=0;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("de uno: " + array1[i]);
            for (int j = 0; j < array2.length; j++) {
                System.out.println("\t de dos: " + array2[j]);
                if (array1[i] == array2[j]) {
                    System.out.println("Esta repetido!!");
                    repes[k] = array1[i];
                    k++;
                }
            }
        }

        System.out.println(Arrays.toString(repes));

    }
}
