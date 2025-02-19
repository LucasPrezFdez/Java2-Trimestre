package cadenas;

import java.util.Scanner;

public class juntaNumeros {

    public static int juntaNumeros(int num_1, int num_2) {

        int fus = 0;
        StringBuilder builder = new StringBuilder(String.valueOf(num_1));
        String fusion = builder.append(num_2).toString();

        //ojo con desbordar el tipo de dato entero
        return Integer.parseInt(fusion);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("dame entero 1: ");
        int num_1 = Integer.parseInt(sc.nextLine());
        System.out.println("dame entero 2: ");
        int num_2 = Integer.parseInt(sc.nextLine());

        System.out.println("la fusion de ambos numeros es: " + juntaNumeros(num_1, num_2));

    }
}
