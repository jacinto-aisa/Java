package SuperficieDeDibujos;


import java.util.ArrayList;

public class ContenedorDeElementos {
    private ArrayList<Elemento> Elementos;
    private Integer totalDePintura;

    public ContenedorDeElementos(){
        Elementos = new ArrayList<Elemento>();
        totalDePintura = 0;
    }

    public void add(Elemento Item){
        Elementos.add(Item);
        this.totalDePintura += Item.Pintable.damePintura();
    }

    public Integer getTotalDePintura() {
        return totalDePintura;
    }

}
