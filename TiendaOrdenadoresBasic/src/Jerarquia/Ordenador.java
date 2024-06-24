package Jerarquia;

import Discos.Disco;
import Discos.IGuardable;
import Memorias.IMenorizable;
import Memorias.Memoria;
import Procesadores.IProcesable;
import Interfaces.IVendible;
import Procesadores.Procesador;

public class Ordenador  implements IVendible {
    IGuardable disco;
    IMenorizable memoria;
    IProcesable procesador;

    private Integer totalCalor = 0;
    private Integer totalPrecio = 0;

    public Ordenador(Disco disco, Memoria memoria, Procesador procesador) {
        if (disco != null) {
            this.disco = disco;
            totalCalor+=disco.getCalor();
            totalPrecio+=disco.getPrecio();
        }
        if (memoria != null) {
            this.memoria = memoria;
            totalCalor+=memoria.getCalor();
            totalPrecio+=memoria.getPrecio();
        }
        if (procesador != null) {
            this.procesador = procesador;
            totalCalor += procesador.getCalor();
            totalPrecio+= procesador.getPrecio();
        }
    }

    @Override
    public int dameCalor() {
        return totalCalor;
    }

    @Override
    public int damePrecio() {
        return totalPrecio;
    }


}
