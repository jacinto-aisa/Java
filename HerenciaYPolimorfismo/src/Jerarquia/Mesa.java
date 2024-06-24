package Jerarquia;

public class Mesa implements IDecorable, IGastable, IPesable{
    @Override
    public String dameTipo() {
        return "Mesa";
    }

    @Override
    public float dameGasto() {
        return 29;
    }

    @Override
    public float damePeso() {
        return 20;
    }
}
