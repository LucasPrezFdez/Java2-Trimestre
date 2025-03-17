package practicaExamen;

public class ejercicio5B {

    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.split(" ");
        return palabras.length;
    }

    public static String invertirPalabras(String cadena) {

        String[] palabras = cadena.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i > 0) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena = "Esta es una cadena de ejemplo";
        int numeroDePalabras = contarPalabras(cadena);
        String cadenaInvertida = invertirPalabras(cadena);

        System.out.println("Número de palabras: " + numeroDePalabras);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}