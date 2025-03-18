package examen;

// Clase DVD para representar cada DVD en la colección
class DVD {
    private String titulo;
    private String director;
    private int anio;
    private String genero;

    public DVD(String titulo, String director, int anio, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
        cadena += "\nTitulo: " + this.titulo;
        cadena += "\nDirector: " + this.director;
        cadena += "\nAño: " + this.anio;
        cadena += "\nGenero: " + this.genero;
        cadena += "\n-------------------------------";
        return cadena;
    }
}
