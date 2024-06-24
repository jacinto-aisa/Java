package Validadores;

import java.util.Date;

public interface IFechaSpecification {
    boolean isValid(String fecha);
    Date  getFecha() ;
}
