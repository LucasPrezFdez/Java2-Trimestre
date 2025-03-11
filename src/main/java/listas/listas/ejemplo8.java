package listas.listas;

import java.util.ArrayList;

public class ejemplo8 {

    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(20);
        enteros.add(7);
        enteros.add(14);
        enteros.add(32);
        enteros.add(3);



        System.out.println("Contenido de la lista: ");

        for (Integer color : enteros) {
            System.out.println(color);
        }

        enteros.set(2, 53);
        System.out.println("Contenido del vector despues de machacar la posicion 2:");
        System.out.println(enteros);
    }
}
