import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Class ElementoDeArte
	Soporte
	Contenido

Class Soporte
	String color.
	Integer: alto.
	Integer: ancho.

Class Contenido
	Integer: Precio
	String: Fragilidad
	String: Descripcion

Class Habitación
	Colección de ElementosDeArte
	Calcular Superficie Total.

Soporte: Rojo, 78, 90
Contenido: 89, Duro, Estatua
Soporte: Negro, 78, 78
Contenido: 10, Frágil, Cuadro
Soporte: Blanco, 89, 78
Contenido: 10,No,Mural

*/
class Contenido
{
    private Integer  precio;
    private String fragilidad;
    private String descripcion;

    public Contenido(Integer precio, String fragilidad, String descripcion) {
        this.precio = precio;
        this.fragilidad = fragilidad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Contenido{" +
                "precio=" + precio +
                ", fragilidad='" + fragilidad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
class Soporte
{
    private String color;
    private Integer alto;
    private Integer ancho;


    public Soporte(String color, Integer alto, Integer ancho) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Soporte{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }

    public Integer getAlto() {
        return alto;
    }

    public Integer getAncho() {
        return ancho;
    }
}
class ElementoDeArte
{
    Soporte SoporteDelArte;
    Contenido ContenidoDeArte;

    public ElementoDeArte(Soporte soporteDelArte, Contenido contenidoDeArte) {
        SoporteDelArte = soporteDelArte;
        ContenidoDeArte = contenidoDeArte;
    }

    @Override
    public String toString()
    {
        String Cadena = "ElementoDeArte{";
        Cadena+=SoporteDelArte.toString()+ContenidoDeArte.toString();
        return Cadena;
    }
}
class Habitacion {
    private ArrayList<ElementoDeArte> Coleccion;
    private Integer SuperficieTotal;

    public Habitacion() {
        Coleccion = new ArrayList<ElementoDeArte>();
        SuperficieTotal = 0;
    }
    public void add(ElementoDeArte item) {
        Coleccion.add(item);
        SuperficieTotal+=item.SoporteDelArte.getAlto()*item.SoporteDelArte.getAncho();
    }


    public Integer getSuperficieTotal() {
        return SuperficieTotal;
    }

    @Override
    public String toString() {
        String Cadena = "Habitacion {";
        for(ElementoDeArte Item : Coleccion) {
            Cadena+=Item.toString()+"\n";
        }
        Cadena+="Supercicie Total = "+getSuperficieTotal();
        return Cadena;
    }
}
class Recibidor extends Habitacion
{
    String tipoPuerta;


    public Recibidor(String tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }

    @Override
    public String toString() {
        return "Recibidor{" +
                "tipoPuerta='" + tipoPuerta + '\'' +
                super.toString() +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        ElementoDeArte EstatuaHorrible = new ElementoDeArte(
                new Soporte("Rojo",78,90),
                new Contenido(89,"Duro","Estatua")
        );
        ElementoDeArte CuadroBonito = new ElementoDeArte(
                new Soporte("Negro",78,89),
                new Contenido(97,"Mucho","Cuadro")
        );
        ElementoDeArte MuralModerno =  new ElementoDeArte(
                new Soporte("Azul",90,90),
                new Contenido(89,"Nada","Mural")
                );
        Habitacion HabitacionHorribleAlaDerecha = new Recibidor("Grises");
        HabitacionHorribleAlaDerecha.add(EstatuaHorrible);
        HabitacionHorribleAlaDerecha.add(CuadroBonito);
        HabitacionHorribleAlaDerecha.add(MuralModerno);

        System.out.println(HabitacionHorribleAlaDerecha);
        }
    }
