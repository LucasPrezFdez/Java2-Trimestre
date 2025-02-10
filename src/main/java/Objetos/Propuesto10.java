package Objetos;

import java.util.*;

public class Propuesto10 {

    // Implementación del algoritmo QuickSort
    public static void quickSort(int[] array, int inicio, int fin) {
        if (inicio >= fin) {
            return; // Caso base: si el subarray tiene uno o ningún elemento
        }

        // Elegir el pivote (en este caso, el primer elemento)
        int pivote = array[inicio];
        int izquierda = inicio + 1;
        int derecha = fin;

        // Reorganizar los elementos alrededor del pivote
        while (izquierda <= derecha) {
            // Encontrar un elemento mayor que el pivote desde la izquierda
            while (izquierda <= fin && array[izquierda] < pivote) {
                izquierda++;
            }

            // Encontrar un elemento menor que el pivote desde la derecha
            while (derecha > inicio && array[derecha] >= pivote) {
                derecha--;
            }

            // Intercambiar los elementos si no se han cruzado
            if (izquierda < derecha) {
                intercambiar(array, izquierda, derecha);
            }
        }

        // Colocar el pivote en su posición correcta
        if (derecha > inicio) {
            intercambiar(array, inicio, derecha);
        }

        // Llamadas recursivas para los subarrays izquierdo y derecho
        quickSort(array, inicio, derecha - 1); // Subarray izquierdo
        quickSort(array, derecha + 1, fin);   // Subarray derecho
    }

    // Método para intercambiar dos elementos en el array
    private static void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int j = 0; j < array.length; j++) {
            Random random = new Random();
            array[j] = 1 + random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));

        ArrayList<Integer> ausentes = new ArrayList<>();

//        for (int i = 0; i < array.length; i++) {
//            if (Arrays.binarySearch(array, i) < 0) {
//                ausentes.add(i);
//            }
//        }
//
//        System.out.println(ausentes);

        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : array){
            frecuencia.put(num,frecuencia.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> pareja : frecuencia.entrySet()){
            System.out.println("El número " + pareja.getKey() + " aparece " + pareja.getValue() + " veces.");

        }

        for (int i = 1 ; i<=100; i++){
            if (!frecuencia.containsKey(i))
                ausentes.add(i);
        }

        System.out.println(ausentes);

    }
}