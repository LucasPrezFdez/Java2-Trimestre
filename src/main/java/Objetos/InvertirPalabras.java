package Objetos;

import java.util.Scanner;

public class InvertirPalabras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame una cadena para obtener sus palabras: ");
        String pedir = sc.nextLine();

        String[] palabras = pedir.split(" ");

        String invertido = "";

        for (String pal : palabras) {
            System.out.println(pal);
        }

        for (int k = palabras.length - 1; k >= 0; k--) {
            System.out.println(palabras[k]);
            invertido += palabras[k] + " ";
        }

        invertido = invertido.trim();
        System.out.println("Cadena invertida: " + invertido);
    }
}