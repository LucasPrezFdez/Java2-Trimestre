package Objetos;

import java.util.Arrays;

public class Propuesto8 {

    public static int[] mergeSort(int array[]) {
        if (array.length > 1) {
            int elementsInA1 = array.length / 2;
            int elementsInA2 = array.length - elementsInA1;
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];
            for (int i = 0; i < elementsInA1; i++)
                arr1[i] = array[i];
            for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = array[i];
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0, j = 0, k = 0;
            while (arr1.length != j && arr2.length != k) {
                if (arr1[j] < arr2[k]) {
                    array[i] = arr1[j];
                    i++;
                    j++;
                } else {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while (arr1.length != j) {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while (arr2.length != k) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

    public static int[] generaArray(int pos) {
        int[] array = new int[pos];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 99);
        }

        return array;
    }

    public static final int POSICIONES = 1000;

    public static void main(String[] args) {
        int[] milenario = generaArray(POSICIONES);

        milenario = mergeSort(milenario);

        int[] mayores = new int[20];

        for (int i = milenario.length-1, j = 0; j< mayores.length ;i--, j++){
            mayores[j]=milenario[i];
        }

        System.out.println(Arrays.toString(mayores));

    }
}