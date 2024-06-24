package Colecciones;

import Jerarquia.IDecorable;
import Jerarquia.IGastable;
import Jerarquia.IPesable;

import java.util.ArrayList;

public class Habitacion implements IColeccionDeDecoracion{
    private ArrayList<IDecorable> elementosDeDecoracion;

    public Habitacion() {
        elementosDeDecoracion = new ArrayList<>();
    }

    public void add(IDecorable elemento)
    {
        elementosDeDecoracion.add(elemento);
    }

    @Override
    public float damePeso() {
        float total = 0;
        for (IDecorable item : elementosDeDecoracion)
        {
            if (item instanceof IPesable) {
                total += ((IPesable) item).damePeso();
            }
        }
        return total;
    }

    @Override
    public float dameImporteTotal() {
        float total = 0;
        for (IDecorable item : elementosDeDecoracion)
        {
            if (item instanceof IGastable) {
                total += ((IGastable) item).dameGasto();
            }
        }
        return total;
    }

    @Override
    public String dameDescripcion() {
        StringBuilder total = new StringBuilder(0);
        for (IDecorable item : elementosDeDecoracion)
        {
            total.append(item.dameTipo()).append("\n");
        }
        return total.toString();
    }
}
