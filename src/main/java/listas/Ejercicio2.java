package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        int suma = 0;
        int media = 0;

        for (int i = 0; i < random.nextInt(10,21); i++) {
            numeros.add(random.nextInt(100));
        }

        numeros.sort(null);

        for (Integer numero : numeros) {
            suma+=numero;
        }
        System.out.println("La suma de los numeros es: "+suma);

        for (Integer numero : numeros) {
            media+=numero;
        }
        media = media/numeros.size();
        System.out.println("La media de los numeros es: "+media);
        System.out.println("Maximo: "+ Collections.max(numeros));
        System.out.println("Minimo: "+ Collections.min(numeros));

        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        //imprimir resultados

        System.out.println("Lista: " + numeros);
        System.out.println("Tamaño de la lista: " + numeros.size());
        System.out.println("Suma de los elementos: " + stats.getSum());
        System.out.println("Media de los elementos: " + stats.getAverage());
        System.out.println("Máximo: " + stats.getMax());
        System.out.println("Mínimo: " + stats.getMin());




    }
}
