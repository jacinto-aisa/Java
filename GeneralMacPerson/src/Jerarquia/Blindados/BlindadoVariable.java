package Jerarquia.Blindados;

import Jerarquia.Blindados.IBlindado;

public class BlindadoVariable implements IBlindado {

    private double blindaje;

    public BlindadoVariable(double blindaje) {
        this.blindaje = blindaje;
    }

    public void setBlindaje(double blindaje) {
        if (blindaje < 0)
            this.blindaje = 0;
        else
            this.blindaje = blindaje;
    }

    @Override
    public double resistenciaAlAtaque() {
        return blindaje;
    }
}
