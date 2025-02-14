package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class ejercicio8 {

    public static void main(String[] args) {

        //generamos 80 enteros entre 1 y 10

        Random random = new Random();
        int[] datos = new int[80];
        int cuentaPares = 0;
        int cuentaImpares = 0;

        //llenar el vector con numeros aleatorios entre 0 y 20
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(10) + 1;
        }
        //recorrer el vector e indicar par o impar
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                System.out.println(datos[i] + "\t" + "PAR");
                cuentaPares++;
            } else {
                System.out.println(datos[i] + "\t" + "IMPAR");
                cuentaImpares++;
            }
        }

        System.out.println("Pares = " + cuentaPares);
        System.out.println("Impares = " + cuentaImpares);


        int[] pares = new int[cuentaPares];
        int[] impares = new int[cuentaImpares];

        //reparte datos en cada array o bien va a pares o bien a impares
        for (int j = 0, i = 0, p = 0; j < datos.length; j++) {
            if (datos[j] % 2 == 0) {
                pares[p] = datos[j];
                p++;
            } else {
                impares[i] = datos[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));


    }
}
