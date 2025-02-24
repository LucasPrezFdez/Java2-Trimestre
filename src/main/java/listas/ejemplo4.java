package listas;

import java.util.ArrayList;

public class ejemplo4 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");

        for (String color : colores) {
            System.out.println(color);
        }

        if (colores.contains("blanco")){
            System.out.println("El color blanco está en la lista");
            colores.remove("blanco");
        } else {
            System.out.println("NO BLANCO");
        }

        System.out.println("Contenido de la lista después de borrar blanco: ");
        for (String color : colores) {
            System.out.println(color);
        }

        colores.remove(2);
        System.out.println("Contenido de la lista después de borrar el elemento de la posicion 2: ");

        for (String color : colores){
            System.out.println(color);
        }

    }
}
