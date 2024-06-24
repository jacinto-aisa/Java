package Procesadores;

import Interfaces.IComponable;

public class Procesador implements IProcesable {
    IComponable propiedades;

    public Integer calor;
    public Integer cores;

    public Procesador(IComponable propiedades, Integer calor, Integer cores) {
        this.propiedades = propiedades;
        this.calor = calor;
        this.cores = cores;
    }


    @Override
    public Integer getCalor() {
        return calor;
    }

    @Override
    public Integer getCores() {
        return cores;
    }

    public Integer getPrecio() {
        return propiedades.getPrecio();
    }
}
