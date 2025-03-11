package listas.listas;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo10 {


    public static void main(String[] args) {

        ArrayList<Integer> enteros = new ArrayList<>();

        enteros.add(20);
        enteros.add(78);
        enteros.add(14);
        enteros.add(32);
        enteros.add(3);

        System.out.println("\nNumeros en el orden original: ");
        for (Integer numero : enteros) {
            System.out.println(numero);
        }

        //ordeno por numeros por orden natural
        Collections.sort(enteros);
        System.out.println("\nNumeros ordenados: ");
        for (Integer numero : enteros) {
            System.out.println(numero);
        }




    }
}
