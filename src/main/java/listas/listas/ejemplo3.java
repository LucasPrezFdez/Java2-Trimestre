package listas.listas;

import java.util.ArrayList;

public class ejemplo3 {


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

        colores.set(2, "turquesa");
        System.out.println("Contenido del vector despues de machacar la posicion 2:");
        System.out.println(colores);

    }
}
