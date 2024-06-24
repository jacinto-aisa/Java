public class VehiculoMilitar {
    Transporte ModoDeTransporte;

    Arma Disparador;


    public VehiculoMilitar(Transporte modoDeTransporte, Arma disparador) {
        ModoDeTransporte = modoDeTransporte;
        Disparador = disparador;
    }

    @Override
    public String toString() {
        return "VehiculoMilitar{" +
                "ModoDeTransporte=" + ModoDeTransporte.toString() +
                ", Disparador=" + Disparador.toString() +
                '}';
    }
}
