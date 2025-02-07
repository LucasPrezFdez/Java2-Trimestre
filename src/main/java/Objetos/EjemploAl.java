package Objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemploAl implements Comparator<String> {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");

        System.out.println("Lista de nombres: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //criterio de ordenamiento con expresion lambda
        nombres.sort((o1, o2) -> o1.compareTo(o2));

        Collections.sort(nombres);

        System.out.println(nombres);

        //criterio de ordenamiento con comparator
        //ordena alfabeticamente usando un comparator
        nombres.sort(Comparator.reverseOrder());

        System.out.println(nombres);

        //acceder a un elemento por su indice
        System.out.println("\nEl primer nombre es: " + nombres.get(0));

        //for para visualizar los elementos de la vista dinamica
        for (int i = 0; i < nombres.size(); i++) {
            String elemento = nombres.get(i);
            System.out.println("el elemento " + i + " de la lista de nombres es: " + elemento.toUpperCase());
        }

        nombres.set(2, "Lucía");
        System.out.println("\nLista despues de modificar el tercer elemento: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.remove(1);
        System.out.println("\nLista despues de eliminar el segundo elemento: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //verificar si contiene algo
        if (nombres.contains("Carlos")) {
            System.out.println("\nCarlos esta en la lista.");
        } else {
            System.out.println("\nCarlos no esta en la lista.");
        }

        //obtener el tamaño del ArrayList
        System.out.println("\nEl tamaño de la lista es: " + nombres.size());

        //limpier todos los elementos del arraylist
        nombres.clear();
        System.out.println("\n¿el arraylist esta vacio?: " + nombres.isEmpty());

        nombres.add(null);
        nombres.add(null);

        System.out.println(nombres);
        System.out.println(nombres.size());
        nombres.add("Maruxa");
        System.out.println(nombres);

    }

    @Override
    public int compare(String s1, String s2) {

        return s1.compareTo(s2);
    }
}
