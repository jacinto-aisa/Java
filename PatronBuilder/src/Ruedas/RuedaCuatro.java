package Ruedas;

import Puertas.TipoDeElemento;

public class RuedaCuatro implements IRuedable{
    @Override
    public TipoDeElemento dameTipo() {
        return TipoDeElemento.Cuatro;
    }

    @Override
    public int dameRadio() {
        return 2;
    }
}
