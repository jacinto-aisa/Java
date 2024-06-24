package Jerarquia.ElementosMilitares;

/*
•	Saber cuantos elementos tiene cada ejercito.
•	Conocer cual es la potencia de fuego total de un ejército.
•	Conocer cual es el blindaje total de un ejército.
•	Saber cual es la capacidad de movimiento de un ejército.
•	Conocer cuanto dinero se lleva gastado.
•	Conocer cual es el CM o capacidad militar de un ejército.

 */
public interface IPreguntasCastrenses extends IUnidad{
    short numeroDeElementos();
    double potenciaFuegoTotal();
    double blindajeTotal();
    double capacidadDeMovimiento();
    double dineroGastado();
    double capacidadMilitar();
}
