import Colecciones.Habitacion;
import Colecciones.IColeccionDeDecoracion;
import Jerarquia.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IColeccionDeDecoracion MiHabitacion = new Habitacion();
        MiHabitacion.add(new Mesa());
        MiHabitacion.add(new Alfombra());
        MiHabitacion.add(new Silla());
        MiHabitacion.add(new Lampara());

        System.out.println(MiHabitacion.dameDescripcion());
        System.out.println("total dinero: "+MiHabitacion.dameImporteTotal());
        System.out.println("total peso: "+MiHabitacion.damePeso());

        }
    }
