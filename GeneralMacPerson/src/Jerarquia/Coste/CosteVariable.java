package Jerarquia.Coste;

public class CosteVariable implements IGastable{
    private double coste;

    public CosteVariable(double coste) {
        setCoste(coste);
    }


    public void setCoste(double coste) {
        if (coste < 0)
            this.coste = 0;
        else
            this.coste = coste;
    }

    @Override
    public double dameCoste() {
        return coste;
    }
}
