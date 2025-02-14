package PracticasAngel;

import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    String nombre;
    float precio;
    int stock;

    public Producto(String nombre, float precio, int stock) {
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}

public class Product_manager {
    static Scanner sc = new Scanner(System.in);

    private static int mostrarMenu() {
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Salir");
        int opt = sc.nextInt();
        sc.nextLine();
        return opt;
    }

    public static Producto solicitarDatosProducto() {
        System.out.println("Nombre: ");
        String name = sc.nextLine();
        System.out.println("Precio: ");
        float price = sc.nextFloat();
        System.out.println("Stock: ");
        int stk = sc.nextInt();
        return new Producto(name, price, stk);
    }

    public static void mostrarProductosEnConsola(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        while (true) {
            int opt = mostrarMenu();

            if (opt == 1) {
                Producto nuevoProducto = solicitarDatosProducto();
                productos.add(nuevoProducto);
            } else if (opt == 2) {
                mostrarProductosEnConsola(productos);
            } else if (opt == 3) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}