package Jerarquia.ColeccionesMilitares;

import Jerarquia.ElementosMilitares.IPreguntasCastrenses;
import Jerarquia.ElementosMilitares.IUnidad;

public interface IColeccionMilitar extends IPreguntasCastrenses {
    void add(IUnidad unidad);
}
