package Jerarquia.ElementosMilitares;

import Jerarquia.Blindados.BlindadoVariable;
import Jerarquia.Blindados.SinBlindado;
import Jerarquia.Coste.CosteVariable;
import Jerarquia.Destruccion.DestruccionVariable;
import Jerarquia.Destruccion.SinDestruccion;
import Jerarquia.Movilidad.Estatico;
import Jerarquia.Movilidad.MovilidadVariable;

public class FactoriaConBuilder implements IUnidadesFactoryMethod{
    @Override
    public IUnidad dameUnidad(TiposDeUnidades tipo) {
        InicialBuilder build = new InicialBuilder();
        switch (tipo)
        {
            case TransporteMX7899:
                return build.dameUnidad(TipoArma.Caballeria,1.4,0,4.5,4200);
            case TanqueDeAtaqueSombrasVB98:
                return build.dameUnidad(TipoArma.Caballeria,4.8,9.8,7.3,15600);
            case TransporteRapido:
                return build.dameUnidad(TipoArma.Caballeria,0,0,12,1600);
            case InfanteriaBasica:
                return build.dameUnidad(TipoArma.Infanteria,0,7,6,250);
            case Ametrallador:
                return build.dameUnidad(TipoArma.Infanteria,0,10,4,400);
            case Sanitario:
                return build.dameUnidad(TipoArma.Infanteria,5,0,7,500);
            case CanonAntiareo:
                return build.dameUnidad(TipoArma.Artilleria,0,22,1,1100);
            case TorpederoMovil:
                return build.dameUnidad(TipoArma.Artilleria,2,19,3,1300);
            case Canon:
                return build.dameUnidad(TipoArma.Artilleria,0,14,0,1100);
            default:
                return null;

        }
    }
}
