package Objetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Propuesto9Map {
//repetimos el 9 con un nuevo contenedor -- > parejas de valore
    //la herramienta se llma mapa
    //al primer elemento se la llama key
    //al segundo elemento de la pareja se le llama value

    public static void main(String[] args) {
        // Crear un vector de 100 posiciones
        int[] vector = new int[100];
        Random random = new Random();

        // Llenar el vector con números aleatorios entre 10 y 80
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(71) + 10; // (80 - 10 + 1) + 10
        }

        // Variables para calcular estadísticas
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;

        // HashMap para contar las repeticiones de cada número
        Map<Integer, Integer> frecuencia = new HashMap<>();

        // Recorrer el vector para calcular mayor, menor, suma y frecuencias
        for (int num : vector) { //FOR EACH
            // Calcular mayor y menor
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;

            // Calcular la suma
            suma += num;


            // Contar la frecuencia de cada número CUENTA LAS VECES QUE APARECE CADA NUMERO
            //EN UNA SOLA PU:::: LINEa
            //PONES EN EL MAP
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> pareja : frecuencia.entrySet()) {
            System.out.println("valor: " + pareja.getKey() + " ---> " + pareja.getValue() + " veces");
        }

        // Calcular el valor que más se repite
        int valorMasRepetido = -1;
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                valorMasRepetido = entry.getKey();
            }
        }

        // Calcular la media
        double media = (double) suma / vector.length;

        // Mostrar resultados
        System.out.println("Vector generado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nEstadísticas:");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Valor que más se repite: " + valorMasRepetido + " (repetido " + maxFrecuencia + " veces)");
        System.out.println("Media: " + media);

    }
}