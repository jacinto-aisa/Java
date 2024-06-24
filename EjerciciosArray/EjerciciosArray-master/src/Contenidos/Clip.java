package Contenidos;

public class Clip implements IPesable
{
    float peso;

    public Clip(float peso) {
        this.peso = peso;
    }

    @Override
    public int damePeso() {
        return 0;
    }
}
