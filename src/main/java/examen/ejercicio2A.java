package examen;

import java.util.Scanner;

public class ejercicio2A {

    public static String codificaMensaje(String mensaje) {

        mensaje = mensaje.toUpperCase();
        StringBuilder mensajeSecreto = new StringBuilder();

        for (char c : mensaje.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                if (c == 'Y') {
                    mensajeSecreto.append('A');
                } else if (c == 'Z') {
                    mensajeSecreto.append('B');
                } else {
                    mensajeSecreto.append((char) (c + 2));
                }
            } else if (c >= '0' && c <= '9') {
                if (c == '8') {
                    mensajeSecreto.append('0');
                } else if (c == '9') {
                    mensajeSecreto.append('1');
                } else {
                    mensajeSecreto.append((char) (c + 2));
                }
            } else {
                mensajeSecreto.append(c);
            }
        }


        return mensajeSecreto.toString();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un cadena para codificar: ");

        String mensaje = sc.nextLine();
        System.out.println(codificaMensaje(mensaje));
    }

}
