package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] datos = new int[100];

        for (int i=0; i< datos.length; i++){
            datos[i] = random.nextInt(20);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("dime un entero para SALIR: ");
        int salir = sc.nextInt();
        System.out.println("dime un entero para ENTRAR(>20): ");
        int entrar = sc.nextInt();

        //recorrido completo
        for (int i = 0; i< datos.length; i++){
            if (datos[i] == salir){
                datos[i] = entrar;
            }
        }

        //recorrer el vector y los cuadros y cubos a mostrar
        for (int i = 0; i< datos.length; i++){
            if (datos[i] == entrar){
                System.out.println(datos[i]+ "\t" + "ENTRAR");
            } else {
                System.out.println(datos[i]);
            }
        }




    }
}
