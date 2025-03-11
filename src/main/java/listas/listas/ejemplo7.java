package listas.listas;

import java.util.ArrayList;

public class ejemplo7 {

    public static void main(String[] args) {


        ArrayList<String> colores = new ArrayList<>();

        colores.add("naranga");
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");

        for (String color : colores) {
            System.out.println(color);
        }

        colores.removeIf(col ->col.contains("a"));
        System.out.println("Contenido de la lista después de borrar los colores que contienen la letra \"a\": ");
        System.out.println(colores);


    }
}
