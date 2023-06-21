package Opgave5;

public class ElArtikel extends Vare{
    private int kwh;
    public ElArtikel(double pris, String navn, String beskrivelse, int kwh) {
        super(pris, navn, beskrivelse);
        this.kwh = kwh;


    }

    @Override
    public double salgspris() {
        double moms = getPris() *0.30;
        if(moms < 3){
            moms = 3;
        }
        return getPris() + moms;
    }
}
