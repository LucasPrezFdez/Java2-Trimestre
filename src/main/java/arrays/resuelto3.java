package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto3 {

    public static void ordenaBurbuja(int[] ref) {

        int n = ref.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (ref[j] > ref[j + 1]) {
                    int aux = ref[j];
                    ref[j] = ref[j + 1];
                    ref[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenaBurbujaDescendente(int[] ref) {

        int n = ref.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (ref[j] < ref[j + 1]) {
                    int aux = ref[j];
                    ref[j] = ref[j + 1];
                    ref[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenaCocktail(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            for (int k = i; k < j; k++) { // dirección →
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
            j--;
            for (int k = j; k > i; k--) { // dirección ←
                if (array[k] < array[k - 1]) {
                    int temp = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = temp;
                }
            }
            i++;
        }
    }

    final static int POS = 50;
    final static int LIMITE = 100;

    public static void main(String[] args) {


        int array[] = new int[POS];

        for (int i = 0; i < 50; i++) {
            Random r = new Random();
            array[i] = r.nextInt(LIMITE);
        }
        System.out.println(Arrays.toString(array));

        ordenaCocktail(array);

        System.out.println(Arrays.toString(array));

    }
}
