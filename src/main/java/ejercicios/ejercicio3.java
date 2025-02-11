package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("dame numero: ");
            array[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder(Arrays.toString(array));
        String reves = sb.reverse().toString();

        for (int j = array.length-1; j >= 0; j--) {
            System.out.println(array[j]);
        }

        System.out.println(reves);


    }
}
