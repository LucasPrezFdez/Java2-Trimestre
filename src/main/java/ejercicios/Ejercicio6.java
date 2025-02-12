package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {


    public static void rotarDerecha(int[] array) {
        int fin = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = fin;
    }

    public static void rotarIzquierda(int[] array) {

        int fin = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = fin;
    }

    public static void rellenaArray(int[] array) {
        Random random = new Random();
        System.out.println("rellenando el array... ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void pintarArrayConsola(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] creaArrays(int tamaño) {
        return new int[tamaño];
    }

    public static void main(String[] args) {

        int[] array = creaArrays(15);
        rellenaArray(array);
        pintarArrayConsola(array);
        rotarIzquierda(array);
        pintarArrayConsola(array);



    }
}
