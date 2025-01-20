package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto2 {

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

    final static int POS = 50;
    final static int LIMITE = 20;

    public static void main(String[] args) {


        int array[] = new int[POS];

        for (int i = 0; i < 50; i++) {
            Random r = new Random();
            array[i] = r.nextInt(LIMITE);
        }
        System.out.println(Arrays.toString(array));

        ordenaBurbuja(array);

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor introduce un numero entre 0 y 9");
        int numero = scanner.nextInt();

        for (int k = 0; k<POS;k++){
            if (array[k]==numero)
                System.out.println("lo encontre papito");
        }

        Arrays.binarySearch(array,numero);
    }
}
