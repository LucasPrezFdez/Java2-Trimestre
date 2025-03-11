package listas.listas;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemplosSimplesMetodos {


    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        // add(elemento)
        frutas.add("Manzana");
        frutas.add("Plátano");
        System.out.println("Después de add: " + frutas);
        // add(indice,elemento
        frutas.add(1, "Naranja");
        System.out.println("Después de add con índice: " + frutas);

        // clear()
        ArrayList<String> tempList = new ArrayList<>(frutas);
        tempList.clear();
        System.out.println("Después de clear: " + tempList);

        // contains(elemento)
        boolean contieneManzana = frutas.contains("Manzana");
        System.out.println("¿Contiene manzana? " + contieneManzana);

        // get(indice)

        String segundaFruta = frutas.get(1);
        System.out.println("La segunda fruta es: " + segundaFruta);

        // indexOf(elemento)
        int indiceManzana = frutas.indexOf("Manzana");
        System.out.println("El índice de manzana es: " + indiceManzana);

        // isEmpty()
        boolean listaVacia = frutas.isEmpty();
        System.out.println("¿La lista está vacía? " + listaVacia);

        // remove(indice)
        String frutaEliminada = frutas.remove(1);
        System.out.println("Fruta removida por índice: " + frutaEliminada);
        System.out.println("Después de remove por índice: " + frutas);

        // remove(elemento)
        boolean eliminado = frutas.remove("Manzana");
        System.out.println("¿Se eliminó manzana? " + eliminado);
        System.out.println("Después de remove por elemento: " + frutas);

        // removeIf(filtro)
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.removeIf(fruta -> fruta.startsWith("P"));
        System.out.println("Después de removeIf: " + frutas);

        // set(indice,elemento)
        frutas.set(0, "Mango");
        System.out.println("Después de set: " + frutas);

        // size()
        int tamaño = frutas.size();
        System.out.println("El tamaño de la lista es: " + tamaño);

        // toArray()
        String[] arrayFrutas = frutas.toArray(new String[0]);
        System.out.println("Array de frutas: " + Arrays.toString(arrayFrutas));


    }


}
