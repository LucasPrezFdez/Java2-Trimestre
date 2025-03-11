package listas.listas;

import java.util.ArrayList;

public class ejemplo2 {


    public static void main(String[] args) {

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(18);
        enteros.add(22);
        enteros.add(-30);
        System.out.println(enteros);
        System.out.println("Numero de elementos: "+enteros.size());
        Integer manipula = enteros.get(1);
        System.out.println("El elemento en la posicion 1 es: "+ manipula);

        


    }
}
