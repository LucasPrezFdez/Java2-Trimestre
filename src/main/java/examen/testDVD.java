package examen;

import listas.Disco;
import listas.Gato;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class testDVD {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<DVD> dvds;

    public static void creaColeccion() {
        dvds = new ArrayList<DVD>();
    }

    public static void iniciaColeccion() {
        dvds.add(new DVD(
                "Avengers", "Wim Mertens", 2010, " accion"));
        dvds.add(new DVD(
                "Iron Man", "Manolo", 2005, "accion"));
    }

    public static void visualizarColeccion() {
        for (DVD d : dvds) {
            if (d != null)
                System.out.println(d.toString());
        }
    }

    public static void visualizarColeccionPorAño() {
        //camada.sort((g1, g2 )-> g1.getNombre().compareTo(g2.getNombre()));
        ArrayList<DVD> años;
        años = dvds;
        años.sort(Comparator.comparing(DVD::getAnio));
        System.out.println("\nGatos ordenados por Año: ");
        for (DVD d : años) {
            if (d != null)
                System.out.println(d.toString());
        }
    }

    //no necesito posicion de insercion en la coleccion
    public static void nuevoDVD() {
        System.out.println("Por favor, introduzca los datos del DVD.");
        System.out.print("Titulo: ");
        String tituloIn = sc.nextLine();
        System.out.print("Director: ");
        String directorIn = sc.nextLine();
        System.out.print("Año: ");
        int anioIn = Integer.parseInt(sc.nextLine());
        System.out.print("Género: ");
        String generoIn = sc.nextLine();

        dvds.add(new DVD(tituloIn, directorIn, anioIn,
                generoIn));
    }

    public static void buscarPorTitulo() {
        System.out.println("Por favor, introduzca el TITULO del DVD.");
        System.out.println("Titulo: ");
        String tituloIn = sc.nextLine();

        //metodo de busqueda
        for (DVD d : dvds) {

            if (d.getTitulo().equals(tituloIn)) {
                System.out.println("DVD ENCONTADO");
                //encontrado = true;
                System.out.println(d.toString());
            }
        }
    }

    private static void borrarDVD() {

        boolean encontrado = false;
        System.out.println("Por favor, introduzca el TITULO del DVD.");
        System.out.println("Titulo: ");
        String tituloIn = sc.nextLine();

        //metodo de busqueda
        for (DVD d : dvds) {

            if (d.getTitulo().equals(tituloIn)) {
                System.out.println("DVD ENCONTADO");
                //encontrado = true;
                System.out.println(d.toString());

                //ANTES DE BORRAR
                System.out.println("Borrar: (s/n)");
                char respuesta = sc.nextLine().charAt(0);
                if (respuesta == 's') {
                    dvds.remove(d);
                    System.out.println("DVD BORRADO");
                }
                return;
            }
        }
        System.out.println("Titulo no encontrado");
    }


    private static void guardarColeccion() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("misDiscos.bin"))) {
            oos.writeObject(dvds);
            System.out.println("Mi coleccion de Discos guardada en archivo bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void cargarColeccion() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("misDiscos.bin"))) {
            dvds = (ArrayList<DVD>) ois.readObject();
            System.out.println("Colección de Discos recuperada del archivo");
            for (DVD elemento : dvds) {
                System.out.println(elemento);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NullPointerException {

        creaColeccion();
        iniciaColeccion();
        visualizarColeccion();

        int opcion = 0;

        do {
            System.out.println("\nCOLECCION DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Nuevo DVD");
            System.out.println("2. Listado");
            System.out.println("3. Buscar por titulo");
            System.out.println("4. Borrar por titulo");
            System.out.println("5. Ordenar por año (visual)");
            System.out.println("6. Guardar fichero");
            System.out.println("7. Cargar desde fichero");
            System.out.println("8. Salir");
            System.out.println("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nNUEVO DVD");
                    System.out.println("=======");
                    nuevoDVD();

                    break;

                case 2:
                    System.out.println("\nLISTADO");
                    System.out.println("===========");
                    visualizarColeccion();

                    break;

                case 3:
                    System.out.println("\nBUSCAR POR TITULO");
                    System.out.println("=========");
                    buscarPorTitulo();
                    break;

                case 4:
                    System.out.println("\nBORRAR POR TITULO");
                    System.out.println("======");
                    borrarDVD();
                    break;

                case 5:
                    System.out.println("\nORDENAR POR AÑO");
                    System.out.println("======");
                    visualizarColeccionPorAño();
                    break;
                case 6:
                    System.out.println("\nGUARDAR COLECCION");
                    System.out.println("======");
                    guardarColeccion(); //esto me guarda el arraylist en fichero
                    break;

                case 7:
                    System.out.println("\nCARGAR COLECCION");
                    System.out.println("======");
                    cargarColeccion(); //esto me carga desde un fichero el arraylist
                    break;

                case 8:
                    System.out.println("ABANDONANDO LA GESTION DE LA COLECCION.....");
                    sc.close();
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }

        } while (opcion != 8);


    }


}


