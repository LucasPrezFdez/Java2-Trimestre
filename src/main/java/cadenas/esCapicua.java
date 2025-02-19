package cadenas;

import java.util.Scanner;

public class esCapicua {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("pasa entero: ");
        int numero = Integer.parseInt(sc.nextLine());

        StringBuilder builder = new StringBuilder(String.valueOf(numero));
        String rev = builder.reverse().toString();

        int rever = Integer.parseInt(rev);
        if (numero==rever)
            System.out.println(numero+ " es Capicua");
        else
            System.out.println(numero+ " no es Capicua");



    }
}
