package examen;

public class ejercicio5A {


    public static void main(String[] args) {
        String mensaje = "2w4r5f";
        StringBuilder cadenaFinal = new StringBuilder();
        for (int j = 0; j < mensaje.length(); j++) {
            char aux = mensaje.charAt(j);
            if (aux >= '0' && aux <= '9') {


                int num = Integer.parseInt(String.valueOf(aux));
                for (int i = 0; i < num; i++) {
                    cadenaFinal.append(mensaje.charAt(j + 1));
                }
                j++;
            }
        }
        System.out.println(cadenaFinal);
    }
}
