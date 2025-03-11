package listas.listas;

import java.util.Scanner;

public class testAlumno1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define la estructura, un array de 5 alumnos pero no crea los objetos
        Alumno[] aula = new Alumno[5];
        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumno\s.");
        String nombre;
        double nota;
        for (int i = 0; i < 5; i++) {
            aula[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            aula[i].setNombre(nombre);
            System.out.print("Nota media: ");
            nota = Double.parseDouble(sc.nextLine());
            aula[i].setNotaMedia(nota);
        } // for i

        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + aula[i].getNombre());
            System.out.println("Nota media: " + aula[i].getNotaMedia());
            System.out.println("----------------------------");
            suma += aula[i].getNotaMedia();
        } // for i

        System.out.println("La media global de la clase es " + suma / aula.length);
    }

}