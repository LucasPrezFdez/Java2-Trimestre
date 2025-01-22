package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto9 {

    final static int POS = 50;
    final static int LIMITE = 100;

    public static int buscabin(int[] array, int valor, int min, int max) {
        if (min == max) {
            System.out.println("SALIDA PORQUE MIN=MAX");
            return -1;
        }

        int mitad = (min + max) / 2;
        System.out.println("min " + min + " array[min] " + array[min] + " max " + max + " array[max] " + array[max] + " mitad "+mitad+ " "+ array[mitad]);

        if (valor == array[mitad]) return mitad;
        if (valor == array[min]) return min;
        if (valor == array[max]) return max;

        if (valor > array[mitad])
            return buscabin(array, valor, mitad + 1, max);
        else
            return buscabin(array, valor, min, mitad - 1);
    }

    public static void main(String[] args) {

        int array[] = new int[POS];

        for (int i = 0; i < POS; i++) {
            Random ran = new Random();
            array[i] = ran.nextInt(LIMITE);

        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("por faver introduce un numero entre 0 y 99...");
        int numero = scanner.nextInt();
        int resultado=buscabin(array,numero,0,POS-1);
        System.out.println("la busqueda de "+numero+ "da como resultado: "+resultado);


    }
}
