package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {


    public static void main(String[] args) {



        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            System.out.println("rellenando el array... ");
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);

        for (int i = 0; i< array.length; i++){
            if (i==0){
                System.out.println("Minimo = "+array[i]);
            } else if (i== array.length-1) {
                System.out.println("Maximo = "+array[i]);
            } else
                System.out.println(array[i]);

        }



    }
}
