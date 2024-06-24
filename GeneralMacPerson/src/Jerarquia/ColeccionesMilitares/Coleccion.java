package Jerarquia.ColeccionesMilitares;

import Jerarquia.ElementosMilitares.IPreguntasCastrenses;
import Jerarquia.ElementosMilitares.IUnidad;

import java.util.ArrayList;


public class Coleccion implements IColeccionMilitar {
    private ArrayList<IPreguntasCastrenses> tropa;
    private double dineroGastado;
    public Coleccion() {
        tropa = new ArrayList<>();
        this.dineroGastado = 0;
    }

    @Override
    public void add(IUnidad unidad) {
        tropa.add((IPreguntasCastrenses)unidad );
        this.dineroGastado+=((IPreguntasCastrenses)unidad).dineroGastado();
    }

    @Override
    public short numeroDeElementos() {
        return (short) tropa.size();
    }

    @Override
    public double potenciaFuegoTotal() {
        return tropa.stream().parallel().mapToDouble(IPreguntasCastrenses::potenciaFuegoTotal).sum();
    }

    @Override
    public double blindajeTotal() {
        return tropa.stream().mapToDouble(IPreguntasCastrenses::blindajeTotal).sum();    }

    @Override
    public double capacidadDeMovimiento() {
        double total=0;
        for (IPreguntasCastrenses Item : tropa)
        {
            total+=Item.capacidadDeMovimiento();
        }
        return total;
    }

    @Override
    public double dineroGastado() {
        return this.dineroGastado;
    }

    @Override
    public double capacidadMilitar() {
        return (this.potenciaFuegoTotal()*(this.capacidadDeMovimiento()/2))/(100-this.blindajeTotal());

    }
}
