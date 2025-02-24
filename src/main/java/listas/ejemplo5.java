package listas;

import java.util.ArrayList;

public class ejemplo5 {


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



    }
}
