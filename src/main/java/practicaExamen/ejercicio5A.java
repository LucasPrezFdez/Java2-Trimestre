package practicaExamen;

public class ejercicio5A {


    public static String intercalarCadenas(String cadena1, String cadena2) {
        StringBuilder resultado = new StringBuilder();
        int maxLength = Math.max(cadena1.length(), cadena2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < cadena1.length()) {
                resultado.append(cadena1.charAt(i));
            }
            if (i < cadena2.length()) {
                resultado.append(cadena2.charAt(i));
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena1 = "abc";
        String cadena2 = "12345";
        String resultado = intercalarCadenas(cadena1, cadena2);
        System.out.println("Cadena intercalada: " + resultado);
    }
}

