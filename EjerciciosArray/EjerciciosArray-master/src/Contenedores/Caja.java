package Contenedores;

import Contenidos.IPesable;

import java.util.ArrayList;





public class Caja implements IColeccionDeCosasQuePesan
{
    ArrayList<IPesable> contenidoDeCaja;

    public Caja()
    {
        contenidoDeCaja = new ArrayList<>();
    }

    public void add(IPesable elementoASumar)
    {
        contenidoDeCaja.add(elementoASumar);
    }

    @Override
    public int damePeso() {
        int peso = 0;
        for (IPesable elemento : contenidoDeCaja) {
            peso += elemento.damePeso();
        }
        return peso;
    }
}