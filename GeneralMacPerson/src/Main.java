import Jerarquia.ColeccionesMilitares.Coleccion;
import Jerarquia.ColeccionesMilitares.IColeccionMilitar;
import Jerarquia.ElementosMilitares.FactoriaConBuilder;
import Jerarquia.ElementosMilitares.FactoriaInicial;
import Jerarquia.ElementosMilitares.IUnidadesFactoryMethod;
import Jerarquia.ElementosMilitares.TiposDeUnidades;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IUnidadesFactoryMethod Factoria = new FactoriaConBuilder();
        IColeccionMilitar Ejercito = new Coleccion();
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.Ametrallador));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.Canon));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.Sanitario));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.CanonAntiareo));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.InfanteriaBasica));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.TanqueDeAtaqueSombrasVB98));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.TorpederoMovil));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.TransporteMX7899));
        Ejercito.add(Factoria.dameUnidad(TiposDeUnidades.TransporteRapido));

        System.out.println("Blindaje: "+Ejercito.blindajeTotal());
        System.out.println("Potencia: "+Ejercito.potenciaFuegoTotal());
        System.out.println("Movimiento: "+Ejercito.capacidadDeMovimiento());
        System.out.println("Coste:" +Ejercito.dineroGastado());
        System.out.println("Numero de unidades:" +Ejercito.numeroDeElementos());
        System.out.println("CM:" +Ejercito.capacidadMilitar());

    }
}