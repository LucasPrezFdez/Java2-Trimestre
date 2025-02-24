package listas;

import java.util.Objects;

public class Gato implements Comparable<Gato>{
    private String nombre;
    private String color;
    private String raza;

    public Gato(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nombre, gato.nombre) && Objects.equals(color, gato.color) && Objects.equals(raza, gato.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, color, raza);
    }

    @Override
    public int compareTo(Gato o) {
        return this.nombre.compareTo(o.nombre);
    }
}
