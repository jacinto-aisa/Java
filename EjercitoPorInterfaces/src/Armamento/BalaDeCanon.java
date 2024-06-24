package Armamento;

public class BalaDeCanon implements IDisparable {
    Integer identificador;
    String descripcion;

    public BalaDeCanon(Integer identificador, String descripcion) {
        this.identificador = identificador;
        this.descripcion = descripcion;
    }

    @Override
    public Integer damePotenciaDeFuego() {
        return 890;
    }


}
