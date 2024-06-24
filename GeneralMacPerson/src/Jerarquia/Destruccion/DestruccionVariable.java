package Jerarquia.Destruccion;

public class DestruccionVariable implements IDestructor{
    private double destruccion;

    public DestruccionVariable(double destruccion) {
        setDestruccion(destruccion);
    }

    public void setDestruccion(double destruccion) {
        if (destruccion < 0)
            destruccion = 0;
        else
            this.destruccion = destruccion;
    }

    @Override
    public double capacidadDeDestruccion() {
        return destruccion;
    }
}
