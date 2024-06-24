import Armamento.*;
import Ejercito.Ejercito;
import Ejercito.VehiculoMilitar;
import Ejercito.VehiculoMilitarMultiArma;
import Ejercito.EjercitoSupervivencia;
import Transporte.Barco;
import Transporte.Oruga;
import Transporte.Ruedas;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        BalaDeCanon miBala = new BalaDeCanon(7889,"bala acero");
        Torpedo miTorpedo = new Torpedo(7899,"torpedo rosa");
        BalaDeCanon miBalaTrazadora = new BalaDeCanon(18888,"bala traz");
        MisilXXV miMisil = new MisilXXV(789,"Misil");

        ArrayList<IDisparable> SistemaDeAcosoMultiple = new ArrayList<>();
        SistemaDeAcosoMultiple.add(miBala);
        SistemaDeAcosoMultiple.add(miBalaTrazadora);

        Barco Fragata = new Barco(9899,"fragata",89);
        Oruga TransporteOruga = new Oruga(88,98,"oruga");
        Ruedas CuatroPorCuatro = new Ruedas(8998,"ruedas",89);


        VehiculoMilitar Tanque = new VehiculoMilitar(TransporteOruga,miBala);
        System.out.println(Tanque);
        VehiculoMilitar TanqueAntiaereo = new VehiculoMilitar(TransporteOruga,miMisil);
        VehiculoMilitarMultiArma SuperTanque = new VehiculoMilitarMultiArma(TransporteOruga,miMisil,SistemaDeAcosoMultiple);

        Ejercito MiEjercitoDeTanques = new EjercitoSupervivencia(89);
        MiEjercitoDeTanques.add(Tanque);
        MiEjercitoDeTanques.add(TanqueAntiaereo);
        MiEjercitoDeTanques.add(SuperTanque);

        System.out.println("Potencia = "+ MiEjercitoDeTanques.getPotenciaDeFuego());


        System.out.println("Corazón de Ruedas");
        Tanque.setSistemaDeTransporte(CuatroPorCuatro);

        System.out.println(Tanque);

        System.out.println("Disparo magnificado");
        Tanque.setSistemaDeDisparo(miTorpedo);
        System.out.println(Tanque);

        VehiculoMilitar FragataAtomica = new VehiculoMilitar(Fragata,new Nuclear());
        MiEjercitoDeTanques.add(FragataAtomica);

        System.out.println("Potencia = "+ MiEjercitoDeTanques.getPotenciaDeFuego());




        }
    }
