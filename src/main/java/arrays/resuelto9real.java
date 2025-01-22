package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto9real {

    /*
    10 gerena un array como el resuelto 9
    e inserta en la POSICION APROPIADA
     */
    final static int POS = 50;
    final static int LIMITE = 100;

    public static void main(String[] args) {

        int array[] = new int[POS];

        for (int i = 0; i < POS; i++) {
            Random ran = new Random();
            array[i] = ran.nextInt(LIMITE);

        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("por faver introduce un numero entre 0 y 99...");
        int numero = scanner.nextInt();

        //tratamos de insertarlo
        int indice = 0;
        boolean sigue = true;
        while (sigue && indice < POS) {
            if (array[indice] >= numero) {
                System.out.println("encontrado");
                sigue = false;
            }
            indice++;
        }
        System.out.println("posicion: " + (indice - 1));

        int[] nuevo = new int[POS + 1];

        for (int i = 0; i <= indice - 2; i++) {
            nuevo[i] = array[i];
        }
        //insertamos en indice -1
        nuevo[indice - 1] = numero;

        //despues
        for (int i = indice; i < POS; i++) {
            nuevo[i] = array[i];
        }
        //la ultima posicion a pelo
        nuevo[POS]=array[POS-1];

        System.out.println(Arrays.toString(nuevo));
    }
}
