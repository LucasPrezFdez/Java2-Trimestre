package Objetos;

import java.util.Scanner;

public class Propuesto6 {

    public static boolean esCapicua(int dato) {

        Integer i = dato;
        StringBuffer sbf = new StringBuffer(i.toString());
        String reverse = sbf.reverse().toString();

        return (i.toString()).equals(reverse.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para saber si es capicua: ");
        int pedir = sc.nextInt();

        System.out.println("El número " + pedir + " es capicua: " + esCapicua(pedir));

    }
}
