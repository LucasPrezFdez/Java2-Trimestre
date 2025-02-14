package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class ejercicio11 {

    /*
    Realiza un programa que pida 10 numeros random y los guarde en un array.A continuacion
    se debe mostrar el contenido de ese array junto al indice (0-9). Seguidamente el programa
    debe mostrar los numeros primos en las primeras posiciones del array y los no primos en las
    ultimas.
     */

    public static boolean esPrimo(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] reorganizarPrimosOtros(int[] array){
        int[] primos = Arrays.stream(array)
                .filter(num -> esPrimo(num))
                .toArray();

        int[] impares = Arrays.stream(array)
                .filter(num -> !esPrimo(num))
                .toArray();

        int[] otros = new int[array.length];
        System.arraycopy(primos, 0, otros, 0, primos.length);
        System.arraycopy(impares, 0, otros, primos.length, impares.length);

        return otros;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] datos = new int[50];

        //llenar el vector con numeros aleatorios entre 0 y 20
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(100) + 1;
        }

        int[] nuevo = reorganizarPrimosOtros(datos);

        System.out.println(Arrays.toString(nuevo));


    }
}
