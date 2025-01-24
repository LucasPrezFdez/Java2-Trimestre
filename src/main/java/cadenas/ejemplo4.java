package cadenas;

public class ejemplo4 {

    public static void main(String[] args) {

        String cad1 = "EMMA";
        String cad2 = new String ("EMMA");

        System.out.println("usamos equals");
        if (cad1.equals(cad2))
            System.out.println("SON IGUALES");
        else
            System.out.println("SON DIFERENTES");

        System.out.println("usando el operador == ");
        if (cad1==cad2)
            System.out.println("SON IGUALES");
        else
            System.out.println("SON DIFERENTES");

        cad2=cad1;

        System.out.println("misma referencia");


    }
}
