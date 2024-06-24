package Vehiculos;

import Puertas.IPortable;
import Ruedas.IRuedable;
import Ventanas.IVentanable;

public class Vehiculo
{
    IPortable PuertaDelanteraDerecha;
    IPortable PuertaDelateraIzquierda;
    IRuedable RuedaDeRepuesto;
    IVentanable VentanillaDerecha;
    IVentanable VentanillaIzquierda;


    public Vehiculo(IPortable puertaDelanteraDerecha, IPortable puertaDelateraIzquierda, IRuedable ruedaDeRepuesto, IVentanable ventanillaDerecha, IVentanable ventanillaIzquierda) {
        PuertaDelanteraDerecha = puertaDelanteraDerecha;
        PuertaDelateraIzquierda = puertaDelateraIzquierda;
        RuedaDeRepuesto = ruedaDeRepuesto;
        VentanillaDerecha = ventanillaDerecha;
        VentanillaIzquierda = ventanillaIzquierda;
    }
}
