package opgave5;

public class Spiritus extends Vare{
    private double AlkoholProcent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholProcent) {
        super(pris, navn, beskrivelse);
        AlkoholProcent = alkoholProcent;
    }

    @Override
    public double salgsPris() {
        double pris = 0.0;
        if (super.getPris()<=90){
            pris = super.getPris() *1.8;
        } else {
            pris = super.getPris() * 2.2;
        }
        return pris;
    }

}
