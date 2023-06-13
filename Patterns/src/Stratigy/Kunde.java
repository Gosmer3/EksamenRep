package Stratigy;

public class Kunde implements Comparable<Kunde> {
    private String navn;
    private int nummer;

    private Comparison compare;

    public Kunde(String navn, int nummer) {
        this.navn = navn;
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setCompare(Comparison c){
        this.compare = c;
    }


    @Override
    public int compareTo(Kunde o) {
        if (compare != null){
            return compare.compare(this,o);
        } else {
            return Integer.compare(nummer, o.nummer);
        }
    }

    @Override
    public String toString() {
        return navn + " " + nummer;
    }
}
