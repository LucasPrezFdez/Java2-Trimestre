package Objetos;

public class Propuesto7 {

    static int[] uno;
    static int[] dos;
    static int[] fusion;

    public static int[] generaArray(int pos){
        int[] array = new int[pos];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 99);
        }

        return array;
    }

    public static void fundemeArrays(){
        for (int i = 0; i < uno.length; i++) {
            fusion[i] = uno[i];
        }

        for (int i = 0; i < dos.length; i++) {
            fusion[i + uno.length] = dos[i];
        }
    }

    public static void main(String[] args) {

        uno = generaArray(100);
        dos = generaArray(100);

        fusion = new int[uno.length + dos.length];

        fundemeArrays();

        System.out.println();


    }
}
