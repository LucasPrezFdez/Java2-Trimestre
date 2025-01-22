package arrays;

import java.util.Scanner;

public class resuelto8 {

    public static String invierteCadena(String cadena) {

        String invertida = "";
        for (int j = cadena.length() - 1; j >= 0; j--) {
            invertida = invertida + cadena.charAt(j);
        }

        return invertida;
    }

    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        return invertido;
    }


    public static void main(String[] args) {

        Scanner conner = new Scanner(System.in);
        System.out.println("dame un entero ");
        int numero = conner.nextInt();

        System.out.println(" al derecho es: " + numero);
        int reves = invertirNumero(numero);
        System.out.println(" al reves es: " + reves);

        String cadena = String.valueOf(numero); //convertido a cadena
        System.out.println(cadena);

        for (int k = 0; k < cadena.length(); k++) {
            System.out.print(" " + cadena.charAt(k) + " ");
        }



        //System.out.println("la cadena inverida es: " + invertida);

        int regreso = Integer.parseInt(invierteCadena(cadena));

        if (numero == regreso)
            System.out.println("es capicua");
        else
            System.out.println("pues no lo es");



    }
}
