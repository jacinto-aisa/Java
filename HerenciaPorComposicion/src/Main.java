import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


class Escrito
{
    private String texto;
    private int FechaAnual;

    public Escrito(String texto, int fechaAnual) {
        setTexto(texto);
        setFechaAnual(fechaAnual);
    }

    public Escrito(String texto) {
        setTexto(texto);
        FechaAnual = 2023;
    }

    public Escrito()
    {
        texto = "patata";
        FechaAnual = 2023;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto == "")
            this.texto = "vacio";
        else
            this.texto = texto;
    }

    public int getFechaAnual() {
        return FechaAnual;
    }

    public void setFechaAnual(int fechaAnual) {
        if (fechaAnual > 2023)
            FechaAnual = 2023;
        else
            FechaAnual = fechaAnual;
    }

    @Override
    public String toString() {
        return "Escrito: {" +
                "texto='" + texto + '\'' +
                ", FechaAnual=" + FechaAnual +
                '}';
    }


}
class Editorial
{
    String Editorial;
    int InicioDeActividad;

    public Editorial(String editorial, int inicioDeActividad) {
        Editorial = editorial;
        InicioDeActividad = inicioDeActividad;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "Editorial='" + Editorial + '\'' +
                ", InicioDeActividad=" + InicioDeActividad +
                '}';
    }
}
class EditorialTbo extends Editorial
{
    String tipoDeDibujo;

    public EditorialTbo(String editorial, int inicioDeActividad, String tipoDeDibujo) {
        super(editorial, inicioDeActividad);
        this.tipoDeDibujo = tipoDeDibujo;
    }

    @Override
    public String toString() {
        return "EditorialTbo{" +
                "tipoDeDibujo='" + tipoDeDibujo + '\'' +
                ", Editorial='" + super.toString() +
                '}';
    }
}
class EditorialMultinacional extends Editorial
{
    String pais;

    public EditorialMultinacional(String editorial, int inicioDeActividad, String pais) {
        super(editorial, inicioDeActividad);
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "EditorialMultinacional{" +
                "pais='" + pais + '\'' +
                ", Editorial='" + super.toString()+
                '}';
    }
}
class SinEditorial extends Editorial
{

    public SinEditorial(String editorial, int inicioDeActividad) {
        super(editorial, inicioDeActividad);
    }


    @Override
    public String toString() {
        return "SinEditorial";
    }
}
class EscritoEditorial
{
    Escrito ParteEscrita;
    Editorial Editorial;

    public EscritoEditorial(Escrito escrito, Editorial editorial)
    {
        this.ParteEscrita = escrito;
        this.Editorial = editorial;
    }

    @Override
    public String toString() {
        return ParteEscrita.toString()+Editorial.toString();
    }


}
class EscritoColoquial extends Escrito
{
    String tipografía;


    public EscritoColoquial(String texto, int fechaAnual, String tipografía) {
        super(texto, fechaAnual);
        this.tipografía = tipografía;
    }

    public EscritoColoquial(String texto, String tipografía) {
        super(texto);
        this.tipografía = tipografía;
    }

    public EscritoColoquial(String tipografía) {
        this.tipografía = tipografía;
    }


    @Override
    public String toString() {
        return "EscritoColoquial{" + super.toString()+
                "tipografía='" + tipografía + '\'' +
                '}';
    }
}
class EscritoLegal extends Escrito
{
    String juez;

    public EscritoLegal(String texto, int fechaAnual, String juez) {
        super(texto, fechaAnual);
        this.juez = juez;
    }

    public EscritoLegal(String texto, String juez) {
        super(texto);
        this.juez = juez;
    }

    public EscritoLegal(String juez) {
        this.juez = juez;
    }


    @Override
    public String toString() {
        return super.toString()+
                "EscritoLegal{" +
                "juez='" + juez + '\'' +
                '}';
    }
}

class EscritoAntiguo extends Escrito
{
    int anoEscritura;


    public EscritoAntiguo(String texto, int fechaAnual, int anoEscritura) {
        super(texto, fechaAnual);
        this.anoEscritura = anoEscritura;
    }

    public EscritoAntiguo(String texto, int anoEscritura) {
        super(texto);
        this.anoEscritura = anoEscritura;
    }

    public EscritoAntiguo(int anoEscritura) {
        this.anoEscritura = anoEscritura;
    }


    @Override
    public String toString() {
        return super.toString()+
                "EscritoAntiguo{" +
                "anoEscritura=" + anoEscritura +
                '}';
    }
}




public class Main {
    public static void main(String[] args) {
        EditorialTbo EditorialTbo = new EditorialTbo("Marvel comics", 1952, "plumilla");
        EditorialMultinacional EditorialMulti = new EditorialMultinacional("MultiEditions", 1967, "Francia");
        SinEditorial EditorialNula = new SinEditorial("", 8);

        EscritoLegal ObjetoEscritoLegal = new EscritoLegal("Juez pepe");
        EscritoColoquial EscritoColoquial = new EscritoColoquial("Arial");
        EscritoAntiguo EscritoAntiguo = new EscritoAntiguo(1234);

        EscritoEditorial Comic = new EscritoEditorial(EscritoColoquial,EditorialTbo);
        EscritoEditorial Cuneiforme = new EscritoEditorial(EscritoAntiguo,EditorialNula);
        EscritoEditorial Enciclopedia = new EscritoEditorial(ObjetoEscritoLegal,EditorialMulti);

        ArrayList<EscritoEditorial> Publicaciones = new ArrayList<>();
        Publicaciones.add(Comic);
        Publicaciones.add(Enciclopedia);
        Publicaciones.add(Cuneiforme);

        for (EscritoEditorial Item : Publicaciones) {
            System.out.println(Item);
        }
    }
}