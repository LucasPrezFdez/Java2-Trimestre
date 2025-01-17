package arrays;

import java.util.Objects;

public class Coche {

    int numeroRuedas;
    String marca;
    String modelo;
    int cilindrada;

    public Coche(int numeroRuedas, String marca, String modelo, int cilindrada) {
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "numeroRuedas=" + numeroRuedas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return numeroRuedas == coche.numeroRuedas && cilindrada == coche.cilindrada && Objects.equals(marca, coche.marca) && Objects.equals(modelo, coche.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroRuedas, marca, modelo, cilindrada);
    }

    public static void main(String[] args) {

        Coche zito = new Coche(4, "vitara","chevy",2000);
        System.out.println(zito.toString());

        Coche nillo = new Coche(4,"Seat","Arosa", 45);
        System.out.println(nillo.toString());

        System.out.println(zito.equals(nillo));

        Coche lere = new Coche(4, "Seat","Arosa",50);

    }
}
