package opgave5;

public class Fødevare extends Vare {
    private int AntalDag;

    public Fødevare(double pris, String navn, String beskrivelse, int antalDag) {
        super(pris, navn, beskrivelse);
        AntalDag = antalDag;
    }

    @Override
    public double salgsPris(){
        return super.getPris() * 1.05;
    }
}
