package Vehiculos;

import Puertas.IPortable;
import Puertas.TipoDeElemento;
import Ruedas.IRuedable;
import Ventanas.DurezaCristal;
import Ventanas.IVentanable;

public class VehiculoBuilder {
    TipoDeElemento tipoDeElemento;
    DurezaCristal dureza;
    private IPortable puertaDelanteraDerecha;
    private IPortable puertaDelateraIzquierda;
    private IRuedable ruedaDeRepuesto;
    private IVentanable ventanillaDerecha;
    private IVentanable ventanillaIzquierda;

    public VehiculoBuilder setPuertaDelanteraDerecha(IPortable puertaDelanteraDerecha) {
        this.puertaDelanteraDerecha = puertaDelanteraDerecha;
        tipoDeElemento = puertaDelanteraDerecha.dameTipo();
        return this;
    }

    public VehiculoBuilder setPuertaDelateraIzquierda(IPortable puertaDelateraIzquierda) {
        this.puertaDelateraIzquierda = puertaDelateraIzquierda;
        if (puertaDelateraIzquierda.dameTipo().equals(puertaDelanteraDerecha.dameTipo()))
            return this;
        else
            return null;
    }

    public VehiculoBuilder setRuedaDeRepuesto(IRuedable ruedaDeRepuesto) {
        if (tipoDeElemento == TipoDeElemento.Deportivo)
        {
            this.ruedaDeRepuesto = ruedaDeRepuesto;
        }

        return this;
    }

    public VehiculoBuilder setVentanillaDerecha(IVentanable ventanillaDerecha) {
        if ((tipoDeElemento == TipoDeElemento.Deportivo) &&
            (ventanillaDerecha.dameDureza() == DurezaCristal.blindado)) {
            this.ventanillaDerecha = ventanillaDerecha;
            return this;
        }
        else
            return null;
    }

    public VehiculoBuilder setVentanillaIzquierda(IVentanable ventanillaIzquierda) {
        this.ventanillaIzquierda = ventanillaIzquierda;
        return this;
    }

    public Vehiculo createVehiculo() {
        return new Vehiculo(puertaDelanteraDerecha, puertaDelateraIzquierda, ruedaDeRepuesto, ventanillaDerecha, ventanillaIzquierda);
    }
}