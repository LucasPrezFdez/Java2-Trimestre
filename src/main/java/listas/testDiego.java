package listas;

import java.util.Scanner;

public class testDiego {

    static Scanner sc = new Scanner(System.in);


    static Diego[] discos;

    public static void creaColeccion() {
        discos = new Diego[100];
    }

    public static void iniciaColeccion() {
        discos[0] = new Diego(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Diego(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Diego(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    }

    public static void visualizarColeccion() {
        for (Diego d : discos) {
            if (d != null)
                System.out.println(d.toString());
        }
    }

    public static void insetaDisco() {

        int contador = 0;
        for (Diego d : discos) {
            if (d != null) {
                contador++;
            } else {
                System.out.println("INDICE LIBRE: " + contador);
                break;
            }
        }
        pedirDatos(contador);
    }

    public static void pedirDatos(int contador) {
        System.out.println("Por favor, introduzca los datos del disco.");
        System.out.print("Código: ");
        String autorIn = sc.nextLine();
        System.out.print("Título: ");
        String codigoIn = sc.nextLine();
        System.out.print("Autor: ");
        String tituloIn = sc.nextLine();
        System.out.print("Género: ");
        String generoIn = sc.nextLine();
        System.out.print("Duración: ");
        int duracionIn = Integer.parseInt(sc.nextLine());
        discos[contador] = new Diego(autorIn, codigoIn, tituloIn,
                generoIn, duracionIn);
    }

    public static Diego buscarDisco() {

        Diego encontrado = null;

        System.out.println("Por favor, introduzca el CODIGO del disco.");
        System.out.println("Codigo: ");
        String codigoIn = sc.nextLine();

        //metodo de busqueda
        for (int j = 0; j < discos.length; j++) {
            Diego recorrido = discos[j];
            if (recorrido != null && recorrido.getCodigo().equals(codigoIn)) {
                System.out.println("DISCO ENCONTADO");
                System.out.println(recorrido.toString());
                encontrado = recorrido;
                return encontrado;
            }
        }

        System.out.println("CODIGO NO ENCONTRADO");
        return encontrado;
    }

    private static void borrarDisco() {

        boolean encontrado = false;
        System.out.println("Por favor, introduzca el CODIGO del disco.");
        System.out.println("Codigo: ");
        String codigoIn = sc.nextLine();

        //metodo de busqueda
        for (int j = 0; j < discos.length; j++) {

            if (discos[j] != null && discos[j].getCodigo().equals(codigoIn)) {
                System.out.println("DISCO ENCONTADO");
                encontrado = true;
                System.out.println(discos[j].toString());
                discos[j] = null;
                System.out.println("DISCO BORRADO");
            }
            if (!encontrado)
                System.out.println("DISCO NO ENCONTRADO");
        }
    }

    private static void modificarDisco() {

        Diego encontado = null;
        boolean esta = false;
        System.out.println("Por favor, introduzca el CODIGO del disco.");
        System.out.println("Codigo: ");
        String codigoIn = sc.nextLine();

        //metodo de busqueda
        for (int j = 0; j < discos.length; j++) {

            if (discos[j] != null && discos[j].getCodigo().equals(codigoIn)) {
                System.out.println("DISCO ENCONTADO");
                System.out.println(discos[j].toString());
                encontado = discos[j];
                esta = true;
                modificaDatos(encontado,j);
                System.out.println("DISCO MODIFICADO");
            }

        }

    }

    private static void modificaDatos(Diego d, int j) {

        System.out.println("Por favor, introduzca los datos del disco.");
        System.out.print("Código: ");
        String autorIn = sc.nextLine();
        System.out.print("Título: ");
        String codigoIn = sc.nextLine();
        System.out.print("Autor: ");
        String tituloIn = sc.nextLine();
        System.out.print("Género: ");
        String generoIn = sc.nextLine();
        System.out.print("Duración: ");
        int duracionIn = Integer.parseInt(sc.nextLine());

        discos[j] = new Diego(autorIn, codigoIn, tituloIn,
                generoIn, duracionIn);
    }

    public static void main(String[] args) throws NullPointerException {

        creaColeccion();
        iniciaColeccion();
        visualizarColeccion();

        int opcion = 0;

        do {
            System.out.println("\nCOLECCION DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.println("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    visualizarColeccion();

                    break;

                case 2:
                    System.out.println("\nDISCO NUEVO");
                    System.out.println("===========");
                    insetaDisco();

                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("=========");
                    buscarDisco();
                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    borrarDisco();
                    break;

                case 5:
                    System.out.println("ABANDONANDO LA GESTION DE LA COLECCION.....");

                    break;

                default:
                    System.out.println("OPCION NO VALIDA");
            }

        } while (opcion != 5);


    }


}
