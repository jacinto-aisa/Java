import Pintables.*;
import Recortables.*;
import SuperficieDeDibujos.ContenedorDeElementos;
import SuperficieDeDibujos.Elemento;


import java.util.ArrayList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FactoriaDePintables PintaFactory = new FactoriaDePintables();
        IPintables miAcuerala = PintaFactory.damePintable(TiposPintables.Acuarela);
        IPintables miAerosol = PintaFactory.damePintable(TiposPintables.Aerosol);
        IPintables miTinta = PintaFactory.damePintable(TiposPintables.Tinta);

        FactoriaDeRecortables RecorteFactory = new FactoriaDeRecortables();
        IRecortables miAluminio = RecorteFactory.dameRecorte(TiposRecortables.Aluminio);
        IRecortables miMadera= RecorteFactory.dameRecorte(TiposRecortables.Madera);
        IRecortables miPlastico = RecorteFactory.dameRecorte(TiposRecortables.Plastico);

        Elemento aerosolEnMadera = new Elemento(miAerosol, miMadera);
        Elemento tintaEnPlastico = new Elemento(miTinta,miPlastico);
        Elemento acuarelaEnAlumino = new Elemento(miAcuerala, miAluminio);
        Elemento acuarelaEnPlastico = new Elemento(miAcuerala, miPlastico);

        ContenedorDeElementos MiContenedor = new ContenedorDeElementos();
        MiContenedor.add(aerosolEnMadera);
        MiContenedor.add(tintaEnPlastico);
        MiContenedor.add(acuarelaEnAlumino);
        MiContenedor.add(acuarelaEnPlastico);

        System.out.println("total de pintura "+MiContenedor.getTotalDePintura() );
    }
}