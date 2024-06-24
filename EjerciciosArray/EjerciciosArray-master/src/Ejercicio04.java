import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio04
{
    ArrayList<String> cadenas;

    public Ejercicio04() {
        cadenas = new ArrayList<>();
    }

    public void add(String cadena)
    {
        cadenas.add(cadena);
    }

    public String dameCadenaMasLarga()
    {
        int longCadena = 0;
        String textoMasLargo = "";
        for(String elemento : cadenas)
        {
            if (elemento.length() > longCadena)
            {
                longCadena = elemento.length();
                textoMasLargo = elemento;
            }
        }
        return textoMasLargo;
    }

    public ArrayList<String> DividirEnFrases(String fraseCompleta)
    {
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.addAll(Arrays.asList(fraseCompleta.split("[.,:;]")));
        return cadenas;

    }

}
