package Objetos;

import java.util.Arrays;


public class InvertionSort {

    public static void insertionSort(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            int j = i;
            while (j > 0 && num < numeros[j - 1]) {
                numeros[j] = numeros[j - 1];
                j--;
            }

            numeros[j] = num;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[25];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 99);
        }

        System.out.println(Arrays.toString(array));

        int[] original = {1, 2, 3, 4, 5};
        int[] copia = original.clone();

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copia));

        System.out.println(original);
        System.out.println(copia);

        System.out.println(original.equals(copia));

        int[] desornedado = array.clone();

        insertionSort(desornedado);

        System.out.println("Array desordenado: " + Arrays.toString(array));
        System.out.println("Array ordenado: " + Arrays.toString(desornedado));
    }
}