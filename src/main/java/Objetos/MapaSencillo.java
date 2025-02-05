package Objetos;

import java.util.HashMap;
import java.util.Map;

public class MapaSencillo {

    public static void main(String[] args) {
        // Crear un Map para almacenar los dorsales y nombres de los jugadores
        Map<Integer, String> jugadores = new HashMap<>();

        // Agregar los dorsales y nombres al Map
        jugadores.put(1, "Iván Villar");
        jugadores.put(2, "Carl Starfelt");
        jugadores.put(3, "Óscar Mingueza");
        jugadores.put(5, "Sergio Carreira");
        jugadores.put(6, "Ilaix Moriba");
        jugadores.put(7, "Borja Iglesias");
        jugadores.put(8, "Fran Beltrán");
        jugadores.put(9, "Tasos Douvikas");
        jugadores.put(10, "Iago Aspas");
        jugadores.put(11, "Franco Cervi");
        jugadores.put(12, "Alfon González");
        jugadores.put(13, "Vicente Guaita");
        jugadores.put(14, "Luca de la Torre");
        jugadores.put(15, "Joseph Aidoo");
        jugadores.put(16, "Jailson Marques");
        jugadores.put(17, "Jonathan Bamba");
        jugadores.put(18, "Pablo Durán");
        jugadores.put(19, "Williot Swedberg");
        jugadores.put(20, "Marcos Alonso");
        jugadores.put(21, "Mihailo Ristic");
        jugadores.put(22, "Javier Manquillo");
        jugadores.put(23, "Tadeo Allende");
        jugadores.put(24, "Carlos Domínguez");
        jugadores.put(25, "Damián Rodríguez");
        jugadores.put(30, "Hugo Álvarez");
        jugadores.put(33, "Hugo Sotelo");

        // Mostrar los dorsales y nombres de los jugadores
        System.out.println("Dorsales y nombres del Celta de Vigo (2024/2025):\n");

        for (Map.Entry<Integer, String> pareja : jugadores.entrySet()) {
            System.out.println("Dorsal: " + pareja.getKey() + ", Jugador: " + pareja.getValue());
        }

        int dorsalBuscado = 10;
        String jugador = jugadores.get(dorsalBuscado);
        System.out.println("\nJugador con dorsal " + dorsalBuscado + ": " + jugador);

        int dorsalVerificar = 6;
        if (jugadores.containsKey(dorsalVerificar)) {
            System.out.println("\nEl dorsal " + dorsalVerificar + " pertenece a: " + jugadores.get(dorsalVerificar));
        } else {
            System.out.println("\nEl dorsal " + dorsalVerificar + " no está en el equipo.");
        }

        String nombreVerificar = "Iago Aspas";
        if (jugadores.containsValue(nombreVerificar)) {
            System.out.println("\nEl jugador " + nombreVerificar + " está en el equipo.");
        } else {
            System.out.println("\nEl jugador " + nombreVerificar + " no está en el equipo.");
        }

        int dorsalEliminar = 23;
        String eliminado = jugadores.remove(dorsalEliminar);
        System.out.println("\nJugador eliminado: Dorsal " + dorsalEliminar + ", Nombre: " + eliminado);

        String reemplazo="Fernando Alonso";
        jugadores.replace(1,reemplazo);

        jugadores.put(10,"Alejandro MostoGreip");
        jugadores.put(29,"Marcos Alonso");

        System.out.println(jugadores);

        System.out.println("\nNúmero total de jugadores restantes: " + jugadores.size());

        System.out.println("\nEl mapa esta vacio? " + jugadores.isEmpty());

    }

}