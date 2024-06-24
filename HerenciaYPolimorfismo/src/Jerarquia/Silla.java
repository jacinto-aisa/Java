package Jerarquia;

public class Silla implements IDecorable, IGastable, IPesable{
    @Override
    public String dameTipo() {
        return "Silla";
    }

    @Override
    public float dameGasto() {
        return 19;
    }

    @Override
    public float damePeso() {
        return 5;
    }
}
