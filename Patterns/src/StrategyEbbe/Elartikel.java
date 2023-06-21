package StrategyEbbe;

public class Elartikel extends Vare {
    private double gennemsnitligtForbrug;

    public Elartikel(double pris, String navn, String beskrivelse, double gennemsnitligtForbrug) {
        super(pris, navn, beskrivelse, new ElartikelMoms());
        this.gennemsnitligtForbrug = gennemsnitligtForbrug;
    }

    @Override
    public double getPrisPlusMoms() {
        double moms = getPris() * getMoms();
        return moms > 3 ? super.getPrisPlusMoms() : getPris() + 3;
    }


}
