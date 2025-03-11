package listas;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//crear y mantener una coleccion usando LIST
public class coleccionDiscos implements Serializable {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Disco> discos;

    public static void creaColeccion() {
        discos = new ArrayList<Disco>();
    }

    public static void iniciaColeccion() {
        discos.add(new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46));
        discos.add(new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
    }

    public static void visualizarColeccion() {
        for (Disco d : discos) {
            if (d != null)
                System.out.println(d.toString());
        }
    }

    //no necesito posicion de insercion en la coleccion
    public static void pedirDatos() {
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
        discos.add(new Disco(autorIn, codigoIn, tituloIn,
                generoIn, duracionIn));
    }

    private static void borrarDisco() {

        boolean encontrado = false;
        System.out.println("Por favor, introduzca el CODIGO del disco.");
        System.out.println("Codigo: ");
        String codigoIn = sc.nextLine();

        //metodo de busqueda
        for (Disco d : discos) {

            if (d.getCodigo().equals(codigoIn)) {
                System.out.println("DISCO ENCONTADO");
                //encontrado = true;
                System.out.println(d.toString());

                //ANTES DE BORRAR
                System.out.println("Borrar: (s/n)");
                char respuesta = sc.nextLine().charAt(0);
                if (respuesta == 's') {
                    discos.remove(d);
                    System.out.println("DISCO BORRADO");
                }
                return;
            }
        }
        System.out.println("Codigo no encontrado");
    }

    public static void modificarDisco() {
        boolean esta = false;
        int cont = 0;
        System.out.println("Por favor, introduzca el codigo del disco: ");
        System.out.print("Codigo: ");
        String codigoIn = sc.nextLine();

        for (Disco d : discos) {
            Disco recorrido = discos.get(cont);
            if (d.getCodigo().equals(codigoIn)) {
                System.out.println("Disco encontrado");
                System.out.println(d.toString());
                esta = true;
                modificaDatos(recorrido, cont);
                System.out.println("Disco modificado con éxito");
                break;
            }
            cont++;
        }
        if (!esta)
            System.out.println("Codigo no encontrado");
    }

    private static void modificaDatos(Disco d, int cont) {
        System.out.println("Introduce los datos del disco");
        System.out.print("Codigo: ");
        d.setCodigo(sc.nextLine());
        System.out.print("Autor: ");
        d.setAutor(sc.nextLine());
        System.out.print("Titulo: ");
        d.setTitulo(sc.nextLine());
        System.out.print("Genero: ");
        d.setGenero(sc.nextLine());
        System.out.print("Duracion: ");
        d.setDuracion(Integer.parseInt(sc.nextLine()));
        System.out.println("Disco modificado con exito");
    }

    private static void guardarColeccion() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("misDiscos.bin"))) {
            oos.writeObject(discos);
            System.out.println("Mi coleccion de Discos guardada en archivo bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void cargarColeccion() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("misDiscos.bin"))) {
            discos = (ArrayList<Disco>) ois.readObject();
            System.out.println("Colección de Discos recuperada del archivo");
            for (Disco elemento : discos){
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
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Guardar fichero");
            System.out.println("6. Cargar desde fichero");
            System.out.println("7. Salir");
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
                    pedirDatos();

                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("=========");
                    modificarDisco();
                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    borrarDisco();
                    break;

                case 5:
                    System.out.println("\nGUARDAR COLECCION");
                    System.out.println("======");
                    guardarColeccion(); //esto me guarda el arraylist en fichero
                    break;
                case 6:
                    System.out.println("\nCARGAR COLECCION");
                    System.out.println("======");
                    cargarColeccion(); //esto me carga desde un fichero el arraylist
                    break;
                case 7:
                    System.out.println("ABANDONANDO LA GESTION DE LA COLECCION.....");
                    sc.close();
                    break;

                default:
                    System.out.println("OPCION NO VALIDA");
            }

        } while (opcion != 7);


    }


}
