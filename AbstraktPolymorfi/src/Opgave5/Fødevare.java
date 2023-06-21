package Opgave5;

public class Fødevare extends Vare {
    private int holdbarhedsperiode;

    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhedsperiode) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;

    }

    public int getHoldbarhedsperiode() {
        return holdbarhedsperiode;
    }

    public void setHoldbarhedsperiode(int holdbarhedsperiode) {
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

    @Override
    public double salgspris() {
        double moms = getPris() * 0.05;
        return getPris() + moms;
    }
}
