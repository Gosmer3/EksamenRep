package Stratigy;

public class ComperisonNummer implements Comparison{
    @Override
    public int compare(Kunde k1, Kunde k2) {
        return Integer.compare(k1.getNummer(), k2.getNummer());
    }
}
