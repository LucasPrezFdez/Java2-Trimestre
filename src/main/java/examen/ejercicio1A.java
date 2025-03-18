package examen;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1A {

    public static void QuickSort(int[] array) {
        int n = array.length;

        // Recorrer todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la sublista desordenada
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar el elemento más pequeño con el primer elemento de la sublista desordenada
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static int[] generaArray(int pos) {
        int[] array = new int[pos];

        return array;
    }

    public static void rellenaArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-150, 150);
        }
    }

    public static void main(String[] args) {

        int[] manolo = generaArray(60);
        rellenaArray(manolo);

        int[] pares = Arrays.stream(manolo)
                .filter(value -> value % 2 == 0)
                .toArray();

        int[] impares = Arrays.stream(manolo)
                .filter(value -> value % 2 != 0)
                .toArray();

        QuickSort(pares);
        QuickSort(impares);

        int[] positivos = Arrays.stream(impares)
                .filter(v -> v >= 0)
                .toArray();

        int[] negativos = Arrays.stream(impares)
                .filter(v -> v < 0)
                .toArray();

        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
    }
}
