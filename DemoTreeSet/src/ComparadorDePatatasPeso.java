import java.util.Comparator;

public class ComparadorDePatatasPeso implements Comparator<Patata> {
    @Override
    public int compare(Patata o1, Patata o2) {
        return o1.peso- o2.peso;
    }
}