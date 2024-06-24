import java.util.ArrayList;

public class Ejercito
{
    ArrayList<VehiculoMilitar> Tropa;

    private Integer potenciaDeFuego;


    public Ejercito() {
        Tropa = new ArrayList<>();
        potenciaDeFuego = 0;
    }

    public void add(VehiculoMilitar vehiculo)
    {
        Tropa.add(vehiculo);
        potenciaDeFuego+=vehiculo.Disparador.potenciaDeFuego;
    }

    @Override
    public String toString() {
        String Cadena = "";
        for(VehiculoMilitar Item : Tropa)
        {
            Cadena+=Item.toString()+"\n";
        }
        return Cadena;
    }

    public Integer getPotenciaDeFuego() {
        return potenciaDeFuego;
    }
}
