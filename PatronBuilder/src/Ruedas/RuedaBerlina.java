package Ruedas;

import Puertas.TipoDeElemento;

public class RuedaBerlina implements IRuedable{
    @Override
    public TipoDeElemento dameTipo() {
        return TipoDeElemento.Berlina;
    }

    @Override
    public int dameRadio() {
        return 1;
    }
}
