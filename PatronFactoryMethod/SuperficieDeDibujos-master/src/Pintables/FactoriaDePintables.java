package Pintables;

public class FactoriaDePintables {
    public IPintables damePintable(TiposPintables tipo)
    {
        switch (tipo)
        {
            case Tinta: return new PintarConTinta();
            case Acuarela: return new PintarConAcuarela();
            case Aerosol: return new PintarConAerosol();
            default: return null;
        }
    }
}
