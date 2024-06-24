import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio01 {
    public ArrayList<Double> altura = new ArrayList<>();
    public int numeroDeAlumnos;

    public double media;
    public void numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número de alumnos: ");
            n = sc.nextInt();
        } while (n < 1);
        numeroDeAlumnos = n;
    }

    public void leerAlturas() {
        Scanner sc = new Scanner(System.in);
        int i;
        double alto;
        for (i = 1; i <= numeroDeAlumnos; i++) {
            do {
                System.out.print("Alumno " + i + " altura: ");
                alto = sc.nextDouble();
            } while (alto <= 0);
            altura.add(alto); //añade la altura al final del ArrayList
        }
    }

    public double calcularMedia() {
        double media = 0;
        for (Double elemento : altura) {
            media = media + elemento;
        }
        this.media = media/altura.size();
        return this.media;
    }

    void mostrarResultados() {
        calcularMedia();
        int superior = 0, inferior = 0;
        System.out.println("alturas introducidas: ");
        System.out.println(altura);
        for (Double elemento : altura) {
            if (elemento > media)
                superior++;
            else if (elemento < media)
                inferior++;
        }
        System.out.printf("Media: %.2f %n", media);
        System.out.println("Hay " + superior + " alumnos más altos que la media");
        System.out.println("Hay " + inferior + " alumnos más bajos que la media");
    }
};
