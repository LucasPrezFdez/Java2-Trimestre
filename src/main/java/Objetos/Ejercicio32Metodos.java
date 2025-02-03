
package Objetos;

public class Ejercicio32Metodos {

    public static int calculaMayusculas(String cad){

        int contar = 0;

        char[] letras = cad.toCharArray();
        for (char c : letras){
            if (c >= 65 && c <= 90){
                contar++;
            }
        }

        return contar;
    }

    public static int cuentaLetra(String cad,char letra){

        int contador = 0;

        for (int i = 0; i< cad.length(); i++){
            if (cad.charAt(i) == letra){
                contador++;
            }
        }

        return contador;
    }

    public static void sinEspacios(String cad){

        System.out.println("la cadena es: "+cad.replace(" ", ""));
    }

    public static String invertirCadena(String cad){

        String reves="";

        for (int i = cad.length()-1; i>=0;i++){
            reves+=cad.charAt(i);
        }
        return reves;
    }

    public static String invertirString(String cad){
        StringBuilder stringBuilder = new StringBuilder(cad);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {

        String cadena = "Programacion Orientada a Objetos";
        System.out.println("La cadena tiene un total de mayusculas: " + calculaMayusculas(cadena));

        System.out.println("la cadena tiene un total de caracteres 'a': "+cuentaLetra(cadena,'a'));
        System.out.println("la cadena tiene un total de caracteres 'a': "+cuentaLetra(cadena,'z'));

        sinEspacios(cadena);

        System.out.println("cadena al reves: "+invertirCadena(cadena));



    }
}


