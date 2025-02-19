package cadenas;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class VolteaArray {

    static int[] pako;

    public static void generaArrays(int pos, int inf, int sup) {

        pako = new int[pos];
        Random random = new Random();
        for (int i = 0; i < pos; i++) {
            pako[i] = inf + random.nextInt(sup + 1);
        }
    }

    public static void volteaArray() {
        int[] doble = new int[pako.length];
        for (int j = doble.length - 1, k = 0; j >= 0; j--, k++) {
            doble[k]=pako[j];
        }
        pako=doble;
    }

    //esta pasado por referencia
    public static int[] invertirArray(int[] array){
        return IntStream.range(0, array.length)
                .map(i -> array[array.length - i - 1])
                .toArray();
    }


    public static void main(String[] args) {
        generaArrays(10, 1, 100);
        System.out.println(Arrays.toString(pako));
        volteaArray();
        System.out.println(Arrays.toString(pako));
        pako = invertirArray(pako);
        System.out.println(Arrays.toString(pako));

    }
}
