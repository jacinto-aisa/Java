import java.util.TreeMap;

public class Habitacion {
    TreeMap<String,Persona> personal = new TreeMap<>();

    void add(Persona personaASumar)
    {
        if (!personal.containsKey(personaASumar.getDni()))
            personal.put(personaASumar.getDni(),personaASumar);
    }

    void muestraDnis() {
        for (String Item: personal.keySet())
        {
            System.out.println("DNI:" + Item );
        }
    }

    void muestraPersons(){
        for(Persona Item : personal.values()){
            System.out.println(Item);
        }

    }
}
