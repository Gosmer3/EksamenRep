package opgave5;

public class ELArtikel extends Vare {
    private double GenemsnitligEnergi;

    public ELArtikel(double pris, String navn, String beskrivelse, double genemsnitligEnergi) {
        super(pris, navn, beskrivelse);
        GenemsnitligEnergi = genemsnitligEnergi;
    }


    @Override
    public double salgsPris() {
        double pris = 0.0;
        if (super.getPris() < 3){
            pris = super.getPris();
        } else {
            pris = super.getPris() * 1.3;
        }
        return pris;
    }
}
