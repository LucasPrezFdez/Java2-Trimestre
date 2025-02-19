package cadenas;

public class PaseParametrosValor {

    public static void main(String[] args) {

        int n = 10;
        System.out.println("en el programa principal: "+n);
        calcular(n);
        System.out.println("en el programa principal: "+n);

    }

    public static void calcular(int x){
        x += 24;
        System.out.println("dentro de la funcion: "+x);
    }
}
