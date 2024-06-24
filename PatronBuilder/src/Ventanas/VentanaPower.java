package Ventanas;

public class VentanaPower implements IVentanable{
    @Override
    public DurezaCristal dameDureza() {
        return DurezaCristal.blindado;
    }
}
