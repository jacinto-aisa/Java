package Jerarquia.ElementosMilitares;

public interface IUnidadBuilder {
    IUnidad dameUnidad(TipoArma tipoArma,
                         double blindaje,
                         double destruccion,
                         double movilidad,
                         double coste);

}
