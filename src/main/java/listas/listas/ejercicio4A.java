package listas.listas;

import java.util.Scanner;

public class ejercicio4A {

    public static String aMayus() {

        Scanner sc = new Scanner(System.in);
        String cad1, cad2;

        System.out.println("dime la primera cadena: ");
        cad1 = sc.nextLine();
        System.out.println("dime la parte que quieres poner en mayusculas: ");
        cad2 = sc.nextLine();

        String resultado = cad1.replace(cad2, cad2.toUpperCase());

        return resultado;
    }


    public static void main(String[] args) {


        String cadena = aMayus();
        System.out.println(cadena);

    }

}
