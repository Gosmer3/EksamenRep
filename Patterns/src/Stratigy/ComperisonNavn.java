package Stratigy;

public class ComperisonNavn implements Comparison {
    @Override
    public int compare(Kunde k1, Kunde k2) {
        int comp = k1.getNavn().compareTo(k2.getNavn());
        return comp;
    }
}
