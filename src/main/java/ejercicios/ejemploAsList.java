package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejemploAsList {

    public static void main(String[] args) {

        String[] colores = {"rojo", "verde", "azul"};

        List<String> listaColores = Arrays.asList(colores);
        List<String> listaDeColores = new ArrayList<String>(listaColores);
        listaColores = Arrays.asList(colores);
        listaDeColores.add(0, "jaspeado");

        System.out.println("Lista: " + listaColores);
        System.out.println("Lista Dinamica: " + listaDeColores);

        String[] arrayEstaticoColores = listaDeColores.toArray(new String[0]);

        System.out.println("Array estatico: ");
        for (String color : arrayEstaticoColores) {
            System.out.println(color);
        }
        System.out.println("Tamaño nuevo: " + arrayEstaticoColores.length);

    }
}
