package Transporte;

public class Ruedas implements ITransportable {
    Integer Identificador;
    String descripcion;
    Integer velocidad;

    public Ruedas(Integer identificador, String descripcion, Integer velocidad) {
        Identificador = identificador;
        this.descripcion = descripcion;
        this.velocidad = velocidad;
    }

    @Override
    public String transporta() {
        return "Soy unas ruedas y voy a "+velocidad;
    }
}
