package cadenas;

public class ejemplo5 {

    public static void main(String[] args) {

        String cad1 = "     MAYKA     ", cad2 = "esto esta en minusculas";
        System.out.println(cad1.trim());

        String cad3 = cad2.toUpperCase();
        System.out.println(cad3.toString());

        String cad4 = "PEDRO ruiz";
        String cad5 = cad4.toLowerCase();
        System.out.println(cad5.toString());

        //ejemplo de replace

        String cad7 = "JUAN SUAREZ";
        String cad8 = cad7.replace('U','O');
        System.out.println(cad8);

        String cad9 = "JUAN CARLOS MORENO";
        System.out.println(cad9.substring(5,11));
        System.out.println(cad1.substring(12));

        //acaba y empieza CON
        String cad11 = "MAYKA MORENO";
        System.out.println(cad11.startsWith("JUAN"));
        System.out.println(cad11.startsWith("MAY"));

        String cad12 = "MARIA AMPARO";
        System.out.println(cad12.endsWith("paro"));
        System.out.println(cad12.endsWith("PARO"));
        System.out.println(cad12.endsWith("ARIA"));



    }
}
