package cadenas;

import java.util.Scanner;

public class BinarioADecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimal = 0;
        int exp = 0;

        System.out.println("Introduce un número binario: ");
        String binario = sc.nextLine();

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += (int) Math.pow(2, exp);
            }
            exp++;
        }

        System.out.println(decimal);

    }
}
