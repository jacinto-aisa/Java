package Validadores;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.validator.Validator;
public class ValidadorSpain implements IFechaSpecification {
    String formato = "dd/MM/yyyy";
    private Date fecha;
    @Override
    public boolean isValid(String fecha) {
        DateFormat sdf = new SimpleDateFormat(formato);
        sdf.setLenient(false);
        try {
            this.fecha = sdf.parse(fecha);
        } catch (ParseException e) {
            this.fecha = null;
            return false;
        }
        return true;
    }


    public Date getFecha() {
        return fecha;
    }
}
