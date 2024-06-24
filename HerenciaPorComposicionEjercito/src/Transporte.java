public class Transporte {
    Integer velocidad;
    String descripcion;

    public Transporte(Integer velocidad, String descripcion) {
        this.velocidad = velocidad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "velocidad=" + velocidad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
