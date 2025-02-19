package cadenas;

import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero decimal: ");
        int decimal = sc.nextInt();

        StringBuilder binario = new StringBuilder();

        if (decimal == 0) {
            binario.append("0");
        } else {
            while (decimal > 0) {
                binario.insert(0, decimal % 2);
                decimal /= 2;
            }
        }

        System.out.println("El numero binario equivalente es: "+binario);

    }
}
