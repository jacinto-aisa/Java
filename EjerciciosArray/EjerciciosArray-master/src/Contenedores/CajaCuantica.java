package Contenedores;

import Contenidos.IPesable;

import java.util.ArrayList;

public class CajaCuantica implements IColeccionDeCosasQuePesan {
    ArrayList<IPesable> contenidoDeCaja = new ArrayList<>();
    @Override
    public void add(IPesable elementoASumar) {
        contenidoDeCaja.add(elementoASumar);
        contenidoDeCaja.add(elementoASumar);
    }
    public int damePeso() {
        int peso = 0;
        for (IPesable elemento : contenidoDeCaja) {
            peso += elemento.damePeso();
        }
        return peso;
    }
}
