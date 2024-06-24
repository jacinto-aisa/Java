package Ejercito;

import Armamento.IDisparable;
import Transporte.ITransportable;

public class VehiculoMilitar {
    ITransportable SistemaDeTransporte;
    IDisparable SistemaDeDisparo;

    public VehiculoMilitar(ITransportable sistemaDeTransporte, IDisparable sistemaDeDisparo) {
        SistemaDeTransporte = sistemaDeTransporte;
        SistemaDeDisparo = sistemaDeDisparo;
    }

    public void setSistemaDeTransporte(ITransportable sistemaDeTransporte) {
        SistemaDeTransporte = sistemaDeTransporte;
    }

    @Override
    public String toString() {
        return "VehiculoMilitar{" +
                "SistemaDeTransporte=" + SistemaDeTransporte.transporta() +
                ", SistemaDeDisparo=" + SistemaDeDisparo.damePotenciaDeFuego()+
                '}';
    }

    public void setSistemaDeDisparo(IDisparable sistemaDeDisparo) {
        SistemaDeDisparo = sistemaDeDisparo;
    }
}
