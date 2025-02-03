package Objetos;

public class EJERCICIO32 {

    public static void main(String[] args) {


        String cadena = "Programacion orientada a objetos";

        int logitud = cadena.length();
        System.out.println("la cadena tiene "+logitud+" caracteres");

        String cadena2 = cadena.trim();
        System.out.println("aplicando trim" +cadena2);

        String cadena2alt = cadena.replace(" ", "");
        System.out.println("aplicande replace "+cadena2alt);

        String cadena3 = cadena2alt.toUpperCase();
        System.out.println("aplicande touppercase "+cadena3);

        String cadena4  =cadena3.concat("12345");
        System.out.println("aplicando concat: "+cadena4);

        String cadena5 = cadena4.substring(10,15);
        System.out.println("aplicando substring: "+cadena5);

        String cadena6 = cadena5.replace("O","o");
        System.out.println("con replace: "+cadena6);

        int comparacion = cadena6.compareTo("Programacion");
        System.out.println(comparacion);




    }
}
