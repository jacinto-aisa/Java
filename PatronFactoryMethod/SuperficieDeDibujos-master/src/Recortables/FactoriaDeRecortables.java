package Recortables;

public class FactoriaDeRecortables {
    public IRecortables dameRecorte(TiposRecortables tipo)
    {
        switch(tipo)
        {
            case Aluminio: return new RecortableAluminio();
            case Madera: return new RecortableMadera();
            case Plastico: return new RecortablePlastico();
            default: return null;
        }
    }
}
