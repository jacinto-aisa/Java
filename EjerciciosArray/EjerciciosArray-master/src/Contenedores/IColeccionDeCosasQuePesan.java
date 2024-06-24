package Contenedores;

import Contenidos.IPesable;

public interface IColeccionDeCosasQuePesan extends IPesable {
    void add(IPesable elementoASumar);
}
