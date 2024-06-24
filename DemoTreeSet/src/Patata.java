import java.util.Objects;

public class Patata
{
    public int numeroDeCucos;

    public int peso;

    private String tipoPatata;

    public Patata(int numeroDeCucos, int peso, String tipoPatata) {
        this.numeroDeCucos = numeroDeCucos;
        this.peso = peso;
        this.tipoPatata = tipoPatata;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patata patata = (Patata) o;
        return peso == patata.peso && Objects.equals(tipoPatata, patata.tipoPatata);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Patata{" +
                "numeroDeCucos=" + numeroDeCucos +
                ", peso=" + peso +
                ", tipoPatata='" + tipoPatata + '\'' +
                '}';
    }
}
