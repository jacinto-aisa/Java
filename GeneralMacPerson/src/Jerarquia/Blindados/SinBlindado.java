package Jerarquia.Blindados;

import Jerarquia.Blindados.IBlindado;

public class SinBlindado implements IBlindado {
    @Override
    public double resistenciaAlAtaque() {
        return 0;
    }
}
