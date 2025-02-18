package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio19 {


    public static final int POSICIONES = 12;

    public static final int[] INDICES = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static int[] insertarDerecha(int[] datos, int numero, int indice) {
        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[indice] = numero;
        return datos;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] datos = new int[POSICIONES];
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(200);
        }

        System.out.println(Arrays.toString(INDICES));
        System.out.println(Arrays.toString(datos));

        System.out.println("numero a insertar: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("indice donde insertar: ");
        int indice = Integer.parseInt(sc.nextLine());

        int[] flop = insertarDerecha(datos, numero, indice);

        System.out.println(Arrays.toString(flop));


    }
}
