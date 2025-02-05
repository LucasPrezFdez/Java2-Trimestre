package Objetos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase Jugador
public 	class Jugador {
    private int dorsal;
    private String nombre;

    public Jugador(int dorsal, String nombre) {
        this.dorsal = dorsal;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    public static void main(String[] args) {
        // Crear un Map con los dorsales y nombres de los jugadores
        Map<Integer, String> jugadoresMap = new HashMap<>();
        jugadoresMap.put(1, "Iván Villar");
        jugadoresMap.put(2, "Hugo Mallo");
        jugadoresMap.put(6, "Denis Suárez");
        jugadoresMap.put(7, "Carles Pérez");
        jugadoresMap.put(10, "Iago Aspas");
        jugadoresMap.put(23, "Luca de la Torre");

        // Convertir el Map en un ArrayList de objetos Jugador
        List<Jugador> jugadoresList = new ArrayList<>();
        for (Map.Entry<Integer, String> pareja : jugadoresMap.entrySet()) {
            int dorsal = pareja.getKey();
            String nombre = pareja.getValue();
            jugadoresList.add(new Jugador(dorsal, nombre));
        }

        // Mostrar la lista de jugadores
        System.out.println("Lista de jugadores:");
        for (Jugador jugador : jugadoresList) {
            System.out.println(jugador);
        }
    }
}