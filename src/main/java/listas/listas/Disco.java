package listas.listas;

import java.util.Objects;

public class Disco {

    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; //duracion total en minutos

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.autor = autor;
        this.codigo = codigo;
        this.duracion = duracion;
        this.genero = genero;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        String cadena = "-------------------------------";
        cadena += "\nCodigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTitulo: " + this.titulo;
        cadena += "\nGenero: " + this.genero;
        cadena += "\nDuracion: " + this.duracion;
        cadena += "\n-------------------------------";
        return cadena;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return duracion == disco.duracion && Objects.equals(codigo, disco.codigo) && Objects.equals(autor, disco.autor) && Objects.equals(titulo, disco.titulo) && Objects.equals(genero, disco.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, autor, titulo, genero, duracion);
    }
}
