public class Arma {
    Integer potenciaDeFuego;
    String descripcion;

    public Arma(Integer potenciaDeFuego, String descripcion) {
        this.potenciaDeFuego = potenciaDeFuego;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "potenciaDeFuego=" + potenciaDeFuego +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
