package ejercicios;

import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i=0; i<numero.length;i++){
            Random random = new Random();
            numero[i]=random.nextInt(100);
        }



    }
}
