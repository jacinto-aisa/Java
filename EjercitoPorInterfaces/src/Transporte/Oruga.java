package Transporte;

public class Oruga implements ITransportable {
    Integer identificador;
    Integer velocidad;
    String descripcion;
    public Oruga() {

    }

    public Oruga(Integer identificador, Integer velocidad, String descripcion) {
        this.identificador = identificador;
        this.velocidad = velocidad;
        this.descripcion = descripcion;
    }

    @Override
    public String transporta() {
        return "Soy una oruga y me muevo a"+velocidad;
    }
}
