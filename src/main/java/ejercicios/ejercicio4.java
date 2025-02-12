package ejercicios;

import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {

        int[] vector = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        Random random = new Random();

        for (int i=0; i<vector.length;i++){
            vector[i]=random.nextInt(100);
            cuadrado[i] = (int) Math.pow(vector[i],2);
            cubo[i] = (int) Math.pow(vector[i],3);
        }

        for (int i = 0; i< vector.length;i++){
            System.out.println(vector[i]+"\t"+cuadrado[i]+"\t"+cubo[i]);
        }


    }
}
