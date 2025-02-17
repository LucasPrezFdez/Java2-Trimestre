package ejercicios;

import java.util.Arrays;

public class ejercicio14 {

    static String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja",
            "rosa", "negro", "blanco", "morado"
    };

    static String[] otras = {"Pikachu", "Charmander", "Bulbasaur", "Squirtle",
            "Evolucion", "Pokebola", "Entrenador", "Gym", "Legendario"
    };

    public static String randomeroVariado() {
        int array = (int) (Math.random() * 2);
        int pos = (int) (Math.random() * 9);

        if (array == 0)
            return colores[pos];
        else
            return otras[pos];

    }

    public static String[] coloresFirst(String[] array) {

        Object[] cols = Arrays.stream(array)
                .filter(pal -> isInColores(pal))
                .toArray();

        Object[] pals = Arrays.stream(array)
                .filter(pal -> !isInColores(pal))
                .toArray();

        Arrays.sort(cols);
        Arrays.sort(pals);

        String[] resultado = new String[array.length];
        System.arraycopy(cols,0,resultado,0,cols.length);
        System.arraycopy(pals,0,resultado,cols.length,pals.length);

        return resultado;
    }

    public static boolean isInColores(String pal) {

        boolean esta = false;
        for (String item : colores) {
            if (item.equals(pal)) {
                esta = true;
                break;
            }
        }
            return esta;
    }
        //ESTE ES EL MEJOR
    public static boolean isInColores2(String palabra) {

        return Arrays.asList(colores).contains(palabra);
    }


    public static void main(String[] args) {

        String[] palabras = new String[8];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = randomeroVariado();
        }

        System.out.println(Arrays.toString(palabras));

        System.out.println("Ordenando el array... (Colores primero)");
        System.out.println(Arrays.toString(coloresFirst(palabras)));

    }
}
