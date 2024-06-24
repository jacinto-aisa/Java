package SuperficieDeDibujos;

import Pintables.IPintables;
import Recortables.IRecortables;

public class Elemento {
    IPintables Pintable;
    IRecortables Recortable;

    public Elemento(IPintables pintable, IRecortables recortable) {
        Pintable = pintable;
        Recortable = recortable;
    }

    @Override
    public String toString() {
        return "SuperficieDeDibujos{" +
                "Pintable=" + Pintable.damePintura() +
                ", Recortable=" + Recortable.dameRecorte() +
                '}';
    }

}
