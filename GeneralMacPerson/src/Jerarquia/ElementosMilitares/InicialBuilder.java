package Jerarquia.ElementosMilitares;

import Jerarquia.Blindados.BlindadoVariable;
import Jerarquia.Blindados.IBlindado;
import Jerarquia.Blindados.SinBlindado;
import Jerarquia.Coste.CosteVariable;
import Jerarquia.Coste.SinCoste;
import Jerarquia.Destruccion.DestruccionVariable;
import Jerarquia.Destruccion.IDestructor;
import Jerarquia.Destruccion.SinDestruccion;
import Jerarquia.Movilidad.Estatico;
import Jerarquia.Movilidad.IMovil;
import Jerarquia.Movilidad.MovilidadVariable;
import Jerarquia.Coste.IGastable;

public class InicialBuilder implements IUnidadBuilder{
    @Override
    public IUnidad dameUnidad(TipoArma tipoArma, double blindaje, double destruccion, double movilidad, double coste) {
        IBlindado blind;
        if (blindaje == 0)
            blind = new SinBlindado();
        else
            blind = new BlindadoVariable(blindaje);
        IDestructor destructor;
        if (destruccion == 0)
            destructor = new SinDestruccion();
        else
            destructor = new DestruccionVariable(destruccion);
        IMovil movil;
        if (movilidad == 0)
            movil = new Estatico();
        else
            movil = new MovilidadVariable(movilidad);
        IGastable gasto;
        if (coste == 0)
            gasto = new SinCoste();
        else
            gasto = new CosteVariable(coste);
        return new UnidadMilitar(tipoArma,blind,destructor,movil,gasto);



    }
}
