// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion();
        Persona Manolo = new Persona("Manolo gomez","z",12);
        Persona Ana = new Persona("Ana","B",12);
        Persona Manolo1 = new Persona("Manolo gomez 1","A",12);
        Persona Manolo2 = new Persona("Manolo gomez 2 ","A",12);
        Persona Manolo3 = new Persona("Manolo gomez 3","A",12);

        habitacion.add(Manolo);
        habitacion.add(Ana);
        habitacion.add(Manolo1);
        habitacion.add(Manolo2);
        habitacion.add(Manolo3);

        habitacion.muestraDnis();
        habitacion.muestraPersons();

        }
    }
