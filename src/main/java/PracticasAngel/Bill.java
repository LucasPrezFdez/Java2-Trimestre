package PracticasAngel;

import java.security.InvalidParameterException;
import java.util.List;

class Product {
    String nombre;
    float precio;
}

class Calendar {

    public static String getDayOfWeekByNumber(int numberDayOfWeek) {
        if (numberDayOfWeek > 7) throw new InvalidParameterException("el dia de la semana no puede ser mayor que 7");
        if (numberDayOfWeek < 1) throw new InvalidParameterException("el dia de la semana no puede ser menor que 1");
        String[] weeksNames = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        return weeksNames[numberDayOfWeek - 1];
    }

    public class Bill {
        String cod;
        String nombre;
        String direccion;
        String cif;
        String fecha;
        float total;

        List<Product> product;
        public Bill(List<Product> productos){
            this.product = productos;
        }

    }


}