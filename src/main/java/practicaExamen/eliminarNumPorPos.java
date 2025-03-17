package practicaExamen;

import java.util.Arrays;
import java.util.Scanner;

public class eliminarNumPorPos {

    //Leer por teclado una tabla de 10 elementos numéricos enteros y
    //una posición (entre 0 y 9). Eliminar el elemento situado en una
    //posición pedida al usuario sin dejar huecos.



    public static int[] eliminaNumeroPorPosicion(int[] array,int num){
        int aux = 0;
        array[num] = 0;
        for (int i = 0; i < array.length; i++) {
            if (0==array[i]){
                array[i]=array[i+1];
                aux = i+1;
               break;
            }
        }
        for (aux = aux ; aux < array.length; aux++){
            array[aux] = array[aux+1];
        }
        array[array.length-1] = 0;
        int manolo[] = Arrays.copyOf(array,array.length-1);
        return manolo;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("dame numero para la posicion "+i+": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Que posicion quieres eliminar (del 0 al 9): ");
        int num = sc.nextInt();
        eliminaNumeroPorPosicion(array,num);

        System.out.println(Arrays.toString(array));

    }

}
