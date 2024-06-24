// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Punto de Vista: Militar

Class VehiculoMilitar
	Transporte TransporteVehiculo
	Arma ArmaVehiculo

Class Transporte
	Integer velocidad;
	String descripcion;

Class Arma
	Integer potenciaDeFuego;
	String: descripcion;

Class Ejercito
	ArrayList<VehiculoMilitar> Flota;
	void add (VehiculoMilitar);
	Integer PotenciaDeFuego();

Implementación:
	Crear un ejercito.
	Crear tres Vehiculos.
		Tanque:
			Transporte: 78,"Oruga"
			Arma: 96,"Cañon"
		Antiereo:
			Transporte: 53,"Oruga"
			Arma: 98,"Metralleta"
		Submarino:
			Transporte: 40,"Helices"
			Arma: 198,"Torpedo"
*/

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        /*
        String Texto = "jhashasah  suahsua uhsuahsa uhsuahsua ";
        String[] Palabras = Texto.split("[ ,.();]");
        Palabras.length();
        */

        Transporte Oruga = new Transporte(19,"Orugas");
        Transporte SubMarino = new Transporte(19,"Subnarino");
        Transporte Avion = new Transporte(19,"Avion");

        Arma Torpedo = new Arma(677,"Torpedo");
        Arma Obus = new Arma(67,"Obus");
        Arma Misil = new Arma(67,"Misil");

        VehiculoMilitar TanqueSherman = new VehiculoMilitar(
                Oruga,Misil
        );
        VehiculoMilitar TanqueDelCarro = new VehiculoMilitar(
                Oruga,Obus
        );
        VehiculoMilitar AvionAntiSubmarinos = new VehiculoMilitar(
                Avion,Torpedo
        );
        VehiculoMilitar SubMarinoAntiAviones = new VehiculoMilitar(
                SubMarino,Misil
        );
        Ejercito MiEjercitoDeEuropa = new Ejercito();
        MiEjercitoDeEuropa.add(TanqueSherman);
        MiEjercitoDeEuropa.add(TanqueDelCarro);
        MiEjercitoDeEuropa.add(AvionAntiSubmarinos);
        MiEjercitoDeEuropa.add(SubMarinoAntiAviones);

        Ejercito MiEjercitoDeAsia = new Ejercito();
        MiEjercitoDeAsia.add(TanqueSherman);

        System.out.println(MiEjercitoDeEuropa);
        System.out.println("Potencia = "+ MiEjercitoDeEuropa.getPotenciaDeFuego());
    }
}