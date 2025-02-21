package cadenas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumAPal {

    static Map<Character, String> equivale = new HashMap<>();

    public static void completaEquivalencias() {
        equivale.put('0', "cero");
        equivale.put('1', "uno");
        equivale.put('2', "dos");
        equivale.put('3', "tres");
        equivale.put('4', "cuatro");
        equivale.put('5', "cinco");
        equivale.put('6', "seis");
        equivale.put('7', "siete");
        equivale.put('8', "ocho");
        equivale.put('9', "nueve");
    }

    public static String convierteEnPalabras(int n) {
        completaEquivalencias();

        String numero = String.valueOf(n);
        String cadena = "";
        for (int i = 0; i < numero.length(); i++) {

            // morse += equivale.get(Integer.parseInt(new StringBuilder(numero.charAt(i)).toString()));
            cadena += " " + equivale.get(numero.charAt(i));
        }

        return cadena;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un entero para convertir a palabras...");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("convertido a PALABRAS: " + convierteEnPalabras(numero));

    }
}
