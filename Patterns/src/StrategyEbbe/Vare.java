package StrategyEbbe;

public class Vare {
    private double pris;
    private String navn, beskrivelse;
    private Moms moms;

    public Vare(double pris, String navn, String beskrivelse, Moms moms) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.moms = moms;
    }

    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.moms = new DefaultMoms();
    }



    public double getPrisPlusMoms() {
        return pris * (1+moms.beregnMoms(pris));
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public double getMoms() {
        return moms.beregnMoms(pris);
    }

    public double getPris() {
        return pris;
    }

    public void setMoms(Moms moms) {
        this.moms = moms;
    }
}
