package Armamento;

public class Torpedo implements IDisparable{
    Integer identificador;
    String descripcion;

    public Torpedo(Integer identificador, String descripcion) {
        this.identificador = identificador;
        this.descripcion = descripcion;
    }

    @Override
    public Integer damePotenciaDeFuego() {
        return 987;
    }
}
