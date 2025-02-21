package cadenas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio37 {


    static Map<Character, String> equivale = new HashMap<>();

    public static void completaEquivalencias() {
        equivale.put('0', "-----");
        equivale.put('1', ".----");
        equivale.put('2', "..---");
        equivale.put('3', "...--");
        equivale.put('4', "....-");
        equivale.put('5', ".....");
        equivale.put('6', "-....");
        equivale.put('7', "--...");
        equivale.put('8', "---..");
        equivale.put('9', "----.");

    }

    public static String convierteEnMorse(int n) {

        completaEquivalencias();
        String morse = "";
        String numero = String.valueOf(n);

        for (int i = 0; i < numero.length(); i++) {

            // morse += equivale.get(Integer.parseInt(new StringBuilder(numero.charAt(i)).toString()));
            morse += " " + equivale.get(numero.charAt(i));
        }

        return morse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un entero para morsear...");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("convertido a MORSE: " + convierteEnMorse(numero));

    }
}
