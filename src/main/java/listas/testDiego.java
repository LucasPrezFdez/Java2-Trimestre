package listas;

public class testDiego {

    static Diego[] discos;

    public static void creaColeccion() {
        discos = new Diego[100];
    }

    public static void iniciaColeccion() {
        discos[0] = new Diego(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Diego(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Diego(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    }

    public static void visualizarColeccion() {
        for (Diego d : discos) {
            if (d != null)
                System.out.println(d.toString());
        }
    }

    public static void main(String[] args) {

        creaColeccion();
        iniciaColeccion();
        visualizarColeccion();

    }


}
