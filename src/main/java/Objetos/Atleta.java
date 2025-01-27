package Objetos;

public class Atleta {

    static int contador = 0;

    int identificador;
    String nombre;
    double tiempo;

    static String seleccion = "Colombia";
    /* Atributo estatico que totaliza los tiempos de cada atleta para obtener el tiempo del equipo */
    static double tiempoEquipo;

    //contructor
    public Atleta(int identificador, String nombre, double tiempo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempo = tiempo;
        //como cuento atletas?
        contador++;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }

    public double getTiempo() {
        return tiempo;
    }

    void correr400metros(){
        tiempoEquipo+=this.getTiempo();
    }


    //GUARDA CADA TIEMPO INDIVIDUAL AÑADIENDOLO A TIEMPO TOTAL
    static void actTimpoEquipo() {

    }

    static void imprimeNombre() {
        System.out.println(seleccion);
    }

    static void imprimeTiempoTotal() {
        System.out.println("Tiempo; " + tiempoEquipo);
    }

    public static void main(String[] args) {
/*
        Atleta atleta1 = new Atleta(1,"Alejandro Perlaza",9.33);
        atleta1.correr400metros();
        System.out.println(atleta1.toString());
        Atleta atleta2 = new Atleta(2,"Anthony Zambrano",9.28);
        atleta2.correr400metros();
        System.out.println(atleta1.toString());
        Atleta atleta3 = new Atleta(3,"Diego Palomeque",9.53);
        atleta3.correr400metros();
        System.out.println(atleta1.toString());
        Atleta atleta4 = new Atleta(4,"Gilmar Herrera",9.29);
        atleta4.correr400metros();
        System.out.println(atleta1.toString());

        System.out.println();
        imprimeNombre();
        imprimeTiempoTotal();

 */

        Atleta[] relevo = {
                new Atleta(1,"Alejandro Perlaza",9.33),
                new Atleta(2,"Anthony Zambrano",9.28),
                new Atleta(3,"Diego Palomeque",9.53),
                new Atleta(4,"Gilmar Herrera",9.29)
        };

        //primer for each que vemos
        for (Atleta atleta : relevo){
            System.out.println(atleta.toString());
        }

        imprimeNombre();
        imprimeTiempoTotal();
    }
}

