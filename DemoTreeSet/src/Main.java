import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Date;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        TreeSet<Integer> TreeSetEnteros = new TreeSet<Integer>();
        TreeSetEnteros.add(78);
        TreeSetEnteros.add(100);
        TreeSetEnteros.add(10);
        for (Integer Item: TreeSetEnteros)
        {
            System.out.println("Entero: "+Item);
        }
        System.out.println("La coleccion contiene 78: "+TreeSetEnteros.contains(78));


        TreeSet<String> TreeSetCadenas = new TreeSet<>();
        TreeSetCadenas.add("Zoroastro");
        TreeSetCadenas.add("Elisendo");
        TreeSetCadenas.add("Bartolo");

        for (String Item: TreeSetCadenas)
        {
            System.out.println("String: "+Item);
        }

        System.out.println("La coleccion contiene Bartolo: "+TreeSetCadenas.contains("Bartolo"));

        TreeSet<Date> TreeSetFechas = new TreeSet<>();
        TreeSetFechas.add(new Date());
        TreeSetFechas.add(new Date(1900,8,7));

        for (Date Item: TreeSetFechas)
        {
            System.out.println("Fechas"+Item);
        }

        System.out.println("La coleccion contiene la fecha actual: "+TreeSetFechas.contains(new Date()));

        ArrayList<Integer> SacoDeEnteros = new ArrayList<>();
        SacoDeEnteros.add(89);
        SacoDeEnteros.add(198);

        System.out.println(SacoDeEnteros.contains(89));


        ArrayList<Patata> SacoDePatatas = new ArrayList<>();
        SacoDePatatas.add(new Patata(8,11,"A"));
        SacoDePatatas.add(new Patata(2,12,"A"));
        SacoDePatatas.add(new Patata(4,1,"B"));
        SacoDePatatas.add(new Patata(3,37,"B"));
        SacoDePatatas.add(new Patata(1,64,"A"));

        Patata miPataPrueba = new Patata(1,1,"B");

        if (SacoDePatatas.contains(miPataPrueba))
            System.out.println("Patata duplicada");
        else
            System.out.println("Patata nueva");

        SacoDePatatas.sort(new ComparadorPatatasTioMariano());
        for (Patata Item: SacoDePatatas )
        {
            System.out.println(Item);
        }

        SacoDePatatas.sort(new ComparadorDePatatasPeso());
        for (Patata Item: SacoDePatatas )
        {
            System.out.println(Item);
        }


        TreeSet<Patata> ColectiorPatatas = new TreeSet<>(new ComparadorDePatatasPeso());
        ColectiorPatatas.add(new Patata(8,1,"A"));
        ColectiorPatatas.add(new Patata(2,1,"A"));
        ColectiorPatatas.add(new Patata(4,1,"A"));
        ColectiorPatatas.add(new Patata(3,2,"B"));
        ColectiorPatatas.add(new Patata(1,2,"B"));

        Patata miPataPrueba2 = new Patata(1,1,"B");

        if (ColectiorPatatas.contains(miPataPrueba2))
            System.out.println("Patata duplicada en Tree");
        else
            System.out.println("Patata nueva");


    }
}