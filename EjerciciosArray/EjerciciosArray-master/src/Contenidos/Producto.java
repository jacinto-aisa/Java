package Contenidos;

import Contenidos.IPesable;

public class Producto implements IPesable {
    int id;
    String nombre;

    int peso;

    public Producto(int id, String nombre, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
    }


    @Override
    public int damePeso() {
        return 45;
    }
}
