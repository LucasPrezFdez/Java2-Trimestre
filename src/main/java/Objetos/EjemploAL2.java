package Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploAL2 {

    //recorrido con Iterator

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Pedro");
        nombres.add("Lucía");
        nombres.add("Sofía");
        nombres.add("Javier");

        System.out.println("Lista original:");
        Iterator<String> iterator = nombres.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = nombres.iterator();
        while (iterator.hasNext()){
            String nombre = iterator.next();
            if (nombre.startsWith("L")){
                iterator.remove();
            }
        }

        System.out.println("\nLista después de eliminar los nombres que empiezan por L:");
        iterator = nombres.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
