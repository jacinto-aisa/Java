import java.util.Comparator;

public class ComparadorPatatasTioMariano implements Comparator<Patata> {
    @Override
    public int compare(Patata o1, Patata o2) {
        return o1.numeroDeCucos - o2.numeroDeCucos;
    }
}
