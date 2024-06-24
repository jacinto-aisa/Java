package Jerarquia;

public class Alfombra implements IDecorable, IPesable{
    @Override
    public String dameTipo() {
        return "Alfombra";
    }

    @Override
    public float damePeso() {
        return 90;
    }
}
