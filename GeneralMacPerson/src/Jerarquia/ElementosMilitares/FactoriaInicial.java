package Jerarquia.ElementosMilitares;

import Jerarquia.Blindados.BlindadoVariable;
import Jerarquia.Blindados.SinBlindado;
import Jerarquia.Coste.CosteVariable;
import Jerarquia.Destruccion.DestruccionVariable;
import Jerarquia.Destruccion.SinDestruccion;
import Jerarquia.Movilidad.Estatico;
import Jerarquia.Movilidad.MovilidadVariable;

public class FactoriaInicial implements IUnidadesFactoryMethod{
    @Override
    public IUnidad dameUnidad(TiposDeUnidades tipo) {
        switch (tipo)
        {
            case TransporteMX7899:
                return new UnidadMilitar(
                        TipoArma.Caballeria,
                        new BlindadoVariable(1.4),
                        new SinDestruccion(),
                        new MovilidadVariable(4.5),
                        new CosteVariable(4200));
            case TanqueDeAtaqueSombrasVB98:
                return new UnidadMilitar(
                        TipoArma.Caballeria,
                        new BlindadoVariable(4.8),
                        new DestruccionVariable(9.8),
                        new MovilidadVariable(7.3),
                        new CosteVariable(15600));
            case TransporteRapido:
                return new UnidadMilitar(
                        TipoArma.Caballeria,
                        new SinBlindado(),
                        new SinDestruccion(),
                        new MovilidadVariable(12),
                        new CosteVariable(1600));
            case InfanteriaBasica:
                return new UnidadMilitar(
                        TipoArma.Infanteria,
                        new SinBlindado(),
                        new DestruccionVariable(7),
                        new MovilidadVariable(6),
                        new CosteVariable(250));
            case Ametrallador:
                return new UnidadMilitar(
                        TipoArma.Infanteria,
                        new SinBlindado(),
                        new DestruccionVariable(10),
                        new MovilidadVariable(4),
                        new CosteVariable(400));
            case Sanitario:
                return new UnidadMilitar(
                        TipoArma.Infanteria,
                        new BlindadoVariable(5),
                        new SinDestruccion(),
                        new MovilidadVariable(7),
                        new CosteVariable(500));
            case CanonAntiareo:
                return new UnidadMilitar(
                        TipoArma.Artilleria,
                        new SinBlindado(),
                        new DestruccionVariable(22),
                        new MovilidadVariable(1),
                        new CosteVariable(1100));
            case TorpederoMovil:
                return new UnidadMilitar(
                        TipoArma.Artilleria,
                        new BlindadoVariable(2),
                        new DestruccionVariable(19),
                        new MovilidadVariable(3),
                        new CosteVariable(1300));
            case Canon:
                return new UnidadMilitar(
                        TipoArma.Artilleria,
                        new SinBlindado(),
                        new DestruccionVariable(14),
                        new Estatico(),
                        new CosteVariable(1100));
            default:
                return null;

        }
    }
}
