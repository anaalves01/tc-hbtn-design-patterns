import java.util.Objects;

public class NaveEspacial {

    private int saude;
    private int ataque;

    public NaveEspacial() {
    }

    public NaveEspacial(int saude, int ataque) {
        setSaude(saude);
        setAtaque(ataque);
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaveEspacial that = (NaveEspacial) o;
        return saude == that.saude && ataque == that.ataque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saude, ataque);
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }

}
