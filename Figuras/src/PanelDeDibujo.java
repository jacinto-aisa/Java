import java.util.ArrayList;
import java.util.Comparator;

public class PanelDeDibujo {
    public ArrayList<Figura> coleccion = new ArrayList<Figura>();

    boolean add(Figura fig)
    {
        if (coleccion.contains(fig))
            return false;
        else {
            coleccion.add(fig);
            return true;
        }
    }



    public void muestra() {
        for (Figura item: coleccion)
        {
            System.out.println(item.toString());
        }
    }
}
