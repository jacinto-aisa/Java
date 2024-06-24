package Armamento;

public class MisilXXV implements IDisparable{

    Integer identificador;
    String descripcion;

    public MisilXXV(Integer identificador, String descripcion) {
        this.identificador = identificador;
        this.descripcion = descripcion;
    }

    @Override
    public Integer damePotenciaDeFuego() {
        return 29;
    }
}
