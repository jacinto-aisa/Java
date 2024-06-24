package Ejercito;

import Armamento.IDisparable;
import Transporte.ITransportable;

import java.util.ArrayList;

public class VehiculoMilitarMultiArma extends VehiculoMilitar{
    private ArrayList<IDisparable> SistemaArmamentoMultiple;

    public VehiculoMilitarMultiArma(ITransportable sistemaDeTransporte, IDisparable sistemaDeDisparo, ArrayList<IDisparable> sistemaArmamentoMultiple) {
        super(sistemaDeTransporte, sistemaDeDisparo);
        SistemaArmamentoMultiple = sistemaArmamentoMultiple;
    }
}



