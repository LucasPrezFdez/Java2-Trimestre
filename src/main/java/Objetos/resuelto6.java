package Objetos;

import java.util.Arrays;
import java.util.StringTokenizer;

public class resuelto6 {


    public static void ordenaCadenas(String[] array) {
        String aux;
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] tokos = new String[8];
        String[] letras = new String[4];
        Float[] numeros = new Float[4];

        System.out.println(letras[0]);

        StringTokenizer notas;
        System.out.println(Arrays.toString(letras));
        notas = new StringTokenizer("Juan_Carlos\n8.5\nAndrés\n4.9\nPedro\n3.8\nJuan\n6.3\n");

        int i = 0;
        while (notas.hasMoreTokens()) {
            tokos[i] = notas.nextToken();
            i++;
        }
        int j = 0, k = 0;
        for (i = 0; i < tokos.length; i++) {
            if (i % 2 == 0) {
                letras[k] = tokos[i];
                k++;
            } else {
                numeros[j] = Float.parseFloat(tokos[i]);
                j++;
            }
        }
//        String toko = notas.nextToken();

        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(numeros));
    }


}


