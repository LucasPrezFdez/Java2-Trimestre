package cadenas;

public class ejemplo2 {

    public static void main(String[] args) {

        String cad1 = "Pepe2";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);

        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);

        String cad4 = "CHELO";
        System.out.println(cad4.length());

        String cad5 = "andy";
        String cad6;
        cad6=cad5.concat(" y Lucas ");
        System.out.println(cad6);

        String cad7 = "Emilio";
        String cad8 = " Anaya";
        System.out.println(cad7.toString()+cad8.toString());
        System.out.println(cad7+cad8);



    }
}
