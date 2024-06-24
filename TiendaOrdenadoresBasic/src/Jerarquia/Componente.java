package Jerarquia;

import Interfaces.IComponable;

public class Componente implements IComponable {
    String numeroDeSerie;
    Integer precio = 0;
    String descripcion;

    public Componente(String numeroDeSerie, Integer precio, String descripcion) {
        this.numeroDeSerie = numeroDeSerie;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getPrecio(){
        return precio;
    }
}
