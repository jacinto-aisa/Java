package Transporte;

public class Barco implements ITransportable {
    Integer identificador;
    String descripcion;
    Integer nudosPorHora;

    public Barco(Integer identificador, String descripcion, Integer nudosPorHora) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.nudosPorHora = nudosPorHora;
    }

    @Override
    public String transporta() {
        return "Soy una barco que voy a "+ nudosPorHora + "nudos";
    }
}
