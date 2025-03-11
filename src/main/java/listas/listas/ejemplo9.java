package listas.listas;

import java.util.ArrayList;

public class ejemplo9 {


    public static void main(String[] args) {

        ArrayList<Gato> jauria = new ArrayList<Gato>();

        jauria.add(new Gato("Garfield","naranja","mestizo"));
        jauria.add(new Gato("Tom","gris","angora"));
        jauria.add(new Gato("Silvest","negro","mestizo"));

        System.out.println("\nDatos de los gatos:\n");
        for (Gato gatoAux : jauria){
            System.out.println(gatoAux);
        }

        jauria.sort(null);
        //Collections.sort(jauria);
        System.out.println(jauria);


    }
}
