package listas.listas;

import java.util.ArrayList;
import java.util.Comparator;

public class ordenGatos {

    public static void main(String[] args) {

        ArrayList<Gato> camada = new ArrayList<Gato>();

        camada.add(new Gato("Garfield","naranja","mestizo"));
        camada.add(new Gato("Tom","gris","angora"));
        camada.add(new Gato("Silvest","negro","mestizo"));

        //camada.sort((g1, g2 )-> g1.getNombre().compareTo(g2.getNombre()));
        camada.sort(Comparator.comparing(Gato::getNombre));
        System.out.println("\nGatos ordenados por nombre: ");

        for (Gato gatoAux : camada){
            System.out.println(gatoAux+"\n");
        }

    }

}
