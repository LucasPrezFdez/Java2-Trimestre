package practicaExamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioExamenProgramacion {

    // Escribe un programa que lea 15 números por teclado y los almacene en un array.
    // Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la 1.
    // El de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
    // Finalmente muestra el contenido del array.

    public static void rellenaArray(int[] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[15];
        rellenaArray(numeros);
        int cambio;

        Scanner sc = new Scanner(System.in);

        // Leer 15 números


        System.out.println("Array original: " + Arrays.toString(numeros));

        // Rotar los elementos del array
        cambio = numeros[numeros.length - 1]; // El último elemento
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1]; // Desplazar los elementos una posición a la derecha
        }
        numeros[0] = cambio; // El último elemento pasa a la primera posición

        /*
         // Rotar los elementos del array en la dirección contraria
        cambio = numeros[0]; // El primer elemento
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1]; // Desplazar los elementos una posición a la izquierda
        }
        numeros[numeros.length - 1] = cambio; // El primer elemento pasa a la última posición


         */

        // Mostrar el array después de la rotación
        System.out.println("Array después de rotar: " + Arrays.toString(numeros));

    }
}
