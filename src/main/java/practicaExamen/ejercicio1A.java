package practicaExamen;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1A {

    public static double[] generaArray(int pos) {
        double[] array = new double[pos];

        return array;
    }

    public static void rellenaArray(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(-200, 200);
        }
    }

    public static void main(String[] args) {

        double[] manolo = generaArray(60);
        rellenaArray(manolo);


        double[] positivos = Arrays.stream(manolo)
                .filter(v -> v >= 0)
                .toArray();

        double[] negativos = Arrays.stream(manolo)
                .filter(v -> v < 0)
                .toArray();

        Arrays.sort(positivos);
        Arrays.sort(negativos);


        double[] pares = Arrays.stream(negativos)
                .filter(value -> (int) value % 2 == 0)
                .toArray();

        double[] inpares = Arrays.stream(negativos)
                .filter(value ->(int) value % 2 != 0)
                .toArray();

        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(inpares));

    }

}
