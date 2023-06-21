package Opgave5;

public class Spiritus extends Vare {
    private double alkoholprocent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholprocent) {
        super(pris, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;

    }

    @Override
    public double salgspris() {
        double moms = 0;
        if (getPris() > 90){
            moms = getPris() * 1.2;
            return getPris() + moms;

        }
        else {
            moms = getPris() * 0.25;

        }
        return getPris() + moms;
    }
    @Override
    public double salgsprisDobbelt(){
        return getPris()*2;
    }
}
