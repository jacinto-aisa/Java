import org.w3c.dom.css.Rect;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Figura Cuadrado = new Figura(9,9, "rojo");
        Figura Rectangulo = new Figura(10,9, "azul");
        Figura Rombo = new Figura(9,10,"azul");
        System.out.println(Cuadrado);
        if (Cuadrado.equals(Rectangulo)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Diferentes");
        }
        PanelDeDibujo panelJacinto = new PanelDeDibujo();
        System.out.println(Cuadrado.toString() +panelJacinto.add(Cuadrado));
        System.out.println(Rectangulo.toString() +panelJacinto.add(Rectangulo));
        System.out.println(Rombo.toString() +panelJacinto.add(Rombo));

        System.out.println("Por Color");
        panelJacinto.coleccion.sort(new ClasificadorColor());
        panelJacinto.muestra();

        System.out.println("Por Ancho");
        panelJacinto.coleccion.sort(new ClasificadorPorAncho());
        panelJacinto.muestra();

        System.out.println("Por Superficie");
        panelJacinto.coleccion.sort(new ClasificadorPorSuperficie());
        panelJacinto.muestra();


    }
    }

