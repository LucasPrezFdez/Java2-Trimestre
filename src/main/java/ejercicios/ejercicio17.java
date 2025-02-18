package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio17 {

    public static int[] rotaDerecha(int[] datos) {
        int ultimo = datos[datos.length - 1];
        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = ultimo;
        return datos;
    }

    public static int[] numeroRotacionesD(int[] datos, int rot) {
        for (int i = 0; i < rot; i++) {
            datos = rotaDerecha(datos);
        }
        return datos;
    }

    /*
    devuelve -1 si no lo encuentra
    o el indice si lo encuentra
    si hay varios devuelve el primer indice
     */
    public static int buscarIndiceArray(int[] datos, int numero) {

        int dev = -1;
        for (int j = 0; j < POSICIONES; j++) {
            if (datos[j] == numero) {
                dev = j;
                break;
            }
        }
        return dev;
    }

    public static final int POSICIONES = 10;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] datos = new int[POSICIONES];
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(datos));


        int indice = 0;

        do {

            System.out.println("por favor introduce un entero: ");
            int numero = Integer.parseInt(sc.nextLine());
            indice = buscarIndiceArray(datos, numero);

        } while (indice == -1);

        numeroRotacionesD(datos, POSICIONES - indice);
        System.out.println(Arrays.toString(datos));

    }

}
