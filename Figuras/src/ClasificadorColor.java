import java.util.Comparator;

public class ClasificadorColor implements Comparator<Figura> {
    @Override
    public int compare(Figura o1, Figura o2) {
        return o1.Color.compareTo(o2.Color);
    }
}
