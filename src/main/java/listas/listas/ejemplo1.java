package listas.listas;

import java.util.ArrayList;

public class ejemplo1 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        System.out.println(lista);
        System.out.println("Nº de elementos: " + lista.size());
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");
        System.out.println("Nº de elementos: " + lista.size());
        lista.add("blanco");
        System.out.println("Nº de elementos: " + lista.size());

        String manipula = lista.get(0);

        System.out.println("Elemento en la posición 0: " + manipula);
        System.out.println("Elemento en la posición 3: " + lista.get(3));




    }
}
