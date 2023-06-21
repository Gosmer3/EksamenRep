package AdapterEksempel;

public class FoedeVare extends Vare {
    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double moms = 0.05 * getPris();
        return getPris() + moms;
    }
}
