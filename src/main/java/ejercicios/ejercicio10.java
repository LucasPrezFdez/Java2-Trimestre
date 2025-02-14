package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class ejercicio10 {

    public static int[] reorganizarParesImpares (int[] array){
        int[] pares = Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .toArray();

        int[] impares = Arrays.stream(array)
                .filter(num -> num % 2 != 0)
                .toArray();

        int[] resultado = new int[array.length];
        System.arraycopy(pares, 0, resultado, 0, pares.length);
        System.arraycopy(impares, 0, resultado, pares.length, impares.length);

        return resultado;
    }

    public static void main(String[] args) {

        Random random = new Random();
//mi manera
        int[] datos = new int[20];
        int[] arrayFinal = new int[20];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(100);
        }

        Arrays.sort(datos);
        int aux = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i]%2 == 0){
                arrayFinal[aux] = datos[i];
                aux++;
            }
        }

        for (int i = 0; i < datos.length; i++) {
            if (datos[i]%2 != 0){
                arrayFinal[aux] = datos[i];
                aux++;
            }
        }

        System.out.println(Arrays.toString(arrayFinal));

//la manera de los dioses

        int[] datos2 = new int[20];

        for (int i = 0; i < datos2.length; i++) {
            datos2[i] = random.nextInt(100);
        }

        int[] arrayReorganizado = reorganizarParesImpares(datos2);
        System.out.println(Arrays.toString(arrayReorganizado));

    }

}
