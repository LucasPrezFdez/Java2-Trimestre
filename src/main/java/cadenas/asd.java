package cadenas;

public class asd {

    public static void main(String[] args) {

        int n[] = {8,33,200,250,11};
        int m[] = new int[5];
        muestraArray(n);
        incrementa(n);
        muestraArray(n);

    }

    public static void muestraArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println();
    }

    public static void incrementa(int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }
    }
}
