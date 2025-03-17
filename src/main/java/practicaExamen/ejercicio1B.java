package practicaExamen;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1B {


    public static float[] generaArray(int pos) {
        float[] array = new float[pos];

        return array;
    }

    public static void rellenaArray(float[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat(-100, 100);
        }
    }


    public static void main(String[] args) {

        float[] manolo = generaArray(50);
        rellenaArray(manolo);

        System.out.println(Arrays.toString(manolo));

        int contPositivo = 0;
        int contNegativo = 0;

        for (float v : manolo) {
            if (v >= 0) {
                contPositivo++;
            } else {
                contNegativo++;
            }
        }

        float[] positivos = generaArray(contPositivo);
        float[] negativos = generaArray(contNegativo);

        int auxPos = 0;
        int auxNeg = 0;

        for (float v : manolo) {
            if (v >= 0) {
                positivos[auxPos++] = v;
            } else {
                negativos[auxNeg++] = v;

            }

        }

        Arrays.sort(positivos);
        Arrays.sort(negativos);

        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));

    }
}
