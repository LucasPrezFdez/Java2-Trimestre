package cadenas;

import java.util.Arrays;

public class ejemplo1 {

    public static void main(String[] args) {

        char[] nombre1 = {'p', 'e', 'p', 'e'};
        char[] nombre2 = {112, 101, 112, 101};
        char[] nombre3 = new char[4];

        System.out.println("son nombre 1 y nombre 2 iguales?");
        System.out.println(nombre1.equals(nombre2));

        System.out.println("son nombre 1 y nombre 2 iguales?");
        System.out.println(Arrays.equals(nombre1, nombre2));

        String name1 = new String(nombre1);
        System.out.println("la cadena 1 es: " + name1);

        String name2 = "";

        for (int i = 0; i < nombre2.length; i++) {
            name2 += nombre2[i];
        }

        System.out.println("la cadena 2 es: " + name2);

        for (int i = 0; i < nombre3.length; i++) {
            System.out.print("--" + nombre3[i] + "--");
        }
        System.out.println();

        //name1 y name2
        System.out.println(name1.equals(name2));

        System.out.println(nombre1.hashCode());
        System.out.println(nombre2.hashCode());
        System.out.println(nombre3.hashCode());

        String name3;

        name3=name1;

        System.out.println(name3);

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

    }
}
