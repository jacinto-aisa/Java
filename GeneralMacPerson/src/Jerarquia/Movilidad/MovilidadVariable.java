package Jerarquia.Movilidad;

public class MovilidadVariable implements IMovil{
    private double movilidad;


    public MovilidadVariable(double movilidad) {
        setMovilidad(movilidad);
    }

    public void setMovilidad(double movilidad) {
        if (movilidad < 0)
            this.movilidad = 0;
        else
            this.movilidad = movilidad;
    }

    @Override
    public double capacidadDeMovimiento() {
        return movilidad;
    }
}
