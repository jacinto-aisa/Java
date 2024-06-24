package Contenidos;

import Validadores.IFechaSpecification;
import Validadores.ValidadorSpain;

import java.util.Date;

public class Calendario implements IPesable{
    Date fecha;
    public Calendario(String fecha)
    {
        IFechaSpecification ValidatorSpain = new ValidadorSpain();
        if (ValidatorSpain.isValid(fecha))
        {
            this.fecha = ValidatorSpain.getFecha();
        }
    }
    @Override
    public int damePeso() {
        return 1;
    }
}
