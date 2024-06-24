package Jerarquia.ElementosMilitares;

import Jerarquia.Blindados.IBlindado;
import Jerarquia.Coste.IGastable;
import Jerarquia.Destruccion.IDestructor;
import Jerarquia.Movilidad.IMovil;

public class UnidadMilitar implements IUnidad, IPreguntasCastrenses {
    private TipoArma tipo;
    private IBlindado blindaje;
    private IDestructor destruccion;
    private IMovil transporte;
    private IGastable gasto;

    public UnidadMilitar(TipoArma tipo, IBlindado blindaje, IDestructor destruccion, IMovil transporte, IGastable gasto) {
        this.blindaje = blindaje;
        this.destruccion = destruccion;
        this.transporte = transporte;
        this.gasto = gasto;
        this.tipo = tipo;
    }

    @Override
    public short numeroDeElementos() {
        return 1;
    }

    @Override
    public double potenciaFuegoTotal() {
        return destruccion.capacidadDeDestruccion();
    }

    @Override
    public double blindajeTotal() {
        return blindaje.resistenciaAlAtaque();
    }

    @Override
    public double capacidadDeMovimiento() {
        return transporte.capacidadDeMovimiento();
    }

    @Override
    public double dineroGastado() {
        return gasto.dameCoste();
    }

    @Override
    public double capacidadMilitar() {
        return (this.potenciaFuegoTotal()*(this.capacidadDeMovimiento()/2))/(100-blindaje.resistenciaAlAtaque());
    }
}
