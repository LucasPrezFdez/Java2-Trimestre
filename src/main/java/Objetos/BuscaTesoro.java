package Objetos;

import java.util.Arrays;
import java.util.Scanner;


public class BuscaTesoro {

    /**
     * Minijuego "Busca el tesoro"
     * <p>
     * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de CINCO
     * filas por CUATRO columnas. El usuario intentará averiguar dónde está el
     * tesoro.
     *
     * @author Luis José Sánchez
     */

    public static void verCuadro(int[][] cuadrante) {
        for (int i = 0; i < cuadrante.length; i++)
            System.out.println(Arrays.toString(cuadrante[i]));
        System.out.println();
    }

    // pinta el cuadrante
    public static void pintaMona(int[][] cuadrante) {
        System.out.println("  1 2 3 4 \n  -------");
        for (int x = 0; x <= 4; x++) {
            System.out.print((x + 1) + "|");
            for (int y = 0; y <= 3; y++) {
                if (cuadrante[x][y] == INTENTO) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }//for inter
            System.out.println();
        }//fin for externo
    }

    // se definen constantes para representar el contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int[][] cuadrante = new int[5][4];


        // inicializamos el array (ya lo estaba)
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 4; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
        //verCuadro(cuadrante);

        // colocar aleatoriamente un 1 mina y un 2 tesoro
        // coloca la mina
        int minaX = (int) (Math.random() * 5); // fila
        int minaY = (int) (Math.random() * 4); // col
        cuadrante[minaX][minaY] = MINA;
        //verCuadro(cuadrante);

        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 5); //fila
            tesoroY = (int) (Math.random() * 4); //col
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        //al no coincidir coloco el tesoro
        cuadrante[tesoroX][tesoroY] = TESORO;
        //verCuadro(cuadrante);

        // juego
        System.out.println("¡BUSCA EL TESORO!");

        boolean salir = false;
        //String cad = "";
        do {
            pintaMona(cuadrante);

            // pide las coordenadas
            System.out.print("Coordenada x: ");
            int f = Integer.parseInt(sc.nextLine());
            System.out.print("Coordenada y: ");
            int c = Integer.parseInt(sc.nextLine());

            // mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[f][c]) {
                case VACIO:
                    cuadrante[f][c] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                default:
            }
        } while (!salir);

        verCuadro(cuadrante);


    }

}