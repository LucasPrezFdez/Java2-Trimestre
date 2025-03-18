package examen;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ejercicio3A {


    public static void main(String[] args) {

        Random r = new Random();
        int numero = r.nextInt(0, 1000);
        System.out.println(numero);

        Map<Integer, String> conver = new HashMap<>();
        conver.put(1, "uno");
        conver.put(2, "dos");
        conver.put(3, "tres");
        conver.put(4, "cuatro");
        conver.put(5, "cinco");
        conver.put(6, "seis");
        conver.put(7, "siete");
        conver.put(8, "ocho");
        conver.put(9, "nueve");


        StringBuilder cadena = new StringBuilder();
        int aux = numero;
        while (aux > 0) {
            int digito = aux % 10;
            cadena.insert(0, conver.get(digito) + " ");
            aux /= 10;
        }

        System.out.println(cadena);

    }
}
