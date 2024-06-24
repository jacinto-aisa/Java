import java.util.Comparator;

public class ClasificadorPorAncho implements Comparator<Figura> {
    @Override
    public int compare(Figura o1, Figura o2) {
        if (o1.ancho > o2.ancho)
            return 1;
        else
            return -1;
    }
}
