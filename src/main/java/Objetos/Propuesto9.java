package Objetos;

import java.util.Arrays;

public class Propuesto9 {

    public static int[] generaArray(int pos) {
        int[] array = new int[pos];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + Math.random() * 71);
        }

        return array;
    }

    public static final int POSICIONES = 100;

    public static void main(String[] args) {

        int[] datos = generaArray(POSICIONES);

        System.out.println(Arrays.toString(datos));

        int max = datos[0];
        int min = datos[0];
        int suma = 0;

        for (int k = 0; k < POSICIONES; k++) {
            if (datos[k] > max) {
                max = datos[k];
            }
            if (datos[k] < min) {
                min = datos[k];
            }
            suma += datos[k];
        }
        float media = (float) suma / POSICIONES;
        System.out.println("maximo: " + max);
        System.out.println("minimo: " + min);
        System.out.println("media: " + media);

        int[] veces = new int[81];
        for (int k = 0; k < POSICIONES; k++) {
            int valor = datos[k] - 10; // Ajustar índice para que coincida con el rango de 10 a 80
            veces[valor]++;
        }
        System.out.println(Arrays.toString(veces));

        int gran = 0;
        int indice = -1;
        for (int j = 0; j < veces.length; j++) {
            if (veces[j] > gran) {
                gran = veces[j];
                indice = j;
            }
        }
        System.out.println("indice: " + (indice + 10)); // Ajustar de nuevo al rango de valores original
    }
}