package listas.listas;

import java.util.ArrayList;
import java.util.Scanner;

public class testAlumnoLista1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define la estructura, un array de 5 alumnos pero no crea los objetos
        //Alumno[] aula = new Alumno[5];
        ArrayList<Alumno> clase = new ArrayList<>();

        System.out.println("Cuantos alumnos vas a introducir: ");
        int numero = Integer.parseInt(sc.nextLine());

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota de varios alumno\s.");
        String nombre;
        double nota;
        for (int i = 0; i < numero; i++) {
            Alumno jicho = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            jicho.setNombre(nombre);
            System.out.print("Nota media: ");
            nota = Double.parseDouble(sc.nextLine());
            jicho.setNotaMedia(nota);
        } // for i

        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");
        double suma = 0;
        for (int i = 0; i < clase.size(); i++) {
            Alumno jicha = clase.get(i);
            System.out.println("Alumno " + i);
            System.out.println(jicha.toString());
            suma += jicha.getNotaMedia();
        } // for i

        System.out.println("La media global de la clase es " + suma / clase.size());
    }
}
