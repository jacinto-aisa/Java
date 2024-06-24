import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio02 {
    ArrayList<Integer> array;
    double suma;
    double media;
    public Ejercicio02() {
        this.array = new ArrayList<>();
    }

    public void leerValores() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce entero. -99 para acabar: ");
        n = sc.nextInt();
        while (n != -99) {
            array.add(n);
            System.out.print("Introduce entero. -99 para acabar: ");
            n = sc.nextInt();
        }
    }

    private void calcularSuma() {
        for (Integer elemento : array) {
            suma += elemento;
        }
    }
    private void calcularMedia()
    {
        media= suma/array.size();
    }
    public void mostrarResultados() {
        calcularSuma();
        calcularMedia();
        int cont = 0;
        System.out.println("Valores introducidos: ");
        System.out.println(array);
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f %n", media);
        for (Integer i : array) {
            if (i > media) {
                cont++;
            }
        }
        System.out.println(cont + " valores superiores a la media");
    }
}
