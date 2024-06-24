package Colecciones;

import Jerarquia.IDecorable;

public interface IColeccionDeDecoracion {
    float dameImporteTotal();
    String dameDescripcion();
    void add(IDecorable elemento);
    float damePeso();

}
