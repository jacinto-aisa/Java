import java.util.Objects;

public class Figura {
    public int alto;
    public int ancho;

    public String Color;


    public Figura(int alto, int ancho, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.Color = color;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", color=" + Color +
                '}';
    }


    @Override
    public boolean equals(Object figu) {
        Figura fig = (Figura)figu;
        if (this.alto * this.ancho == fig.alto * fig.ancho
                && this.Color == fig.Color)
            return true;
        else
            return false;
    }



}
