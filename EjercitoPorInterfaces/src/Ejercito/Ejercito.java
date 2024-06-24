package Ejercito;

import java.util.ArrayList;

public class Ejercito {
    private ArrayList<VehiculoMilitar> Tropa;
    private Integer potenciaDeFuego;
    private Integer coste;

    public Ejercito() {
        Tropa = new ArrayList<VehiculoMilitar>();
        potenciaDeFuego = 0;
    }
    public void add(VehiculoMilitar Vehiculo)
    {

        Tropa.add(Vehiculo);
        this.potenciaDeFuego += Vehiculo.SistemaDeDisparo.damePotenciaDeFuego();

    }

    public Integer getPotenciaDeFuego() {
        return potenciaDeFuego;
    }
}
