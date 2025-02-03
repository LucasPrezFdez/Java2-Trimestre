package Objetos;

public class encuentraCaracteres {

    public static void main(String[] args) {

        String ezequiel = "lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. " +
                "Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor." +
                " Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi." +
                " Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat." +
                " Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue." +
                " Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede." +
                " Praesent blandit odio eu enim. Pellentesque sed d";

        int pos = ezequiel.indexOf("c");
        System.out.println("encontrado en: "+pos);

        int ultPos = ezequiel.lastIndexOf("c");
        System.out.println("ultima posicion: "+ultPos);


    }
}
