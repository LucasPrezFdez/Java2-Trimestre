package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio15 {

    static Map<Integer, Integer> control = new HashMap<>();

    static final int MESAS = 10;

    public static void inicializaControl() {
        for (int j = 0; j < MESAS; j++) {
            control.put(j + 1, 0);
        }
    }

    public static void verControl() {
        for (Map.Entry<Integer, Integer> par : control.entrySet()) {
            System.out.println("Mesa: " + par.getKey() + " comensales: " + par.getValue());
        }
    }

    public static void sentarComensales(int num) {
        System.out.println("buscando sito para " + num + " comensales");
        for (Map.Entry<Integer, Integer> par : control.entrySet()) {
            if (par.getValue() == 0) {
                int mesa = par.getKey();
                System.out.println("sentar en mesa " + mesa);
                control.put(mesa, num);
                break;
            }
        }
      //  System.out.println("No hay sitio");


    }

    public static void main(String[] args) {

        inicializaControl();
        verControl();

        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Cuantos: ");
            int numero = Integer.parseInt(sc.nextLine());
            sentarComensales(numero);
            verControl();
            System.out.println("pulsa s para seguir");
            String respuesta = sc.nextLine();
            if (!respuesta.equals("s")) {
                salir = true;
            }

        } while (!salir);


    }
}
