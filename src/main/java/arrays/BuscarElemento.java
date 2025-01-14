package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuscarElemento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];

        for (int i = 0; i < args.length; i++) {

            array[i] = (int) (1 + Math.random() * 999);
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        System.out.println("dame un entero entre 1 y 999: --- ");
        int busca = sc.nextInt();

        boolean cortar = false;
        int contador = 0;

        while(contador< array.length && !cortar){

            if (busca==array[contador]){
                cortar=true;
            }
            contador++;
        }
        if(cortar)
            System.out.println("encontrado en la posicion "+(contador-1));
        else
            System.out.println("no encontrado");

        System.out.println(array[contador-1]);
        System.out.println(Arrays.toString(array));

    }
}
