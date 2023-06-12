package opgave5;

public abstract class Vare {
    private double pris;
    private String navn,  beskrivelse;

    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public abstract double salgsPris();

    @Override
    public String toString() {
        return navn + " " + salgsPris();
    }
}
