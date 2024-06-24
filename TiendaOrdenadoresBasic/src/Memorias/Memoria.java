package Memorias;
import Interfaces.IComponable;

public class Memoria implements IMenorizable {
    IComponable propiedades;
    public Integer calor;
    public String almacenamiento;

    public Memoria(IComponable comun, Integer calor, String almacenamiento) {
        this.propiedades = comun;
        this.calor = calor;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public Integer getCalor() {
        return calor;
    }

    @Override
    public String getAlmacenamiento() {
        return almacenamiento;
    }


    public Integer getPrecio() {
        return propiedades.getPrecio();
    }
}
