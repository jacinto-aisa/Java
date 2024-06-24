import java.util.Comparator;

public class ClasificadorPorSuperficie implements Comparator<Figura> {
    @Override
    public int compare(Figura o1, Figura o2) {
        if (o1.ancho*o1.alto > o2.ancho*o2.alto)
            return 1;
        else
            return -1;
    }
}