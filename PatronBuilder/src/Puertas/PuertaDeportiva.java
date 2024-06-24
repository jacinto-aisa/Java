package Puertas;

public class PuertaDeportiva implements IPortable{
    @Override
    public TipoDeElemento dameTipo() {
        return TipoDeElemento.Deportivo;
    }
}
